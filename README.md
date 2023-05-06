# Android-custom-IME-via-Java-20230505
A tenkey keyboard like the a part of '101' keyboard layout.
A simple keyboard for entering numbers only.

To make the description of basic functions easier to read, I did not add any unnecessary decorations.

## Development environment
This app is developed only for Android app.
    Android Studio Bumblebee | 2021.1.1 Patch 1
    Build #AI-211.7628.21.2111.8139111, built on February 2, 2022
    Runtime version: 11.0.11+9-b60-7590822 amd64
    VM: OpenJDK 64-Bit Server VM by Oracle Corporation
    Windows 10 10.0
    GC: G1 Young Generation, G1 Old Generation
    Memory: 1280M
    Cores: 8
    Registry: external.system.auto.import.disabled=true
## Features
    The name of this IME in 'MyNumISO' in selecting IME dialog.
    Runs on Android APIs versions from 22 to 29.
    In this version, 'ENTER' key works as 'DONE' key.
## Issues/Problem
    Because the layout design is immature, rotating the screen may cause the appearance of other applications to look bad.
    The error avoidance measures to anticipate bugs that have not been manifested have not been implemented.
## Information used as a reference
    [Create a Input Method](https://developer.android.com/guide/topics/text/creating-input-method.html)
    [On-screen Input Methods](https://android-developers.googleblog.com/2009/04/updating-applications-for-on-screen.html)
    [InputMethodService](https://developer.android.com/reference/android/inputmethodservice/InputMethodService)
    [InputConnection](https://developer.android.com/reference/android/view/inputmethod/InputConnection)
    [EditorInfo](https://developer.android.com/reference/android/view/inputmethod/EditorInfo)
    [KeyEvent](https://developer.android.com/reference/kotlin/androidx/compose/ui/input/key/KeyEvent?hl=en)
    [TextView.OnEditorActionListener](https://developer.android.com/reference/android/widget/TextView.OnEditorActionListener)
    [Androidカスタムキーボードの作り方](https://qiita.com/Kyome/items/e654363bad7f69e6b0fd)
