package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReferResourceCreate
 */
public class ReferResourceCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private ResourceType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private ReferResourceCreateParameters parameters;

    public ReferResourceCreate withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * empty id means resource need to be created
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReferResourceCreate withType(ResourceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public ReferResourceCreate withParameters(ReferResourceCreateParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    public ReferResourceCreate withParameters(Consumer<ReferResourceCreateParameters> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ReferResourceCreateParameters();
            parametersSetter.accept(this.parameters);
        }

        return this;
    }

    /**
     * Get parameters
     * @return parameters
     */
    public ReferResourceCreateParameters getParameters() {
        return parameters;
    }

    public void setParameters(ReferResourceCreateParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferResourceCreate referResourceCreate = (ReferResourceCreate) o;
        return Objects.equals(this.id, referResourceCreate.id) && Objects.equals(this.type, referResourceCreate.type)
            && Objects.equals(this.parameters, referResourceCreate.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferResourceCreate {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
