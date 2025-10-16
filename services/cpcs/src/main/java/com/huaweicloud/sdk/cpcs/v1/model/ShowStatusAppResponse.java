package com.huaweicloud.sdk.cpcs.v1.model;

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
public class ShowStatusAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_list")

    private List<ShowStatusAppItem> appList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_access_count")

    private Long totalAccessCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_access_count")

    private Long successAccessCount;

    public ShowStatusAppResponse withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 资源名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowStatusAppResponse withAppList(List<ShowStatusAppItem> appList) {
        this.appList = appList;
        return this;
    }

    public ShowStatusAppResponse addAppListItem(ShowStatusAppItem appListItem) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        this.appList.add(appListItem);
        return this;
    }

    public ShowStatusAppResponse withAppList(Consumer<List<ShowStatusAppItem>> appListSetter) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        appListSetter.accept(this.appList);
        return this;
    }

    /**
     * 应用列表
     * @return appList
     */
    public List<ShowStatusAppItem> getAppList() {
        return appList;
    }

    public void setAppList(List<ShowStatusAppItem> appList) {
        this.appList = appList;
    }

    public ShowStatusAppResponse withTotalAccessCount(Long totalAccessCount) {
        this.totalAccessCount = totalAccessCount;
        return this;
    }

    /**
     * 总访问次数
     * @return totalAccessCount
     */
    public Long getTotalAccessCount() {
        return totalAccessCount;
    }

    public void setTotalAccessCount(Long totalAccessCount) {
        this.totalAccessCount = totalAccessCount;
    }

    public ShowStatusAppResponse withSuccessAccessCount(Long successAccessCount) {
        this.successAccessCount = successAccessCount;
        return this;
    }

    /**
     * 成功访问次数
     * @return successAccessCount
     */
    public Long getSuccessAccessCount() {
        return successAccessCount;
    }

    public void setSuccessAccessCount(Long successAccessCount) {
        this.successAccessCount = successAccessCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatusAppResponse that = (ShowStatusAppResponse) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.appList, that.appList)
            && Objects.equals(this.totalAccessCount, that.totalAccessCount)
            && Objects.equals(this.successAccessCount, that.successAccessCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, appList, totalAccessCount, successAccessCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatusAppResponse {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    appList: ").append(toIndentedString(appList)).append("\n");
        sb.append("    totalAccessCount: ").append(toIndentedString(totalAccessCount)).append("\n");
        sb.append("    successAccessCount: ").append(toIndentedString(successAccessCount)).append("\n");
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
