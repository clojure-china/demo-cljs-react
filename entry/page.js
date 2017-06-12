
// here's how you include CSS
require('./main.css');

window.onload = require('../target/app.main').main;

if (module.hot) {
  module.hot.accept('../target/app.main', function() {
    // stop currently running version
    require('../target/app.main').reload();
  });
}
