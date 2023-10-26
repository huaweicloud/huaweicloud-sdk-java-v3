package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class AddSecurityGroupsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private InsertSecurityGroupOption port;

    public AddSecurityGroupsRequestBody withPort(InsertSecurityGroupOption port) {
        this.port = port;
        return this;
    }

    public AddSecurityGroupsRequestBody withPort(Consumer<InsertSecurityGroupOption> portSetter) {
        if (this.port == null) {
            this.port = new InsertSecurityGroupOption();
            portSetter.accept(this.port);
        }

        return this;
    }

    /**
     * Get port
     * @return port
     */
    public InsertSecurityGroupOption getPort() {
        return port;
    }

    public void setPort(InsertSecurityGroupOption port) {
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
        AddSecurityGroupsRequestBody that = (AddSecurityGroupsRequestBody) obj;
        return Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSecurityGroupsRequestBody {\n");
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
