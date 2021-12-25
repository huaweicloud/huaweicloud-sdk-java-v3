package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class CheckRomaInstanceListV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public CheckRomaInstanceListV2Request withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 实例状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CheckRomaInstanceListV2Request withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，大于等于0 minimum: 0 maximum: 100
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public CheckRomaInstanceListV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量 minimum: 0 maximum: 100
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRomaInstanceListV2Request checkRomaInstanceListV2Request = (CheckRomaInstanceListV2Request) o;
        return Objects.equals(this.status, checkRomaInstanceListV2Request.status)
            && Objects.equals(this.offset, checkRomaInstanceListV2Request.offset)
            && Objects.equals(this.limit, checkRomaInstanceListV2Request.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRomaInstanceListV2Request {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
