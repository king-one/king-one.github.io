1.ES6引入了一种新的原始数据类型Symbol，表示独一无二的值。

2.Symbol 通过Symbol函数生成  可以解决属性冲突  凡事属性名属于Symbol类型都是独一无二的  即使同名。

3.不能使用new 关键字,不能用点运算符。在对象的内部，使用Symbol值定义属性时，Symbol值必须放在方括号之中。

4.Symbol实例：消除魔术字符串

```javascript
function getArea(shape, options) {
  var area = 0;

  switch (shape) {
    case 'Triangle': // 魔术字符串(形成强耦合的某一个具体的字符串或者数值)
      area = .5 * options.width * options.height;
      break;
    /* ... more code ... */
  }

  return area;
}

getArea('Triangle', { width: 100, height: 100 }); // 魔术字符串
```

```javascript
var shapeType = {
  triangle: Symbol()
};

function getArea(shape, options) {
  var area = 0;
  switch (shape) {
    case shapeType.triangle:
      area = .5 * options.width * options.height;
      break;
  }
  return area;
}

getArea(shapeType.triangle, { width: 100, height: 100 });
```

可以发现`shapeType.triangle`等于哪个值并不重要，只要确保不会跟其他`shapeType`属性的值冲突即可。因此，这里就很适合改用Symbol值。

5.```Object.getOwnPropertySymbols()``` 可以获取指定对象的所有 Symbol 属性名。

6.