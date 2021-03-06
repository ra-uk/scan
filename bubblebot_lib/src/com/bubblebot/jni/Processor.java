/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bubblebot.jni;

/** This class provides an interface to the image processing pipeline and handles most of the JSON parsing.
*/
public class Processor {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Processor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Processor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        bubblebotJNI.delete_Processor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Processor() {
    this(bubblebotJNI.new_Processor__SWIG_0(), true);
  }

  public Processor(String appRootDir) {
    this(bubblebotJNI.new_Processor__SWIG_1(appRootDir), true);
  }

  public boolean loadFormImage(String imagePath, String calibrationFilePath) {
    return bubblebotJNI.Processor_loadFormImage__SWIG_0(swigCPtr, this, imagePath, calibrationFilePath);
  }

  public boolean loadFormImage(String imagePath) {
    return bubblebotJNI.Processor_loadFormImage__SWIG_1(swigCPtr, this, imagePath);
  }

  public boolean loadFeatureData(String templatePath) {
    return bubblebotJNI.Processor_loadFeatureData(swigCPtr, this, templatePath);
  }

  public int detectForm() {
    return bubblebotJNI.Processor_detectForm(swigCPtr, this);
  }

  public boolean setTemplate(String templatePath) {
    return bubblebotJNI.Processor_setTemplate(swigCPtr, this, templatePath);
  }

  public boolean alignForm(String alignedImageOutputPath, int templateIdx) {
    return bubblebotJNI.Processor_alignForm__SWIG_0(swigCPtr, this, alignedImageOutputPath, templateIdx);
  }

  public boolean alignForm(String alignedImageOutputPath) {
    return bubblebotJNI.Processor_alignForm__SWIG_1(swigCPtr, this, alignedImageOutputPath);
  }

  public boolean processForm(String outputPath, boolean minifyJson) {
    return bubblebotJNI.Processor_processForm__SWIG_0(swigCPtr, this, outputPath, minifyJson);
  }

  public boolean processForm(String outputPath) {
    return bubblebotJNI.Processor_processForm__SWIG_1(swigCPtr, this, outputPath);
  }

  public String scanAndMarkup(String outputPath) {
    return bubblebotJNI.Processor_scanAndMarkup(swigCPtr, this, outputPath);
  }

  public String processViaJSON(String jsonString) {
    return bubblebotJNI.Processor_processViaJSON(swigCPtr, this, jsonString);
  }

  public boolean writeFormImage(String outputPath) {
    return bubblebotJNI.Processor_writeFormImage(swigCPtr, this, outputPath);
  }

  public String jniEchoTest(String str) {
    return bubblebotJNI.Processor_jniEchoTest(swigCPtr, this, str);
  }

}
