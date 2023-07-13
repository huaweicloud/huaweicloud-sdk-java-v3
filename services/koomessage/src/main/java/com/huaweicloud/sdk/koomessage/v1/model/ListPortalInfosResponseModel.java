package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询主页列表响应体。
 */
public class ListPortalInfosResponseModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portals")

    private List<PortalModel> portals = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageOffSet pageInfo;

    public ListPortalInfosResponseModel withPortals(List<PortalModel> portals) {
        this.portals = portals;
        return this;
    }

    public ListPortalInfosResponseModel addPortalsItem(PortalModel portalsItem) {
        if (this.portals == null) {
            this.portals = new ArrayList<>();
        }
        this.portals.add(portalsItem);
        return this;
    }

    public ListPortalInfosResponseModel withPortals(Consumer<List<PortalModel>> portalsSetter) {
        if (this.portals == null) {
            this.portals = new ArrayList<>();
        }
        portalsSetter.accept(this.portals);
        return this;
    }

    /**
     * 主页列表。
     * @return portals
     */
    public List<PortalModel> getPortals() {
        return portals;
    }

    public void setPortals(List<PortalModel> portals) {
        this.portals = portals;
    }

    public ListPortalInfosResponseModel withPageInfo(PageOffSet pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPortalInfosResponseModel withPageInfo(Consumer<PageOffSet> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageOffSet();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageOffSet getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageOffSet pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPortalInfosResponseModel that = (ListPortalInfosResponseModel) obj;
        return Objects.equals(this.portals, that.portals) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portals, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPortalInfosResponseModel {\n");
        sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
