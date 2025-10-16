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
public class ShowResourceDetailAccessKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak_list")

    private List<ShowResourceDetailAccessKeyResponseBodyAkList> akList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowResourceDetailAccessKeyResponse withMetricName(String metricName) {
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

    public ShowResourceDetailAccessKeyResponse withAkList(List<ShowResourceDetailAccessKeyResponseBodyAkList> akList) {
        this.akList = akList;
        return this;
    }

    public ShowResourceDetailAccessKeyResponse addAkListItem(ShowResourceDetailAccessKeyResponseBodyAkList akListItem) {
        if (this.akList == null) {
            this.akList = new ArrayList<>();
        }
        this.akList.add(akListItem);
        return this;
    }

    public ShowResourceDetailAccessKeyResponse withAkList(
        Consumer<List<ShowResourceDetailAccessKeyResponseBodyAkList>> akListSetter) {
        if (this.akList == null) {
            this.akList = new ArrayList<>();
        }
        akListSetter.accept(this.akList);
        return this;
    }

    /**
     * 访问密钥列表
     * @return akList
     */
    public List<ShowResourceDetailAccessKeyResponseBodyAkList> getAkList() {
        return akList;
    }

    public void setAkList(List<ShowResourceDetailAccessKeyResponseBodyAkList> akList) {
        this.akList = akList;
    }

    public ShowResourceDetailAccessKeyResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 访问密钥总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceDetailAccessKeyResponse that = (ShowResourceDetailAccessKeyResponse) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.akList, that.akList)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, akList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceDetailAccessKeyResponse {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    akList: ").append(toIndentedString(akList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
