function expandTextArea() {
    $(".text-area-default-size").on("click",function () {
        $(this).removeClass("text-area-default-size").addClass("text-are-open");
    }).on("blur", function () {
            $(this).removeClass("text-are-open").addClass("text-area-default-size");
        });
}

function increase_decrease() {
    $("input[name^='event']").keydown(function (e) {
        var value = $(this).val();
        if (value) {
            if (e.keyCode == 38 || e.keyCode == 39) {
                value++;
            }
            $(this).val(value);
            if (e.keyCode == 37 || e.keyCode == 40) {
                if (value != 1) {
                    value--;
                }
            }
            $(this).val(value)
        }
    })
}

$(document).ready(function () {
    expandTextArea();
    increase_decrease();
    $('tr').draggable();
});

