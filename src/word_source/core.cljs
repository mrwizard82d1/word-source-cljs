(ns word-source.core
  (:require [cljs.nodejs :as nodejs])
  (:use [clojure.string :only [split, split-lines]])
  )

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(def fs (js/require "fs"))

(def sprintf (js/require "sprintf-js"))

(nodejs/enable-util-print!)

(defn -main [& args]
  (println "Hello world!"))

(set! *main-cli-fn* -main)
