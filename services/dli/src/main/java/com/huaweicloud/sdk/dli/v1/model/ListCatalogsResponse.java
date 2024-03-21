package com.huaweicloud.sdk.dli.v1.model;

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
public class ListCatalogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalogs")

    private List<CatalogEntity> catalogs = null;

    public ListCatalogsResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 是否成功
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ListCatalogsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * catalog总数量
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListCatalogsResponse withCatalogs(List<CatalogEntity> catalogs) {
        this.catalogs = catalogs;
        return this;
    }

    public ListCatalogsResponse addCatalogsItem(CatalogEntity catalogsItem) {
        if (this.catalogs == null) {
            this.catalogs = new ArrayList<>();
        }
        this.catalogs.add(catalogsItem);
        return this;
    }

    public ListCatalogsResponse withCatalogs(Consumer<List<CatalogEntity>> catalogsSetter) {
        if (this.catalogs == null) {
            this.catalogs = new ArrayList<>();
        }
        catalogsSetter.accept(this.catalogs);
        return this;
    }

    /**
     * 项目下所有catalog信息
     * @return catalogs
     */
    public List<CatalogEntity> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<CatalogEntity> catalogs) {
        this.catalogs = catalogs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCatalogsResponse that = (ListCatalogsResponse) obj;
        return Objects.equals(this.isSuccess, that.isSuccess) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.catalogs, that.catalogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, totalCount, catalogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCatalogsResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
