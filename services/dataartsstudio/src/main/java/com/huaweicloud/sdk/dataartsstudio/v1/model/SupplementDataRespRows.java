package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SupplementDataRespRows
 */
public class SupplementDataRespRows {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private Long endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_list")

    private List<String> jobList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Integer parallel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private Long startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submitted_date")

    private Long submittedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supplement_data_instance_time")

    private SupplementDataRespSupplementDataInstanceTime supplementDataInstanceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supplement_data_run_time")

    private SupplementDataRespSupplementDataRunTime supplementDataRunTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public SupplementDataRespRows withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 作业的开始日期 13位时间戳
     * @return endDate
     */
    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public SupplementDataRespRows withJobList(List<String> jobList) {
        this.jobList = jobList;
        return this;
    }

    public SupplementDataRespRows addJobListItem(String jobListItem) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public SupplementDataRespRows withJobList(Consumer<List<String>> jobListSetter) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        jobListSetter.accept(this.jobList);
        return this;
    }

    /**
     * 补数据作业名称，可能有依赖的作业，故会有多个作业的情况。
     * @return jobList
     */
    public List<String> getJobList() {
        return jobList;
    }

    public void setJobList(List<String> jobList) {
        this.jobList = jobList;
    }

    public SupplementDataRespRows withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 补数据名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplementDataRespRows withParallel(Integer parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * 并行周期数，取值范围[1,5]
     * @return parallel
     */
    public Integer getParallel() {
        return parallel;
    }

    public void setParallel(Integer parallel) {
        this.parallel = parallel;
    }

    public SupplementDataRespRows withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 作业的结束日期 13位时间戳
     * @return startDate
     */
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public SupplementDataRespRows withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态：SUCCESS：成功RUNNING ：运行中CANCLE：取消
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SupplementDataRespRows withSubmittedDate(Long submittedDate) {
        this.submittedDate = submittedDate;
        return this;
    }

    /**
     * 作业提交时间，13位时间戳
     * @return submittedDate
     */
    public Long getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Long submittedDate) {
        this.submittedDate = submittedDate;
    }

    public SupplementDataRespRows withSupplementDataInstanceTime(
        SupplementDataRespSupplementDataInstanceTime supplementDataInstanceTime) {
        this.supplementDataInstanceTime = supplementDataInstanceTime;
        return this;
    }

    public SupplementDataRespRows withSupplementDataInstanceTime(
        Consumer<SupplementDataRespSupplementDataInstanceTime> supplementDataInstanceTimeSetter) {
        if (this.supplementDataInstanceTime == null) {
            this.supplementDataInstanceTime = new SupplementDataRespSupplementDataInstanceTime();
            supplementDataInstanceTimeSetter.accept(this.supplementDataInstanceTime);
        }

        return this;
    }

    /**
     * Get supplementDataInstanceTime
     * @return supplementDataInstanceTime
     */
    public SupplementDataRespSupplementDataInstanceTime getSupplementDataInstanceTime() {
        return supplementDataInstanceTime;
    }

    public void setSupplementDataInstanceTime(SupplementDataRespSupplementDataInstanceTime supplementDataInstanceTime) {
        this.supplementDataInstanceTime = supplementDataInstanceTime;
    }

    public SupplementDataRespRows withSupplementDataRunTime(
        SupplementDataRespSupplementDataRunTime supplementDataRunTime) {
        this.supplementDataRunTime = supplementDataRunTime;
        return this;
    }

    public SupplementDataRespRows withSupplementDataRunTime(
        Consumer<SupplementDataRespSupplementDataRunTime> supplementDataRunTimeSetter) {
        if (this.supplementDataRunTime == null) {
            this.supplementDataRunTime = new SupplementDataRespSupplementDataRunTime();
            supplementDataRunTimeSetter.accept(this.supplementDataRunTime);
        }

        return this;
    }

    /**
     * Get supplementDataRunTime
     * @return supplementDataRunTime
     */
    public SupplementDataRespSupplementDataRunTime getSupplementDataRunTime() {
        return supplementDataRunTime;
    }

    public void setSupplementDataRunTime(SupplementDataRespSupplementDataRunTime supplementDataRunTime) {
        this.supplementDataRunTime = supplementDataRunTime;
    }

    public SupplementDataRespRows withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 触发补数据的类型，取值范围[0, 1]。0代表作业监控界面触发的补数据，1代表恢复动作触发的补数据
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public SupplementDataRespRows withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupplementDataRespRows that = (SupplementDataRespRows) obj;
        return Objects.equals(this.endDate, that.endDate) && Objects.equals(this.jobList, that.jobList)
            && Objects.equals(this.name, that.name) && Objects.equals(this.parallel, that.parallel)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.status, that.status)
            && Objects.equals(this.submittedDate, that.submittedDate)
            && Objects.equals(this.supplementDataInstanceTime, that.supplementDataInstanceTime)
            && Objects.equals(this.supplementDataRunTime, that.supplementDataRunTime)
            && Objects.equals(this.type, that.type) && Objects.equals(this.userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endDate,
            jobList,
            name,
            parallel,
            startDate,
            status,
            submittedDate,
            supplementDataInstanceTime,
            supplementDataRunTime,
            type,
            userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupplementDataRespRows {\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    jobList: ").append(toIndentedString(jobList)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
        sb.append("    supplementDataInstanceTime: ").append(toIndentedString(supplementDataInstanceTime)).append("\n");
        sb.append("    supplementDataRunTime: ").append(toIndentedString(supplementDataRunTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
