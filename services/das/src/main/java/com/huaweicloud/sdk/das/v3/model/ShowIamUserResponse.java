package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowIamUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private Object data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_account_id")

    private String primaryAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_account_name")

    private String primaryAccountName;

    public ShowIamUserResponse withData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * IAM用户信息
     * @return data
     */
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ShowIamUserResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * IAM用户的总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowIamUserResponse withPrimaryAccountId(String primaryAccountId) {
        this.primaryAccountId = primaryAccountId;
        return this;
    }

    /**
     * 账号ID
     * @return primaryAccountId
     */
    public String getPrimaryAccountId() {
        return primaryAccountId;
    }

    public void setPrimaryAccountId(String primaryAccountId) {
        this.primaryAccountId = primaryAccountId;
    }

    public ShowIamUserResponse withPrimaryAccountName(String primaryAccountName) {
        this.primaryAccountName = primaryAccountName;
        return this;
    }

    /**
     * 账号名称
     * @return primaryAccountName
     */
    public String getPrimaryAccountName() {
        return primaryAccountName;
    }

    public void setPrimaryAccountName(String primaryAccountName) {
        this.primaryAccountName = primaryAccountName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIamUserResponse that = (ShowIamUserResponse) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.total, that.total)
            && Objects.equals(this.primaryAccountId, that.primaryAccountId)
            && Objects.equals(this.primaryAccountName, that.primaryAccountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, total, primaryAccountId, primaryAccountName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIamUserResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    primaryAccountId: ").append(toIndentedString(primaryAccountId)).append("\n");
        sb.append("    primaryAccountName: ").append(toIndentedString(primaryAccountName)).append("\n");
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
