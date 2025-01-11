#!/usr/bin/env clojure -M

(defn square [x]
  (* x x))

(defn f [x y z]
  (if (> x y)
    (if (> y z)
      (+ (square x) (square y))
      (f x z y))
    (f y x z)))

(defn -main [& args]
  (if (= (count args) 3)
    (let [x (Double/parseDouble (nth args 0))
          y (Double/parseDouble (nth args 1))
          z (Double/parseDouble (nth args 2))]
      (println (f x y z)))
    ()))

(apply -main *command-line-args*)
