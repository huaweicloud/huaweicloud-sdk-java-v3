package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 巡检作业信息
 */
public class InspectionJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_time")

    private Long costTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_time")

    private Integer estimatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_configs")

    private List<InspectionItemConfigDetail> itemConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_status")

    private ResultStatus resultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private JobStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_message")

    private String statusMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private List<InspectionType> types = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public InspectionJob withCostTime(Long costTime) {
        this.costTime = costTime;
        return this;
    }

    /**
     * **参数解释**：巡检耗时。  **取值范围**：[0,100000]。
     * minimum: 0
     * maximum: 100000
     * @return costTime
     */
    public Long getCostTime() {
        return costTime;
    }

    public void setCostTime(Long costTime) {
        this.costTime = costTime;
    }

    public InspectionJob withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：作业创建时间。 **取值范围**：不涉及。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public InspectionJob withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**：创建者。 **取值范围**：[0,50]。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public InspectionJob withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：添加的对作业的描述。 **约束限制**：不涉及。 **取值范围**：字符串,长度为0到256之间。 **默认取值**： 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InspectionJob withEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
        return this;
    }

    /**
     * 预估时间（分钟）
     * @return estimatedTime
     */
    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public InspectionJob withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：巡检作业ID。 **取值范围**：长度为[1,36]的英文字符、数字和中划线(-)的组合。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InspectionJob withItemConfigs(List<InspectionItemConfigDetail> itemConfigs) {
        this.itemConfigs = itemConfigs;
        return this;
    }

    public InspectionJob addItemConfigsItem(InspectionItemConfigDetail itemConfigsItem) {
        if (this.itemConfigs == null) {
            this.itemConfigs = new ArrayList<>();
        }
        this.itemConfigs.add(itemConfigsItem);
        return this;
    }

    public InspectionJob withItemConfigs(Consumer<List<InspectionItemConfigDetail>> itemConfigsSetter) {
        if (this.itemConfigs == null) {
            this.itemConfigs = new ArrayList<>();
        }
        itemConfigsSetter.accept(this.itemConfigs);
        return this;
    }

    /**
     * **参数解释**：巡检压测用例信息列表。
     * @return itemConfigs
     */
    public List<InspectionItemConfigDetail> getItemConfigs() {
        return itemConfigs;
    }

    public void setItemConfigs(List<InspectionItemConfigDetail> itemConfigs) {
        this.itemConfigs = itemConfigs;
    }

    public InspectionJob withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：作业名称。 **取值范围**：长度为[1,64]的数字、中文、英文、下划线（_）或中划线（-）组成的字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InspectionJob withResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * Get resultStatus
     * @return resultStatus
     */
    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    public InspectionJob withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public InspectionJob withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * **参数解释**：状态信息。 **取值范围**：[0,500]。
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public InspectionJob withTypes(List<InspectionType> types) {
        this.types = types;
        return this;
    }

    public InspectionJob addTypesItem(InspectionType typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public InspectionJob withTypes(Consumer<List<InspectionType>> typesSetter) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * **参数解释**：巡检类型。
     * @return types
     */
    public List<InspectionType> getTypes() {
        return types;
    }

    public void setTypes(List<InspectionType> types) {
        this.types = types;
    }

    public InspectionJob withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：作业更新时间。 **取值范围**：不涉及。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectionJob that = (InspectionJob) obj;
        return Objects.equals(this.costTime, that.costTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.description, that.description)
            && Objects.equals(this.estimatedTime, that.estimatedTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.itemConfigs, that.itemConfigs) && Objects.equals(this.name, that.name)
            && Objects.equals(this.resultStatus, that.resultStatus) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusMessage, that.statusMessage) && Objects.equals(this.types, that.types)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costTime,
            createTime,
            creator,
            description,
            estimatedTime,
            id,
            itemConfigs,
            name,
            resultStatus,
            status,
            statusMessage,
            types,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InspectionJob {\n");
        sb.append("    costTime: ").append(toIndentedString(costTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    itemConfigs: ").append(toIndentedString(itemConfigs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
