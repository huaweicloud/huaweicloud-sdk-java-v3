package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowManagedAccountRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_account_id")

    private String managedAccountId;

    public ShowManagedAccountRequest withManagedAccountId(String managedAccountId) {
        this.managedAccountId = managedAccountId;
        return this;
    }

    /**
     * 纳管账号ID。
     * @return managedAccountId
     */
    public String getManagedAccountId() {
        return managedAccountId;
    }

    public void setManagedAccountId(String managedAccountId) {
        this.managedAccountId = managedAccountId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowManagedAccountRequest that = (ShowManagedAccountRequest) obj;
        return Objects.equals(this.managedAccountId, that.managedAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedAccountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowManagedAccountRequest {\n");
        sb.append("    managedAccountId: ").append(toIndentedString(managedAccountId)).append("\n");
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
