package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VideoSaturation
 */
public class VideoSaturation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_order")

    private Integer executionOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saturation")

    private String saturation;

    public VideoSaturation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 饱和度算法名称\"“hw-saturation\"。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VideoSaturation withExecutionOrder(Integer executionOrder) {
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

    public VideoSaturation withSaturation(String saturation) {
        this.saturation = saturation;
        return this;
    }

    /**
     * 饱和度调节的程度， 值越大， 饱和度越高。 
     * @return saturation
     */
    public String getSaturation() {
        return saturation;
    }

    public void setSaturation(String saturation) {
        this.saturation = saturation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoSaturation that = (VideoSaturation) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.executionOrder, that.executionOrder)
            && Objects.equals(this.saturation, that.saturation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, executionOrder, saturation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSaturation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    executionOrder: ").append(toIndentedString(executionOrder)).append("\n");
        sb.append("    saturation: ").append(toIndentedString(saturation)).append("\n");
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
