package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class Oauth2AuthorizeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_uri")

    private String requestUri;

    public Oauth2AuthorizeRequest withRequestUri(String requestUri) {
        this.requestUri = requestUri;
        return this;
    }

    /**
     * OAuth 2.0 PAR standard request URI, references authorization parameters for the OAuth2 flow
     * @return requestUri
     */
    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Oauth2AuthorizeRequest that = (Oauth2AuthorizeRequest) obj;
        return Objects.equals(this.requestUri, that.requestUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Oauth2AuthorizeRequest {\n");
        sb.append("    requestUri: ").append(toIndentedString(requestUri)).append("\n");
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
