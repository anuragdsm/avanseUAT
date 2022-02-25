
    
;(function($) {
    "use strict";

    
    jQuery.validator.addMethod('answercheck', function (value, element) {
        return this.optional(element) || /^\bcat\b$/.test(value)
    }, "type the correct answer -_-");

    // validate contactFormcustomer form
    $(function() {
        $('#customercontactForm').validate({
            rules: {
                name: {
                    required: true,
                    minlength: 2
                },
                phoneNumber: {
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
                loanAccountNumber: {
                    required: true,
                   
                }
            },
            messages: {
                name: {
                    required: " Come on, your name, don't you?",
                    minlength: "Your name must consist of at least 2 characters"
                },
                phoneNumber: {
                    required: "Please input your mobile number",
                    minlength: "Your mobile of at least 10 number"
                },
                email: {
                    required: "Please input email"
                },
                city: {
                    required: "Please input your city"
                },
                loanAccountNumber: {
                    required: "Please input your account number",
                   
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


    // validate eduinstcontactForm form
    $(function() {
        $('#eduinstcontactForm').validate({
            rules: {
                name: {
                    required: true,
                    minlength: 2
                },
                phoneNumber: {
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
                subjectLine: {
                    required: true,
                   
                }
            },
            messages: {
                name: {
                    required: " Come on, your name, don't you?",
                    minlength: "Your name must consist of at least 2 characters"
                },
                phoneNumber: {
                    required: "Please input your mobile number",
                    minlength: "Your mobile of at least 10 number"
                },
                email: {
                    required: "Please input email"
                },
                city: {
                    required: "Please input your city",
                    minlength: "Your city name must consist of at least 2 characters"
                },
                institution: {
                    required: "Please input your institution name",
                   
                },
                subjectLine: {
                    required: "Please input your Subject Line",
                   
                }
            },
            
        })
    })

    // validate contactFormInstitution form
    $(function() {
        $('#mediacontactForm').validate({
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
                subjectLine: {
                    required: true,
                   
                }
            },
            messages: {
                name: {
                    required: " Come on, your name, don't you?",
                    minlength: "Your name must consist of at least 2 characters"
                },
                number: {
                    required: "Please input your mobile number",
                    minlength: "Your mobile of at least 10 number"
                },
                email: {
                    required: "Please input email"
                },
                city: {
                    required: "Please input your city",
                    minlength: "Your city name must consist of at least 2 characters"
                },
                mediahouse: {
                    required: "Please input your Media house name",
                   
                },
                subjectLine: {
                    required: "Please input your Subject Line",
                   
                }
            },
            
        })
    })
    // validate investorscontactForm form
    $(function() {
        $('#investorscontactForm').validate({
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
                    required: " Come on, your name, don't you?",
                    minlength: "Your name must consist of at least 2 characters"
                },
                number: {
                    required: "Please input your mobile number",
                    minlength: "Your mobile of at least 10 number"
                },
                email: {
                    required: "Please input email"
                },
                city: {
                    required: "Please input your city",
                    minlength: "Your city name must consist of at least 2 characters"
                },
                mediahouse: {
                    required: "Please input your Media house name",
                   
                },
                subjectline: {
                    required: "Please input your Subject Line",
                   
                }
            },
            
        })
    })
    // validate  -apply now page
    $(function() {
        $('#myForm').validate({
            rules: {
                firstName: {
                    required: true,
                    minlength: 2
                },
                lname: {
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
                
                placeOfStudy: {
                    required: true,
                   
                },
                loanAmount: {
                    required: true,
                   
                },
                // appply for education institution laon
                lastName: {
                    required: true,
                    minlength: 2
                },
                phoneNumber: {
                    required: true,
                    minlength: 10
                },
                loanType: {
                    required: true,
                    
                },
                loanUsage: {
                    required: true,
                    
                },
                institutionType: {
                    required: true,
                    
                },
                CurriculumBoard: {
                    required: true,
                    
                },
                vintage: {
                    required: true,
                    
                },
                studentStrength: {
                    required: true,
                    
                },
                 // apply for executive education loan
                courseName: {
                    required: true,
                    
                },
                
            },
            messages: {
                firstName: {
                    required: " Come on, your first name, don't you?",
                    minlength: "Your name must consist of at least 2 characters"
                },
                lname: {
                    required: " Come on, your last name, don't you?",
                    minlength: "Your name must consist of at least 2 characters"
                },
                number: {
                    required: "Please input your mobile number",
                    minlength: "Your mobile of at least 10 number"
                },
                email: {
                    required: "Please input email"
                },
                city: {
                    required: "Please input your city",
                    minlength: "Your city name must consist of at least 2 characters"
                },
                loanAmount: {
                    required: "Please select amount",
                   
                },
                placeOfStudy: {
                    required: "Please input your Subject Line",
                   
                },

                // appply for education institution laon
                lastName: {
                    required: " Come on, your last name, don't you?",
                    minlength: "Your name must consist of at least 2 characters"
                },
                phoneNumber: {
                    required: "Please input your mobile number",
                    minlength: "Your mobile of at least 10 number"
                },
                loanType: {
                    required: "Please select loan type",
                },
                loanUsage: {
                    required: "Please select loan usage",
                },
                institutionType: {
                    required: "Please select institution type",
                },
                CurriculumBoard: {
                    required: "Please select curriculum board",
                },
                vintage: {
                    required: "Please select vintage",
                },
                studentStrength: {
                    required: "Please select student strength",
                },
                // apply for executive education loan
                courseName: {
                    required: "Please select student course Name",
                },
                

            },
            
        })
    })
        
})(jQuery)
