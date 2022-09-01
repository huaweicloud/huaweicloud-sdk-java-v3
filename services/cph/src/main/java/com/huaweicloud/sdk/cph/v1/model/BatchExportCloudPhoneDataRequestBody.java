package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchExportCloudPhoneDataRequestBody
 */
public class BatchExportCloudPhoneDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_infos")

    @JacksonXmlProperty(localName = "storage_infos")

    private List<BatchExportCloudPhoneDataRequestBodyStorageInfos> storageInfos = null;

    public BatchExportCloudPhoneDataRequestBody withStorageInfos(
        List<BatchExportCloudPhoneDataRequestBodyStorageInfos> storageInfos) {
        this.storageInfos = storageInfos;
        return this;
    }

    public BatchExportCloudPhoneDataRequestBody addStorageInfosItem(
        BatchExportCloudPhoneDataRequestBodyStorageInfos storageInfosItem) {
        if (this.storageInfos == null) {
            this.storageInfos = new ArrayList<>();
        }
        this.storageInfos.add(storageInfosItem);
        return this;
    }

    public BatchExportCloudPhoneDataRequestBody withStorageInfos(
        Consumer<List<BatchExportCloudPhoneDataRequestBodyStorageInfos>> storageInfosSetter) {
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
    public List<BatchExportCloudPhoneDataRequestBodyStorageInfos> getStorageInfos() {
        return storageInfos;
    }

    public void setStorageInfos(List<BatchExportCloudPhoneDataRequestBodyStorageInfos> storageInfos) {
        this.storageInfos = storageInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchExportCloudPhoneDataRequestBody batchExportCloudPhoneDataRequestBody =
            (BatchExportCloudPhoneDataRequestBody) o;
        return Objects.equals(this.storageInfos, batchExportCloudPhoneDataRequestBody.storageInfos);
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
