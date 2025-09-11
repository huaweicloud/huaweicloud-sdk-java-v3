package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListComponentInfosRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 组件类型，过滤拿到需要的组件类型的组件信息，默认为ALL，传参数会查询对应组件信息。 枚举值：   \"ALL\": 查询所有组件类型。   \"CN\": 查询CN组件类型。   \"DN\": 查询DN组件类型。   \"CM\": 查询CMS组件类型。   \"GTM\": 查询GTM组件类型。   \"ETCD\": 查询ETCD组件类型。
     */
    public static final class ComponentTypeEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final ComponentTypeEnum ALL = new ComponentTypeEnum("ALL");

        /**
         * Enum CN for value: "CN"
         */
        public static final ComponentTypeEnum CN = new ComponentTypeEnum("CN");

        /**
         * Enum DN for value: "DN"
         */
        public static final ComponentTypeEnum DN = new ComponentTypeEnum("DN");

        /**
         * Enum CM for value: "CM"
         */
        public static final ComponentTypeEnum CM = new ComponentTypeEnum("CM");

        /**
         * Enum GTM for value: "GTM"
         */
        public static final ComponentTypeEnum GTM = new ComponentTypeEnum("GTM");

        /**
         * Enum ETCD for value: "ETCD"
         */
        public static final ComponentTypeEnum ETCD = new ComponentTypeEnum("ETCD");

        private static final Map<String, ComponentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ComponentTypeEnum> createStaticFields() {
            Map<String, ComponentTypeEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("CN", CN);
            map.put("DN", DN);
            map.put("CM", CM);
            map.put("GTM", GTM);
            map.put("ETCD", ETCD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ComponentTypeEnum(String value) {
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
        public static ComponentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComponentTypeEnum(value));
        }

        public static ComponentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ComponentTypeEnum) {
                return this.value.equals(((ComponentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_type")

    private ComponentTypeEnum componentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    public ListComponentInfosRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListComponentInfosRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID，此参数是用户创建实例的唯一标识。 **约束限制**: 不涉及。 **取值范围**: 只能由英文字母、数字组成，且长度为36个字符。 **默认取值**: 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListComponentInfosRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListComponentInfosRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。默认为100，不能为负数，最小值为1，最大值为100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListComponentInfosRequest withComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * 组件类型，过滤拿到需要的组件类型的组件信息，默认为ALL，传参数会查询对应组件信息。 枚举值：   \"ALL\": 查询所有组件类型。   \"CN\": 查询CN组件类型。   \"DN\": 查询DN组件类型。   \"CM\": 查询CMS组件类型。   \"GTM\": 查询GTM组件类型。   \"ETCD\": 查询ETCD组件类型。
     * @return componentType
     */
    public ComponentTypeEnum getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentTypeEnum componentType) {
        this.componentType = componentType;
    }

    public ListComponentInfosRequest withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 主组件所在可用区编号，筛选符合条件的组件，默认为ALL，查询实例所有可用区上的节点的组件信息。 当调用接口传入可用区编号时：   相对于DN组件，会查询出的DN分片中的主组件在该可用区上的这个分片的所有副本的组件信息。   相对于CN组件，CN组件没有主备关系，会查询出该可用区上的CN组件信息。   相对于其他组件，会查询该可用区上有没有某个组件类型的主组件，有则会返回该组件类型的所有组件信息，没有则不返回该组件类型的信息。
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListComponentInfosRequest that = (ListComponentInfosRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.componentType, that.componentType)
            && Objects.equals(this.availabilityZoneId, that.availabilityZoneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, instanceId, offset, limit, componentType, availabilityZoneId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListComponentInfosRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
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
