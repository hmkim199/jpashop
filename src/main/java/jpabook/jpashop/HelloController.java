package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) { // Model에 데이터를 실어서 view로 넘길 수 있음
        model.addAttribute("data", "hello!!!"); // data라는 키의 값을 hello로 넘김
        return "hello"; // 화면 이름(확장명은 html 자동으로 붙음)을 리턴 -> resources/templates 아래 파일명
    }
}
