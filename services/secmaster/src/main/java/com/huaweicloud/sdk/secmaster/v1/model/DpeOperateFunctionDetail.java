package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分类映射比较函数信息
 */
public class DpeOperateFunctionDetail {

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
    @JsonProperty(value = "operationfunc")

    private String operationfunc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<Params> params = null;

    public DpeOperateFunctionDetail withName(String name) {
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

    public DpeOperateFunctionDetail withClassify(String classify) {
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

    public DpeOperateFunctionDetail withDescription(String description) {
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

    public DpeOperateFunctionDetail withExample(String example) {
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

    public DpeOperateFunctionDetail withOperationfunc(String operationfunc) {
        this.operationfunc = operationfunc;
        return this;
    }

    /**
     * 转换方法Key
     * @return operationfunc
     */
    public String getOperationfunc() {
        return operationfunc;
    }

    public void setOperationfunc(String operationfunc) {
        this.operationfunc = operationfunc;
    }

    public DpeOperateFunctionDetail withParams(List<Params> params) {
        this.params = params;
        return this;
    }

    public DpeOperateFunctionDetail addParamsItem(Params paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public DpeOperateFunctionDetail withParams(Consumer<List<Params>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 参数集合
     * @return params
     */
    public List<Params> getParams() {
        return params;
    }

    public void setParams(List<Params> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DpeOperateFunctionDetail that = (DpeOperateFunctionDetail) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.classify, that.classify)
            && Objects.equals(this.description, that.description) && Objects.equals(this.example, that.example)
            && Objects.equals(this.operationfunc, that.operationfunc) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, classify, description, example, operationfunc, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DpeOperateFunctionDetail {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    example: ").append(toIndentedString(example)).append("\n");
        sb.append("    operationfunc: ").append(toIndentedString(operationfunc)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
