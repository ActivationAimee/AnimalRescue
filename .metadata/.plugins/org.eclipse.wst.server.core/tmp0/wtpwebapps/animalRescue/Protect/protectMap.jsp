<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title>Marker Clustering</title>
    	<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/jquery.bxslider.css" rel="stylesheet">
		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
		<script src="${pageContext.request.contextPath}/js/script.js"></script>
    <style>
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
      .maplast{padding:40px; width: 1000px; height:800px;
      		border-right: 1px solid #ddd;border-left: 1px solid #ddd; 
			border-bottom:1px solid #ddd; border-top:2px solid #39f; 
      }
     
	.lo{
		text-align:center;
		margin:3px;
		}
		
    </style>
  </head>
  <body>
  <div class="maplast">
    <div id="map"></div>
    <script>
    	var locations = new Array();
		
	    <c:forEach var="sibal" items="${list}">
	    locations.push({lat: ${sibal.maplat}, lng: ${sibal.maplng}});
	   	</c:forEach>
	    
      function initMap() {

        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 6,
          center: {lat: 36.339392, lng: 139.086522}
        });

     
        var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

        var markers = locations.map(function(location, i) {
          return new google.maps.Marker({
            position: location,
            label: labels[i % labels.length]
          });
        });

        var markerCluster = new MarkerClusterer(map, markers,
            {imagePath: 'https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/m'});
      }
      
  		
    </script>
    <script src="https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/markerclusterer.js">
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDNZUkhrTwy99uOuSx7PiA3DbaaT6pwt7w&callback=initMap">
    </script>
    
    			<div class="lo">
					<input type="button" value="戻る" class="btn_ok" onclick ="location.href='/animalRescue/protectList.anires?page=1'"/>
				
				</div>
    </div>
  </body>
</html>