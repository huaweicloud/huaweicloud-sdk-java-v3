package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListInteractionRuleGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interaction_rule_groups")

    private List<InteractionRuleGroupDetail> interactionRuleGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListInteractionRuleGroupsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 互动规则总数。
     * minimum: 0
     * maximum: 1000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListInteractionRuleGroupsResponse withInteractionRuleGroups(
        List<InteractionRuleGroupDetail> interactionRuleGroups) {
        this.interactionRuleGroups = interactionRuleGroups;
        return this;
    }

    public ListInteractionRuleGroupsResponse addInteractionRuleGroupsItem(
        InteractionRuleGroupDetail interactionRuleGroupsItem) {
        if (this.interactionRuleGroups == null) {
            this.interactionRuleGroups = new ArrayList<>();
        }
        this.interactionRuleGroups.add(interactionRuleGroupsItem);
        return this;
    }

    public ListInteractionRuleGroupsResponse withInteractionRuleGroups(
        Consumer<List<InteractionRuleGroupDetail>> interactionRuleGroupsSetter) {
        if (this.interactionRuleGroups == null) {
            this.interactionRuleGroups = new ArrayList<>();
        }
        interactionRuleGroupsSetter.accept(this.interactionRuleGroups);
        return this;
    }

    /**
     * 互动规则库列表。
     * @return interactionRuleGroups
     */
    public List<InteractionRuleGroupDetail> getInteractionRuleGroups() {
        return interactionRuleGroups;
    }

    public void setInteractionRuleGroups(List<InteractionRuleGroupDetail> interactionRuleGroups) {
        this.interactionRuleGroups = interactionRuleGroups;
    }

    public ListInteractionRuleGroupsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInteractionRuleGroupsResponse that = (ListInteractionRuleGroupsResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.interactionRuleGroups, that.interactionRuleGroups)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, interactionRuleGroups, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInteractionRuleGroupsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    interactionRuleGroups: ").append(toIndentedString(interactionRuleGroups)).append("\n");
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
