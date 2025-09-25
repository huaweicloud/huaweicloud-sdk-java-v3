package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListAspInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asp")

    private List<ListAspResult> asp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListAspInfosResponse withAsp(List<ListAspResult> asp) {
        this.asp = asp;
        return this;
    }

    public ListAspInfosResponse addAspItem(ListAspResult aspItem) {
        if (this.asp == null) {
            this.asp = new ArrayList<>();
        }
        this.asp.add(aspItem);
        return this;
    }

    public ListAspInfosResponse withAsp(Consumer<List<ListAspResult>> aspSetter) {
        if (this.asp == null) {
            this.asp = new ArrayList<>();
        }
        aspSetter.accept(this.asp);
        return this;
    }

    /**
     * **参数解释**: asp报告信息列表。
     * @return asp
     */
    public List<ListAspResult> getAsp() {
        return asp;
    }

    public void setAsp(List<ListAspResult> asp) {
        this.asp = asp;
    }

    public ListAspInfosResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 总记录数。 **取值范围**: 不涉及。
     * minimum: 0
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
        ListAspInfosResponse that = (ListAspInfosResponse) obj;
        return Objects.equals(this.asp, that.asp) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asp, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAspInfosResponse {\n");
        sb.append("    asp: ").append(toIndentedString(asp)).append("\n");
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
