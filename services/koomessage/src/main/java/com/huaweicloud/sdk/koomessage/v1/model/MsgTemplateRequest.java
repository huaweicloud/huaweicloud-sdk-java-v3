package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建短信模板请求体。
 */
public class MsgTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_id")

    private String signatureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_content")

    private String templateContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_desc")

    private String templateDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    /**
     * 模板类型。默认取所属签名的签名类型。PROMOTION_TYPE：营销类，NOTIFY_TYPE：通知类。
     */
    public static final class TemplateTypeEnum {

        /**
         * Enum PROMOTION_TYPE for value: "PROMOTION_TYPE"
         */
        public static final TemplateTypeEnum PROMOTION_TYPE = new TemplateTypeEnum("PROMOTION_TYPE");

        /**
         * Enum NOTIFY_TYPE for value: "NOTIFY_TYPE"
         */
        public static final TemplateTypeEnum NOTIFY_TYPE = new TemplateTypeEnum("NOTIFY_TYPE");

        private static final Map<String, TemplateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TemplateTypeEnum> createStaticFields() {
            Map<String, TemplateTypeEnum> map = new HashMap<>();
            map.put("PROMOTION_TYPE", PROMOTION_TYPE);
            map.put("NOTIFY_TYPE", NOTIFY_TYPE);
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

    /**
     * 是否为通用模板(暂不支持通用模板)。0：非通用模板，1：通用模板。
     */
    public static final class UniversalTemplateEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final UniversalTemplateEnum _0 = new UniversalTemplateEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final UniversalTemplateEnum _1 = new UniversalTemplateEnum("1");

        private static final Map<String, UniversalTemplateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UniversalTemplateEnum> createStaticFields() {
            Map<String, UniversalTemplateEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UniversalTemplateEnum(String value) {
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
        public static UniversalTemplateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UniversalTemplateEnum(value));
        }

        public static UniversalTemplateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UniversalTemplateEnum) {
                return this.value.equals(((UniversalTemplateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "universal_template")

    private UniversalTemplateEnum universalTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_attributes")

    private List<VariableAttributes> variableAttributes = null;

    public MsgTemplateRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID，默认取签名所属的应用ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public MsgTemplateRequest withSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }

    /**
     * 签名ID。
     * @return signatureId
     */
    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    public MsgTemplateRequest withTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }

    /**
     * 模板内容。
     * @return templateContent
     */
    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public MsgTemplateRequest withTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
        return this;
    }

    /**
     * 模板描述。
     * @return templateDesc
     */
    public String getTemplateDesc() {
        return templateDesc;
    }

    public void setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc;
    }

    public MsgTemplateRequest withTemplateName(String templateName) {
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

    public MsgTemplateRequest withTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 模板类型。默认取所属签名的签名类型。PROMOTION_TYPE：营销类，NOTIFY_TYPE：通知类。
     * @return templateType
     */
    public TemplateTypeEnum getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
    }

    public MsgTemplateRequest withUniversalTemplate(UniversalTemplateEnum universalTemplate) {
        this.universalTemplate = universalTemplate;
        return this;
    }

    /**
     * 是否为通用模板(暂不支持通用模板)。0：非通用模板，1：通用模板。
     * @return universalTemplate
     */
    public UniversalTemplateEnum getUniversalTemplate() {
        return universalTemplate;
    }

    public void setUniversalTemplate(UniversalTemplateEnum universalTemplate) {
        this.universalTemplate = universalTemplate;
    }

    public MsgTemplateRequest withVariableAttributes(List<VariableAttributes> variableAttributes) {
        this.variableAttributes = variableAttributes;
        return this;
    }

    public MsgTemplateRequest addVariableAttributesItem(VariableAttributes variableAttributesItem) {
        if (this.variableAttributes == null) {
            this.variableAttributes = new ArrayList<>();
        }
        this.variableAttributes.add(variableAttributesItem);
        return this;
    }

    public MsgTemplateRequest withVariableAttributes(Consumer<List<VariableAttributes>> variableAttributesSetter) {
        if (this.variableAttributes == null) {
            this.variableAttributes = new ArrayList<>();
        }
        variableAttributesSetter.accept(this.variableAttributes);
        return this;
    }

    /**
     * 模板参数。
     * @return variableAttributes
     */
    public List<VariableAttributes> getVariableAttributes() {
        return variableAttributes;
    }

    public void setVariableAttributes(List<VariableAttributes> variableAttributes) {
        this.variableAttributes = variableAttributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MsgTemplateRequest that = (MsgTemplateRequest) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.signatureId, that.signatureId)
            && Objects.equals(this.templateContent, that.templateContent)
            && Objects.equals(this.templateDesc, that.templateDesc)
            && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateType, that.templateType)
            && Objects.equals(this.universalTemplate, that.universalTemplate)
            && Objects.equals(this.variableAttributes, that.variableAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId,
            signatureId,
            templateContent,
            templateDesc,
            templateName,
            templateType,
            universalTemplate,
            variableAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MsgTemplateRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    signatureId: ").append(toIndentedString(signatureId)).append("\n");
        sb.append("    templateContent: ").append(toIndentedString(templateContent)).append("\n");
        sb.append("    templateDesc: ").append(toIndentedString(templateDesc)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    universalTemplate: ").append(toIndentedString(universalTemplate)).append("\n");
        sb.append("    variableAttributes: ").append(toIndentedString(variableAttributes)).append("\n");
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
