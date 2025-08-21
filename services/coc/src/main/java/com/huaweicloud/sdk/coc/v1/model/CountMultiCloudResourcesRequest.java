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
public class CountMultiCloudResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_list")

    private List<String> resourceIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_list")

    private List<String> nameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id_list")

    private List<String> regionIdList = null;

    public CountMultiCloudResourcesRequest withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * **参数解释：** 云厂商类型。 **约束限制：** 不涉及。 **取值范围：** - AWS：亚马逊。 - AZURE：微软。 - ALI：阿里云。 - HCS：Huawei Cloud Stack。 **默认取值：** 不涉及。
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public CountMultiCloudResourcesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **约束限制：** 不涉及。 **取值范围：** 资源类型较多，根据实际业务选择资源类型、常用资源类型如下： - cloudservers：弹性云服务器。 - servers：裸金属服务器。 - clusters：云容器引擎。 - instances：云数据库。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CountMultiCloudResourcesRequest withResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }

    public CountMultiCloudResourcesRequest addResourceIdListItem(String resourceIdListItem) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        this.resourceIdList.add(resourceIdListItem);
        return this;
    }

    public CountMultiCloudResourcesRequest withResourceIdList(Consumer<List<String>> resourceIdListSetter) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        resourceIdListSetter.accept(this.resourceIdList);
        return this;
    }

    /**
     * **参数解释：** 用户选择的资源id组成的列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return resourceIdList
     */
    public List<String> getResourceIdList() {
        return resourceIdList;
    }

    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }

    public CountMultiCloudResourcesRequest withNameList(List<String> nameList) {
        this.nameList = nameList;
        return this;
    }

    public CountMultiCloudResourcesRequest addNameListItem(String nameListItem) {
        if (this.nameList == null) {
            this.nameList = new ArrayList<>();
        }
        this.nameList.add(nameListItem);
        return this;
    }

    public CountMultiCloudResourcesRequest withNameList(Consumer<List<String>> nameListSetter) {
        if (this.nameList == null) {
            this.nameList = new ArrayList<>();
        }
        nameListSetter.accept(this.nameList);
        return this;
    }

    /**
     * **参数解释：** 资源名称。 **约束限制：** 不涉及。 **取值范围：** 列表，可参考：裸金属服务器BMS。 **默认取值：** 不涉及。
     * @return nameList
     */
    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public CountMultiCloudResourcesRequest withRegionIdList(List<String> regionIdList) {
        this.regionIdList = regionIdList;
        return this;
    }

    public CountMultiCloudResourcesRequest addRegionIdListItem(String regionIdListItem) {
        if (this.regionIdList == null) {
            this.regionIdList = new ArrayList<>();
        }
        this.regionIdList.add(regionIdListItem);
        return this;
    }

    public CountMultiCloudResourcesRequest withRegionIdList(Consumer<List<String>> regionIdListSetter) {
        if (this.regionIdList == null) {
            this.regionIdList = new ArrayList<>();
        }
        regionIdListSetter.accept(this.regionIdList);
        return this;
    }

    /**
     * **参数解释：** 关联的区域region的id组成的列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
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
        CountMultiCloudResourcesRequest that = (CountMultiCloudResourcesRequest) obj;
        return Objects.equals(this.vendor, that.vendor) && Objects.equals(this.type, that.type)
            && Objects.equals(this.resourceIdList, that.resourceIdList) && Objects.equals(this.nameList, that.nameList)
            && Objects.equals(this.regionIdList, that.regionIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor, type, resourceIdList, nameList, regionIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountMultiCloudResourcesRequest {\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
