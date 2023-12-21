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
 * UpdateStorageModeReq
 */
public class UpdateStorageModeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    /**
     * 存储模式。 取值如下： - STANDARD：标准存储。 - WARM：低频存储。 - COLD：归档存储。 
     */
    public static final class StorageModeEnum {

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final StorageModeEnum STANDARD = new StorageModeEnum("STANDARD");

        /**
         * Enum WARM for value: "WARM"
         */
        public static final StorageModeEnum WARM = new StorageModeEnum("WARM");

        /**
         * Enum COLD for value: "COLD"
         */
        public static final StorageModeEnum COLD = new StorageModeEnum("COLD");

        private static final Map<String, StorageModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StorageModeEnum> createStaticFields() {
            Map<String, StorageModeEnum> map = new HashMap<>();
            map.put("STANDARD", STANDARD);
            map.put("WARM", WARM);
            map.put("COLD", COLD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StorageModeEnum(String value) {
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
        public static StorageModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageModeEnum(value));
        }

        public static StorageModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StorageModeEnum) {
                return this.value.equals(((StorageModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mode")

    private StorageModeEnum storageMode;

    /**
     * 归档恢复方式。 取值如下： - TEMP：临时 - FOREVER：永久 
     */
    public static final class RestoreModeEnum {

        /**
         * Enum TEMP for value: "TEMP"
         */
        public static final RestoreModeEnum TEMP = new RestoreModeEnum("TEMP");

        /**
         * Enum FOREVER for value: "FOREVER"
         */
        public static final RestoreModeEnum FOREVER = new RestoreModeEnum("FOREVER");

        private static final Map<String, RestoreModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RestoreModeEnum> createStaticFields() {
            Map<String, RestoreModeEnum> map = new HashMap<>();
            map.put("TEMP", TEMP);
            map.put("FOREVER", FOREVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RestoreModeEnum(String value) {
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
        public static RestoreModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RestoreModeEnum(value));
        }

        public static RestoreModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RestoreModeEnum) {
                return this.value.equals(((RestoreModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_mode")

    private RestoreModeEnum restoreMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "days")

    private Integer days;

    /**
     * 归档恢复选项，快速恢复EXPEDITED，标准恢复STANDARD，默认快速恢复 
     */
    public static final class RestoreTierEnum {

        /**
         * Enum EXPEDITED for value: "EXPEDITED"
         */
        public static final RestoreTierEnum EXPEDITED = new RestoreTierEnum("EXPEDITED");

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final RestoreTierEnum STANDARD = new RestoreTierEnum("STANDARD");

        private static final Map<String, RestoreTierEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RestoreTierEnum> createStaticFields() {
            Map<String, RestoreTierEnum> map = new HashMap<>();
            map.put("EXPEDITED", EXPEDITED);
            map.put("STANDARD", STANDARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RestoreTierEnum(String value) {
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
        public static RestoreTierEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RestoreTierEnum(value));
        }

        public static RestoreTierEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RestoreTierEnum) {
                return this.value.equals(((RestoreTierEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_tier")

    private RestoreTierEnum restoreTier;

    public UpdateStorageModeReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 原媒资id 
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public UpdateStorageModeReq withStorageMode(StorageModeEnum storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    /**
     * 存储模式。 取值如下： - STANDARD：标准存储。 - WARM：低频存储。 - COLD：归档存储。 
     * @return storageMode
     */
    public StorageModeEnum getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(StorageModeEnum storageMode) {
        this.storageMode = storageMode;
    }

    public UpdateStorageModeReq withRestoreMode(RestoreModeEnum restoreMode) {
        this.restoreMode = restoreMode;
        return this;
    }

    /**
     * 归档恢复方式。 取值如下： - TEMP：临时 - FOREVER：永久 
     * @return restoreMode
     */
    public RestoreModeEnum getRestoreMode() {
        return restoreMode;
    }

    public void setRestoreMode(RestoreModeEnum restoreMode) {
        this.restoreMode = restoreMode;
    }

    public UpdateStorageModeReq withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * 从归档转标准存储且选择临时恢复时临时恢复时间。 
     * minimum: 1
     * maximum: 30
     * @return days
     */
    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public UpdateStorageModeReq withRestoreTier(RestoreTierEnum restoreTier) {
        this.restoreTier = restoreTier;
        return this;
    }

    /**
     * 归档恢复选项，快速恢复EXPEDITED，标准恢复STANDARD，默认快速恢复 
     * @return restoreTier
     */
    public RestoreTierEnum getRestoreTier() {
        return restoreTier;
    }

    public void setRestoreTier(RestoreTierEnum restoreTier) {
        this.restoreTier = restoreTier;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateStorageModeReq that = (UpdateStorageModeReq) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.storageMode, that.storageMode)
            && Objects.equals(this.restoreMode, that.restoreMode) && Objects.equals(this.days, that.days)
            && Objects.equals(this.restoreTier, that.restoreTier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, storageMode, restoreMode, days, restoreTier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStorageModeReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
        sb.append("    restoreMode: ").append(toIndentedString(restoreMode)).append("\n");
        sb.append("    days: ").append(toIndentedString(days)).append("\n");
        sb.append("    restoreTier: ").append(toIndentedString(restoreTier)).append("\n");
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
