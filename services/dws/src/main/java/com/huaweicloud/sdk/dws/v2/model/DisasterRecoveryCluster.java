package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 容灾集群信息
 */
public class DisasterRecoveryCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_az")

    private String clusterAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_success_time")

    private String lastSuccessTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    public DisasterRecoveryCluster withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 容灾集群信息ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DisasterRecoveryCluster withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 容灾集群名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DisasterRecoveryCluster withClusterAz(String clusterAz) {
        this.clusterAz = clusterAz;
        return this;
    }

    /**
     * 容灾集群所在AZ
     * @return clusterAz
     */
    public String getClusterAz() {
        return clusterAz;
    }

    public void setClusterAz(String clusterAz) {
        this.clusterAz = clusterAz;
    }

    public DisasterRecoveryCluster withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 容灾集群角色
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public DisasterRecoveryCluster withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 容灾集群所在region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DisasterRecoveryCluster withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 容灾集群状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DisasterRecoveryCluster withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 容灾进度
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public DisasterRecoveryCluster withLastSuccessTime(String lastSuccessTime) {
        this.lastSuccessTime = lastSuccessTime;
        return this;
    }

    /**
     * 上一次容灾时间
     * @return lastSuccessTime
     */
    public String getLastSuccessTime() {
        return lastSuccessTime;
    }

    public void setLastSuccessTime(String lastSuccessTime) {
        this.lastSuccessTime = lastSuccessTime;
    }

    public DisasterRecoveryCluster withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * OBS桶名称
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisasterRecoveryCluster disasterRecoveryCluster = (DisasterRecoveryCluster) o;
        return Objects.equals(this.id, disasterRecoveryCluster.id)
            && Objects.equals(this.name, disasterRecoveryCluster.name)
            && Objects.equals(this.clusterAz, disasterRecoveryCluster.clusterAz)
            && Objects.equals(this.role, disasterRecoveryCluster.role)
            && Objects.equals(this.region, disasterRecoveryCluster.region)
            && Objects.equals(this.status, disasterRecoveryCluster.status)
            && Objects.equals(this.progress, disasterRecoveryCluster.progress)
            && Objects.equals(this.lastSuccessTime, disasterRecoveryCluster.lastSuccessTime)
            && Objects.equals(this.obsBucketName, disasterRecoveryCluster.obsBucketName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, clusterAz, role, region, status, progress, lastSuccessTime, obsBucketName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisasterRecoveryCluster {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    clusterAz: ").append(toIndentedString(clusterAz)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    lastSuccessTime: ").append(toIndentedString(lastSuccessTime)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
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
