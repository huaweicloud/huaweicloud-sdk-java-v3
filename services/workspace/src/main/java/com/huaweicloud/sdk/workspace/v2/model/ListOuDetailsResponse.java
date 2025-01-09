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
public class ListOuDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ous")

    private List<OuNameInfo> ous = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListOuDetailsResponse withOus(List<OuNameInfo> ous) {
        this.ous = ous;
        return this;
    }

    public ListOuDetailsResponse addOusItem(OuNameInfo ousItem) {
        if (this.ous == null) {
            this.ous = new ArrayList<>();
        }
        this.ous.add(ousItem);
        return this;
    }

    public ListOuDetailsResponse withOus(Consumer<List<OuNameInfo>> ousSetter) {
        if (this.ous == null) {
            this.ous = new ArrayList<>();
        }
        ousSetter.accept(this.ous);
        return this;
    }

    /**
     * OU对象
     * @return ous
     */
    public List<OuNameInfo> getOus() {
        return ous;
    }

    public void setOus(List<OuNameInfo> ous) {
        this.ous = ous;
    }

    public ListOuDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * OU总记录数
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
        ListOuDetailsResponse that = (ListOuDetailsResponse) obj;
        return Objects.equals(this.ous, that.ous) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ous, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOuDetailsResponse {\n");
        sb.append("    ous: ").append(toIndentedString(ous)).append("\n");
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
