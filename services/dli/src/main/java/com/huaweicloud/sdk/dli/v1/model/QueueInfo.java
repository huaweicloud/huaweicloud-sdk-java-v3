package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueueInfo
 */
public class QueueInfo {

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

    private List<QueueScalingPoliciesResponse> queueScalingPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    public QueueInfo withQueueName(String queueName) {
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

    public QueueInfo withEnterpriseProjectId(String enterpriseProjectId) {
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

    public QueueInfo withQueueType(String queueType) {
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

    public QueueInfo withQueueScalingPolicies(List<QueueScalingPoliciesResponse> queueScalingPolicies) {
        this.queueScalingPolicies = queueScalingPolicies;
        return this;
    }

    public QueueInfo addQueueScalingPoliciesItem(QueueScalingPoliciesResponse queueScalingPoliciesItem) {
        if (this.queueScalingPolicies == null) {
            this.queueScalingPolicies = new ArrayList<>();
        }
        this.queueScalingPolicies.add(queueScalingPoliciesItem);
        return this;
    }

    public QueueInfo withQueueScalingPolicies(Consumer<List<QueueScalingPoliciesResponse>> queueScalingPoliciesSetter) {
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
    public List<QueueScalingPoliciesResponse> getQueueScalingPolicies() {
        return queueScalingPolicies;
    }

    public void setQueueScalingPolicies(List<QueueScalingPoliciesResponse> queueScalingPolicies) {
        this.queueScalingPolicies = queueScalingPolicies;
    }

    public QueueInfo withOwner(String owner) {
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

    public QueueInfo withCreateTime(Long createTime) {
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

    public QueueInfo withEngine(String engine) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueueInfo queueInfo = (QueueInfo) o;
        return Objects.equals(this.queueName, queueInfo.queueName)
            && Objects.equals(this.enterpriseProjectId, queueInfo.enterpriseProjectId)
            && Objects.equals(this.queueType, queueInfo.queueType)
            && Objects.equals(this.queueScalingPolicies, queueInfo.queueScalingPolicies)
            && Objects.equals(this.owner, queueInfo.owner) && Objects.equals(this.createTime, queueInfo.createTime)
            && Objects.equals(this.engine, queueInfo.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, enterpriseProjectId, queueType, queueScalingPolicies, owner, createTime, engine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueInfo {\n");
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
