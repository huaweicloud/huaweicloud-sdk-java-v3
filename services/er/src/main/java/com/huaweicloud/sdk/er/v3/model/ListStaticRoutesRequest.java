package com.huaweicloud.sdk.er.v3.model;

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
 * Request Object
 */
public class ListStaticRoutesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table_id")

    private String routeTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private List<String> destination = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private List<String> attachmentId = null;

    /**
    * Gets or Sets resourceType
    */
    public static final class ResourceTypeEnum {

        /**
         * Enum VPC for value: "vpc"
         */
        public static final ResourceTypeEnum VPC = new ResourceTypeEnum("vpc");

        /**
         * Enum VPN for value: "vpn"
         */
        public static final ResourceTypeEnum VPN = new ResourceTypeEnum("vpn");

        /**
         * Enum DGW for value: "dgw"
         */
        public static final ResourceTypeEnum DGW = new ResourceTypeEnum("dgw");

        /**
         * Enum VGW for value: "vgw"
         */
        public static final ResourceTypeEnum VGW = new ResourceTypeEnum("vgw");

        /**
         * Enum PEERING for value: "peering"
         */
        public static final ResourceTypeEnum PEERING = new ResourceTypeEnum("peering");

        /**
         * Enum CAN for value: "can"
         */
        public static final ResourceTypeEnum CAN = new ResourceTypeEnum("can");

        /**
         * Enum GDGW for value: "gdgw"
         */
        public static final ResourceTypeEnum GDGW = new ResourceTypeEnum("gdgw");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("vpn", VPN);
            map.put("dgw", DGW);
            map.put("vgw", VGW);
            map.put("peering", PEERING);
            map.put("can", CAN);
            map.put("gdgw", GDGW);
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

    private List<ResourceTypeEnum> resourceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private List<String> sortKey = null;

    /**
    * Gets or Sets sortDir
    */
    public static final class SortDirEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private List<SortDirEnum> sortDir = null;

    public ListStaticRoutesRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * 路由表ID
     * @return routeTableId
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public ListStaticRoutesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：0~2000。
     * minimum: 0
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListStaticRoutesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 上一页最后一条记录的企业路由器实例的id，为空时为查询第一页。 使用说明：必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListStaticRoutesRequest withDestination(List<String> destination) {
        this.destination = destination;
        return this;
    }

    public ListStaticRoutesRequest addDestinationItem(String destinationItem) {
        if (this.destination == null) {
            this.destination = new ArrayList<>();
        }
        this.destination.add(destinationItem);
        return this;
    }

    public ListStaticRoutesRequest withDestination(Consumer<List<String>> destinationSetter) {
        if (this.destination == null) {
            this.destination = new ArrayList<>();
        }
        destinationSetter.accept(this.destination);
        return this;
    }

    /**
     * 路由目的地址
     * @return destination
     */
    public List<String> getDestination() {
        return destination;
    }

    public void setDestination(List<String> destination) {
        this.destination = destination;
    }

    public ListStaticRoutesRequest withAttachmentId(List<String> attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    public ListStaticRoutesRequest addAttachmentIdItem(String attachmentIdItem) {
        if (this.attachmentId == null) {
            this.attachmentId = new ArrayList<>();
        }
        this.attachmentId.add(attachmentIdItem);
        return this;
    }

    public ListStaticRoutesRequest withAttachmentId(Consumer<List<String>> attachmentIdSetter) {
        if (this.attachmentId == null) {
            this.attachmentId = new ArrayList<>();
        }
        attachmentIdSetter.accept(this.attachmentId);
        return this;
    }

    /**
     * 连接ID
     * @return attachmentId
     */
    public List<String> getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(List<String> attachmentId) {
        this.attachmentId = attachmentId;
    }

    public ListStaticRoutesRequest withResourceType(List<ResourceTypeEnum> resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public ListStaticRoutesRequest addResourceTypeItem(ResourceTypeEnum resourceTypeItem) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        this.resourceType.add(resourceTypeItem);
        return this;
    }

    public ListStaticRoutesRequest withResourceType(Consumer<List<ResourceTypeEnum>> resourceTypeSetter) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        resourceTypeSetter.accept(this.resourceType);
        return this;
    }

    /**
     * 连接资源类型:vpc|vpn|vgw|peering
     * @return resourceType
     */
    public List<ResourceTypeEnum> getResourceType() {
        return resourceType;
    }

    public void setResourceType(List<ResourceTypeEnum> resourceType) {
        this.resourceType = resourceType;
    }

    public ListStaticRoutesRequest withSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListStaticRoutesRequest addSortKeyItem(String sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListStaticRoutesRequest withSortKey(Consumer<List<String>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    /**
     * 按关键字排序，默认按照id排序，可选值:id|name|state
     * @return sortKey
     */
    public List<String> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
    }

    public ListStaticRoutesRequest withSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListStaticRoutesRequest addSortDirItem(SortDirEnum sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListStaticRoutesRequest withSortDir(Consumer<List<SortDirEnum>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 返回结果按照升序或降序排列，默认为asc,降序为desc
     * @return sortDir
     */
    public List<SortDirEnum> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<SortDirEnum> sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStaticRoutesRequest listStaticRoutesRequest = (ListStaticRoutesRequest) o;
        return Objects.equals(this.routeTableId, listStaticRoutesRequest.routeTableId)
            && Objects.equals(this.limit, listStaticRoutesRequest.limit)
            && Objects.equals(this.marker, listStaticRoutesRequest.marker)
            && Objects.equals(this.destination, listStaticRoutesRequest.destination)
            && Objects.equals(this.attachmentId, listStaticRoutesRequest.attachmentId)
            && Objects.equals(this.resourceType, listStaticRoutesRequest.resourceType)
            && Objects.equals(this.sortKey, listStaticRoutesRequest.sortKey)
            && Objects.equals(this.sortDir, listStaticRoutesRequest.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeTableId, limit, marker, destination, attachmentId, resourceType, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStaticRoutesRequest {\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
