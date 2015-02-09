// @SOURCE:/home/djex/Downloads/play-java1/conf/routes
// @HASH:942ebe9da12c2eec463830b0de67600501c8759c
// @DATE:Mon Feb 09 12:46:31 CET 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_addPerson1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("person"))))
private[this] lazy val controllers_Application_addPerson1_invoker = createInvoker(
controllers.Application.addPerson(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addPerson", Nil,"POST", """""", Routes.prefix + """person"""))
        

// @LINE:8
private[this] lazy val controllers_Application_getPersons2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("persons"))))
private[this] lazy val controllers_Application_getPersons2_invoker = createInvoker(
controllers.Application.getPersons,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getPersons", Nil,"GET", """""", Routes.prefix + """persons"""))
        

// @LINE:10
private[this] lazy val controllers_Application_addEvent3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("event"))))
private[this] lazy val controllers_Application_addEvent3_invoker = createInvoker(
controllers.Application.addEvent(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addEvent", Nil,"POST", """""", Routes.prefix + """event"""))
        

// @LINE:11
private[this] lazy val controllers_Application_getEvents4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events"))))
private[this] lazy val controllers_Application_getEvents4_invoker = createInvoker(
controllers.Application.getEvents,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getEvents", Nil,"GET", """""", Routes.prefix + """events"""))
        

// @LINE:13
private[this] lazy val controllers_CodeController_qrCodes5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("qrCodes"))))
private[this] lazy val controllers_CodeController_qrCodes5_invoker = createInvoker(
controllers.CodeController.qrCodes(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "qrCodes", Nil,"GET", """""", Routes.prefix + """qrCodes"""))
        

// @LINE:14
private[this] lazy val controllers_CodeController_qrCodeIds6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("qrCodeIds"))))
private[this] lazy val controllers_CodeController_qrCodeIds6_invoker = createInvoker(
controllers.CodeController.qrCodeIds(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "qrCodeIds", Nil,"GET", """""", Routes.prefix + """qrCodeIds"""))
        

// @LINE:15
private[this] lazy val controllers_CodeController_qrCode7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("qrCode/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CodeController_qrCode7_invoker = createInvoker(
controllers.CodeController.qrCode(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "qrCode", Seq(classOf[String]),"GET", """""", Routes.prefix + """qrCode/$id<[^/]+>"""))
        

// @LINE:16
private[this] lazy val controllers_CodeController_download8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("download/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_CodeController_download8_invoker = createInvoker(
controllers.CodeController.download(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "download", Seq(classOf[String]),"GET", """""", Routes.prefix + """download/$id<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_CodeController_index9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_CodeController_index9_invoker = createInvoker(
controllers.CodeController.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.CodeController", "index", Nil,"GET", """""", Routes.prefix + """"""))
        

// @LINE:20
private[this] lazy val controllers_Assets_at10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at10_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """person""","""controllers.Application.addPerson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """persons""","""controllers.Application.getPersons"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """event""","""controllers.Application.addEvent()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events""","""controllers.Application.getEvents"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """qrCodes""","""controllers.CodeController.qrCodes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """qrCodeIds""","""controllers.CodeController.qrCodeIds()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """qrCode/$id<[^/]+>""","""controllers.CodeController.qrCode(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """download/$id<[^/]+>""","""controllers.CodeController.download(id:String)"""),("""GET""", prefix,"""controllers.CodeController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_addPerson1_route(params) => {
   call { 
        controllers_Application_addPerson1_invoker.call(controllers.Application.addPerson())
   }
}
        

// @LINE:8
case controllers_Application_getPersons2_route(params) => {
   call { 
        controllers_Application_getPersons2_invoker.call(controllers.Application.getPersons)
   }
}
        

// @LINE:10
case controllers_Application_addEvent3_route(params) => {
   call { 
        controllers_Application_addEvent3_invoker.call(controllers.Application.addEvent())
   }
}
        

// @LINE:11
case controllers_Application_getEvents4_route(params) => {
   call { 
        controllers_Application_getEvents4_invoker.call(controllers.Application.getEvents)
   }
}
        

// @LINE:13
case controllers_CodeController_qrCodes5_route(params) => {
   call { 
        controllers_CodeController_qrCodes5_invoker.call(controllers.CodeController.qrCodes())
   }
}
        

// @LINE:14
case controllers_CodeController_qrCodeIds6_route(params) => {
   call { 
        controllers_CodeController_qrCodeIds6_invoker.call(controllers.CodeController.qrCodeIds())
   }
}
        

// @LINE:15
case controllers_CodeController_qrCode7_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_CodeController_qrCode7_invoker.call(controllers.CodeController.qrCode(id))
   }
}
        

// @LINE:16
case controllers_CodeController_download8_route(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        controllers_CodeController_download8_invoker.call(controllers.CodeController.download(id))
   }
}
        

// @LINE:17
case controllers_CodeController_index9_route(params) => {
   call { 
        controllers_CodeController_index9_invoker.call(controllers.CodeController.index())
   }
}
        

// @LINE:20
case controllers_Assets_at10_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at10_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     