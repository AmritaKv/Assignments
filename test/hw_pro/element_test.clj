(ns hw-pro.element-test
  (:require [clojure.test :refer :all]
            [hw-pro.element :refer :all]))

(deftest test-element
  (testing "Get 5th element"
    (is (= 0   (get-element (range 5))))
    (is (= 104 (get-element '(102 104 106 108 110 112))))
    (is (= nil (get-element '(99 32 44 31))))))


(run-tests)
