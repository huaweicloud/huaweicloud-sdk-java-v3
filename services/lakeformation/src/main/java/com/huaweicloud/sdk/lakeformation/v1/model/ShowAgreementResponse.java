package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAgreementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreements")

    private List<TenantAgreement> agreements = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_agency")

    private Boolean isAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowAgreementResponse withAgreements(List<TenantAgreement> agreements) {
        this.agreements = agreements;
        return this;
    }

    public ShowAgreementResponse addAgreementsItem(TenantAgreement agreementsItem) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        this.agreements.add(agreementsItem);
        return this;
    }

    public ShowAgreementResponse withAgreements(Consumer<List<TenantAgreement>> agreementsSetter) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        agreementsSetter.accept(this.agreements);
        return this;
    }

    /**
     * 租户协议列表
     * @return agreements
     */
    public List<TenantAgreement> getAgreements() {
        return agreements;
    }

    public void setAgreements(List<TenantAgreement> agreements) {
        this.agreements = agreements;
    }

    public ShowAgreementResponse withIsAgency(Boolean isAgency) {
        this.isAgency = isAgency;
        return this;
    }

    /**
     * 是否绑定了委托
     * @return isAgency
     */
    public Boolean getIsAgency() {
        return isAgency;
    }

    public void setIsAgency(Boolean isAgency) {
        this.isAgency = isAgency;
    }

    public ShowAgreementResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAgreementResponse showAgreementResponse = (ShowAgreementResponse) o;
        return Objects.equals(this.agreements, showAgreementResponse.agreements)
            && Objects.equals(this.isAgency, showAgreementResponse.isAgency)
            && Objects.equals(this.xRequestId, showAgreementResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreements, isAgency, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgreementResponse {\n");
        sb.append("    agreements: ").append(toIndentedString(agreements)).append("\n");
        sb.append("    isAgency: ").append(toIndentedString(isAgency)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
