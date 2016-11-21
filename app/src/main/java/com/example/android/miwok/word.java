package com.example.android.miwok;

/**
 * Created by User on 11/9/2016.
 * {@link word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a miwok translation for that word.
 */

public class word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource ID for the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    /**
     * Create a new word object.
     * @param DefaultTranslation is the word in a language that the user uses (such as english)
     *@param miwokTranslation is the word in the Miwok language.
     **@param imageResourceId is the drawable resource ID for the imageasset.
     */

    public word(String DefaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word.
     */

    public String getmMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    /** Return the image resource Id of the word. **/
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     *
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
