package com.huaweicloud.sdk.scm.v3.model;

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
public class ListCsrResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csr_list")

    private List<CSRResponseBody> csrList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListCsrResponse withCsrList(List<CSRResponseBody> csrList) {
        this.csrList = csrList;
        return this;
    }

    public ListCsrResponse addCsrListItem(CSRResponseBody csrListItem) {
        if (this.csrList == null) {
            this.csrList = new ArrayList<>();
        }
        this.csrList.add(csrListItem);
        return this;
    }

    public ListCsrResponse withCsrList(Consumer<List<CSRResponseBody>> csrListSetter) {
        if (this.csrList == null) {
            this.csrList = new ArrayList<>();
        }
        csrListSetter.accept(this.csrList);
        return this;
    }

    /**
     * CSR列表，详情请参见CSRResponseBody字段数据结构说明。
     * @return csrList
     */
    public List<CSRResponseBody> getCsrList() {
        return csrList;
    }

    public void setCsrList(List<CSRResponseBody> csrList) {
        this.csrList = csrList;
    }

    public ListCsrResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * CSR数量。
     * minimum: 0
     * maximum: 10000
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
        ListCsrResponse that = (ListCsrResponse) obj;
        return Objects.equals(this.csrList, that.csrList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csrList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCsrResponse {\n");
        sb.append("    csrList: ").append(toIndentedString(csrList)).append("\n");
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
