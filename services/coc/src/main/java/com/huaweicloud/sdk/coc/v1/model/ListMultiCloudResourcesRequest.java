package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListMultiCloudResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_list")

    private List<String> resourceIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_list")

    private List<String> nameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id_list")

    private List<String> regionIdList = null;

    public ListMultiCloudResourcesRequest withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * 云厂商
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public ListMultiCloudResourcesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListMultiCloudResourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的返回数量
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListMultiCloudResourcesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListMultiCloudResourcesRequest withResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }

    public ListMultiCloudResourcesRequest addResourceIdListItem(String resourceIdListItem) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        this.resourceIdList.add(resourceIdListItem);
        return this;
    }

    public ListMultiCloudResourcesRequest withResourceIdList(Consumer<List<String>> resourceIdListSetter) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        resourceIdListSetter.accept(this.resourceIdList);
        return this;
    }

    /**
     * 资源id列表
     * @return resourceIdList
     */
    public List<String> getResourceIdList() {
        return resourceIdList;
    }

    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }

    public ListMultiCloudResourcesRequest withNameList(List<String> nameList) {
        this.nameList = nameList;
        return this;
    }

    public ListMultiCloudResourcesRequest addNameListItem(String nameListItem) {
        if (this.nameList == null) {
            this.nameList = new ArrayList<>();
        }
        this.nameList.add(nameListItem);
        return this;
    }

    public ListMultiCloudResourcesRequest withNameList(Consumer<List<String>> nameListSetter) {
        if (this.nameList == null) {
            this.nameList = new ArrayList<>();
        }
        nameListSetter.accept(this.nameList);
        return this;
    }

    /**
     * 资源名称
     * @return nameList
     */
    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public ListMultiCloudResourcesRequest withRegionIdList(List<String> regionIdList) {
        this.regionIdList = regionIdList;
        return this;
    }

    public ListMultiCloudResourcesRequest addRegionIdListItem(String regionIdListItem) {
        if (this.regionIdList == null) {
            this.regionIdList = new ArrayList<>();
        }
        this.regionIdList.add(regionIdListItem);
        return this;
    }

    public ListMultiCloudResourcesRequest withRegionIdList(Consumer<List<String>> regionIdListSetter) {
        if (this.regionIdList == null) {
            this.regionIdList = new ArrayList<>();
        }
        regionIdListSetter.accept(this.regionIdList);
        return this;
    }

    /**
     * region id列表
     * @return regionIdList
     */
    public List<String> getRegionIdList() {
        return regionIdList;
    }

    public void setRegionIdList(List<String> regionIdList) {
        this.regionIdList = regionIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMultiCloudResourcesRequest that = (ListMultiCloudResourcesRequest) obj;
        return Objects.equals(this.vendor, that.vendor) && Objects.equals(this.type, that.type)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.resourceIdList, that.resourceIdList) && Objects.equals(this.nameList, that.nameList)
            && Objects.equals(this.regionIdList, that.regionIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor, type, limit, marker, resourceIdList, nameList, regionIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMultiCloudResourcesRequest {\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    resourceIdList: ").append(toIndentedString(resourceIdList)).append("\n");
        sb.append("    nameList: ").append(toIndentedString(nameList)).append("\n");
        sb.append("    regionIdList: ").append(toIndentedString(regionIdList)).append("\n");
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
