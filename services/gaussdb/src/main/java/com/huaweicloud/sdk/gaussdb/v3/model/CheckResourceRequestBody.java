package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckResourceRequestBody
 */
public class CheckResourceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private CheckResourceInfo resource;

    public CheckResourceRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 校验类型。 - createInstance：校验创建实例。 - createReadonlyNode：校验创建只读节点。 - resizeFlavor：校验规格变更。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CheckResourceRequestBody withResource(CheckResourceInfo resource) {
        this.resource = resource;
        return this;
    }

    public CheckResourceRequestBody withResource(Consumer<CheckResourceInfo> resourceSetter) {
        if (this.resource == null) {
            this.resource = new CheckResourceInfo();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public CheckResourceInfo getResource() {
        return resource;
    }

    public void setResource(CheckResourceInfo resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckResourceRequestBody that = (CheckResourceRequestBody) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.resource, that.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckResourceRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
