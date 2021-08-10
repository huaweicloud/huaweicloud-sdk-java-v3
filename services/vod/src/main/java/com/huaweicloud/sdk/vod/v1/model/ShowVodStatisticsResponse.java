package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowVodStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_data")

    private List<VodSampleData> sampleData = null;

    public ShowVodStatisticsResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 统计起始时间。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowVodStatisticsResponse withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /** 统计间隔。
     * 
     * @return interval */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public ShowVodStatisticsResponse withSampleData(List<VodSampleData> sampleData) {
        this.sampleData = sampleData;
        return this;
    }

    public ShowVodStatisticsResponse addSampleDataItem(VodSampleData sampleDataItem) {
        if (this.sampleData == null) {
            this.sampleData = new ArrayList<>();
        }
        this.sampleData.add(sampleDataItem);
        return this;
    }

    public ShowVodStatisticsResponse withSampleData(Consumer<List<VodSampleData>> sampleDataSetter) {
        if (this.sampleData == null) {
            this.sampleData = new ArrayList<>();
        }
        sampleDataSetter.accept(this.sampleData);
        return this;
    }

    /** 采样数据数组。从start_time开始，每个间隔对应一个采样数据。
     * 
     * @return sampleData */
    public List<VodSampleData> getSampleData() {
        return sampleData;
    }

    public void setSampleData(List<VodSampleData> sampleData) {
        this.sampleData = sampleData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVodStatisticsResponse showVodStatisticsResponse = (ShowVodStatisticsResponse) o;
        return Objects.equals(this.startTime, showVodStatisticsResponse.startTime)
            && Objects.equals(this.interval, showVodStatisticsResponse.interval)
            && Objects.equals(this.sampleData, showVodStatisticsResponse.sampleData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, interval, sampleData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVodStatisticsResponse {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    sampleData: ").append(toIndentedString(sampleData)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
