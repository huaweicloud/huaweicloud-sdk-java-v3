package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询质量报告看板统计信息请求体
 */
public class TestReportInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_id")

    private String branchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_version_id")

    private String fixedVersionId;

    public TestReportInfoRequestBody withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划id,(plan_id和branch_id不能同时为空，优先取plan_id)
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public TestReportInfoRequestBody withBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }

    /**
     * 分支id,(plan_id和branch_id不能同时为空，优先取plan_id)
     * @return branchId
     */
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public TestReportInfoRequestBody withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块ID(查询未设置传入-2)
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public TestReportInfoRequestBody withFixedVersionId(String fixedVersionId) {
        this.fixedVersionId = fixedVersionId;
        return this;
    }

    /**
     * 筛选迭代ID(查询未设置传入-2)
     * @return fixedVersionId
     */
    public String getFixedVersionId() {
        return fixedVersionId;
    }

    public void setFixedVersionId(String fixedVersionId) {
        this.fixedVersionId = fixedVersionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestReportInfoRequestBody that = (TestReportInfoRequestBody) obj;
        return Objects.equals(this.planId, that.planId) && Objects.equals(this.branchId, that.branchId)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.fixedVersionId, that.fixedVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planId, branchId, moduleId, fixedVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestReportInfoRequestBody {\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    fixedVersionId: ").append(toIndentedString(fixedVersionId)).append("\n");
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
