package com.huaweicloud.sdk.dataartsinsight.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建工作空间请示实体
 */
public class WorkspaceDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private Map<String, String> configs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    public WorkspaceDTO withConfigs(Map<String, String> configs) {
        this.configs = configs;
        return this;
    }

    public WorkspaceDTO putConfigsItem(String key, String configsItem) {
        if (this.configs == null) {
            this.configs = new HashMap<>();
        }
        this.configs.put(key, configsItem);
        return this;
    }

    public WorkspaceDTO withConfigs(Consumer<Map<String, String>> configsSetter) {
        if (this.configs == null) {
            this.configs = new HashMap<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 工作空间的configs 配置的属性值
     * @return configs
     */
    public Map<String, String> getConfigs() {
        return configs;
    }

    public void setConfigs(Map<String, String> configs) {
        this.configs = configs;
    }

    public WorkspaceDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作空间名称。 最小长度：0 最大长度：1024
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkspaceDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作空间描述。 最小长度：0 最大长度：10240
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkspaceDTO withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 工作空间所属企业项目ID。 最小长度：0 最大长度：128
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkspaceDTO that = (WorkspaceDTO) obj;
        return Objects.equals(this.configs, that.configs) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.epsId, that.epsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configs, name, description, epsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkspaceDTO {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
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
