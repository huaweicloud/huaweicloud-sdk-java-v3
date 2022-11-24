package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDataPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_delete")

    private Boolean dataDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_download")

    private Boolean dataDownload;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_encrypted")

    private Boolean dataEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_share")

    private Boolean dataShare;

    public ShowDataPolicyResponse withDataDelete(Boolean dataDelete) {
        this.dataDelete = dataDelete;
        return this;
    }

    /**
     * 项目级删除策略（true：允许项目数据删除操作，false：不允许删除操作，默认为true）
     * @return dataDelete
     */
    public Boolean getDataDelete() {
        return dataDelete;
    }

    public void setDataDelete(Boolean dataDelete) {
        this.dataDelete = dataDelete;
    }

    public ShowDataPolicyResponse withDataDownload(Boolean dataDownload) {
        this.dataDownload = dataDownload;
        return this;
    }

    /**
     * 项目级下载策略（true：允许项目数据下载操作，false：不允许下载操作，默认为true）
     * @return dataDownload
     */
    public Boolean getDataDownload() {
        return dataDownload;
    }

    public void setDataDownload(Boolean dataDownload) {
        this.dataDownload = dataDownload;
    }

    public ShowDataPolicyResponse withDataEncrypted(Boolean dataEncrypted) {
        this.dataEncrypted = dataEncrypted;
        return this;
    }

    /**
     * 项目级加密策略（true：允许项目数据加密操作，false：不允许加密操作，默认为false）
     * @return dataEncrypted
     */
    public Boolean getDataEncrypted() {
        return dataEncrypted;
    }

    public void setDataEncrypted(Boolean dataEncrypted) {
        this.dataEncrypted = dataEncrypted;
    }

    public ShowDataPolicyResponse withDataShare(Boolean dataShare) {
        this.dataShare = dataShare;
        return this;
    }

    /**
     * 项目级分享策略（true：允许项目数据拷贝/引用操作，false：不允许拷贝/引用操作，默认为true）
     * @return dataShare
     */
    public Boolean getDataShare() {
        return dataShare;
    }

    public void setDataShare(Boolean dataShare) {
        this.dataShare = dataShare;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDataPolicyResponse showDataPolicyResponse = (ShowDataPolicyResponse) o;
        return Objects.equals(this.dataDelete, showDataPolicyResponse.dataDelete)
            && Objects.equals(this.dataDownload, showDataPolicyResponse.dataDownload)
            && Objects.equals(this.dataEncrypted, showDataPolicyResponse.dataEncrypted)
            && Objects.equals(this.dataShare, showDataPolicyResponse.dataShare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataDelete, dataDownload, dataEncrypted, dataShare);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataPolicyResponse {\n");
        sb.append("    dataDelete: ").append(toIndentedString(dataDelete)).append("\n");
        sb.append("    dataDownload: ").append(toIndentedString(dataDownload)).append("\n");
        sb.append("    dataEncrypted: ").append(toIndentedString(dataEncrypted)).append("\n");
        sb.append("    dataShare: ").append(toIndentedString(dataShare)).append("\n");
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
