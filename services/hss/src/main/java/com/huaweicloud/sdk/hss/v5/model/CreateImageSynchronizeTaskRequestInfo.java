package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateImageSynchronizeTaskRequestInfo
 */
public class CreateImageSynchronizeTaskRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_all_registries")

    private Boolean syncAllRegistries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_info")

    private List<CreateImageSynchronizeTaskRequestInfoRegistryInfo> registryInfo = null;

    public CreateImageSynchronizeTaskRequestInfo withSyncAllRegistries(Boolean syncAllRegistries) {
        this.syncAllRegistries = syncAllRegistries;
        return this;
    }

    /**
     * 同步全部仓库镜像 | true 同步全部镜像 false 指定镜像仓同步
     * @return syncAllRegistries
     */
    public Boolean getSyncAllRegistries() {
        return syncAllRegistries;
    }

    public void setSyncAllRegistries(Boolean syncAllRegistries) {
        this.syncAllRegistries = syncAllRegistries;
    }

    public CreateImageSynchronizeTaskRequestInfo withRegistryInfo(
        List<CreateImageSynchronizeTaskRequestInfoRegistryInfo> registryInfo) {
        this.registryInfo = registryInfo;
        return this;
    }

    public CreateImageSynchronizeTaskRequestInfo addRegistryInfoItem(
        CreateImageSynchronizeTaskRequestInfoRegistryInfo registryInfoItem) {
        if (this.registryInfo == null) {
            this.registryInfo = new ArrayList<>();
        }
        this.registryInfo.add(registryInfoItem);
        return this;
    }

    public CreateImageSynchronizeTaskRequestInfo withRegistryInfo(
        Consumer<List<CreateImageSynchronizeTaskRequestInfoRegistryInfo>> registryInfoSetter) {
        if (this.registryInfo == null) {
            this.registryInfo = new ArrayList<>();
        }
        registryInfoSetter.accept(this.registryInfo);
        return this;
    }

    /**
     * 待同步镜像仓
     * @return registryInfo
     */
    public List<CreateImageSynchronizeTaskRequestInfoRegistryInfo> getRegistryInfo() {
        return registryInfo;
    }

    public void setRegistryInfo(List<CreateImageSynchronizeTaskRequestInfoRegistryInfo> registryInfo) {
        this.registryInfo = registryInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateImageSynchronizeTaskRequestInfo that = (CreateImageSynchronizeTaskRequestInfo) obj;
        return Objects.equals(this.syncAllRegistries, that.syncAllRegistries)
            && Objects.equals(this.registryInfo, that.registryInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncAllRegistries, registryInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageSynchronizeTaskRequestInfo {\n");
        sb.append("    syncAllRegistries: ").append(toIndentedString(syncAllRegistries)).append("\n");
        sb.append("    registryInfo: ").append(toIndentedString(registryInfo)).append("\n");
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
