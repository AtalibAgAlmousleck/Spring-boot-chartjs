package com.atalibdev.demo_work;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChartController {

    @GetMapping("/chart")
    public String chartPage() {
        return "chart";
    }
}
