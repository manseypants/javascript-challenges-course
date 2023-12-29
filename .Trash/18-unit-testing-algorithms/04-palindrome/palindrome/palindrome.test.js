const palindrome = require('./palindrome');

describe('Palindrome', () => {
  it('should be a funciton', () => {
    expect(typeof palindrome).toEqual('function');
  });
  it('should return a boolean', () => {
    expect(typeof palindrome('hello')).toEqual('boolean');
  });
  it('return true if it is a palindrome', () => {
    expect(palindrome('kayak')).toBeTruthy();
    expect(palindrome('rotator')).toBeTruthy();
    expect(palindrome('wow')).toBeTruthy();
  });
  it('return false if it is a palindrome', () => {
    expect(palindrome('hello')).toBeFalsy();
    expect(palindrome('world')).toBeFalsy();
    expect(palindrome('bye')).toBeFalsy();
  });
  it('return false if it contains spaces', () => {
    expect(palindrome(' kayak')).toBeTruthy();
    expect(palindrome('rota tor')).toBeTruthy();
    expect(palindrome('wow ')).toBeTruthy();
  });
});
