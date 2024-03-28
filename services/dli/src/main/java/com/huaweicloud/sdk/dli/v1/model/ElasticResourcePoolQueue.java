package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ElasticResourcePoolQueue
 */
public class ElasticResourcePoolQueue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_type")

    private String queueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_scaling_policies")

    private List<QueueScalingPolicy> queueScalingPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    public ElasticResourcePoolQueue withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public ElasticResourcePoolQueue withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ElasticResourcePoolQueue withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * 队列类型
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public ElasticResourcePoolQueue withQueueScalingPolicies(List<QueueScalingPolicy> queueScalingPolicies) {
        this.queueScalingPolicies = queueScalingPolicies;
        return this;
    }

    public ElasticResourcePoolQueue addQueueScalingPoliciesItem(QueueScalingPolicy queueScalingPoliciesItem) {
        if (this.queueScalingPolicies == null) {
            this.queueScalingPolicies = new ArrayList<>();
        }
        this.queueScalingPolicies.add(queueScalingPoliciesItem);
        return this;
    }

    public ElasticResourcePoolQueue withQueueScalingPolicies(
        Consumer<List<QueueScalingPolicy>> queueScalingPoliciesSetter) {
        if (this.queueScalingPolicies == null) {
            this.queueScalingPolicies = new ArrayList<>();
        }
        queueScalingPoliciesSetter.accept(this.queueScalingPolicies);
        return this;
    }

    /**
     * 队列扩缩容策略
     * @return queueScalingPolicies
     */
    public List<QueueScalingPolicy> getQueueScalingPolicies() {
        return queueScalingPolicies;
    }

    public void setQueueScalingPolicies(List<QueueScalingPolicy> queueScalingPolicies) {
        this.queueScalingPolicies = queueScalingPolicies;
    }

    public ElasticResourcePoolQueue withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 所有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ElasticResourcePoolQueue withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ElasticResourcePoolQueue withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 引擎类型
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElasticResourcePoolQueue that = (ElasticResourcePoolQueue) obj;
        return Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.queueType, that.queueType)
            && Objects.equals(this.queueScalingPolicies, that.queueScalingPolicies)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.engine, that.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, enterpriseProjectId, queueType, queueScalingPolicies, owner, createTime, engine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElasticResourcePoolQueue {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    queueScalingPolicies: ").append(toIndentedString(queueScalingPolicies)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
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
