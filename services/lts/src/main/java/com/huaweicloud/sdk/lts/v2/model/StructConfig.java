package com.huaweicloud.sdk.lts.v2.model;

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

/** 结构化配置参数体 */
public class StructConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    /** 所用模板类型，分为built_in及custom两种类型，对应系统模板和自定义模板，系统模板分为CTS，VPC和ELB三种。 */
    public static final class TemplateTypeEnum {

        /** Enum BUILT_IN for value: "built_in" */
        public static final TemplateTypeEnum BUILT_IN = new TemplateTypeEnum("built_in");

        /** Enum CUSTOM for value: "custom" */
        public static final TemplateTypeEnum CUSTOM = new TemplateTypeEnum("custom");

        private static final Map<String, TemplateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TemplateTypeEnum> createStaticFields() {
            Map<String, TemplateTypeEnum> map = new HashMap<>();
            map.put("built_in", BUILT_IN);
            map.put("custom", CUSTOM);
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
            TemplateTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TemplateTypeEnum(value);
            }
            return result;
        }

        public static TemplateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TemplateTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "demo_fields")

    private List<FieldModel> demoFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_fields")

    private List<FieldModel> tagFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quick_analysis")

    private Boolean quickAnalysis;

    public StructConfig withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /** 日志组ID，获取方式请参见：获取账号ID、项目ID、日志组ID、日志流ID（https://support.huaweicloud.com/api-lts/lts_api_0006.html）。
     * 
     * @return logGroupId */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public StructConfig withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /** 日志流ID，获取方式请参见：获取账号ID、项目ID、日志组ID、日志流ID（https://support.huaweicloud.com/api-lts/lts_api_0006.html）。
     * 
     * @return logStreamId */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public StructConfig withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /** 所用模板id。当使用系统模板时，当前属性可以为空
     * 
     * @return templateId */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public StructConfig withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /** 所用模板名称，会对模板名称及id进行校验
     * 
     * @return templateName */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public StructConfig withTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
        return this;
    }

    /** 所用模板类型，分为built_in及custom两种类型，对应系统模板和自定义模板，系统模板分为CTS，VPC和ELB三种。
     * 
     * @return templateType */
    public TemplateTypeEnum getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
    }

    public StructConfig withDemoFields(List<FieldModel> demoFields) {
        this.demoFields = demoFields;
        return this;
    }

    public StructConfig addDemoFieldsItem(FieldModel demoFieldsItem) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        this.demoFields.add(demoFieldsItem);
        return this;
    }

    public StructConfig withDemoFields(Consumer<List<FieldModel>> demoFieldsSetter) {
        if (this.demoFields == null) {
            this.demoFields = new ArrayList<>();
        }
        demoFieldsSetter.accept(this.demoFields);
        return this;
    }

    /** 示例字段数组，只需要填写与模板中is_analysis状态不同的字段
     * 
     * @return demoFields */
    public List<FieldModel> getDemoFields() {
        return demoFields;
    }

    public void setDemoFields(List<FieldModel> demoFields) {
        this.demoFields = demoFields;
    }

    public StructConfig withTagFields(List<FieldModel> tagFields) {
        this.tagFields = tagFields;
        return this;
    }

    public StructConfig addTagFieldsItem(FieldModel tagFieldsItem) {
        if (this.tagFields == null) {
            this.tagFields = new ArrayList<>();
        }
        this.tagFields.add(tagFieldsItem);
        return this;
    }

    public StructConfig withTagFields(Consumer<List<FieldModel>> tagFieldsSetter) {
        if (this.tagFields == null) {
            this.tagFields = new ArrayList<>();
        }
        tagFieldsSetter.accept(this.tagFields);
        return this;
    }

    /** Tag字段数组，只需要填写与模板中is_analysis状态不同的字段
     * 
     * @return tagFields */
    public List<FieldModel> getTagFields() {
        return tagFields;
    }

    public void setTagFields(List<FieldModel> tagFields) {
        this.tagFields = tagFields;
    }

    public StructConfig withQuickAnalysis(Boolean quickAnalysis) {
        this.quickAnalysis = quickAnalysis;
        return this;
    }

    /** 是否开启demo_fields和tag_fields快速分析,为true时，所有的demo_fields和tag_fields全部字段均打开快速分析;不填或者为false，以模板中的demo_fields和tag_fields中的is_analysis决定是否开启快速分析。
     * 
     * @return quickAnalysis */
    public Boolean getQuickAnalysis() {
        return quickAnalysis;
    }

    public void setQuickAnalysis(Boolean quickAnalysis) {
        this.quickAnalysis = quickAnalysis;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StructConfig structConfig = (StructConfig) o;
        return Objects.equals(this.logGroupId, structConfig.logGroupId)
            && Objects.equals(this.logStreamId, structConfig.logStreamId)
            && Objects.equals(this.templateId, structConfig.templateId)
            && Objects.equals(this.templateName, structConfig.templateName)
            && Objects.equals(this.templateType, structConfig.templateType)
            && Objects.equals(this.demoFields, structConfig.demoFields)
            && Objects.equals(this.tagFields, structConfig.tagFields)
            && Objects.equals(this.quickAnalysis, structConfig.quickAnalysis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupId,
            logStreamId,
            templateId,
            templateName,
            templateType,
            demoFields,
            tagFields,
            quickAnalysis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructConfig {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    demoFields: ").append(toIndentedString(demoFields)).append("\n");
        sb.append("    tagFields: ").append(toIndentedString(tagFields)).append("\n");
        sb.append("    quickAnalysis: ").append(toIndentedString(quickAnalysis)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
