package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSecurityReportLogoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_content")

    private String logoContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_name")

    private String logoName;

    public ShowSecurityReportLogoResponse withLogoContent(String logoContent) {
        this.logoContent = logoContent;
        return this;
    }

    /**
     * **参数解释**： logo文件base64内容 **取值范围**： 字符长度32-36位 
     * @return logoContent
     */
    public String getLogoContent() {
        return logoContent;
    }

    public void setLogoContent(String logoContent) {
        this.logoContent = logoContent;
    }

    public ShowSecurityReportLogoResponse withLogoName(String logoName) {
        this.logoName = logoName;
        return this;
    }

    /**
     * **参数解释**： logo文件名称 **取值范围**： 字符长度0-128位 
     * @return logoName
     */
    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityReportLogoResponse that = (ShowSecurityReportLogoResponse) obj;
        return Objects.equals(this.logoContent, that.logoContent) && Objects.equals(this.logoName, that.logoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logoContent, logoName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityReportLogoResponse {\n");
        sb.append("    logoContent: ").append(toIndentedString(logoContent)).append("\n");
        sb.append("    logoName: ").append(toIndentedString(logoName)).append("\n");
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
