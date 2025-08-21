package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRemoteMirrorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_status")

    private String updateStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_at")

    private String lastUpdateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_successful_update_at")

    private String lastSuccessfulUpdateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_failures")

    private Integer numberOfFailures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirroring_enabled")

    private Boolean mirroringEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_private")

    private Boolean isPrivate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_uuid")

    private String endpointUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_error")

    private String lastError;

    public ShowRemoteMirrorResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库镜像配置ID。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowRemoteMirrorResponse withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库ID。
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowRemoteMirrorResponse withUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }

    /**
     * **参数解释：** 同步状态。
     * @return updateStatus
     */
    public String getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    public ShowRemoteMirrorResponse withLastUpdateAt(String lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
        return this;
    }

    /**
     * **参数解释：** 最近修改时间。
     * @return lastUpdateAt
     */
    public String getLastUpdateAt() {
        return lastUpdateAt;
    }

    public void setLastUpdateAt(String lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }

    public ShowRemoteMirrorResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** 镜像地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowRemoteMirrorResponse withLastSuccessfulUpdateAt(String lastSuccessfulUpdateAt) {
        this.lastSuccessfulUpdateAt = lastSuccessfulUpdateAt;
        return this;
    }

    /**
     * **参数解释：** 最近同步成功时间。
     * @return lastSuccessfulUpdateAt
     */
    public String getLastSuccessfulUpdateAt() {
        return lastSuccessfulUpdateAt;
    }

    public void setLastSuccessfulUpdateAt(String lastSuccessfulUpdateAt) {
        this.lastSuccessfulUpdateAt = lastSuccessfulUpdateAt;
    }

    public ShowRemoteMirrorResponse withNumberOfFailures(Integer numberOfFailures) {
        this.numberOfFailures = numberOfFailures;
        return this;
    }

    /**
     * **参数解释：** 同步失败次数。
     * @return numberOfFailures
     */
    public Integer getNumberOfFailures() {
        return numberOfFailures;
    }

    public void setNumberOfFailures(Integer numberOfFailures) {
        this.numberOfFailures = numberOfFailures;
    }

    public ShowRemoteMirrorResponse withMirroringEnabled(Boolean mirroringEnabled) {
        this.mirroringEnabled = mirroringEnabled;
        return this;
    }

    /**
     * **参数解释：** 开启定时同步。
     * @return mirroringEnabled
     */
    public Boolean getMirroringEnabled() {
        return mirroringEnabled;
    }

    public void setMirroringEnabled(Boolean mirroringEnabled) {
        this.mirroringEnabled = mirroringEnabled;
    }

    public ShowRemoteMirrorResponse withIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * **参数解释：** 私有镜像。
     * @return isPrivate
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public ShowRemoteMirrorResponse withEndpointUuid(String endpointUuid) {
        this.endpointUuid = endpointUuid;
        return this;
    }

    /**
     * **参数解释：** 拓展点uuid。
     * @return endpointUuid
     */
    public String getEndpointUuid() {
        return endpointUuid;
    }

    public void setEndpointUuid(String endpointUuid) {
        this.endpointUuid = endpointUuid;
    }

    public ShowRemoteMirrorResponse withLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    /**
     * **参数解释：** 最近失败信息。
     * @return lastError
     */
    public String getLastError() {
        return lastError;
    }

    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRemoteMirrorResponse that = (ShowRemoteMirrorResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.updateStatus, that.updateStatus)
            && Objects.equals(this.lastUpdateAt, that.lastUpdateAt) && Objects.equals(this.url, that.url)
            && Objects.equals(this.lastSuccessfulUpdateAt, that.lastSuccessfulUpdateAt)
            && Objects.equals(this.numberOfFailures, that.numberOfFailures)
            && Objects.equals(this.mirroringEnabled, that.mirroringEnabled)
            && Objects.equals(this.isPrivate, that.isPrivate) && Objects.equals(this.endpointUuid, that.endpointUuid)
            && Objects.equals(this.lastError, that.lastError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            repositoryId,
            updateStatus,
            lastUpdateAt,
            url,
            lastSuccessfulUpdateAt,
            numberOfFailures,
            mirroringEnabled,
            isPrivate,
            endpointUuid,
            lastError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRemoteMirrorResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
        sb.append("    lastUpdateAt: ").append(toIndentedString(lastUpdateAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    lastSuccessfulUpdateAt: ").append(toIndentedString(lastSuccessfulUpdateAt)).append("\n");
        sb.append("    numberOfFailures: ").append(toIndentedString(numberOfFailures)).append("\n");
        sb.append("    mirroringEnabled: ").append(toIndentedString(mirroringEnabled)).append("\n");
        sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
        sb.append("    endpointUuid: ").append(toIndentedString(endpointUuid)).append("\n");
        sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
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
