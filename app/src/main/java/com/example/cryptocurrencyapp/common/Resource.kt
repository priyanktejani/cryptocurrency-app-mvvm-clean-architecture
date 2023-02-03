package com.example.cryptocurrencyapp.common

sealed class Resource<T>(val Data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}

// equivalent java code
//public abstract class Resource<T> {
//    private T data;
//    private String message;
//
//    public Resource(T data, String message) {
//        this.data = data;
//        this.message = message;
//    }
//
//    public T getData() {
//        return data;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public static class Success<T> extends Resource<T> {
//        public Success(T data) {
//            super(data, null);
//        }
//    }
//
//    public static class Error<T> extends Resource<T> {
//        public Error(String message, T data) {
//            super(data, message);
//        }
//    }
//
//    public static class Loading<T> extends Resource<T> {
//        public Loading(T data) {
//            super(data, null);
//        }
//    }
//}

