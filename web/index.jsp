<%--
  Created by IntelliJ IDEA.
  User: lvdia
  Date: 2018/5/25
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>

<h1 >提交请求</h1><br><br>
<a href="test">提交</a><br><br>
<a href="testMethod">testMethod,post</a><br><br>
<a href="test/sad/123">testAnt</a><br><br>
<a href="testParam?username=admin&age=11">testParam,post</a><br><br>
<a href="testPathVariable/12332">testPathVariable</a><br><br>
<p>--rest--</p>
<a href="testRest/1">提交testRest</a><br> <br>

<form action="testRest" method="post">
    <input type="submit" value="testRestPost">
</form><br><br>

<form action="testRest/3" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="testRestPut">
</form><br><br>

<form action="testRest/2 " method="post">

    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="testRestDelete">
</form><br><br>
<a href="testRequestParam?username=admin&age=11">testRequestParam</a><br><br>
<%--/*--%>
<%--@RequestParam 获取请求的参数值--%>
<%--*/--%>


<a href="rest/restGet?id=1">发送GET请求</a>
<form action="rest/restPost" method="post">
    <input type="text" name="id" value="2"/>
    <input type="submit" value="发送POST请求"/>
</form><br><br>
<form action="rest/restPut" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="text" name="id" value="3">
    <input type="submit" value="发送PUT请求">
</form><br><br>
<form action="rest/restDelete" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="text" name="id" value="4">
    <input type="submit" value="发送DELETE请求">
</form><br><br>
    ------pojo注解映射实体类------<br>
 <form action="testPojo" method="post">
     用户名：<input type="text" name="username"><br>
     密码：<input type="password" name="password"><br>
     性别：<select name="gender">
             <option value="male" label="man">男</option>
             <option value="female" label="female">女</option>
 </select><br>
     年龄：<input type="text" name="age"><br>
     省：<input type="text" name="address.province"><br>
     市：<input type="text" name="address.city"><br>
     <input type="submit" value="submit">
 </form><br><br>

----modelAndView----<br>
<a href="testModelAndView">testModelAndView</a><br><br>

----map----<br>
<a href="testMap">testMap</a><br>

----session----<br>
<a href="restModelAttribute">testSession</a><br><br>

----session----<br>
<form action="testPojo" method="post">
    <input type="hidden" name="id" value="1">
    用户名：<input type="text" name="username" value="asc"><br>
    性别：<select name="gender">
    <option value="male" label="man">男</option>
    <option value="female" label="female">女</option>
</select><br>
    年龄：<input type="text" name="age"><br>
    省：<input type="text" name="address.province"><br>
    市：<input type="text" name="address.city"><br>
    <input type="submit" value="submit">
</form><br><br>
</body>
</html>
