package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 手动同步镜像需要的参数 */
public class CreateManualImageSyncRepoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageTag")

    private List<String> imageTag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    private Boolean override;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteNamespace")

    private String remoteNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remoteRegionId")

    private String remoteRegionId;

    public CreateManualImageSyncRepoRequestBody withImageTag(List<String> imageTag) {
        this.imageTag = imageTag;
        return this;
    }

    public CreateManualImageSyncRepoRequestBody addImageTagItem(String imageTagItem) {
        if (this.imageTag == null) {
            this.imageTag = new ArrayList<>();
        }
        this.imageTag.add(imageTagItem);
        return this;
    }

    public CreateManualImageSyncRepoRequestBody withImageTag(Consumer<List<String>> imageTagSetter) {
        if (this.imageTag == null) {
            this.imageTag = new ArrayList<>();
        }
        imageTagSetter.accept(this.imageTag);
        return this;
    }

    /** 版本列表
     * 
     * @return imageTag */
    public List<String> getImageTag() {
        return imageTag;
    }

    public void setImageTag(List<String> imageTag) {
        this.imageTag = imageTag;
    }

    public CreateManualImageSyncRepoRequestBody withOverride(Boolean override) {
        this.override = override;
        return this;
    }

    /** 是否覆盖，默认为false
     * 
     * @return override */
    public Boolean getOverride() {
        return override;
    }

    public void setOverride(Boolean override) {
        this.override = override;
    }

    public CreateManualImageSyncRepoRequestBody withRemoteNamespace(String remoteNamespace) {
        this.remoteNamespace = remoteNamespace;
        return this;
    }

    /** 目标组织
     * 
     * @return remoteNamespace */
    public String getRemoteNamespace() {
        return remoteNamespace;
    }

    public void setRemoteNamespace(String remoteNamespace) {
        this.remoteNamespace = remoteNamespace;
    }

    public CreateManualImageSyncRepoRequestBody withRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
        return this;
    }

    /** 目标region ID。
     * 
     * @return remoteRegionId */
    public String getRemoteRegionId() {
        return remoteRegionId;
    }

    public void setRemoteRegionId(String remoteRegionId) {
        this.remoteRegionId = remoteRegionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateManualImageSyncRepoRequestBody createManualImageSyncRepoRequestBody =
            (CreateManualImageSyncRepoRequestBody) o;
        return Objects.equals(this.imageTag, createManualImageSyncRepoRequestBody.imageTag)
            && Objects.equals(this.override, createManualImageSyncRepoRequestBody.override)
            && Objects.equals(this.remoteNamespace, createManualImageSyncRepoRequestBody.remoteNamespace)
            && Objects.equals(this.remoteRegionId, createManualImageSyncRepoRequestBody.remoteRegionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageTag, override, remoteNamespace, remoteRegionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateManualImageSyncRepoRequestBody {\n");
        sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
        sb.append("    remoteNamespace: ").append(toIndentedString(remoteNamespace)).append("\n");
        sb.append("    remoteRegionId: ").append(toIndentedString(remoteRegionId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
