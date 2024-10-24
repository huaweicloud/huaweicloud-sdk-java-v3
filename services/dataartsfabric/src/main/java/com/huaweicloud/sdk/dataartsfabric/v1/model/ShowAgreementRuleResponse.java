package com.huaweicloud.sdk.dataartsfabric.v1.model;

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
public class ShowAgreementRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_rules")

    private List<AgreementRule> agreementRules = null;

    public ShowAgreementRuleResponse withAgreementRules(List<AgreementRule> agreementRules) {
        this.agreementRules = agreementRules;
        return this;
    }

    public ShowAgreementRuleResponse addAgreementRulesItem(AgreementRule agreementRulesItem) {
        if (this.agreementRules == null) {
            this.agreementRules = new ArrayList<>();
        }
        this.agreementRules.add(agreementRulesItem);
        return this;
    }

    public ShowAgreementRuleResponse withAgreementRules(Consumer<List<AgreementRule>> agreementRulesSetter) {
        if (this.agreementRules == null) {
            this.agreementRules = new ArrayList<>();
        }
        agreementRulesSetter.accept(this.agreementRules);
        return this;
    }

    /**
     * 系统协议列表
     * @return agreementRules
     */
    public List<AgreementRule> getAgreementRules() {
        return agreementRules;
    }

    public void setAgreementRules(List<AgreementRule> agreementRules) {
        this.agreementRules = agreementRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgreementRuleResponse that = (ShowAgreementRuleResponse) obj;
        return Objects.equals(this.agreementRules, that.agreementRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgreementRuleResponse {\n");
        sb.append("    agreementRules: ").append(toIndentedString(agreementRules)).append("\n");
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
