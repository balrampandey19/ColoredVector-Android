# Android Colored Vector Drawable



The beauty of Vector drawable is  defined in XML and can easily modified.
if want to convet vector drawable color programmatically you can easily convert by using this 
ColoredVector-Andorid  

### Use this library to change colors of your vector drawables easily from your code.



## If you want to set a colored vector in Imageview:​



```sh
 DrawableHelper
            .withContext(this)
            .withColor(R.color.white)
            .withDrawable(R.drawable.ic_search_24dp)
            .tint()
            .applyTo(mSearchItem);
            
```
#### If you want to set a colored vector as a ToolBar icon: 
```sh
 final Drawable drawable = DrawableHelper
            .withContext(this)
            .withColor(R.color.white)
            .withDrawable(R.drawable.ic_search_24dp)
            .tint()
            .get();

    actionBar.setHomeAsUpIndicator(drawable);
            
```
## Gradle Dependency

### Repository

The Gradle dependency is available via jCenter. jCenter is the default Maven repository used by Android Studio.

```
dependencies {
    // ... other dependencies here
compile 'co.balrampandey:library:0.1.1'
}
```

License
```
Copyright 2016 Balram Pandey

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```

