package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListFactoryAlarmRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rules_items_details")

    private List<AlarmRulesItemsDetails> alarmRulesItemsDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assurance_mission_commitment_time_not_completed_count")

    private Integer assuranceMissionCommitmentTimeNotCompletedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assurance_mission_failed_count")

    private Integer assuranceMissionFailedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assurance_mission_warning_time_not_completed_count")

    private Integer assuranceMissionWarningTimeNotCompletedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_error_count")

    private Integer baselineErrorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_jobs_count")

    private Integer cancelJobsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exception_count")

    private Integer exceptionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_count")

    private Integer modifyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_period_unfinished_count")

    private Integer multiPeriodUnfinishedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overload_count")

    private Integer overloadCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recover_jobs_count")

    private Integer recoverJobsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_all")

    private Integer totalAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unfinished_count")

    private Integer unfinishedCount;

    public ListFactoryAlarmRulesResponse withAlarmRulesItemsDetails(
        List<AlarmRulesItemsDetails> alarmRulesItemsDetails) {
        this.alarmRulesItemsDetails = alarmRulesItemsDetails;
        return this;
    }

    public ListFactoryAlarmRulesResponse addAlarmRulesItemsDetailsItem(
        AlarmRulesItemsDetails alarmRulesItemsDetailsItem) {
        if (this.alarmRulesItemsDetails == null) {
            this.alarmRulesItemsDetails = new ArrayList<>();
        }
        this.alarmRulesItemsDetails.add(alarmRulesItemsDetailsItem);
        return this;
    }

    public ListFactoryAlarmRulesResponse withAlarmRulesItemsDetails(
        Consumer<List<AlarmRulesItemsDetails>> alarmRulesItemsDetailsSetter) {
        if (this.alarmRulesItemsDetails == null) {
            this.alarmRulesItemsDetails = new ArrayList<>();
        }
        alarmRulesItemsDetailsSetter.accept(this.alarmRulesItemsDetails);
        return this;
    }

    /**
     * 通知规则明细。
     * @return alarmRulesItemsDetails
     */
    public List<AlarmRulesItemsDetails> getAlarmRulesItemsDetails() {
        return alarmRulesItemsDetails;
    }

    public void setAlarmRulesItemsDetails(List<AlarmRulesItemsDetails> alarmRulesItemsDetails) {
        this.alarmRulesItemsDetails = alarmRulesItemsDetails;
    }

    public ListFactoryAlarmRulesResponse withAssuranceMissionCommitmentTimeNotCompletedCount(
        Integer assuranceMissionCommitmentTimeNotCompletedCount) {
        this.assuranceMissionCommitmentTimeNotCompletedCount = assuranceMissionCommitmentTimeNotCompletedCount;
        return this;
    }

    /**
     * 保障作业承诺时间未完成数量。
     * @return assuranceMissionCommitmentTimeNotCompletedCount
     */
    public Integer getAssuranceMissionCommitmentTimeNotCompletedCount() {
        return assuranceMissionCommitmentTimeNotCompletedCount;
    }

    public void setAssuranceMissionCommitmentTimeNotCompletedCount(
        Integer assuranceMissionCommitmentTimeNotCompletedCount) {
        this.assuranceMissionCommitmentTimeNotCompletedCount = assuranceMissionCommitmentTimeNotCompletedCount;
    }

    public ListFactoryAlarmRulesResponse withAssuranceMissionFailedCount(Integer assuranceMissionFailedCount) {
        this.assuranceMissionFailedCount = assuranceMissionFailedCount;
        return this;
    }

    /**
     * 保障作业失败数量。
     * @return assuranceMissionFailedCount
     */
    public Integer getAssuranceMissionFailedCount() {
        return assuranceMissionFailedCount;
    }

    public void setAssuranceMissionFailedCount(Integer assuranceMissionFailedCount) {
        this.assuranceMissionFailedCount = assuranceMissionFailedCount;
    }

    public ListFactoryAlarmRulesResponse withAssuranceMissionWarningTimeNotCompletedCount(
        Integer assuranceMissionWarningTimeNotCompletedCount) {
        this.assuranceMissionWarningTimeNotCompletedCount = assuranceMissionWarningTimeNotCompletedCount;
        return this;
    }

    /**
     * 保障作业预警时间未完成数量。
     * @return assuranceMissionWarningTimeNotCompletedCount
     */
    public Integer getAssuranceMissionWarningTimeNotCompletedCount() {
        return assuranceMissionWarningTimeNotCompletedCount;
    }

    public void setAssuranceMissionWarningTimeNotCompletedCount(Integer assuranceMissionWarningTimeNotCompletedCount) {
        this.assuranceMissionWarningTimeNotCompletedCount = assuranceMissionWarningTimeNotCompletedCount;
    }

    public ListFactoryAlarmRulesResponse withBaselineErrorCount(Integer baselineErrorCount) {
        this.baselineErrorCount = baselineErrorCount;
        return this;
    }

    /**
     * 基线作业失败数量。
     * @return baselineErrorCount
     */
    public Integer getBaselineErrorCount() {
        return baselineErrorCount;
    }

    public void setBaselineErrorCount(Integer baselineErrorCount) {
        this.baselineErrorCount = baselineErrorCount;
    }

    public ListFactoryAlarmRulesResponse withCancelJobsCount(Integer cancelJobsCount) {
        this.cancelJobsCount = cancelJobsCount;
        return this;
    }

    /**
     * 作业取消数量。
     * @return cancelJobsCount
     */
    public Integer getCancelJobsCount() {
        return cancelJobsCount;
    }

    public void setCancelJobsCount(Integer cancelJobsCount) {
        this.cancelJobsCount = cancelJobsCount;
    }

    public ListFactoryAlarmRulesResponse withExceptionCount(Integer exceptionCount) {
        this.exceptionCount = exceptionCount;
        return this;
    }

    /**
     * 作业异常数量。
     * @return exceptionCount
     */
    public Integer getExceptionCount() {
        return exceptionCount;
    }

    public void setExceptionCount(Integer exceptionCount) {
        this.exceptionCount = exceptionCount;
    }

    public ListFactoryAlarmRulesResponse withModifyCount(Integer modifyCount) {
        this.modifyCount = modifyCount;
        return this;
    }

    /**
     * 修改作业数量。
     * @return modifyCount
     */
    public Integer getModifyCount() {
        return modifyCount;
    }

    public void setModifyCount(Integer modifyCount) {
        this.modifyCount = modifyCount;
    }

    public ListFactoryAlarmRulesResponse withMultiPeriodUnfinishedCount(Integer multiPeriodUnfinishedCount) {
        this.multiPeriodUnfinishedCount = multiPeriodUnfinishedCount;
        return this;
    }

    /**
     * 多周期未完成数量。
     * @return multiPeriodUnfinishedCount
     */
    public Integer getMultiPeriodUnfinishedCount() {
        return multiPeriodUnfinishedCount;
    }

    public void setMultiPeriodUnfinishedCount(Integer multiPeriodUnfinishedCount) {
        this.multiPeriodUnfinishedCount = multiPeriodUnfinishedCount;
    }

    public ListFactoryAlarmRulesResponse withOverloadCount(Integer overloadCount) {
        this.overloadCount = overloadCount;
        return this;
    }

    /**
     * 资源繁忙作业数量。
     * @return overloadCount
     */
    public Integer getOverloadCount() {
        return overloadCount;
    }

    public void setOverloadCount(Integer overloadCount) {
        this.overloadCount = overloadCount;
    }

    public ListFactoryAlarmRulesResponse withRecoverJobsCount(Integer recoverJobsCount) {
        this.recoverJobsCount = recoverJobsCount;
        return this;
    }

    /**
     * 失败作业恢复数量。
     * @return recoverJobsCount
     */
    public Integer getRecoverJobsCount() {
        return recoverJobsCount;
    }

    public void setRecoverJobsCount(Integer recoverJobsCount) {
        this.recoverJobsCount = recoverJobsCount;
    }

    public ListFactoryAlarmRulesResponse withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 作业成功数量。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public ListFactoryAlarmRulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 作业总数量。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListFactoryAlarmRulesResponse withTotalAll(Integer totalAll) {
        this.totalAll = totalAll;
        return this;
    }

    /**
     * 通知规则数量。
     * @return totalAll
     */
    public Integer getTotalAll() {
        return totalAll;
    }

    public void setTotalAll(Integer totalAll) {
        this.totalAll = totalAll;
    }

    public ListFactoryAlarmRulesResponse withUnfinishedCount(Integer unfinishedCount) {
        this.unfinishedCount = unfinishedCount;
        return this;
    }

    /**
     * 未完成作业数量。
     * @return unfinishedCount
     */
    public Integer getUnfinishedCount() {
        return unfinishedCount;
    }

    public void setUnfinishedCount(Integer unfinishedCount) {
        this.unfinishedCount = unfinishedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryAlarmRulesResponse that = (ListFactoryAlarmRulesResponse) obj;
        return Objects.equals(this.alarmRulesItemsDetails, that.alarmRulesItemsDetails)
            && Objects.equals(this.assuranceMissionCommitmentTimeNotCompletedCount,
                that.assuranceMissionCommitmentTimeNotCompletedCount)
            && Objects.equals(this.assuranceMissionFailedCount, that.assuranceMissionFailedCount)
            && Objects.equals(this.assuranceMissionWarningTimeNotCompletedCount,
                that.assuranceMissionWarningTimeNotCompletedCount)
            && Objects.equals(this.baselineErrorCount, that.baselineErrorCount)
            && Objects.equals(this.cancelJobsCount, that.cancelJobsCount)
            && Objects.equals(this.exceptionCount, that.exceptionCount)
            && Objects.equals(this.modifyCount, that.modifyCount)
            && Objects.equals(this.multiPeriodUnfinishedCount, that.multiPeriodUnfinishedCount)
            && Objects.equals(this.overloadCount, that.overloadCount)
            && Objects.equals(this.recoverJobsCount, that.recoverJobsCount)
            && Objects.equals(this.successCount, that.successCount) && Objects.equals(this.total, that.total)
            && Objects.equals(this.totalAll, that.totalAll)
            && Objects.equals(this.unfinishedCount, that.unfinishedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRulesItemsDetails,
            assuranceMissionCommitmentTimeNotCompletedCount,
            assuranceMissionFailedCount,
            assuranceMissionWarningTimeNotCompletedCount,
            baselineErrorCount,
            cancelJobsCount,
            exceptionCount,
            modifyCount,
            multiPeriodUnfinishedCount,
            overloadCount,
            recoverJobsCount,
            successCount,
            total,
            totalAll,
            unfinishedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryAlarmRulesResponse {\n");
        sb.append("    alarmRulesItemsDetails: ").append(toIndentedString(alarmRulesItemsDetails)).append("\n");
        sb.append("    assuranceMissionCommitmentTimeNotCompletedCount: ")
            .append(toIndentedString(assuranceMissionCommitmentTimeNotCompletedCount))
            .append("\n");
        sb.append("    assuranceMissionFailedCount: ")
            .append(toIndentedString(assuranceMissionFailedCount))
            .append("\n");
        sb.append("    assuranceMissionWarningTimeNotCompletedCount: ")
            .append(toIndentedString(assuranceMissionWarningTimeNotCompletedCount))
            .append("\n");
        sb.append("    baselineErrorCount: ").append(toIndentedString(baselineErrorCount)).append("\n");
        sb.append("    cancelJobsCount: ").append(toIndentedString(cancelJobsCount)).append("\n");
        sb.append("    exceptionCount: ").append(toIndentedString(exceptionCount)).append("\n");
        sb.append("    modifyCount: ").append(toIndentedString(modifyCount)).append("\n");
        sb.append("    multiPeriodUnfinishedCount: ").append(toIndentedString(multiPeriodUnfinishedCount)).append("\n");
        sb.append("    overloadCount: ").append(toIndentedString(overloadCount)).append("\n");
        sb.append("    recoverJobsCount: ").append(toIndentedString(recoverJobsCount)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    totalAll: ").append(toIndentedString(totalAll)).append("\n");
        sb.append("    unfinishedCount: ").append(toIndentedString(unfinishedCount)).append("\n");
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
