package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SupplementDataResp
 */
public class SupplementDataResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endDate")

    private BigDecimal endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobList")

    private List<String> jobList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Integer parallel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startDate")

    private BigDecimal startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submittedDate")

    private BigDecimal submittedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supplement_data_instance_time")

    private Object supplementDataInstanceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supplement_data_run_time")

    private Object supplementDataRunTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userName")

    private String userName;

    public SupplementDataResp withEndDate(BigDecimal endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get endDate
     * @return endDate
     */
    public BigDecimal getEndDate() {
        return endDate;
    }

    public void setEndDate(BigDecimal endDate) {
        this.endDate = endDate;
    }

    public SupplementDataResp withJobList(List<String> jobList) {
        this.jobList = jobList;
        return this;
    }

    public SupplementDataResp addJobListItem(String jobListItem) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        this.jobList.add(jobListItem);
        return this;
    }

    public SupplementDataResp withJobList(Consumer<List<String>> jobListSetter) {
        if (this.jobList == null) {
            this.jobList = new ArrayList<>();
        }
        jobListSetter.accept(this.jobList);
        return this;
    }

    /**
     * Get jobList
     * @return jobList
     */
    public List<String> getJobList() {
        return jobList;
    }

    public void setJobList(List<String> jobList) {
        this.jobList = jobList;
    }

    public SupplementDataResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplementDataResp withParallel(Integer parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * Get parallel
     * @return parallel
     */
    public Integer getParallel() {
        return parallel;
    }

    public void setParallel(Integer parallel) {
        this.parallel = parallel;
    }

    public SupplementDataResp withStartDate(BigDecimal startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get startDate
     * @return startDate
     */
    public BigDecimal getStartDate() {
        return startDate;
    }

    public void setStartDate(BigDecimal startDate) {
        this.startDate = startDate;
    }

    public SupplementDataResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SupplementDataResp withSubmittedDate(BigDecimal submittedDate) {
        this.submittedDate = submittedDate;
        return this;
    }

    /**
     * Get submittedDate
     * @return submittedDate
     */
    public BigDecimal getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(BigDecimal submittedDate) {
        this.submittedDate = submittedDate;
    }

    public SupplementDataResp withSupplementDataInstanceTime(Object supplementDataInstanceTime) {
        this.supplementDataInstanceTime = supplementDataInstanceTime;
        return this;
    }

    /**
     * Get supplementDataInstanceTime
     * @return supplementDataInstanceTime
     */
    public Object getSupplementDataInstanceTime() {
        return supplementDataInstanceTime;
    }

    public void setSupplementDataInstanceTime(Object supplementDataInstanceTime) {
        this.supplementDataInstanceTime = supplementDataInstanceTime;
    }

    public SupplementDataResp withSupplementDataRunTime(Object supplementDataRunTime) {
        this.supplementDataRunTime = supplementDataRunTime;
        return this;
    }

    /**
     * Get supplementDataRunTime
     * @return supplementDataRunTime
     */
    public Object getSupplementDataRunTime() {
        return supplementDataRunTime;
    }

    public void setSupplementDataRunTime(Object supplementDataRunTime) {
        this.supplementDataRunTime = supplementDataRunTime;
    }

    public SupplementDataResp withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public SupplementDataResp withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get userName
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
        SupplementDataResp that = (SupplementDataResp) obj;
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
        sb.append("class SupplementDataResp {\n");
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
