package com.sda.zdjavapol68.example.zad8;

public class ParcelValidatorTaiisia implements Validate {
    @Override
    public boolean validate(Parcel input) {
        boolean isCorrectWeight = false;
        if (!input.isExpress() && input.getWeight() <= 30) {
            isCorrectWeight = true;
        } else if (input.isExpress() && input.getWeight() <= 15) {
            isCorrectWeight = true;
        }
        return (input.getzLength() + input.getyLength() + input.getxLength()) < 300 && isCorrectWeight &&
                input.getxLength() >= 30 && input.getyLength() >= 30 && input.getzLength() >= 30;
    }
}
