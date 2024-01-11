package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * Field
 */
public class Field {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")
    @BsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")
    @BsonProperty(value = "order")

    private Boolean order;

    public Field withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Field withOrder(Boolean order) {
        this.order = order;
        return this;
    }

    /**
     * bool值预留无意义。
     * @return order
     */
    public Boolean getOrder() {
        return order;
    }

    public void setOrder(Boolean order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Field that = (Field) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Field {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
