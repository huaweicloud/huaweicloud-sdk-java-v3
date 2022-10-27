package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Request Object
 */
public class ListPortInfosRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private Integer portType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_search")

    private String signSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_name")

    private String pubName;

    public ListPortInfosRequest withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 操作类型。 - 0：查询通道号列表 - 1：查询绑定关系列表 
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ListPortInfosRequest withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 通道号。 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public ListPortInfosRequest withPortType(Integer portType) {
        this.portType = portType;
        return this;
    }

    /**
     * 通道号类型。 - 1：普通 - 3：前缀号段  - 5：后缀号段 
     * minimum: 1
     * maximum: 5
     * @return portType
     */
    public Integer getPortType() {
        return portType;
    }

    public void setPortType(Integer portType) {
        this.portType = portType;
    }

    public ListPortInfosRequest withSignSearch(String signSearch) {
        this.signSearch = signSearch;
        return this;
    }

    /**
     * 单个通道号签名。  > 不支持多个签名查询，支持模糊搜索。长度要求0-18。 
     * @return signSearch
     */
    public String getSignSearch() {
        return signSearch;
    }

    public void setSignSearch(String signSearch) {
        this.signSearch = signSearch;
    }

    public ListPortInfosRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPortInfosRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPortInfosRequest withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。格式为：yyyy-MM-ddTHH:mm:ssZ。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ListPortInfosRequest withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。格式为：yyyy-MM-ddTHH:mm:ssZ。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ListPortInfosRequest withPubName(String pubName) {
        this.pubName = pubName;
        return this;
    }

    /**
     * 服务号名称。  > - type=1时，此字段作为过滤条件 > - type=0时，不作为过滤条件 
     * @return pubName
     */
    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPortInfosRequest listPortInfosRequest = (ListPortInfosRequest) o;
        return Objects.equals(this.type, listPortInfosRequest.type)
            && Objects.equals(this.port, listPortInfosRequest.port)
            && Objects.equals(this.portType, listPortInfosRequest.portType)
            && Objects.equals(this.signSearch, listPortInfosRequest.signSearch)
            && Objects.equals(this.offset, listPortInfosRequest.offset)
            && Objects.equals(this.limit, listPortInfosRequest.limit)
            && Objects.equals(this.startTime, listPortInfosRequest.startTime)
            && Objects.equals(this.endTime, listPortInfosRequest.endTime)
            && Objects.equals(this.pubName, listPortInfosRequest.pubName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, port, portType, signSearch, offset, limit, startTime, endTime, pubName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPortInfosRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    signSearch: ").append(toIndentedString(signSearch)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
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
