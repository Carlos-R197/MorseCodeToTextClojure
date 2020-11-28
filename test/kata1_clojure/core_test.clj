(ns kata1-clojure.core-test
  (:require [clojure.test :refer :all]
            [kata1-clojure.core :refer :all]))

(deftest morse-to-text-test
  (testing "morse letter to plain text"
    (is (= "E" (morse-to-text "."))))
  (testing "morse word to plain text"
    (is (= "Hello" (morse-to-text ".... . .-.. .-.. ---"))))
  (testing "morse sentence to plain text"
    (is (= "Hello world" (morse-to-text ".... . .-.. .-.. --- /  .-- --- .-. .-.. -.."))))
  (testing "morse text to plain text"
    (is (= "Hello my name is carlos roque and i study in intec" 
      (morse-to-text ".... . .-.. .-.. --- / -- -.-- / -. .- -- . / .. ... / -.-. .- .-. .-.. --- ... / .-. --- --.- ..- . / .- -. -.. / .. / ... - ..- -.. -.-- / .. -. / .. -. - . -.-."))))
)

(run-tests)
