package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AutoIdDocClassificationAlarmResult
 */
public class AutoIdDocClassificationAlarmResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_blur_result")

    private Boolean detectBlurResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_glare_result")

    private Boolean detectGlareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_blocking_within_border_result")

    private Boolean detectBlockingWithinBorderResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_insufficient_lighting_result")

    private Boolean detectInsufficientLightingResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_copy_result")

    private Boolean detectCopyResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_border_integrity_result")

    private Boolean detectBorderIntegrityResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_reproduce_result")

    private Boolean detectReproduceResult;

    public AutoIdDocClassificationAlarmResult withDetectBlurResult(Boolean detectBlurResult) {
        this.detectBlurResult = detectBlurResult;
        return this;
    }

    /**
     * 证件图像模糊告警结果。 - true：表示证件图片较模糊。 - false：表示证件清晰。  
     * @return detectBlurResult
     */
    public Boolean getDetectBlurResult() {
        return detectBlurResult;
    }

    public void setDetectBlurResult(Boolean detectBlurResult) {
        this.detectBlurResult = detectBlurResult;
    }

    public AutoIdDocClassificationAlarmResult withDetectGlareResult(Boolean detectGlareResult) {
        this.detectGlareResult = detectGlareResult;
        return this;
    }

    /**
     * 证件图像反光告警结果。 - true：表示证件图片存在反光。 - false：表示证件图片不存在反光。 
     * @return detectGlareResult
     */
    public Boolean getDetectGlareResult() {
        return detectGlareResult;
    }

    public void setDetectGlareResult(Boolean detectGlareResult) {
        this.detectGlareResult = detectGlareResult;
    }

    public AutoIdDocClassificationAlarmResult withDetectBlockingWithinBorderResult(
        Boolean detectBlockingWithinBorderResult) {
        this.detectBlockingWithinBorderResult = detectBlockingWithinBorderResult;
        return this;
    }

    /**
     * 证件图像框内遮挡告警结果。 - true：表示证件图片存在框内遮挡。 - false：表示证件图片不存在框内遮挡。 
     * @return detectBlockingWithinBorderResult
     */
    public Boolean getDetectBlockingWithinBorderResult() {
        return detectBlockingWithinBorderResult;
    }

    public void setDetectBlockingWithinBorderResult(Boolean detectBlockingWithinBorderResult) {
        this.detectBlockingWithinBorderResult = detectBlockingWithinBorderResult;
    }

    public AutoIdDocClassificationAlarmResult withDetectInsufficientLightingResult(
        Boolean detectInsufficientLightingResult) {
        this.detectInsufficientLightingResult = detectInsufficientLightingResult;
        return this;
    }

    /**
     * 证件图像过暗告警结果。 - true：表示证件图片过暗。 - false：表示证件图片光线正常。 
     * @return detectInsufficientLightingResult
     */
    public Boolean getDetectInsufficientLightingResult() {
        return detectInsufficientLightingResult;
    }

    public void setDetectInsufficientLightingResult(Boolean detectInsufficientLightingResult) {
        this.detectInsufficientLightingResult = detectInsufficientLightingResult;
    }

    public AutoIdDocClassificationAlarmResult withDetectCopyResult(Boolean detectCopyResult) {
        this.detectCopyResult = detectCopyResult;
        return this;
    }

    /**
     * 证件图像是否黑白复印件告警结果。 - true：表示证件是复印件。 - false：表示证件是原件。  
     * @return detectCopyResult
     */
    public Boolean getDetectCopyResult() {
        return detectCopyResult;
    }

    public void setDetectCopyResult(Boolean detectCopyResult) {
        this.detectCopyResult = detectCopyResult;
    }

    public AutoIdDocClassificationAlarmResult withDetectBorderIntegrityResult(Boolean detectBorderIntegrityResult) {
        this.detectBorderIntegrityResult = detectBorderIntegrityResult;
        return this;
    }

    /**
     * 证件图像边框完整性告警结果。 - true：表示边框不完整。 - false：表示边框完整。  
     * @return detectBorderIntegrityResult
     */
    public Boolean getDetectBorderIntegrityResult() {
        return detectBorderIntegrityResult;
    }

    public void setDetectBorderIntegrityResult(Boolean detectBorderIntegrityResult) {
        this.detectBorderIntegrityResult = detectBorderIntegrityResult;
    }

    public AutoIdDocClassificationAlarmResult withDetectReproduceResult(Boolean detectReproduceResult) {
        this.detectReproduceResult = detectReproduceResult;
        return this;
    }

    /**
     * 证件图像是否翻拍告警结果。 - true：表示证件图片经过翻拍。 - false：表示证件图片未经过翻拍。  
     * @return detectReproduceResult
     */
    public Boolean getDetectReproduceResult() {
        return detectReproduceResult;
    }

    public void setDetectReproduceResult(Boolean detectReproduceResult) {
        this.detectReproduceResult = detectReproduceResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoIdDocClassificationAlarmResult that = (AutoIdDocClassificationAlarmResult) obj;
        return Objects.equals(this.detectBlurResult, that.detectBlurResult)
            && Objects.equals(this.detectGlareResult, that.detectGlareResult)
            && Objects.equals(this.detectBlockingWithinBorderResult, that.detectBlockingWithinBorderResult)
            && Objects.equals(this.detectInsufficientLightingResult, that.detectInsufficientLightingResult)
            && Objects.equals(this.detectCopyResult, that.detectCopyResult)
            && Objects.equals(this.detectBorderIntegrityResult, that.detectBorderIntegrityResult)
            && Objects.equals(this.detectReproduceResult, that.detectReproduceResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detectBlurResult,
            detectGlareResult,
            detectBlockingWithinBorderResult,
            detectInsufficientLightingResult,
            detectCopyResult,
            detectBorderIntegrityResult,
            detectReproduceResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoIdDocClassificationAlarmResult {\n");
        sb.append("    detectBlurResult: ").append(toIndentedString(detectBlurResult)).append("\n");
        sb.append("    detectGlareResult: ").append(toIndentedString(detectGlareResult)).append("\n");
        sb.append("    detectBlockingWithinBorderResult: ")
            .append(toIndentedString(detectBlockingWithinBorderResult))
            .append("\n");
        sb.append("    detectInsufficientLightingResult: ")
            .append(toIndentedString(detectInsufficientLightingResult))
            .append("\n");
        sb.append("    detectCopyResult: ").append(toIndentedString(detectCopyResult)).append("\n");
        sb.append("    detectBorderIntegrityResult: ")
            .append(toIndentedString(detectBorderIntegrityResult))
            .append("\n");
        sb.append("    detectReproduceResult: ").append(toIndentedString(detectReproduceResult)).append("\n");
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
