package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class KeystoneUpdateProtocolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolResult protocol;

    public KeystoneUpdateProtocolResponse withProtocol(ProtocolResult protocol) {
        this.protocol = protocol;
        return this;
    }

    public KeystoneUpdateProtocolResponse withProtocol(Consumer<ProtocolResult> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ProtocolResult();
            protocolSetter.accept(this.protocol);
        }

        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public ProtocolResult getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolResult protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeystoneUpdateProtocolResponse that = (KeystoneUpdateProtocolResponse) obj;
        return Objects.equals(this.protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateProtocolResponse {\n");
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
