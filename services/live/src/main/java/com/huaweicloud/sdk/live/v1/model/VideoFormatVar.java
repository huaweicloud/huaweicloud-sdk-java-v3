package com.huaweicloud.sdk.live.v1.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets VideoFormatVar
 */
public class VideoFormatVar {
    
    /**
     * Enum FLV for value: "FLV"
     */
    public static final VideoFormatVar FLV = new VideoFormatVar("FLV");
    
    /**
     * Enum HLS for value: "HLS"
     */
    public static final VideoFormatVar HLS = new VideoFormatVar("HLS");
    
    /**
     * Enum MP4 for value: "MP4"
     */
    public static final VideoFormatVar MP4 = new VideoFormatVar("MP4");
    

    private static final Map<String, VideoFormatVar> STATIC_FIELDS = createStaticFields();

    private static Map<String, VideoFormatVar> createStaticFields() {
        Map<String, VideoFormatVar> map = new HashMap<>();
        map.put("FLV", FLV);
        map.put("HLS", HLS);
        map.put("MP4", MP4);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    VideoFormatVar(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static VideoFormatVar fromValue(String value) {
        if( value == null ){
            return null;
        }
        VideoFormatVar result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new VideoFormatVar(value);
        }
        return result;
    }

    public static VideoFormatVar valueOf(String value) {
        if( value == null ){
            return null;
        }
        VideoFormatVar result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VideoFormatVar) {
            return this.value.equals(((VideoFormatVar) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

