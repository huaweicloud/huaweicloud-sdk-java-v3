package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VideoContrast
 */
public class VideoContrast  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_order")
    
    private Integer executionOrder;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contrast")
    
    private String contrast;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="brightness")
    
    private String brightness;

    public VideoContrast withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 对比度算法名称\"hw-contrast\"。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public VideoContrast withExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
        return this;
    }

    


    /**
     * 1 表示视频处理时第一个执行，2表示第二个执行，以此类推；除不执行，各视频处理算法的执行次序不可相同。 
     * minimum: 0
     * maximum: 2147483647
     * @return executionOrder
     */
    public Integer getExecutionOrder() {
        return executionOrder;
    }

    public void setExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
    }

    

    public VideoContrast withContrast(String contrast) {
        this.contrast = contrast;
        return this;
    }

    


    /**
     * 对比度调节的程度， 值越大， 对比度越高。 
     * @return contrast
     */
    public String getContrast() {
        return contrast;
    }

    public void setContrast(String contrast) {
        this.contrast = contrast;
    }

    

    public VideoContrast withBrightness(String brightness) {
        this.brightness = brightness;
        return this;
    }

    


    /**
     * 1 表示视频处理时第一个执行，2表示第二个执行，以此类推；除不执行，各视频处理算法的执行次序不可相同。 
     * @return brightness
     */
    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoContrast videoContrast = (VideoContrast) o;
        return Objects.equals(this.name, videoContrast.name) &&
            Objects.equals(this.executionOrder, videoContrast.executionOrder) &&
            Objects.equals(this.contrast, videoContrast.contrast) &&
            Objects.equals(this.brightness, videoContrast.brightness);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, executionOrder, contrast, brightness);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoContrast {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    executionOrder: ").append(toIndentedString(executionOrder)).append("\n");
        sb.append("    contrast: ").append(toIndentedString(contrast)).append("\n");
        sb.append("    brightness: ").append(toIndentedString(brightness)).append("\n");
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

