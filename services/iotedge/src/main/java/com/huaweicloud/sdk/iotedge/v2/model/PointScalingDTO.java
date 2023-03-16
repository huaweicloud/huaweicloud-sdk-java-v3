package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 点位缩放配置结构体
 */
public class PointScalingDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ratio")
    

    private Double ratio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base")
    

    private Double base;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accuracy")
    

    private Integer accuracy;

    public PointScalingDTO withRatio(Double ratio) {
        this.ratio = ratio;
        return this;
    }

    


    /**
     * 缩放的倍率
     * minimum: -1E+4
     * maximum: 1E+4
     * @return ratio
     */
    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    

    public PointScalingDTO withBase(Double base) {
        this.base = base;
        return this;
    }

    


    /**
     * 基准值
     * minimum: -1E+4
     * maximum: 1E+4
     * @return base
     */
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    

    public PointScalingDTO withAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    


    /**
     * 缩放后结果的精度，精确到小数点后几位,-1表示全部保留，0表示只保留整数位
     * minimum: -1
     * maximum: 8
     * @return accuracy
     */
    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PointScalingDTO pointScalingDTO = (PointScalingDTO) o;
        return Objects.equals(this.ratio, pointScalingDTO.ratio) &&
            Objects.equals(this.base, pointScalingDTO.base) &&
            Objects.equals(this.accuracy, pointScalingDTO.accuracy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ratio, base, accuracy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PointScalingDTO {\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
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

