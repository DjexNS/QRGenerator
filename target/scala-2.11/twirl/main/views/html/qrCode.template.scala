
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object qrCode extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to QRCode")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
	"""),format.raw/*4.2*/("""<script type='text/javascript' src='"""),_display_(/*4.39*/routes/*4.45*/.Assets.at("javascripts/index.js")),format.raw/*4.79*/("""'></script>

 <!-- <img src="/public/images/favicon.gif" alt="HTML5 Icon" style="width:128px;height:128px"> -->
	<img id="qrCodes"></img>
	
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 09 23:14:50 CET 2015
                  SOURCE: /home/djex/Public/QRGenerator/app/views/qrCode.scala.html
                  HASH: 58ce3e7f348a5bac92c6191159031cb2e2a81627
                  MATRIX: 717->1|806->3|834->6|867->31|906->33|934->35|997->72|1011->78|1065->112
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|32->4
                  -- GENERATED --
              */
          