package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用程序Schema属性映射配置
 */
public class ResponseSchemaConfigDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, ResponseSchemaPropertiesDetailsDto> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private ResponseSchemaSubjectDetailsDto subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_name_id_formats")

    private List<String> supportedNameIdFormats = null;

    public ResponseSchemaConfigDto withProperties(Map<String, ResponseSchemaPropertiesDetailsDto> properties) {
        this.properties = properties;
        return this;
    }

    public ResponseSchemaConfigDto putPropertiesItem(String key, ResponseSchemaPropertiesDetailsDto propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public ResponseSchemaConfigDto withProperties(
        Consumer<Map<String, ResponseSchemaPropertiesDetailsDto>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 额外添加的属性映射Schema配置
     * @return properties
     */
    public Map<String, ResponseSchemaPropertiesDetailsDto> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, ResponseSchemaPropertiesDetailsDto> properties) {
        this.properties = properties;
    }

    public ResponseSchemaConfigDto withSubject(ResponseSchemaSubjectDetailsDto subject) {
        this.subject = subject;
        return this;
    }

    public ResponseSchemaConfigDto withSubject(Consumer<ResponseSchemaSubjectDetailsDto> subjectSetter) {
        if (this.subject == null) {
            this.subject = new ResponseSchemaSubjectDetailsDto();
            subjectSetter.accept(this.subject);
        }

        return this;
    }

    /**
     * Get subject
     * @return subject
     */
    public ResponseSchemaSubjectDetailsDto getSubject() {
        return subject;
    }

    public void setSubject(ResponseSchemaSubjectDetailsDto subject) {
        this.subject = subject;
    }

    public ResponseSchemaConfigDto withSupportedNameIdFormats(List<String> supportedNameIdFormats) {
        this.supportedNameIdFormats = supportedNameIdFormats;
        return this;
    }

    public ResponseSchemaConfigDto addSupportedNameIdFormatsItem(String supportedNameIdFormatsItem) {
        if (this.supportedNameIdFormats == null) {
            this.supportedNameIdFormats = new ArrayList<>();
        }
        this.supportedNameIdFormats.add(supportedNameIdFormatsItem);
        return this;
    }

    public ResponseSchemaConfigDto withSupportedNameIdFormats(Consumer<List<String>> supportedNameIdFormatsSetter) {
        if (this.supportedNameIdFormats == null) {
            this.supportedNameIdFormats = new ArrayList<>();
        }
        supportedNameIdFormatsSetter.accept(this.supportedNameIdFormats);
        return this;
    }

    /**
     * 应用程序支持的Subject NameID格式
     * @return supportedNameIdFormats
     */
    public List<String> getSupportedNameIdFormats() {
        return supportedNameIdFormats;
    }

    public void setSupportedNameIdFormats(List<String> supportedNameIdFormats) {
        this.supportedNameIdFormats = supportedNameIdFormats;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseSchemaConfigDto that = (ResponseSchemaConfigDto) obj;
        return Objects.equals(this.properties, that.properties) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.supportedNameIdFormats, that.supportedNameIdFormats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties, subject, supportedNameIdFormats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseSchemaConfigDto {\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    supportedNameIdFormats: ").append(toIndentedString(supportedNameIdFormats)).append("\n");
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
