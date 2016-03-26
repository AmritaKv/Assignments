(ns hw-pro.element)


(defn get-element
  "Get fifth element from end of list l1"
  [l1]
  (let [l2 (drop-last 4 l1)]
    (if (empty? l2) nil (last l2))))