package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListCatalogListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogs")

    private List<RecordForGetAllCatalog> catalogs = null;

    public ListCatalogListResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 符合条件的数据总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListCatalogListResponse withCatalogs(List<RecordForGetAllCatalog> catalogs) {
        this.catalogs = catalogs;
        return this;
    }

    public ListCatalogListResponse addCatalogsItem(RecordForGetAllCatalog catalogsItem) {
        if (this.catalogs == null) {
            this.catalogs = new ArrayList<>();
        }
        this.catalogs.add(catalogsItem);
        return this;
    }

    public ListCatalogListResponse withCatalogs(Consumer<List<RecordForGetAllCatalog>> catalogsSetter) {
        if (this.catalogs == null) {
            this.catalogs = new ArrayList<>();
        }
        catalogsSetter.accept(this.catalogs);
        return this;
    }

    /**
     * 本次返回的APP列表
     * @return catalogs
     */
    public List<RecordForGetAllCatalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<RecordForGetAllCatalog> catalogs) {
        this.catalogs = catalogs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCatalogListResponse listCatalogListResponse = (ListCatalogListResponse) o;
        return Objects.equals(this.total, listCatalogListResponse.total)
            && Objects.equals(this.catalogs, listCatalogListResponse.catalogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, catalogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCatalogListResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
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
