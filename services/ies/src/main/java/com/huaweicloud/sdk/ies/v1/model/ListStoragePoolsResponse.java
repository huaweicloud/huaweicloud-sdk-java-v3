package com.huaweicloud.sdk.ies.v1.model;

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
public class ListStoragePoolsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_pools")

    private List<StoragePool> storagePools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListStoragePoolsResponse withStoragePools(List<StoragePool> storagePools) {
        this.storagePools = storagePools;
        return this;
    }

    public ListStoragePoolsResponse addStoragePoolsItem(StoragePool storagePoolsItem) {
        if (this.storagePools == null) {
            this.storagePools = new ArrayList<>();
        }
        this.storagePools.add(storagePoolsItem);
        return this;
    }

    public ListStoragePoolsResponse withStoragePools(Consumer<List<StoragePool>> storagePoolsSetter) {
        if (this.storagePools == null) {
            this.storagePools = new ArrayList<>();
        }
        storagePoolsSetter.accept(this.storagePools);
        return this;
    }

    /**
     * 存储池列表
     * @return storagePools
     */
    public List<StoragePool> getStoragePools() {
        return storagePools;
    }

    public void setStoragePools(List<StoragePool> storagePools) {
        this.storagePools = storagePools;
    }

    public ListStoragePoolsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListStoragePoolsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStoragePoolsResponse listStoragePoolsResponse = (ListStoragePoolsResponse) o;
        return Objects.equals(this.storagePools, listStoragePoolsResponse.storagePools)
            && Objects.equals(this.pageInfo, listStoragePoolsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storagePools, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStoragePoolsResponse {\n");
        sb.append("    storagePools: ").append(toIndentedString(storagePools)).append("\n");
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
