package com.huaweicloud.sdk.sfsturbo.v1.model;

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
public class ListShareTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_types")

    private List<ShareTypeResponseBody> shareTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListShareTypesResponse withShareTypes(List<ShareTypeResponseBody> shareTypes) {
        this.shareTypes = shareTypes;
        return this;
    }

    public ListShareTypesResponse addShareTypesItem(ShareTypeResponseBody shareTypesItem) {
        if (this.shareTypes == null) {
            this.shareTypes = new ArrayList<>();
        }
        this.shareTypes.add(shareTypesItem);
        return this;
    }

    public ListShareTypesResponse withShareTypes(Consumer<List<ShareTypeResponseBody>> shareTypesSetter) {
        if (this.shareTypes == null) {
            this.shareTypes = new ArrayList<>();
        }
        shareTypesSetter.accept(this.shareTypes);
        return this;
    }

    /**
     * 文件系统类型和配额列表
     * @return shareTypes
     */
    public List<ShareTypeResponseBody> getShareTypes() {
        return shareTypes;
    }

    public void setShareTypes(List<ShareTypeResponseBody> shareTypes) {
        this.shareTypes = shareTypes;
    }

    public ListShareTypesResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListShareTypesResponse that = (ListShareTypesResponse) obj;
        return Objects.equals(this.shareTypes, that.shareTypes) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareTypes, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListShareTypesResponse {\n");
        sb.append("    shareTypes: ").append(toIndentedString(shareTypes)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
