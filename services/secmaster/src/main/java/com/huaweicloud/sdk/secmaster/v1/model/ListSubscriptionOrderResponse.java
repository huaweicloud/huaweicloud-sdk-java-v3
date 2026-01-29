package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSubscriptionOrderResponse extends SdkResponse {

    /**
     * 租户当前的版本信息 BASIC(基础版)，STANDARD（标准版），PROFESSIONAL（专业版），NA（无版本），大小写不敏感
     */
    public static final class CsbVersionEnum {

        /**
         * Enum BASIC for value: "BASIC"
         */
        public static final CsbVersionEnum BASIC = new CsbVersionEnum("BASIC");

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final CsbVersionEnum STANDARD = new CsbVersionEnum("STANDARD");

        /**
         * Enum PROFESSIONAL for value: "PROFESSIONAL"
         */
        public static final CsbVersionEnum PROFESSIONAL = new CsbVersionEnum("PROFESSIONAL");

        /**
         * Enum NA for value: "NA"
         */
        public static final CsbVersionEnum NA = new CsbVersionEnum("NA");

        private static final Map<String, CsbVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CsbVersionEnum> createStaticFields() {
            Map<String, CsbVersionEnum> map = new HashMap<>();
            map.put("BASIC", BASIC);
            map.put("STANDARD", STANDARD);
            map.put("PROFESSIONAL", PROFESSIONAL);
            map.put("NA", NA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CsbVersionEnum(String value) {
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
        public static CsbVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CsbVersionEnum(value));
        }

        public static CsbVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CsbVersionEnum) {
                return this.value.equals(((CsbVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csb_version")

    private CsbVersionEnum csbVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_count")

    private Integer ecsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<SubscriptionResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_count")

    private Integer subscriptionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    private List<SmnSubscription> subscriptions = null;

    public ListSubscriptionOrderResponse withCsbVersion(CsbVersionEnum csbVersion) {
        this.csbVersion = csbVersion;
        return this;
    }

    /**
     * 租户当前的版本信息 BASIC(基础版)，STANDARD（标准版），PROFESSIONAL（专业版），NA（无版本），大小写不敏感
     * @return csbVersion
     */
    public CsbVersionEnum getCsbVersion() {
        return csbVersion;
    }

    public void setCsbVersion(CsbVersionEnum csbVersion) {
        this.csbVersion = csbVersion;
    }

    public ListSubscriptionOrderResponse withEcsCount(Integer ecsCount) {
        this.ecsCount = ecsCount;
        return this;
    }

    /**
     * ecs个数，当请求参数purchase=true时才会返回该值，否则为0
     * minimum: 0
     * maximum: 10000
     * @return ecsCount
     */
    public Integer getEcsCount() {
        return ecsCount;
    }

    public void setEcsCount(Integer ecsCount) {
        this.ecsCount = ecsCount;
    }

    public ListSubscriptionOrderResponse withResources(List<SubscriptionResource> resources) {
        this.resources = resources;
        return this;
    }

    public ListSubscriptionOrderResponse addResourcesItem(SubscriptionResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListSubscriptionOrderResponse withResources(Consumer<List<SubscriptionResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表
     * @return resources
     */
    public List<SubscriptionResource> getResources() {
        return resources;
    }

    public void setResources(List<SubscriptionResource> resources) {
        this.resources = resources;
    }

    public ListSubscriptionOrderResponse withSubscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
        return this;
    }

    /**
     * topic订阅条数，当请求参数为smn=true，返回该字段
     * minimum: 0
     * maximum: 1000
     * @return subscriptionCount
     */
    public Integer getSubscriptionCount() {
        return subscriptionCount;
    }

    public void setSubscriptionCount(Integer subscriptionCount) {
        this.subscriptionCount = subscriptionCount;
    }

    public ListSubscriptionOrderResponse withSubscriptions(List<SmnSubscription> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public ListSubscriptionOrderResponse addSubscriptionsItem(SmnSubscription subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public ListSubscriptionOrderResponse withSubscriptions(Consumer<List<SmnSubscription>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * 租户订阅信息，当请求参数为smn=true，会返回租户名下可订阅的smn topic列表
     * @return subscriptions
     */
    public List<SmnSubscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<SmnSubscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubscriptionOrderResponse that = (ListSubscriptionOrderResponse) obj;
        return Objects.equals(this.csbVersion, that.csbVersion) && Objects.equals(this.ecsCount, that.ecsCount)
            && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.subscriptionCount, that.subscriptionCount)
            && Objects.equals(this.subscriptions, that.subscriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csbVersion, ecsCount, resources, subscriptionCount, subscriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionOrderResponse {\n");
        sb.append("    csbVersion: ").append(toIndentedString(csbVersion)).append("\n");
        sb.append("    ecsCount: ").append(toIndentedString(ecsCount)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    subscriptionCount: ").append(toIndentedString(subscriptionCount)).append("\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
