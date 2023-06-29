package com.huaweicloud.sdk.aom.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 审批信息
 */
public class ApproveInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_selected")

    private String topicSelected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_approve")

    private Boolean needApprove;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_urn_list")

    private String smnUrnList;

    public ApproveInfo withTopicSelected(String topicSelected) {
        this.topicSelected = topicSelected;
        return this;
    }

    /**
     * 审批人主题选择。
     * @return topicSelected
     */
    public String getTopicSelected() {
        return topicSelected;
    }

    public void setTopicSelected(String topicSelected) {
        this.topicSelected = topicSelected;
    }

    public ApproveInfo withNeedApprove(Boolean needApprove) {
        this.needApprove = needApprove;
        return this;
    }

    /**
     * 是否审核,默认是不审核，true，false。
     * @return needApprove
     */
    public Boolean getNeedApprove() {
        return needApprove;
    }

    public void setNeedApprove(Boolean needApprove) {
        this.needApprove = needApprove;
    }

    public ApproveInfo withSmnUrnList(String smnUrnList) {
        this.smnUrnList = smnUrnList;
        return this;
    }

    /**
     * 审批主题urn集合。
     * @return smnUrnList
     */
    public String getSmnUrnList() {
        return smnUrnList;
    }

    public void setSmnUrnList(String smnUrnList) {
        this.smnUrnList = smnUrnList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApproveInfo that = (ApproveInfo) obj;
        return Objects.equals(this.topicSelected, that.topicSelected)
            && Objects.equals(this.needApprove, that.needApprove) && Objects.equals(this.smnUrnList, that.smnUrnList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicSelected, needApprove, smnUrnList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApproveInfo {\n");
        sb.append("    topicSelected: ").append(toIndentedString(topicSelected)).append("\n");
        sb.append("    needApprove: ").append(toIndentedString(needApprove)).append("\n");
        sb.append("    smnUrnList: ").append(toIndentedString(smnUrnList)).append("\n");
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
