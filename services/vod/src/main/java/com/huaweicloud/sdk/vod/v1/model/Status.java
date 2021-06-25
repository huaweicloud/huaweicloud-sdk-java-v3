package com.huaweicloud.sdk.vod.v1.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 媒资状态.&lt;br/&gt; 
 */
public class Status {
    
    /**
     * Enum UNCREATED for value: "UNCREATED"
     */
    public static final Status UNCREATED = new Status("UNCREATED");
    
    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final Status DELETED = new Status("DELETED");
    
    /**
     * Enum CANCELLED for value: "CANCELLED"
     */
    public static final Status CANCELLED = new Status("CANCELLED");
    
    /**
     * Enum SERVER_ERROR for value: "SERVER_ERROR"
     */
    public static final Status SERVER_ERROR = new Status("SERVER_ERROR");
    
    /**
     * Enum UPLOAD_FAILED for value: "UPLOAD_FAILED"
     */
    public static final Status UPLOAD_FAILED = new Status("UPLOAD_FAILED");
    
    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final Status CREATING = new Status("CREATING");
    
    /**
     * Enum PUBLISHED for value: "PUBLISHED"
     */
    public static final Status PUBLISHED = new Status("PUBLISHED");
    
    /**
     * Enum WAITING_TRANSCODE for value: "WAITING_TRANSCODE"
     */
    public static final Status WAITING_TRANSCODE = new Status("WAITING_TRANSCODE");
    
    /**
     * Enum TRANSCODING for value: "TRANSCODING"
     */
    public static final Status TRANSCODING = new Status("TRANSCODING");
    
    /**
     * Enum TRANSCODE_FAILED for value: "TRANSCODE_FAILED"
     */
    public static final Status TRANSCODE_FAILED = new Status("TRANSCODE_FAILED");
    
    /**
     * Enum TRANSCODE_SUCCEED for value: "TRANSCODE_SUCCEED"
     */
    public static final Status TRANSCODE_SUCCEED = new Status("TRANSCODE_SUCCEED");
    
    /**
     * Enum CREATED for value: "CREATED"
     */
    public static final Status CREATED = new Status("CREATED");
    
    /**
     * Enum UNPUBLISHED for value: "UNPUBLISHED"
     */
    public static final Status UNPUBLISHED = new Status("UNPUBLISHED");
    
    /**
     * Enum NO_ASSET for value: "NO_ASSET"
     */
    public static final Status NO_ASSET = new Status("NO_ASSET");
    
    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final Status DELETING = new Status("DELETING");
    
    /**
     * Enum DELETE_FAILED for value: "DELETE_FAILED"
     */
    public static final Status DELETE_FAILED = new Status("DELETE_FAILED");
    
    /**
     * Enum OBS_CREATING for value: "OBS_CREATING"
     */
    public static final Status OBS_CREATING = new Status("OBS_CREATING");
    
    /**
     * Enum OBS_CREATE_FAILED for value: "OBS_CREATE_FAILED"
     */
    public static final Status OBS_CREATE_FAILED = new Status("OBS_CREATE_FAILED");
    
    /**
     * Enum OBS_CREATE_SUCCESS for value: "OBS_CREATE_SUCCESS"
     */
    public static final Status OBS_CREATE_SUCCESS = new Status("OBS_CREATE_SUCCESS");
    
    /**
     * Enum UNKNOW for value: "UNkNOW"
     */
    public static final Status UNKNOW = new Status("UNkNOW");
    

    private static final Map<String, Status> STATIC_FIELDS = createStaticFields();

    private static Map<String, Status> createStaticFields() {
        Map<String, Status> map = new HashMap<>();
        map.put("UNCREATED", UNCREATED);
        map.put("DELETED", DELETED);
        map.put("CANCELLED", CANCELLED);
        map.put("SERVER_ERROR", SERVER_ERROR);
        map.put("UPLOAD_FAILED", UPLOAD_FAILED);
        map.put("CREATING", CREATING);
        map.put("PUBLISHED", PUBLISHED);
        map.put("WAITING_TRANSCODE", WAITING_TRANSCODE);
        map.put("TRANSCODING", TRANSCODING);
        map.put("TRANSCODE_FAILED", TRANSCODE_FAILED);
        map.put("TRANSCODE_SUCCEED", TRANSCODE_SUCCEED);
        map.put("CREATED", CREATED);
        map.put("UNPUBLISHED", UNPUBLISHED);
        map.put("NO_ASSET", NO_ASSET);
        map.put("DELETING", DELETING);
        map.put("DELETE_FAILED", DELETE_FAILED);
        map.put("OBS_CREATING", OBS_CREATING);
        map.put("OBS_CREATE_FAILED", OBS_CREATE_FAILED);
        map.put("OBS_CREATE_SUCCESS", OBS_CREATE_SUCCESS);
        map.put("UNkNOW", UNKNOW);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Status(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return String.valueOf(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Status fromValue(String value) {
        if( value == null ){
            return null;
        }
        Status result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new Status(value);
        }
        return result;
    }

    public static Status valueOf(String value) {
        if( value == null ){
            return null;
        }
        Status result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Status) {
            return this.value.equals(((Status) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

