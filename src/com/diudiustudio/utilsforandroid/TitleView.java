package com.diudiustudio.utilsforandroid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TitleView extends RelativeLayout {

	private ImageButton forward;
	private ImageButton backward;
	private TextView title;

	TitleView(Context context) {
		this(context, null);
	}

	public TitleView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public TitleView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);

		View view = View.inflate(context, R.layout.title, this);
		TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.title);
		if (attributes == null) {
			return;

		} else {

			String titleString = attributes.getString(R.styleable.title_tv_title_text);
			Drawable forwardDrawable = attributes.getDrawable(R.styleable.title_ib_src_forward);
			Drawable backwardDrawable = attributes.getDrawable(R.styleable.title_ib_src_backward);
			attributes.recycle();

			title = (TextView) view.findViewById(R.id.tv_title);
			backward = (ImageButton) view.findViewById(R.id.ib_backward);
			forward = (ImageButton) view.findViewById(R.id.ib_forward);

			title.setText(titleString);
			backward.setImageDrawable(backwardDrawable);
			forward.setImageDrawable(forwardDrawable);

		}
	}

}
