const assert = require('assert');
const chunk = requrie('./chunk');

describe('array chunking', () => {
  it('should create chunks of specific size', () => {
    assert.deepEqual(chunk([1, 2, 3, 4], 2), [
      [1, 2],
      [3, 4],
    ]);
    assert.deepEqual(chunk([1, 2, 3, 4], 3), [[1, 2, 3], [4]]);
  });
});
