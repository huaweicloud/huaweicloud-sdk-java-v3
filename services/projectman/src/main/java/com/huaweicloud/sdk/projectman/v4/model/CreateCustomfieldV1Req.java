package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateCustomfieldV1Req
 */
public class CreateCustomfieldV1Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private String options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memo")

    private String memo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scrum_type")

    private String scrumType;

    public CreateCustomfieldV1Req withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCustomfieldV1Req withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 自定义字段类型 可选类型  textArea|select|radio|text|checkbox|date|time_date|number
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateCustomfieldV1Req withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * 字段选项
     * @return options
     */
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public CreateCustomfieldV1Req withMemo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * 描述
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public CreateCustomfieldV1Req withScrumType(String scrumType) {
        this.scrumType = scrumType;
        return this;
    }

    /**
     * 工作项类型
     * @return scrumType
     */
    public String getScrumType() {
        return scrumType;
    }

    public void setScrumType(String scrumType) {
        this.scrumType = scrumType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCustomfieldV1Req createCustomfieldV1Req = (CreateCustomfieldV1Req) o;
        return Objects.equals(this.name, createCustomfieldV1Req.name)
            && Objects.equals(this.type, createCustomfieldV1Req.type)
            && Objects.equals(this.options, createCustomfieldV1Req.options)
            && Objects.equals(this.memo, createCustomfieldV1Req.memo)
            && Objects.equals(this.scrumType, createCustomfieldV1Req.scrumType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, options, memo, scrumType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomfieldV1Req {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    scrumType: ").append(toIndentedString(scrumType)).append("\n");
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
