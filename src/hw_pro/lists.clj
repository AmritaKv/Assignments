(ns hw-pro.lists)

(defn check-lists
  "Checks if all elements of l1 are present in l2.
  ie l2 is superset of l1"
  [l1 l2]
  (every? (set l2) l1))

; I was not sure about the problem statement, if it means checking
; if the lists are equal, (compare l1 l2) can be used as below
;(compare (vec (sort l1)) (vec (sort l2)))
