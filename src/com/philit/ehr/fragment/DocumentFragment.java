package com.philit.ehr.fragment;

import com.philit.ehr.R;
import com.philit.ehr.R.id;
import com.philit.ehr.view.DocumentViewPager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DocumentFragment extends Fragment{

	private int mPos = -1;
	private View mainView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if (mPos == -1 && savedInstanceState != null)
			mPos = savedInstanceState.getInt("mPos");
		mainView = inflater.inflate(R.layout.document_frame, null);
		DocumentViewPager documentViewPager = (DocumentViewPager)mainView.findViewById(R.id.documentViewPager);
		
		return mainView;
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("mPos", mPos);
	}
}
