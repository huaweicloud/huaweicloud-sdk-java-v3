package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchSetAttributesReq
 */
public class BatchSetAttributesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_temp_id")

    private Long fileTempId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private List<AttributeReq> attributes = null;

    public BatchSetAttributesReq withFileTempId(Long fileTempId) {
        this.fileTempId = fileTempId;
        return this;
    }

    /**
     * 临时文件ID，如果通过接口调用，此字段为空
     * @return fileTempId
     */
    public Long getFileTempId() {
        return fileTempId;
    }

    public void setFileTempId(Long fileTempId) {
        this.fileTempId = fileTempId;
    }

    public BatchSetAttributesReq withAttributes(List<AttributeReq> attributes) {
        this.attributes = attributes;
        return this;
    }

    public BatchSetAttributesReq addAttributesItem(AttributeReq attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public BatchSetAttributesReq withAttributes(Consumer<List<AttributeReq>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 自定义属性集合
     * @return attributes
     */
    public List<AttributeReq> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeReq> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSetAttributesReq that = (BatchSetAttributesReq) obj;
        return Objects.equals(this.fileTempId, that.fileTempId) && Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileTempId, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetAttributesReq {\n");
        sb.append("    fileTempId: ").append(toIndentedString(fileTempId)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
