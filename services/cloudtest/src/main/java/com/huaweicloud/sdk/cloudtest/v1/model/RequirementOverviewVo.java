package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 质量报告需求测试情况列表
 */
public class RequirementOverviewVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workitem_id")

    private String workitemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_id")

    private String sequenceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "board_id")

    private String boardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private String trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_name")

    private String trackerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relate_case_number")

    private Integer relateCaseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_pass_vo")

    private CasePassVo casePassVo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_execute_vo")

    private CaseExecuteVo caseExecuteVo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relate_defect_number")

    private Integer relateDefectNumber;

    public RequirementOverviewVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 需求名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RequirementOverviewVo withWorkitemId(String workitemId) {
        this.workitemId = workitemId;
        return this;
    }

    /**
     * 需求id
     * @return workitemId
     */
    public String getWorkitemId() {
        return workitemId;
    }

    public void setWorkitemId(String workitemId) {
        this.workitemId = workitemId;
    }

    public RequirementOverviewVo withSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }

    /**
     * 需求序列编号
     * @return sequenceId
     */
    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public RequirementOverviewVo withBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }

    /**
     * 看板需求id
     * @return boardId
     */
    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public RequirementOverviewVo withTrackerId(String trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 需求类型id
     * @return trackerId
     */
    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }

    public RequirementOverviewVo withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * 需求类型
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public RequirementOverviewVo withRelateCaseNumber(Integer relateCaseNumber) {
        this.relateCaseNumber = relateCaseNumber;
        return this;
    }

    /**
     * 需求关联用例总数
     * @return relateCaseNumber
     */
    public Integer getRelateCaseNumber() {
        return relateCaseNumber;
    }

    public void setRelateCaseNumber(Integer relateCaseNumber) {
        this.relateCaseNumber = relateCaseNumber;
    }

    public RequirementOverviewVo withCasePassVo(CasePassVo casePassVo) {
        this.casePassVo = casePassVo;
        return this;
    }

    public RequirementOverviewVo withCasePassVo(Consumer<CasePassVo> casePassVoSetter) {
        if (this.casePassVo == null) {
            this.casePassVo = new CasePassVo();
            casePassVoSetter.accept(this.casePassVo);
        }

        return this;
    }

    /**
     * Get casePassVo
     * @return casePassVo
     */
    public CasePassVo getCasePassVo() {
        return casePassVo;
    }

    public void setCasePassVo(CasePassVo casePassVo) {
        this.casePassVo = casePassVo;
    }

    public RequirementOverviewVo withCaseExecuteVo(CaseExecuteVo caseExecuteVo) {
        this.caseExecuteVo = caseExecuteVo;
        return this;
    }

    public RequirementOverviewVo withCaseExecuteVo(Consumer<CaseExecuteVo> caseExecuteVoSetter) {
        if (this.caseExecuteVo == null) {
            this.caseExecuteVo = new CaseExecuteVo();
            caseExecuteVoSetter.accept(this.caseExecuteVo);
        }

        return this;
    }

    /**
     * Get caseExecuteVo
     * @return caseExecuteVo
     */
    public CaseExecuteVo getCaseExecuteVo() {
        return caseExecuteVo;
    }

    public void setCaseExecuteVo(CaseExecuteVo caseExecuteVo) {
        this.caseExecuteVo = caseExecuteVo;
    }

    public RequirementOverviewVo withRelateDefectNumber(Integer relateDefectNumber) {
        this.relateDefectNumber = relateDefectNumber;
        return this;
    }

    /**
     * 需求关联缺陷总数
     * @return relateDefectNumber
     */
    public Integer getRelateDefectNumber() {
        return relateDefectNumber;
    }

    public void setRelateDefectNumber(Integer relateDefectNumber) {
        this.relateDefectNumber = relateDefectNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequirementOverviewVo that = (RequirementOverviewVo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.workitemId, that.workitemId)
            && Objects.equals(this.sequenceId, that.sequenceId) && Objects.equals(this.boardId, that.boardId)
            && Objects.equals(this.trackerId, that.trackerId) && Objects.equals(this.trackerName, that.trackerName)
            && Objects.equals(this.relateCaseNumber, that.relateCaseNumber)
            && Objects.equals(this.casePassVo, that.casePassVo)
            && Objects.equals(this.caseExecuteVo, that.caseExecuteVo)
            && Objects.equals(this.relateDefectNumber, that.relateDefectNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            workitemId,
            sequenceId,
            boardId,
            trackerId,
            trackerName,
            relateCaseNumber,
            casePassVo,
            caseExecuteVo,
            relateDefectNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequirementOverviewVo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    workitemId: ").append(toIndentedString(workitemId)).append("\n");
        sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
        sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
        sb.append("    relateCaseNumber: ").append(toIndentedString(relateCaseNumber)).append("\n");
        sb.append("    casePassVo: ").append(toIndentedString(casePassVo)).append("\n");
        sb.append("    caseExecuteVo: ").append(toIndentedString(caseExecuteVo)).append("\n");
        sb.append("    relateDefectNumber: ").append(toIndentedString(relateDefectNumber)).append("\n");
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
