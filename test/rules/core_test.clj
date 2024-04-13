(ns rules.core-test
  (:require [clojure.test :refer :all]
            [rules.core :as rules]))

(deftest process-test
  (testing "process"
    (is (= (rules/process [0 0 0 1 0 0 0] 1)
           [[0 0 0 1 0 0 0]
            [0 0 1 1 1 0 0]]))))