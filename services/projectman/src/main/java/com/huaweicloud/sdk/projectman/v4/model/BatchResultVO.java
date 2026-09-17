package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 批量操作结果数据对象，包含成功数量、失败数量及详细结果列表。 **约束限制**： 不涉及。
 */
public class BatchResultVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private BigDecimal successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_num")

    private BigDecimal failNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<BatchOperateInfo> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private List<BatchOperateInfo> failed = null;

    public BatchResultVO withSuccessNum(BigDecimal successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * **参数解释**： 批量操作成功的数量。 **取值范围**： 不涉及。
     * minimum: 0
     * maximum: 1.2E+3
     * @return successNum
     */
    public BigDecimal getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(BigDecimal successNum) {
        this.successNum = successNum;
    }

    public BatchResultVO withFailNum(BigDecimal failNum) {
        this.failNum = failNum;
        return this;
    }

    /**
     * **参数解释**： 批量操作失败的数量。 **取值范围**： 不涉及。
     * minimum: 0
     * maximum: 1.2E+3
     * @return failNum
     */
    public BigDecimal getFailNum() {
        return failNum;
    }

    public void setFailNum(BigDecimal failNum) {
        this.failNum = failNum;
    }

    public BatchResultVO withSuccess(List<BatchOperateInfo> success) {
        this.success = success;
        return this;
    }

    public BatchResultVO addSuccessItem(BatchOperateInfo successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public BatchResultVO withSuccess(Consumer<List<BatchOperateInfo>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * **参数解释**： 批量操作成功的计划列表。
     * @return success
     */
    public List<BatchOperateInfo> getSuccess() {
        return success;
    }

    public void setSuccess(List<BatchOperateInfo> success) {
        this.success = success;
    }

    public BatchResultVO withFailed(List<BatchOperateInfo> failed) {
        this.failed = failed;
        return this;
    }

    public BatchResultVO addFailedItem(BatchOperateInfo failedItem) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        this.failed.add(failedItem);
        return this;
    }

    public BatchResultVO withFailed(Consumer<List<BatchOperateInfo>> failedSetter) {
        if (this.failed == null) {
            this.failed = new ArrayList<>();
        }
        failedSetter.accept(this.failed);
        return this;
    }

    /**
     * **参数解释**： 批量操作失败的计划列表。
     * @return failed
     */
    public List<BatchOperateInfo> getFailed() {
        return failed;
    }

    public void setFailed(List<BatchOperateInfo> failed) {
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
        BatchResultVO that = (BatchResultVO) obj;
        return Objects.equals(this.successNum, that.successNum) && Objects.equals(this.failNum, that.failNum)
            && Objects.equals(this.success, that.success) && Objects.equals(this.failed, that.failed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successNum, failNum, success, failed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResultVO {\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
