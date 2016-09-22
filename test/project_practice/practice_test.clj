(ns project-practice.practice-test
  (:require [clojure.test :refer :all]
            [project-practice.practice :refer :all]))

; (deftest a-test
;   (testing "FIXME, I fail."
;     (is (= 0 1))))

(deftest another-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest function-test
  (testing "trying our CSK function-test"
    (is (= "testing_this_thing_out"
           (test-function "testing this thing out")))))
