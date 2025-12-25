package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分类映射比较函数详情
 */
public class DpeCompareFunctionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classify")

    private String classify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "example")

    private String example;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparefunc")

    private String comparefunc;

    public DpeCompareFunctionDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DpeCompareFunctionDetail withClassify(String classify) {
        this.classify = classify;
        return this;
    }

    /**
     * NORMAL(通用方法), STRING(字符串方法), NUMBER(数字方法), DATE(时间方法)
     * @return classify
     */
    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public DpeCompareFunctionDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DpeCompareFunctionDetail withExample(String example) {
        this.example = example;
        return this;
    }

    /**
     * 示例
     * @return example
     */
    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public DpeCompareFunctionDetail withComparefunc(String comparefunc) {
        this.comparefunc = comparefunc;
        return this;
    }

    /**
     * 比较方法Key
     * @return comparefunc
     */
    public String getComparefunc() {
        return comparefunc;
    }

    public void setComparefunc(String comparefunc) {
        this.comparefunc = comparefunc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DpeCompareFunctionDetail that = (DpeCompareFunctionDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.classify, that.classify)
            && Objects.equals(this.description, that.description) && Objects.equals(this.example, that.example)
            && Objects.equals(this.comparefunc, that.comparefunc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, classify, description, example, comparefunc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DpeCompareFunctionDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    example: ").append(toIndentedString(example)).append("\n");
        sb.append("    comparefunc: ").append(toIndentedString(comparefunc)).append("\n");
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
