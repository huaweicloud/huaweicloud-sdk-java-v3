package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 订阅的事件目标转换规则
 */
public class SubscriptionTargetInfoTransform {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    @JacksonXmlProperty(localName = "template")

    private String template;

    public SubscriptionTargetInfoTransform withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 转换规则类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SubscriptionTargetInfoTransform withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 转换规则内容
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SubscriptionTargetInfoTransform withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 转换规则模板
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionTargetInfoTransform subscriptionTargetInfoTransform = (SubscriptionTargetInfoTransform) o;
        return Objects.equals(this.type, subscriptionTargetInfoTransform.type)
            && Objects.equals(this.value, subscriptionTargetInfoTransform.value)
            && Objects.equals(this.template, subscriptionTargetInfoTransform.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionTargetInfoTransform {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
