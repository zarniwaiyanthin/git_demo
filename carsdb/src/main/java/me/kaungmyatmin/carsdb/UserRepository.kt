package me.kaungmyatmin.carsdb

import android.app.Activity
import android.content.Context
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class UserRepository {

    fun registerUser(context: Activity, user: User) {
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(user.email, user.password)
            .addOnCompleteListener() {
                if (it.isSuccessful) {
                    val intent = MainActivity.newIntent(context)
                    context.startActivity(intent)
                    context.finish()
                } else {
                    Toast.makeText(
                        context,
                        it.exception?.message ?: "Unknown Error",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
    }

    fun loginUser(context: Context, user: User) {

    }

    fun getUser(): User? {

        return null
    }

    fun isLogged(context: Context): Boolean {
        return false
    }

    fun saveLogged(context: Context) {


    }

    fun logout(context: Context) {

    }

    private fun showToast(
        context: Context,
        message: String
    ) {

    }
}
