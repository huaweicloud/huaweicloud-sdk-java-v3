package com.huaweicloud.sdk.hss.v5.model;

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
public class ShowRaspPolicyDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_list")

    private List<CheckFeatureRuleInfo> ruleList = null;

    public ShowRaspPolicyDetailResponse withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 防护策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ShowRaspPolicyDetailResponse withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释** 操作系统类型 **取值范围** 包含以下两种: - Linux : linux系统 - Windows: windows系统
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ShowRaspPolicyDetailResponse withRuleList(List<CheckFeatureRuleInfo> ruleList) {
        this.ruleList = ruleList;
        return this;
    }

    public ShowRaspPolicyDetailResponse addRuleListItem(CheckFeatureRuleInfo ruleListItem) {
        if (this.ruleList == null) {
            this.ruleList = new ArrayList<>();
        }
        this.ruleList.add(ruleListItem);
        return this;
    }

    public ShowRaspPolicyDetailResponse withRuleList(Consumer<List<CheckFeatureRuleInfo>> ruleListSetter) {
        if (this.ruleList == null) {
            this.ruleList = new ArrayList<>();
        }
        ruleListSetter.accept(this.ruleList);
        return this;
    }

    /**
     * list
     * @return ruleList
     */
    public List<CheckFeatureRuleInfo> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<CheckFeatureRuleInfo> ruleList) {
        this.ruleList = ruleList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRaspPolicyDetailResponse that = (ShowRaspPolicyDetailResponse) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.ruleList, that.ruleList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, osType, ruleList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRaspPolicyDetailResponse {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    ruleList: ").append(toIndentedString(ruleList)).append("\n");
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
