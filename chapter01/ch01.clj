#!/usr/bin/env clojure -M

486
(+ 137 349)
(- 1000 334)
(* 5 99)
(/ 10 5)
(+ 2.7 10)

(+ 21 35 12 7)
(* 25 4 12)

(+ (* 3 5) (- 10 6))

(* (+ 2 (* 4 6))
   (+ 3 5 7))

(defn square [x] (* x x))

(square 21)
(square (+ 2 5))
(square (square 3))

(def x 1)
(def y 2)
(+ (square x) (square y))

(defn sum-of-squares [x y]
  (+ (square x) (square y)))
(sum-of-squares 3 4)

(defn f [a]
  (sum-of-squares (+ a 1) (* a 2)))
(f 5)

(defn abs [x]
  (cond
    (> x 0) x
    (= x 0) 0
    (< x 0) (- x)))

(defn abs_2 [x]
  (if (< x 0)
    (- x)
    x))

(abs -10)
(abs_2 -10)

(defn >= [x y]
  (not (< x y)))

(>= 10 20)
(>= 20 10)
