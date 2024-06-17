package com.example.koreaIt.controller.mentor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mentorController {

    @GetMapping("/")
    @ResponseBody
    String mentor(){
        return "안녕하세요 피싱사이트임 ㅅㄱ";
    }

    @GetMapping("/mentor")
    String mentorHtml() {
        return "mentor.html";
    }

    @GetMapping("/my_mentor")
    String my_mentorHtml(Model model) {
        model.addAttribute("name","엄준식");
        return "my_mentor.html";
    }

}
