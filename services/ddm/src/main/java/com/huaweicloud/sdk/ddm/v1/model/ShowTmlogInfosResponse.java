package com.huaweicloud.sdk.ddm.v1.model;

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
public class ShowTmlogInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmlogs")

    private List<TmlogInfo> tmlogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowTmlogInfosResponse withTmlogs(List<TmlogInfo> tmlogs) {
        this.tmlogs = tmlogs;
        return this;
    }

    public ShowTmlogInfosResponse addTmlogsItem(TmlogInfo tmlogsItem) {
        if (this.tmlogs == null) {
            this.tmlogs = new ArrayList<>();
        }
        this.tmlogs.add(tmlogsItem);
        return this;
    }

    public ShowTmlogInfosResponse withTmlogs(Consumer<List<TmlogInfo>> tmlogsSetter) {
        if (this.tmlogs == null) {
            this.tmlogs = new ArrayList<>();
        }
        tmlogsSetter.accept(this.tmlogs);
        return this;
    }

    /**
     * TMLOG信息列表。
     * @return tmlogs
     */
    public List<TmlogInfo> getTmlogs() {
        return tmlogs;
    }

    public void setTmlogs(List<TmlogInfo> tmlogs) {
        this.tmlogs = tmlogs;
    }

    public ShowTmlogInfosResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询到TMLOG的节点总数
     * minimum: 1
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTmlogInfosResponse that = (ShowTmlogInfosResponse) obj;
        return Objects.equals(this.tmlogs, that.tmlogs) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tmlogs, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTmlogInfosResponse {\n");
        sb.append("    tmlogs: ").append(toIndentedString(tmlogs)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
