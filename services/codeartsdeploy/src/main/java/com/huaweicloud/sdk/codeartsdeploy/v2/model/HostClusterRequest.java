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
 * HostClusterRequest
 */
public class HostClusterRequest {

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
     * 资源池类型，self-hosted 自托管资源池，exclusive 独享资源池
     */
    public static final class SlaveResourceTypeEnum {

        /**
         * Enum SELF_HOSTED for value: "self-hosted"
         */
        public static final SlaveResourceTypeEnum SELF_HOSTED = new SlaveResourceTypeEnum("self-hosted");

        /**
         * Enum EXCLUSIVE for value: "exclusive"
         */
        public static final SlaveResourceTypeEnum EXCLUSIVE = new SlaveResourceTypeEnum("exclusive");

        private static final Map<String, SlaveResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SlaveResourceTypeEnum> createStaticFields() {
            Map<String, SlaveResourceTypeEnum> map = new HashMap<>();
            map.put("self-hosted", SELF_HOSTED);
            map.put("exclusive", EXCLUSIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SlaveResourceTypeEnum(String value) {
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
        public static SlaveResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SlaveResourceTypeEnum(value));
        }

        public static SlaveResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SlaveResourceTypeEnum) {
                return this.value.equals(((SlaveResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_resource_type")

    private SlaveResourceTypeEnum slaveResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ansible_type")

    private Integer ansibleType;

    public HostClusterRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主机集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HostClusterRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 主机集群描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HostClusterRequest withSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
        return this;
    }

    /**
     * slave集群id，默认为null时使用八爪鱼slave集群，用户自定义slave时为slave集群id
     * @return slaveClusterId
     */
    public String getSlaveClusterId() {
        return slaveClusterId;
    }

    public void setSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
    }

    public HostClusterRequest withSlaveResourceType(SlaveResourceTypeEnum slaveResourceType) {
        this.slaveResourceType = slaveResourceType;
        return this;
    }

    /**
     * 资源池类型，self-hosted 自托管资源池，exclusive 独享资源池
     * @return slaveResourceType
     */
    public SlaveResourceTypeEnum getSlaveResourceType() {
        return slaveResourceType;
    }

    public void setSlaveResourceType(SlaveResourceTypeEnum slaveResourceType) {
        this.slaveResourceType = slaveResourceType;
    }

    public HostClusterRequest withAnsibleType(Integer ansibleType) {
        this.ansibleType = ansibleType;
        return this;
    }

    /**
     * 是否切换新系统支持，1：是 0：否
     * @return ansibleType
     */
    public Integer getAnsibleType() {
        return ansibleType;
    }

    public void setAnsibleType(Integer ansibleType) {
        this.ansibleType = ansibleType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostClusterRequest that = (HostClusterRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.slaveClusterId, that.slaveClusterId)
            && Objects.equals(this.slaveResourceType, that.slaveResourceType)
            && Objects.equals(this.ansibleType, that.ansibleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, slaveClusterId, slaveResourceType, ansibleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostClusterRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    slaveClusterId: ").append(toIndentedString(slaveClusterId)).append("\n");
        sb.append("    slaveResourceType: ").append(toIndentedString(slaveResourceType)).append("\n");
        sb.append("    ansibleType: ").append(toIndentedString(ansibleType)).append("\n");
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
