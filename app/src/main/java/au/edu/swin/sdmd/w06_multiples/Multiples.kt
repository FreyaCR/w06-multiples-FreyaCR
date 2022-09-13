package au.edu.swin.sdmd.w06_multiples

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Multiples(val factor1 : Int, val factor2 : Int) : Parcelable {
    val result = factor1 * factor2
}
