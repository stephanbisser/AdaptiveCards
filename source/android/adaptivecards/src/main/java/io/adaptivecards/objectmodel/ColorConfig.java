/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ColorConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ColorConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ColorConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_ColorConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDefaultColor(String value) {
    AdaptiveCardObjectModelJNI.ColorConfig_defaultColor_set(swigCPtr, this, value);
  }

  public String getDefaultColor() {
    return AdaptiveCardObjectModelJNI.ColorConfig_defaultColor_get(swigCPtr, this);
  }

  public void setSubtleColor(String value) {
    AdaptiveCardObjectModelJNI.ColorConfig_subtleColor_set(swigCPtr, this, value);
  }

  public String getSubtleColor() {
    return AdaptiveCardObjectModelJNI.ColorConfig_subtleColor_get(swigCPtr, this);
  }

  public void setHighlightColors(HighlightColorConfig value) {
    AdaptiveCardObjectModelJNI.ColorConfig_highlightColors_set(swigCPtr, this, HighlightColorConfig.getCPtr(value), value);
  }

  public HighlightColorConfig getHighlightColors() {
    long cPtr = AdaptiveCardObjectModelJNI.ColorConfig_highlightColors_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HighlightColorConfig(cPtr, false);
  }

  public static ColorConfig Deserialize(JsonValue json, ColorConfig defaultValue) {
    return new ColorConfig(AdaptiveCardObjectModelJNI.ColorConfig_Deserialize(JsonValue.getCPtr(json), json, ColorConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public ColorConfig() {
    this(AdaptiveCardObjectModelJNI.new_ColorConfig(), true);
  }

}