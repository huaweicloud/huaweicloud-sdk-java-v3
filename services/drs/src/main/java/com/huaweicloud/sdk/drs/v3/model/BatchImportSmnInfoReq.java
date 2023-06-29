package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 录入、修改收件方式与信息请求体。
 */
public class BatchImportSmnInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<SelectedSetAlarmTaskReq> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify_info")

    private BatchSetAlarmNotifyInfo alarmNotifyInfo;

    public BatchImportSmnInfoReq withJobs(List<SelectedSetAlarmTaskReq> jobs) {
        this.jobs = jobs;
        return this;
    }

    public BatchImportSmnInfoReq addJobsItem(SelectedSetAlarmTaskReq jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchImportSmnInfoReq withJobs(Consumer<List<SelectedSetAlarmTaskReq>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 任务信息
     * @return jobs
     */
    public List<SelectedSetAlarmTaskReq> getJobs() {
        return jobs;
    }

    public void setJobs(List<SelectedSetAlarmTaskReq> jobs) {
        this.jobs = jobs;
    }

    public BatchImportSmnInfoReq withAlarmNotifyInfo(BatchSetAlarmNotifyInfo alarmNotifyInfo) {
        this.alarmNotifyInfo = alarmNotifyInfo;
        return this;
    }

    public BatchImportSmnInfoReq withAlarmNotifyInfo(Consumer<BatchSetAlarmNotifyInfo> alarmNotifyInfoSetter) {
        if (this.alarmNotifyInfo == null) {
            this.alarmNotifyInfo = new BatchSetAlarmNotifyInfo();
            alarmNotifyInfoSetter.accept(this.alarmNotifyInfo);
        }

        return this;
    }

    /**
     * Get alarmNotifyInfo
     * @return alarmNotifyInfo
     */
    public BatchSetAlarmNotifyInfo getAlarmNotifyInfo() {
        return alarmNotifyInfo;
    }

    public void setAlarmNotifyInfo(BatchSetAlarmNotifyInfo alarmNotifyInfo) {
        this.alarmNotifyInfo = alarmNotifyInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchImportSmnInfoReq that = (BatchImportSmnInfoReq) obj;
        return Objects.equals(this.jobs, that.jobs) && Objects.equals(this.alarmNotifyInfo, that.alarmNotifyInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, alarmNotifyInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchImportSmnInfoReq {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    alarmNotifyInfo: ").append(toIndentedString(alarmNotifyInfo)).append("\n");
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
