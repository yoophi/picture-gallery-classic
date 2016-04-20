(ns picture-gallery.util
  (:require [noir.session :as session]
            [hiccup.util :refer [url-encode]])
  (:import java.io.File))

(def thumb-prefix "thumb_")
(def galleries "galleries")

(defn gallery-path []
  (str galleries File/separator (session/get :user)))

