package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchSetBackupPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "succeeded_num")

    private Integer succeededNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_instances")

    private List<BatchSetBackupPolicyFailedRecordResult> failedInstances = null;

    public BatchSetBackupPolicyResponse withSucceededNum(Integer succeededNum) {
        this.succeededNum = succeededNum;
        return this;
    }

    /**
     * **参数解释**: 设置成功的实例数量。 **取值范围**: 不涉及。
     * @return succeededNum
     */
    public Integer getSucceededNum() {
        return succeededNum;
    }

    public void setSucceededNum(Integer succeededNum) {
        this.succeededNum = succeededNum;
    }

    public BatchSetBackupPolicyResponse withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * **参数解释**: 设置失败的实例数量。 **取值范围**: 不涉及。
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public BatchSetBackupPolicyResponse withFailedInstances(
        List<BatchSetBackupPolicyFailedRecordResult> failedInstances) {
        this.failedInstances = failedInstances;
        return this;
    }

    public BatchSetBackupPolicyResponse addFailedInstancesItem(
        BatchSetBackupPolicyFailedRecordResult failedInstancesItem) {
        if (this.failedInstances == null) {
            this.failedInstances = new ArrayList<>();
        }
        this.failedInstances.add(failedInstancesItem);
        return this;
    }

    public BatchSetBackupPolicyResponse withFailedInstances(
        Consumer<List<BatchSetBackupPolicyFailedRecordResult>> failedInstancesSetter) {
        if (this.failedInstances == null) {
            this.failedInstances = new ArrayList<>();
        }
        failedInstancesSetter.accept(this.failedInstances);
        return this;
    }

    /**
     * **参数解释**: 设置失败的实例记录。
     * @return failedInstances
     */
    public List<BatchSetBackupPolicyFailedRecordResult> getFailedInstances() {
        return failedInstances;
    }

    public void setFailedInstances(List<BatchSetBackupPolicyFailedRecordResult> failedInstances) {
        this.failedInstances = failedInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSetBackupPolicyResponse that = (BatchSetBackupPolicyResponse) obj;
        return Objects.equals(this.succeededNum, that.succeededNum) && Objects.equals(this.failedNum, that.failedNum)
            && Objects.equals(this.failedInstances, that.failedInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(succeededNum, failedNum, failedInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetBackupPolicyResponse {\n");
        sb.append("    succeededNum: ").append(toIndentedString(succeededNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    failedInstances: ").append(toIndentedString(failedInstances)).append("\n");
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
