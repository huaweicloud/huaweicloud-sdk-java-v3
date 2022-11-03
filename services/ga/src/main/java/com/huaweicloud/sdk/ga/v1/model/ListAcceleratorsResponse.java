package com.huaweicloud.sdk.ga.v1.model;

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
public class ListAcceleratorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accelerators")

    private List<AcceleratorDetail> accelerators = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListAcceleratorsResponse withAccelerators(List<AcceleratorDetail> accelerators) {
        this.accelerators = accelerators;
        return this;
    }

    public ListAcceleratorsResponse addAcceleratorsItem(AcceleratorDetail acceleratorsItem) {
        if (this.accelerators == null) {
            this.accelerators = new ArrayList<>();
        }
        this.accelerators.add(acceleratorsItem);
        return this;
    }

    public ListAcceleratorsResponse withAccelerators(Consumer<List<AcceleratorDetail>> acceleratorsSetter) {
        if (this.accelerators == null) {
            this.accelerators = new ArrayList<>();
        }
        acceleratorsSetter.accept(this.accelerators);
        return this;
    }

    /**
     * 全球加速器列表。
     * @return accelerators
     */
    public List<AcceleratorDetail> getAccelerators() {
        return accelerators;
    }

    public void setAccelerators(List<AcceleratorDetail> accelerators) {
        this.accelerators = accelerators;
    }

    public ListAcceleratorsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAcceleratorsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListAcceleratorsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
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
        ListAcceleratorsResponse listAcceleratorsResponse = (ListAcceleratorsResponse) o;
        return Objects.equals(this.accelerators, listAcceleratorsResponse.accelerators)
            && Objects.equals(this.pageInfo, listAcceleratorsResponse.pageInfo)
            && Objects.equals(this.requestId, listAcceleratorsResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accelerators, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAcceleratorsResponse {\n");
        sb.append("    accelerators: ").append(toIndentedString(accelerators)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
