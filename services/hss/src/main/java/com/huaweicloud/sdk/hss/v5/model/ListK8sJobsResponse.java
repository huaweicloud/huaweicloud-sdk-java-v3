package com.huaweicloud.sdk.hss.v5.model;

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
public class ListK8sJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_info_list")

    private List<ServerlessJobInfo> jobInfoList = null;

    public ListK8sJobsResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 普通任务总量
     * minimum: 0
     * maximum: 65535
     * @return totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public ListK8sJobsResponse withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最近更新时间
     * minimum: 0
     * maximum: 4071095999000
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ListK8sJobsResponse withJobInfoList(List<ServerlessJobInfo> jobInfoList) {
        this.jobInfoList = jobInfoList;
        return this;
    }

    public ListK8sJobsResponse addJobInfoListItem(ServerlessJobInfo jobInfoListItem) {
        if (this.jobInfoList == null) {
            this.jobInfoList = new ArrayList<>();
        }
        this.jobInfoList.add(jobInfoListItem);
        return this;
    }

    public ListK8sJobsResponse withJobInfoList(Consumer<List<ServerlessJobInfo>> jobInfoListSetter) {
        if (this.jobInfoList == null) {
            this.jobInfoList = new ArrayList<>();
        }
        jobInfoListSetter.accept(this.jobInfoList);
        return this;
    }

    /**
     * 普通任务基本信息列表
     * @return jobInfoList
     */
    public List<ServerlessJobInfo> getJobInfoList() {
        return jobInfoList;
    }

    public void setJobInfoList(List<ServerlessJobInfo> jobInfoList) {
        this.jobInfoList = jobInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListK8sJobsResponse that = (ListK8sJobsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.jobInfoList, that.jobInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, lastUpdateTime, jobInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListK8sJobsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    jobInfoList: ").append(toIndentedString(jobInfoList)).append("\n");
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
