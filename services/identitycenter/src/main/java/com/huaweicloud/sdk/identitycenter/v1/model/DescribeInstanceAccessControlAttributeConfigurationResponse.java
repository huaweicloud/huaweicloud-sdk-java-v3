package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DescribeInstanceAccessControlAttributeConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_access_control_attribute_configuration")

    private InstanceAccessControlAttributeConfigurationDto instanceAccessControlAttributeConfiguration;

    /**
     * ABAC属性配置的状态
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final StatusEnum ENABLED = new StatusEnum("ENABLED");

        /**
         * Enum CREATION_IN_PROGRESS for value: "CREATION_IN_PROGRESS"
         */
        public static final StatusEnum CREATION_IN_PROGRESS = new StatusEnum("CREATION_IN_PROGRESS");

        /**
         * Enum CREATION_FAILED for value: "CREATION_FAILED"
         */
        public static final StatusEnum CREATION_FAILED = new StatusEnum("CREATION_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ENABLED", ENABLED);
            map.put("CREATION_IN_PROGRESS", CREATION_IN_PROGRESS);
            map.put("CREATION_FAILED", CREATION_FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_reason")

    private String statusReason;

    public DescribeInstanceAccessControlAttributeConfigurationResponse withInstanceAccessControlAttributeConfiguration(
        InstanceAccessControlAttributeConfigurationDto instanceAccessControlAttributeConfiguration) {
        this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
        return this;
    }

    public DescribeInstanceAccessControlAttributeConfigurationResponse withInstanceAccessControlAttributeConfiguration(
        Consumer<InstanceAccessControlAttributeConfigurationDto> instanceAccessControlAttributeConfigurationSetter) {
        if (this.instanceAccessControlAttributeConfiguration == null) {
            this.instanceAccessControlAttributeConfiguration = new InstanceAccessControlAttributeConfigurationDto();
            instanceAccessControlAttributeConfigurationSetter.accept(this.instanceAccessControlAttributeConfiguration);
        }

        return this;
    }

    /**
     * Get instanceAccessControlAttributeConfiguration
     * @return instanceAccessControlAttributeConfiguration
     */
    public InstanceAccessControlAttributeConfigurationDto getInstanceAccessControlAttributeConfiguration() {
        return instanceAccessControlAttributeConfiguration;
    }

    public void setInstanceAccessControlAttributeConfiguration(
        InstanceAccessControlAttributeConfigurationDto instanceAccessControlAttributeConfiguration) {
        this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
    }

    public DescribeInstanceAccessControlAttributeConfigurationResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * ABAC属性配置的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public DescribeInstanceAccessControlAttributeConfigurationResponse withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * 提供有关指定属性的当前状态的更多详细信息
     * @return statusReason
     */
    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeInstanceAccessControlAttributeConfigurationResponse that =
            (DescribeInstanceAccessControlAttributeConfigurationResponse) obj;
        return Objects.equals(this.instanceAccessControlAttributeConfiguration,
            that.instanceAccessControlAttributeConfiguration) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusReason, that.statusReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceAccessControlAttributeConfiguration, status, statusReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeInstanceAccessControlAttributeConfigurationResponse {\n");
        sb.append("    instanceAccessControlAttributeConfiguration: ")
            .append(toIndentedString(instanceAccessControlAttributeConfiguration))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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
