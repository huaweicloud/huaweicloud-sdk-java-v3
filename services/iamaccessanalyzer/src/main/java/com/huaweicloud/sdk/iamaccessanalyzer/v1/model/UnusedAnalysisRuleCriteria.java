package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 未使用分析规则的条件。
 */
public class UnusedAnalysisRuleCriteria {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_ids")

    private List<String> accountIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tags")

    private List<Tag> resourceTags = null;

    public UnusedAnalysisRuleCriteria withAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }

    public UnusedAnalysisRuleCriteria addAccountIdsItem(String accountIdsItem) {
        if (this.accountIds == null) {
            this.accountIds = new ArrayList<>();
        }
        this.accountIds.add(accountIdsItem);
        return this;
    }

    public UnusedAnalysisRuleCriteria withAccountIds(Consumer<List<String>> accountIdsSetter) {
        if (this.accountIds == null) {
            this.accountIds = new ArrayList<>();
        }
        accountIdsSetter.accept(this.accountIds);
        return this;
    }

    /**
     * 账号ID列表。
     * @return accountIds
     */
    public List<String> getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
    }

    public UnusedAnalysisRuleCriteria withResourceTags(List<Tag> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }

    public UnusedAnalysisRuleCriteria addResourceTagsItem(Tag resourceTagsItem) {
        if (this.resourceTags == null) {
            this.resourceTags = new ArrayList<>();
        }
        this.resourceTags.add(resourceTagsItem);
        return this;
    }

    public UnusedAnalysisRuleCriteria withResourceTags(Consumer<List<Tag>> resourceTagsSetter) {
        if (this.resourceTags == null) {
            this.resourceTags = new ArrayList<>();
        }
        resourceTagsSetter.accept(this.resourceTags);
        return this;
    }

    /**
     * 资源标签列表。
     * @return resourceTags
     */
    public List<Tag> getResourceTags() {
        return resourceTags;
    }

    public void setResourceTags(List<Tag> resourceTags) {
        this.resourceTags = resourceTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnusedAnalysisRuleCriteria that = (UnusedAnalysisRuleCriteria) obj;
        return Objects.equals(this.accountIds, that.accountIds) && Objects.equals(this.resourceTags, that.resourceTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountIds, resourceTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnusedAnalysisRuleCriteria {\n");
        sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
        sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
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
