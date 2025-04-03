package com.huaweicloud.sdk.identitycenterportalapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAccountAgenciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_list")

    private List<AgencyInfo> agencyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListAccountAgenciesResponse withAgencyList(List<AgencyInfo> agencyList) {
        this.agencyList = agencyList;
        return this;
    }

    public ListAccountAgenciesResponse addAgencyListItem(AgencyInfo agencyListItem) {
        if (this.agencyList == null) {
            this.agencyList = new ArrayList<>();
        }
        this.agencyList.add(agencyListItem);
        return this;
    }

    public ListAccountAgenciesResponse withAgencyList(Consumer<List<AgencyInfo>> agencyListSetter) {
        if (this.agencyList == null) {
            this.agencyList = new ArrayList<>();
        }
        agencyListSetter.accept(this.agencyList);
        return this;
    }

    /**
     * 满足查询条件的委托或信任委托对象列表
     * @return agencyList
     */
    public List<AgencyInfo> getAgencyList() {
        return agencyList;
    }

    public void setAgencyList(List<AgencyInfo> agencyList) {
        this.agencyList = agencyList;
    }

    public ListAccountAgenciesResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccountAgenciesResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
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
        ListAccountAgenciesResponse that = (ListAccountAgenciesResponse) obj;
        return Objects.equals(this.agencyList, that.agencyList) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyList, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccountAgenciesResponse {\n");
        sb.append("    agencyList: ").append(toIndentedString(agencyList)).append("\n");
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
