package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListDailyLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip_id")

    private String floatingIpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    public ListDailyLogRequest withFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
        return this;
    }

    /** 用户EIP对应的ID
     * 
     * @return floatingIpId */
    public String getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    public ListDailyLogRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /** 可选范围： - desc：表示时间降序 - asc：表示时间升序 默认值为“desc”。
     * 
     * @return sortDir */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListDailyLogRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 返回结果个数限制，此次查询返回数量最大值，取值范围：1～100，与offset配合使用。 若“limit”与“offset”均不携带则返回所有主机列表。
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListDailyLogRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，“limit”携带时此字段有效。
     * 
     * @return offset */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListDailyLogRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /** 用户EIP
     * 
     * @return ip */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDailyLogRequest listDailyLogRequest = (ListDailyLogRequest) o;
        return Objects.equals(this.floatingIpId, listDailyLogRequest.floatingIpId)
            && Objects.equals(this.sortDir, listDailyLogRequest.sortDir)
            && Objects.equals(this.limit, listDailyLogRequest.limit)
            && Objects.equals(this.offset, listDailyLogRequest.offset)
            && Objects.equals(this.ip, listDailyLogRequest.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floatingIpId, sortDir, limit, offset, ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDailyLogRequest {\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
