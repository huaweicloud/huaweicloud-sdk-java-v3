package com.huaweicloud.sdk.das.v3.model;

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
public class ShowSingleTemplateTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamps")

    private List<Long> timestamps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trend_data_list")

    private List<SingleSqlTplCmp> trendDataList = null;

    public ShowSingleTemplateTrendResponse withTimestamps(List<Long> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    public ShowSingleTemplateTrendResponse addTimestampsItem(Long timestampsItem) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        this.timestamps.add(timestampsItem);
        return this;
    }

    public ShowSingleTemplateTrendResponse withTimestamps(Consumer<List<Long>> timestampsSetter) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        timestampsSetter.accept(this.timestamps);
        return this;
    }

    /**
     * 趋势图的时间戳
     * @return timestamps
     */
    public List<Long> getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(List<Long> timestamps) {
        this.timestamps = timestamps;
    }

    public ShowSingleTemplateTrendResponse withTrendDataList(List<SingleSqlTplCmp> trendDataList) {
        this.trendDataList = trendDataList;
        return this;
    }

    public ShowSingleTemplateTrendResponse addTrendDataListItem(SingleSqlTplCmp trendDataListItem) {
        if (this.trendDataList == null) {
            this.trendDataList = new ArrayList<>();
        }
        this.trendDataList.add(trendDataListItem);
        return this;
    }

    public ShowSingleTemplateTrendResponse withTrendDataList(Consumer<List<SingleSqlTplCmp>> trendDataListSetter) {
        if (this.trendDataList == null) {
            this.trendDataList = new ArrayList<>();
        }
        trendDataListSetter.accept(this.trendDataList);
        return this;
    }

    /**
     * SQL趋势列表
     * @return trendDataList
     */
    public List<SingleSqlTplCmp> getTrendDataList() {
        return trendDataList;
    }

    public void setTrendDataList(List<SingleSqlTplCmp> trendDataList) {
        this.trendDataList = trendDataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSingleTemplateTrendResponse that = (ShowSingleTemplateTrendResponse) obj;
        return Objects.equals(this.timestamps, that.timestamps)
            && Objects.equals(this.trendDataList, that.trendDataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamps, trendDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSingleTemplateTrendResponse {\n");
        sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
        sb.append("    trendDataList: ").append(toIndentedString(trendDataList)).append("\n");
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
