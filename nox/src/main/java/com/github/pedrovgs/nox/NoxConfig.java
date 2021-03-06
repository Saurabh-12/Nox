/*
 * Copyright (C) 2015 Pedro Vicente Gomez Sanchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.pedrovgs.nox;

import android.graphics.drawable.Drawable;

/**
 * Contains all the NoxView configurable elements needed to render a list of NoxItems inside
 * NoxView.
 *
 * @author Pedro Vicente Gomez Sanchez.
 */
class NoxConfig {

  private float noxItemSize;
  private float noxItemMargin;
  private Drawable placeholder;

  /**
   * Returns the size of the NoxItem instance drawn inside NoxView.
   */
  float getNoxItemSize() {
    return noxItemSize;
  }

  /**
   * Configures the size of the NoxItem instance drawn inside NoxView.
   */
  void setNoxItemSize(float noxItemSize) {
    this.noxItemSize = noxItemSize;
  }

  /**
   * Returns the margin of the NoxItem instance drawn inside NoxView.
   */
  float getNoxItemMargin() {
    return noxItemMargin;
  }

  /**
   * Configures the margin of the NoxItem instance drawn inside NoxView.
   */
  void setNoxItemMargin(float noxItemMargin) {
    this.noxItemMargin = noxItemMargin;
  }

  /**
   * Configures the placeholder used to draw a NoxItem instance if the NoxItem object has no
   * placeholder configured.
   */
  void setPlaceholder(Drawable placeholder) {
    this.placeholder = placeholder;
  }

  /**
   * Returns the placeholder used to draw a NoxItem instance if the NoxItem object has no
   * placeholder configured.
   */
  Drawable getPlaceholder() {
    return placeholder;
  }
}
