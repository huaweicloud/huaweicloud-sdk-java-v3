package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowServerGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group")

    @JacksonXmlProperty(localName = "server_group")

    private ShowServerGroupResult serverGroup;

    public ShowServerGroupResponse withServerGroup(ShowServerGroupResult serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }

    public ShowServerGroupResponse withServerGroup(Consumer<ShowServerGroupResult> serverGroupSetter) {
        if (this.serverGroup == null) {
            this.serverGroup = new ShowServerGroupResult();
            serverGroupSetter.accept(this.serverGroup);
        }

        return this;
    }

    /**
     * Get serverGroup
     * @return serverGroup
     */
    public ShowServerGroupResult getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(ShowServerGroupResult serverGroup) {
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
        ShowServerGroupResponse showServerGroupResponse = (ShowServerGroupResponse) o;
        return Objects.equals(this.serverGroup, showServerGroupResponse.serverGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerGroupResponse {\n");
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
