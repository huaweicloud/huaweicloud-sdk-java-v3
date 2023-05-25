package com.huaweicloud.sdk.cbr.v1.model;

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
public class ShowStorageUsageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_count")

    private Integer resourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_usage")

    private List<StorageUsage> storageUsage = null;

    public ShowStorageUsageResponse withResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }

    /**
     * 满足过滤条件的资源总条数
     * @return resourceCount
     */
    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }

    public ShowStorageUsageResponse withStorageUsage(List<StorageUsage> storageUsage) {
        this.storageUsage = storageUsage;
        return this;
    }

    public ShowStorageUsageResponse addStorageUsageItem(StorageUsage storageUsageItem) {
        if (this.storageUsage == null) {
            this.storageUsage = new ArrayList<>();
        }
        this.storageUsage.add(storageUsageItem);
        return this;
    }

    public ShowStorageUsageResponse withStorageUsage(Consumer<List<StorageUsage>> storageUsageSetter) {
        if (this.storageUsage == null) {
            this.storageUsage = new ArrayList<>();
        }
        storageUsageSetter.accept(this.storageUsage);
        return this;
    }

    /**
     * 
     * @return storageUsage
     */
    public List<StorageUsage> getStorageUsage() {
        return storageUsage;
    }

    public void setStorageUsage(List<StorageUsage> storageUsage) {
        this.storageUsage = storageUsage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStorageUsageResponse showStorageUsageResponse = (ShowStorageUsageResponse) o;
        return Objects.equals(this.resourceCount, showStorageUsageResponse.resourceCount)
            && Objects.equals(this.storageUsage, showStorageUsageResponse.storageUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceCount, storageUsage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStorageUsageResponse {\n");
        sb.append("    resourceCount: ").append(toIndentedString(resourceCount)).append("\n");
        sb.append("    storageUsage: ").append(toIndentedString(storageUsage)).append("\n");
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
