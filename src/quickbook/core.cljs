(ns quickbook.core
  )

(enable-console-print!)

(println "------asdfasds")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "My Hello world!"}))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
