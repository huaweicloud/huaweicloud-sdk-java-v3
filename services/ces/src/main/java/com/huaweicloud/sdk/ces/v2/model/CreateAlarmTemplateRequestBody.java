package com.huaweicloud.sdk.ces.v2.model;

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
 * CreateAlarmTemplateRequestBody
 */
public class CreateAlarmTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_description")

    private String templateDescription;

    /**
     * 自定义告警模板类型 0：指标 2： 事件
     */
    public static final class TemplateTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final TemplateTypeEnum NUMBER_0 = new TemplateTypeEnum(0);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TemplateTypeEnum NUMBER_2 = new TemplateTypeEnum(2);

        private static final Map<Integer, TemplateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TemplateTypeEnum> createStaticFields() {
            Map<Integer, TemplateTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TemplateTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TemplateTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TemplateTypeEnum(value));
        }

        public static TemplateTypeEnum valueOf(Integer value) {
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
    @JsonProperty(value = "policies")

    private List<Policies> policies = null;

    public CreateAlarmTemplateRequestBody withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 告警模板的名称，以字母或汉字开头，可包含字母、数字、汉字、_、-，长度范围[1,128]
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public CreateAlarmTemplateRequestBody withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * 告警模板的描述，长度范围[0,256]，该字段默认值为空字符串
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public CreateAlarmTemplateRequestBody withTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 自定义告警模板类型 0：指标 2： 事件
     * @return templateType
     */
    public TemplateTypeEnum getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
    }

    public CreateAlarmTemplateRequestBody withPolicies(List<Policies> policies) {
        this.policies = policies;
        return this;
    }

    public CreateAlarmTemplateRequestBody addPoliciesItem(Policies policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public CreateAlarmTemplateRequestBody withPolicies(Consumer<List<Policies>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 告警模板策略列表
     * @return policies
     */
    public List<Policies> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policies> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAlarmTemplateRequestBody that = (CreateAlarmTemplateRequestBody) obj;
        return Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.templateDescription, that.templateDescription)
            && Objects.equals(this.templateType, that.templateType) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, templateDescription, templateType, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlarmTemplateRequestBody {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateDescription: ").append(toIndentedString(templateDescription)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
