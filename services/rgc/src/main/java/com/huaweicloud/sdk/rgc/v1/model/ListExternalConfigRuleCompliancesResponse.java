package com.huaweicloud.sdk.rgc.v1.model;

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
public class ListExternalConfigRuleCompliancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_rule_compliances")

    private List<ExternalConfigRuleCompliance> configRuleCompliances = null;

    public ListExternalConfigRuleCompliancesResponse withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 纳管账号ID
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public ListExternalConfigRuleCompliancesResponse withConfigRuleCompliances(
        List<ExternalConfigRuleCompliance> configRuleCompliances) {
        this.configRuleCompliances = configRuleCompliances;
        return this;
    }

    public ListExternalConfigRuleCompliancesResponse addConfigRuleCompliancesItem(
        ExternalConfigRuleCompliance configRuleCompliancesItem) {
        if (this.configRuleCompliances == null) {
            this.configRuleCompliances = new ArrayList<>();
        }
        this.configRuleCompliances.add(configRuleCompliancesItem);
        return this;
    }

    public ListExternalConfigRuleCompliancesResponse withConfigRuleCompliances(
        Consumer<List<ExternalConfigRuleCompliance>> configRuleCompliancesSetter) {
        if (this.configRuleCompliances == null) {
            this.configRuleCompliances = new ArrayList<>();
        }
        configRuleCompliancesSetter.accept(this.configRuleCompliances);
        return this;
    }

    /**
     * Config规则合规性信息
     * @return configRuleCompliances
     */
    public List<ExternalConfigRuleCompliance> getConfigRuleCompliances() {
        return configRuleCompliances;
    }

    public void setConfigRuleCompliances(List<ExternalConfigRuleCompliance> configRuleCompliances) {
        this.configRuleCompliances = configRuleCompliances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExternalConfigRuleCompliancesResponse that = (ListExternalConfigRuleCompliancesResponse) obj;
        return Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.configRuleCompliances, that.configRuleCompliances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, configRuleCompliances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExternalConfigRuleCompliancesResponse {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    configRuleCompliances: ").append(toIndentedString(configRuleCompliances)).append("\n");
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
