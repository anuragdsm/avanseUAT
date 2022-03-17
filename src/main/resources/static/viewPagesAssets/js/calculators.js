
 // Repayment Calculator
$(function() {
  $("[name=optionsRadios]").click(function(){
          
          if($(this).val() == 'larger') {
              $(".radio-hide1").show();
              $(".radio-hide2").hide();
              $(".radio-hide3").hide();
          }
          if($(this).val() == 'extra') {
              $(".radio-hide1").hide();
              $(".radio-hide2").show();
              $(".radio-hide3").hide();
          }
          if($(this).val() == 'quickly') {
              $(".radio-hide1").hide();
              $(".radio-hide2").hide();
              $(".radio-hide3").show();
          }
  });
});

// EMI Calculator
//Interest
var slider1 = document.getElementById("myRange");
var output1 = document.getElementById("interest");
output1.innerHTML = slider1.value;

slider1.oninput = function() {
  output1.innerHTML = this.value;
  //$('#per').val(this.value);
  $('#rate').val(this.value);
}

// Months
var slider = document.getElementById("myRange-months");
var output = document.getElementById("months");
output.innerHTML = slider.value;

slider.oninput = function() {
  output.innerHTML = this.value;
  $('#nper').val(this.value);
}

function pmt(rate, per, nper, pv, fv) {


    var totalamnt = '';
    var myinterest = '';
    var myloanamount = '';
    var myintper = '';


    fv = parseFloat(fv);
    nper = parseFloat(nper);
    pv = parseFloat(pv.replace(/,/g, ''));
    per = parseFloat(per);
    if ((per == 0) || (nper == 0)) {
      alert("Why do you want to test me with zeros?");
      return (0);
    }
    rate = eval((rate) / (per * 100));
    if (rate == 0) // Interest rate is 0
    {
      pmt_value = -(fv + pv) / nper;
    } else {
      x = Math.pow(1 + rate, nper);
      pmt_value = -((rate * (fv + x * pv)) / (-1 + x));
    }
    pmt_value = conv_number(pmt_value, 2);
    principle = -1 * (Math.round(pmt_value) * nper);
    interest = principle - pv;

    $myemival = Math.round(-1 * pmt_value);
    $('#myemi').html($myemival);
    totalamnt = Math.round($myemival * $('#nper').val());

    myinterest = Math.round(totalamnt - pv);

    myloanamount = Math.round(pv / totalamnt * 100);

    myintper = Math.round(myinterest / totalamnt * 100);

    return (Math.round(pmt_value));

  }

  function conv_number(expr, decplaces) { // This function is from David Goodman's Javascript Bible.
    var str = "" + Math.round(eval(expr) * Math.pow(10, decplaces));
    while (str.length <= decplaces) {
      str = "0" + str;
    }
    var decpoint = str.length - decplaces;
    return (str.substring(0, decpoint) + "." + str.substring(decpoint, str.length));
  }
  $("#myRange").change(function () {
    var val = ($(this).val() - $(this).attr("min")) / ($(this).attr("max") - $(this).attr("min"));

    $("#myRange").css("background-image", "-webkit-gradient(linear, left top, right top, " + "color-stop(" + val + ", #17c7bd), " + "color-stop(" + val + ", #fdc119)" + ")");
});
$("#myRange-months").change(function () {
  var val = ($(this).val() - $(this).attr("min")) / ($(this).attr("max") - $(this).attr("min"));

  $("#myRange-months").css("background-image", "-webkit-gradient(linear, left top, right top, " + "color-stop(" + val + ", #17c7bd), " + "color-stop(" + val + ", #fdc119)" + ")");
});

// EMI Calculator End


// Expense Calculator
var totalsavings = "",
            totalexp = "";
        
        function calculateme() {
            $("#stepmn").hide();
            $("#stepmn1").show();
            $("#stepmn2").hide();
            $("#step1").hide();
            $("#step2").show();
            personalsaving = parseInt($("#persav").val());
            helpfrmrelatives = parseInt($("#helrel").val());
            scholarships = parseInt($("#scholar").val());
            grants = parseInt($("#grants").val());
            familysavings = parseInt($("#familysav").val());
            otherincome = parseInt($("#otherinc").val());
            totalsavings = Math.round(personalsaving + helpfrmrelatives + scholarships + grants + familysavings + otherincome);
            $("#incstp1").html("How much money you may need to borrow for college<br/> Your total income from  " +
                "<span class='c_cyan'> Step 1 is "+totalsavings+"</span>")
        }
        
        function calculateexp() {
            $("#stepmn").hide();
            $("#stepmn1").hide();
            $("#stepmn2").show();
            $("#step2").hide();
            $("#step3").show();
            tutionfee = parseInt($("#tution").val());
            room = parseInt($("#room").val());
            board = parseInt($("#board").val());
            books = parseInt($("#books").val());
            trans = parseInt($("#trans").val());
            over = parseInt($("#over").val());
            pers = parseInt($("#pers").val());
            misc = parseInt($("#misc").val());
            totalexp = Math.round(tutionfee + room + board + books + trans + over + pers + misc);
            $("#incstp1").html("How much money you may need to borrow for college<br/> Your total income from Step 1 is " + totalsavings);
            $("#totinc").html("Total Income: " + totalsavings);
            $("#totexp").html("Total Expenses: " + totalexp);
            totalexp > totalsavings ? (diff = parseInt(totalexp - totalsavings), $("#diff").html("Difference: " + diff)) : (diff = parseInt(totalsavings - totalexp), $("#diff").html("Difference: " + diff))
        }
     // End Expense Calculator   


          // Eligibility  Calculator

          function pv(b, c, a, d, g, e) {
            var f = "";
            return $("#step2").show(), a = parseFloat(a), pmt = parseFloat(d.replace(/,/g, "")) - parseFloat(g.replace(/,/g, "")), e = parseFloat(e), b = eval(b / (100 * c)), 0 == pmt || 0 == a ? (alert("Why do you want to test me with zeros?"), 0) : (0 == b ? pv_value = -(e + pmt * a) : (x = Math.pow(1 + b, -a), y = Math.pow(1 + b, a), pv_value = -x * (e * b - pmt + y * pmt) / b), pv_value = conv_number(pv_value, 0), f = Math.round(-1 * pv_value), $("#totelamnt").html(f), pv_value);
            
        }
        
        function conv_number(b, c) {
            for (var a = "" + Math.round(eval(b) * Math.pow(10, c)); a.length <= c;) a = "0" + a;
            var d = a.length - c;
            return a.substring(0, d) + "." + a.substring(d, a.length)
        }