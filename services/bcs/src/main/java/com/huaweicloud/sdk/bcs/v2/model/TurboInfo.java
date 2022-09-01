package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 极速文件存储卷信息
 */
public class TurboInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_type")

    @JacksonXmlProperty(localName = "share_type")

    private String shareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone")

    @JacksonXmlProperty(localName = "available_zone")

    private String availableZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    @JacksonXmlProperty(localName = "resource_spec_code")

    private String resourceSpecCode;

    public TurboInfo withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    /**
     * 共享方式，固定值为“STANDARD”
     * @return shareType
     */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public TurboInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，固定值为“efs-ha”
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TurboInfo withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    /**
     * 可用区，可填空字符串(\"\")。
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    public TurboInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 规格，固定值为“sfs.turbo.standard”
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TurboInfo turboInfo = (TurboInfo) o;
        return Objects.equals(this.shareType, turboInfo.shareType) && Objects.equals(this.type, turboInfo.type)
            && Objects.equals(this.availableZone, turboInfo.availableZone)
            && Objects.equals(this.resourceSpecCode, turboInfo.resourceSpecCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareType, type, availableZone, resourceSpecCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TurboInfo {\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
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
