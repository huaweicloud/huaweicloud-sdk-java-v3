package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** NetworkTrafficStats */
public class NetworkTrafficStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_throughput")

    private Long outputThroughput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_throughput")

    private Long inputThroughput;

    public NetworkTrafficStats withOutputThroughput(Long outputThroughput) {
        this.outputThroughput = outputThroughput;
        return this;
    }

    /** 下行吞吐量（byte）
     * 
     * @return outputThroughput */
    public Long getOutputThroughput() {
        return outputThroughput;
    }

    public void setOutputThroughput(Long outputThroughput) {
        this.outputThroughput = outputThroughput;
    }

    public NetworkTrafficStats withInputThroughput(Long inputThroughput) {
        this.inputThroughput = inputThroughput;
        return this;
    }

    /** 上行吞吐量（byte）
     * 
     * @return inputThroughput */
    public Long getInputThroughput() {
        return inputThroughput;
    }

    public void setInputThroughput(Long inputThroughput) {
        this.inputThroughput = inputThroughput;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetworkTrafficStats networkTrafficStats = (NetworkTrafficStats) o;
        return Objects.equals(this.outputThroughput, networkTrafficStats.outputThroughput)
            && Objects.equals(this.inputThroughput, networkTrafficStats.inputThroughput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outputThroughput, inputThroughput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkTrafficStats {\n");
        sb.append("    outputThroughput: ").append(toIndentedString(outputThroughput)).append("\n");
        sb.append("    inputThroughput: ").append(toIndentedString(inputThroughput)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
