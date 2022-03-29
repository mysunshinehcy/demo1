<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/23
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/js/css/bg7.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <title>Title</title>
    <script type="text/javascript">
        $(function(){
            const data={
                u_id:7
            };
            $.ajax({
                type:'post',
                data:data,
                url:"${pageContext.request.contextPath}/getDemo7",
                success:function(data){
                  console.log(data);
                  $("#content").text(data);
                }
            })
        })
    </script>
</head>
<body>
<div id="content">index7</div>
</body>
</html>
