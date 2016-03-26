(ns hw-pro.lists-test
  (:require [clojure.test :refer :all]
            [hw-pro.lists :refer :all]))

(deftest test-list
  (testing "list with same elements"
    (are [l1 l2] (= true (check-lists l1 l2))
                 '(1 2 3) '(2 1 3)
                 '(11 20 56 46 70) '(70 11 56 20 46 88 3 7 5)
                  (range 5) (range 10))
    (are [l1 l2] (= false (check-lists l1 l2))
                 '(1 2 4) '(2)
                 '(67 67 89 16) '(88 16 67 67)
                 '(23 98 22 172) '())))


(run-tests)
