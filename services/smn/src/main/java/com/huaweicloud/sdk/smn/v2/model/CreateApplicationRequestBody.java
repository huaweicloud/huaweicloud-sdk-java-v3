package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateApplicationRequestBody */
public class CreateApplicationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_principal")

    private String platformPrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_credential")

    private String platformCredential;

    public CreateApplicationRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 应用名。 最大支持64个字符，只能包含英文字母、下划线和数字。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateApplicationRequestBody withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /** 应用平台。 目前仅支持HMS、APNS、APNS_SANDBOX。 HMS是为开发者提供的消息推送平台。 APNS和APNS_SANDBOX是用于推送iOS消息的服务平台。
     * 
     * @return platform */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public CreateApplicationRequestBody withPlatformPrincipal(String platformPrincipal) {
        this.platformPrincipal = platformPrincipal;
        return this;
    }

    /** 对于HMS平台是APP ID，只能包含英文字母和数字，最大20个字符。 对于苹果APNS、APNS_SandBox平台是推送证书，大小不超过8K，且是Base64编码。
     * 
     * @return platformPrincipal */
    public String getPlatformPrincipal() {
        return platformPrincipal;
    }

    public void setPlatformPrincipal(String platformPrincipal) {
        this.platformPrincipal = platformPrincipal;
    }

    public CreateApplicationRequestBody withPlatformCredential(String platformCredential) {
        this.platformCredential = platformCredential;
        return this;
    }

    /** 对于HMS平台是APP SECRET， 只能包含英文字母和数字，32到64个字符。 对于苹果APNS、APNS_SandBox平台是推送证书的私钥（private key）， 大小不超过8K，且是Base64编码。
     * 
     * @return platformCredential */
    public String getPlatformCredential() {
        return platformCredential;
    }

    public void setPlatformCredential(String platformCredential) {
        this.platformCredential = platformCredential;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateApplicationRequestBody createApplicationRequestBody = (CreateApplicationRequestBody) o;
        return Objects.equals(this.name, createApplicationRequestBody.name)
            && Objects.equals(this.platform, createApplicationRequestBody.platform)
            && Objects.equals(this.platformPrincipal, createApplicationRequestBody.platformPrincipal)
            && Objects.equals(this.platformCredential, createApplicationRequestBody.platformCredential);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, platform, platformPrincipal, platformCredential);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApplicationRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    platformPrincipal: ").append(toIndentedString(platformPrincipal)).append("\n");
        sb.append("    platformCredential: ").append(toIndentedString(platformCredential)).append("\n");
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
