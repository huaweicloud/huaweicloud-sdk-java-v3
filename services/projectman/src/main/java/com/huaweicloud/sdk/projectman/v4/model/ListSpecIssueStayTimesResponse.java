package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListSpecIssueStayTimesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fails")

    private List<String> fails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ListSpecIssueStayTimesResponseBodyData> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_stay_time")

    private Long totalStayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListSpecIssueStayTimesResponse withFails(List<String> fails) {
        this.fails = fails;
        return this;
    }

    public ListSpecIssueStayTimesResponse addFailsItem(String failsItem) {
        if (this.fails == null) {
            this.fails = new ArrayList<>();
        }
        this.fails.add(failsItem);
        return this;
    }

    public ListSpecIssueStayTimesResponse withFails(Consumer<List<String>> failsSetter) {
        if (this.fails == null) {
            this.fails = new ArrayList<>();
        }
        failsSetter.accept(this.fails);
        return this;
    }

    /**
     * 计算失败的工作项id,一般指未关闭的工作项
     * @return fails
     */
    public List<String> getFails() {
        return fails;
    }

    public void setFails(List<String> fails) {
        this.fails = fails;
    }

    public ListSpecIssueStayTimesResponse withData(List<ListSpecIssueStayTimesResponseBodyData> data) {
        this.data = data;
        return this;
    }

    public ListSpecIssueStayTimesResponse addDataItem(ListSpecIssueStayTimesResponseBodyData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListSpecIssueStayTimesResponse withData(Consumer<List<ListSpecIssueStayTimesResponseBodyData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 工作项时间数据（创建时间-关闭时间）
     * @return data
     */
    public List<ListSpecIssueStayTimesResponseBodyData> getData() {
        return data;
    }

    public void setData(List<ListSpecIssueStayTimesResponseBodyData> data) {
        this.data = data;
    }

    public ListSpecIssueStayTimesResponse withTotalStayTime(Long totalStayTime) {
        this.totalStayTime = totalStayTime;
        return this;
    }

    /**
     * 停留时间求和（单位：秒）
     * @return totalStayTime
     */
    public Long getTotalStayTime() {
        return totalStayTime;
    }

    public void setTotalStayTime(Long totalStayTime) {
        this.totalStayTime = totalStayTime;
    }

    public ListSpecIssueStayTimesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 停留时间求和的工作项个数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSpecIssueStayTimesResponse listSpecIssueStayTimesResponse = (ListSpecIssueStayTimesResponse) o;
        return Objects.equals(this.fails, listSpecIssueStayTimesResponse.fails)
            && Objects.equals(this.data, listSpecIssueStayTimesResponse.data)
            && Objects.equals(this.totalStayTime, listSpecIssueStayTimesResponse.totalStayTime)
            && Objects.equals(this.total, listSpecIssueStayTimesResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fails, data, totalStayTime, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecIssueStayTimesResponse {\n");
        sb.append("    fails: ").append(toIndentedString(fails)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    totalStayTime: ").append(toIndentedString(totalStayTime)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
