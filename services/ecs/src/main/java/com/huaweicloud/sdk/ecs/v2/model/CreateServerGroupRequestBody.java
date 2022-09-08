package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class CreateServerGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group")

    private CreateServerGroupOption serverGroup;

    public CreateServerGroupRequestBody withServerGroup(CreateServerGroupOption serverGroup) {
        this.serverGroup = serverGroup;
        return this;
    }

    public CreateServerGroupRequestBody withServerGroup(Consumer<CreateServerGroupOption> serverGroupSetter) {
        if (this.serverGroup == null) {
            this.serverGroup = new CreateServerGroupOption();
            serverGroupSetter.accept(this.serverGroup);
        }

        return this;
    }

    /**
     * Get serverGroup
     * @return serverGroup
     */
    public CreateServerGroupOption getServerGroup() {
        return serverGroup;
    }

    public void setServerGroup(CreateServerGroupOption serverGroup) {
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
        CreateServerGroupRequestBody createServerGroupRequestBody = (CreateServerGroupRequestBody) o;
        return Objects.equals(this.serverGroup, createServerGroupRequestBody.serverGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerGroupRequestBody {\n");
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
