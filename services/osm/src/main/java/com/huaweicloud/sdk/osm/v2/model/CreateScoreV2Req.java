package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateScoreV2Req
 */
public class CreateScoreV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "judgement")

    private String judgement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_satisfaction_list")

    private List<IncidentSatisfactionV2Do> incidentSatisfactionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public CreateScoreV2Req withJudgement(String judgement) {
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

    public CreateScoreV2Req withIncidentSatisfactionList(List<IncidentSatisfactionV2Do> incidentSatisfactionList) {
        this.incidentSatisfactionList = incidentSatisfactionList;
        return this;
    }

    public CreateScoreV2Req addIncidentSatisfactionListItem(IncidentSatisfactionV2Do incidentSatisfactionListItem) {
        if (this.incidentSatisfactionList == null) {
            this.incidentSatisfactionList = new ArrayList<>();
        }
        this.incidentSatisfactionList.add(incidentSatisfactionListItem);
        return this;
    }

    public CreateScoreV2Req withIncidentSatisfactionList(
        Consumer<List<IncidentSatisfactionV2Do>> incidentSatisfactionListSetter) {
        if (this.incidentSatisfactionList == null) {
            this.incidentSatisfactionList = new ArrayList<>();
        }
        incidentSatisfactionListSetter.accept(this.incidentSatisfactionList);
        return this;
    }

    /**
     * 满意度列表
     * @return incidentSatisfactionList
     */
    public List<IncidentSatisfactionV2Do> getIncidentSatisfactionList() {
        return incidentSatisfactionList;
    }

    public void setIncidentSatisfactionList(List<IncidentSatisfactionV2Do> incidentSatisfactionList) {
        this.incidentSatisfactionList = incidentSatisfactionList;
    }

    public CreateScoreV2Req withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateScoreV2Req createScoreV2Req = (CreateScoreV2Req) o;
        return Objects.equals(this.judgement, createScoreV2Req.judgement)
            && Objects.equals(this.incidentSatisfactionList, createScoreV2Req.incidentSatisfactionList)
            && Objects.equals(this.groupId, createScoreV2Req.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(judgement, incidentSatisfactionList, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScoreV2Req {\n");
        sb.append("    judgement: ").append(toIndentedString(judgement)).append("\n");
        sb.append("    incidentSatisfactionList: ").append(toIndentedString(incidentSatisfactionList)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
