package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * service package
 */
public class WorkflowServicePackege {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private WorkflowPoolOrder order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_limit")

    private Long consumeLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_consume")

    private Long currentConsume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_date")

    private String currentDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_enable")

    private Boolean limitEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    public WorkflowServicePackege withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 资源包的UUID。
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public WorkflowServicePackege withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源包状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WorkflowServicePackege withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 资源池ID。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public WorkflowServicePackege withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务ID。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public WorkflowServicePackege withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * Workflow工作流ID。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public WorkflowServicePackege withOrder(WorkflowPoolOrder order) {
        this.order = order;
        return this;
    }

    public WorkflowServicePackege withOrder(Consumer<WorkflowPoolOrder> orderSetter) {
        if (this.order == null) {
            this.order = new WorkflowPoolOrder();
            orderSetter.accept(this.order);
        }

        return this;
    }

    /**
     * Get order
     * @return order
     */
    public WorkflowPoolOrder getOrder() {
        return order;
    }

    public void setOrder(WorkflowPoolOrder order) {
        this.order = order;
    }

    public WorkflowServicePackege withConsumeLimit(Long consumeLimit) {
        this.consumeLimit = consumeLimit;
        return this;
    }

    /**
     * 订阅限制。
     * @return consumeLimit
     */
    public Long getConsumeLimit() {
        return consumeLimit;
    }

    public void setConsumeLimit(Long consumeLimit) {
        this.consumeLimit = consumeLimit;
    }

    public WorkflowServicePackege withCurrentConsume(Long currentConsume) {
        this.currentConsume = currentConsume;
        return this;
    }

    /**
     * 当前订阅。
     * @return currentConsume
     */
    public Long getCurrentConsume() {
        return currentConsume;
    }

    public void setCurrentConsume(Long currentConsume) {
        this.currentConsume = currentConsume;
    }

    public WorkflowServicePackege withCurrentDate(String currentDate) {
        this.currentDate = currentDate;
        return this;
    }

    /**
     * 当前时间。
     * @return currentDate
     */
    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public WorkflowServicePackege withLimitEnable(Boolean limitEnable) {
        this.limitEnable = limitEnable;
        return this;
    }

    /**
     * 限制标记。
     * @return limitEnable
     */
    public Boolean getLimitEnable() {
        return limitEnable;
    }

    public void setLimitEnable(Boolean limitEnable) {
        this.limitEnable = limitEnable;
    }

    public WorkflowServicePackege withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowServicePackege that = (WorkflowServicePackege) obj;
        return Objects.equals(this.packageId, that.packageId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.workflowId, that.workflowId) && Objects.equals(this.order, that.order)
            && Objects.equals(this.consumeLimit, that.consumeLimit)
            && Objects.equals(this.currentConsume, that.currentConsume)
            && Objects.equals(this.currentDate, that.currentDate) && Objects.equals(this.limitEnable, that.limitEnable)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageId,
            status,
            poolId,
            serviceId,
            workflowId,
            order,
            consumeLimit,
            currentConsume,
            currentDate,
            limitEnable,
            createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowServicePackege {\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    consumeLimit: ").append(toIndentedString(consumeLimit)).append("\n");
        sb.append("    currentConsume: ").append(toIndentedString(currentConsume)).append("\n");
        sb.append("    currentDate: ").append(toIndentedString(currentDate)).append("\n");
        sb.append("    limitEnable: ").append(toIndentedString(limitEnable)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
