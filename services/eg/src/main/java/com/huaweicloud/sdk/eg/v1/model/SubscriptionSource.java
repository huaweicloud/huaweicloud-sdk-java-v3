package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SubscriptionSource
 */
public class SubscriptionSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 订阅的事件源的提供方类型
     */
    public static final class ProviderTypeEnum {

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final ProviderTypeEnum CUSTOM = new ProviderTypeEnum("CUSTOM");

        /**
         * Enum OFFICIAL for value: "OFFICIAL"
         */
        public static final ProviderTypeEnum OFFICIAL = new ProviderTypeEnum("OFFICIAL");

        private static final Map<String, ProviderTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderTypeEnum> createStaticFields() {
            Map<String, ProviderTypeEnum> map = new HashMap<>();
            map.put("CUSTOM", CUSTOM);
            map.put("OFFICIAL", OFFICIAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderTypeEnum(String value) {
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
        public static ProviderTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProviderTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProviderTypeEnum(value);
            }
            return result;
        }

        public static ProviderTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProviderTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderTypeEnum) {
                return this.value.equals(((ProviderTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private ProviderTypeEnum providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private Object detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private Object filter;

    public SubscriptionSource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅源ID，需保证全局唯一。指定ID的订阅源存在时则进行更新，否则进行创建；未指定时由系统自动生成。  由小写字母、数字、中划线组成，必须字母或数字开头，长度为32~64字符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubscriptionSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 订阅的事件源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubscriptionSource withProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 订阅的事件源的提供方类型
     * @return providerType
     */
    public ProviderTypeEnum getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
    }

    public SubscriptionSource withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 订阅的事件源参数列表，该字段序列化后总长度不超过1024字节。
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public SubscriptionSource withFilter(Object filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 订阅事件源的匹配过滤规则，该字段序列化后总长度不超过2048字节。
     * @return filter
     */
    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionSource subscriptionSource = (SubscriptionSource) o;
        return Objects.equals(this.id, subscriptionSource.id) && Objects.equals(this.name, subscriptionSource.name)
            && Objects.equals(this.providerType, subscriptionSource.providerType)
            && Objects.equals(this.detail, subscriptionSource.detail)
            && Objects.equals(this.filter, subscriptionSource.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, providerType, detail, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionSource {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
