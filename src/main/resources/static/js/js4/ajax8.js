function getData(url){
    $.ajax({
        type:'post',
        url:url,
        data:{u_id:8},
        success:function(data){
            console.log(data);
            $("#content").text(data);
        }
    })
}