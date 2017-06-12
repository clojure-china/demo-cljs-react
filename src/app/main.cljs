
(ns app.main
  (:require ["react" :as React]
            ["react-dom" :as ReactDOM]
            ["create-react-class" :as create-class]))

(def mount-point (.querySelector js/document "#app"))

(def container
  (create-class
    #js {:displayName "container"
         :render
           (fn []
            (.createElement React "div" nil
              (.createElement React "span" nil "Text 2")))}))

(defn render! []
  (.render ReactDOM (.createElement React container #js {}) mount-point))

(defn main []
  (render!)
  (println "App loaded."))

(defn reload []
  (render!)
  (println "App reloaded."))
