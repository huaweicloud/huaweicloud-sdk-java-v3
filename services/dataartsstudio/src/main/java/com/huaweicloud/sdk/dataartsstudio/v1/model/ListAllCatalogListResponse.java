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
public class ListAllCatalogListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_catalogs")

    private List<RecordForGetAllCatalog> apiCatalogs = null;

    public ListAllCatalogListResponse withTotal(Integer total) {
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

    public ListAllCatalogListResponse withApiCatalogs(List<RecordForGetAllCatalog> apiCatalogs) {
        this.apiCatalogs = apiCatalogs;
        return this;
    }

    public ListAllCatalogListResponse addApiCatalogsItem(RecordForGetAllCatalog apiCatalogsItem) {
        if (this.apiCatalogs == null) {
            this.apiCatalogs = new ArrayList<>();
        }
        this.apiCatalogs.add(apiCatalogsItem);
        return this;
    }

    public ListAllCatalogListResponse withApiCatalogs(Consumer<List<RecordForGetAllCatalog>> apiCatalogsSetter) {
        if (this.apiCatalogs == null) {
            this.apiCatalogs = new ArrayList<>();
        }
        apiCatalogsSetter.accept(this.apiCatalogs);
        return this;
    }

    /**
     * 本次返回的APP列表
     * @return apiCatalogs
     */
    public List<RecordForGetAllCatalog> getApiCatalogs() {
        return apiCatalogs;
    }

    public void setApiCatalogs(List<RecordForGetAllCatalog> apiCatalogs) {
        this.apiCatalogs = apiCatalogs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAllCatalogListResponse listAllCatalogListResponse = (ListAllCatalogListResponse) o;
        return Objects.equals(this.total, listAllCatalogListResponse.total)
            && Objects.equals(this.apiCatalogs, listAllCatalogListResponse.apiCatalogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, apiCatalogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllCatalogListResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    apiCatalogs: ").append(toIndentedString(apiCatalogs)).append("\n");
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
