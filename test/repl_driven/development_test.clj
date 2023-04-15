(ns repl-driven.development-test
  (:require [clojure.test :refer :all]
            [repl-driven.development :refer [testable-function]]))

(deftest test-name
  (testing "testable function"
    (is (fn? testable-function))))