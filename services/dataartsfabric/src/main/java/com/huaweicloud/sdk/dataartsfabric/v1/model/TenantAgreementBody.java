package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户注册协议请求体
 */
public class TenantAgreementBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreements")

    private List<TenantAgreement> agreements = null;

    public TenantAgreementBody withAgreements(List<TenantAgreement> agreements) {
        this.agreements = agreements;
        return this;
    }

    public TenantAgreementBody addAgreementsItem(TenantAgreement agreementsItem) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        this.agreements.add(agreementsItem);
        return this;
    }

    public TenantAgreementBody withAgreements(Consumer<List<TenantAgreement>> agreementsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TenantAgreementBody that = (TenantAgreementBody) obj;
        return Objects.equals(this.agreements, that.agreements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantAgreementBody {\n");
        sb.append("    agreements: ").append(toIndentedString(agreements)).append("\n");
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
