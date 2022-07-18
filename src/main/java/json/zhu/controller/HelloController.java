package json.zhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/name")
@Controller
public class HelloController {

    @RequestMapping("/toView")
    public ModelAndView toView(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", "师姐");
        mv.setViewName("/WEB-INF/hello/hello.jsp");
        return mv;
    }
}
