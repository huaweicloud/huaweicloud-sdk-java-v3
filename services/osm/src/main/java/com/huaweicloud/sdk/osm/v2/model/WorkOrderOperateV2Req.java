package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkOrderOperateV2Req
 */
public class WorkOrderOperateV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "judgement")

    private String judgement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_desc")

    private String operateDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_satisfaction_list")

    private List<IncidentSatisfactionV2Do> incidentSatisfactionList = null;

    public WorkOrderOperateV2Req withJudgement(String judgement) {
        this.judgement = judgement;
        return this;
    }

    /**
     * 评价内容
     * @return judgement
     */
    public String getJudgement() {
        return judgement;
    }

    public void setJudgement(String judgement) {
        this.judgement = judgement;
    }

    public WorkOrderOperateV2Req withOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
        return this;
    }

    /**
     * 操作描述
     * @return operateDesc
     */
    public String getOperateDesc() {
        return operateDesc;
    }

    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
    }

    public WorkOrderOperateV2Req withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 华为云IAM组id，操作查询同组其他工单时，该id必传
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WorkOrderOperateV2Req withIncidentSatisfactionList(List<IncidentSatisfactionV2Do> incidentSatisfactionList) {
        this.incidentSatisfactionList = incidentSatisfactionList;
        return this;
    }

    public WorkOrderOperateV2Req addIncidentSatisfactionListItem(
        IncidentSatisfactionV2Do incidentSatisfactionListItem) {
        if (this.incidentSatisfactionList == null) {
            this.incidentSatisfactionList = new ArrayList<>();
        }
        this.incidentSatisfactionList.add(incidentSatisfactionListItem);
        return this;
    }

    public WorkOrderOperateV2Req withIncidentSatisfactionList(
        Consumer<List<IncidentSatisfactionV2Do>> incidentSatisfactionListSetter) {
        if (this.incidentSatisfactionList == null) {
            this.incidentSatisfactionList = new ArrayList<>();
        }
        incidentSatisfactionListSetter.accept(this.incidentSatisfactionList);
        return this;
    }

    /**
     * 工单满意度列表
     * @return incidentSatisfactionList
     */
    public List<IncidentSatisfactionV2Do> getIncidentSatisfactionList() {
        return incidentSatisfactionList;
    }

    public void setIncidentSatisfactionList(List<IncidentSatisfactionV2Do> incidentSatisfactionList) {
        this.incidentSatisfactionList = incidentSatisfactionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkOrderOperateV2Req that = (WorkOrderOperateV2Req) obj;
        return Objects.equals(this.judgement, that.judgement) && Objects.equals(this.operateDesc, that.operateDesc)
            && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.incidentSatisfactionList, that.incidentSatisfactionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(judgement, operateDesc, groupId, incidentSatisfactionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkOrderOperateV2Req {\n");
        sb.append("    judgement: ").append(toIndentedString(judgement)).append("\n");
        sb.append("    operateDesc: ").append(toIndentedString(operateDesc)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    incidentSatisfactionList: ").append(toIndentedString(incidentSatisfactionList)).append("\n");
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
