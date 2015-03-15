package com.howtox.mobile.criminalintent;

import android.net.Uri;
import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity implements CrimeFragment.OnFragmentInteractionListener {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    public void onFragmentInteraction(Uri uri) {
        //pass
    }
}
