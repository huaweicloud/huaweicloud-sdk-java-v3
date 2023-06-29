package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IncidentTempV2
 */
public class IncidentTempV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_template_id")

    private String incidentTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_template_name")

    private String incidentTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_template_content")

    private String incidentTemplateContent;

    public IncidentTempV2 withIncidentTemplateId(String incidentTemplateId) {
        this.incidentTemplateId = incidentTemplateId;
        return this;
    }

    /**
     * 模板id
     * @return incidentTemplateId
     */
    public String getIncidentTemplateId() {
        return incidentTemplateId;
    }

    public void setIncidentTemplateId(String incidentTemplateId) {
        this.incidentTemplateId = incidentTemplateId;
    }

    public IncidentTempV2 withIncidentTemplateName(String incidentTemplateName) {
        this.incidentTemplateName = incidentTemplateName;
        return this;
    }

    /**
     * 模板名称
     * @return incidentTemplateName
     */
    public String getIncidentTemplateName() {
        return incidentTemplateName;
    }

    public void setIncidentTemplateName(String incidentTemplateName) {
        this.incidentTemplateName = incidentTemplateName;
    }

    public IncidentTempV2 withIncidentTemplateContent(String incidentTemplateContent) {
        this.incidentTemplateContent = incidentTemplateContent;
        return this;
    }

    /**
     * 模板内容
     * @return incidentTemplateContent
     */
    public String getIncidentTemplateContent() {
        return incidentTemplateContent;
    }

    public void setIncidentTemplateContent(String incidentTemplateContent) {
        this.incidentTemplateContent = incidentTemplateContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentTempV2 that = (IncidentTempV2) obj;
        return Objects.equals(this.incidentTemplateId, that.incidentTemplateId)
            && Objects.equals(this.incidentTemplateName, that.incidentTemplateName)
            && Objects.equals(this.incidentTemplateContent, that.incidentTemplateContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentTemplateId, incidentTemplateName, incidentTemplateContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentTempV2 {\n");
        sb.append("    incidentTemplateId: ").append(toIndentedString(incidentTemplateId)).append("\n");
        sb.append("    incidentTemplateName: ").append(toIndentedString(incidentTemplateName)).append("\n");
        sb.append("    incidentTemplateContent: ").append(toIndentedString(incidentTemplateContent)).append("\n");
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
