package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单据历史信息基础信息
 */
public class CocTicketHistoryBaseInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name_zh")

    private String actionNameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name_en")

    private String actionNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_time")

    private String stopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_data_list")

    private List<CocTicketEnumDataV2> enumDataList = null;

    public CocTicketHistoryBaseInfoV2 withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * action
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CocTicketHistoryBaseInfoV2 withActionNameZh(String actionNameZh) {
        this.actionNameZh = actionNameZh;
        return this;
    }

    /**
     * action中文名称
     * @return actionNameZh
     */
    public String getActionNameZh() {
        return actionNameZh;
    }

    public void setActionNameZh(String actionNameZh) {
        this.actionNameZh = actionNameZh;
    }

    public CocTicketHistoryBaseInfoV2 withActionNameEn(String actionNameEn) {
        this.actionNameEn = actionNameEn;
        return this;
    }

    /**
     * action英文名称
     * @return actionNameEn
     */
    public String getActionNameEn() {
        return actionNameEn;
    }

    public void setActionNameEn(String actionNameEn) {
        this.actionNameEn = actionNameEn;
    }

    public CocTicketHistoryBaseInfoV2 withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作人ID
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public CocTicketHistoryBaseInfoV2 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 当前状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CocTicketHistoryBaseInfoV2 withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 操作开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CocTicketHistoryBaseInfoV2 withStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * 操作结束时间
     * @return stopTime
     */
    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public CocTicketHistoryBaseInfoV2 withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 备注信息
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CocTicketHistoryBaseInfoV2 withEnumDataList(List<CocTicketEnumDataV2> enumDataList) {
        this.enumDataList = enumDataList;
        return this;
    }

    public CocTicketHistoryBaseInfoV2 addEnumDataListItem(CocTicketEnumDataV2 enumDataListItem) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        this.enumDataList.add(enumDataListItem);
        return this;
    }

    public CocTicketHistoryBaseInfoV2 withEnumDataList(Consumer<List<CocTicketEnumDataV2>> enumDataListSetter) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        enumDataListSetter.accept(this.enumDataList);
        return this;
    }

    /**
     * 枚举数据列表
     * @return enumDataList
     */
    public List<CocTicketEnumDataV2> getEnumDataList() {
        return enumDataList;
    }

    public void setEnumDataList(List<CocTicketEnumDataV2> enumDataList) {
        this.enumDataList = enumDataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CocTicketHistoryBaseInfoV2 that = (CocTicketHistoryBaseInfoV2) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.actionNameZh, that.actionNameZh)
            && Objects.equals(this.actionNameEn, that.actionNameEn) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.stopTime, that.stopTime) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.enumDataList, that.enumDataList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(action, actionNameZh, actionNameEn, operator, status, startTime, stopTime, comment, enumDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocTicketHistoryBaseInfoV2 {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionNameZh: ").append(toIndentedString(actionNameZh)).append("\n");
        sb.append("    actionNameEn: ").append(toIndentedString(actionNameEn)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    enumDataList: ").append(toIndentedString(enumDataList)).append("\n");
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
