$ ->
  $.get "/events", (events) ->
    $.each events, (index, event) ->
      $("#events").append $("<li>").text event.title
      $("#events").append $("<li>").text event.id
      
$ ->      
  $.get "/qrCodes", (qrCodes) ->
    $.each qrCodes, (index, qrCode) ->
      $("#qrCodes").append $("<li>").text qrCode.content    
      