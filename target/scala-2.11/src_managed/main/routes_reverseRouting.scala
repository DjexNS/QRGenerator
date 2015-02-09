// @SOURCE:/home/djex/Downloads/play-java1/conf/routes
// @HASH:942ebe9da12c2eec463830b0de67600501c8759c
// @DATE:Mon Feb 09 12:46:31 CET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:20
class ReverseAssets {


// @LINE:20
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseCodeController {


// @LINE:16
def download(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "download/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:15
def qrCode(id:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "qrCode/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
}
                        

// @LINE:13
def qrCodes(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "qrCodes")
}
                        

// @LINE:14
def qrCodeIds(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "qrCodeIds")
}
                        

// @LINE:17
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:10
def addEvent(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "event")
}
                        

// @LINE:7
def addPerson(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "person")
}
                        

// @LINE:8
def getPersons(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "persons")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:11
def getEvents(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "events")
}
                        

}
                          
}
                  


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:20
class ReverseAssets {


// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseCodeController {


// @LINE:16
def download : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CodeController.download",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "download/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:15
def qrCode : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CodeController.qrCode",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "qrCode/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
      }
   """
)
                        

// @LINE:13
def qrCodes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CodeController.qrCodes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "qrCodes"})
      }
   """
)
                        

// @LINE:14
def qrCodeIds : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CodeController.qrCodeIds",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "qrCodeIds"})
      }
   """
)
                        

// @LINE:17
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CodeController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:10
def addEvent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addEvent",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "event"})
      }
   """
)
                        

// @LINE:7
def addPerson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addPerson",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
      }
   """
)
                        

// @LINE:8
def getPersons : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getPersons",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:11
def getEvents : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getEvents",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events"})
      }
   """
)
                        

}
              
}
        


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:20
class ReverseAssets {


// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseCodeController {


// @LINE:16
def download(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CodeController.download(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "download", Seq(classOf[String]), "GET", """""", _prefix + """download/$id<[^/]+>""")
)
                      

// @LINE:15
def qrCode(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CodeController.qrCode(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "qrCode", Seq(classOf[String]), "GET", """""", _prefix + """qrCode/$id<[^/]+>""")
)
                      

// @LINE:13
def qrCodes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CodeController.qrCodes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "qrCodes", Seq(), "GET", """""", _prefix + """qrCodes""")
)
                      

// @LINE:14
def qrCodeIds(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CodeController.qrCodeIds(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "qrCodeIds", Seq(), "GET", """""", _prefix + """qrCodeIds""")
)
                      

// @LINE:17
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CodeController.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

}
                          

// @LINE:11
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:10
def addEvent(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addEvent(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addEvent", Seq(), "POST", """""", _prefix + """event""")
)
                      

// @LINE:7
def addPerson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addPerson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addPerson", Seq(), "POST", """""", _prefix + """person""")
)
                      

// @LINE:8
def getPersons(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getPersons(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getPersons", Seq(), "GET", """""", _prefix + """persons""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def getEvents(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getEvents(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getEvents", Seq(), "GET", """""", _prefix + """events""")
)
                      

}
                          
}
        
    