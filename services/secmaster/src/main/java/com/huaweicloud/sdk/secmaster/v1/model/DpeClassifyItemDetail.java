package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DpeClassifyItemDetail
 */
public class DpeClassifyItemDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifier_id")

    private String classifierId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifier_type_id")

    private String classifierTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_id")

    private String mappingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classifier_order")

    private Integer classifierOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public DpeClassifyItemDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 映射id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DpeClassifyItemDetail withClassifierId(String classifierId) {
        this.classifierId = classifierId;
        return this;
    }

    /**
     * 映射id
     * @return classifierId
     */
    public String getClassifierId() {
        return classifierId;
    }

    public void setClassifierId(String classifierId) {
        this.classifierId = classifierId;
    }

    public DpeClassifyItemDetail withClassifierTypeId(String classifierTypeId) {
        this.classifierTypeId = classifierTypeId;
        return this;
    }

    /**
     * 映射id
     * @return classifierTypeId
     */
    public String getClassifierTypeId() {
        return classifierTypeId;
    }

    public void setClassifierTypeId(String classifierTypeId) {
        this.classifierTypeId = classifierTypeId;
    }

    public DpeClassifyItemDetail withMappingId(String mappingId) {
        this.mappingId = mappingId;
        return this;
    }

    /**
     * 映射id
     * @return mappingId
     */
    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public DpeClassifyItemDetail withClassifierOrder(Integer classifierOrder) {
        this.classifierOrder = classifierOrder;
        return this;
    }

    /**
     * 分类优先级
     * minimum: 0
     * maximum: 99999
     * @return classifierOrder
     */
    public Integer getClassifierOrder() {
        return classifierOrder;
    }

    public void setClassifierOrder(Integer classifierOrder) {
        this.classifierOrder = classifierOrder;
    }

    public DpeClassifyItemDetail withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public DpeClassifyItemDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DpeClassifyItemDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
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
        DpeClassifyItemDetail that = (DpeClassifyItemDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.classifierId, that.classifierId)
            && Objects.equals(this.classifierTypeId, that.classifierTypeId)
            && Objects.equals(this.mappingId, that.mappingId)
            && Objects.equals(this.classifierOrder, that.classifierOrder)
            && Objects.equals(this.expression, that.expression) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, classifierId, classifierTypeId, mappingId, classifierOrder, expression, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DpeClassifyItemDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    classifierId: ").append(toIndentedString(classifierId)).append("\n");
        sb.append("    classifierTypeId: ").append(toIndentedString(classifierTypeId)).append("\n");
        sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
        sb.append("    classifierOrder: ").append(toIndentedString(classifierOrder)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
