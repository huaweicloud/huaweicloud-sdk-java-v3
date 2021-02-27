package com.huaweicloud.sdk.live.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BandwidthInfo
 */
public class BandwidthInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bw_bps")
    
    private Integer bwBps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private String timestamp;

    public BandwidthInfo withBwBps(Integer bwBps) {
        this.bwBps = bwBps;
        return this;
    }

    


    /**
     * 带宽峰值，单位：bps
     * minimum: 0
     * @return bwBps
     */
    public Integer getBwBps() {
        return bwBps;
    }

    public void setBwBps(Integer bwBps) {
        this.bwBps = bwBps;
    }

    public BandwidthInfo withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 带宽数据采样周期起始时刻，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BandwidthInfo bandwidthInfo = (BandwidthInfo) o;
        return Objects.equals(this.bwBps, bandwidthInfo.bwBps) &&
            Objects.equals(this.timestamp, bandwidthInfo.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bwBps, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthInfo {\n");
        sb.append("    bwBps: ").append(toIndentedString(bwBps)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

