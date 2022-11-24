package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLatestPublishedAgreementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_agreement")

    private AgreementVO caseAgreement;

    public ShowLatestPublishedAgreementResponse withCaseAgreement(AgreementVO caseAgreement) {
        this.caseAgreement = caseAgreement;
        return this;
    }

    public ShowLatestPublishedAgreementResponse withCaseAgreement(Consumer<AgreementVO> caseAgreementSetter) {
        if (this.caseAgreement == null) {
            this.caseAgreement = new AgreementVO();
            caseAgreementSetter.accept(this.caseAgreement);
        }

        return this;
    }

    /**
     * Get caseAgreement
     * @return caseAgreement
     */
    public AgreementVO getCaseAgreement() {
        return caseAgreement;
    }

    public void setCaseAgreement(AgreementVO caseAgreement) {
        this.caseAgreement = caseAgreement;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLatestPublishedAgreementResponse showLatestPublishedAgreementResponse =
            (ShowLatestPublishedAgreementResponse) o;
        return Objects.equals(this.caseAgreement, showLatestPublishedAgreementResponse.caseAgreement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseAgreement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLatestPublishedAgreementResponse {\n");
        sb.append("    caseAgreement: ").append(toIndentedString(caseAgreement)).append("\n");
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
