package controllers

import javax.inject._
import models._
import play.api._
import play.api.mvc._
import play.api.Play.current

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's ranking pages.
 */
@Singleton
class RankingController @Inject() extends HomeController {

    def ranking(sid: String) = Action {
        Ok(views.html.ranking(sid, getContestName, getContestDescription, getContestUrl, getFirebaseappContest))
    }

    def rankingpuzzle(sid: String) = Action {
        Ok(views.html.rankingpuzzle(sid, getContestName, getContestDescription, getContestUrl, getFirebaseappContest))
    }

}