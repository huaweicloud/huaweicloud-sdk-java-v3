package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建模板请求参数。
 */
public class CreateTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    /**
     * 模板类型，包括预置和自定义。
     */
    public static final class TemplateTypeEnum {

        /**
         * Enum PREDEFINED for value: "predefined"
         */
        public static final TemplateTypeEnum PREDEFINED = new TemplateTypeEnum("predefined");

        /**
         * Enum CUSTOMIZED for value: "customized"
         */
        public static final TemplateTypeEnum CUSTOMIZED = new TemplateTypeEnum("customized");

        private static final Map<String, TemplateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TemplateTypeEnum> createStaticFields() {
            Map<String, TemplateTypeEnum> map = new HashMap<>();
            map.put("predefined", PREDEFINED);
            map.put("customized", CUSTOMIZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TemplateTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TemplateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TemplateTypeEnum(value));
        }

        public static TemplateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TemplateTypeEnum) {
                return this.value.equals(((TemplateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private TemplateTypeEnum templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_description")

    private String templateDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_body")

    private String templateBody;

    public CreateTemplateRequestBody withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public CreateTemplateRequestBody withTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 模板类型，包括预置和自定义。
     * @return templateType
     */
    public TemplateTypeEnum getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
    }

    public CreateTemplateRequestBody withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * 模板描述。
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public CreateTemplateRequestBody withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * 模板内容。
     * @return templateBody
     */
    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTemplateRequestBody that = (CreateTemplateRequestBody) obj;
        return Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateType, that.templateType)
            && Objects.equals(this.templateDescription, that.templateDescription)
            && Objects.equals(this.templateBody, that.templateBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, templateType, templateDescription, templateBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplateRequestBody {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    templateDescription: ").append(toIndentedString(templateDescription)).append("\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
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
