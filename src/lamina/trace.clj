;;   Copyright (c) Zachary Tellman. All rights reserved.
;;   The use and distribution terms for this software are covered by the
;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;   which can be found in the file epl-v10.html at the root of this distribution.
;;   By using this software in any fashion, you are agreeing to be bound by
;;   the terms of this license.
;;   You must not remove this notice, or any other, from this software.

(ns lamina.trace
  (:use [potemkin])
  (:require
    [lamina.trace.instrument :as i]
    [lamina.trace.pipeline :as p]
    [lamina.trace.timer :as t]
    [lamina.trace.utils :as u]))

(import-fn i/instrument)
(import-macro i/defn-instrumented)

(import-fn t/format-timing)

(import-macro u/time*)
(import-macro u/trace-pipelines)
