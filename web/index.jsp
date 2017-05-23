<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>


        <meta charset="UTF-8">
        <title>Sign-Up/Login Form</title>
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script type="text/javascript" src="countryStateCity.js"></script>



    </head>

    <body>
        <div class="form">
            <%
                String status = (String) request.getAttribute("status");
                if (status != null) {
            %>
            <h2>
                <font color="red">   
                <center>
                    Dear Student ,
                    <%=status%><br>
                    Please enter a valid details
                </center>
                </font>

            </h2>      

            <%
                }
            %>
            <ul class="tab-group">
                <li class="tab active"><a href="#signup">Sign Up</a></li>
                <li class="tab"><a href="#login">Log In</a></li>
            </ul>

            <div class="tab-content">
                <div id="signup">   
                    <h1>Sign Up for new account</h1>


                    <form action="sreg" method="post">

                        <div class="top-row">
                            <div class="field-wrap">
                                <label>
                                    First Name<span class="req">*</span>
                                </label>
                                <input type="text" name="fname" required autocomplete="off"  />
                            </div>

                            <div class="field-wrap">
                                <label>
                                    Last Name<span class="req">*</span>
                                </label>
                                <input type="text" name="lname" required autocomplete="off"/>
                            </div>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Amizone Email Address<span class="req">*</span>
                            </label>
                            <input type="email" name="email" required autocomplete="off"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Set A Password<span class="req">*</span>
                            </label>
                            <input type="password" name="password" id="password" required autocomplete="off"/>
                        </div>
                        <div class="field-wrap">
                            <label>
                                Confirm your Password<span class="req">*</span>
                            </label>
                            <input type="password" name="confirmpassword" id="confirm_password" required autocomplete="off"/>
                        </div>
                        <script>
                            var password = document.getElementById("password")
                                    , confirm_password = document.getElementById("confirm_password");

                            function validatePassword() {
                                if (password.value != confirm_password.value) {
                                    confirm_password.setCustomValidity("Passwords Don't Match");
                                } else {
                                    confirm_password.setCustomValidity('');
                                }
                            }

                            password.onchange = validatePassword;
                            confirm_password.onkeyup = validatePassword;
                        </script>


                        <div class="field-wrap">
                            <select class="form-control" id="country" name="dept" data-width="auto">
                                <optgroup label="ASET">
                                    <option>CSE</option>
                                    <option>MAE</option>
                                    <option>ECE/EEE</option>
                                    <option>Civil/Chemical</option>
                                </optgroup>
                                <optgroup label="ABS">
                                    <option>BCOM</option>
                                    <option>BBA</option>
                                    <option>MBA</option>
                                    <option>MCOM</option>
                                </optgroup>
                                <option class="bold">ASAP</option>
                                <option class="bold">ALS</option>
                            </select>
                        </div>
                        <div class="field-wrap">
                            <label>
                                ID Card Number<span class="req">*</span>
                            </label>
                            <input pattern=".{8,8}" type="text" name="idno" oninput="this.value=this.value.replace(/[^0-9]/g,'');"  required="on" maxlength="8" size="8" minlength="8"/>
                        </div>
                        <%--
                                   Connection conn = null;
                                   PreparedStatement pstmt = null;
                                   ResultSet rs = null;
                                   String url = "jdbc:mysql://localhost:3306/test";//Here the "test" is the Database name
                                   FileInputStream fis = null;
                                   try {
                                        Connection con = null;
                                           Class.forName("com.mysql.jdbc.Driver");
                                    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/complaint management?zeroDateTimeBehavior=convertToNull","root","1234");
                                   }--%>
                        <div class="field-wrap">
                            <label>
                                Image Link
                            </label>

                            <input type="file" name="photo" id="file">
                        </div>

                        <button type="submit" id="opener" class="button button-block">Get Started</button>
                        <script>
                            $(document).ready(function () {
                                $("#dialog").dialog();

                                $("#opener").on("click", function () {
                                    $("#dialog").dialog("open");
                                });
                            });
                        </script>

                        <div id="dialog" title="Basic dialog">
                            <p> The dialog window can be moved, resized and closed with the 'x' icon.</p>
                        </div>
                        
                    </form>

                </div>

                <div id="login">   
                    <h1>Login for existing user</h1>

                    <form action="usertest" method="post">

                        <div class="field-wrap">
                            <label>
                                Amizone Email Address<span class="req">*</span>
                            </label>
                            <input type="email" name="email" required autocomplete="off"/>
                        </div>

                        <div class="field-wrap">
                            <label>
                                Password<span class="req">*</span>
                            </label>
                            <input type="password" name="password" required autocomplete="off"/>
                        </div>

                        <p class="forgot"><a href="forgotpass.jsp">Forgot Password?</a></p>

                        <button class="button button-block">Log In</button>

                    </form>

                </div>

            </div><!-- tab-content -->

        </div> <!-- /form -->
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/countries.js"></script>
        <script src="js/index.js"></script>



    </body>
</html>
