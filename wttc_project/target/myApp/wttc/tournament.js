// <![CDATA[
    $(document).ready(function () {
        //alert('hi');
        var mult = 1;
        var tournamentName = "WTTC June 2013 Open ";
        var prices = new Array(50, 40, 35, 30, 30, 30, 25, 20, 20, 20, 20, 20, 20, 30, 25, 20, 20,20);
//        var prices = new Array(65, 40, 35, 30, 30, 30, 25, 20, 20, 20, 20, 20, 20, 30, 25, 20);
        //var prices = new Array((mult*50).toFixed(2), (mult*40).toFixed(2), (mult*35).toFixed(2), (mult*30).toFixed(2), (mult*30).toFixed(2), (mult*30).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*30).toFixed(2), (mult*30).toFixed(2), (mult*20).toFixed(2), (mult*20, mult*25).toFixed(2));
//        var prices = new Array(50, 40, 35, (mult*30).toFixed(2), (mult*30).toFixed(2), (mult*30).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*25).toFixed(2), (mult*30).toFixed(2), (mult*30).toFixed(2), (mult*20).toFixed(2), (mult*20, mult*25).toFixed(2));
        var names = new Array("Open Singles", "Under 2500", "Under 2350", "Under 2200", "Under 2050", "Under 1900", "Under 1750", "Under 1600", "Under 1450", "Under 1300", "Under 1150", "Under 1000", "14 & Under", "60 & Over", "Handicap", "Mini-Table", "Unrated");

        function updateTotals() {
            var total = 0;
            var grandtotal = 0;
            $('[id^="ttevent_"]').each(function (i) {
                if ($(this).attr('checked')) {
                    total += prices[i];
                    grandtotal += prices[i];
                }
            });
            if ($("#newmember").attr('checked')) {
                var value = parseInt($('input[name=usattmembership]:checked').val());
                if (value > 0) {
                    grandtotal += value;
                    $("#membership").html(value);
                } else {
                    $("#membership").html("");
                }
            } else {
                $("#membership").html("");
            }
            $("#grandtotal").html(grandtotal + mult*10);
            $("#total").html(total);
        }
        function updateGrandTotal(newamount) {
            var value = parseInt($("#grandtotal").text());
            if ("" == value || "0" == value) {
                value = 0;
            }
            $("#grandtotal").html(value + newamount);
        }

        $('[id^="ttevent_"]').each(function (i) {
            $(this).click(function (e) {
                if (this.checked == true) {
                    $('#eventstipholder').poshytip('hide');
                    $("#eventstable").removeClass("redborder");
                } else {
                }
                updateTotals();
            })
        });
        $('#agree').click(function (i) {
            $('#agree').poshytip('hide');
            $("#agree").removeClass("redborder");
        });
        $("#usattmembershipgroup").hide();
        $("#newmember").click(function (e) {
            redrawUSATTStuff();
            updateTotals();
        });
        function redrawUSATTStuff() {
            if ($("#newmember").attr('checked')) {
                $("input[name='usattmembership']").each(function (i) {
                    $(this).removeAttr("disabled");
                    $("#usattmembershipgroup").show();
                    $("#rating").parent().parent().hide();
                    $("#usattid").parent().parent().hide();
                });
                $('#usattid').poshytip('hide');
                $("#usattid").removeClass("redborder");
                $('#rating').poshytip('hide');
                $("#rating").removeClass("redborder");
            } else {
                $("input[name='usattmembership']").each(function (i) {
                    $(this).attr("disabled", "disabled");
                });
                $("#usattmembershipgroup").hide();
                $("#rating").parent().parent().show();
                $("#usattid").parent().parent().show();
            }
        }
        $('input[name=usattmembership]')
                .click(function () {
                    updateTotals();
                })

        $("#ppform").submit(function () {
            var ppcounter = 1;
            $('[id^="ttevent_"]').each(function (i) {
                if (this.checked == true) {
                    $('<input>').attr({
                        type:'hidden',
                        id:'item_number_' + ppcounter,
                        name:'item_number_' + ppcounter,
                        value:i
                    }).appendTo('#ppform');
                    $('<input>').attr({
                        type:'hidden',
                        id:'item_name_' + ppcounter,
                        name:'item_name_' + ppcounter,
                        value: tournamentName + names[i]
                    }).appendTo('#ppform');
                    $('<input>').attr({
                        type:'hidden',
                        id:'amount_' + ppcounter,
                        name:'amount_' + ppcounter,
                        value:prices[i]
                    }).appendTo('#ppform');
                    ppcounter++;
                }
            });
            // submit usatt membership to paypal as well (if selected)
            if ($("#newmember").attr('checked')) {
                var value = parseInt($('input[name=usattmembership]:checked').val());
                var id = $('input[name=usattmembership]:checked').attr("id");
                var text = $('label[for='+id+']').text();
                $('<input>').attr({
                    type:'hidden',
                    id:'item_number_' + ppcounter,
                    name:'item_number_' + ppcounter,
                    value:ppcounter
                }).appendTo('#ppform');
                $('<input>').attr({
                    type:'hidden',
                    id:'item_name_' + ppcounter,
                    name:'item_name_' + ppcounter,
                    value: tournamentName + text
                }).appendTo('#ppform');
                $('<input>').attr({
                    type:'hidden',
                    id:'amount_' + ppcounter,
                    name:'amount_' + ppcounter,
                    value:value
                }).appendTo('#ppform');
                ppcounter++;
            };
            function validateTextField(valid, tfId, message) {
                $(tfId).poshytip('hide');
                message = message || 'Required!';
                tfId = tfId || "#firstname";
                if ($(tfId).val().trim() == "") {
                    $(tfId).poshytip({
                        content:message,
                        className:'tip-darkgray',
                        showOn:'none',
                        alignTo:'target',
                        alignX:'right',
                        alignY:'center'
//                        offsetX:-155
//                	offsetY: 55
                    });
                    $(tfId).poshytip('show');
                    $(tfId).addClass("redborder");
                    valid = false;
                } else {
                    $(tfId).poshytip('hide');
                    $(tfId).removeClass("redborder");
                }
                $(tfId).click(function(e) {
                    $(tfId).poshytip('hide');
                    $(tfId).removeClass("redborder");

                });
                return valid;
            }

            function validate() {
                $('#agree').poshytip('hide');
                $('#eventstipholder').poshytip('hide');
                var valid = true;
                if (ppcounter == 1) { // still 1, no events selected?
                    $('#eventstipholder').poshytip({
                        content:'You need to select at least one event!',
                        className:'tip-darkgray',
                        showOn:'none',
                        alignTo:'target',
                        alignY:'right',
                        alignX:'center'
//                	offsetY: 55
                    });
                    $('#eventstipholder').poshytip('show');
                    $("#eventstable").addClass("redborder");
                    valid = false;
                } else {
                    $('#eventstipholder').poshytip('hide');
                    $("#eventstable").removeClass("redborder");
                }
                valid = validateTextField(valid, "#firstname", "Please enter first name!");
                valid = validateTextField(valid, "#lastname", "Please enter last name!");
                valid = validateTextField(valid, "#homeclub", "Please enter home club!");
//                valid = validateTextField(valid, "#expdate", "Please enter USATT membership expiration date!");
                if ($("#newmember").attr('checked')) {
                    var value = parseInt($('input[name=usattmembership]:checked').val());
                    //alert(value);
                    if (!(value > 0)) {
                        $('#usattmembershipgroup').poshytip({
                            content:'Please choose your USA TT membership!',
                            className:'tip-darkgray',
                            showOn:'none',
                            alignTo:'target',
                            alignY:'inner-bottom',
                            alignX:'inner-right'
                        });
                        $('#usattmembershipgroup').poshytip('show');
                        $("#usattmembershipgroup").addClass("redborder");
                        $("#usattmembershipgroup").click(function() {
                            $('#usattmembershipgroup').poshytip('hide');
                            $("#usattmembershipgroup").removeClass("redborder");
                        });
                        valid = false;
                    }
                } else {
                    valid = validateTextField(valid, "#rating", "Please enter USATT rating!");
                    var usattid = $("#usattid").val();
                     if(!usattid || /^\s*$/.test(usattid)) {
                         valid = validateTextField(valid, "#usattid", "Please enter USATT member ID!");
                     } else {
                         var usattidvalid = usattid.match(/^\d+$/);
                         if (usattidvalid) {
                         } else {
                             $('#usattid').poshytip({
                                 content:'Please enter valid USATT ID!',
                                 className:'tip-darkgray',
                                 showOn:'none',
                                 alignTo:'target',
                                 alignX:'right',
                                 alignY:'center'
                             });
                             $('#usattid').poshytip('show');
                             $("#usattid").addClass("redborder");
                             valid = false;
                         }
                     }
                    $("#usattid").click(function () {
                        $('#usattid').poshytip('hide');
                        $("#usattid").removeClass("redborder");
                    });

                }
                if (!$("#agreechbx").attr('checked')) {
                    $('#agree').poshytip({
                        content:'Please agree with the terms',
                        className:'tip-darkgray',
                        showOn:'none',
                        alignTo:'target',
                        alignX:'right',
                        alignY:'center'
//                	offsetY: 55
                    });
                    $('#agree').poshytip('show');
                    $("#agree").addClass("redborder");
                    valid = false;
                } else {
                    $('#agree').poshytip('hide');
                    $("#agree").removeClass("redborder");
                }

                return valid;
            }
            var finalvalid = validate();
            if (finalvalid) {
                var customfield = "Name: "+$("#lastname").val() + ", " + $("#firstname").val()
                        +", Club: "+$("#homeclub").val();
                if (!$("#newmember").attr('checked')) {
                    customfield += ", USATT ID:"+$("#usattid").val()+", USATT Rating:"+$("#rating").val();
                }
                $('<input>').attr({
                    type:'hidden',
                    id:'custom',
                    name:'custom',
                    value:customfield
                }).appendTo('#ppform');
            }
//            if (!finalvalid) {
//                window.event.returnValue = false;
//            }
            return finalvalid;
        });
        redrawUSATTStuff();
        updateTotals();
    });
// ]]>