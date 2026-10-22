package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SignV2AgreementRequestBody
 */
public class SignV2AgreementRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreements")

    private List<Object> agreements = null;

    public SignV2AgreementRequestBody withAgreements(List<Object> agreements) {
        this.agreements = agreements;
        return this;
    }

    public SignV2AgreementRequestBody addAgreementsItem(Object agreementsItem) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        this.agreements.add(agreementsItem);
        return this;
    }

    public SignV2AgreementRequestBody withAgreements(Consumer<List<Object>> agreementsSetter) {
        if (this.agreements == null) {
            this.agreements = new ArrayList<>();
        }
        agreementsSetter.accept(this.agreements);
        return this;
    }

    /**
     * **参数解释**：租户协议列表。 **约束限制**：最多10个协议。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return agreements
     */
    public List<Object> getAgreements() {
        return agreements;
    }

    public void setAgreements(List<Object> agreements) {
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
        SignV2AgreementRequestBody that = (SignV2AgreementRequestBody) obj;
        return Objects.equals(this.agreements, that.agreements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignV2AgreementRequestBody {\n");
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
