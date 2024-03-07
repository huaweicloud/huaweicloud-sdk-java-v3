package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class IdcardFrontResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth")

    private String birth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ethnicity")

    private String ethnicity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjusted_image")

    private String adjustedImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_result")

    private IdcardFrontVerificationResult verificationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

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

    public IdcardFrontResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IdcardFrontResult withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别。 
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public IdcardFrontResult withBirth(String birth) {
        this.birth = birth;
        return this;
    }

    /**
     * 出生日期。 
     * @return birth
     */
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public IdcardFrontResult withEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    /**
     * 民族。 
     * @return ethnicity
     */
    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public IdcardFrontResult withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 地址。 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public IdcardFrontResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 身份证号。 
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public IdcardFrontResult withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /**
     * 身份证头像图片信息的base64码结果。  > 说明： - 仅在输入参数return_portrait_image为true时，返回该字段。 - 当输入为身份证背面时返回为空字符串。 
     * @return portraitImage
     */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public IdcardFrontResult withAdjustedImage(String adjustedImage) {
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

    public IdcardFrontResult withVerificationResult(IdcardFrontVerificationResult verificationResult) {
        this.verificationResult = verificationResult;
        return this;
    }

    public IdcardFrontResult withVerificationResult(Consumer<IdcardFrontVerificationResult> verificationResultSetter) {
        if (this.verificationResult == null) {
            this.verificationResult = new IdcardFrontVerificationResult();
            verificationResultSetter.accept(this.verificationResult);
        }

        return this;
    }

    /**
     * Get verificationResult
     * @return verificationResult
     */
    public IdcardFrontVerificationResult getVerificationResult() {
        return verificationResult;
    }

    public void setVerificationResult(IdcardFrontVerificationResult verificationResult) {
        this.verificationResult = verificationResult;
    }

    public IdcardFrontResult withTextLocation(Object textLocation) {
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

    public IdcardFrontResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public IdcardFrontResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public IdcardFrontResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        portraitLocationSetter.accept(this.portraitLocation);
        return this;
    }

    /**
     * 身份证头像位置信息的结果。 仅在输入参数return_portrait_location为true时，返回该字段。 
     * @return portraitLocation
     */
    public List<List<Integer>> getPortraitLocation() {
        return portraitLocation;
    }

    public void setPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
    }

    public IdcardFrontResult withDetectReproduceResult(Boolean detectReproduceResult) {
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

    public IdcardFrontResult withDetectCopyResult(Boolean detectCopyResult) {
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

    public IdcardFrontResult withDetectTamperingResult(Boolean detectTamperingResult) {
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

    public IdcardFrontResult withDetectBorderIntegrityResult(Boolean detectBorderIntegrityResult) {
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

    public IdcardFrontResult withDetectBlockingWithinBorderResult(Boolean detectBlockingWithinBorderResult) {
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

    public IdcardFrontResult withDetectBlurResult(Boolean detectBlurResult) {
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

    public IdcardFrontResult withDetectInterimResult(Boolean detectInterimResult) {
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

    public IdcardFrontResult withDetectGlareResult(Boolean detectGlareResult) {
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

    public IdcardFrontResult withScoreInfo(IdcardScoreInfoResult scoreInfo) {
        this.scoreInfo = scoreInfo;
        return this;
    }

    public IdcardFrontResult withScoreInfo(Consumer<IdcardScoreInfoResult> scoreInfoSetter) {
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
        IdcardFrontResult that = (IdcardFrontResult) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sex, that.sex)
            && Objects.equals(this.birth, that.birth) && Objects.equals(this.ethnicity, that.ethnicity)
            && Objects.equals(this.address, that.address) && Objects.equals(this.number, that.number)
            && Objects.equals(this.portraitImage, that.portraitImage)
            && Objects.equals(this.adjustedImage, that.adjustedImage)
            && Objects.equals(this.verificationResult, that.verificationResult)
            && Objects.equals(this.textLocation, that.textLocation)
            && Objects.equals(this.portraitLocation, that.portraitLocation)
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
        return Objects.hash(name,
            sex,
            birth,
            ethnicity,
            address,
            number,
            portraitImage,
            adjustedImage,
            verificationResult,
            textLocation,
            portraitLocation,
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
        sb.append("class IdcardFrontResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
        sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    portraitImage: ").append(toIndentedString(portraitImage)).append("\n");
        sb.append("    adjustedImage: ").append(toIndentedString(adjustedImage)).append("\n");
        sb.append("    verificationResult: ").append(toIndentedString(verificationResult)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
        sb.append("    portraitLocation: ").append(toIndentedString(portraitLocation)).append("\n");
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
