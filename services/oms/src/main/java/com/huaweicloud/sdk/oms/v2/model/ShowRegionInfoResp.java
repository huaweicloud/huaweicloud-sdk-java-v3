package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询Region信息响应体
 */
public class ShowRegionInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_list")

    private List<RegionInfo> regionList = null;

    public ShowRegionInfoResp withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ShowRegionInfoResp withRegionList(List<RegionInfo> regionList) {
        this.regionList = regionList;
        return this;
    }

    public ShowRegionInfoResp addRegionListItem(RegionInfo regionListItem) {
        if (this.regionList == null) {
            this.regionList = new ArrayList<>();
        }
        this.regionList.add(regionListItem);
        return this;
    }

    public ShowRegionInfoResp withRegionList(Consumer<List<RegionInfo>> regionListSetter) {
        if (this.regionList == null) {
            this.regionList = new ArrayList<>();
        }
        regionListSetter.accept(this.regionList);
        return this;
    }

    /**
     * Region列表
     * @return regionList
     */
    public List<RegionInfo> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<RegionInfo> regionList) {
        this.regionList = regionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRegionInfoResp that = (ShowRegionInfoResp) obj;
        return Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.regionList, that.regionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, regionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRegionInfoResp {\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    regionList: ").append(toIndentedString(regionList)).append("\n");
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
