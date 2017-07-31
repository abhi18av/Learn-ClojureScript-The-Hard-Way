;; https://practicalli.github.io/spacemacs/clj-refactor/

;; Exercise - 1

(println "Hello, World!")
(println "Hello Again.")
(println "I like typing this.")
(println "This is fun.")
(println "Yay! Printing.")
(println "I'd much rather you 'not'.")

;; This last case is problematic in Clojure
(println "I /"said/" do not touch this.")


;;;;;;;;;;;;;;;;;;;;;;;;;


;; Exercise - 2

(println "I could have code like this.") ; and the  comment after this is ignored.

(println "This will run.")


;;;;;;;;;;;;;;;;;;;;;;;;;

;
;; Exercise - 3

(println "I will; now count my chickens:")

(println "Hens" (+ 25
                   (/ 30 6)))

;; Need to find out how the remainder/modulus operator works in CLJS
;(println "Roosters" (- 100
;                       (* 25
;                          (% 3 4))))

;; Complicated expression - REDO THIS EXERCISE.
;(println (+ 3 2 
;            (- 1 5)))


;;;;;;;;;;;;;;;;;;;;;;;;;


;; Exercise - 4

(def cars 100)
(def space-in-a-car 4.0)
(def drivers 30)
(def passengers 90)
(def cars-not-driven
  (- cars drivers))
(def cars-driven drivers)
(def carpool-capacity
  (* cars-driven space-in-a-car))
(def average-passengers-per-car
  (/ passengers cars-driven))
(println "There are" cars "cars available.")
(println "There are only" drivers "drivers available.")
(println "There will be" cars-not-driven "empty cars today.")
(println "We can transport" carpool-capacity "people today.")
(println "We have" passengers "to carpool today.")
(println "We need to upt about" average-passengers-per-car "in each car.")

;;;;;;;;;;;;;;;;;;;;;;;;;


;; Exercise - 5
;; FORMATTED OUTPUT IN CLJS




;(ns foo.bar
;  (:require
;    [goog.string :as gstring]
;    [goog.string.format]))

;(.log js/console (gstring/format "%.2f" 1.2345))


;; https://nodejs.org/api/util.html#util_util_format_format_args


                                        ;(js/util.format "Hello %s" "world")

                                        ;(.log js/console "Hello %s works" ", World!")

                                        ;(.log js/console "Hello %s" ", World!")




(def my-name "Zed A. Shaw")
(def my-age 35)
(def my-height 74)
(def my-weight 180)
(def my-eyes "Blue")
(def my-teeth "White")
(def my-hair "Brown")

;; This <<format>> works like magic in Clojure.
(format "Hello %s" "World!")


(format "Let's talk about %s." my-name)
(format "He's %s inches tall." my-height)
(format "He's %d pounds heavy." my-weight)
(format "Actually that's not too heavy.")
(format "He's got %s eyes and %s hair." my-eyes my-hair)
(format "His teeth are usually %s depending on the coffee." my-teeth)



(format "If I add %d, %d and %d I get %d."
                my-age
                my-height
                my-weight
                (+ my-age my-height my-weight))

;;;;;;;;;;;;;;;;;;;;;;;;;


;; Exercise - 6

(def x (format "There are %d types of people." 10))

(def binary "binary")
(def do-not "don't")
(def y (format "Those who know %s and those who %s" binary do-not))


(println x)
(println y)


(format "I said: %j." x)
(format "I also said: %j." y)

(def hilarious false )
(def joke-evaluation "Isn't that joke so funny?! %j")

(format joke-evaluation hilarious)

(def w "This is the left side of ...")
(def e "a string with a right side.")

(println w e)


;;;;;;;;;;;;;;;;;;;;;;;;;


;; Exercise - 7 / 8 / 9 / 10 


;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 11 / 12



;; raw input in lumo is an issue as of now.

(read )

;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 13 / 14 / 15 / 16 / 17 / 18



;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 19

(defn cheese-and-crackers [cheese-count boxes-of-crackers]
(format "You have %d cheeses!" cheese-count)
(format "You have %d boxes of crackers!" boxes-of-crackers)
(format "Man that's enough for a party!")
(format "Get a blanket.\n"))

(println "We can just give the function numbers directly: ")
(cheese-and-crackers 20 30)

(println "OR, we can use variables from our script:")
(def amount-of-cheese 10)
(def amount-of-crackers 50)

(cheese-and-crackers amount-of-cheese amount-of-crackers)


(println "We can even do math inside too: ")
(cheese-and-crackers (+ 10 20) (+ 5 6))

(println "And we can combine the two, variables and math: ")

(cheese-and-crackers (+ amount-of-cheese 100) (+ amount-of-crackers 1000))



;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 20


;(require '[lumo.core :refer [*command-line-args*]])

;(println (str "Hello " (first *command-line-args*) "!"))

;(for [i (rest *command-line-args* )]
;  (println i))
