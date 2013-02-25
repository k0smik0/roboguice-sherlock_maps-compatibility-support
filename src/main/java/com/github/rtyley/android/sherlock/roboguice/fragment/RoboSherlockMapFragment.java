/*******************************************************************************
 * Copyleft 2012 Massimiliano Leone - massimiliano.leone@iubris.net .
 * 
 * RoboSherlockMapFragment.java is part of 'roboguice-sherlock_maps-compatibility-support'.
 * 
 * 'roboguice-sherlock_maps-compatibility-support' is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * 
 * 'roboguice-sherlock_maps-compatibility-support' is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with 'roboguice-sherlock_maps-compatibility-support' ; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301 USA
 ******************************************************************************/
package com.github.rtyley.android.sherlock.roboguice.fragment;

import roboguice.RoboGuice;
import android.os.Bundle;
import android.view.View;
import com.actionbarsherlock.app.SherlockMapFragment;


public abstract class RoboSherlockMapFragment extends SherlockMapFragment {	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RoboGuice.getInjector(getActivity()).injectMembersWithoutViews(this);
    }	
	
	/*
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	@Override
        RoboGuice.getInjector(getActivity()).injectViewMembers(this);
		return super.onCreateView(inflater, container, savedInstanceState);
	}*/

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RoboGuice.getInjector(getActivity()).injectViewMembers(this);
    }
}