/**
 * Copyright 2023/05/05
 * All rights reserved.
 */
package com.example.customkeyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.util.Log;
import android.view.InputDevice;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class MyKeyboard extends InputMethodService implements KeyboardView.OnKeyboardActionListener {

  private KeyboardView keyboardView;
  private Keyboard keyboard;

  ////初回だけ呼ばれる
  @Override
  public void onCreate(){
    super.onCreate();
  }
  ////初回だけ呼ばれる
  @Override
  public View onCreateInputView(){
    super.onCreateInputView();
    //Log.d("*** IME ***", ""+(getCurrentInputEditorInfo().actionId=EditorInfo.IME_ACTION_DONE));
    keyboardView = (KeyboardView)getLayoutInflater().inflate(R.layout.keyboard_view,null);
    keyboard = new Keyboard(this, R.xml.keyboard);
    keyboardView.setKeyboard(keyboard);
    keyboardView.setOnKeyboardActionListener(this);
    keyboardView.setPreviewEnabled(false);
    return keyboardView;
  }
  ////キーボードが表示されるたびに呼ばれるメソッド
  @Override
  public void onStartInputView(EditorInfo editorInfo, boolean restarting) {
    ////何らかの処理
  }
  ////キーボードが閉じるときに呼ばれるメソッド
  @Override
  public void onDestroy() {
    super.onDestroy();
  }
  ////キーを押した時
  @Override
  public void onKey(int primaryCode, int[] keyCodes) {
    InputConnection ic = getCurrentInputConnection();
    getCurrentInputEditorInfo().actionId=EditorInfo.IME_ACTION_DONE;
    switch (primaryCode) {
      case KeyEvent.KEYCODE_1:
        ic.commitText("1", 1);
        break;
      case KeyEvent.KEYCODE_2:
        ic.commitText("2", 1);
        break;
      case KeyEvent.KEYCODE_3:
        ic.commitText("3", 1);
        break;
      case KeyEvent.KEYCODE_4:
        ic.commitText("4", 1);
        break;
      case KeyEvent.KEYCODE_5:
        ic.commitText("5", 1);
        break;
      case KeyEvent.KEYCODE_6:
        ic.commitText("6", 1);
        break;
      case KeyEvent.KEYCODE_7:
        ic.commitText("7", 1);
        break;
      case KeyEvent.KEYCODE_8:
        ic.commitText("8", 1);
        break;
      case KeyEvent.KEYCODE_9:
        ic.commitText("9", 1);
        break;
      case KeyEvent.KEYCODE_0:
        ic.commitText("0", 1);
        break;
      case KeyEvent.KEYCODE_DEL:
        ic.deleteSurroundingText(1, 0);
        break;
      case KeyEvent.KEYCODE_ENTER:
        ic.performEditorAction(EditorInfo.IME_ACTION_DONE);//切り札:onEditorActionListener
        //Log.d("*** IME ENTER ***",""+getCurrentInputEditorInfo().actionId);
        break;
      case KeyEvent.KEYCODE_MINUS:
        ic.commitText("-", 1);
        break;
      case KeyEvent.KEYCODE_PERIOD:
        ic.commitText(".", 1);
        break;
      default:
        break;
    }
  }
  @Override
  public void onPress(int primaryCode){}
  @Override
  public void onRelease(int primaryCode){}
  @Override
  public void onText(CharSequence text){}
  @Override
  public void swipeLeft(){}
  @Override
  public void swipeRight(){}
  @Override
  public void swipeDown(){}
  @Override
  public void swipeUp(){}
}
