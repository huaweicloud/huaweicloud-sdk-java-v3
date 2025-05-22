package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowChannelStatisticRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Internal")

    private String accessControlAllowInternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-External")

    private String accessControlAllowExternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ShowChannelStatisticReq body;

    public ShowChannelStatisticRequest withAccessControlAllowInternal(String accessControlAllowInternal) {
        this.accessControlAllowInternal = accessControlAllowInternal;
        return this;
    }

    /**
     * 服务鉴权Token，服务开启鉴权，必须携带Access-Control-Allow-Internal访问服务。
     * @return accessControlAllowInternal
     */
    public String getAccessControlAllowInternal() {
        return accessControlAllowInternal;
    }

    public void setAccessControlAllowInternal(String accessControlAllowInternal) {
        this.accessControlAllowInternal = accessControlAllowInternal;
    }

    public ShowChannelStatisticRequest withAccessControlAllowExternal(String accessControlAllowExternal) {
        this.accessControlAllowExternal = accessControlAllowExternal;
        return this;
    }

    /**
     * 服务鉴权Token，服务开启鉴权，必须携带Access-Control-Allow-External访问服务。
     * @return accessControlAllowExternal
     */
    public String getAccessControlAllowExternal() {
        return accessControlAllowExternal;
    }

    public void setAccessControlAllowExternal(String accessControlAllowExternal) {
        this.accessControlAllowExternal = accessControlAllowExternal;
    }

    public ShowChannelStatisticRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数，取值范围[1,100]，默认值10。
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

    public ShowChannelStatisticRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。表示从此偏移量开始查询，offset大于等于0。
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

    public ShowChannelStatisticRequest withBody(ShowChannelStatisticReq body) {
        this.body = body;
        return this;
    }

    public ShowChannelStatisticRequest withBody(Consumer<ShowChannelStatisticReq> bodySetter) {
        if (this.body == null) {
            this.body = new ShowChannelStatisticReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ShowChannelStatisticReq getBody() {
        return body;
    }

    public void setBody(ShowChannelStatisticReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowChannelStatisticRequest that = (ShowChannelStatisticRequest) obj;
        return Objects.equals(this.accessControlAllowInternal, that.accessControlAllowInternal)
            && Objects.equals(this.accessControlAllowExternal, that.accessControlAllowExternal)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessControlAllowInternal, accessControlAllowExternal, limit, offset, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowChannelStatisticRequest {\n");
        sb.append("    accessControlAllowInternal: ").append(toIndentedString(accessControlAllowInternal)).append("\n");
        sb.append("    accessControlAllowExternal: ").append(toIndentedString(accessControlAllowExternal)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
