package com.huaweicloud.sdk.apm.v1.model;

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
public class ShowTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_list")

    private List<FrontLine> lineList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_data_Time")

    private Long latestDataTime;

    public ShowTrendResponse withLineList(List<FrontLine> lineList) {
        this.lineList = lineList;
        return this;
    }

    public ShowTrendResponse addLineListItem(FrontLine lineListItem) {
        if (this.lineList == null) {
            this.lineList = new ArrayList<>();
        }
        this.lineList.add(lineListItem);
        return this;
    }

    public ShowTrendResponse withLineList(Consumer<List<FrontLine>> lineListSetter) {
        if (this.lineList == null) {
            this.lineList = new ArrayList<>();
        }
        lineListSetter.accept(this.lineList);
        return this;
    }

    /**
     * 趋势图数据列表
     * @return lineList
     */
    public List<FrontLine> getLineList() {
        return lineList;
    }

    public void setLineList(List<FrontLine> lineList) {
        this.lineList = lineList;
    }

    public ShowTrendResponse withLatestDataTime(Long latestDataTime) {
        this.latestDataTime = latestDataTime;
        return this;
    }

    /**
     * 最后日期时间
     * @return latestDataTime
     */
    public Long getLatestDataTime() {
        return latestDataTime;
    }

    public void setLatestDataTime(Long latestDataTime) {
        this.latestDataTime = latestDataTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTrendResponse showTrendResponse = (ShowTrendResponse) o;
        return Objects.equals(this.lineList, showTrendResponse.lineList)
            && Objects.equals(this.latestDataTime, showTrendResponse.latestDataTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineList, latestDataTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrendResponse {\n");
        sb.append("    lineList: ").append(toIndentedString(lineList)).append("\n");
        sb.append("    latestDataTime: ").append(toIndentedString(latestDataTime)).append("\n");
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
