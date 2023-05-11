package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAutoLaunchGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_since")

    private String validSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_until")

    private String validUntil;

    public ListAutoLaunchGroupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回智能购买组的数量限制
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAutoLaunchGroupsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 取值为上一页数据的最后一条记录的唯一标记
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAutoLaunchGroupsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 智能购买组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAutoLaunchGroupsRequest withValidSince(String validSince) {
        this.validSince = validSince;
        return this;
    }

    /**
     * 请求开始时间。按照时间范围过滤 按照ISO8601标准表示，并使用UTC +0时间，格式为yyyy-MM-ddTHH:mm:ssZ
     * @return validSince
     */
    public String getValidSince() {
        return validSince;
    }

    public void setValidSince(String validSince) {
        this.validSince = validSince;
    }

    public ListAutoLaunchGroupsRequest withValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * 请求结束时间。按照时间范围过滤
     * @return validUntil
     */
    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAutoLaunchGroupsRequest listAutoLaunchGroupsRequest = (ListAutoLaunchGroupsRequest) o;
        return Objects.equals(this.limit, listAutoLaunchGroupsRequest.limit)
            && Objects.equals(this.marker, listAutoLaunchGroupsRequest.marker)
            && Objects.equals(this.name, listAutoLaunchGroupsRequest.name)
            && Objects.equals(this.validSince, listAutoLaunchGroupsRequest.validSince)
            && Objects.equals(this.validUntil, listAutoLaunchGroupsRequest.validUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, name, validSince, validUntil);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoLaunchGroupsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    validSince: ").append(toIndentedString(validSince)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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
