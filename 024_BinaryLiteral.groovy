int bInt = 0b10101111
assert bInt == 175

short bShort = 0b11001001
assert bShort == 201 as short

byte bByte = 0b11
assert bByte == 3 as byte

long bLong = 0b101101101101
assert bLong == 2925l as long

BigInteger bBigInteger = 0b111100100001
assert bBigInteger == 3873g

int bNegativeInt = -0b10101111
assert bNegativeInt == -175