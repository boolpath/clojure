(ns libraries.hiccup.interpreter)
;; credit: Eric Normand
;; https://github.com/lispcast/domain-specific-languages-in-clojure

(defn eval-vector [hiccup]
  (let [[tag] hiccup]
    (str "<" (name tag) "/>")))

(defn eval-hiccup [hiccup]
  (cond
    (vector? hiccup) (eval-vector hiccup)
    :else (str hiccup)))

(comment 
  (eval-hiccup [:div]))
