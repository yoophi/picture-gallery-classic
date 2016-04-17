(ns picture-gallery.handler
  (:require
   [compojure.route :as route]
   [compojure.core :refer [defroutes]]
   [noir.util.middleware :as noir-middleware]
;;   [ring.middleware.resource :refer [wrap-resource]]
;;   [ring.middleware.file-info :refer [wrap-file-info]]
;;   [hiccup.middleware :refer [wrap-base-url]]
;;   [compojure.handler :as handler]
   [picture-gallery.routes.home :refer [home-routes]]
   ))

(defn init []
  (println "picture-gallery is starting"))

(defn destroy []
  (println "picture-gallery is shutting down"))

(defroutes app-routes
  (route/resources "/")
  (route/not-found "Not Found"))

(def app (noir-middleware/app-handler [home-routes app-routes]))
