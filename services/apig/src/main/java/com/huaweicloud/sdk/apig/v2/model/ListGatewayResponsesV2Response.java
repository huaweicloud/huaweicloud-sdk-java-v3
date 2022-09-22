package com.huaweicloud.sdk.apig.v2.model;

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
public class ListGatewayResponsesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responses")

    private List<ResponsesInfo> responses = null;

    public ListGatewayResponsesV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListGatewayResponsesV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListGatewayResponsesV2Response withResponses(List<ResponsesInfo> responses) {
        this.responses = responses;
        return this;
    }

    public ListGatewayResponsesV2Response addResponsesItem(ResponsesInfo responsesItem) {
        if (this.responses == null) {
            this.responses = new ArrayList<>();
        }
        this.responses.add(responsesItem);
        return this;
    }

    public ListGatewayResponsesV2Response withResponses(Consumer<List<ResponsesInfo>> responsesSetter) {
        if (this.responses == null) {
            this.responses = new ArrayList<>();
        }
        responsesSetter.accept(this.responses);
        return this;
    }

    /**
     * 响应列表
     * @return responses
     */
    public List<ResponsesInfo> getResponses() {
        return responses;
    }

    public void setResponses(List<ResponsesInfo> responses) {
        this.responses = responses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGatewayResponsesV2Response listGatewayResponsesV2Response = (ListGatewayResponsesV2Response) o;
        return Objects.equals(this.size, listGatewayResponsesV2Response.size)
            && Objects.equals(this.total, listGatewayResponsesV2Response.total)
            && Objects.equals(this.responses, listGatewayResponsesV2Response.responses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, responses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGatewayResponsesV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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
