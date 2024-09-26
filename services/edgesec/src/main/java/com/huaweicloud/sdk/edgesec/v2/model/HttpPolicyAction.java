package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作
 */
public class HttpPolicyAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "followed_action_id")

    private String followedActionId;

    public HttpPolicyAction withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 防护等级
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public HttpPolicyAction withFollowedActionId(String followedActionId) {
        this.followedActionId = followedActionId;
        return this;
    }

    /**
     * 攻击惩罚规则ID
     * @return followedActionId
     */
    public String getFollowedActionId() {
        return followedActionId;
    }

    public void setFollowedActionId(String followedActionId) {
        this.followedActionId = followedActionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpPolicyAction that = (HttpPolicyAction) obj;
        return Objects.equals(this.category, that.category)
            && Objects.equals(this.followedActionId, that.followedActionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, followedActionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpPolicyAction {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    followedActionId: ").append(toIndentedString(followedActionId)).append("\n");
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
