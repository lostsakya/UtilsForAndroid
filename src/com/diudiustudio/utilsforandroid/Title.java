package com.diudiustudio.utilsforandroid;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public abstract class Title extends RelativeLayout {

	private Button forward;
	private Button backward;
	private TextView title;

	private Context context;

	Title(Context context) {
		this(context, null);
	}

	public Title(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public Title(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.context = context;
		View view = View.inflate(context, R.layout.title, this);
		TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.title);
		String titleString = attributes.getString(R.styleable.title_title);
		String forwardString = attributes.getString(R.styleable.title_forward);
		String backwardString = attributes.getString(R.styleable.title_backward);
		attributes.recycle();
		title = (TextView) view.findViewById(R.id.tv_title);
		title.setText(titleString);
		backward = (Button) view.findViewById(R.id.btn_backward);
		backward.setText(backwardString);
		forward = (Button) view.findViewById(R.id.btn_forward);
		backward.setText(forwardString);

	}

	public void onBackwardClick(View view) {
		if (context instanceof Activity) {
			Activity activity = (Activity) context;
			activity.finish();
		}
	}

	public abstract void onForwardClick(View view);

}
