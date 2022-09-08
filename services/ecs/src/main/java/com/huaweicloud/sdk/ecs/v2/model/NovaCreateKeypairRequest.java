package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class NovaCreateKeypairRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OpenStack-API-Version")

    private String openStackAPIVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NovaCreateKeypairRequestBody body;

    public NovaCreateKeypairRequest withOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
        return this;
    }

    /**
     * 微版本头
     * @return openStackAPIVersion
     */
    public String getOpenStackAPIVersion() {
        return openStackAPIVersion;
    }

    public void setOpenStackAPIVersion(String openStackAPIVersion) {
        this.openStackAPIVersion = openStackAPIVersion;
    }

    public NovaCreateKeypairRequest withBody(NovaCreateKeypairRequestBody body) {
        this.body = body;
        return this;
    }

    public NovaCreateKeypairRequest withBody(Consumer<NovaCreateKeypairRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new NovaCreateKeypairRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public NovaCreateKeypairRequestBody getBody() {
        return body;
    }

    public void setBody(NovaCreateKeypairRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaCreateKeypairRequest novaCreateKeypairRequest = (NovaCreateKeypairRequest) o;
        return Objects.equals(this.openStackAPIVersion, novaCreateKeypairRequest.openStackAPIVersion)
            && Objects.equals(this.body, novaCreateKeypairRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openStackAPIVersion, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateKeypairRequest {\n");
        sb.append("    openStackAPIVersion: ").append(toIndentedString(openStackAPIVersion)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
