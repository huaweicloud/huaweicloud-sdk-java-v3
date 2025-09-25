package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataIoTime
 */
public class DataIoTime {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_io_time_details")

    private EventTimeInfo dataIoTimeDetails;

    public DataIoTime withAllTime(Long allTime) {
        this.allTime = allTime;
        return this;
    }

    /**
     * **参数解释**: 总耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return allTime
     */
    public Long getAllTime() {
        return allTime;
    }

    public void setAllTime(Long allTime) {
        this.allTime = allTime;
    }

    public DataIoTime withDataIoTimeDetails(EventTimeInfo dataIoTimeDetails) {
        this.dataIoTimeDetails = dataIoTimeDetails;
        return this;
    }

    public DataIoTime withDataIoTimeDetails(Consumer<EventTimeInfo> dataIoTimeDetailsSetter) {
        if (this.dataIoTimeDetails == null) {
            this.dataIoTimeDetails = new EventTimeInfo();
            dataIoTimeDetailsSetter.accept(this.dataIoTimeDetails);
        }

        return this;
    }

    /**
     * Get dataIoTimeDetails
     * @return dataIoTimeDetails
     */
    public EventTimeInfo getDataIoTimeDetails() {
        return dataIoTimeDetails;
    }

    public void setDataIoTimeDetails(EventTimeInfo dataIoTimeDetails) {
        this.dataIoTimeDetails = dataIoTimeDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataIoTime that = (DataIoTime) obj;
        return Objects.equals(this.allTime, that.allTime)
            && Objects.equals(this.dataIoTimeDetails, that.dataIoTimeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allTime, dataIoTimeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataIoTime {\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    dataIoTimeDetails: ").append(toIndentedString(dataIoTimeDetails)).append("\n");
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
