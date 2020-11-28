(ns kata1-clojure.core)

(def morse
  {
    ".----" "1", "..---" "2", "...--" "3", "....-" "4", "....." "5",
    ".-" "A", "-..." "B", "-.-." "C", "-.." "D", "." "E", "..-." "F",
    "--." "G", "...." "H", ".." "I", ".---" "J", "-.-" "K", ".-.." "L",
    "--" "M", "-." "N", "---" "O", ".--." "P", "--.-" "Q", ".-." "R",
    "..." "S", "-" "T", "..-" "U", "...-" "V", ".--" "W", "-..-" "X",
    "-.--" "Y", "--.." "Z"
  })

(defn morse-to-text [text]
  (clojure.string/capitalize (clojure.string/join (subvec (into [] (flatten (morse-code text))) 1))))

(defn morse-code [morse-text]
  (let [words (clojure.string/split morse-text #"/")]
    (for [word words]
      (conj (for [letter (clojure.string/split (clojure.string/trim word) #" ")]
        (get morse letter)) " "))))

(morse-to-text ". .-..")