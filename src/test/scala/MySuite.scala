// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  import HO.*

  test("HO_operation:") {
    assertEquals(operation((x: Int) => x + 1, (x: Int) => x * x, (x: Int, y: Int) => x + y, 1, 5), 55)
    assertEquals(operation((x: Int) => x + 1, (x: Int) => x, (x: Int, y: Int) => x * y, 1, 5), 120)
  }

  test("HO_tailOperation:") {
    assertEquals(tailOperation((x: Int) => x + 1, (x: Int) => x * x, (x: Int, y: Int) => x + y, 1, 5), 55)
    assertEquals(tailOperation((x: Int) => x + 1, (x: Int) => x, (x: Int, y: Int) => x * y, 1, 5), 120)
  }
}
