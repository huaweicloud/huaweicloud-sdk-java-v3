package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * FaceSetInfo
 */
public class FaceSetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_number")

    @JacksonXmlProperty(localName = "face_number")

    private Integer faceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_fields")

    @JacksonXmlProperty(localName = "external_fields")

    private Object externalFields;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_id")

    @JacksonXmlProperty(localName = "face_set_id")

    private String faceSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_name")

    @JacksonXmlProperty(localName = "face_set_name")

    private String faceSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date")

    @JacksonXmlProperty(localName = "create_date")

    private String createDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_set_capacity")

    @JacksonXmlProperty(localName = "face_set_capacity")

    private Integer faceSetCapacity;

    public FaceSetInfo withFaceNumber(Integer faceNumber) {
        this.faceNumber = faceNumber;
        return this;
    }

    /**
     * 人脸库当中的人脸数量。
     * @return faceNumber
     */
    public Integer getFaceNumber() {
        return faceNumber;
    }

    public void setFaceNumber(Integer faceNumber) {
        this.faceNumber = faceNumber;
    }

    public FaceSetInfo withExternalFields(Object externalFields) {
        this.externalFields = externalFields;
        return this;
    }

    /**
     * 用户的自定义字段。
     * @return externalFields
     */
    public Object getExternalFields() {
        return externalFields;
    }

    public void setExternalFields(Object externalFields) {
        this.externalFields = externalFields;
    }

    public FaceSetInfo withFaceSetId(String faceSetId) {
        this.faceSetId = faceSetId;
        return this;
    }

    /**
     * 人脸库ID，随机生成的包含八个字符的字符串。
     * @return faceSetId
     */
    public String getFaceSetId() {
        return faceSetId;
    }

    public void setFaceSetId(String faceSetId) {
        this.faceSetId = faceSetId;
    }

    public FaceSetInfo withFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
        return this;
    }

    /**
     * 人脸库名称。
     * @return faceSetName
     */
    public String getFaceSetName() {
        return faceSetName;
    }

    public void setFaceSetName(String faceSetName) {
        this.faceSetName = faceSetName;
    }

    public FaceSetInfo withCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * 创建时间。
     * @return createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public FaceSetInfo withFaceSetCapacity(Integer faceSetCapacity) {
        this.faceSetCapacity = faceSetCapacity;
        return this;
    }

    /**
     * 人脸库最大的容量。
     * @return faceSetCapacity
     */
    public Integer getFaceSetCapacity() {
        return faceSetCapacity;
    }

    public void setFaceSetCapacity(Integer faceSetCapacity) {
        this.faceSetCapacity = faceSetCapacity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaceSetInfo faceSetInfo = (FaceSetInfo) o;
        return Objects.equals(this.faceNumber, faceSetInfo.faceNumber)
            && Objects.equals(this.externalFields, faceSetInfo.externalFields)
            && Objects.equals(this.faceSetId, faceSetInfo.faceSetId)
            && Objects.equals(this.faceSetName, faceSetInfo.faceSetName)
            && Objects.equals(this.createDate, faceSetInfo.createDate)
            && Objects.equals(this.faceSetCapacity, faceSetInfo.faceSetCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faceNumber, externalFields, faceSetId, faceSetName, createDate, faceSetCapacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaceSetInfo {\n");
        sb.append("    faceNumber: ").append(toIndentedString(faceNumber)).append("\n");
        sb.append("    externalFields: ").append(toIndentedString(externalFields)).append("\n");
        sb.append("    faceSetId: ").append(toIndentedString(faceSetId)).append("\n");
        sb.append("    faceSetName: ").append(toIndentedString(faceSetName)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    faceSetCapacity: ").append(toIndentedString(faceSetCapacity)).append("\n");
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
