package com.huaweicloud.sdk.organizations.v1.model;

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
public class ListCloseAccountStatusesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_account_statuses")

    private List<CloseAccountStatusDto> closeAccountStatuses = null;

    public ListCloseAccountStatusesResponse withCloseAccountStatuses(List<CloseAccountStatusDto> closeAccountStatuses) {
        this.closeAccountStatuses = closeAccountStatuses;
        return this;
    }

    public ListCloseAccountStatusesResponse addCloseAccountStatusesItem(
        CloseAccountStatusDto closeAccountStatusesItem) {
        if (this.closeAccountStatuses == null) {
            this.closeAccountStatuses = new ArrayList<>();
        }
        this.closeAccountStatuses.add(closeAccountStatusesItem);
        return this;
    }

    public ListCloseAccountStatusesResponse withCloseAccountStatuses(
        Consumer<List<CloseAccountStatusDto>> closeAccountStatusesSetter) {
        if (this.closeAccountStatuses == null) {
            this.closeAccountStatuses = new ArrayList<>();
        }
        closeAccountStatusesSetter.accept(this.closeAccountStatuses);
        return this;
    }

    /**
     * 包含有关请求的详细信息的对象列表。
     * @return closeAccountStatuses
     */
    public List<CloseAccountStatusDto> getCloseAccountStatuses() {
        return closeAccountStatuses;
    }

    public void setCloseAccountStatuses(List<CloseAccountStatusDto> closeAccountStatuses) {
        this.closeAccountStatuses = closeAccountStatuses;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloseAccountStatusesResponse that = (ListCloseAccountStatusesResponse) obj;
        return Objects.equals(this.closeAccountStatuses, that.closeAccountStatuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(closeAccountStatuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloseAccountStatusesResponse {\n");
        sb.append("    closeAccountStatuses: ").append(toIndentedString(closeAccountStatuses)).append("\n");
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
