package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VideoDenoise
 */
public class VideoDenoise  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_order")
    
    private Integer executionOrder;

    public VideoDenoise withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 降噪算法名称\"hw-denoise\"、\"waifu2x\"。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public VideoDenoise withExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
        return this;
    }

    


    /**
     * 1 表示视频处理时第一个执行，2表示第二个执行，以此类推；除不执行，各视频处理算法的执行次序不可相同。 
     * @return executionOrder
     */
    public Integer getExecutionOrder() {
        return executionOrder;
    }

    public void setExecutionOrder(Integer executionOrder) {
        this.executionOrder = executionOrder;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoDenoise videoDenoise = (VideoDenoise) o;
        return Objects.equals(this.name, videoDenoise.name) &&
            Objects.equals(this.executionOrder, videoDenoise.executionOrder);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, executionOrder);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoDenoise {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    executionOrder: ").append(toIndentedString(executionOrder)).append("\n");
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
