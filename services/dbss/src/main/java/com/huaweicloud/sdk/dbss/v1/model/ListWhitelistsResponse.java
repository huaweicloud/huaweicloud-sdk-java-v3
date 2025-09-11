package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListWhitelistsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelists")

    private List<WhitelistBean> whitelists = null;

    public ListWhitelistsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWhitelistsResponse withWhitelists(List<WhitelistBean> whitelists) {
        this.whitelists = whitelists;
        return this;
    }

    public ListWhitelistsResponse addWhitelistsItem(WhitelistBean whitelistsItem) {
        if (this.whitelists == null) {
            this.whitelists = new ArrayList<>();
        }
        this.whitelists.add(whitelistsItem);
        return this;
    }

    public ListWhitelistsResponse withWhitelists(Consumer<List<WhitelistBean>> whitelistsSetter) {
        if (this.whitelists == null) {
            this.whitelists = new ArrayList<>();
        }
        whitelistsSetter.accept(this.whitelists);
        return this;
    }

    /**
     * 白名单列表
     * @return whitelists
     */
    public List<WhitelistBean> getWhitelists() {
        return whitelists;
    }

    public void setWhitelists(List<WhitelistBean> whitelists) {
        this.whitelists = whitelists;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWhitelistsResponse that = (ListWhitelistsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.whitelists, that.whitelists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, whitelists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWhitelistsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    whitelists: ").append(toIndentedString(whitelists)).append("\n");
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
