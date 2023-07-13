package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddFavoriteReq
 */
public class AddFavoriteReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private AddFavoriteReqTemplate template;

    public AddFavoriteReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义模板名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddFavoriteReq withTemplate(AddFavoriteReqTemplate template) {
        this.template = template;
        return this;
    }

    public AddFavoriteReq withTemplate(Consumer<AddFavoriteReqTemplate> templateSetter) {
        if (this.template == null) {
            this.template = new AddFavoriteReqTemplate();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public AddFavoriteReqTemplate getTemplate() {
        return template;
    }

    public void setTemplate(AddFavoriteReqTemplate template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddFavoriteReq that = (AddFavoriteReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.template, that.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddFavoriteReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
