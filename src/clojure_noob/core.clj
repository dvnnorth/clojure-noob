(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))

(print "Cleanliness is next to Godliness")

(defn -cleanliness
  [& args]
  (println "Cleanliness is next to Godliness"))

(defn choochoo
  []
  (println "Choo choo!"))

(+ 1 (* 2 3) 4)

(if true
  (println "By Zeus' Hammer!") 
  (println  "By Aquaman's Trident!"))

(if false
  (println  "By Zeus' Hammer")
  (println "By Aquaman's Trident!"))

(if false
  (println "By Odin's Elbow!"))

(if true
  (do (println "Success!")
      (println "By Zeus' Hammer!"))
  (do (println "Failure!")
      (println "By Aquaman's Trident!")))

(if false
  (do (println "Success!")
      (println "By Zeus' Hammer!"))
  (do (println "Failure!")
      (println "By Aquaman's Trident!")))

(when true
  (println "This will always happen, no matter what.")
  (println "So will this."))


