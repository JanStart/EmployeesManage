package com.jan.crud.exception;

/**
 * @author Jan
 * @Date 2020/5/28 18:25
 */
public class UserException extends RuntimeException{
    public UserException() {
        super("用户不存在");
    }
}
