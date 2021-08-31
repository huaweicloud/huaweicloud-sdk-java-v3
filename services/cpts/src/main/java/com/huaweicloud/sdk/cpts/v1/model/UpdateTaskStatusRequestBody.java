package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** UpdateTaskStatusRequestBody */
public class UpdateTaskStatusRequestBody {

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
    @JsonProperty(value = "network_info")

    private UpdateTaskStatusRequestBodyNetworkInfo networkInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public UpdateTaskStatusRequestBody withClusterId(Integer clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** cluster_id minimum: 0 maximum: 2147483647
     * 
     * @return clusterId */
    public Integer getClusterId() {
        return clusterId;
    }

    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateTaskStatusRequestBody withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /** cluster_type
     * 
     * @return clusterType */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public UpdateTaskStatusRequestBody withWithoutPackage(Integer withoutPackage) {
        this.withoutPackage = withoutPackage;
        return this;
    }

    /** without_package minimum: 0 maximum: 2147483647
     * 
     * @return withoutPackage */
    public Integer getWithoutPackage() {
        return withoutPackage;
    }

    public void setWithoutPackage(Integer withoutPackage) {
        this.withoutPackage = withoutPackage;
    }

    public UpdateTaskStatusRequestBody withNetworkInfo(UpdateTaskStatusRequestBodyNetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }

    public UpdateTaskStatusRequestBody withNetworkInfo(
        Consumer<UpdateTaskStatusRequestBodyNetworkInfo> networkInfoSetter) {
        if (this.networkInfo == null) {
            this.networkInfo = new UpdateTaskStatusRequestBodyNetworkInfo();
            networkInfoSetter.accept(this.networkInfo);
        }

        return this;
    }

    /** Get networkInfo
     * 
     * @return networkInfo */
    public UpdateTaskStatusRequestBodyNetworkInfo getNetworkInfo() {
        return networkInfo;
    }

    public void setNetworkInfo(UpdateTaskStatusRequestBodyNetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    public UpdateTaskStatusRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** status minimum: 0 maximum: 2147483647
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTaskStatusRequestBody updateTaskStatusRequestBody = (UpdateTaskStatusRequestBody) o;
        return Objects.equals(this.clusterId, updateTaskStatusRequestBody.clusterId)
            && Objects.equals(this.clusterType, updateTaskStatusRequestBody.clusterType)
            && Objects.equals(this.withoutPackage, updateTaskStatusRequestBody.withoutPackage)
            && Objects.equals(this.networkInfo, updateTaskStatusRequestBody.networkInfo)
            && Objects.equals(this.status, updateTaskStatusRequestBody.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, clusterType, withoutPackage, networkInfo, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskStatusRequestBody {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    withoutPackage: ").append(toIndentedString(withoutPackage)).append("\n");
        sb.append("    networkInfo: ").append(toIndentedString(networkInfo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
