package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEndpointsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_service_name")

    @JacksonXmlProperty(localName = "endpoint_service_name")

    private String endpointServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    @JacksonXmlProperty(localName = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    @JacksonXmlProperty(localName = "sort_dir")

    private String sortDir;

    public ListEndpointsRequest withEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
        return this;
    }

    /**
     * 终端节点服务的名称，支持大小 写，前后模糊匹配。
     * @return endpointServiceName
     */
    public String getEndpointServiceName() {
        return endpointServiceName;
    }

    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
    }

    public ListEndpointsRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 终端节点所在的VPC的ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListEndpointsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点的ID，唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListEndpointsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回终端节点的数量限制，即 每页返回的资源个数。 取值范围：0~1000，取值一般为 10，20或者50，默认为10。
     * minimum: 1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEndpointsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。 偏移量为一个大于0小于终端节点 服务总个数的整数，表示从偏移量 后面的终端节点服务开始查询。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEndpointsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 查询结果中终端节点列表的排序字 段，取值为： ● create_at：终端节点的创建时 间 ● update_at：终端节点的更新时 间 默认值为create_at。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListEndpointsRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 查询结果中终端节点列表的排序方 式，取值为： ● desc：降序排序 ● asc：升序排序 默认值为desc。
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
        ListEndpointsRequest listEndpointsRequest = (ListEndpointsRequest) o;
        return Objects.equals(this.endpointServiceName, listEndpointsRequest.endpointServiceName)
            && Objects.equals(this.vpcId, listEndpointsRequest.vpcId)
            && Objects.equals(this.id, listEndpointsRequest.id)
            && Objects.equals(this.limit, listEndpointsRequest.limit)
            && Objects.equals(this.offset, listEndpointsRequest.offset)
            && Objects.equals(this.sortKey, listEndpointsRequest.sortKey)
            && Objects.equals(this.sortDir, listEndpointsRequest.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointServiceName, vpcId, id, limit, offset, sortKey, sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEndpointsRequest {\n");
        sb.append("    endpointServiceName: ").append(toIndentedString(endpointServiceName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
