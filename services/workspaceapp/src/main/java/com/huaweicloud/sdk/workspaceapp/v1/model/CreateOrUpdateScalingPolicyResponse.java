package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateOrUpdateScalingPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_scaling_amount")

    private Integer maxScalingAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_expansion_count")

    private Integer singleExpansionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_by_session")

    private ScalingPolicyBySession scalingPolicyBySession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_policy_by_resource")

    private ScalingPolicyByResource scalingPolicyByResource;

    public CreateOrUpdateScalingPolicyResponse withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用策略,默认启用： 'true': 启用 'false': 禁用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CreateOrUpdateScalingPolicyResponse withMaxScalingAmount(Integer maxScalingAmount) {
        this.maxScalingAmount = maxScalingAmount;
        return this;
    }

    /**
     * 最大扩容数量。
     * minimum: 1
     * maximum: 100
     * @return maxScalingAmount
     */
    public Integer getMaxScalingAmount() {
        return maxScalingAmount;
    }

    public void setMaxScalingAmount(Integer maxScalingAmount) {
        this.maxScalingAmount = maxScalingAmount;
    }

    public CreateOrUpdateScalingPolicyResponse withSingleExpansionCount(Integer singleExpansionCount) {
        this.singleExpansionCount = singleExpansionCount;
        return this;
    }

    /**
     * 单次扩容数量。
     * minimum: 1
     * maximum: 10
     * @return singleExpansionCount
     */
    public Integer getSingleExpansionCount() {
        return singleExpansionCount;
    }

    public void setSingleExpansionCount(Integer singleExpansionCount) {
        this.singleExpansionCount = singleExpansionCount;
    }

    public CreateOrUpdateScalingPolicyResponse withScalingPolicyBySession(
        ScalingPolicyBySession scalingPolicyBySession) {
        this.scalingPolicyBySession = scalingPolicyBySession;
        return this;
    }

    public CreateOrUpdateScalingPolicyResponse withScalingPolicyBySession(
        Consumer<ScalingPolicyBySession> scalingPolicyBySessionSetter) {
        if (this.scalingPolicyBySession == null) {
            this.scalingPolicyBySession = new ScalingPolicyBySession();
            scalingPolicyBySessionSetter.accept(this.scalingPolicyBySession);
        }

        return this;
    }

    /**
     * Get scalingPolicyBySession
     * @return scalingPolicyBySession
     */
    public ScalingPolicyBySession getScalingPolicyBySession() {
        return scalingPolicyBySession;
    }

    public void setScalingPolicyBySession(ScalingPolicyBySession scalingPolicyBySession) {
        this.scalingPolicyBySession = scalingPolicyBySession;
    }

    public CreateOrUpdateScalingPolicyResponse withScalingPolicyByResource(
        ScalingPolicyByResource scalingPolicyByResource) {
        this.scalingPolicyByResource = scalingPolicyByResource;
        return this;
    }

    public CreateOrUpdateScalingPolicyResponse withScalingPolicyByResource(
        Consumer<ScalingPolicyByResource> scalingPolicyByResourceSetter) {
        if (this.scalingPolicyByResource == null) {
            this.scalingPolicyByResource = new ScalingPolicyByResource();
            scalingPolicyByResourceSetter.accept(this.scalingPolicyByResource);
        }

        return this;
    }

    /**
     * Get scalingPolicyByResource
     * @return scalingPolicyByResource
     */
    public ScalingPolicyByResource getScalingPolicyByResource() {
        return scalingPolicyByResource;
    }

    public void setScalingPolicyByResource(ScalingPolicyByResource scalingPolicyByResource) {
        this.scalingPolicyByResource = scalingPolicyByResource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOrUpdateScalingPolicyResponse that = (CreateOrUpdateScalingPolicyResponse) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.maxScalingAmount, that.maxScalingAmount)
            && Objects.equals(this.singleExpansionCount, that.singleExpansionCount)
            && Objects.equals(this.scalingPolicyBySession, that.scalingPolicyBySession)
            && Objects.equals(this.scalingPolicyByResource, that.scalingPolicyByResource);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enable, maxScalingAmount, singleExpansionCount, scalingPolicyBySession, scalingPolicyByResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrUpdateScalingPolicyResponse {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    maxScalingAmount: ").append(toIndentedString(maxScalingAmount)).append("\n");
        sb.append("    singleExpansionCount: ").append(toIndentedString(singleExpansionCount)).append("\n");
        sb.append("    scalingPolicyBySession: ").append(toIndentedString(scalingPolicyBySession)).append("\n");
        sb.append("    scalingPolicyByResource: ").append(toIndentedString(scalingPolicyByResource)).append("\n");
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
