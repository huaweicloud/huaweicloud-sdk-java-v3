package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UpdateInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrateData")

    private String migrateData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    public UpdateInstanceRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定替换集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 指定替换节点ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateInstanceRequest withMigrateData(String migrateData) {
        this.migrateData = migrateData;
        return this;
    }

    /**
     * 是否迁移数据。
     * @return migrateData
     */
    public String getMigrateData() {
        return migrateData;
    }

    public void setMigrateData(String migrateData) {
        this.migrateData = migrateData;
    }

    public UpdateInstanceRequest withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 委托名称，委托给CSS服务，允许CSS调用您的其他云服务。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceRequest that = (UpdateInstanceRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.migrateData, that.migrateData) && Objects.equals(this.agency, that.agency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, instanceId, migrateData, agency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    migrateData: ").append(toIndentedString(migrateData)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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
