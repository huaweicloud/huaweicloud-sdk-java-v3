package com.huaweicloud.sdk.clouddc.v1.model;

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
public class ListIRackResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iracks")

    private List<IRack> iracks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListIRackResponse withIracks(List<IRack> iracks) {
        this.iracks = iracks;
        return this;
    }

    public ListIRackResponse addIracksItem(IRack iracksItem) {
        if (this.iracks == null) {
            this.iracks = new ArrayList<>();
        }
        this.iracks.add(iracksItem);
        return this;
    }

    public ListIRackResponse withIracks(Consumer<List<IRack>> iracksSetter) {
        if (this.iracks == null) {
            this.iracks = new ArrayList<>();
        }
        iracksSetter.accept(this.iracks);
        return this;
    }

    /**
     * Get iracks
     * @return iracks
     */
    public List<IRack> getIracks() {
        return iracks;
    }

    public void setIracks(List<IRack> iracks) {
        this.iracks = iracks;
    }

    public ListIRackResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListIRackResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIRackResponse that = (ListIRackResponse) obj;
        return Objects.equals(this.iracks, that.iracks) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iracks, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIRackResponse {\n");
        sb.append("    iracks: ").append(toIndentedString(iracks)).append("\n");
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
