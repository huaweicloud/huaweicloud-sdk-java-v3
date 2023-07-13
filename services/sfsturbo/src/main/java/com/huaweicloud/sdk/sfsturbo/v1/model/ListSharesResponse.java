package com.huaweicloud.sdk.sfsturbo.v1.model;

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
public class ListSharesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shares")

    private List<Shares> shares = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListSharesResponse withShares(List<Shares> shares) {
        this.shares = shares;
        return this;
    }

    public ListSharesResponse addSharesItem(Shares sharesItem) {
        if (this.shares == null) {
            this.shares = new ArrayList<>();
        }
        this.shares.add(sharesItem);
        return this;
    }

    public ListSharesResponse withShares(Consumer<List<Shares>> sharesSetter) {
        if (this.shares == null) {
            this.shares = new ArrayList<>();
        }
        sharesSetter.accept(this.shares);
        return this;
    }

    /**
     * SFS Turbo文件系统的列表。
     * @return shares
     */
    public List<Shares> getShares() {
        return shares;
    }

    public void setShares(List<Shares> shares) {
        this.shares = shares;
    }

    public ListSharesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * SFS Turbo文件系统的数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSharesResponse that = (ListSharesResponse) obj;
        return Objects.equals(this.shares, that.shares) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shares, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSharesResponse {\n");
        sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
