
    
;(function($) {
    "use strict";

    
    jQuery.validator.addMethod('answercheck', function (value, element) {
        return this.optional(element) || /^\bcat\b$/.test(value)
    }, "type the correct answer -_-");

    // validate contactFormcustomer form
    $(function() {
        $('#contactFormcustomer').validate({
            rules: {
                name: {
                    required: true,
                    minlength: 2
                },
                number: {
                    required: true,
                    minlength: 10
                },
                email: {
                    required: true,
                    email: true
                },
                city: {
                    required: true,
                    
                },
                loanaccount: {
                    required: true,
                   
                }
            },
            messages: {
                name: {
                    required: "come on, your name, don't you?",
                    minlength: "your name must consist of at least 2 characters"
                },
                number: {
                    required: "please input your mobile number",
                    minlength: "your mobile of at least 10 number"
                },
                email: {
                    required: "please input email"
                },
                city: {
                    required: "please input your city"
                },
                loanaccount: {
                    required: "please input your account number",
                   
                }
            },
            // submitHandler: function(form) {
            //     $(form).ajaxSubmit({
            //         type:"POST",
            //         data: $(form).serialize(),
            //         url:"#",
            //         success: function() {
            //             $('#contactFormcustomer :input').attr('disabled', 'disabled');
            //             $('#contactFormcustomer').fadeTo( "slow", 1, function() {
            //                 $(this).find(':input').attr('disabled', 'disabled');
            //                 $(this).find('label').css('cursor','default');
            //                 $('#success').fadeIn()
            //             })
            //         },
            //         error: function() {
            //             $('#contactFormcustomer').fadeTo( "slow", 1, function() {
            //                 $('#error').fadeIn()
            //             })
            //         }
            //     })
            // }
        })
    })


    // validate contactFormInstitution form
    $(function() {
        $('#contactFormInstitution').validate({
            rules: {
                name: {
                    required: true,
                    minlength: 2
                },
                number: {
                    required: true,
                    minlength: 10
                },
                email: {
                    required: true,
                    email: true
                },
                city: {
                    required: true,
                    minlength: 2
                },
                institution: {
                    required: true,
                   
                },
                subjectline: {
                    required: true,
                   
                }
            },
            messages: {
                name: {
                    required: "come on, your name, don't you?",
                    minlength: "your name must consist of at least 2 characters"
                },
                number: {
                    required: "please input your mobile number",
                    minlength: "your mobile of at least 10 number"
                },
                email: {
                    required: "please input email"
                },
                city: {
                    required: "please input your city",
                    minlength: "your city name must consist of at least 2 characters"
                },
                institution: {
                    required: "please input your institution name",
                   
                },
                subjectline: {
                    required: "please input your Subject Line",
                   
                }
            },
            
        })
    })

    // validate contactFormInstitution form
    $(function() {
        $('#contactFormMedia').validate({
            rules: {
                name: {
                    required: true,
                    minlength: 2
                },
                number: {
                    required: true,
                    minlength: 10
                },
                email: {
                    required: true,
                    email: true
                },
                city: {
                    required: true,
                    minlength: 2
                },
                mediahouse: {
                    required: true,
                   
                },
                subjectline: {
                    required: true,
                   
                }
            },
            messages: {
                name: {
                    required: "come on, your name, don't you?",
                    minlength: "your name must consist of at least 2 characters"
                },
                number: {
                    required: "please input your mobile number",
                    minlength: "your mobile of at least 10 number"
                },
                email: {
                    required: "please input email"
                },
                city: {
                    required: "please input your city",
                    minlength: "your city name must consist of at least 2 characters"
                },
                mediahouse: {
                    required: "please input your Media house name",
                   
                },
                subjectline: {
                    required: "please input your Subject Line",
                   
                }
            },
            
        })
    })
    // validate contactFormInvestors form
    $(function() {
        $('#contactFormInvestors').validate({
            rules: {
                name: {
                    required: true,
                    minlength: 2
                },
                number: {
                    required: true,
                    minlength: 10
                },
                email: {
                    required: true,
                    email: true
                },
                city: {
                    required: true,
                    minlength: 2
                },
                
                subjectline: {
                    required: true,
                   
                }
            },
            messages: {
                name: {
                    required: "come on, your name, don't you?",
                    minlength: "your name must consist of at least 2 characters"
                },
                number: {
                    required: "please input your mobile number",
                    minlength: "your mobile of at least 10 number"
                },
                email: {
                    required: "please input email"
                },
                city: {
                    required: "please input your city",
                    minlength: "your city name must consist of at least 2 characters"
                },
                mediahouse: {
                    required: "please input your Media house name",
                   
                },
                subjectline: {
                    required: "please input your Subject Line",
                   
                }
            },
            
        })
    })
        
})(jQuery)
