package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupUpdateRequestSyncRules
 */
public class GroupUpdateRequestSyncRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_tags")

    private String ruleTags;

    public GroupUpdateRequestSyncRules withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * 企业项目id。
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public GroupUpdateRequestSyncRules withRuleTags(String ruleTags) {
        this.ruleTags = ruleTags;
        return this;
    }

    /**
     * 关联标签。
     * @return ruleTags
     */
    public String getRuleTags() {
        return ruleTags;
    }

    public void setRuleTags(String ruleTags) {
        this.ruleTags = ruleTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupUpdateRequestSyncRules that = (GroupUpdateRequestSyncRules) obj;
        return Objects.equals(this.epId, that.epId) && Objects.equals(this.ruleTags, that.ruleTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epId, ruleTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupUpdateRequestSyncRules {\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    ruleTags: ").append(toIndentedString(ruleTags)).append("\n");
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
