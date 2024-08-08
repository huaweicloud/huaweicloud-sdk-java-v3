package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 靶点优化MD参数配置
 */
public class MdParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestep_size")

    private Float timestepSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "temperature")

    private Float temperature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_params")

    private MdStepParam stepParams;

    public MdParam withTimestepSize(Float timestepSize) {
        this.timestepSize = timestepSize;
        return this;
    }

    /**
     * MD模拟的时间步长，单位fs，取值范围：大于0，小于等于5
     * minimum: 0
     * maximum: 5
     * @return timestepSize
     */
    public Float getTimestepSize() {
        return timestepSize;
    }

    public void setTimestepSize(Float timestepSize) {
        this.timestepSize = timestepSize;
    }

    public MdParam withTemperature(Float temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * MD模拟的温度，单位K
     * minimum: 0
     * maximum: 1E+3
     * @return temperature
     */
    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public MdParam withStepParams(MdStepParam stepParams) {
        this.stepParams = stepParams;
        return this;
    }

    public MdParam withStepParams(Consumer<MdStepParam> stepParamsSetter) {
        if (this.stepParams == null) {
            this.stepParams = new MdStepParam();
            stepParamsSetter.accept(this.stepParams);
        }

        return this;
    }

    /**
     * Get stepParams
     * @return stepParams
     */
    public MdStepParam getStepParams() {
        return stepParams;
    }

    public void setStepParams(MdStepParam stepParams) {
        this.stepParams = stepParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MdParam that = (MdParam) obj;
        return Objects.equals(this.timestepSize, that.timestepSize)
            && Objects.equals(this.temperature, that.temperature) && Objects.equals(this.stepParams, that.stepParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestepSize, temperature, stepParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MdParam {\n");
        sb.append("    timestepSize: ").append(toIndentedString(timestepSize)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    stepParams: ").append(toIndentedString(stepParams)).append("\n");
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
