package com.huaweicloud.sdk.cloudpond.v2.model;

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
public class ListStorageTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_types")

    private List<StorageTypeOption> storageTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListStorageTypesResponse withStorageTypes(List<StorageTypeOption> storageTypes) {
        this.storageTypes = storageTypes;
        return this;
    }

    public ListStorageTypesResponse addStorageTypesItem(StorageTypeOption storageTypesItem) {
        if (this.storageTypes == null) {
            this.storageTypes = new ArrayList<>();
        }
        this.storageTypes.add(storageTypesItem);
        return this;
    }

    public ListStorageTypesResponse withStorageTypes(Consumer<List<StorageTypeOption>> storageTypesSetter) {
        if (this.storageTypes == null) {
            this.storageTypes = new ArrayList<>();
        }
        storageTypesSetter.accept(this.storageTypes);
        return this;
    }

    /**
     * 存储类型列表
     * @return storageTypes
     */
    public List<StorageTypeOption> getStorageTypes() {
        return storageTypes;
    }

    public void setStorageTypes(List<StorageTypeOption> storageTypes) {
        this.storageTypes = storageTypes;
    }

    public ListStorageTypesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListStorageTypesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStorageTypesResponse that = (ListStorageTypesResponse) obj;
        return Objects.equals(this.storageTypes, that.storageTypes) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageTypes, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageTypesResponse {\n");
        sb.append("    storageTypes: ").append(toIndentedString(storageTypes)).append("\n");
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
