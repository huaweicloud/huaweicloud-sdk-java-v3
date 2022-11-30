package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入云手机数据请求体
 */
public class BatchImportCloudPhoneDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_infos")

    private List<RestoreInfo> restoreInfos = null;

    public BatchImportCloudPhoneDataRequestBody withRestoreInfos(List<RestoreInfo> restoreInfos) {
        this.restoreInfos = restoreInfos;
        return this;
    }

    public BatchImportCloudPhoneDataRequestBody addRestoreInfosItem(RestoreInfo restoreInfosItem) {
        if (this.restoreInfos == null) {
            this.restoreInfos = new ArrayList<>();
        }
        this.restoreInfos.add(restoreInfosItem);
        return this;
    }

    public BatchImportCloudPhoneDataRequestBody withRestoreInfos(Consumer<List<RestoreInfo>> restoreInfosSetter) {
        if (this.restoreInfos == null) {
            this.restoreInfos = new ArrayList<>();
        }
        restoreInfosSetter.accept(this.restoreInfos);
        return this;
    }

    /**
     * 待导入数据的云手机信息
     * @return restoreInfos
     */
    public List<RestoreInfo> getRestoreInfos() {
        return restoreInfos;
    }

    public void setRestoreInfos(List<RestoreInfo> restoreInfos) {
        this.restoreInfos = restoreInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchImportCloudPhoneDataRequestBody batchImportCloudPhoneDataRequestBody =
            (BatchImportCloudPhoneDataRequestBody) o;
        return Objects.equals(this.restoreInfos, batchImportCloudPhoneDataRequestBody.restoreInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchImportCloudPhoneDataRequestBody {\n");
        sb.append("    restoreInfos: ").append(toIndentedString(restoreInfos)).append("\n");
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
