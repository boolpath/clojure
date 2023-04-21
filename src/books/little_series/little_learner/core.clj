(ns books.little-series.little-learner.core)

;; p. 11
(def remainder
  (fn [x y]
    (cond 
      (< x y) x
      :else (remainder (- x y) y))))

;; p. 14
(def add
  (fn [n m]
    (cond
      (zero? m) n
      :else (inc (add n (dec m))))))

;; p. 26
(def line
  (fn [x]
    (fn [Θ]
      (+ (* (first Θ) x) (second Θ)))))

((line 1) [2 3]) ; => 5

(def scalar? number?)

;; p. 39
(def shape
  (fn [t]
    (cond
      (scalar? t) (list)
      :else (cons (count t) (shape (first t))))))

(shape [[5.2 6.3 8.0] [6.9 7.1 0.5]]) ; => (2 3)
(shape [[[5] [6] [8]] [[7] [9] [5]]]) ; => (2 3 1)

;; p. 42
(defn rank
  ([t]
   (rank t 0))
  ([t a]
   (cond
     (scalar? t) a
     :else (recur (first t) (inc a)))))

(rank [[[5] [6] [8]] [[7] [9] [5]]]) ; => 3

;; p. 53
(def summed
  (fn [t i a]
    (cond
      (zero? i) (+ (first t) a)
      :else (recur t (dec i) (+ (get t i) a)))))

(def sum¹
  (fn [t]
    (summed t (dec (count t)) 0.0)))

(sum¹ [10.0 12.0 14.0]) ; => 36.0

(comment
  (map + (take 10 (range)) (repeat 1)))
