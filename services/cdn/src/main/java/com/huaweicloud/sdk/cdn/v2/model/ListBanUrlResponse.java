package com.huaweicloud.sdk.cdn.v2.model;

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
public class ListBanUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ban_urls")

    private List<BanUrlList> banUrls = null;

    public ListBanUrlResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListBanUrlResponse withBanUrls(List<BanUrlList> banUrls) {
        this.banUrls = banUrls;
        return this;
    }

    public ListBanUrlResponse addBanUrlsItem(BanUrlList banUrlsItem) {
        if (this.banUrls == null) {
            this.banUrls = new ArrayList<>();
        }
        this.banUrls.add(banUrlsItem);
        return this;
    }

    public ListBanUrlResponse withBanUrls(Consumer<List<BanUrlList>> banUrlsSetter) {
        if (this.banUrls == null) {
            this.banUrls = new ArrayList<>();
        }
        banUrlsSetter.accept(this.banUrls);
        return this;
    }

    /**
     * url信息。
     * @return banUrls
     */
    public List<BanUrlList> getBanUrls() {
        return banUrls;
    }

    public void setBanUrls(List<BanUrlList> banUrls) {
        this.banUrls = banUrls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBanUrlResponse that = (ListBanUrlResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.banUrls, that.banUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, banUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBanUrlResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    banUrls: ").append(toIndentedString(banUrls)).append("\n");
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
