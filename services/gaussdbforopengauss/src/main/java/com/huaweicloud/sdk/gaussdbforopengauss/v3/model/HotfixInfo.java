package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 热补丁信息。
 */
public class HotfixInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * 通用非通用信息,common=通用补丁,certain=定制补丁。
     */
    public static final class CommonPatchEnum {

        /**
         * Enum COMMON for value: "common"
         */
        public static final CommonPatchEnum COMMON = new CommonPatchEnum("common");

        /**
         * Enum CERTAIN for value: "certain"
         */
        public static final CommonPatchEnum CERTAIN = new CommonPatchEnum("certain");

        private static final Map<String, CommonPatchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CommonPatchEnum> createStaticFields() {
            Map<String, CommonPatchEnum> map = new HashMap<>();
            map.put("common", COMMON);
            map.put("certain", CERTAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CommonPatchEnum(String value) {
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
        public static CommonPatchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CommonPatchEnum(value));
        }

        public static CommonPatchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CommonPatchEnum) {
                return this.value.equals(((CommonPatchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_patch")

    private CommonPatchEnum commonPatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_sensitive")

    private Boolean backupSensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descripition")

    private String descripition;

    public HotfixInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 热补丁版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public HotfixInfo withCommonPatch(CommonPatchEnum commonPatch) {
        this.commonPatch = commonPatch;
        return this;
    }

    /**
     * 通用非通用信息,common=通用补丁,certain=定制补丁。
     * @return commonPatch
     */
    public CommonPatchEnum getCommonPatch() {
        return commonPatch;
    }

    public void setCommonPatch(CommonPatchEnum commonPatch) {
        this.commonPatch = commonPatch;
    }

    public HotfixInfo withBackupSensitive(Boolean backupSensitive) {
        this.backupSensitive = backupSensitive;
        return this;
    }

    /**
     * 是否和备份相关。
     * @return backupSensitive
     */
    public Boolean getBackupSensitive() {
        return backupSensitive;
    }

    public void setBackupSensitive(Boolean backupSensitive) {
        this.backupSensitive = backupSensitive;
    }

    public HotfixInfo withDescripition(String descripition) {
        this.descripition = descripition;
        return this;
    }

    /**
     * 补丁的描述信息。
     * @return descripition
     */
    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HotfixInfo that = (HotfixInfo) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.commonPatch, that.commonPatch)
            && Objects.equals(this.backupSensitive, that.backupSensitive)
            && Objects.equals(this.descripition, that.descripition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, commonPatch, backupSensitive, descripition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotfixInfo {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    commonPatch: ").append(toIndentedString(commonPatch)).append("\n");
        sb.append("    backupSensitive: ").append(toIndentedString(backupSensitive)).append("\n");
        sb.append("    descripition: ").append(toIndentedString(descripition)).append("\n");
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
