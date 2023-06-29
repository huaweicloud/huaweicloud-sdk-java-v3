package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出云手机数据请求体。
 */
public class BatchExportCloudPhoneDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_infos")

    private List<StorageInfo> storageInfos = null;

    public BatchExportCloudPhoneDataRequestBody withStorageInfos(List<StorageInfo> storageInfos) {
        this.storageInfos = storageInfos;
        return this;
    }

    public BatchExportCloudPhoneDataRequestBody addStorageInfosItem(StorageInfo storageInfosItem) {
        if (this.storageInfos == null) {
            this.storageInfos = new ArrayList<>();
        }
        this.storageInfos.add(storageInfosItem);
        return this;
    }

    public BatchExportCloudPhoneDataRequestBody withStorageInfos(Consumer<List<StorageInfo>> storageInfosSetter) {
        if (this.storageInfos == null) {
            this.storageInfos = new ArrayList<>();
        }
        storageInfosSetter.accept(this.storageInfos);
        return this;
    }

    /**
     * 待导出数据的云手机信息
     * @return storageInfos
     */
    public List<StorageInfo> getStorageInfos() {
        return storageInfos;
    }

    public void setStorageInfos(List<StorageInfo> storageInfos) {
        this.storageInfos = storageInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchExportCloudPhoneDataRequestBody that = (BatchExportCloudPhoneDataRequestBody) obj;
        return Objects.equals(this.storageInfos, that.storageInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchExportCloudPhoneDataRequestBody {\n");
        sb.append("    storageInfos: ").append(toIndentedString(storageInfos)).append("\n");
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
