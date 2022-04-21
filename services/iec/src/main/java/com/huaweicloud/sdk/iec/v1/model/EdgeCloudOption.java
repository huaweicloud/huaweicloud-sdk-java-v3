package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 边缘业务对象
 */
public class EdgeCloudOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage")

    private Coverage coverage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack")

    private Stack stack;

    public EdgeCloudOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘业务名称。 取值范围：只能由中文字符、大小写英文字母、数字及中划线、下划线组成，且长度为[1-32]个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EdgeCloudOption withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 已有边缘业务ID，该参数用于扩容边缘业务场景。 >-  id与name不可同时为空，同时有值时部署计划无效； - 通过id扩容场景要求区域分布层级与原边缘业务一致； - 区域分布层级为站点级的边缘业务不支持扩容。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EdgeCloudOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述，缺省值为空字符串。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgeCloudOption withCoverage(Coverage coverage) {
        this.coverage = coverage;
        return this;
    }

    public EdgeCloudOption withCoverage(Consumer<Coverage> coverageSetter) {
        if (this.coverage == null) {
            this.coverage = new Coverage();
            coverageSetter.accept(this.coverage);
        }

        return this;
    }

    /**
     * Get coverage
     * @return coverage
     */
    public Coverage getCoverage() {
        return coverage;
    }

    public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
    }

    public EdgeCloudOption withStack(Stack stack) {
        this.stack = stack;
        return this;
    }

    public EdgeCloudOption withStack(Consumer<Stack> stackSetter) {
        if (this.stack == null) {
            this.stack = new Stack();
            stackSetter.accept(this.stack);
        }

        return this;
    }

    /**
     * Get stack
     * @return stack
     */
    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeCloudOption edgeCloudOption = (EdgeCloudOption) o;
        return Objects.equals(this.name, edgeCloudOption.name) && Objects.equals(this.id, edgeCloudOption.id)
            && Objects.equals(this.description, edgeCloudOption.description)
            && Objects.equals(this.coverage, edgeCloudOption.coverage)
            && Objects.equals(this.stack, edgeCloudOption.stack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, description, coverage, stack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeCloudOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
        sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
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
