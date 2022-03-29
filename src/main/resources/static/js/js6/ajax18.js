function getData(url){
    $.ajax({
        type:"post",
        url:url,
        data:{u_id:18},
        success:function(data){
            console.log(data);
            $("#content").text(data);
        }
    })
}