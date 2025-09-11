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
public class ListAlarmRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    /**
     * **参数解释**： 产品层级跨维规则查询时支持规则所属类型查询，resource_level取值为product即为云产品类型，不填或者取值为dimension则为子维度类型。           **约束限制**： 不涉及。 **取值范围**： 枚举值。 - product：云产品。 - dimension：子维度。 **默认取值**： 不涉及。 
     */
    public static final class ResourceLevelEnum {

        /**
         * Enum PRODUCT for value: "product"
         */
        public static final ResourceLevelEnum PRODUCT = new ResourceLevelEnum("product");

        /**
         * Enum DIMENSION for value: "dimension"
         */
        public static final ResourceLevelEnum DIMENSION = new ResourceLevelEnum("dimension");

        private static final Map<String, ResourceLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceLevelEnum> createStaticFields() {
            Map<String, ResourceLevelEnum> map = new HashMap<>();
            map.put("product", PRODUCT);
            map.put("dimension", DIMENSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceLevelEnum(String value) {
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
        public static ResourceLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceLevelEnum(value));
        }

        public static ResourceLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceLevelEnum) {
                return this.value.equals(((ResourceLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level")

    private ResourceLevelEnum resourceLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAlarmRulesRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释**： 告警规则ID。 **约束限制**： 不涉及。 **取值范围**： 以al开头，后跟22位的字母或数字。          **默认取值**： 不涉及。 
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public ListAlarmRulesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 告警名称。 **约束限制**： 不涉及。 **取值范围**： 只能包含0-9/a-z/A-Z/_/-或汉字，长度为[1,128]个字符。          **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAlarmRulesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)”。 **约束限制**： 不涉及。 **取值范围**： 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度在 0 到 32个字符之间。           **默认取值**： 不涉及。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListAlarmRulesRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释**： 告警资源ID。 **约束限制**： 不涉及。 **取值范围**： 多维度情况按字母升序排列并使用逗号分隔。 长度为[0,700]个字符。        **默认取值**： 不涉及。 
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListAlarmRulesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID。 **约束限制**： 不涉及。 **取值范围**： 只能包含小写字母、数字、“-”、“_”，可以自定义企业项目ID，长度为36个字符。也可以为0（代表默认企业项目ID），all_granted_eps（代表所有企业项目ID）。           **默认取值**： 不涉及。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListAlarmRulesRequest withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * **参数解释**： 产品层级跨维规则查询时支持产品名称查询，一般由\"服务命名空间,服务首层维度名称\"组成，如\"SYS.ECS,instance_id\"。 **约束限制**： 不涉及。 **取值范围**： 长度为[0,128]个字符。        **默认取值**： 不涉及。 
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ListAlarmRulesRequest withResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    /**
     * **参数解释**： 产品层级跨维规则查询时支持规则所属类型查询，resource_level取值为product即为云产品类型，不填或者取值为dimension则为子维度类型。           **约束限制**： 不涉及。 **取值范围**： 枚举值。 - product：云产品。 - dimension：子维度。 **默认取值**： 不涉及。 
     * @return resourceLevel
     */
    public ResourceLevelEnum getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public ListAlarmRulesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 分页偏移量。 **约束限制**： 不涉及。 **取值范围**： [0,10000]           **默认取值**： 0 
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

    public ListAlarmRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 分页大小。 **约束限制**： 不涉及。 **取值范围**： [1,100]           **默认取值**： 10 
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmRulesRequest that = (ListAlarmRulesRequest) obj;
        return Objects.equals(this.alarmId, that.alarmId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.resourceLevel, that.resourceLevel) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(alarmId, name, namespace, resourceId, enterpriseProjectId, productName, resourceLevel, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmRulesRequest {\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
