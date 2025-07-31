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
public class ListK8sCronJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cronjob_info_list")

    private List<ServerlessCronJobInfo> cronjobInfoList = null;

    public ListK8sCronJobsResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 定时任务总量
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

    public ListK8sCronJobsResponse withLastUpdateTime(Long lastUpdateTime) {
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

    public ListK8sCronJobsResponse withCronjobInfoList(List<ServerlessCronJobInfo> cronjobInfoList) {
        this.cronjobInfoList = cronjobInfoList;
        return this;
    }

    public ListK8sCronJobsResponse addCronjobInfoListItem(ServerlessCronJobInfo cronjobInfoListItem) {
        if (this.cronjobInfoList == null) {
            this.cronjobInfoList = new ArrayList<>();
        }
        this.cronjobInfoList.add(cronjobInfoListItem);
        return this;
    }

    public ListK8sCronJobsResponse withCronjobInfoList(Consumer<List<ServerlessCronJobInfo>> cronjobInfoListSetter) {
        if (this.cronjobInfoList == null) {
            this.cronjobInfoList = new ArrayList<>();
        }
        cronjobInfoListSetter.accept(this.cronjobInfoList);
        return this;
    }

    /**
     * 定时任务基本信息列表
     * @return cronjobInfoList
     */
    public List<ServerlessCronJobInfo> getCronjobInfoList() {
        return cronjobInfoList;
    }

    public void setCronjobInfoList(List<ServerlessCronJobInfo> cronjobInfoList) {
        this.cronjobInfoList = cronjobInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListK8sCronJobsResponse that = (ListK8sCronJobsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.cronjobInfoList, that.cronjobInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, lastUpdateTime, cronjobInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListK8sCronJobsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    cronjobInfoList: ").append(toIndentedString(cronjobInfoList)).append("\n");
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
