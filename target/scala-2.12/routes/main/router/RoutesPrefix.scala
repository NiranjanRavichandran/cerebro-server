// @GENERATOR:play-routes-compiler
// @SOURCE:E:/GitDirectory/Java Play/trial/cerebro-server/conf/routes
// @DATE:Tue Mar 27 19:25:17 EDT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
