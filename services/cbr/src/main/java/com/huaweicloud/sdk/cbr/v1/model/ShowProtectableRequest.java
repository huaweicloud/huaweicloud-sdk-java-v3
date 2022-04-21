package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowProtectableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 可保护性类型
     */
    public static final class ProtectableTypeEnum {

        /**
         * Enum SERVER for value: "server"
         */
        public static final ProtectableTypeEnum SERVER = new ProtectableTypeEnum("server");

        /**
         * Enum DISK for value: "disk"
         */
        public static final ProtectableTypeEnum DISK = new ProtectableTypeEnum("disk");

        private static final Map<String, ProtectableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectableTypeEnum> createStaticFields() {
            Map<String, ProtectableTypeEnum> map = new HashMap<>();
            map.put("server", SERVER);
            map.put("disk", DISK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectableTypeEnum(String value) {
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
        public static ProtectableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtectableTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtectableTypeEnum(value);
            }
            return result;
        }

        public static ProtectableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtectableTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectableTypeEnum) {
                return this.value.equals(((ProtectableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protectable_type")

    private ProtectableTypeEnum protectableType;

    public ShowProtectableRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 资源ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowProtectableRequest withProtectableType(ProtectableTypeEnum protectableType) {
        this.protectableType = protectableType;
        return this;
    }

    /**
     * 可保护性类型
     * @return protectableType
     */
    public ProtectableTypeEnum getProtectableType() {
        return protectableType;
    }

    public void setProtectableType(ProtectableTypeEnum protectableType) {
        this.protectableType = protectableType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProtectableRequest showProtectableRequest = (ShowProtectableRequest) o;
        return Objects.equals(this.instanceId, showProtectableRequest.instanceId)
            && Objects.equals(this.protectableType, showProtectableRequest.protectableType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, protectableType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProtectableRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    protectableType: ").append(toIndentedString(protectableType)).append("\n");
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
