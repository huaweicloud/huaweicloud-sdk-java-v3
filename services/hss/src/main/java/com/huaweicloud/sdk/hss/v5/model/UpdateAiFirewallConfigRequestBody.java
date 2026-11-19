package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置大模型防火墙请求结构体
 */
public class UpdateAiFirewallConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_secret")

    private String sourceSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public UpdateAiFirewallConfigRequestBody withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释**: 防火墙AK（Access Key），用于身份标识，明文传入，加密存储 **约束限制**: 非必填，但配置防火墙检测时需要与source_secret、app_id同时配置 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public UpdateAiFirewallConfigRequestBody withSourceSecret(String sourceSecret) {
        this.sourceSecret = sourceSecret;
        return this;
    }

    /**
     * **参数解释**: 防火墙SK（Secret Key），用于签名认证，明文传入，加密存储 **约束限制**: 非必填，但配置防火墙检测时需要与source_id、app_id同时配置 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return sourceSecret
     */
    public String getSourceSecret() {
        return sourceSecret;
    }

    public void setSourceSecret(String sourceSecret) {
        this.sourceSecret = sourceSecret;
    }

    public UpdateAiFirewallConfigRequestBody withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数解释**: 应用ID，标识接入防火墙的应用 **约束限制**: 非必填，但配置防火墙检测时需要与source_id、source_secret同时配置 **取值范围**: 字符长度0-64位 **默认取值**: 不涉及 
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAiFirewallConfigRequestBody that = (UpdateAiFirewallConfigRequestBody) obj;
        return Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.sourceSecret, that.sourceSecret)
            && Objects.equals(this.appId, that.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, sourceSecret, appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAiFirewallConfigRequestBody {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceSecret: ").append(toIndentedString(sourceSecret)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
