package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCertificateAuthorityRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    public ListCertificateAuthorityRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定查询返回记录条数，默认值10。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCertificateAuthorityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * CA证书名称（CN）过滤值，用于获取名称中带有特定值的CA证书集合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCertificateAuthorityRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，从offset指定的下一条数据开始查询。默认值为0。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCertificateAuthorityRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * CA证书状态，通过状态过滤证书集合： - **EXPIRED** : 待激活，此状态下，不可用于签发证书； - **ACTIVED** : 已激活，此状态下，可用于签发证书； - **DISABLED** : 已禁用，此状态下，不可用于签发证书； - **DELETED** : 计划删除，此状态下，不可用于签发证书； - **EXPIRED** : 已过期，此状态下，不可用于签发证书。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListCertificateAuthorityRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * CA证书类型： - **ROOT** : 根CA证书 - **SUBORDINATE** : 从属CA证书
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListCertificateAuthorityRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序属性，目前支持以下属性： - **create_time** : 证书创建时间（默认） - **common_name** : 证书名称 - **ca_type** : CA证书类型 - **not_after** : 证书到期时间
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListCertificateAuthorityRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方向，支持以下值： - **DESC** : 降序（默认） - **ASC** : 升序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCertificateAuthorityRequest listCertificateAuthorityRequest = (ListCertificateAuthorityRequest) o;
        return Objects.equals(this.limit, listCertificateAuthorityRequest.limit)
            && Objects.equals(this.name, listCertificateAuthorityRequest.name)
            && Objects.equals(this.offset, listCertificateAuthorityRequest.offset)
            && Objects.equals(this.status, listCertificateAuthorityRequest.status)
            && Objects.equals(this.type, listCertificateAuthorityRequest.type)
            && Objects.equals(this.sortKey, listCertificateAuthorityRequest.sortKey)
            && Objects.equals(this.sortDir, listCertificateAuthorityRequest.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, name, offset, status, type, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificateAuthorityRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
