package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateWorkflowPurchasePoolResponse extends SdkResponse {

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

    private Integer consumeLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_consume")

    private Integer currentConsume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_date")

    private String currentDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_enable")

    private Boolean limitEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    public CreateWorkflowPurchasePoolResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 服务包状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateWorkflowPurchasePoolResponse withPoolId(String poolId) {
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

    public CreateWorkflowPurchasePoolResponse withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 在线服务ID。
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public CreateWorkflowPurchasePoolResponse withWorkflowId(String workflowId) {
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

    public CreateWorkflowPurchasePoolResponse withOrder(WorkflowPoolOrder order) {
        this.order = order;
        return this;
    }

    public CreateWorkflowPurchasePoolResponse withOrder(Consumer<WorkflowPoolOrder> orderSetter) {
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

    public CreateWorkflowPurchasePoolResponse withConsumeLimit(Integer consumeLimit) {
        this.consumeLimit = consumeLimit;
        return this;
    }

    /**
     * 消费限制。
     * @return consumeLimit
     */
    public Integer getConsumeLimit() {
        return consumeLimit;
    }

    public void setConsumeLimit(Integer consumeLimit) {
        this.consumeLimit = consumeLimit;
    }

    public CreateWorkflowPurchasePoolResponse withCurrentConsume(Integer currentConsume) {
        this.currentConsume = currentConsume;
        return this;
    }

    /**
     * 当前消费。
     * @return currentConsume
     */
    public Integer getCurrentConsume() {
        return currentConsume;
    }

    public void setCurrentConsume(Integer currentConsume) {
        this.currentConsume = currentConsume;
    }

    public CreateWorkflowPurchasePoolResponse withCurrentDate(String currentDate) {
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

    public CreateWorkflowPurchasePoolResponse withLimitEnable(Boolean limitEnable) {
        this.limitEnable = limitEnable;
        return this;
    }

    /**
     * 限制开关。
     * @return limitEnable
     */
    public Boolean getLimitEnable() {
        return limitEnable;
    }

    public void setLimitEnable(Boolean limitEnable) {
        this.limitEnable = limitEnable;
    }

    public CreateWorkflowPurchasePoolResponse withCreatedAt(String createdAt) {
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

    public CreateWorkflowPurchasePoolResponse withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 订阅包的UUID。创建时不需要填，由后台自动生成。
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWorkflowPurchasePoolResponse that = (CreateWorkflowPurchasePoolResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.workflowId, that.workflowId)
            && Objects.equals(this.order, that.order) && Objects.equals(this.consumeLimit, that.consumeLimit)
            && Objects.equals(this.currentConsume, that.currentConsume)
            && Objects.equals(this.currentDate, that.currentDate) && Objects.equals(this.limitEnable, that.limitEnable)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.packageId, that.packageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            poolId,
            serviceId,
            workflowId,
            order,
            consumeLimit,
            currentConsume,
            currentDate,
            limitEnable,
            createdAt,
            packageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkflowPurchasePoolResponse {\n");
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
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
