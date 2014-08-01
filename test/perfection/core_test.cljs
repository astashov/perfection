(ns perfection.core-test
  (:require-macros [cemerick.cljs.test :refer (is deftest)])
  (:require [cemerick.cljs.test :as test]
            [perfection.core :as pn]))

(deftest ex1
  (is (= (pn/add 1 2) 3)))
