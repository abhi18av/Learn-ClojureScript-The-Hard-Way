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


;; Exercise - 3

(println "I will; now count my chickens:")

(println "Hens" (+ 25
                  (def age (read ))


(println "How tall are you?")
(def height (read ))


(println "How much do you weigh?")
(def weight (read ))

(format "So you are %s old, %s tall and %s heavy." age height weight)

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

;; Exercise - 9


(def days "Mon Tue Wed Thu Fri Sat Sun")

(def months "Jan\nFeb\nMar\nApr\nMay\nJun\nJul\nAug")



(format "Here are the days %s " days)
(format "Here are the months %s " months)


(println
"There's something going on here.
With the three double-quotes.
We'll be able to type as much as we like.
Even 4 lines if we want, or 5,or 6.")




;;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 10



(def tabby_cat  "\tI'm tabbed in.")
(def persian_cat  "I'm split\non a line.")
(def backslash_cat  "I'm \\ a \\ cat.")

(def fat_cat
"I'll do a list:
\t* Cat food
\t* Fishies
\t* Catnip\n\t* Grass ")



(println tabby_cat)
(println persian_cat)
(println backslash_cat)
(println fat_cat)

;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 11


(println "How old are you?")
(def age (read ))


(println "How tall are you?")
(def height (read ))


(println "How much do you weigh?")
(def weight (read ))

(format "So you are %s old, %s tall and %s heavy." age height weight)

;;;;;;;;;;;;;;;;;;;;;;;;
;; Exercise - 12



;; Need to test this one out thoroughly! - This will make the 
(doseq [arg *command-line-args*]
  (printf "arg='%s'\n" arg))

;; raw input in lumo is an issue as of now.

;(read )

;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 13


;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 14




;;;;;;;;;;;;;;;;;;;;;;;;
;; Exercise - 15 / 16 / 17 /






;; Exercise - 18

;; Complete this one
(defn print-two [& args])

(defn print-two-again [arg1 arg2]
  (println (format "arg1 : %s \narg2 : %s" arg1 arg2)))

(defn print-one [arg1]
  (println (format "arg1: %s" arg1)))

(defn print-none []
  (println "I got nothin'!"))

(print-two "Zed" "Shaw")

(print-two-again "Zed" "Shaw")

(print-one "First!")


(print-none)



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




;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 21



(defn add [arg1 arg2]
  (println (format "Addition %s + %s " arg1 arg2))
  (+ arg1 arg2))


(defn subtract [arg1 arg2]
  (println (format "Subtract %s - %s" arg1 arg2))
  (- arg1 arg2))


(defn multiply [arg1 arg2]
  (println (format "Multiply %s * %s" arg1 arg2))
  (* arg1 arg2))


(defn divide [arg1 arg2]
  (println (format "Divide %s / %s " arg1 arg2))
  (/ arg1 arg2))


(println "Let's do some maths with just functions!")


(def age (add 30 5))
(def height (subtract 78 4))
(def weight (multiply 90 2))
(def iq (divide 100 2))

(println (format "Age : %s Height : %s Weight : %s IQ : %s" age height weight iq ))



;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 22 / 23 / 24



;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 24


(println "Let's practice everything.")
;(println "You\'d need to know \'bout escapes with \\ that do \n newlines and \t tabs.")

(def  poem  "
 \tThe lovely world
 with logic so firmly planted
 cannot discern \n the needs of love
 nor comprehend passion from intuition
 and requires an explanation
 \n\t\twhere there is none. " )

(println "--------------")
(println poem)
(println "--------------")



(def five
  ( + (- 10 2 ) (- 3 6)))


;; Understand the highly stateful secret-formatter function on page 101
(defn secret-formula [started]
  (let [jelly-beans (* 500 started)
    (jelly-beans)]))



;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 25


(require '[clojure.string :as clojure.string])


(defn break-words [stuff]
  (clojure.string/split stuff #" "))

(defn sort-words [words]
  (sort words))

(defn print-first-word [words]
  (println (first words)))

(defn print-last-word [words]
  (println (last words)))

(defn sort-sentence [sentence]
  (->
   sentence
   break-words
   sort-words))


(defn print-first-and-last [sentence]
  (-> sentence
      print-first-word
      print-last-word))


(defn print-first-and-last-sorted [sentence]
  (-> sentence
      sort-sentence
      print-first-word
      print-last-word))

;; Actual Program


(def sentence "All good things come to those who wait.")

(def words (break-words sentence))

(def sorted-words (sort-words words))

(print-first-word words)

(print-last-word words)



(print-first-word sorted-words)

(print-last-word sorted-words)

(print-first-and-last sentence)

(print-first-and-last-sorted sentence)


;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 28

(and true true)

(and false true)

(and (= 1 1) (= 2 1))



;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 29


(def people 20)
(def cats 30)
(def dogs 15)



(if (< people cats)
  (println "Too many cats! The world is doomed!"))

(if (> people cats)
  (println "Not many cats! The world is saved!"))

(if (< people dogs)
  (println "The world is drooled on!"))

(if (> people cats)
  (println "The world is dry!"))


(def dogs (+ 5 dogs))


(if (>= people dogs)
  (println "People are greater than or equal to dogs."))

(if (<= people dogs)
  (println "People are less than or equal to dogs."))

(if (= people dogs)
  (println "People are dogs."))





;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 30


(def people 30)
(def cars 40)
(def buses 15)


(cond
(> cars people)  (println "We should take the cars.")
(< cars people) (println "We should not take the cars.")
:else (println "We can't decide."))

(cond
(> buses cars) (print "That's too many buses.")
(< buses cars) (print "Maybe we could take the buses.")
:else (print "We still can't decide."))

(if (> people buses)
(print "Alright, let's just take the buses.")
(print "Fine, let's stay home then."))


;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 31



;;;;;;;;;;;;;;;;;;;;;;;;

;; Exercise - 32


(def the-count [1 2 3 4 5])
(def fruits ['apples' 'oranges' 'pears' 'apricots'])
(def change [1 'pennies' 2 'dimes' 3 'quarters'])


(for [number the-count]
  (println (format "this is count %s " number)))


(for [fruit fruits]
  (println (format "this is count %s " fruit)))


(for [i change]
  (println (format "this is count %s " i)))

(def elements [])

(for [i (range 6)]
  (do
  (println (format "Adding %s to list." i))
  (into elements i)))

(println elements)
