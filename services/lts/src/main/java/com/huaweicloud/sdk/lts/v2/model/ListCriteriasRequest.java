package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCriteriasRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_id")

    private String topicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private String searchType;

    public ListCriteriasRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 租户想查询的日志流所在的日志组的groupid，一般为36位字符串。  缺省值：None  最小长度：36  最大长度：36
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListCriteriasRequest withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    /**
     * 日志流id
     * @return topicId
     */
    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public ListCriteriasRequest withSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * 原始日志：ORIGINALLOG 可视化日志: VISUALIZATION
     * @return searchType
     */
    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCriteriasRequest listCriteriasRequest = (ListCriteriasRequest) o;
        return Objects.equals(this.groupId, listCriteriasRequest.groupId)
            && Objects.equals(this.topicId, listCriteriasRequest.topicId)
            && Objects.equals(this.searchType, listCriteriasRequest.searchType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, topicId, searchType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCriteriasRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
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
