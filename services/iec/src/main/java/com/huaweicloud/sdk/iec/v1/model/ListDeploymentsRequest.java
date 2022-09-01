package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDeploymentsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgecloud_id")

    @JacksonXmlProperty(localName = "edgecloud_id")

    private String edgecloudId;

    public ListDeploymentsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。 当前偏移量，默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDeploymentsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回部署计划列表当前页面的数量。
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

    public ListDeploymentsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 查询条件，部署计划状态，现只包含如下值： - open:部署计划处于未执行状态，可执行部署计划进行部署 - closed:部署计划已关闭，不可部署。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListDeploymentsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 查询条件，部署计划ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListDeploymentsRequest withEdgecloudId(String edgecloudId) {
        this.edgecloudId = edgecloudId;
        return this;
    }

    /**
     * 查询条件，边缘业务ID。
     * @return edgecloudId
     */
    public String getEdgecloudId() {
        return edgecloudId;
    }

    public void setEdgecloudId(String edgecloudId) {
        this.edgecloudId = edgecloudId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeploymentsRequest listDeploymentsRequest = (ListDeploymentsRequest) o;
        return Objects.equals(this.offset, listDeploymentsRequest.offset)
            && Objects.equals(this.limit, listDeploymentsRequest.limit)
            && Objects.equals(this.status, listDeploymentsRequest.status)
            && Objects.equals(this.id, listDeploymentsRequest.id)
            && Objects.equals(this.edgecloudId, listDeploymentsRequest.edgecloudId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, status, id, edgecloudId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeploymentsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    edgecloudId: ").append(toIndentedString(edgecloudId)).append("\n");
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
