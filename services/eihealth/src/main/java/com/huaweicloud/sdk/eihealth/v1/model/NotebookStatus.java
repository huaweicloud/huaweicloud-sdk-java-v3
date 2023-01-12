package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets NotebookStatus
 */
public class NotebookStatus {

    /**
     * Enum RUNNING for value: "Running"
     */
    public static final NotebookStatus RUNNING = new NotebookStatus("Running");

    /**
     * Enum ABNORMAL for value: "Abnormal"
     */
    public static final NotebookStatus ABNORMAL = new NotebookStatus("Abnormal");

    /**
     * Enum HIBERNATE for value: "Hibernate"
     */
    public static final NotebookStatus HIBERNATE = new NotebookStatus("Hibernate");

    /**
     * Enum SUCCEEDED for value: "Succeeded"
     */
    public static final NotebookStatus SUCCEEDED = new NotebookStatus("Succeeded");

    /**
     * Enum CREATING for value: "Creating"
     */
    public static final NotebookStatus CREATING = new NotebookStatus("Creating");

    /**
     * Enum DELETING for value: "Deleting"
     */
    public static final NotebookStatus DELETING = new NotebookStatus("Deleting");

    /**
     * Enum UPDATING for value: "Updating"
     */
    public static final NotebookStatus UPDATING = new NotebookStatus("Updating");

    /**
     * Enum CREATEDFAILED for value: "CreatedFailed"
     */
    public static final NotebookStatus CREATEDFAILED = new NotebookStatus("CreatedFailed");

    /**
     * Enum DELETEDFAILED for value: "DeletedFailed"
     */
    public static final NotebookStatus DELETEDFAILED = new NotebookStatus("DeletedFailed");

    /**
     * Enum UPDATEDFAILED for value: "UpdatedFailed"
     */
    public static final NotebookStatus UPDATEDFAILED = new NotebookStatus("UpdatedFailed");

    /**
     * Enum UNKNOWN for value: "Unknown"
     */
    public static final NotebookStatus UNKNOWN = new NotebookStatus("Unknown");

    private static final Map<String, NotebookStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, NotebookStatus> createStaticFields() {
        Map<String, NotebookStatus> map = new HashMap<>();
        map.put("Running", RUNNING);
        map.put("Abnormal", ABNORMAL);
        map.put("Hibernate", HIBERNATE);
        map.put("Succeeded", SUCCEEDED);
        map.put("Creating", CREATING);
        map.put("Deleting", DELETING);
        map.put("Updating", UPDATING);
        map.put("CreatedFailed", CREATEDFAILED);
        map.put("DeletedFailed", DELETEDFAILED);
        map.put("UpdatedFailed", UPDATEDFAILED);
        map.put("Unknown", UNKNOWN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NotebookStatus(String value) {
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
    public static NotebookStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        NotebookStatus result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new NotebookStatus(value);
        }
        return result;
    }

    public static NotebookStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        NotebookStatus result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NotebookStatus) {
            return this.value.equals(((NotebookStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
