(defproject v "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.7.0"]
  		 [uncomplicate/clojurecl "0.1.2"]]
  :main ^:skip-aot v.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
