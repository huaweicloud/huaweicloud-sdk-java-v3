package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源。
 */
public class Resource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn_template")

    private String urnTemplate;

    public Resource withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 云服务资源类型名称。
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Resource withUrnTemplate(String urnTemplate) {
        this.urnTemplate = urnTemplate;
        return this;
    }

    /**
     * 统一资源名称模板，表示可以通过这类资源的统一资源名称对该授权项进行资源粒度的授权。
     * @return urnTemplate
     */
    public String getUrnTemplate() {
        return urnTemplate;
    }

    public void setUrnTemplate(String urnTemplate) {
        this.urnTemplate = urnTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Resource that = (Resource) obj;
        return Objects.equals(this.typeName, that.typeName) && Objects.equals(this.urnTemplate, that.urnTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeName, urnTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    urnTemplate: ").append(toIndentedString(urnTemplate)).append("\n");
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
