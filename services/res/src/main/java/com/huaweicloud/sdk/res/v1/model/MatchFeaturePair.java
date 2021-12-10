package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class MatchFeaturePair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_feature_name")

    private String userFeatureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_feature_name")

    private String itemFeatureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Double weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_count")

    private Boolean matchCount;

    public MatchFeaturePair withUserFeatureName(String userFeatureName) {
        this.userFeatureName = userFeatureName;
        return this;
    }

    /** 用户特征。
     * 
     * @return userFeatureName */
    public String getUserFeatureName() {
        return userFeatureName;
    }

    public void setUserFeatureName(String userFeatureName) {
        this.userFeatureName = userFeatureName;
    }

    public MatchFeaturePair withItemFeatureName(String itemFeatureName) {
        this.itemFeatureName = itemFeatureName;
        return this;
    }

    /** 物品特征。
     * 
     * @return itemFeatureName */
    public String getItemFeatureName() {
        return itemFeatureName;
    }

    public void setItemFeatureName(String itemFeatureName) {
        this.itemFeatureName = itemFeatureName;
    }

    public MatchFeaturePair withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /** 权重。
     * 
     * @return weight */
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public MatchFeaturePair withMatchCount(Boolean matchCount) {
        this.matchCount = matchCount;
        return this;
    }

    /** 匹配个数度量。
     * 
     * @return matchCount */
    public Boolean getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(Boolean matchCount) {
        this.matchCount = matchCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MatchFeaturePair matchFeaturePair = (MatchFeaturePair) o;
        return Objects.equals(this.userFeatureName, matchFeaturePair.userFeatureName)
            && Objects.equals(this.itemFeatureName, matchFeaturePair.itemFeatureName)
            && Objects.equals(this.weight, matchFeaturePair.weight)
            && Objects.equals(this.matchCount, matchFeaturePair.matchCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userFeatureName, itemFeatureName, weight, matchCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MatchFeaturePair {\n");
        sb.append("    userFeatureName: ").append(toIndentedString(userFeatureName)).append("\n");
        sb.append("    itemFeatureName: ").append(toIndentedString(itemFeatureName)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
