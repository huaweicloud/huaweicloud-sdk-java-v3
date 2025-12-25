package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 聚合条件
 */
public class SearchPolicyRequestBodyGroupBy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by_fields")

    private List<String> groupByFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by_hit")

    private SearchPolicyRequestBodyGroupByGroupByHit groupByHit;

    public SearchPolicyRequestBodyGroupBy withGroupByFields(List<String> groupByFields) {
        this.groupByFields = groupByFields;
        return this;
    }

    public SearchPolicyRequestBodyGroupBy addGroupByFieldsItem(String groupByFieldsItem) {
        if (this.groupByFields == null) {
            this.groupByFields = new ArrayList<>();
        }
        this.groupByFields.add(groupByFieldsItem);
        return this;
    }

    public SearchPolicyRequestBodyGroupBy withGroupByFields(Consumer<List<String>> groupByFieldsSetter) {
        if (this.groupByFields == null) {
            this.groupByFields = new ArrayList<>();
        }
        groupByFieldsSetter.accept(this.groupByFields);
        return this;
    }

    /**
     * 聚合字段
     * @return groupByFields
     */
    public List<String> getGroupByFields() {
        return groupByFields;
    }

    public void setGroupByFields(List<String> groupByFields) {
        this.groupByFields = groupByFields;
    }

    public SearchPolicyRequestBodyGroupBy withGroupByHit(SearchPolicyRequestBodyGroupByGroupByHit groupByHit) {
        this.groupByHit = groupByHit;
        return this;
    }

    public SearchPolicyRequestBodyGroupBy withGroupByHit(
        Consumer<SearchPolicyRequestBodyGroupByGroupByHit> groupByHitSetter) {
        if (this.groupByHit == null) {
            this.groupByHit = new SearchPolicyRequestBodyGroupByGroupByHit();
            groupByHitSetter.accept(this.groupByHit);
        }

        return this;
    }

    /**
     * Get groupByHit
     * @return groupByHit
     */
    public SearchPolicyRequestBodyGroupByGroupByHit getGroupByHit() {
        return groupByHit;
    }

    public void setGroupByHit(SearchPolicyRequestBodyGroupByGroupByHit groupByHit) {
        this.groupByHit = groupByHit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchPolicyRequestBodyGroupBy that = (SearchPolicyRequestBodyGroupBy) obj;
        return Objects.equals(this.groupByFields, that.groupByFields)
            && Objects.equals(this.groupByHit, that.groupByHit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupByFields, groupByHit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchPolicyRequestBodyGroupBy {\n");
        sb.append("    groupByFields: ").append(toIndentedString(groupByFields)).append("\n");
        sb.append("    groupByHit: ").append(toIndentedString(groupByHit)).append("\n");
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
