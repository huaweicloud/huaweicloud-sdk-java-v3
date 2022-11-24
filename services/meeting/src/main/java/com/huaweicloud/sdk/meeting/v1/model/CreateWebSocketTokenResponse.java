package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateWebSocketTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webSocketToken")

    private String webSocketToken;

    public CreateWebSocketTokenResponse withWebSocketToken(String webSocketToken) {
        this.webSocketToken = webSocketToken;
        return this;
    }

    /**
     * WebSocket建链Token(有效期1分钟，且一次有效)。
     * @return webSocketToken
     */
    public String getWebSocketToken() {
        return webSocketToken;
    }

    public void setWebSocketToken(String webSocketToken) {
        this.webSocketToken = webSocketToken;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWebSocketTokenResponse createWebSocketTokenResponse = (CreateWebSocketTokenResponse) o;
        return Objects.equals(this.webSocketToken, createWebSocketTokenResponse.webSocketToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webSocketToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWebSocketTokenResponse {\n");
        sb.append("    webSocketToken: ").append(toIndentedString(webSocketToken)).append("\n");
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
