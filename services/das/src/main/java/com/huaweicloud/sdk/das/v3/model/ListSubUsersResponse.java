package com.huaweicloud.sdk.das.v3.model;

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
public class ListSubUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<SubUserInfo> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_account_id")

    private String primaryAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_account_name")

    private String primaryAccountName;

    public ListSubUsersResponse withData(List<SubUserInfo> data) {
        this.data = data;
        return this;
    }

    public ListSubUsersResponse addDataItem(SubUserInfo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListSubUsersResponse withData(Consumer<List<SubUserInfo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * IAM用户信息
     * @return data
     */
    public List<SubUserInfo> getData() {
        return data;
    }

    public void setData(List<SubUserInfo> data) {
        this.data = data;
    }

    public ListSubUsersResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSubUsersResponse withPrimaryAccountId(String primaryAccountId) {
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

    public ListSubUsersResponse withPrimaryAccountName(String primaryAccountName) {
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
        ListSubUsersResponse that = (ListSubUsersResponse) obj;
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
        sb.append("class ListSubUsersResponse {\n");
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
