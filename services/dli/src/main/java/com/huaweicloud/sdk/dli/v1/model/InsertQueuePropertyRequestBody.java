package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新加队列属性值时对应的属性信息
 */
public class InsertQueuePropertyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private InsertQueuePropertyRequestBodyProperties properties;

    public InsertQueuePropertyRequestBody withProperties(InsertQueuePropertyRequestBodyProperties properties) {
        this.properties = properties;
        return this;
    }

    public InsertQueuePropertyRequestBody withProperties(
        Consumer<InsertQueuePropertyRequestBodyProperties> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new InsertQueuePropertyRequestBodyProperties();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public InsertQueuePropertyRequestBodyProperties getProperties() {
        return properties;
    }

    public void setProperties(InsertQueuePropertyRequestBodyProperties properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InsertQueuePropertyRequestBody that = (InsertQueuePropertyRequestBody) obj;
        return Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsertQueuePropertyRequestBody {\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
