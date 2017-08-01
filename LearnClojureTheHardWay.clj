;; https://practicalli.github.io/spacemacs/clj-refactor/

;; Exercise - 1

(println "Hello, World!")
(println "Hello Again.")
(println "I like typing this.")
(println "This is fun.")
(println "Yay! Printing.")
(println "I'd much rather you 'not'.")

;; This last case is problematic in Clojure
;(println "I /"said/" do not touch this.")


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


;; Exercise - 7



(println "Mary had a little lamb." )
(format "It's fleece was as white as %s." "snow")
(println "And everywhere that Mary went.")

(repeat 10 ".")

(def end1 "C")
(def end2 "h")
(def end3 "e")
(def end4 "e")
(def end5 "e")
(def end5 "s")
(def end6 "e")
(def end7 "B")
(def end8 "u")
(def end9 "r")
(def end10 "g")
(def end11 "e")
(def end12 "r")


(println (str end1 end2 end3 end4 end5 end6))
(println (str end7 end8 end9 end10 end11 end12))

;;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise -  8

(def formatter "%s %s %s %s")


(format formatter 1 2 3 4)

(format formatter "one" "two" "three" "four")

(format formatter true false false true)


(format formatter
        "I had this thing."
        "That you could type up right."
        "But it didn't sing."
        "So I said goodnight.")

;;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 9 / 10


(def days "Mon Tue Wed Thu Fri Sat Sun")

(def months "Jan\nFeb\nMar\nApr\nMay\nJun\nJul\nAug")



(format "Here are the days %s " days)
(format "Here are the months %s " months)


(println
"There's something going on here.
With the three double-quotes.
We'll be able to type as much as we like.
Even 4 lines if we want, or 5,or 6.")



;;;;;;;;;;;;;;;;;;;;;;;



(def tabby_cat  "\tI'm tabbed in.")
(def persian_cat  "I'm split\non a line.")
(def backslash_cat  "I'm \\ a \\ cat.")



;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 11 / 12



;; raw input in lumo is an issue as of now.

;(read )

;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 13 / 14 / 15 / 16 / 17 / 18



;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 19

(defn cheese-and-crackers
  [cheese-count boxes-of-crackers]

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
