const fizzBuzz = require('./fizzbuzz');

describe('fizzbuzz', () => {
  it('should be a function', () => {
    expect(typeof fizzBuzz).toEqual('function');
  });

  it('should return the number if not divisible by 3 or 5', () => {
    expect(fizzBuzz(1)).toEqual(1);
    expect(fizzBuzz(13)).toEqual(13);
    expect(fizzBuzz(17)).toEqual(17);
  });

  it('should return fizz divisible by 3', () => {
    expect(fizzBuzz(3)).toEqual('fizz');
    expect(fizzBuzz(6)).toEqual('fizz');
    expect(fizzBuzz(12)).toEqual('fizz');
  });

  it('should return buzz divisible by 5', () => {
    expect(fizzBuzz(5)).toEqual('buzz');
    expect(fizzBuzz(10)).toEqual('buzz');
    expect(fizzBuzz(20)).toEqual('buzz');
  });

  it('should return fizzbuzz divisible by 3 & 5', () => {
    expect(fizzBuzz(15)).toEqual('fizzbuzz');
    expect(fizzBuzz(30)).toEqual('fizzbuzz');
    expect(fizzBuzz(45)).toEqual('fizzbuzz');
  });
});
