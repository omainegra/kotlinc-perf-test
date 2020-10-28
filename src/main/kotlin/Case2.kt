import arrow.core.Tuple2
import arrow.core.Tuple3
import arrow.core.Tuple4
import arrow.core.Tuple5
import arrow.core.Tuple6
import arrow.core.Tuple7
import io.kotlintest.properties.Gen

val a = Gen.int()
val b = Gen.bind(Gen.int(), Gen.float(), ::Tuple2)
val c = Gen.bind(Gen.int(), Gen.float(), Gen.double(), ::Tuple3)
val d = Gen.bind(Gen.int(), Gen.float(), Gen.double(), Gen.short(), ::Tuple4)
val e = Gen.bind(Gen.int(), Gen.float(), Gen.double(), Gen.short(), Gen.positiveIntegers(), ::Tuple5)
val f = Gen.bind(Gen.int(), Gen.float(), Gen.double(), Gen.short(), Gen.positiveIntegers(), Gen.positiveDoubles(), ::Tuple6)
val g = Gen.bind(Gen.int(), Gen.float(), Gen.double(), Gen.short(), Gen.positiveIntegers(), Gen.positiveDoubles(), Gen.list(Gen.int()), ::Tuple7)
val h = Gen.bind(Gen.bind(Gen.int(), Gen.float(), Gen.double(), Gen.short(), Gen.positiveIntegers(), Gen.positiveDoubles(), Gen.list(Gen.int()), ::Tuple7), a, ::Tuple2)
val i = Gen.bind(Gen.bind(Gen.int(), Gen.float(), Gen.double(), Gen.short(), Gen.positiveIntegers(), Gen.positiveDoubles(), Gen.list(Gen.int()), ::Tuple7), a, b, ::Tuple3)
val j = Gen.bind(Gen.bind(Gen.int(), Gen.float(), Gen.double(), Gen.short(), Gen.positiveIntegers(), Gen.positiveDoubles(), Gen.list(Gen.int()), ::Tuple7), a, b, c, ::Tuple4)