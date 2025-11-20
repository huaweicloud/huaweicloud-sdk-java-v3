package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowTenantUserConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "my_collections")

    private List<CollectionInfo> myCollections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowTenantUserConfigurationResponse withMyCollections(List<CollectionInfo> myCollections) {
        this.myCollections = myCollections;
        return this;
    }

    public ShowTenantUserConfigurationResponse addMyCollectionsItem(CollectionInfo myCollectionsItem) {
        if (this.myCollections == null) {
            this.myCollections = new ArrayList<>();
        }
        this.myCollections.add(myCollectionsItem);
        return this;
    }

    public ShowTenantUserConfigurationResponse withMyCollections(Consumer<List<CollectionInfo>> myCollectionsSetter) {
        if (this.myCollections == null) {
            this.myCollections = new ArrayList<>();
        }
        myCollectionsSetter.accept(this.myCollections);
        return this;
    }

    /**
     * 我的收藏列表
     * @return myCollections
     */
    public List<CollectionInfo> getMyCollections() {
        return myCollections;
    }

    public void setMyCollections(List<CollectionInfo> myCollections) {
        this.myCollections = myCollections;
    }

    public ShowTenantUserConfigurationResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
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
        ShowTenantUserConfigurationResponse that = (ShowTenantUserConfigurationResponse) obj;
        return Objects.equals(this.myCollections, that.myCollections)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myCollections, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTenantUserConfigurationResponse {\n");
        sb.append("    myCollections: ").append(toIndentedString(myCollections)).append("\n");
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
