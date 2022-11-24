package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateEnterpriseRouterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private CreateEnterpriseRouter instance;

    public CreateEnterpriseRouterRequestBody withInstance(CreateEnterpriseRouter instance) {
        this.instance = instance;
        return this;
    }

    public CreateEnterpriseRouterRequestBody withInstance(Consumer<CreateEnterpriseRouter> instanceSetter) {
        if (this.instance == null) {
            this.instance = new CreateEnterpriseRouter();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public CreateEnterpriseRouter getInstance() {
        return instance;
    }

    public void setInstance(CreateEnterpriseRouter instance) {
        this.instance = instance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEnterpriseRouterRequestBody createEnterpriseRouterRequestBody = (CreateEnterpriseRouterRequestBody) o;
        return Objects.equals(this.instance, createEnterpriseRouterRequestBody.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEnterpriseRouterRequestBody {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
