package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 靶点口袋发现参数列表
 */
public class PocketDetectionParamDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestep_size")

    private Double timestepSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_minimization_steps")

    private Integer numMinimizationSteps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_equilibrium_time")

    private Integer preEquilibriumTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pocket_detection_time")

    private Integer pocketDetectionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_surface_points")

    private Integer numSurfacePoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "probe_radius")

    private Double probeRadius;

    public PocketDetectionParamDto withTimestepSize(Double timestepSize) {
        this.timestepSize = timestepSize;
        return this;
    }

    /**
     * 时间步长，单位ps
     * minimum: 0.001
     * maximum: 0.002
     * @return timestepSize
     */
    public Double getTimestepSize() {
        return timestepSize;
    }

    public void setTimestepSize(Double timestepSize) {
        this.timestepSize = timestepSize;
    }

    public PocketDetectionParamDto withNumMinimizationSteps(Integer numMinimizationSteps) {
        this.numMinimizationSteps = numMinimizationSteps;
        return this;
    }

    /**
     * 最小化步数
     * minimum: 5000
     * maximum: 50000
     * @return numMinimizationSteps
     */
    public Integer getNumMinimizationSteps() {
        return numMinimizationSteps;
    }

    public void setNumMinimizationSteps(Integer numMinimizationSteps) {
        this.numMinimizationSteps = numMinimizationSteps;
    }

    public PocketDetectionParamDto withPreEquilibriumTime(Integer preEquilibriumTime) {
        this.preEquilibriumTime = preEquilibriumTime;
        return this;
    }

    /**
     * 预平衡时长，单位ps
     * minimum: 20
     * maximum: 200
     * @return preEquilibriumTime
     */
    public Integer getPreEquilibriumTime() {
        return preEquilibriumTime;
    }

    public void setPreEquilibriumTime(Integer preEquilibriumTime) {
        this.preEquilibriumTime = preEquilibriumTime;
    }

    public PocketDetectionParamDto withPocketDetectionTime(Integer pocketDetectionTime) {
        this.pocketDetectionTime = pocketDetectionTime;
        return this;
    }

    /**
     * 口袋发现时长，单位ns
     * minimum: 20
     * maximum: 50
     * @return pocketDetectionTime
     */
    public Integer getPocketDetectionTime() {
        return pocketDetectionTime;
    }

    public void setPocketDetectionTime(Integer pocketDetectionTime) {
        this.pocketDetectionTime = pocketDetectionTime;
    }

    public PocketDetectionParamDto withNumSurfacePoints(Integer numSurfacePoints) {
        this.numSurfacePoints = numSurfacePoints;
        return this;
    }

    /**
     * 表面原子离散点数量
     * minimum: 10
     * maximum: 50
     * @return numSurfacePoints
     */
    public Integer getNumSurfacePoints() {
        return numSurfacePoints;
    }

    public void setNumSurfacePoints(Integer numSurfacePoints) {
        this.numSurfacePoints = numSurfacePoints;
    }

    public PocketDetectionParamDto withProbeRadius(Double probeRadius) {
        this.probeRadius = probeRadius;
        return this;
    }

    /**
     * 探针半径，单位A
     * minimum: 1.4
     * maximum: 5
     * @return probeRadius
     */
    public Double getProbeRadius() {
        return probeRadius;
    }

    public void setProbeRadius(Double probeRadius) {
        this.probeRadius = probeRadius;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PocketDetectionParamDto that = (PocketDetectionParamDto) obj;
        return Objects.equals(this.timestepSize, that.timestepSize)
            && Objects.equals(this.numMinimizationSteps, that.numMinimizationSteps)
            && Objects.equals(this.preEquilibriumTime, that.preEquilibriumTime)
            && Objects.equals(this.pocketDetectionTime, that.pocketDetectionTime)
            && Objects.equals(this.numSurfacePoints, that.numSurfacePoints)
            && Objects.equals(this.probeRadius, that.probeRadius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestepSize,
            numMinimizationSteps,
            preEquilibriumTime,
            pocketDetectionTime,
            numSurfacePoints,
            probeRadius);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PocketDetectionParamDto {\n");
        sb.append("    timestepSize: ").append(toIndentedString(timestepSize)).append("\n");
        sb.append("    numMinimizationSteps: ").append(toIndentedString(numMinimizationSteps)).append("\n");
        sb.append("    preEquilibriumTime: ").append(toIndentedString(preEquilibriumTime)).append("\n");
        sb.append("    pocketDetectionTime: ").append(toIndentedString(pocketDetectionTime)).append("\n");
        sb.append("    numSurfacePoints: ").append(toIndentedString(numSurfacePoints)).append("\n");
        sb.append("    probeRadius: ").append(toIndentedString(probeRadius)).append("\n");
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
