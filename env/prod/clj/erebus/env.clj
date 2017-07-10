(ns erebus.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[erebus started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[erebus has shut down successfully]=-"))
   :middleware identity})
