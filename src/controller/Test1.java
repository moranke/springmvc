package controller;

import entity.Address;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * Created by lvdia on 2018/5/25.
 */
@Controller
 /*
    sessionAttribute 通过属性名“name” 或者对象类型自动将map的元素放入session
    只能放在类上面
     */
@SessionAttributes(value = {"user"}, types = {String.class})
public class Test1 {
    /**
     * @return
     */
    @RequestMapping("/test")
    public String hello() {
        System.out.println("hello");
        return "success";
    }

    @RequestMapping(value = "/testMethod", method = RequestMethod.GET)
    public String testMethod() {
        System.out.println("method");
        return "success";
    }

    @RequestMapping(value = "/testParam", method = RequestMethod.GET, params = {"username", "age!=10"})
    public String testParam() {
        System.out.println("testParam");
        return "success";
    }

    /*
    @RequestMapping 支持ant风格的通配符匹配
     */
    @RequestMapping("/test/*/123")
    public String testAnt() {

        return "success";
    }

    /*
    spring 3支持PathVariable 映射请求值到方法中
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "success";
    }

    /*
    @RequestParam 获取请求的参数值

     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String username, @RequestParam(value = "age", required = false, defaultValue = "0") int age) {
        System.out.println(username + "" + age);
        return "success";
    }

    /*
       REST风格的请求， 使用xml中配置的org.springframework.web.filter.HiddenHttpMethodFilter
       将post请求专为put或者delete；
       @@ResponseBody 将jsp请求接口转换为json
     */
    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String testRestGet(@PathVariable("id") Integer id) {
        System.out.println("testRest--get:" + id);
        return "success";
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String testRestPost() {
        System.out.println("testRest--post");
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String testRestPut(@PathVariable("id") Integer id) {
        System.out.println("testRest--put:" + id);
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String testRestDelete(@PathVariable("id") Integer id) {
        System.out.println("testRest--delete:" + id);
        return "success";
    }

    /*
     Pojo 映射实体类
     */
    @RequestMapping("/testPojo")
    public String testPojo(User user) {
        System.out.println(user);

        return "success";
    }

    /*
    处理模型数据 ModelAndView 返回视图或模型信息
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        String viewName = "success";
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("time", new Date());
        return modelAndView;
    }

    /*
    处理模型数据 Map 返回视图或模型信息
     */
    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("name", Arrays.asList("zhangsan", "lisi"));
        return "success";
    }

    /*
    sessionAttribute 通过属性名“name” 或者对象类型自动将map的元素放入session
     */
    @RequestMapping("/testSession")
    public String testSessionAttribute(Map<String, Object> map) {
        User user = new User(001, "wangwu", "11", "男", "123456", new Address("浙江", "宁波"));
        map.put("user", user);
        map.put("school", "北仑中学");
        return "success";
    }

    /*
    ModelAttribute  查询数据库--保存类在map中-修改类的部分属性--更新数据库
     */
    @ModelAttribute
    public void getUser(@RequestParam(value = "id") Integer id, Map<String, Object> map) {
        //模拟从数据库取回的数据
        User user = new User(1, "asc", "11", "男", "123456", new Address("zhejiang", "ningbo"));
        System.out.println("原始数据" + user);
        map.put("user", user);
    }

    @RequestMapping("/restModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println(user);
        return "success";
    }
}
