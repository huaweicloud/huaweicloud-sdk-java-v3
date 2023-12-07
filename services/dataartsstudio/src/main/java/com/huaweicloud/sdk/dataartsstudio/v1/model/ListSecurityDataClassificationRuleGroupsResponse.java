package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSecurityDataClassificationRuleGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_groups")

    private List<DataClassificationGroupQueryDTO> ruleGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListSecurityDataClassificationRuleGroupsResponse withRuleGroups(
        List<DataClassificationGroupQueryDTO> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }

    public ListSecurityDataClassificationRuleGroupsResponse addRuleGroupsItem(
        DataClassificationGroupQueryDTO ruleGroupsItem) {
        if (this.ruleGroups == null) {
            this.ruleGroups = new ArrayList<>();
        }
        this.ruleGroups.add(ruleGroupsItem);
        return this;
    }

    public ListSecurityDataClassificationRuleGroupsResponse withRuleGroups(
        Consumer<List<DataClassificationGroupQueryDTO>> ruleGroupsSetter) {
        if (this.ruleGroups == null) {
            this.ruleGroups = new ArrayList<>();
        }
        ruleGroupsSetter.accept(this.ruleGroups);
        return this;
    }

    /**
     * 规则组列表
     * @return ruleGroups
     */
    public List<DataClassificationGroupQueryDTO> getRuleGroups() {
        return ruleGroups;
    }

    public void setRuleGroups(List<DataClassificationGroupQueryDTO> ruleGroups) {
        this.ruleGroups = ruleGroups;
    }

    public ListSecurityDataClassificationRuleGroupsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 规则组总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
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
        ListSecurityDataClassificationRuleGroupsResponse that = (ListSecurityDataClassificationRuleGroupsResponse) obj;
        return Objects.equals(this.ruleGroups, that.ruleGroups) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleGroups, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityDataClassificationRuleGroupsResponse {\n");
        sb.append("    ruleGroups: ").append(toIndentedString(ruleGroups)).append("\n");
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
