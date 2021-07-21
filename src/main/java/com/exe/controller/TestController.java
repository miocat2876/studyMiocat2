package com.exe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.exe.service.TestService;
import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @Autowired
    private TestService TestService;

    @GetMapping("main")
    public String goTestPage(){

        System.out.println("들어오나?");


//        String testInput = (String)request.getParameter("testInput");
//        TestVO testVO = new TestVO();
//        testVO.setTestInput(Integer.parseInt(testInput));
//
//        List<TestVO> list = TestService.getTestValue(testVO);
//
//        if( list.size() > 0 ){
//            model.addAttribute("output", "Success_DB_Connection");
//        }else{
//            model.addAttribute("output", "Fail_DB_Connection");
//        }

        return "jsp/test";
    }
}