package native
package nir

final class Fresh {
  private var i: Int = 0
  def apply() = {
    val res = Val.Name(Name.Fresh(i))
    i += 1
    res
  }
}