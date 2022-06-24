package com.example.webmailcore.repositories.specifications;

public enum SearchOperation {
    GREATER_THAN,
    LESS_THAN,
    GREATER_THAN_EQUAL,
    LESS_THAN_EQUAL,
    NOT_EQUAL,
    EQUAL,
    MATCH,
    MATCH_START,
    MATCH_END,
    IN,
    NOT_IN,
    NOT_NULL,
    IS_NULL,
    JAVA_UTIL_DATE_GREATER_THAN_EQUAL,
    JAVA_UTIL_DATE_GREATER_THAN,
    JAVA_UTIL_DATE_LESS_THAN_EQUAL,
    JAVA_UTIL_DATE_LESS_THAN,
    DATE_GREATER_THAN_EQUAL,
    DATE_LESS_THAN_EQUAL,
    DATETIME_GREATER_THEN_OR_EQUAL_TO, //TODO implement
    DATETIME_LESS_THEN_OR_EQUAL_TO, //TODO implement
}