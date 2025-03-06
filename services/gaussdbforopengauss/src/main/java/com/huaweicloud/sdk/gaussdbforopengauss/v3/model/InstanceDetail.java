package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceDetail
 */
public class InstanceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private String solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hotfix_versions")

    private String hotfixVersions;

    public InstanceDetail withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceDetail withInstanceName(String instanceName) {
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

    public InstanceDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public InstanceDetail withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * 实例部署形态。
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public InstanceDetail withHotfixVersions(String hotfixVersions) {
        this.hotfixVersions = hotfixVersions;
        return this;
    }

    /**
     * 已升级热补丁版本。
     * @return hotfixVersions
     */
    public String getHotfixVersions() {
        return hotfixVersions;
    }

    public void setHotfixVersions(String hotfixVersions) {
        this.hotfixVersions = hotfixVersions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDetail that = (InstanceDetail) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.solution, that.solution) && Objects.equals(this.hotfixVersions, that.hotfixVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, status, type, solution, hotfixVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetail {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    hotfixVersions: ").append(toIndentedString(hotfixVersions)).append("\n");
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
