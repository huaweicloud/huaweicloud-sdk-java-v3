package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateProtocolConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_id")

    private String protocolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepalive_timeout")

    private Integer keepaliveTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private String protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_enable")

    private Boolean sslEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_decode_configs")

    private List<FrameDecodeConfig> frameDecodeConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec_mode")

    private String codecMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_urn")

    private String funcUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public UpdateProtocolConfigResponse withProtocolId(String protocolId) {
        this.protocolId = protocolId;
        return this;
    }

    /**
     * **参数说明**：泛协议配置ID。
     * @return protocolId
     */
    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public UpdateProtocolConfigResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数说明**：泛协议配置的端口号。
     * minimum: 1024
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public UpdateProtocolConfigResponse withKeepaliveTimeout(Integer keepaliveTimeout) {
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

    public UpdateProtocolConfigResponse withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * **参数说明**：协议类型。 **取值范围**： - TCP：通用TCP协议接入
     * @return protocolType
     */
    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public UpdateProtocolConfigResponse withDescription(String description) {
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

    public UpdateProtocolConfigResponse withSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
        return this;
    }

    /**
     * **参数说明**：是否开启tls加密传输。
     * @return sslEnable
     */
    public Boolean getSslEnable() {
        return sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public UpdateProtocolConfigResponse withFrameDecodeConfigs(List<FrameDecodeConfig> frameDecodeConfigs) {
        this.frameDecodeConfigs = frameDecodeConfigs;
        return this;
    }

    public UpdateProtocolConfigResponse addFrameDecodeConfigsItem(FrameDecodeConfig frameDecodeConfigsItem) {
        if (this.frameDecodeConfigs == null) {
            this.frameDecodeConfigs = new ArrayList<>();
        }
        this.frameDecodeConfigs.add(frameDecodeConfigsItem);
        return this;
    }

    public UpdateProtocolConfigResponse withFrameDecodeConfigs(
        Consumer<List<FrameDecodeConfig>> frameDecodeConfigsSetter) {
        if (this.frameDecodeConfigs == null) {
            this.frameDecodeConfigs = new ArrayList<>();
        }
        frameDecodeConfigsSetter.accept(this.frameDecodeConfigs);
        return this;
    }

    /**
     * **参数说明**：码流拆包组包配置列表。
     * @return frameDecodeConfigs
     */
    public List<FrameDecodeConfig> getFrameDecodeConfigs() {
        return frameDecodeConfigs;
    }

    public void setFrameDecodeConfigs(List<FrameDecodeConfig> frameDecodeConfigs) {
        this.frameDecodeConfigs = frameDecodeConfigs;
    }

    public UpdateProtocolConfigResponse withCodecMode(String codecMode) {
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

    public UpdateProtocolConfigResponse withFuncUrn(String funcUrn) {
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

    public UpdateProtocolConfigResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数说明**：在物联网平台查询自定义鉴权的时间。格式：yyyyMMdd'T'HHmmss'Z'，如：20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public UpdateProtocolConfigResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数说明**：在物联网平台更新查询自定义鉴权的时间。格式：yyyyMMdd'T'HHmmss'Z'，如：20151212T121212Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateProtocolConfigResponse that = (UpdateProtocolConfigResponse) obj;
        return Objects.equals(this.protocolId, that.protocolId) && Objects.equals(this.port, that.port)
            && Objects.equals(this.keepaliveTimeout, that.keepaliveTimeout)
            && Objects.equals(this.protocolType, that.protocolType)
            && Objects.equals(this.description, that.description) && Objects.equals(this.sslEnable, that.sslEnable)
            && Objects.equals(this.frameDecodeConfigs, that.frameDecodeConfigs)
            && Objects.equals(this.codecMode, that.codecMode) && Objects.equals(this.funcUrn, that.funcUrn)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocolId,
            port,
            keepaliveTimeout,
            protocolType,
            description,
            sslEnable,
            frameDecodeConfigs,
            codecMode,
            funcUrn,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProtocolConfigResponse {\n");
        sb.append("    protocolId: ").append(toIndentedString(protocolId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sslEnable: ").append(toIndentedString(sslEnable)).append("\n");
        sb.append("    frameDecodeConfigs: ").append(toIndentedString(frameDecodeConfigs)).append("\n");
        sb.append("    codecMode: ").append(toIndentedString(codecMode)).append("\n");
        sb.append("    funcUrn: ").append(toIndentedString(funcUrn)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
