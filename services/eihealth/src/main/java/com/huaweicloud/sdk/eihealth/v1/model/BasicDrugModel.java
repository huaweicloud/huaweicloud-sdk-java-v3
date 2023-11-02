package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BasicDrugModel
 */
public class BasicDrugModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    private ValueRange valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public BasicDrugModel withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模型ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BasicDrugModel withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public BasicDrugModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模型名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BasicDrugModel withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 模型创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public BasicDrugModel withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 模型类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BasicDrugModel withValueRange(ValueRange valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    public BasicDrugModel withValueRange(Consumer<ValueRange> valueRangeSetter) {
        if (this.valueRange == null) {
            this.valueRange = new ValueRange();
            valueRangeSetter.accept(this.valueRange);
        }

        return this;
    }

    /**
     * Get valueRange
     * @return valueRange
     */
    public ValueRange getValueRange() {
        return valueRange;
    }

    public void setValueRange(ValueRange valueRange) {
        this.valueRange = valueRange;
    }

    public BasicDrugModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模型描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicDrugModel that = (BasicDrugModel) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.type, that.type) && Objects.equals(this.valueRange, that.valueRange)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskId, name, creator, type, valueRange, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicDrugModel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
