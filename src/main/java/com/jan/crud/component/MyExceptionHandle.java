package com.jan.crud.component;

import com.jan.crud.exception.UserException;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jan
 * @Date 2020/5/28 18:24
 */
@ControllerAdvice
public class MyExceptionHandle {

    @ExceptionHandler(UserException.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user not exist");
        map.put("massage",e.getMessage());
        return "forward:/error";

    }
}
