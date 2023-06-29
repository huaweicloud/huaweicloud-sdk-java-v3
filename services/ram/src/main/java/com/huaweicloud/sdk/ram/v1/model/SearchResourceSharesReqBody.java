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
 * The request body of the SearchResourceShares operation.
 */
public class SearchResourceSharesReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_id")

    private String permissionId;

    /**
     * 检索您创建的或共享给您的（self或者other-accounts）资源共享实例。
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
    @JsonProperty(value = "resource_share_status")

    private String resourceShareStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_filters")

    private List<TagFilter> tagFilters = null;

    public SearchResourceSharesReqBody withLimit(Integer limit) {
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

    public SearchResourceSharesReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源共享实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchResourceSharesReqBody withMarker(String marker) {
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

    public SearchResourceSharesReqBody withPermissionId(String permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    /**
     * 权限ID。
     * @return permissionId
     */
    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public SearchResourceSharesReqBody withResourceOwner(ResourceOwnerEnum resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }

    /**
     * 检索您创建的或共享给您的（self或者other-accounts）资源共享实例。
     * @return resourceOwner
     */
    public ResourceOwnerEnum getResourceOwner() {
        return resourceOwner;
    }

    public void setResourceOwner(ResourceOwnerEnum resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    public SearchResourceSharesReqBody withResourceShareIds(List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }

    public SearchResourceSharesReqBody addResourceShareIdsItem(String resourceShareIdsItem) {
        if (this.resourceShareIds == null) {
            this.resourceShareIds = new ArrayList<>();
        }
        this.resourceShareIds.add(resourceShareIdsItem);
        return this;
    }

    public SearchResourceSharesReqBody withResourceShareIds(Consumer<List<String>> resourceShareIdsSetter) {
        if (this.resourceShareIds == null) {
            this.resourceShareIds = new ArrayList<>();
        }
        resourceShareIdsSetter.accept(this.resourceShareIds);
        return this;
    }

    /**
     * 资源共享实例的ID列表。
     * @return resourceShareIds
     */
    public List<String> getResourceShareIds() {
        return resourceShareIds;
    }

    public void setResourceShareIds(List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
    }

    public SearchResourceSharesReqBody withResourceShareStatus(String resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus;
        return this;
    }

    /**
     * 资源共享实例的状态。
     * @return resourceShareStatus
     */
    public String getResourceShareStatus() {
        return resourceShareStatus;
    }

    public void setResourceShareStatus(String resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus;
    }

    public SearchResourceSharesReqBody withTagFilters(List<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    public SearchResourceSharesReqBody addTagFiltersItem(TagFilter tagFiltersItem) {
        if (this.tagFilters == null) {
            this.tagFilters = new ArrayList<>();
        }
        this.tagFilters.add(tagFiltersItem);
        return this;
    }

    public SearchResourceSharesReqBody withTagFilters(Consumer<List<TagFilter>> tagFiltersSetter) {
        if (this.tagFilters == null) {
            this.tagFilters = new ArrayList<>();
        }
        tagFiltersSetter.accept(this.tagFilters);
        return this;
    }

    /**
     * 资源共享实例的标签。
     * @return tagFilters
     */
    public List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    public void setTagFilters(List<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchResourceSharesReqBody that = (SearchResourceSharesReqBody) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.name, that.name)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.permissionId, that.permissionId)
            && Objects.equals(this.resourceOwner, that.resourceOwner)
            && Objects.equals(this.resourceShareIds, that.resourceShareIds)
            && Objects.equals(this.resourceShareStatus, that.resourceShareStatus)
            && Objects.equals(this.tagFilters, that.tagFilters);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(limit, name, marker, permissionId, resourceOwner, resourceShareIds, resourceShareStatus, tagFilters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResourceSharesReqBody {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
        sb.append("    resourceOwner: ").append(toIndentedString(resourceOwner)).append("\n");
        sb.append("    resourceShareIds: ").append(toIndentedString(resourceShareIds)).append("\n");
        sb.append("    resourceShareStatus: ").append(toIndentedString(resourceShareStatus)).append("\n");
        sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
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
