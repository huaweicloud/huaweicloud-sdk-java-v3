package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SaveMonitorItemParam
 */
public class SaveMonitorItemParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_item_id")

    @JacksonXmlProperty(localName = "monitor_item_id")

    private Long monitorItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    @JacksonXmlProperty(localName = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    @JacksonXmlProperty(localName = "env_id")

    private Integer envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value_list")

    @JacksonXmlProperty(localName = "config_value_list")

    private List<ConfigItem> configValueList = null;

    public SaveMonitorItemParam withMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }

    /**
     * 监控项id
     * @return monitorItemId
     */
    public Long getMonitorItemId() {
        return monitorItemId;
    }

    public void setMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
    }

    public SaveMonitorItemParam withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 采集间隔
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public SaveMonitorItemParam withEnvId(Integer envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id
     * @return envId
     */
    public Integer getEnvId() {
        return envId;
    }

    public void setEnvId(Integer envId) {
        this.envId = envId;
    }

    public SaveMonitorItemParam withConfigValueList(List<ConfigItem> configValueList) {
        this.configValueList = configValueList;
        return this;
    }

    public SaveMonitorItemParam addConfigValueListItem(ConfigItem configValueListItem) {
        if (this.configValueList == null) {
            this.configValueList = new ArrayList<>();
        }
        this.configValueList.add(configValueListItem);
        return this;
    }

    public SaveMonitorItemParam withConfigValueList(Consumer<List<ConfigItem>> configValueListSetter) {
        if (this.configValueList == null) {
            this.configValueList = new ArrayList<>();
        }
        configValueListSetter.accept(this.configValueList);
        return this;
    }

    /**
     * 配置项列表
     * @return configValueList
     */
    public List<ConfigItem> getConfigValueList() {
        return configValueList;
    }

    public void setConfigValueList(List<ConfigItem> configValueList) {
        this.configValueList = configValueList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SaveMonitorItemParam saveMonitorItemParam = (SaveMonitorItemParam) o;
        return Objects.equals(this.monitorItemId, saveMonitorItemParam.monitorItemId)
            && Objects.equals(this.interval, saveMonitorItemParam.interval)
            && Objects.equals(this.envId, saveMonitorItemParam.envId)
            && Objects.equals(this.configValueList, saveMonitorItemParam.configValueList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitorItemId, interval, envId, configValueList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveMonitorItemParam {\n");
        sb.append("    monitorItemId: ").append(toIndentedString(monitorItemId)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    configValueList: ").append(toIndentedString(configValueList)).append("\n");
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
