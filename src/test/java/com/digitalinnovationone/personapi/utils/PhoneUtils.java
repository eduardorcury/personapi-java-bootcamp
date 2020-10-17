package com.digitalinnovationone.personapi.utils;

import com.digitalinnovationone.personapi.dto.request.PhoneDTO;
import com.digitalinnovationone.personapi.entity.Phone;
import com.digitalinnovationone.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return new PhoneDTO(null, PHONE_TYPE, PHONE_NUMBER);
    }

    public static Phone createFakeEntity() {
        return new Phone(PHONE_ID, PHONE_TYPE, PHONE_NUMBER);
    }
}
