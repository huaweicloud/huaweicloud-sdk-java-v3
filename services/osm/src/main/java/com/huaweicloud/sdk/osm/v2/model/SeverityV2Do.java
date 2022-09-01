package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * SeverityV2Do
 */
public class SeverityV2Do {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    @JacksonXmlProperty(localName = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_name")

    @JacksonXmlProperty(localName = "severity_name")

    private String severityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_id")

    @JacksonXmlProperty(localName = "severity_id")

    private String severityId;

    public SeverityV2Do withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public SeverityV2Do withSeverityName(String severityName) {
        this.severityName = severityName;
        return this;
    }

    /**
     * 严重性名称
     * @return severityName
     */
    public String getSeverityName() {
        return severityName;
    }

    public void setSeverityName(String severityName) {
        this.severityName = severityName;
    }

    public SeverityV2Do withSeverityId(String severityId) {
        this.severityId = severityId;
        return this;
    }

    /**
     * 严重性id
     * @return severityId
     */
    public String getSeverityId() {
        return severityId;
    }

    public void setSeverityId(String severityId) {
        this.severityId = severityId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SeverityV2Do severityV2Do = (SeverityV2Do) o;
        return Objects.equals(this.language, severityV2Do.language)
            && Objects.equals(this.severityName, severityV2Do.severityName)
            && Objects.equals(this.severityId, severityV2Do.severityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, severityName, severityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SeverityV2Do {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    severityName: ").append(toIndentedString(severityName)).append("\n");
        sb.append("    severityId: ").append(toIndentedString(severityId)).append("\n");
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
