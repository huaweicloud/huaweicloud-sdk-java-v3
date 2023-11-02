package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAutoScalingPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_status")

    private AutoScalingSwitchStatus switchStatus;

    public UpdateAutoScalingPolicyResponse withInstanceId(String instanceId) {
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

    public UpdateAutoScalingPolicyResponse withInstanceName(String instanceName) {
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

    public UpdateAutoScalingPolicyResponse withSwitchStatus(AutoScalingSwitchStatus switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    public UpdateAutoScalingPolicyResponse withSwitchStatus(Consumer<AutoScalingSwitchStatus> switchStatusSetter) {
        if (this.switchStatus == null) {
            this.switchStatus = new AutoScalingSwitchStatus();
            switchStatusSetter.accept(this.switchStatus);
        }

        return this;
    }

    /**
     * Get switchStatus
     * @return switchStatus
     */
    public AutoScalingSwitchStatus getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(AutoScalingSwitchStatus switchStatus) {
        this.switchStatus = switchStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAutoScalingPolicyResponse that = (UpdateAutoScalingPolicyResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.switchStatus, that.switchStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, switchStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutoScalingPolicyResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
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
