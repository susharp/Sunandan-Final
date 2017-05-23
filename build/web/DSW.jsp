<!DOCTYPE html>
<html ng-app="DSWMatter">
<head>
    <!--Css-->
    <link rel="stylesheet" href="css/complaint.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="font-awesome-4.7.0/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/dsw.css">
    <script src="js/jquery-3.1.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/angular.min.js"></script>
    <script src="js/app.js"></script>
    <script src="js/DSWController.js"></script>
    <script type = "text/javascript" >
function disableBackButton()
{
window.history.forward();
}
setTimeout("disableBackButton()", 5);
    </script>
    <script>
        $(document).ready(function(){
            $('.dropdown-submenu a.test').on("click", function(e){
                $(this).next('ul').toggle();
                e.stopPropagation();
                e.preventDefault();
            });
        });
    </script>
   

</head>
<body ng-controller="DSWController">
<nav class="navbar">
    <div class="navbar-inner">
        <a><img src="images\logo.png" width="100%" height="100%"></a>
    </div>
</nav>
<div id="mySideNav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="#">Home</a>
    <a href="complaint.jsp"><i class="fa fa-envelope-open-o" aria-hidden="true"></i> Post a Complaint</a>
    <a href="status.jsp"><i class="fa fa-tasks" aria-hidden="true"></i> Check Status</a>
    <a href="DSW.jsp"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Write to DSW</a>
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
            </div>
            <img src="prateek1.jpg" class="img-circle img-thumbnail pull-right" width="40" height="50">
            <label id="user-name" class="pull-right">
                 <%
                    String email = session.getAttribute("emails").toString();
                    session.setAttribute("id", email);
                 %>
                     <%
                        out.print(email);
                        %>
            </label>
        </div>
    </div>
    <span onClick="openNav()">&#9776;</span>
    <h3 class="text-center">Write a personal message to <span id="mark">Dean Student Welfare</span></h3>
    <br><br>
    <form action="review2" method="POST">
        <div>
             <input type="hidden" value="<% out.print(email); %>" name="ids">
        </div>
    <div>
        <textarea maxlength="300" class="form-control text-center" placeholder="Write here." name="textarea" ng-model="complaint" required autocomplete="off"></textarea>
    </div><label class="pull-right"><span class="red">*</span><small>Max. of 300 Words are allowed</small></label>
    <div>
        <h4><b>Your complaint looks like:</b></h4>
        <p class="text-pre-wrap"><b>"{{complaint}}"</b></p>
    </div>
        <div></div>
    <div class="text-center">
        <button class="btn btn-success" id="submit-button">Submit</button>
    </div>
    </form>
</div>
<div>
    <marquee id="note"><b>Note: Replies from DSW are truely confidential and hence will be reverted back via email.</b></marquee>
</div>
<!--Javascript-->
<script src="js/complaint.js"></script>
</body>
</html>