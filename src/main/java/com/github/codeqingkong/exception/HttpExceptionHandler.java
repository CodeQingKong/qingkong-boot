package com.github.codeqingkong.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/** http全局异常处理
 * @Author QingKong
 * @create 2023/4/4
 */
@RestControllerAdvice
public class HttpExceptionHandler {
    @ExceptionHandler(value = BizException.class)
    public Object bizExceptionHandler(HttpServletRequest request, BizException e) {
        return null;
    }

    @ExceptionHandler(value = SystemException.class)
    public Object systemExceptionHandler(HttpServletRequest request, SystemException e) {
        return null;
    }

}
