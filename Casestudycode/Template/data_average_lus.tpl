node accumulate(verify: bool; A,B: real) returns(sum: real);
let
  sum = if verify then A+B else 0.0;
tel

node division(verify: bool; num, sum: real) returns(avg: real);
let
  avg = if verify then sum/num else 0.0;
tel
