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
 * The request body of the SearchSharedPrincipals operation.
 */
public class SearchSharedPrincipalsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principals")

    private List<String> principals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_urn")

    private String resourceUrn;

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
            ResourceOwnerEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceOwnerEnum(value);
            }
            return result;
        }

        public static ResourceOwnerEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceOwnerEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public SearchSharedPrincipalsReqBody withLimit(Integer limit) {
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

    public SearchSharedPrincipalsReqBody withMarker(String marker) {
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

    public SearchSharedPrincipalsReqBody withPrincipals(List<String> principals) {
        this.principals = principals;
        return this;
    }

    public SearchSharedPrincipalsReqBody addPrincipalsItem(String principalsItem) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        this.principals.add(principalsItem);
        return this;
    }

    public SearchSharedPrincipalsReqBody withPrincipals(Consumer<List<String>> principalsSetter) {
        if (this.principals == null) {
            this.principals = new ArrayList<>();
        }
        principalsSetter.accept(this.principals);
        return this;
    }

    /**
     * 指定资源使用者。
     * @return principals
     */
    public List<String> getPrincipals() {
        return principals;
    }

    public void setPrincipals(List<String> principals) {
        this.principals = principals;
    }

    public SearchSharedPrincipalsReqBody withResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
        return this;
    }

    /**
     * 指定资源的URN。
     * @return resourceUrn
     */
    public String getResourceUrn() {
        return resourceUrn;
    }

    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public SearchSharedPrincipalsReqBody withResourceOwner(ResourceOwnerEnum resourceOwner) {
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

    public SearchSharedPrincipalsReqBody withResourceShareIds(List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }

    public SearchSharedPrincipalsReqBody addResourceShareIdsItem(String resourceShareIdsItem) {
        if (this.resourceShareIds == null) {
            this.resourceShareIds = new ArrayList<>();
        }
        this.resourceShareIds.add(resourceShareIdsItem);
        return this;
    }

    public SearchSharedPrincipalsReqBody withResourceShareIds(Consumer<List<String>> resourceShareIdsSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchSharedPrincipalsReqBody searchSharedPrincipalsReqBody = (SearchSharedPrincipalsReqBody) o;
        return Objects.equals(this.limit, searchSharedPrincipalsReqBody.limit)
            && Objects.equals(this.marker, searchSharedPrincipalsReqBody.marker)
            && Objects.equals(this.principals, searchSharedPrincipalsReqBody.principals)
            && Objects.equals(this.resourceUrn, searchSharedPrincipalsReqBody.resourceUrn)
            && Objects.equals(this.resourceOwner, searchSharedPrincipalsReqBody.resourceOwner)
            && Objects.equals(this.resourceShareIds, searchSharedPrincipalsReqBody.resourceShareIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, principals, resourceUrn, resourceOwner, resourceShareIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchSharedPrincipalsReqBody {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    principals: ").append(toIndentedString(principals)).append("\n");
        sb.append("    resourceUrn: ").append(toIndentedString(resourceUrn)).append("\n");
        sb.append("    resourceOwner: ").append(toIndentedString(resourceOwner)).append("\n");
        sb.append("    resourceShareIds: ").append(toIndentedString(resourceShareIds)).append("\n");
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
