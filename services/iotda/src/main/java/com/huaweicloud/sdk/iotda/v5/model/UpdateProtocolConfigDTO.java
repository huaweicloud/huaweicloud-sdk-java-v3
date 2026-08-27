package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新泛协议配置信息
 */
public class UpdateProtocolConfigDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepalive_timeout")

    private Integer keepaliveTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec_mode")

    private String codecMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_urn")

    private String funcUrn;

    public UpdateProtocolConfigDTO withKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
        return this;
    }

    /**
     * **参数说明**：连接空闲断链时间，单位（s）。
     * minimum: 30
     * maximum: 3600
     * @return keepaliveTimeout
     */
    public Integer getKeepaliveTimeout() {
        return keepaliveTimeout;
    }

    public void setKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
    }

    public UpdateProtocolConfigDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：泛协议的描述信息。 **取值范围**：长度不超过2048，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateProtocolConfigDTO withCodecMode(String codecMode) {
        this.codecMode = codecMode;
        return this;
    }

    /**
     * **参数说明**：编解码类型。 **取值范围**： - FGS：将编解码插件以函数形式部署到FunctionGraph。 - PLUGIN：将编解码插件以OSGI插件形式部署到设备接入平台，使用该方式需提工单联系技术支持。
     * @return codecMode
     */
    public String getCodecMode() {
        return codecMode;
    }

    public void setCodecMode(String codecMode) {
        this.codecMode = codecMode;
    }

    public UpdateProtocolConfigDTO withFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
        return this;
    }

    /**
     * **参数说明**：函数的URN（Uniform Resource Name），唯一标识函数，采用FGS进行编解码的对应函数地址。 **取值范围**：长度不超过256，只允许字母、数字、下划线（_）、连接符（-）、分隔符（:）的组合。
     * @return funcUrn
     */
    public String getFuncUrn() {
        return funcUrn;
    }

    public void setFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateProtocolConfigDTO that = (UpdateProtocolConfigDTO) obj;
        return Objects.equals(this.keepaliveTimeout, that.keepaliveTimeout)
            && Objects.equals(this.description, that.description) && Objects.equals(this.codecMode, that.codecMode)
            && Objects.equals(this.funcUrn, that.funcUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepaliveTimeout, description, codecMode, funcUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProtocolConfigDTO {\n");
        sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    codecMode: ").append(toIndentedString(codecMode)).append("\n");
        sb.append("    funcUrn: ").append(toIndentedString(funcUrn)).append("\n");
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
