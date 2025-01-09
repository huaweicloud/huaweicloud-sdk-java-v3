package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAccessPoliciesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control_type")

    private String accessControlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListAccessPoliciesRequest withAccessControlType(String accessControlType) {
        this.accessControlType = accessControlType;
        return this;
    }

    /**
     * 接入策略控制类型 * ACCESS_TYPE： 接入类型 * IP_WHITE_LIST： IP白名单
     * @return accessControlType
     */
    public String getAccessControlType() {
        return accessControlType;
    }

    public void setAccessControlType(String accessControlType) {
        this.accessControlType = accessControlType;
    }

    public ListAccessPoliciesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量,范围0-100,默认100。
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAccessPoliciesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量,范围0-99,默认0。
     * minimum: 0
     * maximum: 99
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessPoliciesRequest that = (ListAccessPoliciesRequest) obj;
        return Objects.equals(this.accessControlType, that.accessControlType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessControlType, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessPoliciesRequest {\n");
        sb.append("    accessControlType: ").append(toIndentedString(accessControlType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
