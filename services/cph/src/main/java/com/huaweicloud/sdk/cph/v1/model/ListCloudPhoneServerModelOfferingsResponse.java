package com.huaweicloud.sdk.cph.v1.model;

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
public class ListCloudPhoneServerModelOfferingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<ListCloudPhoneServersModelOfferingsResponseBodyModels> models = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListCloudPhoneServersModelOfferingsResponseBodyPageInfo pageInfo;

    public ListCloudPhoneServerModelOfferingsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCloudPhoneServerModelOfferingsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 规格总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListCloudPhoneServerModelOfferingsResponse withModels(
        List<ListCloudPhoneServersModelOfferingsResponseBodyModels> models) {
        this.models = models;
        return this;
    }

    public ListCloudPhoneServerModelOfferingsResponse addModelsItem(
        ListCloudPhoneServersModelOfferingsResponseBodyModels modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public ListCloudPhoneServerModelOfferingsResponse withModels(
        Consumer<List<ListCloudPhoneServersModelOfferingsResponseBodyModels>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * 云手机服务器规格信息
     * @return models
     */
    public List<ListCloudPhoneServersModelOfferingsResponseBodyModels> getModels() {
        return models;
    }

    public void setModels(List<ListCloudPhoneServersModelOfferingsResponseBodyModels> models) {
        this.models = models;
    }

    public ListCloudPhoneServerModelOfferingsResponse withPageInfo(
        ListCloudPhoneServersModelOfferingsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCloudPhoneServerModelOfferingsResponse withPageInfo(
        Consumer<ListCloudPhoneServersModelOfferingsResponseBodyPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ListCloudPhoneServersModelOfferingsResponseBodyPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ListCloudPhoneServersModelOfferingsResponseBodyPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ListCloudPhoneServersModelOfferingsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudPhoneServerModelOfferingsResponse that = (ListCloudPhoneServerModelOfferingsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.count, that.count)
            && Objects.equals(this.models, that.models) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, count, models, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudPhoneServerModelOfferingsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
