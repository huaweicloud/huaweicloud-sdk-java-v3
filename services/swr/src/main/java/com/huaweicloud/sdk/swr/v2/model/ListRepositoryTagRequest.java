package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRepositoryTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository")

    private String repository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_column")

    private String orderColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_type")

    private String orderType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_manifest")

    private Boolean withManifest;

    public ListRepositoryTagRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名称。小写字母开头，后面跟小写字母、数字、小数点、下划线或中划线（其中下划线最多允许连续两个，小数点、下划线、中划线不能直接相连），小写字母或数字结尾，1-64个字符。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListRepositoryTagRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * 镜像仓库名称
     * @return repository
     */
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public ListRepositoryTagRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回条数,默认返回100条，最多返回1000条数据。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRepositoryTagRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Start position of the cursor for querying the next page in pagination query.
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListRepositoryTagRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 镜像版本名。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListRepositoryTagRequest withOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }

    /**
     * 按列排序，可设置为updated_at（按更新时间排序）或者tag（按照镜像版本排序）。注意：order_column和order_type参数需要配套使用。
     * @return orderColumn
     */
    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    public ListRepositoryTagRequest withOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * 排序类型，可设置为desc（降序）、asc（升序）。注意：order_column和order_type参数需要配套使用。
     * @return orderType
     */
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public ListRepositoryTagRequest withWithManifest(Boolean withManifest) {
        this.withManifest = withManifest;
        return this;
    }

    /**
     * 是否返回镜像的manifest信息
     * @return withManifest
     */
    public Boolean getWithManifest() {
        return withManifest;
    }

    public void setWithManifest(Boolean withManifest) {
        this.withManifest = withManifest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepositoryTagRequest that = (ListRepositoryTagRequest) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.repository, that.repository)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.orderColumn, that.orderColumn)
            && Objects.equals(this.orderType, that.orderType) && Objects.equals(this.withManifest, that.withManifest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, repository, limit, marker, tag, orderColumn, orderType, withManifest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepositoryTagRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    orderColumn: ").append(toIndentedString(orderColumn)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    withManifest: ").append(toIndentedString(withManifest)).append("\n");
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
