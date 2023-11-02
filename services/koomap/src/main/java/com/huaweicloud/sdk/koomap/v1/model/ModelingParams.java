package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实景三维建模参数。
 */
public class ModelingParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accuracy")

    private String accuracy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_point_limit")

    private String keyPointLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tie_point_limit")

    private String tiePointLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mesh_accuracy")

    private String meshAccuracy;

    public ModelingParams withAccuracy(String accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * 空三精度。取值包括：Highest、High、Medium、Low、Lowest。缺省值：High。
     * @return accuracy
     */
    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public ModelingParams withKeyPointLimit(String keyPointLimit) {
        this.keyPointLimit = keyPointLimit;
        return this;
    }

    /**
     * 空三关键点数量。取值范围：1000~1000000。缺省值：40000。
     * @return keyPointLimit
     */
    public String getKeyPointLimit() {
        return keyPointLimit;
    }

    public void setKeyPointLimit(String keyPointLimit) {
        this.keyPointLimit = keyPointLimit;
    }

    public ModelingParams withTiePointLimit(String tiePointLimit) {
        this.tiePointLimit = tiePointLimit;
        return this;
    }

    /**
     * 空三连接点数量。取值范围：100~100000。缺省值：4000。
     * @return tiePointLimit
     */
    public String getTiePointLimit() {
        return tiePointLimit;
    }

    public void setTiePointLimit(String tiePointLimit) {
        this.tiePointLimit = tiePointLimit;
    }

    public ModelingParams withMeshAccuracy(String meshAccuracy) {
        this.meshAccuracy = meshAccuracy;
        return this;
    }

    /**
     * Mesh重建质量。枚举值：  - 0：高 - 1：中 - 2：低
     * @return meshAccuracy
     */
    public String getMeshAccuracy() {
        return meshAccuracy;
    }

    public void setMeshAccuracy(String meshAccuracy) {
        this.meshAccuracy = meshAccuracy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelingParams that = (ModelingParams) obj;
        return Objects.equals(this.accuracy, that.accuracy) && Objects.equals(this.keyPointLimit, that.keyPointLimit)
            && Objects.equals(this.tiePointLimit, that.tiePointLimit)
            && Objects.equals(this.meshAccuracy, that.meshAccuracy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accuracy, keyPointLimit, tiePointLimit, meshAccuracy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelingParams {\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
        sb.append("    keyPointLimit: ").append(toIndentedString(keyPointLimit)).append("\n");
        sb.append("    tiePointLimit: ").append(toIndentedString(tiePointLimit)).append("\n");
        sb.append("    meshAccuracy: ").append(toIndentedString(meshAccuracy)).append("\n");
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
