(ns user
  (:require [mount.core :as mount]
            erebus.core))

(defn start []
  (mount/start-without #'erebus.core/repl-server))

(defn stop []
  (mount/stop-except #'erebus.core/repl-server))

(defn restart []
  (stop)
  (start))


