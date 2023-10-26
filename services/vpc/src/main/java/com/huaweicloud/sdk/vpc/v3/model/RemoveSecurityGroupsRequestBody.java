package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class RemoveSecurityGroupsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private RemoveSecurityGroupOption port;

    public RemoveSecurityGroupsRequestBody withPort(RemoveSecurityGroupOption port) {
        this.port = port;
        return this;
    }

    public RemoveSecurityGroupsRequestBody withPort(Consumer<RemoveSecurityGroupOption> portSetter) {
        if (this.port == null) {
            this.port = new RemoveSecurityGroupOption();
            portSetter.accept(this.port);
        }

        return this;
    }

    /**
     * Get port
     * @return port
     */
    public RemoveSecurityGroupOption getPort() {
        return port;
    }

    public void setPort(RemoveSecurityGroupOption port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveSecurityGroupsRequestBody that = (RemoveSecurityGroupsRequestBody) obj;
        return Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveSecurityGroupsRequestBody {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
