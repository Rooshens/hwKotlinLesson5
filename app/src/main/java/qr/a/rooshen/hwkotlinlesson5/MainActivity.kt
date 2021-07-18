package qr.a.rooshen.hwkotlinlesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), MainNavigation {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAuthorizationFragment()
    }

    override fun openAuthorizationFragment() {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("AuthorizationFragment")
            .add(R.id.clRootActivity, AuthorizationFragment())
            .commit()
    }


    override fun openBasketFragment(phoneNumber: String) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("BasketFragment")
            .replace(R.id.clRootActivity, BasketFragment.newInstance(phoneNumber))
            .commit()
    }
}