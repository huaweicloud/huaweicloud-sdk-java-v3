package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEdgeDDoSDomainsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainid")

    private String domainid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateEdgeDDoSDomainsRequestBody body;

    public UpdateEdgeDDoSDomainsRequest withDomainid(String domainid) {
        this.domainid = domainid;
        return this;
    }

    /**
     * 域名ID
     * @return domainid
     */
    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }

    public UpdateEdgeDDoSDomainsRequest withBody(UpdateEdgeDDoSDomainsRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateEdgeDDoSDomainsRequest withBody(Consumer<UpdateEdgeDDoSDomainsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateEdgeDDoSDomainsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateEdgeDDoSDomainsRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateEdgeDDoSDomainsRequestBody body) {
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
        UpdateEdgeDDoSDomainsRequest that = (UpdateEdgeDDoSDomainsRequest) obj;
        return Objects.equals(this.domainid, that.domainid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeDDoSDomainsRequest {\n");
        sb.append("    domainid: ").append(toIndentedString(domainid)).append("\n");
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
