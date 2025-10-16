package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowClusterSupportConfigurationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterType")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterVersion")

    private String clusterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networkMode")

    private String networkMode;

    public ShowClusterSupportConfigurationRequest withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * **参数解释**： 该参数用于过滤集群架构 **约束限制**： 不涉及 **取值范围**： - ARM64: 仅获取鲲鹏集群支持的配置项  **默认取值**： 不涉及
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ShowClusterSupportConfigurationRequest withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * **参数解释**： 该参数用于获取指定集群版本支持的配置项 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public ShowClusterSupportConfigurationRequest withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * **参数解释**： 该参数用于获取指定集群支持的配置项 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public ShowClusterSupportConfigurationRequest withNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    /**
     * **参数解释**： 该参数用于过滤掉集群网络模型相关配置项 **约束限制**： 不涉及 **取值范围**： - eni: 过滤掉云原生网络2.0模型相关配置  **默认取值**： 不涉及
     * @return networkMode
     */
    public String getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterSupportConfigurationRequest that = (ShowClusterSupportConfigurationRequest) obj;
        return Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.clusterVersion, that.clusterVersion)
            && Objects.equals(this.clusterID, that.clusterID) && Objects.equals(this.networkMode, that.networkMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterType, clusterVersion, clusterID, networkMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterSupportConfigurationRequest {\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    networkMode: ").append(toIndentedString(networkMode)).append("\n");
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
