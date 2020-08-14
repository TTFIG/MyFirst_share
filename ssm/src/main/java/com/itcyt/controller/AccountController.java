package com.itcyt.controller;

import com.itcyt.dao.AccountDao;
import com.itcyt.domain.Account;
import com.itcyt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(path = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        System.out.println("查询~");
        return "success";
    }
    @RequestMapping(value = "/saveUser")
    public void saveUser(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveUser(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
