package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户创建用例以及关联缺陷信息
 */
public class ExternalUserCaseAndDefect {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private NameAndIdVo creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_count")

    private Integer defectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_ids")

    private List<String> defectIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_id")

    private String branchId;

    public ExternalUserCaseAndDefect withCreator(NameAndIdVo creator) {
        this.creator = creator;
        return this;
    }

    public ExternalUserCaseAndDefect withCreator(Consumer<NameAndIdVo> creatorSetter) {
        if (this.creator == null) {
            this.creator = new NameAndIdVo();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public NameAndIdVo getCreator() {
        return creator;
    }

    public void setCreator(NameAndIdVo creator) {
        this.creator = creator;
    }

    public ExternalUserCaseAndDefect withDefectCount(Integer defectCount) {
        this.defectCount = defectCount;
        return this;
    }

    /**
     * 缺陷数
     * @return defectCount
     */
    public Integer getDefectCount() {
        return defectCount;
    }

    public void setDefectCount(Integer defectCount) {
        this.defectCount = defectCount;
    }

    public ExternalUserCaseAndDefect withDefectIds(List<String> defectIds) {
        this.defectIds = defectIds;
        return this;
    }

    public ExternalUserCaseAndDefect addDefectIdsItem(String defectIdsItem) {
        if (this.defectIds == null) {
            this.defectIds = new ArrayList<>();
        }
        this.defectIds.add(defectIdsItem);
        return this;
    }

    public ExternalUserCaseAndDefect withDefectIds(Consumer<List<String>> defectIdsSetter) {
        if (this.defectIds == null) {
            this.defectIds = new ArrayList<>();
        }
        defectIdsSetter.accept(this.defectIds);
        return this;
    }

    /**
     * 缺陷ID列表
     * @return defectIds
     */
    public List<String> getDefectIds() {
        return defectIds;
    }

    public void setDefectIds(List<String> defectIds) {
        this.defectIds = defectIds;
    }

    public ExternalUserCaseAndDefect withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /**
     * 用例ID
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public ExternalUserCaseAndDefect withBranchId(String branchId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalUserCaseAndDefect that = (ExternalUserCaseAndDefect) obj;
        return Objects.equals(this.creator, that.creator) && Objects.equals(this.defectCount, that.defectCount)
            && Objects.equals(this.defectIds, that.defectIds) && Objects.equals(this.testcaseId, that.testcaseId)
            && Objects.equals(this.branchId, that.branchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator, defectCount, defectIds, testcaseId, branchId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalUserCaseAndDefect {\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    defectCount: ").append(toIndentedString(defectCount)).append("\n");
        sb.append("    defectIds: ").append(toIndentedString(defectIds)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
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
