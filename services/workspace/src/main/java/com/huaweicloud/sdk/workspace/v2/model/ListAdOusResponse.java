package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListAdOusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_infos")

    private List<AdOuInfo> ouInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListAdOusResponse withOuInfos(List<AdOuInfo> ouInfos) {
        this.ouInfos = ouInfos;
        return this;
    }

    public ListAdOusResponse addOuInfosItem(AdOuInfo ouInfosItem) {
        if (this.ouInfos == null) {
            this.ouInfos = new ArrayList<>();
        }
        this.ouInfos.add(ouInfosItem);
        return this;
    }

    public ListAdOusResponse withOuInfos(Consumer<List<AdOuInfo>> ouInfosSetter) {
        if (this.ouInfos == null) {
            this.ouInfos = new ArrayList<>();
        }
        ouInfosSetter.accept(this.ouInfos);
        return this;
    }

    /**
     * OU对象。
     * @return ouInfos
     */
    public List<AdOuInfo> getOuInfos() {
        return ouInfos;
    }

    public void setOuInfos(List<AdOuInfo> ouInfos) {
        this.ouInfos = ouInfos;
    }

    public ListAdOusResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * OU总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAdOusResponse that = (ListAdOusResponse) obj;
        return Objects.equals(this.ouInfos, that.ouInfos) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ouInfos, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAdOusResponse {\n");
        sb.append("    ouInfos: ").append(toIndentedString(ouInfos)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
