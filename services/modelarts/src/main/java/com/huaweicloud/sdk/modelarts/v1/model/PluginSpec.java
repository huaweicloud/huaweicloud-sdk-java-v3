package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件实例的具体信息。
 */
public class PluginSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private Template template;

    public PluginSpec withTemplate(Template template) {
        this.template = template;
        return this;
    }

    public PluginSpec withTemplate(Consumer<Template> templateSetter) {
        if (this.template == null) {
            this.template = new Template();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
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
        PluginSpec that = (PluginSpec) obj;
        return Objects.equals(this.template, that.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginSpec {\n");
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
