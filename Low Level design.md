# Cross Platform UI

### Requirements ->
1. What do I need ?
2. I need a platform where I can write code in one format and then use the same code to be
and build for me in k number of platforms.
3. The pages are written in using react like jsx.
4. The styling is done using CSS in JS. But support for responsiveness is not there so 
you need to solve for this.
5. State Management is something to be thought of.

```
Breaking the UI into 2 parts Pages and inside Page there will be 
Widgets -> Slots -> Components -> which can be reused across pages
Inside a Page I will need to use it across the page.
Now Each widget can be required to have a different set of properties
Like the use of the Tracking
The updating the Store ?
Or making a API call from this widget ?
Or managing state inside this widget ?
To manage the state we need to think in a straight fashion that is ->

1. you will need to use the state with the widget
2. you use the state in the transition phase is that what transient data means
3. 
```











## Extras
1. The Tracking with each widget should be done as defined by the product team.
2. Defaults like fontFamily and Theming support is expected.








   
## ADD ON
The UI is server driven and can be dynamically change for who the user is
and without installing anything new for the existing user