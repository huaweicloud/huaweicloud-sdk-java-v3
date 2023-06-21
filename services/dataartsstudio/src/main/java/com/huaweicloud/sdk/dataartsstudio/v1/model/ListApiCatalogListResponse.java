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
public class ListApiCatalogListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apis")

    private List<ApiOverview> apis = null;

    public ListApiCatalogListResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * API总数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListApiCatalogListResponse withApis(List<ApiOverview> apis) {
        this.apis = apis;
        return this;
    }

    public ListApiCatalogListResponse addApisItem(ApiOverview apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public ListApiCatalogListResponse withApis(Consumer<List<ApiOverview>> apisSetter) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /**
     * API列表
     * @return apis
     */
    public List<ApiOverview> getApis() {
        return apis;
    }

    public void setApis(List<ApiOverview> apis) {
        this.apis = apis;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApiCatalogListResponse listApiCatalogListResponse = (ListApiCatalogListResponse) o;
        return Objects.equals(this.total, listApiCatalogListResponse.total)
            && Objects.equals(this.apis, listApiCatalogListResponse.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, apis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiCatalogListResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
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
