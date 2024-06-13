package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlertGroup
 */
public class AlertGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dingTalkHookUrl")

    private String dingTalkHookUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weChatWorkHookUrl")

    private String weChatWorkHookUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weLinkGroupNo")

    private String weLinkGroupNo;

    public AlertGroup withDingTalkHookUrl(String dingTalkHookUrl) {
        this.dingTalkHookUrl = dingTalkHookUrl;
        return this;
    }

    /**
     * Get dingTalkHookUrl
     * @return dingTalkHookUrl
     */
    public String getDingTalkHookUrl() {
        return dingTalkHookUrl;
    }

    public void setDingTalkHookUrl(String dingTalkHookUrl) {
        this.dingTalkHookUrl = dingTalkHookUrl;
    }

    public AlertGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 告警组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public AlertGroup withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 告警组ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AlertGroup withWeChatWorkHookUrl(String weChatWorkHookUrl) {
        this.weChatWorkHookUrl = weChatWorkHookUrl;
        return this;
    }

    /**
     * Get weChatWorkHookUrl
     * @return weChatWorkHookUrl
     */
    public String getWeChatWorkHookUrl() {
        return weChatWorkHookUrl;
    }

    public void setWeChatWorkHookUrl(String weChatWorkHookUrl) {
        this.weChatWorkHookUrl = weChatWorkHookUrl;
    }

    public AlertGroup withWeLinkGroupNo(String weLinkGroupNo) {
        this.weLinkGroupNo = weLinkGroupNo;
        return this;
    }

    /**
     * Get weLinkGroupNo
     * @return weLinkGroupNo
     */
    public String getWeLinkGroupNo() {
        return weLinkGroupNo;
    }

    public void setWeLinkGroupNo(String weLinkGroupNo) {
        this.weLinkGroupNo = weLinkGroupNo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertGroup that = (AlertGroup) obj;
        return Objects.equals(this.dingTalkHookUrl, that.dingTalkHookUrl)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.weChatWorkHookUrl, that.weChatWorkHookUrl)
            && Objects.equals(this.weLinkGroupNo, that.weLinkGroupNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dingTalkHookUrl, groupName, id, weChatWorkHookUrl, weLinkGroupNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertGroup {\n");
        sb.append("    dingTalkHookUrl: ").append(toIndentedString(dingTalkHookUrl)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    weChatWorkHookUrl: ").append(toIndentedString(weChatWorkHookUrl)).append("\n");
        sb.append("    weLinkGroupNo: ").append(toIndentedString(weLinkGroupNo)).append("\n");
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
