(ns clojure.realworld.rest-api.main
  (:require [clojure.realworld.log.interface :as log])
  (:gen-class))

(defn -main [& _args]
  (log/info "front end"))
