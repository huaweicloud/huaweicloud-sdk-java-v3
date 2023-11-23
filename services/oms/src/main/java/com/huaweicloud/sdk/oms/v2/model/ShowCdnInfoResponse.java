package com.huaweicloud.sdk.oms.v2.model;

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
public class ShowCdnInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_same_cloud_type")

    private Boolean isSameCloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_download_available")

    private Boolean isDownloadAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checked_keys")

    private List<CheckedKey> checkedKeys = null;

    public ShowCdnInfoResponse withIsSameCloudType(Boolean isSameCloudType) {
        this.isSameCloudType = isSameCloudType;
        return this;
    }

    /**
     * 是否相同云类型
     * @return isSameCloudType
     */
    public Boolean getIsSameCloudType() {
        return isSameCloudType;
    }

    public void setIsSameCloudType(Boolean isSameCloudType) {
        this.isSameCloudType = isSameCloudType;
    }

    public ShowCdnInfoResponse withIsDownloadAvailable(Boolean isDownloadAvailable) {
        this.isDownloadAvailable = isDownloadAvailable;
        return this;
    }

    /**
     * 是否下载可用
     * @return isDownloadAvailable
     */
    public Boolean getIsDownloadAvailable() {
        return isDownloadAvailable;
    }

    public void setIsDownloadAvailable(Boolean isDownloadAvailable) {
        this.isDownloadAvailable = isDownloadAvailable;
    }

    public ShowCdnInfoResponse withCheckedKeys(List<CheckedKey> checkedKeys) {
        this.checkedKeys = checkedKeys;
        return this;
    }

    public ShowCdnInfoResponse addCheckedKeysItem(CheckedKey checkedKeysItem) {
        if (this.checkedKeys == null) {
            this.checkedKeys = new ArrayList<>();
        }
        this.checkedKeys.add(checkedKeysItem);
        return this;
    }

    public ShowCdnInfoResponse withCheckedKeys(Consumer<List<CheckedKey>> checkedKeysSetter) {
        if (this.checkedKeys == null) {
            this.checkedKeys = new ArrayList<>();
        }
        checkedKeysSetter.accept(this.checkedKeys);
        return this;
    }

    /**
     * 返回的已检查的对象数组
     * @return checkedKeys
     */
    public List<CheckedKey> getCheckedKeys() {
        return checkedKeys;
    }

    public void setCheckedKeys(List<CheckedKey> checkedKeys) {
        this.checkedKeys = checkedKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCdnInfoResponse that = (ShowCdnInfoResponse) obj;
        return Objects.equals(this.isSameCloudType, that.isSameCloudType)
            && Objects.equals(this.isDownloadAvailable, that.isDownloadAvailable)
            && Objects.equals(this.checkedKeys, that.checkedKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSameCloudType, isDownloadAvailable, checkedKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCdnInfoResponse {\n");
        sb.append("    isSameCloudType: ").append(toIndentedString(isSameCloudType)).append("\n");
        sb.append("    isDownloadAvailable: ").append(toIndentedString(isDownloadAvailable)).append("\n");
        sb.append("    checkedKeys: ").append(toIndentedString(checkedKeys)).append("\n");
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
