

<html>
<head>
    <Link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/js/css/bg17.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <title>title</title>
    <script type="text/javascript">
        $(function(){
            var data = {
                u_id:17
            };
            $.ajax({
                type:"post",
                data:data,
                url:"${pageContext.request.contextPath}/getDemo17",
                success:function(data){
                    console.log(data);
                    $("#content").text(data);
                }
            })
        })
    </script>
</head>
<body>
<div id="content"></div>
</body>
</html>