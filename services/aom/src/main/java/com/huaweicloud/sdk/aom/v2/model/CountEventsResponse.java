package com.huaweicloud.sdk.aom.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.EventSeries;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CountEventsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step")
    

    private Long step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamps")
    
    private List<Long> timestamps = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="series")
    
    private List<EventSeries> series = null;
    
    public CountEventsResponse withStep(Long step) {
        this.step = step;
        return this;
    }

    


    /**
     * 统计步长。毫秒数，例如一分钟则填写为60000。
     * @return step
     */
    public Long getStep() {
        return step;
    }

    public void setStep(Long step) {
        this.step = step;
    }

    

    public CountEventsResponse withTimestamps(List<Long> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    
    public CountEventsResponse addTimestampsItem(Long timestampsItem) {
        if(this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        this.timestamps.add(timestampsItem);
        return this;
    }

    public CountEventsResponse withTimestamps(Consumer<List<Long>> timestampsSetter) {
        if(this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        timestampsSetter.accept(this.timestamps);
        return this;
    }

    /**
     * 统计结果对应的时间序列。
     * @return timestamps
     */
    public List<Long> getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(List<Long> timestamps) {
        this.timestamps = timestamps;
    }

    

    public CountEventsResponse withSeries(List<EventSeries> series) {
        this.series = series;
        return this;
    }

    
    public CountEventsResponse addSeriesItem(EventSeries seriesItem) {
        if(this.series == null) {
            this.series = new ArrayList<>();
        }
        this.series.add(seriesItem);
        return this;
    }

    public CountEventsResponse withSeries(Consumer<List<EventSeries>> seriesSetter) {
        if(this.series == null) {
            this.series = new ArrayList<>();
        }
        seriesSetter.accept(this.series);
        return this;
    }

    /**
     * 事件或者告警不同级别相同时间序列对应的统计结果。
     * @return series
     */
    public List<EventSeries> getSeries() {
        return series;
    }

    public void setSeries(List<EventSeries> series) {
        this.series = series;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountEventsResponse countEventsResponse = (CountEventsResponse) o;
        return Objects.equals(this.step, countEventsResponse.step) &&
            Objects.equals(this.timestamps, countEventsResponse.timestamps) &&
            Objects.equals(this.series, countEventsResponse.series);
    }
    @Override
    public int hashCode() {
        return Objects.hash(step, timestamps, series);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountEventsResponse {\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
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

