function getData(url){
    $.ajax({
        type:'post',
        url:url,
        data:{u_id:21},
        success:function(data){
            console.log(data);
            $("#content").text(data);
        }
    })
}