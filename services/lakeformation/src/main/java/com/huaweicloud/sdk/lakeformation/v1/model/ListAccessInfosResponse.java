package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListAccessInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_infos")

    private List<AccessInfo> accessInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAccessInfosResponse withAccessInfos(List<AccessInfo> accessInfos) {
        this.accessInfos = accessInfos;
        return this;
    }

    public ListAccessInfosResponse addAccessInfosItem(AccessInfo accessInfosItem) {
        if (this.accessInfos == null) {
            this.accessInfos = new ArrayList<>();
        }
        this.accessInfos.add(accessInfosItem);
        return this;
    }

    public ListAccessInfosResponse withAccessInfos(Consumer<List<AccessInfo>> accessInfosSetter) {
        if (this.accessInfos == null) {
            this.accessInfos = new ArrayList<>();
        }
        accessInfosSetter.accept(this.accessInfos);
        return this;
    }

    /**
     * accessinfo列表
     * @return accessInfos
     */
    public List<AccessInfo> getAccessInfos() {
        return accessInfos;
    }

    public void setAccessInfos(List<AccessInfo> accessInfos) {
        this.accessInfos = accessInfos;
    }

    public ListAccessInfosResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * accessinfo总数
     * minimum: 0
     * maximum: 1000
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
        ListAccessInfosResponse that = (ListAccessInfosResponse) obj;
        return Objects.equals(this.accessInfos, that.accessInfos) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessInfos, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessInfosResponse {\n");
        sb.append("    accessInfos: ").append(toIndentedString(accessInfos)).append("\n");
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
