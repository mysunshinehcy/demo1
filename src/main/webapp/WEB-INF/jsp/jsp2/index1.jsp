<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/25
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/js/css1/bg1.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/js1/ajax1.js"></script>
    <title>Title</title>
<script type="text/javascript">
$(function(){
    console.log("cvvvvvvvvvvvvvvvvv");
   const  url = "${pageContext.request.contextPath}/data2D/getDemo1";
    getData1(url);
})

</script>
</head>
<body>
<div id="content">jsp1 index1</div>

</body>
</html>
