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
public class ListPublicBorderGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_groups")

    private List<CommonPoolsWithBorderGroupDict> publicBorderGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListPublicBorderGroupsResponse withPublicBorderGroups(
        List<CommonPoolsWithBorderGroupDict> publicBorderGroups) {
        this.publicBorderGroups = publicBorderGroups;
        return this;
    }

    public ListPublicBorderGroupsResponse addPublicBorderGroupsItem(
        CommonPoolsWithBorderGroupDict publicBorderGroupsItem) {
        if (this.publicBorderGroups == null) {
            this.publicBorderGroups = new ArrayList<>();
        }
        this.publicBorderGroups.add(publicBorderGroupsItem);
        return this;
    }

    public ListPublicBorderGroupsResponse withPublicBorderGroups(
        Consumer<List<CommonPoolsWithBorderGroupDict>> publicBorderGroupsSetter) {
        if (this.publicBorderGroups == null) {
            this.publicBorderGroups = new ArrayList<>();
        }
        publicBorderGroupsSetter.accept(this.publicBorderGroups);
        return this;
    }

    /**
     * 功能说明：公共池分组对象
     * @return publicBorderGroups
     */
    public List<CommonPoolsWithBorderGroupDict> getPublicBorderGroups() {
        return publicBorderGroups;
    }

    public void setPublicBorderGroups(List<CommonPoolsWithBorderGroupDict> publicBorderGroups) {
        this.publicBorderGroups = publicBorderGroups;
    }

    public ListPublicBorderGroupsResponse withRequestId(String requestId) {
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
        ListPublicBorderGroupsResponse listPublicBorderGroupsResponse = (ListPublicBorderGroupsResponse) o;
        return Objects.equals(this.publicBorderGroups, listPublicBorderGroupsResponse.publicBorderGroups)
            && Objects.equals(this.requestId, listPublicBorderGroupsResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicBorderGroups, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicBorderGroupsResponse {\n");
        sb.append("    publicBorderGroups: ").append(toIndentedString(publicBorderGroups)).append("\n");
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
