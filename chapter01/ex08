#!/usr/bin/env bb

(defn square [x]
  (* x x))

(defn improve [guess x]
  (/ (+ (/ x (square guess)) (* 2 guess)) 3))

(defn cube [x]
  (* x x x))

(defn good-enough? [guess x]
  (< (abs (- (cube guess) x)) 0.001))

(defn cube-root-iter [guess x]
  (if (good-enough? guess x)
    guess
    (cube-root-iter (improve guess x) x)))

(defn cube-root [x]
  (cube-root-iter 1.0 x))

(def numbers (map #(Integer/parseInt %) *command-line-args*))

(println (cube-root 27))
(run! #(println (cube-root %)) numbers)
