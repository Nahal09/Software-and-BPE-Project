<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@700&family=Figtree:wght@700&display=swap" rel="stylesheet">
    </head>
    <style>
    * {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}

body {
    display: flex;
    width: 100vw;
    height: 100vh;
    background-color: #24242c;
}

.container {
    width: 50%;
    height: 100%;
    background-color: #24242c;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    gap: 15px;
}

.pic {
    width: 50%;
    height: 100%;
    overflow: hidden;
    background-image: url("https://4kwallpapers.com/images/wallpapers/dark-blue-pink-2560x2560-12661.jpg");
    background-size: cover;
    background-position: center;
}

/* .pic2 {
    width: 100%;
    height: 15px;
    position: absolute;
    display: none;
    top: 0;
    background-image: url("https://4kwallpapers.com/images/wallpapers/dark-blue-pink-2560x2560-12661.jpg");
    background-size: cover;
    background-position: center;
} */

.inp {
    width: 350px;
    height: 50px;
    max-height: 50px;
    min-height: 50px;
    display: flex;
    align-items: center;
    position: relative;
}

label {
    position: absolute;
    left: 20px;
    color: #777780;
    height: 20px;
    transform: translateY(2.5px);
    padding-left: 5px;
    cursor: text;
    padding-right: 5px;
    transition: .2s;
    font-family: Arial, Helvetica, sans-serif;
}

input {
    width: 100%;
    height: 100%;
    background-color: transparent;
    border: 2px solid #494954;
    border-radius: 10px;
    outline: none;
    transition: .4s;
    color: #fff;
    padding-left: 20px;
    padding-right: 20px;
    font-size: 15px;
}

input:focus {
    border: 2px solid #1f1fff;
    box-shadow: #6767ff 0px 1px 1px, #6767ff 0px 0px 0px 1px;
}

input:focus + label {
    left: 20px;
    transform: translateY(-22px);
    font-size: 12px;
    background-color: #24242c;
}

.up {
    left: 20px;
    transform: translateY(-22px);
    font-size: 12px;
    background-color: #24242c;
}

button {
    width: 350px;
    height: 50px;
    min-height: 50px;
    max-height: 50px;
    background-color: #2020db;
    border: 2px solid #1f1fff;
    border-radius: 50px;
    outline: none;
    transition: .4s;
    color: #fff;
    padding-left: 20px;
    padding-right: 20px;
    font-size: 15px;
    cursor: pointer;
    font-family: 'Figtree', sans-serif;
}

button:hover {
    background-color: #1717c2;
    border: 2px solid #1717c2;
}

h1 {
    font-family: 'Be Vietnam Pro', sans-serif;
    font-family: 'Figtree', sans-serif;
    color: #fff;
    margin-bottom: 20px;
}

a {
    color: #bbbbbb;
    text-decoration: none;
    font-size: 12px;
    font-family: 'Figtree', sans-serif;
}

a:hover {
    text-decoration: underline;
}

img {
    width: 70px;
    border-radius: 10px;
    border: 1px solid #494954;
}

@media only screen and (max-width: 750px) {
    .pic {
      display: none;
    }

    /* .pic2 {
        display: block;
    } */

    .container {
        width: 100%;
    }
}

@media only screen and (max-height: 450px) {
    .pic {
      display: none;
    }

    .container {
        width: 100%;
    }

    body {
        padding-bottom: 10px;
        overflow: scroll;
        height: 100%;
    }
}
</style>
<script>
document.addEventListener("DOMContentLoaded", function() {
	  const inputs = document.querySelectorAll(".inp input");

	  inputs.forEach(input => {
	    input.addEventListener("input", function() {
	      const label = this.nextElementSibling;
	      label.classList.toggle("up", this.value.trim() !== "");
	    });
	  });
	});

	function focusinp(inp) {
	  if (inp == 'usr') {
	    document.getElementById("username").focus();
	  } else if (inp == 'pass') {
	    document.getElementById("password").focus();
	  } else {
	    document.getElementById("username").focus();
	  }
	}
</script>
    <body>
        <div class="container">
            <div class="pic2"></div>
            <h1>Log in To Continue</h1>
            <div class="inp">
                <input type="text" id="username">
                <label onclick="focusinp('usr')" for="Username">Username</label>
            </div>
            <br>
            <div class="inp">
                <input type="password" id="password">
                <label onclick="focusinp('pass')" for="Password">Password</label>
            </div>
            <br>
            <div style="display: flex;"><a href="">Forgot Password? - Support</a></div>
            <br>
            <button type="submit">Login</button>
            <br>
            <a  onclick="myFunction()" href="#">Dont have a account? Sign up</a>
        </div>
        <div class="pic">
        </div>
    </body>
</html>