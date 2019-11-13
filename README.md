#  Search City App
<p align="center">
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Seattle_Kerry_Park_Skyline.jpg/1200px-Seattle_Kerry_Park_Skyline.jpg" 
</p>

Search City is a project to showcase the MVVM architectural approach to developing Android apps. With a focus on modern android development tools and relevant libraries that have made my life easier as an Android Developer. The idea is to leverage all the components in the jetpack library.

In this project you'll find:
*   Kotlin **[Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)** for background operations.
*   A single-activity architecture, using the **[Navigation component](https://developer.android.com/guide/navigation/navigation-getting-started)** to manage fragment operations.
*   A presentation layer that contains a fragment (View) and a **ViewModel** per screen (or feature).
*   Reactive UIs using **LiveData** observables and **Data Binding**.
* Code generation for network models
* **[Koin](https://insert-koin.io/)** for dependency injection. Had been wanting to try this out for some time and it works great

## Features
* Main Screen contains categories with predefine searches such as coffee, food, bars, and places to see in Seattle.
* Typeahead search based on at least 3 letters typed
* Display list of search results in a list and in a Map
* Calculates distance from the center of Seattle (47.6062° N, 122.3321° W) to the places on the search result

## Coming soon (TODOs)
*   A **data layer** with a repository and two data sources (local using Room and remote) that are queried with one-shot operations (no listeners or data streams).
*   Reactive UIs using **Data Binding**.
* Decouple network model from App (Create a mapping from the network model to a domain model)
* Add Mock Services to test repositories
* Support Multiple cities
* Build a list using compose on android studio 4.0 comes out



## Known Issues
 * Details page might fail to load because I have excited the limit of request for the free tear for those cases you will see the following: 
![](https://media.giphy.com/media/EXHHMS9caoxAA/giphy.gif)
* Transition Animation between fragments need to be revised 



## Opening a Search City in Android Studio

To open app in Android Studio, begin by checking out master, and then open the root directory in Android Studio.

Clone the repository:

```
git clone https://github.com/cristhianescobar/CitySearch.git
```
This step checks out the master branch. And hit that play button on android studio. 
### License




```
Copyright 2019 Cristhian Escobar.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
