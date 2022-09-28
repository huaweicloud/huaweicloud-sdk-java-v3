package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TemplateSrcReq
 */
public class TemplateSrcReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_template_id")

    private String sourceTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_template_name")

    private String destinationTemplateName;

    public TemplateSrcReq withSourceTemplateId(String sourceTemplateId) {
        this.sourceTemplateId = sourceTemplateId;
        return this;
    }

    /**
     * 源模板id
     * @return sourceTemplateId
     */
    public String getSourceTemplateId() {
        return sourceTemplateId;
    }

    public void setSourceTemplateId(String sourceTemplateId) {
        this.sourceTemplateId = sourceTemplateId;
    }

    public TemplateSrcReq withDestinationTemplateName(String destinationTemplateName) {
        this.destinationTemplateName = destinationTemplateName;
        return this;
    }

    /**
     * 导入模板名称
     * @return destinationTemplateName
     */
    public String getDestinationTemplateName() {
        return destinationTemplateName;
    }

    public void setDestinationTemplateName(String destinationTemplateName) {
        this.destinationTemplateName = destinationTemplateName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateSrcReq templateSrcReq = (TemplateSrcReq) o;
        return Objects.equals(this.sourceTemplateId, templateSrcReq.sourceTemplateId)
            && Objects.equals(this.destinationTemplateName, templateSrcReq.destinationTemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceTemplateId, destinationTemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateSrcReq {\n");
        sb.append("    sourceTemplateId: ").append(toIndentedString(sourceTemplateId)).append("\n");
        sb.append("    destinationTemplateName: ").append(toIndentedString(destinationTemplateName)).append("\n");
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
