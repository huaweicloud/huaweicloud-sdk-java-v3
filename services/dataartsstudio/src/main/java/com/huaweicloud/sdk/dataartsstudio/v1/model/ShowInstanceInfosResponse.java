package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header_map")

    private Object headerMap;

    public ShowInstanceInfosResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 响应码
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public ShowInstanceInfosResponse withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 响应体
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ShowInstanceInfosResponse withHeaderMap(Object headerMap) {
        this.headerMap = headerMap;
        return this;
    }

    /**
     * 响应头，结构为Map<String,String>
     * @return headerMap
     */
    public Object getHeaderMap() {
        return headerMap;
    }

    public void setHeaderMap(Object headerMap) {
        this.headerMap = headerMap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceInfosResponse that = (ShowInstanceInfosResponse) obj;
        return Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.body, that.body)
            && Objects.equals(this.headerMap, that.headerMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, body, headerMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceInfosResponse {\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    headerMap: ").append(toIndentedString(headerMap)).append("\n");
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
