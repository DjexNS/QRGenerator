
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to QR Generator")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
	"""),format.raw/*4.2*/("""<script type='text/javascript' src='"""),_display_(/*4.39*/routes/*4.45*/.Assets.at("javascripts/index.js")),format.raw/*4.79*/("""'></script>

	<ul id="events"></ul>

	<form method="POST" action=""""),_display_(/*8.31*/routes/*8.37*/.Application.addEvent()),format.raw/*8.60*/("""">
		Title: <input type="text" name="title"/>
		<br/>
		Description: <input type="text" name="description"/>
		<br/>
		Start date: <input type="datetime-local" name="startDate">
		Duration: <input type="text" name="duration"/>
		<br/>
		
	<!--		Recurrence: <select name="recurrenceType1">
			<option value="oneTimeEvent">One time event</option>
			<option value="daily">Daily</option>
			<option value="weekly">Weekly</option>
			<option value="monthly">Monthly</option>
		</select>
		Count: <input type="text" name="recurrenceCount1"/> -->
	
		<br/>
		<button>Add Event</button>
	</form>
	
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 09 12:46:33 CET 2015
                  SOURCE: /home/djex/Downloads/play-java1/app/views/index.scala.html
                  HASH: 6637f02105dd92d65d051ae6e323d763a47e25e5
                  MATRIX: 716->1|805->3|833->6|872->37|911->39|939->41|1002->78|1016->84|1070->118|1163->185|1177->191|1220->214
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|32->4|36->8|36->8|36->8
                  -- GENERATED --
              */
          