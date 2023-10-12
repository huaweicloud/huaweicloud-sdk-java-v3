package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCertsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certsType")

    private String certsType;

    public ListCertsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定待查询的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListCertsRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * 指定查询起始值，默认值为1，即从第1个证书开始查询。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public ListCertsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定查询个数，默认值为10，即一次查询10个证书信息。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListCertsRequest withCertsType(String certsType) {
        this.certsType = certsType;
        return this;
    }

    /**
     * 证书类型。defaultCerts为默认证书类型，不指定查询证书类型默认查找自定义证书列表。
     * @return certsType
     */
    public String getCertsType() {
        return certsType;
    }

    public void setCertsType(String certsType) {
        this.certsType = certsType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCertsRequest that = (ListCertsRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.start, that.start)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.certsType, that.certsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, start, limit, certsType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    certsType: ").append(toIndentedString(certsType)).append("\n");
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
