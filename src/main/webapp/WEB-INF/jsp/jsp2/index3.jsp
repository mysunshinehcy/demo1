<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/25
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/js/css1/bg3.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/js1/ajax3.js"></script>
    <title>Title</title>
    <script type="text/javascript">
        $(function(){
            const url = "${pageContext.request.contextPath}/data2D/getDemo3";
            getData(url);
        })
    </script>
</head>
<body>
<div id="content">jsp1 index3</div>
</body>
</html>