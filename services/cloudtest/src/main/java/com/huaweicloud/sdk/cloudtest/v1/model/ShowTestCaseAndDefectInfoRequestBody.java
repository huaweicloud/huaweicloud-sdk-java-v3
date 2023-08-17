package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询用户用例关联缺陷的统计信息请求体
 */
public class ShowTestCaseAndDefectInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_id")

    private String branchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_testcase_start_time")

    private String createTestcaseStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_testcase_end_time")

    private String createTestcaseEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_defect_start_time")

    private String associateDefectStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_defect_end_time")

    private String associateDefectEndTime;

    public ShowTestCaseAndDefectInfoRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始偏移量，表示从此偏移量开始查询，offset大于等于0，小于等于100000
     * minimum: 0
     * maximum: 100000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowTestCaseAndDefectInfoRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量,最大支持100条
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowTestCaseAndDefectInfoRequestBody withBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }

    /**
     * 分支ID
     * @return branchId
     */
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public ShowTestCaseAndDefectInfoRequestBody withCreateTestcaseStartTime(String createTestcaseStartTime) {
        this.createTestcaseStartTime = createTestcaseStartTime;
        return this;
    }

    /**
     * 用例创建时间段开始
     * @return createTestcaseStartTime
     */
    public String getCreateTestcaseStartTime() {
        return createTestcaseStartTime;
    }

    public void setCreateTestcaseStartTime(String createTestcaseStartTime) {
        this.createTestcaseStartTime = createTestcaseStartTime;
    }

    public ShowTestCaseAndDefectInfoRequestBody withCreateTestcaseEndTime(String createTestcaseEndTime) {
        this.createTestcaseEndTime = createTestcaseEndTime;
        return this;
    }

    /**
     * 用例创建时间段截止
     * @return createTestcaseEndTime
     */
    public String getCreateTestcaseEndTime() {
        return createTestcaseEndTime;
    }

    public void setCreateTestcaseEndTime(String createTestcaseEndTime) {
        this.createTestcaseEndTime = createTestcaseEndTime;
    }

    public ShowTestCaseAndDefectInfoRequestBody withAssociateDefectStartTime(String associateDefectStartTime) {
        this.associateDefectStartTime = associateDefectStartTime;
        return this;
    }

    /**
     * 缺陷关联时间段开始
     * @return associateDefectStartTime
     */
    public String getAssociateDefectStartTime() {
        return associateDefectStartTime;
    }

    public void setAssociateDefectStartTime(String associateDefectStartTime) {
        this.associateDefectStartTime = associateDefectStartTime;
    }

    public ShowTestCaseAndDefectInfoRequestBody withAssociateDefectEndTime(String associateDefectEndTime) {
        this.associateDefectEndTime = associateDefectEndTime;
        return this;
    }

    /**
     * 缺陷关联时间段截止
     * @return associateDefectEndTime
     */
    public String getAssociateDefectEndTime() {
        return associateDefectEndTime;
    }

    public void setAssociateDefectEndTime(String associateDefectEndTime) {
        this.associateDefectEndTime = associateDefectEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTestCaseAndDefectInfoRequestBody that = (ShowTestCaseAndDefectInfoRequestBody) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.branchId, that.branchId)
            && Objects.equals(this.createTestcaseStartTime, that.createTestcaseStartTime)
            && Objects.equals(this.createTestcaseEndTime, that.createTestcaseEndTime)
            && Objects.equals(this.associateDefectStartTime, that.associateDefectStartTime)
            && Objects.equals(this.associateDefectEndTime, that.associateDefectEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            branchId,
            createTestcaseStartTime,
            createTestcaseEndTime,
            associateDefectStartTime,
            associateDefectEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTestCaseAndDefectInfoRequestBody {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
        sb.append("    createTestcaseStartTime: ").append(toIndentedString(createTestcaseStartTime)).append("\n");
        sb.append("    createTestcaseEndTime: ").append(toIndentedString(createTestcaseEndTime)).append("\n");
        sb.append("    associateDefectStartTime: ").append(toIndentedString(associateDefectStartTime)).append("\n");
        sb.append("    associateDefectEndTime: ").append(toIndentedString(associateDefectEndTime)).append("\n");
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
