package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AttachV2AgencyPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AttachV2AgencyPolicyRequestBody body;

    public AttachV2AgencyPolicyRequest withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释**：委托名称。 **约束限制**：固定值ai_datalake_admin_trust。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public AttachV2AgencyPolicyRequest withBody(AttachV2AgencyPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public AttachV2AgencyPolicyRequest withBody(Consumer<AttachV2AgencyPolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AttachV2AgencyPolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AttachV2AgencyPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(AttachV2AgencyPolicyRequestBody body) {
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
        AttachV2AgencyPolicyRequest that = (AttachV2AgencyPolicyRequest) obj;
        return Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachV2AgencyPolicyRequest {\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
