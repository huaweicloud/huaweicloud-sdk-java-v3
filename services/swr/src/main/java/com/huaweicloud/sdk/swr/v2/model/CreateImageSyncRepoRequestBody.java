package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateImageSyncRepoRequestBody
 */
public class CreateImageSyncRepoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteRegionId")

    private String remoteRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteNamespace")

    private String remoteNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncAuto")

    private Boolean syncAuto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    private Boolean override;

    public CreateImageSyncRepoRequestBody withRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
        return this;
    }

    /**
     * 目标region ID。
     * @return remoteRegionId
     */
    public String getRemoteRegionId() {
        return remoteRegionId;
    }

    public void setRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
    }

    public CreateImageSyncRepoRequestBody withRemoteNamespace(String remoteNamespace) {
        this.remoteNamespace = remoteNamespace;
        return this;
    }

    /**
     * 目标组织
     * @return remoteNamespace
     */
    public String getRemoteNamespace() {
        return remoteNamespace;
    }

    public void setRemoteNamespace(String remoteNamespace) {
        this.remoteNamespace = remoteNamespace;
    }

    public CreateImageSyncRepoRequestBody withSyncAuto(Boolean syncAuto) {
        this.syncAuto = syncAuto;
        return this;
    }

    /**
     * 自动同步，默认为false
     * @return syncAuto
     */
    public Boolean getSyncAuto() {
        return syncAuto;
    }

    public void setSyncAuto(Boolean syncAuto) {
        this.syncAuto = syncAuto;
    }

    public CreateImageSyncRepoRequestBody withOverride(Boolean override) {
        this.override = override;
        return this;
    }

    /**
     * 是否覆盖，默认为false
     * @return override
     */
    public Boolean getOverride() {
        return override;
    }

    public void setOverride(Boolean override) {
        this.override = override;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateImageSyncRepoRequestBody createImageSyncRepoRequestBody = (CreateImageSyncRepoRequestBody) o;
        return Objects.equals(this.remoteRegionId, createImageSyncRepoRequestBody.remoteRegionId)
            && Objects.equals(this.remoteNamespace, createImageSyncRepoRequestBody.remoteNamespace)
            && Objects.equals(this.syncAuto, createImageSyncRepoRequestBody.syncAuto)
            && Objects.equals(this.override, createImageSyncRepoRequestBody.override);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteRegionId, remoteNamespace, syncAuto, override);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageSyncRepoRequestBody {\n");
        sb.append("    remoteRegionId: ").append(toIndentedString(remoteRegionId)).append("\n");
        sb.append("    remoteNamespace: ").append(toIndentedString(remoteNamespace)).append("\n");
        sb.append("    syncAuto: ").append(toIndentedString(syncAuto)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
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
