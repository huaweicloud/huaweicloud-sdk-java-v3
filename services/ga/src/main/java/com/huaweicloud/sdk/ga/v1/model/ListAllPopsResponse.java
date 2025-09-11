package com.huaweicloud.sdk.ga.v1.model;

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
public class ListAllPopsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pops")

    private List<PopOuterDetail> pops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAllPopsResponse withPops(List<PopOuterDetail> pops) {
        this.pops = pops;
        return this;
    }

    public ListAllPopsResponse addPopsItem(PopOuterDetail popsItem) {
        if (this.pops == null) {
            this.pops = new ArrayList<>();
        }
        this.pops.add(popsItem);
        return this;
    }

    public ListAllPopsResponse withPops(Consumer<List<PopOuterDetail>> popsSetter) {
        if (this.pops == null) {
            this.pops = new ArrayList<>();
        }
        popsSetter.accept(this.pops);
        return this;
    }

    /**
     * 接入点列表。
     * @return pops
     */
    public List<PopOuterDetail> getPops() {
        return pops;
    }

    public void setPops(List<PopOuterDetail> pops) {
        this.pops = pops;
    }

    public ListAllPopsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAllPopsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListAllPopsResponse that = (ListAllPopsResponse) obj;
        return Objects.equals(this.pops, that.pops) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pops, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllPopsResponse {\n");
        sb.append("    pops: ").append(toIndentedString(pops)).append("\n");
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
