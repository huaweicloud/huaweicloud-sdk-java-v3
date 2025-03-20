package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AccessoryJsonFormatReq
 */
public class AccessoryJsonFormatReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_name")

    private String accessoryName;

    /**
     * 文件来源，创建工单附件传incident，留言附件传message
     */
    public static final class AccessoryFromEnum {

        /**
         * Enum INCIDENT for value: "incident"
         */
        public static final AccessoryFromEnum INCIDENT = new AccessoryFromEnum("incident");

        /**
         * Enum MESSAGE for value: "message"
         */
        public static final AccessoryFromEnum MESSAGE = new AccessoryFromEnum("message");

        private static final Map<String, AccessoryFromEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessoryFromEnum> createStaticFields() {
            Map<String, AccessoryFromEnum> map = new HashMap<>();
            map.put("incident", INCIDENT);
            map.put("message", MESSAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessoryFromEnum(String value) {
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
        public static AccessoryFromEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessoryFromEnum(value));
        }

        public static AccessoryFromEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessoryFromEnum) {
                return this.value.equals(((AccessoryFromEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_from")

    private AccessoryFromEnum accessoryFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_type")

    private Integer uploadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_data")

    private String accessoryData;

    public AccessoryJsonFormatReq withAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
        return this;
    }

    /**
     * 文件名称
     * @return accessoryName
     */
    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public AccessoryJsonFormatReq withAccessoryFrom(AccessoryFromEnum accessoryFrom) {
        this.accessoryFrom = accessoryFrom;
        return this;
    }

    /**
     * 文件来源，创建工单附件传incident，留言附件传message
     * @return accessoryFrom
     */
    public AccessoryFromEnum getAccessoryFrom() {
        return accessoryFrom;
    }

    public void setAccessoryFrom(AccessoryFromEnum accessoryFrom) {
        this.accessoryFrom = accessoryFrom;
    }

    public AccessoryJsonFormatReq withUploadType(Integer uploadType) {
        this.uploadType = uploadType;
        return this;
    }

    /**
     * 上传类型，默认为0，markdown模式为1
     * minimum: 0
     * maximum: 1
     * @return uploadType
     */
    public Integer getUploadType() {
        return uploadType;
    }

    public void setUploadType(Integer uploadType) {
        this.uploadType = uploadType;
    }

    public AccessoryJsonFormatReq withAccessoryData(String accessoryData) {
        this.accessoryData = accessoryData;
        return this;
    }

    /**
     * 文件内容，Base64格式
     * @return accessoryData
     */
    public String getAccessoryData() {
        return accessoryData;
    }

    public void setAccessoryData(String accessoryData) {
        this.accessoryData = accessoryData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessoryJsonFormatReq that = (AccessoryJsonFormatReq) obj;
        return Objects.equals(this.accessoryName, that.accessoryName)
            && Objects.equals(this.accessoryFrom, that.accessoryFrom)
            && Objects.equals(this.uploadType, that.uploadType)
            && Objects.equals(this.accessoryData, that.accessoryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessoryName, accessoryFrom, uploadType, accessoryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessoryJsonFormatReq {\n");
        sb.append("    accessoryName: ").append(toIndentedString(accessoryName)).append("\n");
        sb.append("    accessoryFrom: ").append(toIndentedString(accessoryFrom)).append("\n");
        sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
        sb.append("    accessoryData: ").append(toIndentedString(accessoryData)).append("\n");
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
