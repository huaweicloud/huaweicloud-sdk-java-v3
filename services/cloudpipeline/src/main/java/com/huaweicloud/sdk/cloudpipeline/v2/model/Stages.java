package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 流水线阶段执行信息
 */
public class Stages {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    @JacksonXmlProperty(localName = "parameters")

    private Object parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    @JacksonXmlProperty(localName = "order")

    private Integer order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsl_method")

    @JacksonXmlProperty(localName = "dsl_method")

    private String dslMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    @JacksonXmlProperty(localName = "display_name")

    private String displayName;

    public Stages withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 阶段执行结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Stages withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 阶段执行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Stages withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 阶段名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stages withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * 任务参数
     * @return parameters
     */
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public Stages withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * 阶段顺序
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Stages withDslMethod(String dslMethod) {
        this.dslMethod = dslMethod;
        return this;
    }

    /**
     * 阶段类型
     * @return dslMethod
     */
    public String getDslMethod() {
        return dslMethod;
    }

    public void setDslMethod(String dslMethod) {
        this.dslMethod = dslMethod;
    }

    public Stages withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 阶段显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stages stages = (Stages) o;
        return Objects.equals(this.result, stages.result) && Objects.equals(this.status, stages.status)
            && Objects.equals(this.name, stages.name) && Objects.equals(this.parameters, stages.parameters)
            && Objects.equals(this.order, stages.order) && Objects.equals(this.dslMethod, stages.dslMethod)
            && Objects.equals(this.displayName, stages.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, status, name, parameters, order, dslMethod, displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Stages {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    dslMethod: ").append(toIndentedString(dslMethod)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
