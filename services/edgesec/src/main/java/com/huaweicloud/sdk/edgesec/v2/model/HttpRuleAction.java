package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 防护规则动作
 */
public class HttpRuleAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "followed_action_id")

    private String followedActionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private HttpRuleActionDetail detail;

    public HttpRuleAction withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 操作类型。   - “block”：拦截。   - “pass”：放行。   - “log”：仅记录
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public HttpRuleAction withFollowedActionId(String followedActionId) {
        this.followedActionId = followedActionId;
        return this;
    }

    /**
     * 攻击惩罚规则id，只有当category参数值为block时才可配置该参数
     * @return followedActionId
     */
    public String getFollowedActionId() {
        return followedActionId;
    }

    public void setFollowedActionId(String followedActionId) {
        this.followedActionId = followedActionId;
    }

    public HttpRuleAction withDetail(HttpRuleActionDetail detail) {
        this.detail = detail;
        return this;
    }

    public HttpRuleAction withDetail(Consumer<HttpRuleActionDetail> detailSetter) {
        if (this.detail == null) {
            this.detail = new HttpRuleActionDetail();
            detailSetter.accept(this.detail);
        }

        return this;
    }

    /**
     * Get detail
     * @return detail
     */
    public HttpRuleActionDetail getDetail() {
        return detail;
    }

    public void setDetail(HttpRuleActionDetail detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRuleAction that = (HttpRuleAction) obj;
        return Objects.equals(this.category, that.category)
            && Objects.equals(this.followedActionId, that.followedActionId) && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, followedActionId, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpRuleAction {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    followedActionId: ").append(toIndentedString(followedActionId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
