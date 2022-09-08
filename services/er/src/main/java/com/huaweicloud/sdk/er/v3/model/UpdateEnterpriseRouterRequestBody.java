package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateEnterpriseRouterRequestBody
 */
public class UpdateEnterpriseRouterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private UpdateEnterpriseRouter instance;

    public UpdateEnterpriseRouterRequestBody withInstance(UpdateEnterpriseRouter instance) {
        this.instance = instance;
        return this;
    }

    public UpdateEnterpriseRouterRequestBody withInstance(Consumer<UpdateEnterpriseRouter> instanceSetter) {
        if (this.instance == null) {
            this.instance = new UpdateEnterpriseRouter();
            instanceSetter.accept(this.instance);
        }

        return this;
    }

    /**
     * Get instance
     * @return instance
     */
    public UpdateEnterpriseRouter getInstance() {
        return instance;
    }

    public void setInstance(UpdateEnterpriseRouter instance) {
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
        UpdateEnterpriseRouterRequestBody updateEnterpriseRouterRequestBody = (UpdateEnterpriseRouterRequestBody) o;
        return Objects.equals(this.instance, updateEnterpriseRouterRequestBody.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEnterpriseRouterRequestBody {\n");
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
