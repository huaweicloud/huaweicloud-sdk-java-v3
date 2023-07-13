package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 点位处理配置结构体
 */
public class ProcessingConfigDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity")

    private PointValidityingDTO validity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_formula")

    private String streamFormula;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling")

    private PointScalingDTO scaling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean")

    private PointCleanDTO clean;

    public ProcessingConfigDTO withValidity(PointValidityingDTO validity) {
        this.validity = validity;
        return this;
    }

    public ProcessingConfigDTO withValidity(Consumer<PointValidityingDTO> validitySetter) {
        if (this.validity == null) {
            this.validity = new PointValidityingDTO();
            validitySetter.accept(this.validity);
        }

        return this;
    }

    /**
     * Get validity
     * @return validity
     */
    public PointValidityingDTO getValidity() {
        return validity;
    }

    public void setValidity(PointValidityingDTO validity) {
        this.validity = validity;
    }

    public ProcessingConfigDTO withStreamFormula(String streamFormula) {
        this.streamFormula = streamFormula;
        return this;
    }

    /**
     * 点位流公式配置字段
     * @return streamFormula
     */
    public String getStreamFormula() {
        return streamFormula;
    }

    public void setStreamFormula(String streamFormula) {
        this.streamFormula = streamFormula;
    }

    public ProcessingConfigDTO withScaling(PointScalingDTO scaling) {
        this.scaling = scaling;
        return this;
    }

    public ProcessingConfigDTO withScaling(Consumer<PointScalingDTO> scalingSetter) {
        if (this.scaling == null) {
            this.scaling = new PointScalingDTO();
            scalingSetter.accept(this.scaling);
        }

        return this;
    }

    /**
     * Get scaling
     * @return scaling
     */
    public PointScalingDTO getScaling() {
        return scaling;
    }

    public void setScaling(PointScalingDTO scaling) {
        this.scaling = scaling;
    }

    public ProcessingConfigDTO withClean(PointCleanDTO clean) {
        this.clean = clean;
        return this;
    }

    public ProcessingConfigDTO withClean(Consumer<PointCleanDTO> cleanSetter) {
        if (this.clean == null) {
            this.clean = new PointCleanDTO();
            cleanSetter.accept(this.clean);
        }

        return this;
    }

    /**
     * Get clean
     * @return clean
     */
    public PointCleanDTO getClean() {
        return clean;
    }

    public void setClean(PointCleanDTO clean) {
        this.clean = clean;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessingConfigDTO that = (ProcessingConfigDTO) obj;
        return Objects.equals(this.validity, that.validity) && Objects.equals(this.streamFormula, that.streamFormula)
            && Objects.equals(this.scaling, that.scaling) && Objects.equals(this.clean, that.clean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validity, streamFormula, scaling, clean);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessingConfigDTO {\n");
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
        sb.append("    streamFormula: ").append(toIndentedString(streamFormula)).append("\n");
        sb.append("    scaling: ").append(toIndentedString(scaling)).append("\n");
        sb.append("    clean: ").append(toIndentedString(clean)).append("\n");
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
