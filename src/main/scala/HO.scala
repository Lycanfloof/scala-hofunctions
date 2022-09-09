object  HO:
    def operation(sc: Int => Int, fn: Int => Int, op: (Int, Int) => Int, n1: Int, n2: Int): Int =
        if (n1 > n2) 0
        else if (n1 == n2) fn(n2)
        else op(fn(n1), operation(sc, fn, op, sc(n1), n2))

    def tailOperation(sc: Int => Int, fn: Int => Int, op: (Int, Int) => Int, n1: Int, n2: Int): Int =
        def tailOperationIt(sc: Int => Int, fn: Int => Int, op: (Int, Int) => Int, n1: Int, n2: Int, vl: Int): Int =
            if (n1 > n2) 0
            else if (n1 == n2) vl
            else tailOperationIt(sc, fn, op, sc(n1), n2, op(fn(n1), vl))
        tailOperationIt(sc, fn, op, n1, n2, fn(n2))
