package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateFederationConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clustergroupid")

    private String clustergroupid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateFederationConnectionRequestBody body;

    public CreateFederationConnectionRequest withClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
        return this;
    }

    /**
     * 舰队id
     * @return clustergroupid
     */
    public String getClustergroupid() {
        return clustergroupid;
    }

    public void setClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
    }

    public CreateFederationConnectionRequest withBody(CreateFederationConnectionRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateFederationConnectionRequest withBody(Consumer<CreateFederationConnectionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateFederationConnectionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateFederationConnectionRequestBody getBody() {
        return body;
    }

    public void setBody(CreateFederationConnectionRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFederationConnectionRequest that = (CreateFederationConnectionRequest) obj;
        return Objects.equals(this.clustergroupid, that.clustergroupid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clustergroupid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFederationConnectionRequest {\n");
        sb.append("    clustergroupid: ").append(toIndentedString(clustergroupid)).append("\n");
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
