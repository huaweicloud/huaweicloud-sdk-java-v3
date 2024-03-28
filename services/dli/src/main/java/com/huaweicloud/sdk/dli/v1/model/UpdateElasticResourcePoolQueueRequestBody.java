package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新弹性资源池队列消息请求
 */
public class UpdateElasticResourcePoolQueueRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_scaling_policies")

    private List<QueueScalingPolicy> queueScalingPolicies = null;

    public UpdateElasticResourcePoolQueueRequestBody withQueueScalingPolicies(
        List<QueueScalingPolicy> queueScalingPolicies) {
        this.queueScalingPolicies = queueScalingPolicies;
        return this;
    }

    public UpdateElasticResourcePoolQueueRequestBody addQueueScalingPoliciesItem(
        QueueScalingPolicy queueScalingPoliciesItem) {
        if (this.queueScalingPolicies == null) {
            this.queueScalingPolicies = new ArrayList<>();
        }
        this.queueScalingPolicies.add(queueScalingPoliciesItem);
        return this;
    }

    public UpdateElasticResourcePoolQueueRequestBody withQueueScalingPolicies(
        Consumer<List<QueueScalingPolicy>> queueScalingPoliciesSetter) {
        if (this.queueScalingPolicies == null) {
            this.queueScalingPolicies = new ArrayList<>();
        }
        queueScalingPoliciesSetter.accept(this.queueScalingPolicies);
        return this;
    }

    /**
     * 该队列在该弹性资源池下的扩缩容策略信息。单条策略信息包含时间段、优先级和CU范围。每个队列至少要配置一条时间段为[00:00, 24:00]的默认扩缩容策略。
     * @return queueScalingPolicies
     */
    public List<QueueScalingPolicy> getQueueScalingPolicies() {
        return queueScalingPolicies;
    }

    public void setQueueScalingPolicies(List<QueueScalingPolicy> queueScalingPolicies) {
        this.queueScalingPolicies = queueScalingPolicies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateElasticResourcePoolQueueRequestBody that = (UpdateElasticResourcePoolQueueRequestBody) obj;
        return Objects.equals(this.queueScalingPolicies, that.queueScalingPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueScalingPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateElasticResourcePoolQueueRequestBody {\n");
        sb.append("    queueScalingPolicies: ").append(toIndentedString(queueScalingPolicies)).append("\n");
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
