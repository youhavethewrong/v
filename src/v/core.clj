(ns v.core
  (:require [uncomplicate.clojurecl.core :as core]
            [uncomplicate.clojurecl.info :as info])
  (:gen-class :main true))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (info/info (core/platforms)))
  (println (info/info (core/devices (first (core/platforms))))))
