package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class KeystoneCreateProtocolRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolOption protocol;

    public KeystoneCreateProtocolRequestBody withProtocol(ProtocolOption protocol) {
        this.protocol = protocol;
        return this;
    }

    public KeystoneCreateProtocolRequestBody withProtocol(Consumer<ProtocolOption> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ProtocolOption();
            protocolSetter.accept(this.protocol);
        }

        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public ProtocolOption getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolOption protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateProtocolRequestBody keystoneCreateProtocolRequestBody = (KeystoneCreateProtocolRequestBody) o;
        return Objects.equals(this.protocol, keystoneCreateProtocolRequestBody.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateProtocolRequestBody {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
