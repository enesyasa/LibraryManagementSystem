package com.librarymanagementsys.core;

public class MessageHelper {
    public static <T> ResultData<T> CREATED(T data){
        return new ResultData<>(true,Message.CREATED_MESSAGES,"201",data);
    }
    public static <T> ResultData<T> ERROR(T data){
        return new ResultData<>(false,Message.NOT_NULL_MESSAGE,"400",data);
    }
    public static <T> ResultData<T> OK(T data){
        return new ResultData<>(true,Message.OK_MESSAGE,"200",data);
    }
    public static Result NOT_FOUND(){
        return new Result(false,Message.NOT_FOUND_MESSAGE,"400");
    }
}
