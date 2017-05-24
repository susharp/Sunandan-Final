<%-- 
    Document   : forgotpass
    Created on : 23-May-2017, 05:57:13
    Author     : sunan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


       <!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Forget Password Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <!--navbar -->
        <nav class="navbar">
        <div class="navbar-inner">
            <a><img src="images/logo.png" width="100%" height="100%"></a>
        </div>
        </nav>
        <!--inner body-->
        <div class="container">
            <h1 class="text-center">Forget Password</h1>
            <form action="forgotpassword" method="post" class="form-horizontal">
                <div class="form-group">
                    <label class="control-label col-sm-2">Email: </label>
                    <div class="col-sm-10">
                    <input required type="email" class="form-control" name="email" placeholder="abc@student.amity.edu">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">ID card number:</label>
                    <div class="col-sm-10">
                    <input required type="text" name="idno" oninput="this.value=this.value.replace(/[^0-9]/g,'');" class="form-control" minlength="8" maxlength="8" placeholder="12345678">
                    <span class="required">*<i>Enter your 8 digit Amity ID card Number</i></span>
                    </div>
                </div>
                <div class="form-group">
                    
                     <label class="control-label col-sm-2">Enter your new password</label>
                     <div class="col-sm-10">
                         <input required type="password" class="form-control" name="password" id="newpassword" placeholder="Enter your new password">  
                     </div>
                      
                </div>
                <div class="form-group">
                    
                     <label class="control-label col-sm-2">Retype your new password</label>
                     <div class="col-sm-10">
                         <input required type="password" class="form-control" name="newpassword" id="new_pass" placeholder="Retype your new password">  
                     </div>
                      
                </div>
                <script>
                            var newpassword = document.getElementById("newpassword")
                                    , new_password = document.getElementById("new_pass");

                            function validatePassword() {
                                if (newpassword.value != new_password.value) {
                                    new_password.setCustomValidity("Passwords Don't Match");
                                } else {
                                    new_password.setCustomValidity('');
                                }
                            }

                            newpassword.onchange = validatePassword;
                            new_password.onkeyup = validatePassword;
                        </script>
                 <div class="formgroup">
                <div class="col-sm-offset-2 col-sm-10">
                    <button class="btn btn-primary">Submit</button>
                </div>
                </div>
               
            </form>
                    </div>
               
          
        
    </body>
</html>
           
        </form>
    </body>
</html>
