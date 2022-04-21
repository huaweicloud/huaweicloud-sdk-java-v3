package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 项目下某个测试计划操作历史列表
 */
public class TestPlanJournalList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_time")

    private LocalDate operateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private NameAndId operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private List<TestPlanJournalDetail> detail = null;

    public TestPlanJournalList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * DevCloud项目id，项目唯一标识，固定长度32位字符
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TestPlanJournalList withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划id
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public TestPlanJournalList withOperateTime(LocalDate operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * 变更时间
     * @return operateTime
     */
    public LocalDate getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDate operateTime) {
        this.operateTime = operateTime;
    }

    public TestPlanJournalList withOperator(NameAndId operator) {
        this.operator = operator;
        return this;
    }

    public TestPlanJournalList withOperator(Consumer<NameAndId> operatorSetter) {
        if (this.operator == null) {
            this.operator = new NameAndId();
            operatorSetter.accept(this.operator);
        }

        return this;
    }

    /**
     * Get operator
     * @return operator
     */
    public NameAndId getOperator() {
        return operator;
    }

    public void setOperator(NameAndId operator) {
        this.operator = operator;
    }

    public TestPlanJournalList withDetail(List<TestPlanJournalDetail> detail) {
        this.detail = detail;
        return this;
    }

    public TestPlanJournalList addDetailItem(TestPlanJournalDetail detailItem) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        this.detail.add(detailItem);
        return this;
    }

    public TestPlanJournalList withDetail(Consumer<List<TestPlanJournalDetail>> detailSetter) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        detailSetter.accept(this.detail);
        return this;
    }

    /**
     * 历史记录详情
     * @return detail
     */
    public List<TestPlanJournalDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<TestPlanJournalDetail> detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestPlanJournalList testPlanJournalList = (TestPlanJournalList) o;
        return Objects.equals(this.projectId, testPlanJournalList.projectId)
            && Objects.equals(this.planId, testPlanJournalList.planId)
            && Objects.equals(this.operateTime, testPlanJournalList.operateTime)
            && Objects.equals(this.operator, testPlanJournalList.operator)
            && Objects.equals(this.detail, testPlanJournalList.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, planId, operateTime, operator, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestPlanJournalList {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
