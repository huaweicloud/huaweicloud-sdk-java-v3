package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPublicipPoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pools")

    @JacksonXmlProperty(localName = "publicip_pools")

    private List<PublicipPoolShowResp> publicipPools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    @JacksonXmlProperty(localName = "page_info")

    private PageInfoOption pageInfo;

    public ListPublicipPoolResponse withPublicipPools(List<PublicipPoolShowResp> publicipPools) {
        this.publicipPools = publicipPools;
        return this;
    }

    public ListPublicipPoolResponse addPublicipPoolsItem(PublicipPoolShowResp publicipPoolsItem) {
        if (this.publicipPools == null) {
            this.publicipPools = new ArrayList<>();
        }
        this.publicipPools.add(publicipPoolsItem);
        return this;
    }

    public ListPublicipPoolResponse withPublicipPools(Consumer<List<PublicipPoolShowResp>> publicipPoolsSetter) {
        if (this.publicipPools == null) {
            this.publicipPools = new ArrayList<>();
        }
        publicipPoolsSetter.accept(this.publicipPools);
        return this;
    }

    /**
     * 功能说明：公网池对象
     * @return publicipPools
     */
    public List<PublicipPoolShowResp> getPublicipPools() {
        return publicipPools;
    }

    public void setPublicipPools(List<PublicipPoolShowResp> publicipPools) {
        this.publicipPools = publicipPools;
    }

    public ListPublicipPoolResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListPublicipPoolResponse withPageInfo(PageInfoOption pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPublicipPoolResponse withPageInfo(Consumer<PageInfoOption> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoOption();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoOption getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoOption pageInfo) {
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
        ListPublicipPoolResponse listPublicipPoolResponse = (ListPublicipPoolResponse) o;
        return Objects.equals(this.publicipPools, listPublicipPoolResponse.publicipPools)
            && Objects.equals(this.requestId, listPublicipPoolResponse.requestId)
            && Objects.equals(this.pageInfo, listPublicipPoolResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipPools, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicipPoolResponse {\n");
        sb.append("    publicipPools: ").append(toIndentedString(publicipPools)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
