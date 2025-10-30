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
public class ListStorageGearsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_gears")

    private List<StorageGearV2> storageGears = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListStorageGearsResponse withStorageGears(List<StorageGearV2> storageGears) {
        this.storageGears = storageGears;
        return this;
    }

    public ListStorageGearsResponse addStorageGearsItem(StorageGearV2 storageGearsItem) {
        if (this.storageGears == null) {
            this.storageGears = new ArrayList<>();
        }
        this.storageGears.add(storageGearsItem);
        return this;
    }

    public ListStorageGearsResponse withStorageGears(Consumer<List<StorageGearV2>> storageGearsSetter) {
        if (this.storageGears == null) {
            this.storageGears = new ArrayList<>();
        }
        storageGearsSetter.accept(this.storageGears);
        return this;
    }

    /**
     * 支持的存储档位列表
     * @return storageGears
     */
    public List<StorageGearV2> getStorageGears() {
        return storageGears;
    }

    public void setStorageGears(List<StorageGearV2> storageGears) {
        this.storageGears = storageGears;
    }

    public ListStorageGearsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListStorageGearsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListStorageGearsResponse that = (ListStorageGearsResponse) obj;
        return Objects.equals(this.storageGears, that.storageGears) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageGears, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStorageGearsResponse {\n");
        sb.append("    storageGears: ").append(toIndentedString(storageGears)).append("\n");
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
