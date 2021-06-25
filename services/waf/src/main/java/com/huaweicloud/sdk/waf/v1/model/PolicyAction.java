package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 操作
 */
public class PolicyAction  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private String category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="followed_action_id")
    
    private String followedActionId;

    public PolicyAction withCategory(String category) {
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

    

    public PolicyAction withFollowedActionId(String followedActionId) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyAction policyAction = (PolicyAction) o;
        return Objects.equals(this.category, policyAction.category) &&
            Objects.equals(this.followedActionId, policyAction.followedActionId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(category, followedActionId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyAction {\n");
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

