
(ns demo.server-render)

(def React (js/require "react"))
(def ReactDOM (js/require "react-dom/server"))
(def create-class (js/require "create-react-class"))

(def comp-demo
  (create-class
    #js {:displayName "demo"
         :render (fn []
                    (.createElement React "div" nil))}))

(println "This is only a demo.")
(println
  (.renderToString ReactDOM (.createElement React comp-demo nil)))
