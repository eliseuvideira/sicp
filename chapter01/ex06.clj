#!/usr/bin/env bb

(defn new-if [predicate then-clause else-clause]
  (cond predicate then-clause
        :else else-clause))

(println (new-if (= 2 3) 0 5))

(println (new-if (= 1 1) 0 5))

; sqrt

(defn avg [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (avg guess (/ x guess)))

(defn square [x]
  (* x x))

(defn good-enough? [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn sqrt-iter [guess x]
  (new-if (good-enough? guess x)
          guess
          (sqrt-iter (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))

(println (sqrt 25)) ; StackOverflowError

; `new-if` eagearly evaluates its arguments
; `if` only evaluates matching condition
