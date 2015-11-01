<!doctype html>
<html lang="en-US">
<head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html">
  <title>Register</title>
  <meta name="author" content="Sasidhar Pamganamamula">
  <link rel="stylesheet" type="text/css" media="all" href="css/styles.css">
  <link rel="stylesheet" type="text/css" media="all" href="css/switchery.min.css">
  <script type="text/javascript" src="js/switchery.min.js"></script>
</head>

<body>
  <div id="wrapper">
  
  <h1>Register</h1>
  
  <form onsubmit="return false">
  <div class="col-2">
    <label>
      Name
      <input placeholder="What is your full name?" id="name" name="name" tabindex="1">
    </label>
  </div>
  <div class="col-2">
    <label>
      Practice Name
      <input placeholder="What is the name of the practice?" id="practice" name="practice" tabindex="2">
    </label>
  </div>
  
  <div class="col-3">
    <label>
      Practice ID
      <input placeholder="What is the Practice ID" id="practice-id" name="practice-id" tabindex="3">
    </label>
  </div>
  <div class="col-3">
    <label>
      Email
      <input placeholder="What is your e-mail address?" id="email" name="email" tabindex="4">
    </label>
  </div>
  <div class="col-3">
    <label>
      Role
      <select tabindex="5">
        <option>Administrator</option>
        <option>User</option>
        <option>Provider</option>
      </select>
    </label>
  </div>
  
  <div class="col-4">
    <label>
      Username
      <input placeholder="What is your desired username?" id="username" name="username" tabindex="6">
    </label>
  </div>
  <div class="col-4">
    <label>
      Password
      <input placeholder="What is your desired password?" id="password" name="password" tabindex="7">
    </label>
  </div>
  <div class="col-4">
    <label>Contact Via Phone?</label>
    <center style="position:relative; margin-bottom:8px;"><input type="checkbox" class="js-switch"></center>
  </div>
  <div class="col-4 switch">
    <label>E-mail Updates?</label>
    <center style="position:relative;margin-bottom:8px;"><input type="checkbox" class="js-switch"></center>
  </div>
  
  <div class="col-submit">
    <button class="submitbtn">Register</button>
  </div>
  
  </form>
  </div>
<script type="text/javascript">
var elems = Array.prototype.slice.call(document.querySelectorAll('.js-switch'));

elems.forEach(function(html) {
  var switchery = new Switchery(html);
});
</script>
</body>
</html>