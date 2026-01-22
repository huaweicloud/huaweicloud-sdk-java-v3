package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceRecycleInfo
 */
public class InstanceRecycleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_recycle_time")

    private Long inRecycleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "save_time")

    private Integer saveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_delete_time")

    private Long autoDeleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_per_hour")

    private Double costPerHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    public InstanceRecycleInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceRecycleInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 实例状态。  **约束限制**： 不涉及。 **取值范围**： [详细状态说明请参考[实例状态说明](hrm-api-0010.xml)。](tag:hws,hws_hk,ctc,hws_eu,ocb,g42,hk_g42,tm,sbc,hk_sbc,cmcc,hk_tm,dt,cmcc,ax,srg)[详细状态说明请参考[实例状态说明](kafka-api-180514012.xml)。](tag:hcs,fcs,hcs_oemout) **默认取值**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceRecycleInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 实例名称。  **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceRecycleInfo withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * **参数解释**： 消息引擎。  **约束限制**： 不涉及。 **取值范围**： - rocketmq：RocketMQ消息引擎。 - reliability：RocketMQ消息引擎别称。 **默认取值**： 不涉及。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public InstanceRecycleInfo withInRecycleTime(Long inRecycleTime) {
        this.inRecycleTime = inRecycleTime;
        return this;
    }

    /**
     * **参数解释**： 回收时间。  **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return inRecycleTime
     */
    public Long getInRecycleTime() {
        return inRecycleTime;
    }

    public void setInRecycleTime(Long inRecycleTime) {
        this.inRecycleTime = inRecycleTime;
    }

    public InstanceRecycleInfo withSaveTime(Integer saveTime) {
        this.saveTime = saveTime;
        return this;
    }

    /**
     * **参数解释**： 保留时间。  **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 **取值范围**： 1~7。
     * @return saveTime
     */
    public Integer getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Integer saveTime) {
        this.saveTime = saveTime;
    }

    public InstanceRecycleInfo withAutoDeleteTime(Long autoDeleteTime) {
        this.autoDeleteTime = autoDeleteTime;
        return this;
    }

    /**
     * **参数解释**： 自动删除时间。  **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return autoDeleteTime
     */
    public Long getAutoDeleteTime() {
        return autoDeleteTime;
    }

    public void setAutoDeleteTime(Long autoDeleteTime) {
        this.autoDeleteTime = autoDeleteTime;
    }

    public InstanceRecycleInfo withCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
        return this;
    }

    /**
     * **参数解释**： 每小时的费用。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return costPerHour
     */
    public Double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public InstanceRecycleInfo withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * **参数解释**： 错误信息。  **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public InstanceRecycleInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释**： 产品ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceRecycleInfo that = (InstanceRecycleInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.name, that.name) && Objects.equals(this.engine, that.engine)
            && Objects.equals(this.inRecycleTime, that.inRecycleTime) && Objects.equals(this.saveTime, that.saveTime)
            && Objects.equals(this.autoDeleteTime, that.autoDeleteTime)
            && Objects.equals(this.costPerHour, that.costPerHour)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            status,
            name,
            engine,
            inRecycleTime,
            saveTime,
            autoDeleteTime,
            costPerHour,
            errorMessage,
            productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceRecycleInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    inRecycleTime: ").append(toIndentedString(inRecycleTime)).append("\n");
        sb.append("    saveTime: ").append(toIndentedString(saveTime)).append("\n");
        sb.append("    autoDeleteTime: ").append(toIndentedString(autoDeleteTime)).append("\n");
        sb.append("    costPerHour: ").append(toIndentedString(costPerHour)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
