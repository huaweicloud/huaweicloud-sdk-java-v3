package com.huaweicloud.sdk.vod.v1.model;

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
public class ShowVodRetrievalResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_data")

    private List<VodRetrievalData> sampleData = null;

    public ShowVodRetrievalResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 统计起始时间 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowVodRetrievalResponse withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 采样时间间隔 
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public ShowVodRetrievalResponse withSampleData(List<VodRetrievalData> sampleData) {
        this.sampleData = sampleData;
        return this;
    }

    public ShowVodRetrievalResponse addSampleDataItem(VodRetrievalData sampleDataItem) {
        if (this.sampleData == null) {
            this.sampleData = new ArrayList<>();
        }
        this.sampleData.add(sampleDataItem);
        return this;
    }

    public ShowVodRetrievalResponse withSampleData(Consumer<List<VodRetrievalData>> sampleDataSetter) {
        if (this.sampleData == null) {
            this.sampleData = new ArrayList<>();
        }
        sampleDataSetter.accept(this.sampleData);
        return this;
    }

    /**
     * Get sampleData
     * @return sampleData
     */
    public List<VodRetrievalData> getSampleData() {
        return sampleData;
    }

    public void setSampleData(List<VodRetrievalData> sampleData) {
        this.sampleData = sampleData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVodRetrievalResponse that = (ShowVodRetrievalResponse) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.sampleData, that.sampleData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, interval, sampleData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVodRetrievalResponse {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    sampleData: ").append(toIndentedString(sampleData)).append("\n");
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
