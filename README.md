<!-- Plugin description -->
# freezed_intellij_live_templates
[Live Templates](https://www.jetbrains.com/help/idea/using-live-templates.html) for the [freezed](https://pub.dev/packages/freezed) package in the intellij ecosystem.

Create boiler plate code faster so you can get to your bussiness logic
## Installation

- Using IDE built-in plugin system:
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Flutter Freezed Snippets"</kbd> >
  <kbd>Install Plugin</kbd>

- Manually:
  Download the [latest release](https://github.com/Tinhorn/freezed_intellij_live_templates/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

There should be a Live Template Group called Freezed.
![Freezed Live Template](https://github.com/Tinhorn/freezed_intellij_live_templates/blob/main/resources/Screenshot%202020-12-25%20202705.png "Freezed Live Template")

## Live Templates

### freezedClass
~~Begin to~~ type __freezedClass__ and press <kbd>Tab</kbd> to generate a freezed class
```dart
@freezed
class Demo with _$Demo {
}
```

### freezedConst
~~Begin to~~ type __freezedConst__ and press <kbd>Tab</kbd> to generate a basic constructor
```dart
const factory Demo() = _Demo;
```

### freezedPart
~~Begin to~~ type __freezedPart__ and press <kbd>Tab</kbd> to generate the part statement
```dart
part 'scratch.freezed.dart';
```

### freezedFromJson
~~Begin to~~ type __freezedFromJson__ and press <kbd>Tab</kbd> to generate the fromJson method for json_serializable
```dart
factory Demo.fromJson(Map<String, dynamic> json) => _$DemoFromJson(json);
```

### freezedJsonPart
~~Begin to~~ type __freezedJsonPart__ and press <kbd>Tab</kbd> to generate the part statement for json_serializable
```dart
part 'scratch.g.dart';
```

## Contact
if you have any bugs/requests go to the [Issues](https://github.com/Tinhorn/freezed_intellij_live_templates/issues) tab
<!-- Plugin description end -->