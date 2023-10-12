package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ColombiaIdCardResult
 */
public class ColombiaIdCardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_name")

    private String lastName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_place")

    private String birthPlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gender")

    private String gender;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blood_type")

    private String bloodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_authority")

    private String issueAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private String height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "citizen_code1")

    private String citizenCode1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "citizen_code2")

    private String citizenCode2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "citizen_code3")

    private String citizenCode3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Map<String, Float> confidence = null;

    public ColombiaIdCardResult withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * 证件图片正反面信息。可选值包括： - front: 证件图片正面 - back:  证件图片反面
     * @return side
     */
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public ColombiaIdCardResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 卡证编号。当响应字段\"side\"为front时，返回此字段。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ColombiaIdCardResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名。当响应字段\"side\"为front时，返回此字段。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColombiaIdCardResult withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * 姓。当响应字段\"side\"为front时，返回此字段。
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ColombiaIdCardResult withBirthDate(String birthDate) {
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

    public ColombiaIdCardResult withBirthPlace(String birthPlace) {
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

    public ColombiaIdCardResult withGender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * 性别。
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ColombiaIdCardResult withBloodType(String bloodType) {
        this.bloodType = bloodType;
        return this;
    }

    /**
     * 血型。
     * @return bloodType
     */
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public ColombiaIdCardResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 签发日期。
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public ColombiaIdCardResult withIssueAuthority(String issueAuthority) {
        this.issueAuthority = issueAuthority;
        return this;
    }

    /**
     * 签发地区。
     * @return issueAuthority
     */
    public String getIssueAuthority() {
        return issueAuthority;
    }

    public void setIssueAuthority(String issueAuthority) {
        this.issueAuthority = issueAuthority;
    }

    public ColombiaIdCardResult withHeight(String height) {
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

    public ColombiaIdCardResult withCitizenCode1(String citizenCode1) {
        this.citizenCode1 = citizenCode1;
        return this;
    }

    /**
     * 公民编码一。
     * @return citizenCode1
     */
    public String getCitizenCode1() {
        return citizenCode1;
    }

    public void setCitizenCode1(String citizenCode1) {
        this.citizenCode1 = citizenCode1;
    }

    public ColombiaIdCardResult withCitizenCode2(String citizenCode2) {
        this.citizenCode2 = citizenCode2;
        return this;
    }

    /**
     * 公民编码二。
     * @return citizenCode2
     */
    public String getCitizenCode2() {
        return citizenCode2;
    }

    public void setCitizenCode2(String citizenCode2) {
        this.citizenCode2 = citizenCode2;
    }

    public ColombiaIdCardResult withCitizenCode3(String citizenCode3) {
        this.citizenCode3 = citizenCode3;
        return this;
    }

    /**
     * 公民编码三。
     * @return citizenCode3
     */
    public String getCitizenCode3() {
        return citizenCode3;
    }

    public void setCitizenCode3(String citizenCode3) {
        this.citizenCode3 = citizenCode3;
    }

    public ColombiaIdCardResult withConfidence(Map<String, Float> confidence) {
        this.confidence = confidence;
        return this;
    }

    public ColombiaIdCardResult putConfidenceItem(String key, Float confidenceItem) {
        if (this.confidence == null) {
            this.confidence = new HashMap<>();
        }
        this.confidence.put(key, confidenceItem);
        return this;
    }

    public ColombiaIdCardResult withConfidence(Consumer<Map<String, Float>> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new HashMap<>();
        }
        confidenceSetter.accept(this.confidence);
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。注：置信度由算法给出，不直接等价于对应字段的准确率。
     * @return confidence
     */
    public Map<String, Float> getConfidence() {
        return confidence;
    }

    public void setConfidence(Map<String, Float> confidence) {
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
        ColombiaIdCardResult that = (ColombiaIdCardResult) obj;
        return Objects.equals(this.side, that.side) && Objects.equals(this.number, that.number)
            && Objects.equals(this.name, that.name) && Objects.equals(this.lastName, that.lastName)
            && Objects.equals(this.birthDate, that.birthDate) && Objects.equals(this.birthPlace, that.birthPlace)
            && Objects.equals(this.gender, that.gender) && Objects.equals(this.bloodType, that.bloodType)
            && Objects.equals(this.issueDate, that.issueDate)
            && Objects.equals(this.issueAuthority, that.issueAuthority) && Objects.equals(this.height, that.height)
            && Objects.equals(this.citizenCode1, that.citizenCode1)
            && Objects.equals(this.citizenCode2, that.citizenCode2)
            && Objects.equals(this.citizenCode3, that.citizenCode3) && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side,
            number,
            name,
            lastName,
            birthDate,
            birthPlace,
            gender,
            bloodType,
            issueDate,
            issueAuthority,
            height,
            citizenCode1,
            citizenCode2,
            citizenCode3,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColombiaIdCardResult {\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    bloodType: ").append(toIndentedString(bloodType)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    issueAuthority: ").append(toIndentedString(issueAuthority)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    citizenCode1: ").append(toIndentedString(citizenCode1)).append("\n");
        sb.append("    citizenCode2: ").append(toIndentedString(citizenCode2)).append("\n");
        sb.append("    citizenCode3: ").append(toIndentedString(citizenCode3)).append("\n");
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
