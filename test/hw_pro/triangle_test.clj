(ns hw-pro.triangle-test
  (:require [clojure.test :refer :all]
            [hw-pro.triangle :refer :all]))

(deftest test-triangle
  (testing "Triangle type"
    (is (= :equilateral  (triangle-type 5 5 5)))
    (is (= :equilateral  (triangle-type 11 11 11)))
    (is (= :isosceles    (triangle-type 4 6 4)))
    (is (= :isosceles    (triangle-type 7 7 3)))
    (is (= :scalene      (triangle-type 17 18 19)))
    (is (= :scalene      (triangle-type 2 3 4)))
    (is (= :not-a-triangle (triangle-type 2 2 50)))
    (is (= :not-a-triangle (triangle-type 0 1 11)))))


(run-tests)

