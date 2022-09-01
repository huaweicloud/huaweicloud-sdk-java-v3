package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新弹性资源池队列消息请求
 */
public class UpdateElasticResourcePoolQueueScalingPolicyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_scaling_policies")

    @JacksonXmlProperty(localName = "queue_scaling_policies")

    private List<QueueScalingPolicyInfo> queueScalingPolicies = null;

    public UpdateElasticResourcePoolQueueScalingPolicyInfo withQueueScalingPolicies(
        List<QueueScalingPolicyInfo> queueScalingPolicies) {
        this.queueScalingPolicies = queueScalingPolicies;
        return this;
    }

    public UpdateElasticResourcePoolQueueScalingPolicyInfo addQueueScalingPoliciesItem(
        QueueScalingPolicyInfo queueScalingPoliciesItem) {
        if (this.queueScalingPolicies == null) {
            this.queueScalingPolicies = new ArrayList<>();
        }
        this.queueScalingPolicies.add(queueScalingPoliciesItem);
        return this;
    }

    public UpdateElasticResourcePoolQueueScalingPolicyInfo withQueueScalingPolicies(
        Consumer<List<QueueScalingPolicyInfo>> queueScalingPoliciesSetter) {
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
    public List<QueueScalingPolicyInfo> getQueueScalingPolicies() {
        return queueScalingPolicies;
    }

    public void setQueueScalingPolicies(List<QueueScalingPolicyInfo> queueScalingPolicies) {
        this.queueScalingPolicies = queueScalingPolicies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateElasticResourcePoolQueueScalingPolicyInfo updateElasticResourcePoolQueueScalingPolicyInfo =
            (UpdateElasticResourcePoolQueueScalingPolicyInfo) o;
        return Objects.equals(this.queueScalingPolicies,
            updateElasticResourcePoolQueueScalingPolicyInfo.queueScalingPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueScalingPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateElasticResourcePoolQueueScalingPolicyInfo {\n");
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
