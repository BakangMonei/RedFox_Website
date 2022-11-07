<%--
  Created by IntelliJ IDEA.
  User: cse20-018
  Date: 02/11/2022
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Movie Page</title>
    <!-- load stylesheets -->
    <link rel="stylesheet" href="https://cdnjs.cloudfare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <link rel="stylesheet" href="css/stylestars.css"/>
    <!-- For rating stars -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="font-awesome-4.5.0/css/font-awesome.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- Bootstrap style -->
    <link rel="stylesheet" href="css/hero-slider-style.css">
    <!-- Hero slider style (https://codyhouse.co/gem/hero-slider/) -->
    <link rel="stylesheet" href="css/magnific-popup.css">
    <!-- Magnific popup style (http://dimsemenov.com/plugins/magnific-popup/) -->
    <link rel="stylesheet" href="css/templatemo-style.css">
    <!-- Templatemo style -->
</head>
<body>
<div class="cd-full-width">
    <div class="container-fluid js-tm-page-content" data-page-no="3">
        <div class="cd-bg-video-wrapper" data-video="video/sunset-cloud">
        </div>
        <div class="tm-img-gallery-container">
            <div class="tm-img-gallery gallery-one">
                <div class="tm-img-gallery-info-container">
                    <h1 class="tm-text-title tm-gallery-title">
                        <strong> <b>Movies</b></strong>
                    </h1>
                </div>
                <div class="grid-item">
                    <a href="img/Guardians.jpg">
                        <img src="img/Guardians.jpg" alt="Image" class="img-fluid tm-img">
                        <diV class="star-widget">
                            <input type="radio" name="rate" id="rate-5">
                            <label for="rate-5" class="fas fa-start"></label>
                            <input type="radio" name="rate" id="rate-4">
                            <label for="rate-4" class="fas fa-start"></label>
                            <input type="radio" name="rate" id="rate-3">
                            <label for="rate-3" class="fas fa-start"></label>
                            <input type="radio" name="rate" id="rate-2">
                            <label for="rate-2" class="fas fa-start"></label>
                            <input type="radio" name="rate" id="rate-1">
                            <label for="rate-1" class="fas fa-start"></label>
                            <form action="#">
                                <header></header>
                                <div class="textarea">
                                    <textarea cols="30" placeholder="Describe your experience"></textarea>
                                </div>
                                <div class="btn">
                                    <button type="submit">Post</button>
                                </div>
                            </form>
                        </diV>
                    </a>
                </div>
                <div class="grid-item">
                    <a href="img/IT.jpg">
                        <img src="img/IT.jpg" alt="Image" class="img-fluid tm-img">
                    </a>
                </div>
                <div class="grid-item">
                    <a href="img/Kong.jpg">
                        <img src="img/Kong.jpg" alt="Image" class="img-fluid tm-img">
                    </a>
                </div>
                <div class="grid-item">
                    <a href="img/LegoBatman.jpg">
                        <img src="img/LegoBatman.jpg" alt="Image" class="img-fluid tm-img">
                    </a>
                </div>

                <div class="grid-item">
                    <a href="img/Shooter.jpg">
                        <img src="img/Shooter.jpg" alt="Image" class="img-fluid tm-img">
                    </a>
                </div>
                <div class="grid-item">
                    <a href="img/StepBrothers.jpg">
                        <img src="img/StepBrothers.jpg" alt="Image" class="img-fluid tm-img">
                    </a>
                </div>
                <div class="grid-item">
                    <a href="img/Spiderman.jpg">
                        <img src="img/Spiderman.jpg" alt="Image" class="img-fluid tm-img">
                    </a>
                </div>
            </div>
        </div> <!-- .tm-img-gallery-container -->
    </div> <!-- .container-fluid -->
</div> <!-- .cd-full-width -->
<script>
    const btn = document.querySelector("button");
    const post = document.querySelector(".post");
    const widget = document.querySelector(".star-widget");
    const editBtn = document.querySelector(".edit");
    btn.onclick = () => {
        widget.style.display = "none";
        post.style.display = "block";
        editBtn.onclick = () => {
            widget.style.display = "block";
            post.style.display = "none";
        }
        return false;
    }
</script>
</body>
</html>