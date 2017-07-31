(def readline (js/require "readline"))

(def rl (.createInterface readline
                             (clj->js {:input  (.-stdin  js/process)
                                       :output (.-stdout js/process)})))

(defn raw-input []
	(doto rl
      (.setPrompt ">> ")

      (.on "line"
           (fn [line]
             (case line
               "quit" (.close rl)
               ;; default
               (do
                 (println (str "You enter: " line))
                 (.prompt rl)))))
      ;; show info after enter quit
      (.on "close" (fn[]
                     (println "Exit application.")))
      ;(.prompt)
      ))