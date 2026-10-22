package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：计算资源版本详情。 
 */
public class ShowV2ComputeVersionResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_id")

    private String computeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private CapacityVersion capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private Creator creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private Error error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private Operation operation;

    public ShowV2ComputeVersionResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：计算资源记录ID。 **取值范围**：长度为1~36的英文字符、数字和中划线的组合。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowV2ComputeVersionResponseBody withComputeId(String computeId) {
        this.computeId = computeId;
        return this;
    }

    /**
     * **参数解释**：计算资源ID。 **取值范围**：长度为1~36的英文字母、数字和中划线的组合。 
     * @return computeId
     */
    public String getComputeId() {
        return computeId;
    }

    public void setComputeId(String computeId) {
        this.computeId = computeId;
    }

    public ShowV2ComputeVersionResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：计算资源名称。 **取值范围**：支持小写字母、数字、中划线，必须字母开头、字母或数字结尾，长度为1~63个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowV2ComputeVersionResponseBody withCapacity(CapacityVersion capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get capacity
     * @return capacity
     */
    public CapacityVersion getCapacity() {
        return capacity;
    }

    public void setCapacity(CapacityVersion capacity) {
        this.capacity = capacity;
    }

    public ShowV2ComputeVersionResponseBody withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowV2ComputeVersionResponseBody withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：资源更新时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowV2ComputeVersionResponseBody withCreator(Creator creator) {
        this.creator = creator;
        return this;
    }

    public ShowV2ComputeVersionResponseBody withCreator(Consumer<Creator> creatorSetter) {
        if (this.creator == null) {
            this.creator = new Creator();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public ShowV2ComputeVersionResponseBody withError(Error error) {
        this.error = error;
        return this;
    }

    public ShowV2ComputeVersionResponseBody withError(Consumer<Error> errorSetter) {
        if (this.error == null) {
            this.error = new Error();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public ShowV2ComputeVersionResponseBody withOperation(Operation operation) {
        this.operation = operation;
        return this;
    }

    public ShowV2ComputeVersionResponseBody withOperation(Consumer<Operation> operationSetter) {
        if (this.operation == null) {
            this.operation = new Operation();
            operationSetter.accept(this.operation);
        }

        return this;
    }

    /**
     * Get operation
     * @return operation
     */
    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowV2ComputeVersionResponseBody that = (ShowV2ComputeVersionResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.computeId, that.computeId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.capacity, that.capacity)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.error, that.error)
            && Objects.equals(this.operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, computeId, name, capacity, createTime, updateTime, creator, error, operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowV2ComputeVersionResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
