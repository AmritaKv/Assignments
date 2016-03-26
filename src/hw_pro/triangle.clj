(ns hw-pro.triangle)


(defn- valid? [s1 s2 s3]
  (and (> (+ s1 s2) s3)
       (> (+ s2 s3) s1)
       (> (+ s1 s3) s2)))

(defn- isosceles? [s1 s2 s3]
  (or (= s1 s2)
      (= s2 s3)
      (= s1 s3)))


(defn triangle-type [s1 s2 s3]
  "Find triangle type"
  (cond
    (= s1 s2 s3) :equilateral
    (not (valid? s1 s2 s3)) :not-a-triangle
    (isosceles? s1 s2 s3)  :isosceles
    :else :scalene))
