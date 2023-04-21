(ns books.little-series.little-learner.core)

(def remainder
  (fn [x y]
    (cond 
      (< x y) x
      :else (remainder (- x y) y))))

(def add
  (fn [n m]
    (cond
      (zero? m) n
      :else (inc (add n (dec m))))))

(def line
  (fn [x]
    (fn [Θ]
      (+ (* (first Θ) x) (second Θ)))))

;; ((line 1) [2 3])

(def scalar? number?)

(def shape
  (fn [t]
    (cond
      (scalar? t) (list)
      :else (cons (count t) (shape (first t))))))

(shape [[5.2 6.3 8.0] [6.9 7.1 0.5]]) ; => (2 3)
(shape [[[5] [6] [8]] [[7] [9] [5]]]) ; => (2 3 1)

(defn rank
  ([t]
   (rank t 0))
  ([t a]
   (cond
     (scalar? t) a
     :else (recur (first t) (inc a)))))

(rank [[[5] [6] [8]] [[7] [9] [5]]])
