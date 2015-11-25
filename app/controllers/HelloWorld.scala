package controllers

import play.Play
import play.api.libs.iteratee.Enumerator
import play.api.mvc._
import play.api.mvc.Results

object HelloWorld extends Controller {

  def index(name: String, age: Int) = Action {
    Ok(views.html.hello.render(name, age))
  }

}