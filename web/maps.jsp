<%-- 
    Document   : maps
    Created on : 18/10/2019, 09:52:30 PM
    Author     : santi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Consulta INAI
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  <!-- CSS Files -->
  <link href="./assets/css/material-dashboard.css?v=2.1.1" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="./assets/demo/demo.css" rel="stylesheet" />
</head>

<body class="">
  <div class="wrapper ">
    <div class="sidebar" data-color="purple" data-background-color="white" data-image="../assets/img/sidebar-1.jpg">
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"

        Tip 2: you can also add an image using data-image tag
    -->
      <div class="logo">
        <a href="http://www.creative-tim.com" class="simple-text logo-normal">
          Consulta INAI
        </a>
      </div>
      <div class="sidebar-wrapper">
        <ul class="nav">
          <li class="nav-item  ">
            <a class="nav-link" href="./main.jsp">
              <i class="material-icons">dashboard</i>
              <p>Panel de Inicio</p>
            </a>
          </li>
          <li class="nav-item active ">
            <a class="nav-link" href="./map.html">
              <i class="material-icons">location_ons</i>
              <p>Valoración</p>
            </a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="./user.html">
              <i class="material-icons">person</i>
              <p>Perfil</p>
            </a>
          </li>
        </ul>
      </div>
    </div>
    <div class="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <a class="navbar-brand">Municipio Cuernavaca</a>
          </div>
        </div>
      </nav>
      <!-- End Navbar -->
      <div id="map"></div>

          <div id="modalMaps" class="modal" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
              <div class="modal-content">
                <div class="modal-header">
                  <h5 class="modal-title">Evaluar Establecimiento</h5>
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                  </button>
                </div>
                <div class="modal-body">
                  <div id="titulo" style="text-align: center;"><h2>La Casa del Herrero</h2></div>
                  <div ><img src="./imgs/lugar.PNG" style="position: relative; display: inline-block; width:300px;height:200px"></div>
                  <div><label style="text-align: center;">Dirección: Calle Cipres No.325, Col.Teopanzolco, Cuernavaca, Morelos</label></div>
                  <div><label style="text-align: center;">Giro: Taller de Forja y Soldadura</label></div>
                  <div style="text-align: center;"><h3>Generar Reporte</h3></div>

                  <div id="divDocumentos" class="row"></div>
                  <label for="comment">Comentario</label>
                  <textarea class="form-control" rows="5" id="comment"></textarea>
                </div>
                      <div class="modal-footer">
        <button id="btnSave" onclick="confirmar()"type="button" class="btn btn-primary">Guardar</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
      </div>

        </div>
    </div>
     </div>



    </div>
  </div>
  <div class="fixed-plugin">
    <div class="dropdown show-dropdown">
      <ul class="dropdown-menu">
        <li class="header-title"> Sidebar Filters</li>
        <li class="adjustments-line">
          <a href="javascript:void(0)" class="switch-trigger active-color">
            <div class="badge-colors ml-auto mr-auto">
              <span class="badge filter badge-purple" data-color="purple"></span>
              <span class="badge filter badge-azure" data-color="azure"></span>
              <span class="badge filter badge-green" data-color="green"></span>
              <span class="badge filter badge-warning" data-color="orange"></span>
              <span class="badge filter badge-danger" data-color="danger"></span>
              <span class="badge filter badge-rose active" data-color="rose"></span>
            </div>
            <div class="clearfix"></div>
          </a>
        </li>
        <li class="header-title">Images</li>
        <li class="active">
          <a class="img-holder switch-trigger" href="javascript:void(0)">
            <img src="../assets/img/sidebar-1.jpg" alt="">
          </a>
        </li>
        <li>
          <a class="img-holder switch-trigger" href="javascript:void(0)">
            <img src="../assets/img/sidebar-2.jpg" alt="">
          </a>
        </li>
        <li>
          <a class="img-holder switch-trigger" href="javascript:void(0)">
            <img src="../assets/img/sidebar-3.jpg" alt="">
          </a>
        </li>
        <li>
          <a class="img-holder switch-trigger" href="javascript:void(0)">
            <img src="../assets/img/sidebar-4.jpg" alt="">
          </a>
        </li>
        <li class="button-container">
          <a href="https://www.creative-tim.com/product/material-dashboard" target="_blank" class="btn btn-primary btn-block">Free Download</a>
        </li>
        <li class="button-container">
          <a href="https://demos.creative-tim.com/material-dashboard/docs/2.1/getting-started/introduction.html" target="_blank" class="btn btn-default btn-block">
            View Documentation
          </a>
        </li>
        <li class="button-container github-star">
          <a class="github-button" href="https://github.com/creativetimofficial/material-dashboard" data-icon="octicon-star" data-size="large" data-show-count="true" aria-label="Star ntkme/github-buttons on GitHub">Star</a>
        </li>
        <li class="header-title">Thank you for 95 shares!</li>
        <li class="button-container text-center">
          <button id="twitter" class="btn btn-round btn-twitter"><i class="fa fa-twitter"></i> &middot; 45</button>
          <button id="facebook" class="btn btn-round btn-facebook"><i class="fa fa-facebook-f"></i> &middot; 50</button>
          <br>
          <br>
        </li>
      </ul>
    </div>
  </div>
  <!--   Core JS iles   -->
  <script src="./assets/js/core/jquery.min.js"></script>
  <script src="./assets/js/core/popper.min.js"></script>
  <script src="./assets/js/core/bootstrap-material-design.min.js"></script>
  <script src="./assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!-- Plugin for the momentJs  -->
  <script src="./assets/js/plugins/moment.min.js"></script>
  <!--  Plugin for Sweet Alert -->
  <script src="./assets/js/plugins/sweetalert2.js"></script>
  <!-- Forms Valdations Plugin -->
  <script src="./assets/js/plugins/jquery.validate.min.js"></script>
  <!-- Plugin fr the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->
  <script src="./assets/js/plugins/jquery.bootstrap-wizard.js"></script>
  <!--	Plugin or Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->
  <script src="./assets/js/plugins/bootstrap-selectpicker.js"></script>
  <!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->
  <script src="./assets/js/plugins/bootstrap-datetimepicker.min.js"></script>
  <!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->
  <script src="./assets/js/plugins/jquery.dataTables.min.js"></script>
  <!--	Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->
  <script src="./assets/js/plugins/bootstrap-tagsinput.js"></script>
  <!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->
  <script src="./assets/js/plugins/jasny-bootstrap.min.js"></script>
  <!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->
  <script src="./assets/js/plugins/fullcalendar.min.js"></script>
  <!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->
   <script src="./assets/js/plugins/jquery-jvectormap.js"></script>
  <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
  <script src="./assets/js/plugins/nouislider.min.js"></script>
  <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js"></script>
  <!-- Library for adding dinamically elements -->
  <script src="./assets/js/plugins/arrive.min.js"></script>
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCDMX-H_JeH7WDpVT-vlvsrUlx_HIZf0Uk"></script>
  <!-- Chartist JS -->
  <script src="./assets/js/plugins/chartist.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="./assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="./assets/js/material-dashboard.js?v=2.1.1" type="text/javascript"></script>
  <!-- Material Dashboard DEMO methods, don't include it in your project! -->
  <script src="./assets/demo/demo.js"></script>
  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>

<!-- MAPA !!!!!!!!!!!!!--->



  <script>
     $(document).ready(function() {


      $().ready(function() {
        $sidebar = $('.sidebar');
        $sidebar_img_container = $sidebar.find('.sidebar-background');
        $full_page = $('.full-page');
        $sidebar_responsive = $('body > .navbar-collapse');
        window_width = $(window).width();
        fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();
        if (window_width > 767 && fixed_plugin_open == 'Dashboard') {
          if ($('.fixed-plugin .dropdown').hasClass('show-dropdown')) {
            $('.fixed-plugin .dropdown').addClass('open');
          }
        }
        $('.fixed-plugin a').click(function(event) {
          if ($(this).hasClass('switch-trigger')) {
            if (event.stopPropagation) {
              event.stopPropagation();
            } else if (window.event) {
              window.event.cancelBubble = true;
            }
          }
        });
        $('.fixed-plugin .active-color span').click(function() {
          $full_page_background = $('.full-page-background');
          $(this).siblings().removeClass('active');
          $(this).addClass('active');
          var new_color = $(this).data('color');
          if ($sidebar.length != 0) {
            $sidebar.attr('data-color', new_color);
          }
          if ($full_page.length != 0) {
            $full_page.attr('filter-color', new_color);
          }
          if ($sidebar_responsive.length != 0) {
            $sidebar_responsive.attr('data-color', new_color);
          }
        });
        $('.fixed-plugin .background-color .badge').click(function() {
          $(this).siblings().removeClass('active');
          $(this).addClass('active');
          var new_color = $(this).data('background-color');
          if ($sidebar.length != 0) {
            $sidebar.attr('data-background-color', new_color);
          }
        });
        $('.fixed-plugin .img-holder').click(function() {
          $full_page_background = $('.full-page-background');
          $(this).parent('li').siblings().removeClass('active');
          $(this).parent('li').addClass('active');
          var new_image = $(this).find("img").attr('src');
          if ($sidebar_img_container.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
            $sidebar_img_container.fadeOut('fast', function() {
              $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
              $sidebar_img_container.fadeIn('fast');
            });
          }
          if ($full_page_background.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {
            var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');
            $full_page_background.fadeOut('fast', function() {
              $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
              $full_page_background.fadeIn('fast');
            });
          }
          if ($('.switch-sidebar-image input:checked').length == 0) {
            var new_image = $('.fixed-plugin li.active .img-holder').find("img").attr('src');
            var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');
            $sidebar_img_container.css('background-image', 'url("' + new_image + '")');
            $full_page_background.css('background-image', 'url("' + new_image_full_page + '")');
          }
          if ($sidebar_responsive.length != 0) {
            $sidebar_responsive.css('background-image', 'url("' + new_image + '")');
          }
        });
        $('.switch-sidebar-image input').change(function() {
          $full_page_background = $('.full-page-background');
          $input = $(this);
          if ($input.is(':checked')) {
            if ($sidebar_img_container.length != 0) {
              $sidebar_img_container.fadeIn('fast');
              $sidebar.attr('data-image', '#');
            }

            if ($full_page_background.length != 0) {
              $full_page_background.fadeIn('fast');
              $full_page.attr('data-image', '#');
            }

            background_image = true;
          } else {
            if ($sidebar_img_container.length != 0) {
              $sidebar.removeAttr('data-image');
              $sidebar_img_container.fadeOut('fast');
            }

            if ($full_page_background.length != 0) {
              $full_page.removeAttr('data-image', '#');
              $full_page_background.fadeOut('fast');
            }

            background_image = false;
          }
        });

        $('.switch-sidebar-mini input').change(function() {
          $body = $('body');

          $input = $(this);

          if (md.misc.sidebar_mini_active == true) {
            $('body').removeClass('sidebar-mini');
            md.misc.sidebar_mini_active = false;

            $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();

          } else {

            $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar('destroy');

            setTimeout(function() {
              $('body').addClass('sidebar-mini');

              md.misc.sidebar_mini_active = true;
            }, 300);
          }

          // we simulate the window Resize so the charts will get updated in realtime.
          var simulateWindowResize = setInterval(function() {
            window.dispatchEvent(new Event('resize'));
          }, 180);

          // we stop the simulation of Window Resize after the animations are completed
          setTimeout(function() {
            clearInterval(simulateWindowResize);
          }, 1000);

        });
      });
    });
  </script>
  <script>
    $(document).ready(function() {
///////////////////////c
$.ajax({
    url : 'http://10.49.177.111:8080/rest/service/licencia',
    type : 'GET',
    crossDomain: true,
    dataType : 'json',
    success : function(json) {
      var demo2 = {
      initGoogleMaps: function() {
        var myLatlng = new google.maps.LatLng(18.9299863802915, -99.25094731970849);
        var mapOptions = {
        zoom: 13,
          center: myLatlng,
          scrollwheel: false, //we disable de scroll over the map, it is a really annoing when you scroll through page
          styles: [{
            "featureType": "water",
            "stylers": [{
              "saturation": 43
            }, {
              "lightness": -11
            }, {
              "hue": "#0088ff"
            }]
          }, {
            "featureType": "road",
            "elementType": "geometry.fill",
            "stylers": [{
              "hue": "#ff0000"
            }, {
              "saturation": -100
            }, {
              "lightness": 99
            }]
          }, {
            "featureType": "road",
            "elementType": "geometry.stroke",
            "stylers": [{
              "color": "#808080"
            }, {
              "lightness": 54
            }]
          }, {
            "featureType": "landscape.man_made",
            "elementType": "geometry.fill",
            "stylers": [{
              "color": "#ece2d9"
            }]
          }, {
            "featureType": "poi.park",
            "elementType": "geometry.fill",
            "stylers": [{
              "color": "#ccdca1"
            }]
          }, {
            "featureType": "road",
            "elementType": "labels.text.fill",
            "stylers": [{
              "color": "#767676"
            }]
          }, {
            "featureType": "road",
            "elementType": "labels.text.stroke",
            "stylers": [{
              "color": "#ffffff"
            }]
          }, {
            "featureType": "poi",
            "stylers": [{
              "visibility": "off"
            }]
          }, {
            "featureType": "landscape.natural",
            "elementType": "geometry.fill",
            "stylers": [{
              "visibility": "on"
            }, {
              "color": "#b8cb93"
            }]
          }, {
            "featureType": "poi.park",
            "stylers": [{
              "visibility": "on"
            }]
          }, {
            "featureType": "poi.sports_complex",
            "stylers": [{
              "visibility": "on"
            }]
          }, {
            "featureType": "poi.medical",
            "stylers": [{
              "visibility": "on"
            }]
          }, {
            "featureType": "poi.business",
            "stylers": [{
              "visibility": "simplified"
            }]
          }]
        };
      var map = new google.maps.Map(document.getElementById("map"), mapOptions);
      for (let i = 0; i < json.length; i++) {  
        var direccion = ''+json[i].numero+'+'+json[i].calle+',+'+json[i].colonia+'+Morelos'
        var actividad = json[i].actividadPrincipal;
        var j = i;
        $.ajax({
            url : 'https://maps.googleapis.com/maps/api/geocode/json?new_forward_geocoder=true&address='+direccion+'&key=AIzaSyCDMX-H_JeH7WDpVT-vlvsrUlx_HIZf0Uk',
            type : 'GET',
            crossDomain: true,
            dataType : 'json',
            success : function(json2,i) {
              marker = new google.maps.Marker({
                position: new google.maps.LatLng(json2.results[0].geometry.location.lat,json2.results[0].geometry.location.lng),
                map: map
              });
              var infowindow = new google.maps.InfoWindow();
              google.maps.event.addListener(marker, 'click', (function(marker, i) {
                return function() {
                  infowindow.setContent('<div><h3>La Casa del Herrero</h3><br><img src="./imgs/lugar.PNG" alt="La Casa del Herrero" style="width:300px;height:200px;"><br><span class="heading">Calificación</span><span class="fa fa-star"></span><span class="fa fa-star checked"></span><span class="fa fa-star "></span><span class="fa fa-star"></span><span class="fa fa-star"></span> <p>Calle Cipres No.325, Col.Teopanzolco, Cuernavaca, Morelos</p> <br><a onclick="openModal()">Evaluar</a> </div>');
                  infowindow.open(map, marker);
                }
              })(marker, j));
            },
            error : function(xhr, status) {
                alert('Disculpe, existió un problema');
            }
        });
      }//for
      }// fin function
    }// fin demo
   demo2.initGoogleMaps();
  },
    error : function(xhr, status) {
        alert('Disculpe, existió un problema');
    }
  });
});
  </script>

<script>
  function openModal() {


    $.ajax({
              url: 'http://10.49.177.111:8080/rest/service/tipoIrregularidad',
              crossDomain: true,
              type : 'GET',
              dataType : 'json',
            success : function(json) {
                console.log(json);
              for (let i = 0; i < json.length; i++) {  
              $("#divDocumentos").append("<div value="+json[i].idTipoIrregularidad+" class='column'>&nbsp;&nbsp;<input type='checkbox' data-toggle='toggle' data-width='100' data-height='75'><label>"+json[i].nombre+"</label></div>");

              }



          },
          error : function(xhr, status) {
              alert('Disculpe, existió un problema');
          }
      });


       $("#modalMaps").modal("show");
  }
</script>
<script type="text/javascript">
    function confirmar(){

      var comentario = $( "#comment" ).val();

      var ReporteIrregularidad = new Object();
      ReporteIrregularidad.idLicencia = 2;
      ReporteIrregularidad.idTipoIrregularidad = 2;
      ReporteIrregularidad.idUsuario = 1;

      swal({
        title: "Advertencia",
        text: "¿La información es correcta?",
        icon: "warning",
        buttons: true,
        dangerMode: false,
      })
      .then((willDelete) => {
        
        
        swal("Registro Correcto", "", "success");
        //$( "#divDocumentos" ).remove();        
        $("#divDocumentos").empty();
        $('#modalMaps').modal('hide');
        $( "#comment" ).val("");

      });


    }
</script>
</body>

</html>
