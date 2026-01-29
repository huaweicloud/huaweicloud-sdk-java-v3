package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LtsResponseVo
 */
public class LtsResponseVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_id")

    private String configId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    private String configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private String logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_types")

    private LtsResponseVoLogTypes logTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_infos")

    private List<LtsResponseVoLtsInfos> ltsInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_alias")

    private String pipeAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_prefix")

    private String typePrefix;

    public LtsResponseVo withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    /**
     * 配置id
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public LtsResponseVo withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    /**
     * 配置名称
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public LtsResponseVo withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public LtsResponseVo withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组Id
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public LtsResponseVo withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流ID
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public LtsResponseVo withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * 日志类型
     * @return logType
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public LtsResponseVo withLogTypes(LtsResponseVoLogTypes logTypes) {
        this.logTypes = logTypes;
        return this;
    }

    public LtsResponseVo withLogTypes(Consumer<LtsResponseVoLogTypes> logTypesSetter) {
        if (this.logTypes == null) {
            this.logTypes = new LtsResponseVoLogTypes();
            logTypesSetter.accept(this.logTypes);
        }

        return this;
    }

    /**
     * Get logTypes
     * @return logTypes
     */
    public LtsResponseVoLogTypes getLogTypes() {
        return logTypes;
    }

    public void setLogTypes(LtsResponseVoLogTypes logTypes) {
        this.logTypes = logTypes;
    }

    public LtsResponseVo withLtsInfos(List<LtsResponseVoLtsInfos> ltsInfos) {
        this.ltsInfos = ltsInfos;
        return this;
    }

    public LtsResponseVo addLtsInfosItem(LtsResponseVoLtsInfos ltsInfosItem) {
        if (this.ltsInfos == null) {
            this.ltsInfos = new ArrayList<>();
        }
        this.ltsInfos.add(ltsInfosItem);
        return this;
    }

    public LtsResponseVo withLtsInfos(Consumer<List<LtsResponseVoLtsInfos>> ltsInfosSetter) {
        if (this.ltsInfos == null) {
            this.ltsInfos = new ArrayList<>();
        }
        ltsInfosSetter.accept(this.ltsInfos);
        return this;
    }

    /**
     * lts日志信息map
     * @return ltsInfos
     */
    public List<LtsResponseVoLtsInfos> getLtsInfos() {
        return ltsInfos;
    }

    public void setLtsInfos(List<LtsResponseVoLtsInfos> ltsInfos) {
        this.ltsInfos = ltsInfos;
    }

    public LtsResponseVo withPipeAlias(String pipeAlias) {
        this.pipeAlias = pipeAlias;
        return this;
    }

    /**
     * 管道别名
     * @return pipeAlias
     */
    public String getPipeAlias() {
        return pipeAlias;
    }

    public void setPipeAlias(String pipeAlias) {
        this.pipeAlias = pipeAlias;
    }

    public LtsResponseVo withTypePrefix(String typePrefix) {
        this.typePrefix = typePrefix;
        return this;
    }

    /**
     * 类型前缀
     * @return typePrefix
     */
    public String getTypePrefix() {
        return typePrefix;
    }

    public void setTypePrefix(String typePrefix) {
        this.typePrefix = typePrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsResponseVo that = (LtsResponseVo) obj;
        return Objects.equals(this.configId, that.configId) && Objects.equals(this.configName, that.configName)
            && Objects.equals(this.enable, that.enable) && Objects.equals(this.logGroupId, that.logGroupId)
            && Objects.equals(this.logStreamId, that.logStreamId) && Objects.equals(this.logType, that.logType)
            && Objects.equals(this.logTypes, that.logTypes) && Objects.equals(this.ltsInfos, that.ltsInfos)
            && Objects.equals(this.pipeAlias, that.pipeAlias) && Objects.equals(this.typePrefix, that.typePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId,
            configName,
            enable,
            logGroupId,
            logStreamId,
            logType,
            logTypes,
            ltsInfos,
            pipeAlias,
            typePrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsResponseVo {\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    logTypes: ").append(toIndentedString(logTypes)).append("\n");
        sb.append("    ltsInfos: ").append(toIndentedString(ltsInfos)).append("\n");
        sb.append("    pipeAlias: ").append(toIndentedString(pipeAlias)).append("\n");
        sb.append("    typePrefix: ").append(toIndentedString(typePrefix)).append("\n");
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
