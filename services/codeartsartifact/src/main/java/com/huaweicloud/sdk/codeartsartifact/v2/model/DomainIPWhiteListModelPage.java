package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DomainIPWhiteListModelPage
 */
public class DomainIPWhiteListModelPage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_records")

    private Integer totalRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_pages")

    private Integer totalPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<DomainIPWhiteListModel> data = null;

    public DomainIPWhiteListModelPage withTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * **参数解释**: 总记录数。 **取值范围**: 不涉及。
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public DomainIPWhiteListModelPage withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * **参数解释**: 总页数。 **取值范围**: 不涉及。
     * @return totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public DomainIPWhiteListModelPage withData(List<DomainIPWhiteListModel> data) {
        this.data = data;
        return this;
    }

    public DomainIPWhiteListModelPage addDataItem(DomainIPWhiteListModel dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public DomainIPWhiteListModelPage withData(Consumer<List<DomainIPWhiteListModel>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释**: 租户IP白名单列表。 **取值范围**: 不涉及。 
     * @return data
     */
    public List<DomainIPWhiteListModel> getData() {
        return data;
    }

    public void setData(List<DomainIPWhiteListModel> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainIPWhiteListModelPage that = (DomainIPWhiteListModelPage) obj;
        return Objects.equals(this.totalRecords, that.totalRecords) && Objects.equals(this.totalPages, that.totalPages)
            && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRecords, totalPages, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainIPWhiteListModelPage {\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
