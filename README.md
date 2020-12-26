# freezed_intellij_live_templates
[Live Templates](https://www.jetbrains.com/help/idea/using-live-templates.html) for the [freezed](https://pub.dev/packages/freezed) package in the intellij ecosystem.

Create boiler plate code faster so you can get to your bussiness logic
## Installation
All the information on sharing live templates can be found [here](https://www.jetbrains.com/help/idea/sharing-live-templates.html)

For our purposes, we just need to:
- Go to configuration directory [folder](https://www.jetbrains.com/help/idea/tuning-the-ide.html#default-dirs)
  - The default is %APPDATA%\JetBrains\<product><version> i.e     C:\Users\JohnS\AppData\Roaming\JetBrains\IntelliJIdea2020.3
  - For Android Studio Users: %APPDATA%\\__Google__\<product><version> i.e C:\Users\JohnS\AppData\Roaming\\__Google__\AndroidStudio4.1
- Create the _template_ directory if not there already and add the [Freezed.xml](Freezed.xml) in there 

There should be a Live Template Group called Freezed.
![Freezed Live Template](resources\Screenshot 2020-12-25 202705.png "Freezed Live Template Group)