package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CambodianIdCardResult
 */
public class CambodianIdCardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    private String idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_kh")

    private String nameKh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private String height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_place")

    private String birthPlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code1")

    private String machineCode1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code2")

    private String machineCode2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code3")

    private String machineCode3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_type")

    private String idcardType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjusted_image")

    private String adjustedImage;

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
    @JsonProperty(value = "detect_glare_result")

    private Boolean detectGlareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_tampering_result")

    private Boolean detectTamperingResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_reproduce_result")

    private Boolean detectReproduceResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score_info")

    private CambodianIdCardScoreInformationResult scoreInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public CambodianIdCardResult withIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /**
     * 身份证号码。 
     * @return idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public CambodianIdCardResult withNameKh(String nameKh) {
        this.nameKh = nameKh;
        return this;
    }

    /**
     * 高棉语版姓名。 
     * @return nameKh
     */
    public String getNameKh() {
        return nameKh;
    }

    public void setNameKh(String nameKh) {
        this.nameKh = nameKh;
    }

    public CambodianIdCardResult withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文姓名。 
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public CambodianIdCardResult withBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * 出生日期。 
     * @return birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public CambodianIdCardResult withSex(String sex) {
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

    public CambodianIdCardResult withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 身高。 
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public CambodianIdCardResult withBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    /**
     * 出生地。 
     * @return birthPlace
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public CambodianIdCardResult withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 地址，以空格分隔。 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CambodianIdCardResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 签发起始日期。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public CambodianIdCardResult withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 签发结束日期。 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public CambodianIdCardResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 图片中的个人特征。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CambodianIdCardResult withMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
        return this;
    }

    /**
     * 机器码第一行。 
     * @return machineCode1
     */
    public String getMachineCode1() {
        return machineCode1;
    }

    public void setMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
    }

    public CambodianIdCardResult withMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
        return this;
    }

    /**
     * 机器码第二行。 
     * @return machineCode2
     */
    public String getMachineCode2() {
        return machineCode2;
    }

    public void setMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
    }

    public CambodianIdCardResult withMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
        return this;
    }

    /**
     * 机器码第三行。 
     * @return machineCode3
     */
    public String getMachineCode3() {
        return machineCode3;
    }

    public void setMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
    }

    public CambodianIdCardResult withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /**
     * 头像的base64编码。 当输入参数“return_portrait_image”为“true”时，才返回该参数。 
     * @return portraitImage
     */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public CambodianIdCardResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public CambodianIdCardResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public CambodianIdCardResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        portraitLocationSetter.accept(this.portraitLocation);
        return this;
    }

    /**
     * 头像在原图上的位置。 当输入参数“return_portrait_location”为“true”时，才返回该参数。以列表形式显示，包含头像区域四个顶点的二维坐标（x,y），坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return portraitLocation
     */
    public List<List<Integer>> getPortraitLocation() {
        return portraitLocation;
    }

    public void setPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
    }

    public CambodianIdCardResult withIdcardType(String idcardType) {
        this.idcardType = idcardType;
        return this;
    }

    /**
     * 身份证的类型。当输入参数\"idcard_type \"为\"true\"时，才返回该参数。取值如下所示： - normal：身份证原件 - copy：复印的身份证 
     * @return idcardType
     */
    public String getIdcardType() {
        return idcardType;
    }

    public void setIdcardType(String idcardType) {
        this.idcardType = idcardType;
    }

    public CambodianIdCardResult withAdjustedImage(String adjustedImage) {
        this.adjustedImage = adjustedImage;
        return this;
    }

    /**
     * 身份证原图的base64编码。 当输入参数\"return_adjusted_image\"为\"true\"时，才返回该参数。 
     * @return adjustedImage
     */
    public String getAdjustedImage() {
        return adjustedImage;
    }

    public void setAdjustedImage(String adjustedImage) {
        this.adjustedImage = adjustedImage;
    }

    public CambodianIdCardResult withDetectBorderIntegrityResult(Boolean detectBorderIntegrityResult) {
        this.detectBorderIntegrityResult = detectBorderIntegrityResult;
        return this;
    }

    /**
     * 身份证图片边框完整性告警结果，\"true\"表示边框不完整，\"false\"表示边框完整。仅在输入参数detect_border_integrity为true时，返回该字段。 
     * @return detectBorderIntegrityResult
     */
    public Boolean getDetectBorderIntegrityResult() {
        return detectBorderIntegrityResult;
    }

    public void setDetectBorderIntegrityResult(Boolean detectBorderIntegrityResult) {
        this.detectBorderIntegrityResult = detectBorderIntegrityResult;
    }

    public CambodianIdCardResult withDetectBlockingWithinBorderResult(Boolean detectBlockingWithinBorderResult) {
        this.detectBlockingWithinBorderResult = detectBlockingWithinBorderResult;
        return this;
    }

    /**
     * 身份证图像框内是否存在遮挡的告警结果，\"true\"表示边框内部存在遮挡，\"false\"表示边框内部完整。仅在输入参数detect_blocking_within_border为true时，返回该字段。 
     * @return detectBlockingWithinBorderResult
     */
    public Boolean getDetectBlockingWithinBorderResult() {
        return detectBlockingWithinBorderResult;
    }

    public void setDetectBlockingWithinBorderResult(Boolean detectBlockingWithinBorderResult) {
        this.detectBlockingWithinBorderResult = detectBlockingWithinBorderResult;
    }

    public CambodianIdCardResult withDetectBlurResult(Boolean detectBlurResult) {
        this.detectBlurResult = detectBlurResult;
        return this;
    }

    /**
     * 身份证模糊告警结果，\"true\"表示图片模糊，\"false\"表示身份证清晰。仅在输入参数detect_blur为true时，返回该字段。 
     * @return detectBlurResult
     */
    public Boolean getDetectBlurResult() {
        return detectBlurResult;
    }

    public void setDetectBlurResult(Boolean detectBlurResult) {
        this.detectBlurResult = detectBlurResult;
    }

    public CambodianIdCardResult withDetectGlareResult(Boolean detectGlareResult) {
        this.detectGlareResult = detectGlareResult;
        return this;
    }

    /**
     * 身份证反光告警结果，\"true\"表示身份证反光，\"false\"表示是身份证无反光。仅在输入参数detect_glare为true时，返回该字段。 
     * @return detectGlareResult
     */
    public Boolean getDetectGlareResult() {
        return detectGlareResult;
    }

    public void setDetectGlareResult(Boolean detectGlareResult) {
        this.detectGlareResult = detectGlareResult;
    }

    public CambodianIdCardResult withDetectTamperingResult(Boolean detectTamperingResult) {
        this.detectTamperingResult = detectTamperingResult;
        return this;
    }

    /**
     * 身份证人像被篡改的告警结果，\"true\"表示身份证人像被篡改，\"false\"表示是身份证人像未被篡改。仅在输入参数detect_tampering为true时，返回该字段。 
     * @return detectTamperingResult
     */
    public Boolean getDetectTamperingResult() {
        return detectTamperingResult;
    }

    public void setDetectTamperingResult(Boolean detectTamperingResult) {
        this.detectTamperingResult = detectTamperingResult;
    }

    public CambodianIdCardResult withDetectReproduceResult(Boolean detectReproduceResult) {
        this.detectReproduceResult = detectReproduceResult;
        return this;
    }

    /**
     * 身份证是否经过翻拍的告警结果，“true”表示身份证经过翻拍，“false”表示身份证未经过翻拍。仅在输入参数detect_reproduce为true时，返回该字段。 
     * @return detectReproduceResult
     */
    public Boolean getDetectReproduceResult() {
        return detectReproduceResult;
    }

    public void setDetectReproduceResult(Boolean detectReproduceResult) {
        this.detectReproduceResult = detectReproduceResult;
    }

    public CambodianIdCardResult withScoreInfo(CambodianIdCardScoreInformationResult scoreInfo) {
        this.scoreInfo = scoreInfo;
        return this;
    }

    public CambodianIdCardResult withScoreInfo(Consumer<CambodianIdCardScoreInformationResult> scoreInfoSetter) {
        if (this.scoreInfo == null) {
            this.scoreInfo = new CambodianIdCardScoreInformationResult();
            scoreInfoSetter.accept(this.scoreInfo);
        }

        return this;
    }

    /**
     * Get scoreInfo
     * @return scoreInfo
     */
    public CambodianIdCardScoreInformationResult getScoreInfo() {
        return scoreInfo;
    }

    public void setScoreInfo(CambodianIdCardScoreInformationResult scoreInfo) {
        this.scoreInfo = scoreInfo;
    }

    public CambodianIdCardResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CambodianIdCardResult that = (CambodianIdCardResult) obj;
        return Objects.equals(this.idNumber, that.idNumber) && Objects.equals(this.nameKh, that.nameKh)
            && Objects.equals(this.nameEn, that.nameEn) && Objects.equals(this.birthDate, that.birthDate)
            && Objects.equals(this.sex, that.sex) && Objects.equals(this.height, that.height)
            && Objects.equals(this.birthPlace, that.birthPlace) && Objects.equals(this.address, that.address)
            && Objects.equals(this.issueDate, that.issueDate) && Objects.equals(this.expiryDate, that.expiryDate)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.machineCode1, that.machineCode1)
            && Objects.equals(this.machineCode2, that.machineCode2)
            && Objects.equals(this.machineCode3, that.machineCode3)
            && Objects.equals(this.portraitImage, that.portraitImage)
            && Objects.equals(this.portraitLocation, that.portraitLocation)
            && Objects.equals(this.idcardType, that.idcardType)
            && Objects.equals(this.adjustedImage, that.adjustedImage)
            && Objects.equals(this.detectBorderIntegrityResult, that.detectBorderIntegrityResult)
            && Objects.equals(this.detectBlockingWithinBorderResult, that.detectBlockingWithinBorderResult)
            && Objects.equals(this.detectBlurResult, that.detectBlurResult)
            && Objects.equals(this.detectGlareResult, that.detectGlareResult)
            && Objects.equals(this.detectTamperingResult, that.detectTamperingResult)
            && Objects.equals(this.detectReproduceResult, that.detectReproduceResult)
            && Objects.equals(this.scoreInfo, that.scoreInfo) && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber,
            nameKh,
            nameEn,
            birthDate,
            sex,
            height,
            birthPlace,
            address,
            issueDate,
            expiryDate,
            description,
            machineCode1,
            machineCode2,
            machineCode3,
            portraitImage,
            portraitLocation,
            idcardType,
            adjustedImage,
            detectBorderIntegrityResult,
            detectBlockingWithinBorderResult,
            detectBlurResult,
            detectGlareResult,
            detectTamperingResult,
            detectReproduceResult,
            scoreInfo,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CambodianIdCardResult {\n");
        sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
        sb.append("    nameKh: ").append(toIndentedString(nameKh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    machineCode1: ").append(toIndentedString(machineCode1)).append("\n");
        sb.append("    machineCode2: ").append(toIndentedString(machineCode2)).append("\n");
        sb.append("    machineCode3: ").append(toIndentedString(machineCode3)).append("\n");
        sb.append("    portraitImage: ").append(toIndentedString(portraitImage)).append("\n");
        sb.append("    portraitLocation: ").append(toIndentedString(portraitLocation)).append("\n");
        sb.append("    idcardType: ").append(toIndentedString(idcardType)).append("\n");
        sb.append("    adjustedImage: ").append(toIndentedString(adjustedImage)).append("\n");
        sb.append("    detectBorderIntegrityResult: ")
            .append(toIndentedString(detectBorderIntegrityResult))
            .append("\n");
        sb.append("    detectBlockingWithinBorderResult: ")
            .append(toIndentedString(detectBlockingWithinBorderResult))
            .append("\n");
        sb.append("    detectBlurResult: ").append(toIndentedString(detectBlurResult)).append("\n");
        sb.append("    detectGlareResult: ").append(toIndentedString(detectGlareResult)).append("\n");
        sb.append("    detectTamperingResult: ").append(toIndentedString(detectTamperingResult)).append("\n");
        sb.append("    detectReproduceResult: ").append(toIndentedString(detectReproduceResult)).append("\n");
        sb.append("    scoreInfo: ").append(toIndentedString(scoreInfo)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
