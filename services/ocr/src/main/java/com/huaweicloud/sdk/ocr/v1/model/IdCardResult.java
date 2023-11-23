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
public class IdCardResult {

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
    @JsonProperty(value = "issue")

    private String issue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_from")

    private String validFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_to")

    private String validTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_result")

    private IdcardVerificationResult verificationResult;

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
    @JsonProperty(value = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

    public IdCardResult withName(String name) {
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

    public IdCardResult withSex(String sex) {
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

    public IdCardResult withBirth(String birth) {
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

    public IdCardResult withEthnicity(String ethnicity) {
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

    public IdCardResult withAddress(String address) {
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

    public IdCardResult withNumber(String number) {
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

    public IdCardResult withIssue(String issue) {
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

    public IdCardResult withValidFrom(String validFrom) {
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

    public IdCardResult withValidTo(String validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * 有效结束日期。  > 说明： - 身份证识别支持中华人民共和国居民身份证识别。 
     * @return validTo
     */
    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public IdCardResult withVerificationResult(IdcardVerificationResult verificationResult) {
        this.verificationResult = verificationResult;
        return this;
    }

    public IdCardResult withVerificationResult(Consumer<IdcardVerificationResult> verificationResultSetter) {
        if (this.verificationResult == null) {
            this.verificationResult = new IdcardVerificationResult();
            verificationResultSetter.accept(this.verificationResult);
        }

        return this;
    }

    /**
     * Get verificationResult
     * @return verificationResult
     */
    public IdcardVerificationResult getVerificationResult() {
        return verificationResult;
    }

    public void setVerificationResult(IdcardVerificationResult verificationResult) {
        this.verificationResult = verificationResult;
    }

    public IdCardResult withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /**
     * 文本框在原图位置。输出左上、右上、右下、左下四个点坐标。当“return_text_location”设置为“true”时才返回。 
     * @return textLocation
     */
    public Object getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Object textLocation) {
        this.textLocation = textLocation;
    }

    public IdCardResult withDetectReproduceResult(Boolean detectReproduceResult) {
        this.detectReproduceResult = detectReproduceResult;
        return this;
    }

    /**
     * 判断身份证图像是否经过翻拍，“true”表示是翻拍，“false”表示未经过翻拍。仅在输入参数detect_reproduce为true时，返回该字段。 
     * @return detectReproduceResult
     */
    public Boolean getDetectReproduceResult() {
        return detectReproduceResult;
    }

    public void setDetectReproduceResult(Boolean detectReproduceResult) {
        this.detectReproduceResult = detectReproduceResult;
    }

    public IdCardResult withDetectCopyResult(Boolean detectCopyResult) {
        this.detectCopyResult = detectCopyResult;
        return this;
    }

    /**
     * 判断身份证图像是黑白复印件还是原件，“true”表示是复印件，“false”表示是原件。仅在输入参数detect_copy为true时，返回该字段。 
     * @return detectCopyResult
     */
    public Boolean getDetectCopyResult() {
        return detectCopyResult;
    }

    public void setDetectCopyResult(Boolean detectCopyResult) {
        this.detectCopyResult = detectCopyResult;
    }

    public IdCardResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public IdCardResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public IdCardResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        portraitLocationSetter.accept(this.portraitLocation);
        return this;
    }

    /**
     * 身份证头像位置信息的结果，仅在输入参数“return_portrait_location”为true时，返回该字段，当输入身份证背面时返回为空列表。 
     * @return portraitLocation
     */
    public List<List<Integer>> getPortraitLocation() {
        return portraitLocation;
    }

    public void setPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdCardResult that = (IdCardResult) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sex, that.sex)
            && Objects.equals(this.birth, that.birth) && Objects.equals(this.ethnicity, that.ethnicity)
            && Objects.equals(this.address, that.address) && Objects.equals(this.number, that.number)
            && Objects.equals(this.issue, that.issue) && Objects.equals(this.validFrom, that.validFrom)
            && Objects.equals(this.validTo, that.validTo)
            && Objects.equals(this.verificationResult, that.verificationResult)
            && Objects.equals(this.textLocation, that.textLocation)
            && Objects.equals(this.detectReproduceResult, that.detectReproduceResult)
            && Objects.equals(this.detectCopyResult, that.detectCopyResult)
            && Objects.equals(this.portraitLocation, that.portraitLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            sex,
            birth,
            ethnicity,
            address,
            number,
            issue,
            validFrom,
            validTo,
            verificationResult,
            textLocation,
            detectReproduceResult,
            detectCopyResult,
            portraitLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdCardResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
        sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
        sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
        sb.append("    verificationResult: ").append(toIndentedString(verificationResult)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
        sb.append("    detectReproduceResult: ").append(toIndentedString(detectReproduceResult)).append("\n");
        sb.append("    detectCopyResult: ").append(toIndentedString(detectCopyResult)).append("\n");
        sb.append("    portraitLocation: ").append(toIndentedString(portraitLocation)).append("\n");
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
