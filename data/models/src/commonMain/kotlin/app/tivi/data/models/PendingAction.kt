// Copyright 2018, Google LLC, Christopher Banes and the Tivi project contributors
// SPDX-License-Identifier: Apache-2.0

package app.tivi.data.models

enum class PendingAction(val value: String) {
  NOTHING("nothing"),
  UPLOAD("upload"),
  DELETE("delete"),
}
