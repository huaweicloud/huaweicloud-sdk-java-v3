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
public class ListTableMetaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_metas")

    private List<TableMeta> tableMetas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PagedInfo pageInfo;

    public ListTableMetaResponse withTableMetas(List<TableMeta> tableMetas) {
        this.tableMetas = tableMetas;
        return this;
    }

    public ListTableMetaResponse addTableMetasItem(TableMeta tableMetasItem) {
        if (this.tableMetas == null) {
            this.tableMetas = new ArrayList<>();
        }
        this.tableMetas.add(tableMetasItem);
        return this;
    }

    public ListTableMetaResponse withTableMetas(Consumer<List<TableMeta>> tableMetasSetter) {
        if (this.tableMetas == null) {
            this.tableMetas = new ArrayList<>();
        }
        tableMetasSetter.accept(this.tableMetas);
        return this;
    }

    /**
     * Get tableMetas
     * @return tableMetas
     */
    public List<TableMeta> getTableMetas() {
        return tableMetas;
    }

    public void setTableMetas(List<TableMeta> tableMetas) {
        this.tableMetas = tableMetas;
    }

    public ListTableMetaResponse withPageInfo(PagedInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTableMetaResponse withPageInfo(Consumer<PagedInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PagedInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PagedInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PagedInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTableMetaResponse that = (ListTableMetaResponse) obj;
        return Objects.equals(this.tableMetas, that.tableMetas) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableMetas, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableMetaResponse {\n");
        sb.append("    tableMetas: ").append(toIndentedString(tableMetas)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
