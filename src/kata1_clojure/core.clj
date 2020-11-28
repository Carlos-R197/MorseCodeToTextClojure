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
  (clojure.string/join (into [] (morse-code text))))

(defn morse-code [morse-word]
  (for [letter (clojure.string/split morse-word #" ")]
    (get morse letter)))

(morse-to-text ". .-..")