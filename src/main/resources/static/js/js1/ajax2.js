

function getData(url){
    console.log("bbbbbb");
    $.ajax({
        type:'post',
        url:url,
        data:{u_id:2},
        success:function(data){
            console.log(data);
            $("#content").text(data);
        }
    })
}