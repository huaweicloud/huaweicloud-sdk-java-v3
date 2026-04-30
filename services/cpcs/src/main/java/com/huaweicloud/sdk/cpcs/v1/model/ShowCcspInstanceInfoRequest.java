package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCcspInstanceInfoRequest {

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
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_normal")

    private Boolean isNormal;

    public ShowCcspInstanceInfoRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定查询返回记录条数，默认值10
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

    public ShowCcspInstanceInfoRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCcspInstanceInfoRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，从offset指定的下一条数据开始查询默认值为0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowCcspInstanceInfoRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序属性，目前支持以下属性： - **create_time** : 实例创建时间（默认）
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ShowCcspInstanceInfoRequest withSortDir(String sortDir) {
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

    public ShowCcspInstanceInfoRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 密码服务集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowCcspInstanceInfoRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 实例的服务状态: - **enable** : 启用； - **disable** : 停用
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowCcspInstanceInfoRequest withIsNormal(Boolean isNormal) {
        this.isNormal = isNormal;
        return this;
    }

    /**
     * 实例健康状态： - **true** : 正常； - **false** : 异常
     * @return isNormal
     */
    public Boolean getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(Boolean isNormal) {
        this.isNormal = isNormal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCcspInstanceInfoRequest that = (ShowCcspInstanceInfoRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.name, that.name)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.isNormal, that.isNormal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, name, offset, sortKey, sortDir, clusterId, status, isNormal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCcspInstanceInfoRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isNormal: ").append(toIndentedString(isNormal)).append("\n");
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
