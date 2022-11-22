package com.java;

public interface UserDetailsInterface {
    boolean check(String name) throws InvalidUserDetailException;
}
