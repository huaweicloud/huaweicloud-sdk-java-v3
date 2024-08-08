package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MD计算步骤配置
 */
public class MdStepParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "energy_minimization_steps")

    private Integer energyMinimizationSteps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nvt")

    private Float nvt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npt")

    private Float npt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simulation_time")

    private Float simulationTime;

    public MdStepParam withEnergyMinimizationSteps(Integer energyMinimizationSteps) {
        this.energyMinimizationSteps = energyMinimizationSteps;
        return this;
    }

    /**
     * 能量最小化的步骤
     * minimum: 1
     * maximum: 50000
     * @return energyMinimizationSteps
     */
    public Integer getEnergyMinimizationSteps() {
        return energyMinimizationSteps;
    }

    public void setEnergyMinimizationSteps(Integer energyMinimizationSteps) {
        this.energyMinimizationSteps = energyMinimizationSteps;
    }

    public MdStepParam withNvt(Float nvt) {
        this.nvt = nvt;
        return this;
    }

    /**
     * 等温等体步骤模拟的时长，单位ps
     * minimum: 0
     * maximum: 1E+3
     * @return nvt
     */
    public Float getNvt() {
        return nvt;
    }

    public void setNvt(Float nvt) {
        this.nvt = nvt;
    }

    public MdStepParam withNpt(Float npt) {
        this.npt = npt;
        return this;
    }

    /**
     * 等压等温步骤模拟的时长，单位ps
     * minimum: 0
     * maximum: 1E+3
     * @return npt
     */
    public Float getNpt() {
        return npt;
    }

    public void setNpt(Float npt) {
        this.npt = npt;
    }

    public MdStepParam withSimulationTime(Float simulationTime) {
        this.simulationTime = simulationTime;
        return this;
    }

    /**
     * 平衡步骤模拟的时长，单位ns
     * minimum: 0
     * maximum: 5E+1
     * @return simulationTime
     */
    public Float getSimulationTime() {
        return simulationTime;
    }

    public void setSimulationTime(Float simulationTime) {
        this.simulationTime = simulationTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MdStepParam that = (MdStepParam) obj;
        return Objects.equals(this.energyMinimizationSteps, that.energyMinimizationSteps)
            && Objects.equals(this.nvt, that.nvt) && Objects.equals(this.npt, that.npt)
            && Objects.equals(this.simulationTime, that.simulationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(energyMinimizationSteps, nvt, npt, simulationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MdStepParam {\n");
        sb.append("    energyMinimizationSteps: ").append(toIndentedString(energyMinimizationSteps)).append("\n");
        sb.append("    nvt: ").append(toIndentedString(nvt)).append("\n");
        sb.append("    npt: ").append(toIndentedString(npt)).append("\n");
        sb.append("    simulationTime: ").append(toIndentedString(simulationTime)).append("\n");
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
