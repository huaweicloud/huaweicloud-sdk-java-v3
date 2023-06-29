package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建保护实例请求体
 */
public class CreateProtectedInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance")

    private CreateProtectedInstanceRequestParams protectedInstance;

    public CreateProtectedInstanceRequestBody withProtectedInstance(
        CreateProtectedInstanceRequestParams protectedInstance) {
        this.protectedInstance = protectedInstance;
        return this;
    }

    public CreateProtectedInstanceRequestBody withProtectedInstance(
        Consumer<CreateProtectedInstanceRequestParams> protectedInstanceSetter) {
        if (this.protectedInstance == null) {
            this.protectedInstance = new CreateProtectedInstanceRequestParams();
            protectedInstanceSetter.accept(this.protectedInstance);
        }

        return this;
    }

    /**
     * Get protectedInstance
     * @return protectedInstance
     */
    public CreateProtectedInstanceRequestParams getProtectedInstance() {
        return protectedInstance;
    }

    public void setProtectedInstance(CreateProtectedInstanceRequestParams protectedInstance) {
        this.protectedInstance = protectedInstance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProtectedInstanceRequestBody that = (CreateProtectedInstanceRequestBody) obj;
        return Objects.equals(this.protectedInstance, that.protectedInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProtectedInstanceRequestBody {\n");
        sb.append("    protectedInstance: ").append(toIndentedString(protectedInstance)).append("\n");
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
