package com.example.UserUtil;


import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public class LoginUserCeptor extends Filter {


    @Override
    public void doFilter(HttpExchange httpExchange, Chain chain) throws IOException {
    }

    @Override
    public String description() {
        return null;
    }
}