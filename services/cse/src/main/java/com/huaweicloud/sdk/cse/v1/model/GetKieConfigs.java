package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GetKieConfigs
 */
public class GetKieConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Object labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Integer createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Integer updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_revision")

    private Long createRevision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_revision")

    private Long updateRevision;

    public GetKieConfigs withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 配置项的id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetKieConfigs withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 配置项的key。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public GetKieConfigs withLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 配置项的标签。
     * @return labels
     */
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public GetKieConfigs withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 配置项的值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public GetKieConfigs withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 配置项value的类型。
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public GetKieConfigs withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 配置项的状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetKieConfigs withCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public GetKieConfigs withUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public GetKieConfigs withCreateRevision(Long createRevision) {
        this.createRevision = createRevision;
        return this;
    }

    /**
     * 创建配置的版本号
     * @return createRevision
     */
    public Long getCreateRevision() {
        return createRevision;
    }

    public void setCreateRevision(Long createRevision) {
        this.createRevision = createRevision;
    }

    public GetKieConfigs withUpdateRevision(Long updateRevision) {
        this.updateRevision = updateRevision;
        return this;
    }

    /**
     * 修改配置的版本号
     * @return updateRevision
     */
    public Long getUpdateRevision() {
        return updateRevision;
    }

    public void setUpdateRevision(Long updateRevision) {
        this.updateRevision = updateRevision;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetKieConfigs getKieConfigs = (GetKieConfigs) o;
        return Objects.equals(this.id, getKieConfigs.id) && Objects.equals(this.key, getKieConfigs.key)
            && Objects.equals(this.labels, getKieConfigs.labels) && Objects.equals(this.value, getKieConfigs.value)
            && Objects.equals(this.valueType, getKieConfigs.valueType)
            && Objects.equals(this.status, getKieConfigs.status)
            && Objects.equals(this.createTime, getKieConfigs.createTime)
            && Objects.equals(this.updateTime, getKieConfigs.updateTime)
            && Objects.equals(this.createRevision, getKieConfigs.createRevision)
            && Objects.equals(this.updateRevision, getKieConfigs.updateRevision);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, key, labels, value, valueType, status, createTime, updateTime, createRevision, updateRevision);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetKieConfigs {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createRevision: ").append(toIndentedString(createRevision)).append("\n");
        sb.append("    updateRevision: ").append(toIndentedString(updateRevision)).append("\n");
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
