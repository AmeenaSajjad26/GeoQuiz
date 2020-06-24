package com.example.ameena.geoquiz;

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mIsCheater;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId () {
        return mTextResId;
    }

    public void setTextResId (int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue () {
        return mAnswerTrue;
    }

    public void setAnswerTrue (boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isCheater () {
        return mIsCheater;
    }

    public void setCheater (boolean cheater) {
        mIsCheater = cheater;
    }
}
