package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Object的元素，用以保存过滤对象名的一组规则。 
 */
@JacksonXmlRootElement(localName = "TopicConfigurationFilter")
public class TopicConfigurationFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Object")

    @JacksonXmlProperty(localName = "Object")

    private FilterObject object;

    public TopicConfigurationFilter withObject(FilterObject object) {
        this.object = object;
        return this;
    }

    public TopicConfigurationFilter withObject(Consumer<FilterObject> objectSetter) {
        if (this.object == null) {
            this.object = new FilterObject();
            objectSetter.accept(this.object);
        }

        return this;
    }

    /**
     * Get object
     * @return object
     */
    public FilterObject getObject() {
        return object;
    }

    public void setObject(FilterObject object) {
        this.object = object;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopicConfigurationFilter that = (TopicConfigurationFilter) obj;
        return Objects.equals(this.object, that.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicConfigurationFilter {\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
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
