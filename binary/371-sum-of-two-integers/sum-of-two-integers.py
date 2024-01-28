class Solution:
    def getSum(self, a: int, b: int) -> int:
    # 32-bit integer max
        MAX = 0x7FFFFFFF
    # 32-bit interger min
        MIN = 0x80000000
        mask = 0xFFFFFFFF

        while b != 0:
        # ^ gets the different bits and & gets the double 1s, << moves carry
            a, b = (a ^ b) & mask, ((a & b) << 1) & mask

    # if a is negative, get its 32 bits complement positive first
    # then get 32-bit positive's Python complement negative
        return a if a <= MAX else ~(a ^ mask)

        




        