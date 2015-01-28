(ns clog.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defn index []
  "oh")

(defroutes app-routes
  (GET "/" [] (index))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
