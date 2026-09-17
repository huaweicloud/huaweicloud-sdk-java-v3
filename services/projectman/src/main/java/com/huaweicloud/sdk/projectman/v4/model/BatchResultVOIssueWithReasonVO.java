package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量操作返回体。
 */
public class BatchResultVOIssueWithReasonVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_num")

    private Integer failNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private List<IssueWithReasonVO> failed = null;

    public BatchResultVOIssueWithReasonVO withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * **参数解释**： 批量操作成功条数。 **取值范围**： 不涉及。
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public BatchResultVOIssueWithReasonVO withFailNum(Integer failNum) {
        this.failNum = failNum;
        return this;
    }

    /**
     * **参数解释**： 批量操作失败条数。 **取值范围**： 不涉及。
     * @return failNum
     */
    public Integer getFailNum() {
        return failNum;
    }

    public void setFailNum(Integer failNum) {
        this.failNum = failNum;
    }

    public BatchResultVOIssueWithReasonVO withFailed(List<IssueWithReasonVO> failed) {
        this.failed = failed;
        return this;
    }

    public BatchResultVOIssueWithReasonVO addFailedItem(IssueWithReasonVO failedItem) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failedItem);
        return this;
    }

    public BatchResultVOIssueWithReasonVO withFailed(Consumer<List<IssueWithReasonVO>> failedSetter) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        failedSetter.accept(this.failed);
        return this;
    }

    /**
     * **参数解释**： 批量操作失败数据及失败原因。 **取值范围**： 不涉及。
     * @return failed
     */
    public List<IssueWithReasonVO> getFailed() {
        return failed;
    }

    public void setFailed(List<IssueWithReasonVO> failed) {
        this.failed = failed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchResultVOIssueWithReasonVO that = (BatchResultVOIssueWithReasonVO) obj;
        return Objects.equals(this.successNum, that.successNum) && Objects.equals(this.failNum, that.failNum)
            && Objects.equals(this.failed, that.failed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successNum, failNum, failed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResultVOIssueWithReasonVO {\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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
