package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSubscriptionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    @JacksonXmlProperty(localName = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    @JacksonXmlProperty(localName = "endpoint")

    private String endpoint;

    public ListSubscriptionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。  偏移量为一个大于0小于资源总个数的整数，表示查询该偏移量后面的所有的资源，默认值为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSubscriptionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  查询数量限制。  取值范围：1~100，取值一般为10，20，50。功能说明：每页返回的资源个数。默认值为100。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSubscriptionsRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议名称， 枚举值：http、https、sms、email、functionstage、dms、application。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ListSubscriptionsRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。 0：未确认 1：已确认 2：不需要确认 3：已取消确认 4：已经删除。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListSubscriptionsRequest withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 订阅终端。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubscriptionsRequest listSubscriptionsRequest = (ListSubscriptionsRequest) o;
        return Objects.equals(this.offset, listSubscriptionsRequest.offset)
            && Objects.equals(this.limit, listSubscriptionsRequest.limit)
            && Objects.equals(this.protocol, listSubscriptionsRequest.protocol)
            && Objects.equals(this.status, listSubscriptionsRequest.status)
            && Objects.equals(this.endpoint, listSubscriptionsRequest.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, protocol, status, endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
