package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DebugCaseRequestBody
 */
public class DebugCaseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private Integer clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_package")

    private Integer withoutPackage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    public DebugCaseRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态（9：启动调试）
     * minimum: 0
     * maximum: 2147483647
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DebugCaseRequestBody withClusterId(Integer clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 资源组id
     * minimum: 0
     * maximum: 2147483647
     * @return clusterId
     */
    public Integer getClusterId() {
        return clusterId;
    }

    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    public DebugCaseRequestBody withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 资源组类型（共享资源组：shared-cluster-internet；私有资源组：private-cluster）
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public DebugCaseRequestBody withWithoutPackage(Integer withoutPackage) {
        this.withoutPackage = withoutPackage;
        return this;
    }

    /**
     * 套餐包VUM不足的情况下用户选择是不是要走按需计费模式（当前版本固定值：0）
     * minimum: 0
     * maximum: 2147483647
     * @return withoutPackage
     */
    public Integer getWithoutPackage() {
        return withoutPackage;
    }

    public void setWithoutPackage(Integer withoutPackage) {
        this.withoutPackage = withoutPackage;
    }

    public DebugCaseRequestBody withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 类型（0：事务（默认）；1：用例）
     * minimum: 0
     * maximum: 1
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugCaseRequestBody that = (DebugCaseRequestBody) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.withoutPackage, that.withoutPackage) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, clusterId, clusterType, withoutPackage, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugCaseRequestBody {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    withoutPackage: ").append(toIndentedString(withoutPackage)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
