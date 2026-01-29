package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCollectConfigV2RequestBody
 */
public class CreateCollectConfigV2RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private List<ConfigInfo> config = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_id")

    private String dataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_name")

    private String dataspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_config")

    private List<LtsRquestVo> ltsConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public CreateCollectConfigV2RequestBody withConfig(List<ConfigInfo> config) {
        this.config = config;
        return this;
    }

    public CreateCollectConfigV2RequestBody addConfigItem(ConfigInfo configItem) {
        if (this.config == null) {
            this.config = new ArrayList<>();
        }
        this.config.add(configItem);
        return this;
    }

    public CreateCollectConfigV2RequestBody withConfig(Consumer<List<ConfigInfo>> configSetter) {
        if (this.config == null) {
            this.config = new ArrayList<>();
        }
        configSetter.accept(this.config);
        return this;
    }

    /**
     * 数据集列表
     * @return config
     */
    public List<ConfigInfo> getConfig() {
        return config;
    }

    public void setConfig(List<ConfigInfo> config) {
        this.config = config;
    }

    public CreateCollectConfigV2RequestBody withDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
        return this;
    }

    /**
     * 数据空间ID
     * @return dataspaceId
     */
    public String getDataspaceId() {
        return dataspaceId;
    }

    public void setDataspaceId(String dataspaceId) {
        this.dataspaceId = dataspaceId;
    }

    public CreateCollectConfigV2RequestBody withDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
        return this;
    }

    /**
     * 数据空间名称
     * @return dataspaceName
     */
    public String getDataspaceName() {
        return dataspaceName;
    }

    public void setDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
    }

    public CreateCollectConfigV2RequestBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateCollectConfigV2RequestBody withLtsConfig(List<LtsRquestVo> ltsConfig) {
        this.ltsConfig = ltsConfig;
        return this;
    }

    public CreateCollectConfigV2RequestBody addLtsConfigItem(LtsRquestVo ltsConfigItem) {
        if (this.ltsConfig == null) {
            this.ltsConfig = new ArrayList<>();
        }
        this.ltsConfig.add(ltsConfigItem);
        return this;
    }

    public CreateCollectConfigV2RequestBody withLtsConfig(Consumer<List<LtsRquestVo>> ltsConfigSetter) {
        if (this.ltsConfig == null) {
            this.ltsConfig = new ArrayList<>();
        }
        ltsConfigSetter.accept(this.ltsConfig);
        return this;
    }

    /**
     * lts配置
     * @return ltsConfig
     */
    public List<LtsRquestVo> getLtsConfig() {
        return ltsConfig;
    }

    public void setLtsConfig(List<LtsRquestVo> ltsConfig) {
        this.ltsConfig = ltsConfig;
    }

    public CreateCollectConfigV2RequestBody withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间 id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCollectConfigV2RequestBody that = (CreateCollectConfigV2RequestBody) obj;
        return Objects.equals(this.config, that.config) && Objects.equals(this.dataspaceId, that.dataspaceId)
            && Objects.equals(this.dataspaceName, that.dataspaceName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.ltsConfig, that.ltsConfig) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, dataspaceId, dataspaceName, domainId, ltsConfig, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCollectConfigV2RequestBody {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    dataspaceId: ").append(toIndentedString(dataspaceId)).append("\n");
        sb.append("    dataspaceName: ").append(toIndentedString(dataspaceName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    ltsConfig: ").append(toIndentedString(ltsConfig)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
