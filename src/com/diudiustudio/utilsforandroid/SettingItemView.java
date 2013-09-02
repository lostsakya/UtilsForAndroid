package com.diudiustudio.utilsforandroid;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SettingItemView extends RelativeLayout {

	public SettingItemView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		View view = View.inflate(context, R.layout.setting_item, this);

		TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.setting_item);

		String titleString = attributes.getString(R.styleable.setting_item_tv_title);
		String contentString = attributes.getString(R.styleable.setting_item_tv_content);

		Drawable firstDrawable = attributes.getDrawable(R.styleable.setting_item_iv_src_first);
		Drawable lastDrawable = attributes.getDrawable(R.styleable.setting_item_iv_src_last);

		attributes.recycle();

		ImageView firstImageView = (ImageView) view.findViewById(R.id.iv_first);
		ImageView lastImageView = (ImageView) view.findViewById(R.id.iv_last);
		TextView titleTextView = (TextView) findViewById(R.id.tv_title);
		TextView contentTextView = (TextView) findViewById(R.id.tv_content);

		firstImageView.setImageDrawable(firstDrawable);
		lastImageView.setImageDrawable(lastDrawable);
		titleTextView.setText(titleString);
		contentTextView.setText(contentString);
	}

	public SettingItemView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public SettingItemView(Context context) {
		this(context, null);
	}

}
