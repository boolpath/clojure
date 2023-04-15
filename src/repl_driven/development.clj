(ns repl-driven.development
  "clojure -Tnew scratch :name repl-driven :scratch repl-driven/development")

(defn testable-function [& args])

(defn exec
  "clojure -X repl-driven.development/exec"
  [opts]
  (println "exec with" opts))

(defn -main
  "clojure -M -m repl-driven.development"
  [& args]
  (println "-main with" args))
