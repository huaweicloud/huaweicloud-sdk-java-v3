package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桌面转镜像请求。
 */
public class DesktopToImageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_description")

    private String imageDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_sysprep")

    private Boolean executeSysprep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_tags")

    private List<TagKeyValue> imageTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_ram")

    private String maxRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ram")

    private String minRam;

    public DesktopToImageReq withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public DesktopToImageReq withImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
        return this;
    }

    /**
     * 镜像描述信息。
     * @return imageDescription
     */
    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public DesktopToImageReq withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 用于制作镜像的云桌面的InstanceID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DesktopToImageReq withExecuteSysprep(Boolean executeSysprep) {
        this.executeSysprep = executeSysprep;
        return this;
    }

    /**
     * 是否执行系统封装步骤。
     * @return executeSysprep
     */
    public Boolean getExecuteSysprep() {
        return executeSysprep;
    }

    public void setExecuteSysprep(Boolean executeSysprep) {
        this.executeSysprep = executeSysprep;
    }

    public DesktopToImageReq withImageTags(List<TagKeyValue> imageTags) {
        this.imageTags = imageTags;
        return this;
    }

    public DesktopToImageReq addImageTagsItem(TagKeyValue imageTagsItem) {
        if (this.imageTags == null) {
            this.imageTags = new ArrayList<>();
        }
        this.imageTags.add(imageTagsItem);
        return this;
    }

    public DesktopToImageReq withImageTags(Consumer<List<TagKeyValue>> imageTagsSetter) {
        if (this.imageTags == null) {
            this.imageTags = new ArrayList<>();
        }
        imageTagsSetter.accept(this.imageTags);
        return this;
    }

    /**
     * 镜像标签列表。
     * @return imageTags
     */
    public List<TagKeyValue> getImageTags() {
        return imageTags;
    }

    public void setImageTags(List<TagKeyValue> imageTags) {
        this.imageTags = imageTags;
    }

    public DesktopToImageReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 表示当前镜像所属的企业项目。取值为0或无该值，表示属于default企业项目。取值为UUID，表示属于该UUID对应的企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public DesktopToImageReq withMaxRam(String maxRam) {
        this.maxRam = maxRam;
        return this;
    }

    /**
     * 表示镜像支持的最大内存，单位为MB。
     * @return maxRam
     */
    public String getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(String maxRam) {
        this.maxRam = maxRam;
    }

    public DesktopToImageReq withMinRam(String minRam) {
        this.minRam = minRam;
        return this;
    }

    /**
     * 表示镜像支持的最小内存，单位为MB，默认为0，表示不受限制。
     * @return minRam
     */
    public String getMinRam() {
        return minRam;
    }

    public void setMinRam(String minRam) {
        this.minRam = minRam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopToImageReq that = (DesktopToImageReq) obj;
        return Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageDescription, that.imageDescription)
            && Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.executeSysprep, that.executeSysprep)
            && Objects.equals(this.imageTags, that.imageTags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.maxRam, that.maxRam) && Objects.equals(this.minRam, that.minRam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName,
            imageDescription,
            desktopId,
            executeSysprep,
            imageTags,
            enterpriseProjectId,
            maxRam,
            minRam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopToImageReq {\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageDescription: ").append(toIndentedString(imageDescription)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    executeSysprep: ").append(toIndentedString(executeSysprep)).append("\n");
        sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    maxRam: ").append(toIndentedString(maxRam)).append("\n");
        sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
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
