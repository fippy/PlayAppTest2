package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your first Play application is NOW ready, ok lets go."))
  }

}