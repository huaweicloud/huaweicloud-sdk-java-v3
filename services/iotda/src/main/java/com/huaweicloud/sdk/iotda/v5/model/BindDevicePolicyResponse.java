package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BindDevicePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_targets")

    private List<String> successTargets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_targets")

    private List<DevicePolicyBindOrUnbindFailureDetail> failureTargets = null;

    public BindDevicePolicyResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public BindDevicePolicyResponse withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * **参数说明**：策略的目标类型。 **取值范围**：device|product|app，device表示设备，product表示产品，app表示整个资源空间。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public BindDevicePolicyResponse withSuccessTargets(List<String> successTargets) {
        this.successTargets = successTargets;
        return this;
    }

    public BindDevicePolicyResponse addSuccessTargetsItem(String successTargetsItem) {
        if (this.successTargets == null) {
            this.successTargets = new ArrayList<>();
        }
        this.successTargets.add(successTargetsItem);
        return this;
    }

    public BindDevicePolicyResponse withSuccessTargets(Consumer<List<String>> successTargetsSetter) {
        if (this.successTargets == null) {
            this.successTargets = new ArrayList<>();
        }
        successTargetsSetter.accept(this.successTargets);
        return this;
    }

    /**
     * 成功的目标id列表。
     * @return successTargets
     */
    public List<String> getSuccessTargets() {
        return successTargets;
    }

    public void setSuccessTargets(List<String> successTargets) {
        this.successTargets = successTargets;
    }

    public BindDevicePolicyResponse withFailureTargets(List<DevicePolicyBindOrUnbindFailureDetail> failureTargets) {
        this.failureTargets = failureTargets;
        return this;
    }

    public BindDevicePolicyResponse addFailureTargetsItem(DevicePolicyBindOrUnbindFailureDetail failureTargetsItem) {
        if (this.failureTargets == null) {
            this.failureTargets = new ArrayList<>();
        }
        this.failureTargets.add(failureTargetsItem);
        return this;
    }

    public BindDevicePolicyResponse withFailureTargets(
        Consumer<List<DevicePolicyBindOrUnbindFailureDetail>> failureTargetsSetter) {
        if (this.failureTargets == null) {
            this.failureTargets = new ArrayList<>();
        }
        failureTargetsSetter.accept(this.failureTargets);
        return this;
    }

    /**
     * 失败的目标id列表 
     * @return failureTargets
     */
    public List<DevicePolicyBindOrUnbindFailureDetail> getFailureTargets() {
        return failureTargets;
    }

    public void setFailureTargets(List<DevicePolicyBindOrUnbindFailureDetail> failureTargets) {
        this.failureTargets = failureTargets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindDevicePolicyResponse that = (BindDevicePolicyResponse) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.successTargets, that.successTargets)
            && Objects.equals(this.failureTargets, that.failureTargets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, targetType, successTargets, failureTargets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindDevicePolicyResponse {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    successTargets: ").append(toIndentedString(successTargets)).append("\n");
        sb.append("    failureTargets: ").append(toIndentedString(failureTargets)).append("\n");
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
