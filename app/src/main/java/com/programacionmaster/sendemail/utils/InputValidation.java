package com.programacionmaster.sendemail.utils;

import android.widget.EditText;

public class InputValidation {

    /**
     * Validate editText.
     *
     * @param editText
     * @return
     */
    public static boolean isValidEditText(EditText editText, String errorMessage) {
        if (editText.getText().toString().trim().length() == 0) {
            editText.setError(errorMessage);
            return false;
        } else {
            editText.setError(null);
            return true;
        }
    }
}
