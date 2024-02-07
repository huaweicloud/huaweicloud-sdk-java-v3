package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自由能微扰任务的参数，预平衡时长、平衡时长和预平衡步数、平衡步数二者都存在时以预平衡时长、平衡时长为准。
 */
public class FepParamDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_equilibrium_time")

    private Float preEquilibriumTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equilibrium_time")

    private Float equilibriumTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_pre_equilibrium_steps")

    private Integer numPreEquilibriumSteps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_equilibrium_steps")

    private Integer numEquilibriumSteps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestep_size")

    private Float timestepSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_lambda")

    private Integer numLambda;

    public FepParamDto withPreEquilibriumTime(Float preEquilibriumTime) {
        this.preEquilibriumTime = preEquilibriumTime;
        return this;
    }

    /**
     * 预平衡时长，单位ps，范围为0-200，不包含0，默认为100ps
     * minimum: 0
     * maximum: 2E+2
     * @return preEquilibriumTime
     */
    public Float getPreEquilibriumTime() {
        return preEquilibriumTime;
    }

    public void setPreEquilibriumTime(Float preEquilibriumTime) {
        this.preEquilibriumTime = preEquilibriumTime;
    }

    public FepParamDto withEquilibriumTime(Float equilibriumTime) {
        this.equilibriumTime = equilibriumTime;
        return this;
    }

    /**
     * 平衡时长，单位ns，范围为0-10，不包含0，默认为1ns
     * minimum: 0
     * maximum: 1E+1
     * @return equilibriumTime
     */
    public Float getEquilibriumTime() {
        return equilibriumTime;
    }

    public void setEquilibriumTime(Float equilibriumTime) {
        this.equilibriumTime = equilibriumTime;
    }

    public FepParamDto withNumPreEquilibriumSteps(Integer numPreEquilibriumSteps) {
        this.numPreEquilibriumSteps = numPreEquilibriumSteps;
        return this;
    }

    /**
     * 预平衡步数，默认为50000
     * minimum: 1
     * maximum: 200000
     * @return numPreEquilibriumSteps
     */
    public Integer getNumPreEquilibriumSteps() {
        return numPreEquilibriumSteps;
    }

    public void setNumPreEquilibriumSteps(Integer numPreEquilibriumSteps) {
        this.numPreEquilibriumSteps = numPreEquilibriumSteps;
    }

    public FepParamDto withNumEquilibriumSteps(Integer numEquilibriumSteps) {
        this.numEquilibriumSteps = numEquilibriumSteps;
        return this;
    }

    /**
     * 平衡步数，默认为500000
     * minimum: 1
     * maximum: 10000000
     * @return numEquilibriumSteps
     */
    public Integer getNumEquilibriumSteps() {
        return numEquilibriumSteps;
    }

    public void setNumEquilibriumSteps(Integer numEquilibriumSteps) {
        this.numEquilibriumSteps = numEquilibriumSteps;
    }

    public FepParamDto withTimestepSize(Float timestepSize) {
        this.timestepSize = timestepSize;
        return this;
    }

    /**
     * 时间步长，单位ps，取值范围：大于0，小于等于0.005
     * minimum: 0.001
     * maximum: 0.005
     * @return timestepSize
     */
    public Float getTimestepSize() {
        return timestepSize;
    }

    public void setTimestepSize(Float timestepSize) {
        this.timestepSize = timestepSize;
    }

    public FepParamDto withNumLambda(Integer numLambda) {
        this.numLambda = numLambda;
        return this;
    }

    /**
     * lambda个数
     * minimum: 2
     * maximum: 30
     * @return numLambda
     */
    public Integer getNumLambda() {
        return numLambda;
    }

    public void setNumLambda(Integer numLambda) {
        this.numLambda = numLambda;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FepParamDto that = (FepParamDto) obj;
        return Objects.equals(this.preEquilibriumTime, that.preEquilibriumTime)
            && Objects.equals(this.equilibriumTime, that.equilibriumTime)
            && Objects.equals(this.numPreEquilibriumSteps, that.numPreEquilibriumSteps)
            && Objects.equals(this.numEquilibriumSteps, that.numEquilibriumSteps)
            && Objects.equals(this.timestepSize, that.timestepSize) && Objects.equals(this.numLambda, that.numLambda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preEquilibriumTime,
            equilibriumTime,
            numPreEquilibriumSteps,
            numEquilibriumSteps,
            timestepSize,
            numLambda);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FepParamDto {\n");
        sb.append("    preEquilibriumTime: ").append(toIndentedString(preEquilibriumTime)).append("\n");
        sb.append("    equilibriumTime: ").append(toIndentedString(equilibriumTime)).append("\n");
        sb.append("    numPreEquilibriumSteps: ").append(toIndentedString(numPreEquilibriumSteps)).append("\n");
        sb.append("    numEquilibriumSteps: ").append(toIndentedString(numEquilibriumSteps)).append("\n");
        sb.append("    timestepSize: ").append(toIndentedString(timestepSize)).append("\n");
        sb.append("    numLambda: ").append(toIndentedString(numLambda)).append("\n");
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
