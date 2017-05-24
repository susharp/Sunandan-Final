<!DOCTYPE html>
<html>
    <head>
        <!--Css-->
        <link rel="stylesheet" href="css/complaint.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="font-awesome-4.7.0/font-awesome-4.7.0/css/font-awesome.min.css">
        <script src="js/jquery-3.1.1.js"></script>
        <script type = "text/javascript" >
            function disableBackButton()
            {
                window.history.forward();
            }
            setTimeout("disableBackButton()", 5);
        </script>
        <script>
            $(document).ready(function () {
                $('.dropdown-submenu a.test').on("click", function (e) {
                    $(this).next('ul').toggle();
                    e.stopPropagation();
                    e.preventDefault();
                });
            });
        </script>


    </head>
    <body>
        <nav class="navbar">
            <div class="navbar-inner">
                <a><img src="images/logo.png" width="100%" height="100%"></a>
            </div>
        </nav>
        <div id="mySideNav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="complaint.jsp"><i class="fa fa-envelope-open-o" aria-hidden="true"></i> Post a Complaint</a>
            <a href="status.jsp"><i class="fa fa-tasks" aria-hidden="true"></i> Check Status</a>
            <a href="DSW.jsp"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Write to DSW</a>
            <%
                String email = session.getAttribute("emails").toString();
                session.setAttribute("id", email);
            %>
        </div>
        <div id="main">
            <div class="container-fluid">
                <div>
                    <div class="dropdown-container">
                        <button class="btn btn-default pull-right info-button dropdown-toggle" data-toggle="dropdown">&#9776;</button>
                        <ul class="dropdown-menu pull-right" id="dropdown-top">
                            <li><a href="profile.jsp" tabindex="-1"><i class="fa fa-user-circle-o" aria-hidden="true"></i> Change Profile</a></li>
                            <li><a href="usertest" tabindex="-1"><i class="fa fa-sign-out" aria-hidden="true"></i> Sign out</a></li>
                        </ul>
                        </ul>
                    </div>
                    <img src="prateek1.jpg" class="img-circle img-thumbnail pull-right" width="40" height="50">
                    <label id="user-name" class="pull-right">

                        <%String name = (String) session.getAttribute("emails");
                                 out.print("your name" + name);%>


                    </label>
                </div>
            </div>
            <%
                String status = (String) request.getAttribute("status");
                if (status != null) {
            %>
            <h2>
                <font color="green">   
                <center>
                    Dear Student ,
                    <%=status%><br>
                    Thank you ! For your time.
                </center>
                </font>

            </h2>      

            <%
                }
            %>
            <h2>Post a Complaint</h2>
            <span onClick="openNav()">&#9776;</span>

            <div>
                <form action="cregister" method="post">
                    <div class="form-group text-center">

                        <label class="form-inline" >Category:</label>
                        <label class="form-inline" for="ids" >
                            <input type="hidden" value="<% out.print(email);%>" name="ids">

                        </label>
                        <div class="dropdown">
                            <div class="container">
                                <select id="options" onchange="member(this.id, 'label-mem')" data-live-search="true" name="cname">
                                    <option class="text-danger" id="select" value="select" disabled selected>Select a category</option>
                                    <optgroup label="Food and Hostel">    
                                        <option class="text-center" id="Mess" value="Mess">Mess</option>
                                        <option class="text-center" id="Food Trucks" value="Food Trucks">Food Trucks</option>
                                        <option class="text-center" id="Hostel" value="Hostel">Hostel</option>
                                    </optgroup>
                                    <optgroup label="Medical">
                                        <option class="text-center" id="MI Room" value="MI Room">MI Room</option>
                                    </optgroup>
                                    <optgroup label="Transport and Security">
                                        <option class="text-center" id="Transport" value="Transport">Transport</option>
                                    </optgroup>
                                    <optgroup label="Fees and Accounts">
                                        <option class="text-center" id="Fees" value="Fees and Accounts">Fees and Accounts</option>
                                    </optgroup>
                                    <optgroup label="Other">
                                        <option class="text-center" id="Library" value="Library">Library</option>
                                        <option class="text-center" id="SRC" value="SRC">Student Resource Center (SRC)</option>
                                        <option class="text-center" id="IT" value="IT">IT</option>
                                    </optgroup>
                                </select>
                            </div> 
                        </div>
                        <div class="top">
                            <label>Complaint will be forwarded to: </label>
                            <div>
                                <label class="concerned-member" id="label-mem"></label>
                            </div>
                        </div>

                        <div class="top">
                            <label class="col-lg-4 col-lg-offset-4">Please tell in brief about the complaint: </label>
                            <label class="pull-right"><span class="red">*</span><small>Max. of 200 characters are allowed</small></label>
                            <div>
                                <textarea required name="textarea" title="" maxlength="200" class="form-control text-center"></textarea>
                            </div>
                        </div>
                        <div id="submit-button">
                            <button class="btn btn-success">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <!--Javascript-->
        <script src="js/bootstrap.min.js"></script>
        <!-- <script src="bootstrap-select-master/bootstrap-select-master/dist/js/bootstrap-select.min.js"></script>-->
        <script src="js/complaint.js"></script>

    </body>
</html>