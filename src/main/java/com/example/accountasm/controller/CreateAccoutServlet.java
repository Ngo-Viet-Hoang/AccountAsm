package com.example.accountasm.controller;

import com.example.accountasm.entity.Account;
import com.example.accountasm.model.MySqlAccountModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateAccoutServlet extends HttpServlet {
    private MySqlAccountModel mySqlAccountModel;

    @Override
    public void init() throws ServletException {
        mySqlAccountModel = new MySqlAccountModel();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/3/create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; chartset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String fullName = req.getParameter("fullName");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        int status = Integer.parseInt(req.getParameter("status"));
        Account account = new Account(fullName, username, email, password, status);
        mySqlAccountModel.save(account);
        resp.sendRedirect("/accounts");

    }
}
