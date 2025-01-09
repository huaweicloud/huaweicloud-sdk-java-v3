package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新增或修改弹性伸缩策略。
 */
public class CreateOrUpdateScalingPolicyReq {

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
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    public CreateOrUpdateScalingPolicyReq withEnable(Boolean enable) {
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

    public CreateOrUpdateScalingPolicyReq withMaxScalingAmount(Integer maxScalingAmount) {
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

    public CreateOrUpdateScalingPolicyReq withSingleExpansionCount(Integer singleExpansionCount) {
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

    public CreateOrUpdateScalingPolicyReq withScalingPolicyBySession(ScalingPolicyBySession scalingPolicyBySession) {
        this.scalingPolicyBySession = scalingPolicyBySession;
        return this;
    }

    public CreateOrUpdateScalingPolicyReq withScalingPolicyBySession(
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

    public CreateOrUpdateScalingPolicyReq withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 服务器组唯一标识(仅按需服务器组支持该操作)。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOrUpdateScalingPolicyReq that = (CreateOrUpdateScalingPolicyReq) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.maxScalingAmount, that.maxScalingAmount)
            && Objects.equals(this.singleExpansionCount, that.singleExpansionCount)
            && Objects.equals(this.scalingPolicyBySession, that.scalingPolicyBySession)
            && Objects.equals(this.serverGroupId, that.serverGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, maxScalingAmount, singleExpansionCount, scalingPolicyBySession, serverGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrUpdateScalingPolicyReq {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    maxScalingAmount: ").append(toIndentedString(maxScalingAmount)).append("\n");
        sb.append("    singleExpansionCount: ").append(toIndentedString(singleExpansionCount)).append("\n");
        sb.append("    scalingPolicyBySession: ").append(toIndentedString(scalingPolicyBySession)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
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
