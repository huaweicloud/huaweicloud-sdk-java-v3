package com.huaweicloud.sdk.ies.v1.model;

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
public class ListRacksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "racks")

    private List<Rack> racks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListRacksResponse withRacks(List<Rack> racks) {
        this.racks = racks;
        return this;
    }

    public ListRacksResponse addRacksItem(Rack racksItem) {
        if (this.racks == null) {
            this.racks = new ArrayList<>();
        }
        this.racks.add(racksItem);
        return this;
    }

    public ListRacksResponse withRacks(Consumer<List<Rack>> racksSetter) {
        if (this.racks == null) {
            this.racks = new ArrayList<>();
        }
        racksSetter.accept(this.racks);
        return this;
    }

    /**
     * 机柜列表
     * @return racks
     */
    public List<Rack> getRacks() {
        return racks;
    }

    public void setRacks(List<Rack> racks) {
        this.racks = racks;
    }

    public ListRacksResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListRacksResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRacksResponse listRacksResponse = (ListRacksResponse) o;
        return Objects.equals(this.racks, listRacksResponse.racks)
            && Objects.equals(this.pageInfo, listRacksResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racks, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRacksResponse {\n");
        sb.append("    racks: ").append(toIndentedString(racks)).append("\n");
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
