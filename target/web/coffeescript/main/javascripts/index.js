(function() {
  $(function() {
    return $.get("/events", function(events) {
      return $.each(events, function(index, event) {
        $("#events").append($("<li>").text(event.title));
        return $("#events").append($("<li>").text(event.id));
      });
    });
  });

  $(function() {
    return $.get("/qrCodes", function(qrCodes) {
      return $.each(qrCodes, function(index, qrCode) {
        return $("#qrCodes").append($("<li>").text(qrCode.content));
      });
    });
  });

}).call(this);

//# sourceMappingURL=index.js.map
