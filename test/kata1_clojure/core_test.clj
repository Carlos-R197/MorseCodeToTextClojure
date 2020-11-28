(ns kata1-clojure.core-test
  (:require [clojure.test :refer :all]
            [kata1-clojure.core :refer :all]))

(deftest morse-to-text-test
  (testing "morse letter to plain text"
    (is (= "E" (morse-to-text "."))))
  (testing "morse word to plain text"
    (is (= "HELLO" (morse-to-text ".... . .-.. .-.. ---"))))
)

(run-tests)
