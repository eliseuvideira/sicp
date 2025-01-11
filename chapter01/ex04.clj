#!/usr/bin/env bb

(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))
; when b is greater than zero, a + b
; when b is lower than of equal to 0, a - b
