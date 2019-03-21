(ns leap-years.is-leap-test
  (:require [clojure.test :refer :all]
            [leap-years.is-leap :refer :all]))

(deftest is-not-leap-when-not-divisible-by-4
  (is (not (is-leap? 2001))))

(deftest is-leap-when-divisible-by-4
  (is (is-leap? 2004)))

(deftest is-not-leap-when-divisible-by-100
  (is (not (is-leap? 1900))))

(deftest is-leap-when-divisible-by-400
  (is (is-leap? 2000)))

(deftest returns-nil-when-before-1583
  (is (nil? (is-leap? 1500))))

(deftest converts-to-int-when-float
  (is (is-leap? 2004.0)))

(deftest converts-to-int-when-string
  (is (is-leap? "2004")))
