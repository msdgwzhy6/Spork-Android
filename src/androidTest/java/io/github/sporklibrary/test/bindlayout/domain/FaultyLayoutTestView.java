package io.github.sporklibrary.test.bindlayout.domain;

import android.content.Context;
import android.widget.FrameLayout;
import io.github.sporklibrary.Spork;
import io.github.sporklibrary.annotations.BindLayout;

@BindLayout(Integer.MIN_VALUE)
public class FaultyLayoutTestView extends FrameLayout
{
	public FaultyLayoutTestView(Context context)
	{
		super(context);

		Spork.bind(this);
	}
}
