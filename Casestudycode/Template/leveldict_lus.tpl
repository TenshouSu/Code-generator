node {{ ModeName }}(execute:bool) returns(idnumber: int);
let
  idnumber = if execute then {{IDNumber}} else 0;
tel
