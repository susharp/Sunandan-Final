<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Sign-Up/Login Form</title>
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <nav class="navbar">
            <div class="navbar-inner">
                <a href="index.html"><img src="images/logo.png" width="100%" height="100%"></a>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-sm-offset-3 col-sm-6">
                    <!-- Nav tabs -->
                    <h1 class="text-center">Login to your Account</h1>
                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane active" id="home">
                            <div role="tabpanel" class="tab-pane" id="profile">

                                <div class="tab-content">
                                    <div id="login">
                                        <form action="alogin" method="post">
                                            <div class="form-group">
                                                <label>Amity Email ID:</label>
                                                <input type="email" class="form-control" placeholder="Type your Amity Email" name="email">
                                            </div>
                                            <div class="form-group">
                                                <label>Password:</label>
                                                <input type="password" class="form-control" placeholder="Type your password" name="password">
                                            </div>
                                            <button class="btn btn-default col-sm-offset-5 col-xs-offset-5">Login</button>
                                        </form>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script src="js/bootstrap.min.js"></script>

    </body>
</html>
