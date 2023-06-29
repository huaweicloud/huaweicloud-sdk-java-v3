package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateProtectionGroupNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group")

    private ShowProtectionGroupParams serverGroup;

    public UpdateProtectionGroupNameResponse withServerGroup(ShowProtectionGroupParams serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }

    public UpdateProtectionGroupNameResponse withServerGroup(Consumer<ShowProtectionGroupParams> serverGroupSetter) {
        if (this.serverGroup == null) {
            this.serverGroup = new ShowProtectionGroupParams();
            serverGroupSetter.accept(this.serverGroup);
        }

        return this;
    }

    /**
     * Get serverGroup
     * @return serverGroup
     */
    public ShowProtectionGroupParams getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(ShowProtectionGroupParams serverGroup) {
        this.serverGroup = serverGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateProtectionGroupNameResponse that = (UpdateProtectionGroupNameResponse) obj;
        return Objects.equals(this.serverGroup, that.serverGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProtectionGroupNameResponse {\n");
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
