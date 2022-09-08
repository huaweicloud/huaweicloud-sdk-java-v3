package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建保护组请求体
 */
public class CreateProtectionGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group")

    private CreateProtectionGroupRequestParams serverGroup;

    public CreateProtectionGroupRequestBody withServerGroup(CreateProtectionGroupRequestParams serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }

    public CreateProtectionGroupRequestBody withServerGroup(
        Consumer<CreateProtectionGroupRequestParams> serverGroupSetter) {
        if (this.serverGroup == null) {
            this.serverGroup = new CreateProtectionGroupRequestParams();
            serverGroupSetter.accept(this.serverGroup);
        }

        return this;
    }

    /**
     * Get serverGroup
     * @return serverGroup
     */
    public CreateProtectionGroupRequestParams getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(CreateProtectionGroupRequestParams serverGroup) {
        this.serverGroup = serverGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateProtectionGroupRequestBody createProtectionGroupRequestBody = (CreateProtectionGroupRequestBody) o;
        return Objects.equals(this.serverGroup, createProtectionGroupRequestBody.serverGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProtectionGroupRequestBody {\n");
        sb.append("    serverGroup: ").append(toIndentedString(serverGroup)).append("\n");
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
