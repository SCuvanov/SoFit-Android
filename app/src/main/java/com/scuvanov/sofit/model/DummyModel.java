package com.scuvanov.sofit.model;

public class DummyModel {
	
	private long mId;
	private String mImageURL;
	private String mText;
	private int mIconRes;

	public DummyModel() {
	}

	public DummyModel(long id, String imageURL, String text) {
		mId = id;
		mImageURL = imageURL;
		mText = text;
	}

	public long getId() {
		return mId;
	}

	public void setId(long id) {
		mId = id;
	}

	public String getImageURL() {
		return mImageURL;
	}

	public void setImageURL(String imageURL) {
		mImageURL = imageURL;
	}

	public String getText() {
		return mText;
	}

	public void setText(String text) {
		mText = text;
	}

	@Override
	public String toString() {
		return mText;
	}
}
