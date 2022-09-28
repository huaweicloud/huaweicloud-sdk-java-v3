package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAssetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    private String categories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_word")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publishers")

    private String publishers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_ids")

    private String vendorIds;

    public ListAssetRequest withCategories(String categories) {
        this.categories = categories;
        return this;
    }

    /**
     * 资产类别，支持IMAGE/APP/WORKFLOW/DATASET，支持查询多个，以','分割
     * @return categories
     */
    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public ListAssetRequest withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * 关键字，支持在资产名、资产标题、短描述、长描述中搜索
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public ListAssetRequest withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 标签，支持查询多个，以','分割
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public ListAssetRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回记录限制
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

    public ListAssetRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAssetRequest withPublishers(String publishers) {
        this.publishers = publishers;
        return this;
    }

    /**
     * 发布者，支持查询多个，以','分割
     * @return publishers
     */
    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public ListAssetRequest withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 查询范围，支持PUBLIC/INTERNAL
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ListAssetRequest withVendorIds(String vendorIds) {
        this.vendorIds = vendorIds;
        return this;
    }

    /**
     * 供应商，支持查询多个，以','分割
     * @return vendorIds
     */
    public String getVendorIds() {
        return vendorIds;
    }

    public void setVendorIds(String vendorIds) {
        this.vendorIds = vendorIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssetRequest listAssetRequest = (ListAssetRequest) o;
        return Objects.equals(this.categories, listAssetRequest.categories)
            && Objects.equals(this.keyWord, listAssetRequest.keyWord)
            && Objects.equals(this.labels, listAssetRequest.labels)
            && Objects.equals(this.limit, listAssetRequest.limit)
            && Objects.equals(this.offset, listAssetRequest.offset)
            && Objects.equals(this.publishers, listAssetRequest.publishers)
            && Objects.equals(this.scope, listAssetRequest.scope)
            && Objects.equals(this.vendorIds, listAssetRequest.vendorIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categories, keyWord, labels, limit, offset, publishers, scope, vendorIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetRequest {\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    publishers: ").append(toIndentedString(publishers)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    vendorIds: ").append(toIndentedString(vendorIds)).append("\n");
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
