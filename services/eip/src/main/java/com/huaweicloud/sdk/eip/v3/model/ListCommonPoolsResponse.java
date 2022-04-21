package com.huaweicloud.sdk.eip.v3.model;

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
public class ListCommonPoolsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_pools")

    private List<CommonPoolDict> commonPools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListCommonPoolsResponse withCommonPools(List<CommonPoolDict> commonPools) {
        this.commonPools = commonPools;
        return this;
    }

    public ListCommonPoolsResponse addCommonPoolsItem(CommonPoolDict commonPoolsItem) {
        if (this.commonPools == null) {
            this.commonPools = new ArrayList<>();
        }
        this.commonPools.add(commonPoolsItem);
        return this;
    }

    public ListCommonPoolsResponse withCommonPools(Consumer<List<CommonPoolDict>> commonPoolsSetter) {
        if (this.commonPools == null) {
            this.commonPools = new ArrayList<>();
        }
        commonPoolsSetter.accept(this.commonPools);
        return this;
    }

    /**
     * 功能说明：公共池对象
     * @return commonPools
     */
    public List<CommonPoolDict> getCommonPools() {
        return commonPools;
    }

    public void setCommonPools(List<CommonPoolDict> commonPools) {
        this.commonPools = commonPools;
    }

    public ListCommonPoolsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCommonPoolsResponse listCommonPoolsResponse = (ListCommonPoolsResponse) o;
        return Objects.equals(this.commonPools, listCommonPoolsResponse.commonPools)
            && Objects.equals(this.requestId, listCommonPoolsResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonPools, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommonPoolsResponse {\n");
        sb.append("    commonPools: ").append(toIndentedString(commonPools)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
