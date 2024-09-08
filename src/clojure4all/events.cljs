(ns clojure4all.events
  (:require
   [re-frame.core :as re-frame]
   [clojure4all.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
