package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTrustPolicyV5Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTrustPolicyReqBody body;

    public UpdateTrustPolicyV5Request withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 信任委托ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public UpdateTrustPolicyV5Request withBody(UpdateTrustPolicyReqBody body) {
        this.body = body;
        return this;
    }

    public UpdateTrustPolicyV5Request withBody(Consumer<UpdateTrustPolicyReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTrustPolicyReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateTrustPolicyReqBody getBody() {
        return body;
    }

    public void setBody(UpdateTrustPolicyReqBody body) {
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
        UpdateTrustPolicyV5Request that = (UpdateTrustPolicyV5Request) obj;
        return Objects.equals(this.agencyId, that.agencyId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrustPolicyV5Request {\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
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
