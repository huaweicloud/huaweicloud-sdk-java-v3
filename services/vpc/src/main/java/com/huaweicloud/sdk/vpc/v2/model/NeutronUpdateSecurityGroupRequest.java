package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class NeutronUpdateSecurityGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NeutronUpdateSecurityGroupRequestBody body;

    public NeutronUpdateSecurityGroupRequest withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /** 安全组ID
     * 
     * @return securityGroupId */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public NeutronUpdateSecurityGroupRequest withBody(NeutronUpdateSecurityGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public NeutronUpdateSecurityGroupRequest withBody(Consumer<NeutronUpdateSecurityGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new NeutronUpdateSecurityGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public NeutronUpdateSecurityGroupRequestBody getBody() {
        return body;
    }

    public void setBody(NeutronUpdateSecurityGroupRequestBody body) {
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
        NeutronUpdateSecurityGroupRequest neutronUpdateSecurityGroupRequest = (NeutronUpdateSecurityGroupRequest) o;
        return Objects.equals(this.securityGroupId, neutronUpdateSecurityGroupRequest.securityGroupId)
            && Objects.equals(this.body, neutronUpdateSecurityGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateSecurityGroupRequest {\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
