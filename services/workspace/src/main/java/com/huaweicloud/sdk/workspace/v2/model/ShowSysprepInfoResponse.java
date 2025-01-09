package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSysprepInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sysprep_version")

    private String sysprepVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_create_image")

    private Boolean supportCreateImage;

    public ShowSysprepInfoResponse withSysprepVersion(String sysprepVersion) {
        this.sysprepVersion = sysprepVersion;
        return this;
    }

    /**
     * sysprep版本。
     * @return sysprepVersion
     */
    public String getSysprepVersion() {
        return sysprepVersion;
    }

    public void setSysprepVersion(String sysprepVersion) {
        this.sysprepVersion = sysprepVersion;
    }

    public ShowSysprepInfoResponse withSupportCreateImage(Boolean supportCreateImage) {
        this.supportCreateImage = supportCreateImage;
        return this;
    }

    /**
     * 是否支持创建镜像。
     * @return supportCreateImage
     */
    public Boolean getSupportCreateImage() {
        return supportCreateImage;
    }

    public void setSupportCreateImage(Boolean supportCreateImage) {
        this.supportCreateImage = supportCreateImage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSysprepInfoResponse that = (ShowSysprepInfoResponse) obj;
        return Objects.equals(this.sysprepVersion, that.sysprepVersion)
            && Objects.equals(this.supportCreateImage, that.supportCreateImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysprepVersion, supportCreateImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSysprepInfoResponse {\n");
        sb.append("    sysprepVersion: ").append(toIndentedString(sysprepVersion)).append("\n");
        sb.append("    supportCreateImage: ").append(toIndentedString(supportCreateImage)).append("\n");
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
