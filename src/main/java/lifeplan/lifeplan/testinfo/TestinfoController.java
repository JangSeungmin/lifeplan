package lifeplan.lifeplan.testinfo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
@RestController
@RequestMapping("/boards/**")
public class TestinfoController {
    @GetMapping("/testinfo")
    public Map<String, Object> getTestinfo() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("a",3);
        resultMap.put("b",4);
        resultMap.put("c",5);
        return resultMap;
    }

    @GetMapping("/test")
    public Map<String, Object> getTest() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("a",1);
        resultMap.put("b",2);
        resultMap.put("c",3);
        return resultMap;
    }

    @GetMapping("/hello")
    public String Hello(){
        return "/boards/hello";
    }
}