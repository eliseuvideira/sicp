#!/usr/bin/env bb

(defn p [] (p)) ; infinite recursion

(defn check [x y]
  (if (= x 0) 0 y))

(check 0 (p))
