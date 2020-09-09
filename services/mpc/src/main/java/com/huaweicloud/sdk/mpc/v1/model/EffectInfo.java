package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EffectInfo
 */
public class EffectInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stop_time")
    
    private String stopTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dx")
    
    private String dx;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dy")
    
    private String dy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="width")
    
    private String width;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="height")
    
    private String height;

    public EffectInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 特效处理开始时间点，单位：秒，精确到小数点后4位 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public EffectInfo withStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    


    /**
     * 特效处理结束时间点，单位：秒，精确到小数点后4位 
     * @return stopTime
     */
    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public EffectInfo withDx(String dx) {
        this.dx = dx;
        return this;
    }

    


    /**
     * 相对视频源左上角顶点的水平偏移位置坐标。整数型表示像素值，范围[0,4096]，单位px 
     * @return dx
     */
    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public EffectInfo withDy(String dy) {
        this.dy = dy;
        return this;
    }

    


    /**
     * 相对视频源左上角顶点的垂直偏移位置坐标。整数型表示像素值，范围[0,4096]，单位px 
     * @return dy
     */
    public String getDy() {
        return dy;
    }

    public void setDy(String dy) {
        this.dy = dy;
    }

    public EffectInfo withWidth(String width) {
        this.width = width;
        return this;
    }

    


    /**
     * 特效区域的宽。整数型表示像素值，范围(0,4096]，单位px 
     * @return width
     */
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public EffectInfo withHeight(String height) {
        this.height = height;
        return this;
    }

    


    /**
     * 特效区域的高。整数型表示像素值，范围(0,4096]，单位px 
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EffectInfo effectInfo = (EffectInfo) o;
        return Objects.equals(this.startTime, effectInfo.startTime) &&
            Objects.equals(this.stopTime, effectInfo.stopTime) &&
            Objects.equals(this.dx, effectInfo.dx) &&
            Objects.equals(this.dy, effectInfo.dy) &&
            Objects.equals(this.width, effectInfo.width) &&
            Objects.equals(this.height, effectInfo.height);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, stopTime, dx, dy, width, height);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EffectInfo {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

