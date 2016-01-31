package io.github.sporklibrary.test.bindclick.domain;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.sporklibrary.Spork;
import io.github.sporklibrary.annotations.BindClick;
import io.github.sporklibrary.test.R;
import io.github.sporklibrary.test.bindclick.ClickTestProvider;

public class TestFragment extends Fragment implements ClickTestProvider
{
	private int mClickCount = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.fragment_click_binding, container);
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
	{
		Spork.bind(this);
	}

	// Keep this one public to have a different accessibily state on the Method (as opposed to TestView)
	@BindClick(R.id.click_binding_fragment_button)
	public void onClick()
	{
		mClickCount++;
	}

	@Override
	public int getClickCount()
	{
		return mClickCount;
	}

	@Override
	public int getClickViewResourceId()
	{
		return R.id.click_binding_fragment_button;
	}
}
