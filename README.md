<h2>DeerActionBar</h2>

[![](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![](https://img.shields.io/badge/Download-1.0.0-blue.svg)](https://bintray.com/medathsieh/AndroidLib/DeerActionBar/1.0.0)

簡單方便設定ActionBar的標題、標題顏色和背景顏色

DeerActionBar can easy to set title, title's color, and background color on ActionBar.

<h2>How do I use it?</h2>

<h3>Setup</h3>

On the bulid.gradle
```gradle
repositories {
  maven { url  "https://dl.bintray.com/medathsieh/AndroidLib" }
}
```

```gradle
dependencies {
  compile 'com.samuelhsieh:DeerActiobBar:1.0.0'
}
```

<h3>Functions</h3>

```java
DeerActionBar.with(this)
                .setTitle(R.string.app_name)
                .setTitleColor(android.R.color.white, null)
                .setBackgroundDrawable(getDrawable(R.color.colorAccent))
                .into(actionBar);
```

<h2>License</h2>

	Copyright 2017 Samuel Hsieh

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.

