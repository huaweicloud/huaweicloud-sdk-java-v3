package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MyanmarIdcardTranslationInfo
 */
public class MyanmarIdcardTranslationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_translation")

    private String nameTranslation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "father_name_translation")

    private String fatherNameTranslation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrc_id_translation")

    private String nrcIdTranslation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_translation")

    private String birthTranslation;

    public MyanmarIdcardTranslationInfo withNameTranslation(String nameTranslation) {
        this.nameTranslation = nameTranslation;
        return this;
    }

    /**
     * 名字转译。仅当输入参数return_translation为true时，返回该字段。 
     * @return nameTranslation
     */
    public String getNameTranslation() {
        return nameTranslation;
    }

    public void setNameTranslation(String nameTranslation) {
        this.nameTranslation = nameTranslation;
    }

    public MyanmarIdcardTranslationInfo withFatherNameTranslation(String fatherNameTranslation) {
        this.fatherNameTranslation = fatherNameTranslation;
        return this;
    }

    /**
     * 父亲名字的转译。仅当输入参数return_translation为true时，返回该字段。 
     * @return fatherNameTranslation
     */
    public String getFatherNameTranslation() {
        return fatherNameTranslation;
    }

    public void setFatherNameTranslation(String fatherNameTranslation) {
        this.fatherNameTranslation = fatherNameTranslation;
    }

    public MyanmarIdcardTranslationInfo withNrcIdTranslation(String nrcIdTranslation) {
        this.nrcIdTranslation = nrcIdTranslation;
        return this;
    }

    /**
     * 身份证号码转译。仅当输入参数return_translation为true时，返回该字段。 
     * @return nrcIdTranslation
     */
    public String getNrcIdTranslation() {
        return nrcIdTranslation;
    }

    public void setNrcIdTranslation(String nrcIdTranslation) {
        this.nrcIdTranslation = nrcIdTranslation;
    }

    public MyanmarIdcardTranslationInfo withBirthTranslation(String birthTranslation) {
        this.birthTranslation = birthTranslation;
        return this;
    }

    /**
     * 出生日期转译。仅当输入参数return_translation为true时，返回该字段。 
     * @return birthTranslation
     */
    public String getBirthTranslation() {
        return birthTranslation;
    }

    public void setBirthTranslation(String birthTranslation) {
        this.birthTranslation = birthTranslation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyanmarIdcardTranslationInfo that = (MyanmarIdcardTranslationInfo) obj;
        return Objects.equals(this.nameTranslation, that.nameTranslation)
            && Objects.equals(this.fatherNameTranslation, that.fatherNameTranslation)
            && Objects.equals(this.nrcIdTranslation, that.nrcIdTranslation)
            && Objects.equals(this.birthTranslation, that.birthTranslation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameTranslation, fatherNameTranslation, nrcIdTranslation, birthTranslation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MyanmarIdcardTranslationInfo {\n");
        sb.append("    nameTranslation: ").append(toIndentedString(nameTranslation)).append("\n");
        sb.append("    fatherNameTranslation: ").append(toIndentedString(fatherNameTranslation)).append("\n");
        sb.append("    nrcIdTranslation: ").append(toIndentedString(nrcIdTranslation)).append("\n");
        sb.append("    birthTranslation: ").append(toIndentedString(birthTranslation)).append("\n");
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
