(ns hello-world.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn kuadrat [x] (* x x))
(defn pangkat-tiga [x] (* x x x))

(comment
  (kuadrat 2)
  (println "say" " hello"))

(comment
  (use 'hello-world.core :reload)
  (+ 4 5)
  (str "opo" " sih?")
  (kuadrat 8)
  (pangkat-tiga 3))

(comment 
  (kuadrat (+ 3 (/ 6 3))))