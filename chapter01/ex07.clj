#!/usr/bin/env bb

(defn avg [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (avg guess (/ x guess)))

(defn square [x]
  (* x x))

(defn good-enough? [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))

(println (sqrt 0.0001)) ; 0.0323...
(println (sqrt 153209363461729))

(defn good-enough-2? [guess x]
  (< (abs (- (square guess) x)) (/ guess 1000000000)))

(defn sqrt-iter-2 [guess x]
  (if (good-enough-2? guess x)
    guess
    (sqrt-iter-2 (improve guess x) x)))

(defn sqrt-2 [x]
  (sqrt-iter-2 1.0 x))

(println (sqrt-2 0.0001)) ; 0.010000000025490743
(println (sqrt-2 153209363461729))
