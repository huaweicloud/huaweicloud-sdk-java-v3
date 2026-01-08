package com.huaweicloud.sdk.vpc.v3.model;

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
public class ListVirsubnetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnets")

    private List<Virsubnet> virsubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListVirsubnetsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**： 请求ID。 **取值范围**： 不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListVirsubnetsResponse withVirsubnets(List<Virsubnet> virsubnets) {
        this.virsubnets = virsubnets;
        return this;
    }

    public ListVirsubnetsResponse addVirsubnetsItem(Virsubnet virsubnetsItem) {
        if (this.virsubnets == null) {
            this.virsubnets = new ArrayList<>();
        }
        this.virsubnets.add(virsubnetsItem);
        return this;
    }

    public ListVirsubnetsResponse withVirsubnets(Consumer<List<Virsubnet>> virsubnetsSetter) {
        if (this.virsubnets == null) {
            this.virsubnets = new ArrayList<>();
        }
        virsubnetsSetter.accept(this.virsubnets);
        return this;
    }

    /**
     * **参数解释**： 查询子网列表的响应体。 **取值范围**： 不涉及。
     * @return virsubnets
     */
    public List<Virsubnet> getVirsubnets() {
        return virsubnets;
    }

    public void setVirsubnets(List<Virsubnet> virsubnets) {
        this.virsubnets = virsubnets;
    }

    public ListVirsubnetsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVirsubnetsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListVirsubnetsResponse that = (ListVirsubnetsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.virsubnets, that.virsubnets)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, virsubnets, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVirsubnetsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    virsubnets: ").append(toIndentedString(virsubnets)).append("\n");
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
