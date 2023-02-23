package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowSyncPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_known_version")

    private Long lastKnownVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supports_policy_deltas")

    private Boolean supportsPolicyDeltas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_return_policy_data")

    private Boolean isReturnPolicyData;

    public ShowSyncPolicyRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * instance id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowSyncPolicyRequest withLastKnownVersion(Long lastKnownVersion) {
        this.lastKnownVersion = lastKnownVersion;
        return this;
    }

    /**
     * lastKnownVersion
     * minimum: -1
     * @return lastKnownVersion
     */
    public Long getLastKnownVersion() {
        return lastKnownVersion;
    }

    public void setLastKnownVersion(Long lastKnownVersion) {
        this.lastKnownVersion = lastKnownVersion;
    }

    public ShowSyncPolicyRequest withSupportsPolicyDeltas(Boolean supportsPolicyDeltas) {
        this.supportsPolicyDeltas = supportsPolicyDeltas;
        return this;
    }

    /**
     * supportsPolicyDeltas
     * @return supportsPolicyDeltas
     */
    public Boolean getSupportsPolicyDeltas() {
        return supportsPolicyDeltas;
    }

    public void setSupportsPolicyDeltas(Boolean supportsPolicyDeltas) {
        this.supportsPolicyDeltas = supportsPolicyDeltas;
    }

    public ShowSyncPolicyRequest withIsReturnPolicyData(Boolean isReturnPolicyData) {
        this.isReturnPolicyData = isReturnPolicyData;
        return this;
    }

    /**
     * isReturnPolicyData
     * @return isReturnPolicyData
     */
    public Boolean getIsReturnPolicyData() {
        return isReturnPolicyData;
    }

    public void setIsReturnPolicyData(Boolean isReturnPolicyData) {
        this.isReturnPolicyData = isReturnPolicyData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSyncPolicyRequest showSyncPolicyRequest = (ShowSyncPolicyRequest) o;
        return Objects.equals(this.instanceId, showSyncPolicyRequest.instanceId)
            && Objects.equals(this.lastKnownVersion, showSyncPolicyRequest.lastKnownVersion)
            && Objects.equals(this.supportsPolicyDeltas, showSyncPolicyRequest.supportsPolicyDeltas)
            && Objects.equals(this.isReturnPolicyData, showSyncPolicyRequest.isReturnPolicyData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, lastKnownVersion, supportsPolicyDeltas, isReturnPolicyData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSyncPolicyRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    lastKnownVersion: ").append(toIndentedString(lastKnownVersion)).append("\n");
        sb.append("    supportsPolicyDeltas: ").append(toIndentedString(supportsPolicyDeltas)).append("\n");
        sb.append("    isReturnPolicyData: ").append(toIndentedString(isReturnPolicyData)).append("\n");
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
