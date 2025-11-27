package com.huaweicloud.sdk.cdn.v2.model;

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
public class ListDomainConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname_status")

    private List<CnameStatus> cnameStatus = null;

    public ListDomainConfigsResponse withCnameStatus(List<CnameStatus> cnameStatus) {
        this.cnameStatus = cnameStatus;
        return this;
    }

    public ListDomainConfigsResponse addCnameStatusItem(CnameStatus cnameStatusItem) {
        if (this.cnameStatus == null) {
            this.cnameStatus = new ArrayList<>();
        }
        this.cnameStatus.add(cnameStatusItem);
        return this;
    }

    public ListDomainConfigsResponse withCnameStatus(Consumer<List<CnameStatus>> cnameStatusSetter) {
        if (this.cnameStatus == null) {
            this.cnameStatus = new ArrayList<>();
        }
        cnameStatusSetter.accept(this.cnameStatus);
        return this;
    }

    /**
     * 域名cname状态。
     * @return cnameStatus
     */
    public List<CnameStatus> getCnameStatus() {
        return cnameStatus;
    }

    public void setCnameStatus(List<CnameStatus> cnameStatus) {
        this.cnameStatus = cnameStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDomainConfigsResponse that = (ListDomainConfigsResponse) obj;
        return Objects.equals(this.cnameStatus, that.cnameStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnameStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDomainConfigsResponse {\n");
        sb.append("    cnameStatus: ").append(toIndentedString(cnameStatus)).append("\n");
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
