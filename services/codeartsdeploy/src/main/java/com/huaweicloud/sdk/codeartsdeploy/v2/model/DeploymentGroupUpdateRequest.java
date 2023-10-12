package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 
 */
public class DeploymentGroupUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_cluster_id")

    private String slaveClusterId;

    /**
     * 自动测试功能已下架，该字段已失效
     */
    public static final class AutoConnectionTestSwitchEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AutoConnectionTestSwitchEnum NUMBER_0 = new AutoConnectionTestSwitchEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AutoConnectionTestSwitchEnum NUMBER_1 = new AutoConnectionTestSwitchEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final AutoConnectionTestSwitchEnum NUMBER_2 = new AutoConnectionTestSwitchEnum(2);

        private static final Map<Integer, AutoConnectionTestSwitchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AutoConnectionTestSwitchEnum> createStaticFields() {
            Map<Integer, AutoConnectionTestSwitchEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AutoConnectionTestSwitchEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AutoConnectionTestSwitchEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new AutoConnectionTestSwitchEnum(value));
        }

        public static AutoConnectionTestSwitchEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AutoConnectionTestSwitchEnum) {
                return this.value.equals(((AutoConnectionTestSwitchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_connection_test_switch")

    private AutoConnectionTestSwitchEnum autoConnectionTestSwitch;

    public DeploymentGroupUpdateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主机集群名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeploymentGroupUpdateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeploymentGroupUpdateRequest withSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
        return this;
    }

    /**
     * 自定义slave资源池id
     * @return slaveClusterId
     */
    public String getSlaveClusterId() {
        return slaveClusterId;
    }

    public void setSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
    }

    public DeploymentGroupUpdateRequest withAutoConnectionTestSwitch(
        AutoConnectionTestSwitchEnum autoConnectionTestSwitch) {
        this.autoConnectionTestSwitch = autoConnectionTestSwitch;
        return this;
    }

    /**
     * 自动测试功能已下架，该字段已失效
     * @return autoConnectionTestSwitch
     */
    public AutoConnectionTestSwitchEnum getAutoConnectionTestSwitch() {
        return autoConnectionTestSwitch;
    }

    public void setAutoConnectionTestSwitch(AutoConnectionTestSwitchEnum autoConnectionTestSwitch) {
        this.autoConnectionTestSwitch = autoConnectionTestSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeploymentGroupUpdateRequest that = (DeploymentGroupUpdateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.slaveClusterId, that.slaveClusterId)
            && Objects.equals(this.autoConnectionTestSwitch, that.autoConnectionTestSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, slaveClusterId, autoConnectionTestSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentGroupUpdateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    slaveClusterId: ").append(toIndentedString(slaveClusterId)).append("\n");
        sb.append("    autoConnectionTestSwitch: ").append(toIndentedString(autoConnectionTestSwitch)).append("\n");
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
