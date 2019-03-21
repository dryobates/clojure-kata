(ns leap-years.is-leap
  (:gen-class))

(defn- divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn- convert-to-int [value]
  (cond
    (instance? String value) (Integer/parseInt value)
    :else value
    ))

(defn is-leap? [year]
  (let [year (convert-to-int year)]
    (cond
      (< year 1583) nil
      (divisible-by? 400 year) true
      (divisible-by? 100 year) false
      (divisible-by? 4 year) true
      :else false)))
