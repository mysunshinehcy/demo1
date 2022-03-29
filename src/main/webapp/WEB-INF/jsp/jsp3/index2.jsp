<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/25
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/js/css2/bg2.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/js2/ajax2.js"></script>
    <title>Title</title>
    <script type="text/javascript">
        const url = "${pageContext.request.contextPath}/data3D/getIndex2";
        getData(url);
    </script>
</head>
<body>
<div id="content">jsp2 index2</div>
</body>
</html>
