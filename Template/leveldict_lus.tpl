node {{ ModeName }}(verify:bool) returns(idnumber: int);
let
  idnumber = if verify then {{IDNumber}} else 0;
tel
