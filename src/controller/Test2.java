package controller;

/**
 * Created by lvdia on 2018/5/26.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class Test2 {
    private static final String SUCCESS = "success";
    // 该方法接受POST传值，请求url为/rest/restPost
    @RequestMapping(value = "restPost", method = RequestMethod.POST)
    public String restPost(@RequestParam(value = "id") Integer id) {
        System.out.println("POST ID:" + id);
        return SUCCESS;
    }
    // 该方法接受GET传值，请求url为/rest/restGet
    @RequestMapping(value = "/restGet", method = RequestMethod.GET)
    public String restGet(@RequestParam(value = "id") Integer id) {
        System.out.println("GET ID:" + id);
        return SUCCESS;
    }
    // 该方法接受PUT传值，请求url为/rest/restPut
    @RequestMapping(value = "/restPut", method = RequestMethod.PUT)
    @ResponseBody
    public String restPut(@RequestParam(value = "id") Integer id) {
        System.out.println("PUT ID:" + id);
        return SUCCESS;
    }
    // 该方法接受DELETE传值，请求url为/rest/restDelete
    @RequestMapping(value="/restDelete",method=RequestMethod.DELETE)
    @ResponseBody
    public String restDelete(@RequestParam(value = "id") Integer id) {
        System.out.println("DELETE ID:" + id);
        return SUCCESS;
    }
}