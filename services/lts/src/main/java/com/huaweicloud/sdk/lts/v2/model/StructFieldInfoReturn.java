package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * StructFieldInfoReturn
 */
public class StructFieldInfoReturn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fieldName")

    @JacksonXmlProperty(localName = "fieldName")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    @JacksonXmlProperty(localName = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAnalysis")

    @JacksonXmlProperty(localName = "isAnalysis")

    private Boolean isAnalysis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    @JacksonXmlProperty(localName = "index")

    private Integer index;

    public StructFieldInfoReturn withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * 字段名称
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public StructFieldInfoReturn withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 字段数据类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StructFieldInfoReturn withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 字段内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public StructFieldInfoReturn withIsAnalysis(Boolean isAnalysis) {
        this.isAnalysis = isAnalysis;
        return this;
    }

    /**
     * 结构化方式
     * @return isAnalysis
     */
    public Boolean getIsAnalysis() {
        return isAnalysis;
    }

    public void setIsAnalysis(Boolean isAnalysis) {
        this.isAnalysis = isAnalysis;
    }

    public StructFieldInfoReturn withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 序号
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StructFieldInfoReturn structFieldInfoReturn = (StructFieldInfoReturn) o;
        return Objects.equals(this.fieldName, structFieldInfoReturn.fieldName)
            && Objects.equals(this.type, structFieldInfoReturn.type)
            && Objects.equals(this.content, structFieldInfoReturn.content)
            && Objects.equals(this.isAnalysis, structFieldInfoReturn.isAnalysis)
            && Objects.equals(this.index, structFieldInfoReturn.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldName, type, content, isAnalysis, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructFieldInfoReturn {\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    isAnalysis: ").append(toIndentedString(isAnalysis)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
