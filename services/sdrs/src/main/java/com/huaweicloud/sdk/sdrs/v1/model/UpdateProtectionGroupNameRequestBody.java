package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新保护组名称请求体
 */
public class UpdateProtectionGroupNameRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group")

    private UpdateProtectionGroupNameRequestParams serverGroup;

    public UpdateProtectionGroupNameRequestBody withServerGroup(UpdateProtectionGroupNameRequestParams serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }

    public UpdateProtectionGroupNameRequestBody withServerGroup(
        Consumer<UpdateProtectionGroupNameRequestParams> serverGroupSetter) {
        if (this.serverGroup == null) {
            this.serverGroup = new UpdateProtectionGroupNameRequestParams();
            serverGroupSetter.accept(this.serverGroup);
        }

        return this;
    }

    /**
     * Get serverGroup
     * @return serverGroup
     */
    public UpdateProtectionGroupNameRequestParams getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(UpdateProtectionGroupNameRequestParams serverGroup) {
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
        UpdateProtectionGroupNameRequestBody updateProtectionGroupNameRequestBody =
            (UpdateProtectionGroupNameRequestBody) o;
        return Objects.equals(this.serverGroup, updateProtectionGroupNameRequestBody.serverGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProtectionGroupNameRequestBody {\n");
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
