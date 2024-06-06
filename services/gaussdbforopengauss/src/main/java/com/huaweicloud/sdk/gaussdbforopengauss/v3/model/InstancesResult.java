package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * InstancesResult
 */
public class InstancesResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_size")

    private BigDecimal dataVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * 部署形态。
     */
    public static final class ModeEnum {

        /**
         * Enum HA for value: "Ha"
         */
        public static final ModeEnum HA = new ModeEnum("Ha");

        /**
         * Enum INDEPENDENT for value: "Independent"
         */
        public static final ModeEnum INDEPENDENT = new ModeEnum("Independent");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Ha", HA);
            map.put("Independent", INDEPENDENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    /**
     * 实例模型，企业版，标准版，基础版。
     */
    public static final class InstanceModeEnum {

        /**
         * Enum ENTERPRISE for value: "enterprise"
         */
        public static final InstanceModeEnum ENTERPRISE = new InstanceModeEnum("enterprise");

        /**
         * Enum STANDARD for value: "standard"
         */
        public static final InstanceModeEnum STANDARD = new InstanceModeEnum("standard");

        /**
         * Enum BASIC for value: "basic"
         */
        public static final InstanceModeEnum BASIC = new InstanceModeEnum("basic");

        private static final Map<String, InstanceModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceModeEnum> createStaticFields() {
            Map<String, InstanceModeEnum> map = new HashMap<>();
            map.put("enterprise", ENTERPRISE);
            map.put("standard", STANDARD);
            map.put("basic", BASIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceModeEnum(String value) {
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
        public static InstanceModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceModeEnum(value));
        }

        public static InstanceModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceModeEnum) {
                return this.value.equals(((InstanceModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_mode")

    private InstanceModeEnum instanceMode;

    public InstancesResult withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InstancesResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstancesResult withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 存储类型。
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public InstancesResult withDataVolumeSize(BigDecimal dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
        return this;
    }

    /**
     * 磁盘大小，单位：GB。
     * @return dataVolumeSize
     */
    public BigDecimal getDataVolumeSize() {
        return dataVolumeSize;
    }

    public void setDataVolumeSize(BigDecimal dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
    }

    public InstancesResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 实例版本信息。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public InstancesResult withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 部署形态。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public InstancesResult withInstanceMode(InstanceModeEnum instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    /**
     * 实例模型，企业版，标准版，基础版。
     * @return instanceMode
     */
    public InstanceModeEnum getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(InstanceModeEnum instanceMode) {
        this.instanceMode = instanceMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstancesResult that = (InstancesResult) obj;
        return Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.volumeType, that.volumeType)
            && Objects.equals(this.dataVolumeSize, that.dataVolumeSize) && Objects.equals(this.version, that.version)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.instanceMode, that.instanceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName, instanceId, volumeType, dataVolumeSize, version, mode, instanceMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesResult {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    dataVolumeSize: ").append(toIndentedString(dataVolumeSize)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
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
