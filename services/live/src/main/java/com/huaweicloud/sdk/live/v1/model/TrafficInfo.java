package com.huaweicloud.sdk.live.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TrafficInfo
 */
public class TrafficInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="traffic")
    
    private Integer traffic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private OffsetDateTime timestamp = null;

    public TrafficInfo withTraffic(Integer traffic) {
        this.traffic = traffic;
        return this;
    }

    


    /**
     * 采样周期内的总流量，单位：byte
     * minimum: 0
     * @return traffic
     */
    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

    public TrafficInfo withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 流量数据采样周期起始时刻，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return timestamp
     */
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
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
        TrafficInfo trafficInfo = (TrafficInfo) o;
        return Objects.equals(this.traffic, trafficInfo.traffic) &&
            Objects.equals(this.timestamp, trafficInfo.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(traffic, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrafficInfo {\n");
        sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
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

