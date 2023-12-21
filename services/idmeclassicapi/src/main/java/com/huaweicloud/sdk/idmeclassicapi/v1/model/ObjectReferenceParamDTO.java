package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ObjectReferenceParamDTO
 */
public class ObjectReferenceParamDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clazz")

    private String clazz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public ObjectReferenceParamDTO withClazz(String clazz) {
        this.clazz = clazz;
        return this;
    }

    /**
     * 类名。
     * @return clazz
     */
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public ObjectReferenceParamDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectReferenceParamDTO that = (ObjectReferenceParamDTO) obj;
        return Objects.equals(this.clazz, that.clazz) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clazz, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectReferenceParamDTO {\n");
        sb.append("    clazz: ").append(toIndentedString(clazz)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
