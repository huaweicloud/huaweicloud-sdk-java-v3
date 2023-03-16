package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 点位校验配置结构体
 */
public class PointValidityingDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min")
    

    private Long min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max")
    

    private Long max;

    public PointValidityingDTO withMin(Long min) {
        this.min = min;
        return this;
    }

    


    /**
     * 点位上报值的最小值，小于该值则上报告警
     * minimum: -9007199254740991
     * maximum: 9007199254740991
     * @return min
     */
    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    

    public PointValidityingDTO withMax(Long max) {
        this.max = max;
        return this;
    }

    


    /**
     * 点位上报值的最大值，大于该值则上报告警
     * minimum: -9007199254740992
     * maximum: 9007199254740992
     * @return max
     */
    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PointValidityingDTO pointValidityingDTO = (PointValidityingDTO) o;
        return Objects.equals(this.min, pointValidityingDTO.min) &&
            Objects.equals(this.max, pointValidityingDTO.max);
    }
    @Override
    public int hashCode() {
        return Objects.hash(min, max);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PointValidityingDTO {\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

