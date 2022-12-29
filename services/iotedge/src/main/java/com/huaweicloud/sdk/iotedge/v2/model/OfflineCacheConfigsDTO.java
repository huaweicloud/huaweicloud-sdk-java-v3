package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 节点离线缓存配置
 */
public class OfflineCacheConfigsDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_order")
    
    
    private String publishOrder;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    
    private Integer period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="capacity")
    
    
    private Integer capacity;

    public OfflineCacheConfigsDTO withPublishOrder(String publishOrder) {
        this.publishOrder = publishOrder;
        return this;
    }

    


    /**
     * 数据上报优先级，可选项：realtime_first实时数据优先 sequential按时序上报，默认realtime_first
     * @return publishOrder
     */
    public String getPublishOrder() {
        return publishOrder;
    }

    public void setPublishOrder(String publishOrder) {
        this.publishOrder = publishOrder;
    }

    

    public OfflineCacheConfigsDTO withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    


    /**
     * 节点离线缓存数据的储存天数，默认7，取值范围-1~14，-1表示存储天数没有限制
     * minimum: -1
     * maximum: 14
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    

    public OfflineCacheConfigsDTO withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    


    /**
     * 节点离线缓存容量，单位MB，默认2048，取值范围500-8192
     * minimum: 500
     * maximum: 8192
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfflineCacheConfigsDTO offlineCacheConfigsDTO = (OfflineCacheConfigsDTO) o;
        return Objects.equals(this.publishOrder, offlineCacheConfigsDTO.publishOrder) &&
            Objects.equals(this.period, offlineCacheConfigsDTO.period) &&
            Objects.equals(this.capacity, offlineCacheConfigsDTO.capacity);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publishOrder, period, capacity);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfflineCacheConfigsDTO {\n");
        sb.append("    publishOrder: ").append(toIndentedString(publishOrder)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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

