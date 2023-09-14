package com.huaweicloud.sdk.kps.v3.model;

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
public class ListKeypairsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypairs")

    private List<Keypairs> keypairs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListKeypairsResponse withKeypairs(List<Keypairs> keypairs) {
        this.keypairs = keypairs;
        return this;
    }

    public ListKeypairsResponse addKeypairsItem(Keypairs keypairsItem) {
        if (this.keypairs == null) {
            this.keypairs = new ArrayList<>();
        }
        this.keypairs.add(keypairsItem);
        return this;
    }

    public ListKeypairsResponse withKeypairs(Consumer<List<Keypairs>> keypairsSetter) {
        if (this.keypairs == null) {
            this.keypairs = new ArrayList<>();
        }
        keypairsSetter.accept(this.keypairs);
        return this;
    }

    /**
     * SSH密钥对信息列表
     * @return keypairs
     */
    public List<Keypairs> getKeypairs() {
        return keypairs;
    }

    public void setKeypairs(List<Keypairs> keypairs) {
        this.keypairs = keypairs;
    }

    public ListKeypairsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListKeypairsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListKeypairsResponse that = (ListKeypairsResponse) obj;
        return Objects.equals(this.keypairs, that.keypairs) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypairs, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeypairsResponse {\n");
        sb.append("    keypairs: ").append(toIndentedString(keypairs)).append("\n");
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
