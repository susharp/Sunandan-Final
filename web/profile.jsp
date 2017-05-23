<!DOCTYPE html>
<html ng-app="DSWMatter">
<head>
    <!--Css-->
    <link rel="stylesheet" href="css/complaint.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="font-awesome-4.7.0/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/profile.css">
    <script src="js/jquery-3.1.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/angular.min.js"></script>
    <script src="js/app.js"></script>
    <script src="js/DSWController.js"></script>
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
        <a><img src="images/logo.png" width="100%" height="100%"></a>
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
                    <li><a href="usertest" tabindex="-1"><i class="fa fa-sign-out" aria-hidden="true"></i> Sign out</a></li>
                </ul>
            </div>
            <img src="prateek1.jpg" class="img-circle img-thumbnail pull-right" width="40" height="50">
            <label id="user-name" class="pull-right">Prateek Gogia</label>
        </div>
    </div>
    <span onClick="openNav()">&#9776;</span>
    <div class="container">
        <div class="text-center" id="image">
            <img src="prateek1.jpg" class="img-circle img-responsive">
        </div>
        <form action="Cuserp" method="post">
              <div class="form-group">
            <label>Old Password: </label>
            <input type="password" class="form-control" name="current"/>
        </div>
        
              <div class="form-group">
            <label>New Password: </label>
            <input type="password" class="form-control" id="newpassword" name="password"/>
        </div>
            <div class="form-group">
            <label>Confirm Password: </label>
            <input type="password" class="form-control" id="confirm_password" name="newpassword"/>
        </div>
            <script>
                            var newpassword = document.getElementById("newpassword")
                                    , confirm_password = document.getElementById("confirm_password");

                            function validatePassword() {
                                if (newpassword.value != confirm_password.value) {
                                    confirm_password.setCustomValidity("Passwords Don't Match");
                                } else {
                                    confirm_password.setCustomValidity('');
                                }
                            }

                            newpassword.onchange = validatePassword;
                            confirm_password.onkeyup = validatePassword;
                        </script>
        <div class="text-center">
            <button class="btn btn-success" id="submit-button">Update</button>
        </div>
        <div class="form-group">
         <input type="file" name="photo" id="file">
        </div>
            <input type="submit" value="Upload File" />
        </form>
      
  
              </div>
        </div>
    
    
   <!--Javascript-->
<script src="js/complaint.js"></script>
</body>
</html>