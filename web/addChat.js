$(document).ready(function () {
    ajaxRequest();
    setInterval("ajaxRequest()",2000);
});
function ajaxRequest() {
    $.ajax({
        type: "get",
        url: "/forum",
        async: true,
        dataType: "html",
        success: function (response) {
            $("#content").html("");
            $("#content").html(response);
        },
        error: function (XHR, status) {
            console.error("Err: "+status);
        }
    });
}