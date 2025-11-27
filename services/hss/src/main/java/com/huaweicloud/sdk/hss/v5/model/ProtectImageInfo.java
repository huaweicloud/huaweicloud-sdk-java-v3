package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 防护的容器镜像信息 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及 
 */
public class ProtectImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_directory_info_list")

    private List<ProtectDirectoryInfo> protectDirectoryInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_file_types")

    private List<String> excludeFileTypes = null;

    public ProtectImageInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**： 镜像名称 **约束限制**: 不涉及 **取值范围**： 字符长度1-256位 **默认取值**: 不涉及 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ProtectImageInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**： 镜像版本 **约束限制**: 不涉及 **取值范围**： 字符长度0-64位 **默认取值**: 不涉及 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public ProtectImageInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**： 镜像类型 **约束限制**: 不涉及 **取值范围**： - registry 仓库镜像 - local 本地镜像 - custom 自定义镜像  **默认取值**: custom 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ProtectImageInfo withProtectDirectoryInfoList(List<ProtectDirectoryInfo> protectDirectoryInfoList) {
        this.protectDirectoryInfoList = protectDirectoryInfoList;
        return this;
    }

    public ProtectImageInfo addProtectDirectoryInfoListItem(ProtectDirectoryInfo protectDirectoryInfoListItem) {
        if (this.protectDirectoryInfoList == null) {
            this.protectDirectoryInfoList = new ArrayList<>();
        }
        this.protectDirectoryInfoList.add(protectDirectoryInfoListItem);
        return this;
    }

    public ProtectImageInfo withProtectDirectoryInfoList(
        Consumer<List<ProtectDirectoryInfo>> protectDirectoryInfoListSetter) {
        if (this.protectDirectoryInfoList == null) {
            this.protectDirectoryInfoList = new ArrayList<>();
        }
        protectDirectoryInfoListSetter.accept(this.protectDirectoryInfoList);
        return this;
    }

    /**
     * **参数解释**： 防护目录信息 **约束限制**: 不涉及 **取值范围**： 最少1条，最多50条 **默认取值**: 不涉及 
     * @return protectDirectoryInfoList
     */
    public List<ProtectDirectoryInfo> getProtectDirectoryInfoList() {
        return protectDirectoryInfoList;
    }

    public void setProtectDirectoryInfoList(List<ProtectDirectoryInfo> protectDirectoryInfoList) {
        this.protectDirectoryInfoList = protectDirectoryInfoList;
    }

    public ProtectImageInfo withExcludeFileTypes(List<String> excludeFileTypes) {
        this.excludeFileTypes = excludeFileTypes;
        return this;
    }

    public ProtectImageInfo addExcludeFileTypesItem(String excludeFileTypesItem) {
        if (this.excludeFileTypes == null) {
            this.excludeFileTypes = new ArrayList<>();
        }
        this.excludeFileTypes.add(excludeFileTypesItem);
        return this;
    }

    public ProtectImageInfo withExcludeFileTypes(Consumer<List<String>> excludeFileTypesSetter) {
        if (this.excludeFileTypes == null) {
            this.excludeFileTypes = new ArrayList<>();
        }
        excludeFileTypesSetter.accept(this.excludeFileTypes);
        return this;
    }

    /**
     * **参数解释**： 防护排除的文件类型列表 **约束限制**: 不涉及 **取值范围**： 最少0条，最多10条 **默认取值**: 不涉及 
     * @return excludeFileTypes
     */
    public List<String> getExcludeFileTypes() {
        return excludeFileTypes;
    }

    public void setExcludeFileTypes(List<String> excludeFileTypes) {
        this.excludeFileTypes = excludeFileTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectImageInfo that = (ProtectImageInfo) obj;
        return Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.protectDirectoryInfoList, that.protectDirectoryInfoList)
            && Objects.equals(this.excludeFileTypes, that.excludeFileTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName, imageVersion, imageType, protectDirectoryInfoList, excludeFileTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectImageInfo {\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    protectDirectoryInfoList: ").append(toIndentedString(protectDirectoryInfoList)).append("\n");
        sb.append("    excludeFileTypes: ").append(toIndentedString(excludeFileTypes)).append("\n");
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
