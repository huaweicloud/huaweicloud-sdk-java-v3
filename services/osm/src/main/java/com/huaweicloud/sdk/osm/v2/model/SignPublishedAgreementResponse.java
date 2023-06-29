package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class SignPublishedAgreementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_signed_record_id")

    private Integer agreementSignedRecordId;

    public SignPublishedAgreementResponse withAgreementSignedRecordId(Integer agreementSignedRecordId) {
        this.agreementSignedRecordId = agreementSignedRecordId;
        return this;
    }

    /**
     * 签署记录id
     * minimum: 0
     * maximum: 2147483647
     * @return agreementSignedRecordId
     */
    public Integer getAgreementSignedRecordId() {
        return agreementSignedRecordId;
    }

    public void setAgreementSignedRecordId(Integer agreementSignedRecordId) {
        this.agreementSignedRecordId = agreementSignedRecordId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SignPublishedAgreementResponse that = (SignPublishedAgreementResponse) obj;
        return Objects.equals(this.agreementSignedRecordId, that.agreementSignedRecordId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementSignedRecordId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignPublishedAgreementResponse {\n");
        sb.append("    agreementSignedRecordId: ").append(toIndentedString(agreementSignedRecordId)).append("\n");
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
