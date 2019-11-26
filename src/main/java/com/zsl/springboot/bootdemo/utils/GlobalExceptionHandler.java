package com.zsl.springboot.bootdemo.utils;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 系统发生500异常的处理方式
     * @param e 指定处理的异常
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public String customException(Exception e) {
        return "error";
    }

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer = factory -> {
            ErrorPage errorPage = new ErrorPage(HttpStatus.NOT_FOUND,"/404");
            factory.addErrorPages(errorPage);
        };
        return webServerFactoryCustomizer;
    }
}
