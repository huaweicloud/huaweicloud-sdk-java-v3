package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AcceptHandshakeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handshake")

    private HandshakeDto handshake;

    public AcceptHandshakeResponse withHandshake(HandshakeDto handshake) {
        this.handshake = handshake;
        return this;
    }

    public AcceptHandshakeResponse withHandshake(Consumer<HandshakeDto> handshakeSetter) {
        if (this.handshake == null) {
            this.handshake = new HandshakeDto();
            handshakeSetter.accept(this.handshake);
        }

        return this;
    }

    /**
     * Get handshake
     * @return handshake
     */
    public HandshakeDto getHandshake() {
        return handshake;
    }

    public void setHandshake(HandshakeDto handshake) {
        this.handshake = handshake;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcceptHandshakeResponse that = (AcceptHandshakeResponse) obj;
        return Objects.equals(this.handshake, that.handshake);
    }

    @Override
    public int hashCode() {
        return Objects.hash(handshake);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptHandshakeResponse {\n");
        sb.append("    handshake: ").append(toIndentedString(handshake)).append("\n");
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
