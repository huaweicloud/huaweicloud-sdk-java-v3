package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of the UpdateResourceShare operation.
 */
public class UpdateResourceShareReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_external_principals")

    private Boolean allowExternalPrincipals;

    public UpdateResourceShareReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源共享实例的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateResourceShareReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 资源共享实例的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateResourceShareReqBody withAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
        return this;
    }

    /**
     * 资源共享实例是否支持共享给组织外账号。
     * @return allowExternalPrincipals
     */
    public Boolean getAllowExternalPrincipals() {
        return allowExternalPrincipals;
    }

    public void setAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateResourceShareReqBody updateResourceShareReqBody = (UpdateResourceShareReqBody) o;
        return Objects.equals(this.name, updateResourceShareReqBody.name)
            && Objects.equals(this.description, updateResourceShareReqBody.description)
            && Objects.equals(this.allowExternalPrincipals, updateResourceShareReqBody.allowExternalPrincipals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, allowExternalPrincipals);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResourceShareReqBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    allowExternalPrincipals: ").append(toIndentedString(allowExternalPrincipals)).append("\n");
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
