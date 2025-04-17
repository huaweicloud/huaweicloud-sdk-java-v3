package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAlarmTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim_name")

    private String dimName;

    /**
     * 模板类型(system代表默认指标模板，custom代表自定义指标模板，system_event代表默认事件模板，custom_event代表自定义事件模板，system_custom_event代表全部事件模板),不传返回全部指标模板
     */
    public static final class TemplateTypeEnum {

        /**
         * Enum SYSTEM for value: "system"
         */
        public static final TemplateTypeEnum SYSTEM = new TemplateTypeEnum("system");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final TemplateTypeEnum CUSTOM = new TemplateTypeEnum("custom");

        /**
         * Enum SYSTEM_EVENT for value: "system_event"
         */
        public static final TemplateTypeEnum SYSTEM_EVENT = new TemplateTypeEnum("system_event");

        /**
         * Enum CUSTOM_EVENT for value: "custom_event"
         */
        public static final TemplateTypeEnum CUSTOM_EVENT = new TemplateTypeEnum("custom_event");

        /**
         * Enum SYSTEM_CUSTOM_EVENT for value: "system_custom_event"
         */
        public static final TemplateTypeEnum SYSTEM_CUSTOM_EVENT = new TemplateTypeEnum("system_custom_event");

        private static final Map<String, TemplateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TemplateTypeEnum> createStaticFields() {
            Map<String, TemplateTypeEnum> map = new HashMap<>();
            map.put("system", SYSTEM);
            map.put("custom", CUSTOM);
            map.put("system_event", SYSTEM_EVENT);
            map.put("custom_event", CUSTOM_EVENT);
            map.put("system_custom_event", SYSTEM_CUSTOM_EVENT);
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
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    public ListAlarmTemplatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询时查询的起始位置，表示从第几条数据开始，默认为0
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAlarmTemplatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询结果条数的限制值，取值范围为[1,100]，默认值为100
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAlarmTemplatesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListAlarmTemplatesRequest withDimName(String dimName) {
        this.dimName = dimName;
        return this;
    }

    /**
     * 资源维度，必须以字母开头，多维度用\",\"分割，只能包含0-9/a-z/A-Z/_/-，每个维度的最大长度为32
     * @return dimName
     */
    public String getDimName() {
        return dimName;
    }

    public void setDimName(String dimName) {
        this.dimName = dimName;
    }

    public ListAlarmTemplatesRequest withTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 模板类型(system代表默认指标模板，custom代表自定义指标模板，system_event代表默认事件模板，custom_event代表自定义事件模板，system_custom_event代表全部事件模板),不传返回全部指标模板
     * @return templateType
     */
    public TemplateTypeEnum getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateTypeEnum templateType) {
        this.templateType = templateType;
    }

    public ListAlarmTemplatesRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 告警模板的名称，以字母或汉字开头，可包含字母、数字、汉字、_、-，长度范围[1,128]，支持模糊匹配
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ListAlarmTemplatesRequest withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 支持按照产品名称粒度进行查询告警模板，产品名称一般由\"服务命名空间,服务首层维度名称\"组成，如\"SYS.ECS,instance_id\"
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmTemplatesRequest that = (ListAlarmTemplatesRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.dimName, that.dimName)
            && Objects.equals(this.templateType, that.templateType)
            && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, namespace, dimName, templateType, templateName, productName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmTemplatesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimName: ").append(toIndentedString(dimName)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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
