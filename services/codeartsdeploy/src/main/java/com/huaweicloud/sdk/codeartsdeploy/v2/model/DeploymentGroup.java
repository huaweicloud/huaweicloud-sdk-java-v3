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
 * 主机集群详细信息
 */
public class DeploymentGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * 操作信息：windows|linux
     */
    public static final class OsEnum {

        /**
         * Enum WINDOWS for value: "windows"
         */
        public static final OsEnum WINDOWS = new OsEnum("windows");

        /**
         * Enum LINUX for value: "linux"
         */
        public static final OsEnum LINUX = new OsEnum("linux");

        private static final Map<String, OsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEnum> createStaticFields() {
            Map<String, OsEnum> map = new HashMap<>();
            map.put("windows", WINDOWS);
            map.put("linux", LINUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsEnum(String value) {
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
        public static OsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsEnum(value);
            }
            return result;
        }

        public static OsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsEnum) {
                return this.value.equals(((OsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private OsEnum os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_cluster_id")

    private String slaveClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_proxy_mode")

    private Integer isProxyMode;

    public DeploymentGroup withName(String name) {
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

    public DeploymentGroup withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 局点信息
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public DeploymentGroup withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DeploymentGroup withOs(OsEnum os) {
        this.os = os;
        return this;
    }

    /**
     * 操作信息：windows|linux
     * @return os
     */
    public OsEnum getOs() {
        return os;
    }

    public void setOs(OsEnum os) {
        this.os = os;
    }

    public DeploymentGroup withSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
        return this;
    }

    /**
     * slave集群id，默认为null时使用默认slave集群，用户自定义slave时为slave集群id
     * @return slaveClusterId
     */
    public String getSlaveClusterId() {
        return slaveClusterId;
    }

    public void setSlaveClusterId(String slaveClusterId) {
        this.slaveClusterId = slaveClusterId;
    }

    public DeploymentGroup withDescription(String description) {
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

    public DeploymentGroup withIsProxyMode(Integer isProxyMode) {
        this.isProxyMode = isProxyMode;
        return this;
    }

    /**
     * 主机集群是否为代理类型
     * @return isProxyMode
     */
    public Integer getIsProxyMode() {
        return isProxyMode;
    }

    public void setIsProxyMode(Integer isProxyMode) {
        this.isProxyMode = isProxyMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentGroup deploymentGroup = (DeploymentGroup) o;
        return Objects.equals(this.name, deploymentGroup.name)
            && Objects.equals(this.regionName, deploymentGroup.regionName)
            && Objects.equals(this.projectId, deploymentGroup.projectId) && Objects.equals(this.os, deploymentGroup.os)
            && Objects.equals(this.slaveClusterId, deploymentGroup.slaveClusterId)
            && Objects.equals(this.description, deploymentGroup.description)
            && Objects.equals(this.isProxyMode, deploymentGroup.isProxyMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regionName, projectId, os, slaveClusterId, description, isProxyMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentGroup {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    slaveClusterId: ").append(toIndentedString(slaveClusterId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isProxyMode: ").append(toIndentedString(isProxyMode)).append("\n");
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
