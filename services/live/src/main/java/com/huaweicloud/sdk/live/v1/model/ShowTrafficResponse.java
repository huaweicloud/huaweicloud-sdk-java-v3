package com.huaweicloud.sdk.live.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.TrafficInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTrafficResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="traffic_info")
    
    private List<TrafficInfo> trafficInfo = null;
    
    public ShowTrafficResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 查询结果的总元素数量
     * minimum: 0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowTrafficResponse withTrafficInfo(List<TrafficInfo> trafficInfo) {
        this.trafficInfo = trafficInfo;
        return this;
    }

    
    public ShowTrafficResponse addTrafficInfoItem(TrafficInfo trafficInfoItem) {
        if (this.trafficInfo == null) {
            this.trafficInfo = new ArrayList<>();
        }
        this.trafficInfo.add(trafficInfoItem);
        return this;
    }

    public ShowTrafficResponse withTrafficInfo(Consumer<List<TrafficInfo>> trafficInfoSetter) {
        if(this.trafficInfo == null ){
            this.trafficInfo = new ArrayList<>();
        }
        trafficInfoSetter.accept(this.trafficInfo);
        return this;
    }

    /**
     * 流量信息
     * @return trafficInfo
     */
    public List<TrafficInfo> getTrafficInfo() {
        return trafficInfo;
    }

    public void setTrafficInfo(List<TrafficInfo> trafficInfo) {
        this.trafficInfo = trafficInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTrafficResponse showTrafficResponse = (ShowTrafficResponse) o;
        return Objects.equals(this.total, showTrafficResponse.total) &&
            Objects.equals(this.trafficInfo, showTrafficResponse.trafficInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, trafficInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrafficResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    trafficInfo: ").append(toIndentedString(trafficInfo)).append("\n");
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

