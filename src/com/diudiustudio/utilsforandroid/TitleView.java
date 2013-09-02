package com.diudiustudio.utilsforandroid;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TitleView extends RelativeLayout {

	private Button forward;
	private Button backward;
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

			String titleString = attributes.getString(R.styleable.title_title);
			String forwardString = attributes.getString(R.styleable.title_forward);
			String backwardString = attributes.getString(R.styleable.title_backward);
			title = (TextView) view.findViewById(R.id.tv_title);
			title.setText(titleString);
			backward = (Button) view.findViewById(R.id.btn_backward);
			backward.setText(backwardString);
			forward = (Button) view.findViewById(R.id.btn_forward);
			forward.setText(forwardString);
			attributes.recycle();
		}
	}

}
