package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListAccessClientInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_client_infos")

    private List<AccessClientInfo> accessClientInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAccessClientInfosResponse withAccessClientInfos(List<AccessClientInfo> accessClientInfos) {
        this.accessClientInfos = accessClientInfos;
        return this;
    }

    public ListAccessClientInfosResponse addAccessClientInfosItem(AccessClientInfo accessClientInfosItem) {
        if (this.accessClientInfos == null) {
            this.accessClientInfos = new ArrayList<>();
        }
        this.accessClientInfos.add(accessClientInfosItem);
        return this;
    }

    public ListAccessClientInfosResponse withAccessClientInfos(
        Consumer<List<AccessClientInfo>> accessClientInfosSetter) {
        if (this.accessClientInfos == null) {
            this.accessClientInfos = new ArrayList<>();
        }
        accessClientInfosSetter.accept(this.accessClientInfos);
        return this;
    }

    /**
     * 接入客户端信息列表
     * @return accessClientInfos
     */
    public List<AccessClientInfo> getAccessClientInfos() {
        return accessClientInfos;
    }

    public void setAccessClientInfos(List<AccessClientInfo> accessClientInfos) {
        this.accessClientInfos = accessClientInfos;
    }

    public ListAccessClientInfosResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 接入客户端信息总数
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessClientInfosResponse that = (ListAccessClientInfosResponse) obj;
        return Objects.equals(this.accessClientInfos, that.accessClientInfos) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessClientInfos, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessClientInfosResponse {\n");
        sb.append("    accessClientInfos: ").append(toIndentedString(accessClientInfos)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
