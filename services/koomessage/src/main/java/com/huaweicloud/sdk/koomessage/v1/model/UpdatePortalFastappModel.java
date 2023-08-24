package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 快应用模型。
 */
public class UpdatePortalFastappModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_img")

    private String logoImg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deeplink")

    private String deeplink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_engine_version")

    private String dependEngineVersion;

    public UpdatePortalFastappModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 快应用名。  > 长度范围为1-30个字符，中文占2个字符，英文占1个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdatePortalFastappModel withLogoImg(String logoImg) {
        this.logoImg = logoImg;
        return this;
    }

    /**
     * 快应用LOGO图片资源ID。  > 图片格式为jpg、bmp、jpeg，分辨率大于等于192*192，大小不超过4M。参数值为上传智能信息服务号图片资源API返回的resource_id。 
     * @return logoImg
     */
    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public UpdatePortalFastappModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 快应用描述。  > 长度范围为1-38个字符，中文占2个字符，英文占1个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdatePortalFastappModel withDeeplink(String deeplink) {
        this.deeplink = deeplink;
        return this;
    }

    /**
     * 快应用跳转链接。
     * @return deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public UpdatePortalFastappModel withDependEngineVersion(String dependEngineVersion) {
        this.dependEngineVersion = dependEngineVersion;
        return this;
    }

    /**
     * 快应用依赖引擎版本。  > 长度范围为1-50个字符，中文占2个字符，英文占1个字符。 
     * @return dependEngineVersion
     */
    public String getDependEngineVersion() {
        return dependEngineVersion;
    }

    public void setDependEngineVersion(String dependEngineVersion) {
        this.dependEngineVersion = dependEngineVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePortalFastappModel that = (UpdatePortalFastappModel) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.logoImg, that.logoImg)
            && Objects.equals(this.description, that.description) && Objects.equals(this.deeplink, that.deeplink)
            && Objects.equals(this.dependEngineVersion, that.dependEngineVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, logoImg, description, deeplink, dependEngineVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePortalFastappModel {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    logoImg: ").append(toIndentedString(logoImg)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deeplink: ").append(toIndentedString(deeplink)).append("\n");
        sb.append("    dependEngineVersion: ").append(toIndentedString(dependEngineVersion)).append("\n");
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
