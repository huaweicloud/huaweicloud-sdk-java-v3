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
 * The request body of the SearchResourceShareAssociations operation.
 */
public class SearchResourceShareAssociationsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_status")

    private String associationStatus;

    /**
     * 指定绑定的类型（principal或resource）。
     */
    public static final class AssociationTypeEnum {

        /**
         * Enum PRINCIPAL for value: "principal"
         */
        public static final AssociationTypeEnum PRINCIPAL = new AssociationTypeEnum("principal");

        /**
         * Enum RESOURCE for value: "resource"
         */
        public static final AssociationTypeEnum RESOURCE = new AssociationTypeEnum("resource");

        private static final Map<String, AssociationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssociationTypeEnum> createStaticFields() {
            Map<String, AssociationTypeEnum> map = new HashMap<>();
            map.put("principal", PRINCIPAL);
            map.put("resource", RESOURCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssociationTypeEnum(String value) {
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
        public static AssociationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssociationTypeEnum(value));
        }

        public static AssociationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssociationTypeEnum) {
                return this.value.equals(((AssociationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_type")

    private AssociationTypeEnum associationType;

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
    @JsonProperty(value = "resource_urn")

    private String resourceUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_ids")

    private List<String> resourceShareIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    public SearchResourceShareAssociationsReqBody withAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
        return this;
    }

    /**
     * 指定绑定的状态。
     * @return associationStatus
     */
    public String getAssociationStatus() {
        return associationStatus;
    }

    public void setAssociationStatus(String associationStatus) {
        this.associationStatus = associationStatus;
    }

    public SearchResourceShareAssociationsReqBody withAssociationType(AssociationTypeEnum associationType) {
        this.associationType = associationType;
        return this;
    }

    /**
     * 指定绑定的类型（principal或resource）。
     * @return associationType
     */
    public AssociationTypeEnum getAssociationType() {
        return associationType;
    }

    public void setAssociationType(AssociationTypeEnum associationType) {
        this.associationType = associationType;
    }

    public SearchResourceShareAssociationsReqBody withLimit(Integer limit) {
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

    public SearchResourceShareAssociationsReqBody withMarker(String marker) {
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

    public SearchResourceShareAssociationsReqBody withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * 指定绑定的资源使用者。
     * @return principal
     */
    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public SearchResourceShareAssociationsReqBody withResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
        return this;
    }

    /**
     * 指定绑定的共享资源URN。
     * @return resourceUrn
     */
    public String getResourceUrn() {
        return resourceUrn;
    }

    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public SearchResourceShareAssociationsReqBody withResourceShareIds(List<String> resourceShareIds) {
        this.resourceShareIds = resourceShareIds;
        return this;
    }

    public SearchResourceShareAssociationsReqBody addResourceShareIdsItem(String resourceShareIdsItem) {
        if (this.resourceShareIds == null) {
            this.resourceShareIds = new ArrayList<>();
        }
        this.resourceShareIds.add(resourceShareIdsItem);
        return this;
    }

    public SearchResourceShareAssociationsReqBody withResourceShareIds(Consumer<List<String>> resourceShareIdsSetter) {
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

    public SearchResourceShareAssociationsReqBody withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public SearchResourceShareAssociationsReqBody addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public SearchResourceShareAssociationsReqBody withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 指定共享资源ID列表。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchResourceShareAssociationsReqBody that = (SearchResourceShareAssociationsReqBody) obj;
        return Objects.equals(this.associationStatus, that.associationStatus)
            && Objects.equals(this.associationType, that.associationType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.principal, that.principal)
            && Objects.equals(this.resourceUrn, that.resourceUrn)
            && Objects.equals(this.resourceShareIds, that.resourceShareIds)
            && Objects.equals(this.resourceIds, that.resourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associationStatus,
            associationType,
            limit,
            marker,
            principal,
            resourceUrn,
            resourceShareIds,
            resourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResourceShareAssociationsReqBody {\n");
        sb.append("    associationStatus: ").append(toIndentedString(associationStatus)).append("\n");
        sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    resourceUrn: ").append(toIndentedString(resourceUrn)).append("\n");
        sb.append("    resourceShareIds: ").append(toIndentedString(resourceShareIds)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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
