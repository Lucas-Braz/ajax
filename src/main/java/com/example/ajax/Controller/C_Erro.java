package com.example.ajax.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class C_Erro implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        int statusCode = (int) request.getAttribute("jakarta.servlet.error.status_code");

        return "Erros/404";
    }
}
