# react-native-owl-native-module

## Getting started

`$ npm install react-native-owl-native-module --save`

### Mostly automatic installation

`$ react-native link react-native-owl-native-module`

## Usage
```javascript
import OwlNativeModule from 'react-native-owl-native-module';

OwlNativeModule.sqrNumber(someNum, (err, res) => {
      if (res) { alert(res); }
      if (err) { alert(err); }
    });
