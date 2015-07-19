(ns v.core
  (:require
   [clojure.pprint :refer [pprint]]
   [uncomplicate.clojurecl.core :as core]
   [uncomplicate.clojurecl.info :as info])
  (:gen-class :main true))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (pprint (map info/info (core/devices (first (core/platforms))) )) ) 
