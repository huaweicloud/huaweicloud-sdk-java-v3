package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListV2AgreementRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_rules")

    private List<V2AgreementRule> agreementRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListV2AgreementRuleResponse withAgreementRules(List<V2AgreementRule> agreementRules) {
        this.agreementRules = agreementRules;
        return this;
    }

    public ListV2AgreementRuleResponse addAgreementRulesItem(V2AgreementRule agreementRulesItem) {
        if (this.agreementRules == null) {
            this.agreementRules = new ArrayList<>();
        }
        this.agreementRules.add(agreementRulesItem);
        return this;
    }

    public ListV2AgreementRuleResponse withAgreementRules(Consumer<List<V2AgreementRule>> agreementRulesSetter) {
        if (this.agreementRules == null) {
            this.agreementRules = new ArrayList<>();
        }
        agreementRulesSetter.accept(this.agreementRules);
        return this;
    }

    /**
     * **参数解释**：系统协议列表，每个元素为一个V2AgreementRule对象，包含协议名称、展示名称、版本、链接等信息。
     * @return agreementRules
     */
    public List<V2AgreementRule> getAgreementRules() {
        return agreementRules;
    }

    public void setAgreementRules(List<V2AgreementRule> agreementRules) {
        this.agreementRules = agreementRules;
    }

    public ListV2AgreementRuleResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：系统协议总数。 **取值范围**：0~1000。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2AgreementRuleResponse that = (ListV2AgreementRuleResponse) obj;
        return Objects.equals(this.agreementRules, that.agreementRules) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agreementRules, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2AgreementRuleResponse {\n");
        sb.append("    agreementRules: ").append(toIndentedString(agreementRules)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
