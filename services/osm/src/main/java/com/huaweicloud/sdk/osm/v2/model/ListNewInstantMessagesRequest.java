package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListNewInstantMessagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_ids")

    private List<String> caseIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_message_time_id")

    private String lastMessageTimeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")

    private Integer xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")

    private String xTimeZone;

    public ListNewInstantMessagesRequest withCaseIds(List<String> caseIds) {
        this.caseIds = caseIds;
        return this;
    }

    public ListNewInstantMessagesRequest addCaseIdsItem(String caseIdsItem) {
        if (this.caseIds == null) {
            this.caseIds = new ArrayList<>();
        }
        this.caseIds.add(caseIdsItem);
        return this;
    }

    public ListNewInstantMessagesRequest withCaseIds(Consumer<List<String>> caseIdsSetter) {
        if (this.caseIds == null) {
            this.caseIds = new ArrayList<>();
        }
        caseIdsSetter.accept(this.caseIds);
        return this;
    }

    /**
     * 工单id
     * @return caseIds
     */
    public List<String> getCaseIds() {
        return caseIds;
    }

    public void setCaseIds(List<String> caseIds) {
        this.caseIds = caseIds;
    }

    public ListNewInstantMessagesRequest withLastMessageTimeId(String lastMessageTimeId) {
        this.lastMessageTimeId = lastMessageTimeId;
        return this;
    }

    /**
     * 上次查询留言的时间
     * @return lastMessageTimeId
     */
    public String getLastMessageTimeId() {
        return lastMessageTimeId;
    }

    public void setLastMessageTimeId(String lastMessageTimeId) {
        this.lastMessageTimeId = lastMessageTimeId;
    }

    public ListNewInstantMessagesRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 华为云IAM组id，同组其他工单时，该id必传
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListNewInstantMessagesRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 对接站点信息。  0（中国站） 1（国际站），不填的话默认为0。
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public ListNewInstantMessagesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言环境，值为通用的语言描述字符串，比如zh-cn等，默认为zh-cn。  会根据语言环境对应展示一些国际化的信息，比如工单类型名称等。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListNewInstantMessagesRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    /**
     * 环境时区，值为通用的时区描述字符串，比如GMT+8等，默认为GMT+8。  涉及时间的数据会根据环境时区处理。
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNewInstantMessagesRequest that = (ListNewInstantMessagesRequest) obj;
        return Objects.equals(this.caseIds, that.caseIds)
            && Objects.equals(this.lastMessageTimeId, that.lastMessageTimeId)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.xSite, that.xSite)
            && Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.xTimeZone, that.xTimeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseIds, lastMessageTimeId, groupId, xSite, xLanguage, xTimeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNewInstantMessagesRequest {\n");
        sb.append("    caseIds: ").append(toIndentedString(caseIds)).append("\n");
        sb.append("    lastMessageTimeId: ").append(toIndentedString(lastMessageTimeId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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
