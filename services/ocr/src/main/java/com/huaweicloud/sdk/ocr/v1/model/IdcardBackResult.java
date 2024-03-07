package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class IdcardBackResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue")

    private String issue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_from")

    private String validFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_to")

    private String validTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjusted_image")

    private String adjustedImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_result")

    private IdcardBackVerificationResult verificationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_reproduce_result")

    private Boolean detectReproduceResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_copy_result")

    private Boolean detectCopyResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_tampering_result")

    private Boolean detectTamperingResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_border_integrity_result")

    private Boolean detectBorderIntegrityResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_blocking_within_border_result")

    private Boolean detectBlockingWithinBorderResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_blur_result")

    private Boolean detectBlurResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_interim_result")

    private Boolean detectInterimResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_glare_result")

    private Boolean detectGlareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score_info")

    private IdcardScoreInfoResult scoreInfo;

    public IdcardBackResult withIssue(String issue) {
        this.issue = issue;
        return this;
    }

    /**
     * 发证机关。 
     * @return issue
     */
    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public IdcardBackResult withValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * 有效起始日期。 
     * @return validFrom
     */
    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public IdcardBackResult withValidTo(String validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * 有效结束日期。 
     * @return validTo
     */
    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public IdcardBackResult withAdjustedImage(String adjustedImage) {
        this.adjustedImage = adjustedImage;
        return this;
    }

    /**
     * 身份证卡面图片信息的base64码结果。  > 说明： - 仅在输入参数return_adjusted_image为true时，返回该字段。 
     * @return adjustedImage
     */
    public String getAdjustedImage() {
        return adjustedImage;
    }

    public void setAdjustedImage(String adjustedImage) {
        this.adjustedImage = adjustedImage;
    }

    public IdcardBackResult withVerificationResult(IdcardBackVerificationResult verificationResult) {
        this.verificationResult = verificationResult;
        return this;
    }

    public IdcardBackResult withVerificationResult(Consumer<IdcardBackVerificationResult> verificationResultSetter) {
        if (this.verificationResult == null) {
            this.verificationResult = new IdcardBackVerificationResult();
            verificationResultSetter.accept(this.verificationResult);
        }

        return this;
    }

    /**
     * Get verificationResult
     * @return verificationResult
     */
    public IdcardBackVerificationResult getVerificationResult() {
        return verificationResult;
    }

    public void setVerificationResult(IdcardBackVerificationResult verificationResult) {
        this.verificationResult = verificationResult;
    }

    public IdcardBackResult withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /**
     * 文本框在原图位置。输出左上、右上、右下、左下四个点坐标。 仅return_text_location设置为true时才返回。 
     * @return textLocation
     */
    public Object getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Object textLocation) {
        this.textLocation = textLocation;
    }

    public IdcardBackResult withDetectReproduceResult(Boolean detectReproduceResult) {
        this.detectReproduceResult = detectReproduceResult;
        return this;
    }

    /**
     * 身份证图像是否翻拍告警结果。 - true：表示身份证图片经过翻拍。 - false：表示身份证图片未经过翻拍。 仅在输入参数detect_reproduce为true时，返回该字段。 
     * @return detectReproduceResult
     */
    public Boolean getDetectReproduceResult() {
        return detectReproduceResult;
    }

    public void setDetectReproduceResult(Boolean detectReproduceResult) {
        this.detectReproduceResult = detectReproduceResult;
    }

    public IdcardBackResult withDetectCopyResult(Boolean detectCopyResult) {
        this.detectCopyResult = detectCopyResult;
        return this;
    }

    /**
     * 身份证图像是否黑白复印件告警结果。 - true：表示身份证图片是复印件。 - false”表示身份证图片是原件。 仅在输入参数detect_copy为true时，返回该字段。 
     * @return detectCopyResult
     */
    public Boolean getDetectCopyResult() {
        return detectCopyResult;
    }

    public void setDetectCopyResult(Boolean detectCopyResult) {
        this.detectCopyResult = detectCopyResult;
    }

    public IdcardBackResult withDetectTamperingResult(Boolean detectTamperingResult) {
        this.detectTamperingResult = detectTamperingResult;
        return this;
    }

    /**
     * 身份证图片是否PS告警结果。 - true：表示身份证经过PS。 - false：表示未经过PS。 仅在传入参数detect_tampering为true时，返回该字段。 
     * @return detectTamperingResult
     */
    public Boolean getDetectTamperingResult() {
        return detectTamperingResult;
    }

    public void setDetectTamperingResult(Boolean detectTamperingResult) {
        this.detectTamperingResult = detectTamperingResult;
    }

    public IdcardBackResult withDetectBorderIntegrityResult(Boolean detectBorderIntegrityResult) {
        this.detectBorderIntegrityResult = detectBorderIntegrityResult;
        return this;
    }

    /**
     * 身份证图片边框完整性告警结果。 - true：表示边框不完整 - false：表示边框完整。 仅在输入参数detect_border_integrity为true时，返回该字段。 
     * @return detectBorderIntegrityResult
     */
    public Boolean getDetectBorderIntegrityResult() {
        return detectBorderIntegrityResult;
    }

    public void setDetectBorderIntegrityResult(Boolean detectBorderIntegrityResult) {
        this.detectBorderIntegrityResult = detectBorderIntegrityResult;
    }

    public IdcardBackResult withDetectBlockingWithinBorderResult(Boolean detectBlockingWithinBorderResult) {
        this.detectBlockingWithinBorderResult = detectBlockingWithinBorderResult;
        return this;
    }

    /**
     * 身份证图像框内是否存在遮挡的告警结果。 - true：表示边框内部存在遮挡。 - false：表示边框内部不存在遮挡。 仅在输入参数detect_blocking_within_border为true时，返回该字段。 
     * @return detectBlockingWithinBorderResult
     */
    public Boolean getDetectBlockingWithinBorderResult() {
        return detectBlockingWithinBorderResult;
    }

    public void setDetectBlockingWithinBorderResult(Boolean detectBlockingWithinBorderResult) {
        this.detectBlockingWithinBorderResult = detectBlockingWithinBorderResult;
    }

    public IdcardBackResult withDetectBlurResult(Boolean detectBlurResult) {
        this.detectBlurResult = detectBlurResult;
        return this;
    }

    /**
     * 身份证模糊告警结果。 - true：表示身份证图片较模糊。 - false：表示身份证清晰。 仅在输入参数detect_blur为true时，返回该字段。 
     * @return detectBlurResult
     */
    public Boolean getDetectBlurResult() {
        return detectBlurResult;
    }

    public void setDetectBlurResult(Boolean detectBlurResult) {
        this.detectBlurResult = detectBlurResult;
    }

    public IdcardBackResult withDetectInterimResult(Boolean detectInterimResult) {
        this.detectInterimResult = detectInterimResult;
        return this;
    }

    /**
     * 临时身份证告警结果。 - true：表示是临时身份证。 - false：表示非临时身份证。 仅在输入参数detect_interim为true时，返回该字段。 
     * @return detectInterimResult
     */
    public Boolean getDetectInterimResult() {
        return detectInterimResult;
    }

    public void setDetectInterimResult(Boolean detectInterimResult) {
        this.detectInterimResult = detectInterimResult;
    }

    public IdcardBackResult withDetectGlareResult(Boolean detectGlareResult) {
        this.detectGlareResult = detectGlareResult;
        return this;
    }

    /**
     * 身份证反光告警结果。 - true：表示身份证图片存在反光。 - false：表示是身份证不存在反光。 仅在输入参数detect_glare为true时，返回该字段。 
     * @return detectGlareResult
     */
    public Boolean getDetectGlareResult() {
        return detectGlareResult;
    }

    public void setDetectGlareResult(Boolean detectGlareResult) {
        this.detectGlareResult = detectGlareResult;
    }

    public IdcardBackResult withScoreInfo(IdcardScoreInfoResult scoreInfo) {
        this.scoreInfo = scoreInfo;
        return this;
    }

    public IdcardBackResult withScoreInfo(Consumer<IdcardScoreInfoResult> scoreInfoSetter) {
        if (this.scoreInfo == null) {
            this.scoreInfo = new IdcardScoreInfoResult();
            scoreInfoSetter.accept(this.scoreInfo);
        }

        return this;
    }

    /**
     * Get scoreInfo
     * @return scoreInfo
     */
    public IdcardScoreInfoResult getScoreInfo() {
        return scoreInfo;
    }

    public void setScoreInfo(IdcardScoreInfoResult scoreInfo) {
        this.scoreInfo = scoreInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdcardBackResult that = (IdcardBackResult) obj;
        return Objects.equals(this.issue, that.issue) && Objects.equals(this.validFrom, that.validFrom)
            && Objects.equals(this.validTo, that.validTo) && Objects.equals(this.adjustedImage, that.adjustedImage)
            && Objects.equals(this.verificationResult, that.verificationResult)
            && Objects.equals(this.textLocation, that.textLocation)
            && Objects.equals(this.detectReproduceResult, that.detectReproduceResult)
            && Objects.equals(this.detectCopyResult, that.detectCopyResult)
            && Objects.equals(this.detectTamperingResult, that.detectTamperingResult)
            && Objects.equals(this.detectBorderIntegrityResult, that.detectBorderIntegrityResult)
            && Objects.equals(this.detectBlockingWithinBorderResult, that.detectBlockingWithinBorderResult)
            && Objects.equals(this.detectBlurResult, that.detectBlurResult)
            && Objects.equals(this.detectInterimResult, that.detectInterimResult)
            && Objects.equals(this.detectGlareResult, that.detectGlareResult)
            && Objects.equals(this.scoreInfo, that.scoreInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issue,
            validFrom,
            validTo,
            adjustedImage,
            verificationResult,
            textLocation,
            detectReproduceResult,
            detectCopyResult,
            detectTamperingResult,
            detectBorderIntegrityResult,
            detectBlockingWithinBorderResult,
            detectBlurResult,
            detectInterimResult,
            detectGlareResult,
            scoreInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdcardBackResult {\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
        sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
        sb.append("    adjustedImage: ").append(toIndentedString(adjustedImage)).append("\n");
        sb.append("    verificationResult: ").append(toIndentedString(verificationResult)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
        sb.append("    detectReproduceResult: ").append(toIndentedString(detectReproduceResult)).append("\n");
        sb.append("    detectCopyResult: ").append(toIndentedString(detectCopyResult)).append("\n");
        sb.append("    detectTamperingResult: ").append(toIndentedString(detectTamperingResult)).append("\n");
        sb.append("    detectBorderIntegrityResult: ")
            .append(toIndentedString(detectBorderIntegrityResult))
            .append("\n");
        sb.append("    detectBlockingWithinBorderResult: ")
            .append(toIndentedString(detectBlockingWithinBorderResult))
            .append("\n");
        sb.append("    detectBlurResult: ").append(toIndentedString(detectBlurResult)).append("\n");
        sb.append("    detectInterimResult: ").append(toIndentedString(detectInterimResult)).append("\n");
        sb.append("    detectGlareResult: ").append(toIndentedString(detectGlareResult)).append("\n");
        sb.append("    scoreInfo: ").append(toIndentedString(scoreInfo)).append("\n");
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
