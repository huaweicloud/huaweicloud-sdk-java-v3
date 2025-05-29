package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 构建参数
 */
public class Params {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraints")

    private List<Constraints> constraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletion")

    private Boolean deletion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaults")

    private Boolean defaults;

    public Params withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Params withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Params withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Params withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 必填
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Params withConstraints(List<Constraints> constraints) {
        this.constraints = constraints;
        return this;
    }

    public Params addConstraintsItem(Constraints constraintsItem) {
        if (this.constraints == null) {
            this.constraints = new ArrayList<>();
        }
        this.constraints.add(constraintsItem);
        return this;
    }

    public Params withConstraints(Consumer<List<Constraints>> constraintsSetter) {
        if (this.constraints == null) {
            this.constraints = new ArrayList<>();
        }
        constraintsSetter.accept(this.constraints);
        return this;
    }

    /**
     * 简要构建信息列表
     * @return constraints
     */
    public List<Constraints> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraints> constraints) {
        this.constraints = constraints;
    }

    public Params withDeletion(Boolean deletion) {
        this.deletion = deletion;
        return this;
    }

    /**
     * 删除
     * @return deletion
     */
    public Boolean getDeletion() {
        return deletion;
    }

    public void setDeletion(Boolean deletion) {
        this.deletion = deletion;
    }

    public Params withDefaults(Boolean defaults) {
        this.defaults = defaults;
        return this;
    }

    /**
     * 默认
     * @return defaults
     */
    public Boolean getDefaults() {
        return defaults;
    }

    public void setDefaults(Boolean defaults) {
        this.defaults = defaults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Params that = (Params) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.title, that.title)
            && Objects.equals(this.type, that.type) && Objects.equals(this.required, that.required)
            && Objects.equals(this.constraints, that.constraints) && Objects.equals(this.deletion, that.deletion)
            && Objects.equals(this.defaults, that.defaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title, type, required, constraints, deletion, defaults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Params {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
        sb.append("    deletion: ").append(toIndentedString(deletion)).append("\n");
        sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
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
