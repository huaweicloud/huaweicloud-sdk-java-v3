package com.huaweicloud.sdk.ram.v1.model;

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
 * The request body of the SearchSharedResources operation.
 */
public class SearchSharedResourcesReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal")

    private String principal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_urns")

    private List<String> resourceUrns = null;

    /**
     * 指定资源共享实例的所有者（self或者other-accounts）。
     */
    public static final class ResourceOwnerEnum {

        /**
         * Enum SELF for value: "self"
         */
        public static final ResourceOwnerEnum SELF = new ResourceOwnerEnum("self");

        /**
         * Enum OTHER_ACCOUNTS for value: "other-accounts"
         */
        public static final ResourceOwnerEnum OTHER_ACCOUNTS = new ResourceOwnerEnum("other-accounts");

        private static final Map<String, ResourceOwnerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceOwnerEnum> createStaticFields() {
            Map<String, ResourceOwnerEnum> map = new HashMap<>();
            map.put("self", SELF);
            map.put("other-accounts", OTHER_ACCOUNTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceOwnerEnum(String value) {
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
        public static ResourceOwnerEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceOwnerEnum(value));
        }

        public static ResourceOwnerEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceOwnerEnum) {
                return this.value.equals(((ResourceOwnerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_owner")

    private ResourceOwnerEnum resourceOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_ids")

    private List<String> resourceShareIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_region")

    private String resourceRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    public SearchSharedResourcesReqBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页页面的最大值。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchSharedResourcesReqBody withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 页面标记。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public SearchSharedResourcesReqBody withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * 指定资源使用者。
     * @return principal
     */
    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public SearchSharedResourcesReqBody withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public SearchSharedResourcesReqBody addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public SearchSharedResourcesReqBody withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 指定资源ID列表。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public SearchSharedResourcesReqBody withResourceUrns(List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
        return this;
    }

    public SearchSharedResourcesReqBody addResourceUrnsItem(String resourceUrnsItem) {
        if (this.resourceUrns == null) {
            this.resourceUrns = new ArrayList<>();
        }
        this.resourceUrns.add(resourceUrnsItem);
        return this;
    }

    public SearchSharedResourcesReqBody withResourceUrns(Consumer<List<String>> resourceUrnsSetter) {
        if (this.resourceUrns == null) {
            this.resourceUrns = new ArrayList<>();
        }
        resourceUrnsSetter.accept(this.resourceUrns);
        return this;
    }

    /**
     * 指定资源URN的列表。
     * @return resourceUrns
     */
    public List<String> getResourceUrns() {
        return resourceUrns;
    }

    public void setResourceUrns(List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
    }

    public SearchSharedResourcesReqBody withResourceOwner(ResourceOwnerEnum resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }

    /**
     * 指定资源共享实例的所有者（self或者other-accounts）。
     * @return resourceOwner
     */
    public ResourceOwnerEnum getResourceOwner() {
        return resourceOwner;
    }

    public void setResourceOwner(ResourceOwnerEnum resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    public SearchSharedResourcesReqBody withResourceShareIds(List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }

    public SearchSharedResourcesReqBody addResourceShareIdsItem(String resourceShareIdsItem) {
        if (this.resourceShareIds == null) {
            this.resourceShareIds = new ArrayList<>();
        }
        this.resourceShareIds.add(resourceShareIdsItem);
        return this;
    }

    public SearchSharedResourcesReqBody withResourceShareIds(Consumer<List<String>> resourceShareIdsSetter) {
        if (this.resourceShareIds == null) {
            this.resourceShareIds = new ArrayList<>();
        }
        resourceShareIdsSetter.accept(this.resourceShareIds);
        return this;
    }

    /**
     * 指定资源共享实例的ID列表。
     * @return resourceShareIds
     */
    public List<String> getResourceShareIds() {
        return resourceShareIds;
    }

    public void setResourceShareIds(List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
    }

    public SearchSharedResourcesReqBody withResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
        return this;
    }

    /**
     * 资源所在的区域。
     * @return resourceRegion
     */
    public String getResourceRegion() {
        return resourceRegion;
    }

    public void setResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
    }

    public SearchSharedResourcesReqBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 指定资源类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchSharedResourcesReqBody that = (SearchSharedResourcesReqBody) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.principal, that.principal) && Objects.equals(this.resourceIds, that.resourceIds)
            && Objects.equals(this.resourceUrns, that.resourceUrns)
            && Objects.equals(this.resourceOwner, that.resourceOwner)
            && Objects.equals(this.resourceShareIds, that.resourceShareIds)
            && Objects.equals(this.resourceRegion, that.resourceRegion)
            && Objects.equals(this.resourceType, that.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            principal,
            resourceIds,
            resourceUrns,
            resourceOwner,
            resourceShareIds,
            resourceRegion,
            resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchSharedResourcesReqBody {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    resourceUrns: ").append(toIndentedString(resourceUrns)).append("\n");
        sb.append("    resourceOwner: ").append(toIndentedString(resourceOwner)).append("\n");
        sb.append("    resourceShareIds: ").append(toIndentedString(resourceShareIds)).append("\n");
        sb.append("    resourceRegion: ").append(toIndentedString(resourceRegion)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
