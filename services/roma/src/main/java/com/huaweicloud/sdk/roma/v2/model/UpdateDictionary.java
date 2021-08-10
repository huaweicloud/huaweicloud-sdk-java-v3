package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UpdateDictionary */
public class UpdateDictionary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private Integer order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_one")

    private String extendOne;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_two")

    private String extendTwo;

    public UpdateDictionary withName(String name) {
        this.name = name;
        return this;
    }

    /** 字典名称 - 字符集：中文、英文字母、数字、下划线和空格 - 约束：实例下唯一
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDictionary withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** 字典描述
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UpdateDictionary withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /** 字典排序，值越小顺序越靠前 minimum: 1 maximum: 100
     * 
     * @return order */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public UpdateDictionary withExtendOne(String extendOne) {
        this.extendOne = extendOne;
        return this;
    }

    /** 字典扩展字段1 - 字符集：中文、英文字母、数字、下划线和空格
     * 
     * @return extendOne */
    public String getExtendOne() {
        return extendOne;
    }

    public void setExtendOne(String extendOne) {
        this.extendOne = extendOne;
    }

    public UpdateDictionary withExtendTwo(String extendTwo) {
        this.extendTwo = extendTwo;
        return this;
    }

    /** 字典扩展字段2 - 字符集：中文、英文字母、数字、下划线和空格
     * 
     * @return extendTwo */
    public String getExtendTwo() {
        return extendTwo;
    }

    public void setExtendTwo(String extendTwo) {
        this.extendTwo = extendTwo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDictionary updateDictionary = (UpdateDictionary) o;
        return Objects.equals(this.name, updateDictionary.name) && Objects.equals(this.remark, updateDictionary.remark)
            && Objects.equals(this.order, updateDictionary.order)
            && Objects.equals(this.extendOne, updateDictionary.extendOne)
            && Objects.equals(this.extendTwo, updateDictionary.extendTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, remark, order, extendOne, extendTwo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDictionary {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    extendOne: ").append(toIndentedString(extendOne)).append("\n");
        sb.append("    extendTwo: ").append(toIndentedString(extendTwo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
