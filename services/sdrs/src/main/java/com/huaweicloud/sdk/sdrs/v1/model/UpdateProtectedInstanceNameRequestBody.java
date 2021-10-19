package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 更新保护实例名称请求体 */
public class UpdateProtectedInstanceNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance")

    private UpdateProtectedInstanceNameRequestParams protectedInstance;

    public UpdateProtectedInstanceNameRequestBody withProtectedInstance(
        UpdateProtectedInstanceNameRequestParams protectedInstance) {
        this.protectedInstance = protectedInstance;
        return this;
    }

    public UpdateProtectedInstanceNameRequestBody withProtectedInstance(
        Consumer<UpdateProtectedInstanceNameRequestParams> protectedInstanceSetter) {
        if (this.protectedInstance == null) {
            this.protectedInstance = new UpdateProtectedInstanceNameRequestParams();
            protectedInstanceSetter.accept(this.protectedInstance);
        }

        return this;
    }

    /** Get protectedInstance
     * 
     * @return protectedInstance */
    public UpdateProtectedInstanceNameRequestParams getProtectedInstance() {
        return protectedInstance;
    }

    public void setProtectedInstance(UpdateProtectedInstanceNameRequestParams protectedInstance) {
        this.protectedInstance = protectedInstance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateProtectedInstanceNameRequestBody updateProtectedInstanceNameRequestBody =
            (UpdateProtectedInstanceNameRequestBody) o;
        return Objects.equals(this.protectedInstance, updateProtectedInstanceNameRequestBody.protectedInstance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectedInstance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProtectedInstanceNameRequestBody {\n");
        sb.append("    protectedInstance: ").append(toIndentedString(protectedInstance)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
