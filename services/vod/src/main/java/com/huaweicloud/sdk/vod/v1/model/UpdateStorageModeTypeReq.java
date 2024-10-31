package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateStorageModeTypeReq
 */
public class UpdateStorageModeTypeReq {

    /**
     * 降冷模式。 取值如下： - WHOLE：整个媒资粒度。 - ORIGIN：原文件粒度。 
     */
    public static final class StorageModeTypeEnum {

        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final StorageModeTypeEnum WHOLE = new StorageModeTypeEnum("WHOLE");

        /**
         * Enum ORIGIN for value: "ORIGIN"
         */
        public static final StorageModeTypeEnum ORIGIN = new StorageModeTypeEnum("ORIGIN");

        private static final Map<String, StorageModeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageModeTypeEnum> createStaticFields() {
            Map<String, StorageModeTypeEnum> map = new HashMap<>();
            map.put("WHOLE", WHOLE);
            map.put("ORIGIN", ORIGIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageModeTypeEnum(String value) {
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
        public static StorageModeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageModeTypeEnum(value));
        }

        public static StorageModeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageModeTypeEnum) {
                return this.value.equals(((StorageModeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mode_type")

    private StorageModeTypeEnum storageModeType;

    public UpdateStorageModeTypeReq withStorageModeType(StorageModeTypeEnum storageModeType) {
        this.storageModeType = storageModeType;
        return this;
    }

    /**
     * 降冷模式。 取值如下： - WHOLE：整个媒资粒度。 - ORIGIN：原文件粒度。 
     * @return storageModeType
     */
    public StorageModeTypeEnum getStorageModeType() {
        return storageModeType;
    }

    public void setStorageModeType(StorageModeTypeEnum storageModeType) {
        this.storageModeType = storageModeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateStorageModeTypeReq that = (UpdateStorageModeTypeReq) obj;
        return Objects.equals(this.storageModeType, that.storageModeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageModeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStorageModeTypeReq {\n");
        sb.append("    storageModeType: ").append(toIndentedString(storageModeType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
