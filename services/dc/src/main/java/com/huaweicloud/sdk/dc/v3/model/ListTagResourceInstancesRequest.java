package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTagResourceInstancesRequest {

    /**
     * - 专线服务资源类型，包括dc-directconnect/dc-vgw/dc-vif - dc-directconnect: 专线物理连接 - dc-vgw： 虚拟网关 - dc-vif： 虚拟接口
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum DC_DIRECTCONNECT for value: "dc-directconnect"
         */
        public static final ResourceTypeEnum DC_DIRECTCONNECT = new ResourceTypeEnum("dc-directconnect");

        /**
         * Enum DC_VGW for value: "dc-vgw"
         */
        public static final ResourceTypeEnum DC_VGW = new ResourceTypeEnum("dc-vgw");

        /**
         * Enum DC_VIF for value: "dc-vif"
         */
        public static final ResourceTypeEnum DC_VIF = new ResourceTypeEnum("dc-vif");

        /**
         * Enum DC_LAG for value: "dc-lag"
         */
        public static final ResourceTypeEnum DC_LAG = new ResourceTypeEnum("dc-lag");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("dc-directconnect", DC_DIRECTCONNECT);
            map.put("dc-vgw", DC_VGW);
            map.put("dc-vif", DC_VIF);
            map.put("dc-lag", DC_LAG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListTagResourceInstancesRequestBody body;

    public ListTagResourceInstancesRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * - 专线服务资源类型，包括dc-directconnect/dc-vgw/dc-vif - dc-directconnect: 专线物理连接 - dc-vgw： 虚拟网关 - dc-vif： 虚拟接口
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ListTagResourceInstancesRequest withBody(ListTagResourceInstancesRequestBody body) {
        this.body = body;
        return this;
    }

    public ListTagResourceInstancesRequest withBody(Consumer<ListTagResourceInstancesRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListTagResourceInstancesRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListTagResourceInstancesRequestBody getBody() {
        return body;
    }

    public void setBody(ListTagResourceInstancesRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTagResourceInstancesRequest listTagResourceInstancesRequest = (ListTagResourceInstancesRequest) o;
        return Objects.equals(this.resourceType, listTagResourceInstancesRequest.resourceType)
            && Objects.equals(this.body, listTagResourceInstancesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagResourceInstancesRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
