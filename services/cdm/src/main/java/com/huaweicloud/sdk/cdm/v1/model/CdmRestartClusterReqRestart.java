package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群重启操作，定义哪些集群节点需要重启，请参见restart参数说明
 */
public class CdmRestartClusterReqRestart {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restartDelayTime")

    private Integer restartDelayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restartMode")

    private String restartMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restartLevel")

    private String restartLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private String instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    public CdmRestartClusterReqRestart withRestartDelayTime(Integer restartDelayTime) {
        this.restartDelayTime = restartDelayTime;
        return this;
    }

    /**
     * 重启时延，单位：秒
     * @return restartDelayTime
     */
    public Integer getRestartDelayTime() {
        return restartDelayTime;
    }

    public void setRestartDelayTime(Integer restartDelayTime) {
        this.restartDelayTime = restartDelayTime;
    }

    public CdmRestartClusterReqRestart withRestartMode(String restartMode) {
        this.restartMode = restartMode;
        return this;
    }

    /**
     * 重启类型： - IMMEDIATELY：立即重启。 - FORCELY：强制重启。 - SOFTLY：一般重启。  默认值为“IMMEDIATELY”。强制重启业务进程会中断，并重启集群的虚拟机。
     * @return restartMode
     */
    public String getRestartMode() {
        return restartMode;
    }

    public void setRestartMode(String restartMode) {
        this.restartMode = restartMode;
    }

    public CdmRestartClusterReqRestart withRestartLevel(String restartLevel) {
        this.restartLevel = restartLevel;
        return this;
    }

    /**
     * 重启级别： - SERVICE：重启服务。 - VM：重启虚拟机。  默认值为“SERVICE”。
     * @return restartLevel
     */
    public String getRestartLevel() {
        return restartLevel;
    }

    public void setRestartLevel(String restartLevel) {
        this.restartLevel = restartLevel;
    }

    public CdmRestartClusterReqRestart withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 集群节点类型，只支持“cdm”
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CdmRestartClusterReqRestart withInstance(String instance) {
        this.instance = instance;
        return this;
    }

    /**
     * 预留字段，“restartLevel” 为“SERVICE”时，“instance”必填，填空字串。
     * @return instance
     */
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public CdmRestartClusterReqRestart withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 预留字段，“restartLevel” 为“SERVICE”时，“group”必填，填空字串。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CdmRestartClusterReqRestart cdmRestartClusterReqRestart = (CdmRestartClusterReqRestart) o;
        return Objects.equals(this.restartDelayTime, cdmRestartClusterReqRestart.restartDelayTime)
            && Objects.equals(this.restartMode, cdmRestartClusterReqRestart.restartMode)
            && Objects.equals(this.restartLevel, cdmRestartClusterReqRestart.restartLevel)
            && Objects.equals(this.type, cdmRestartClusterReqRestart.type)
            && Objects.equals(this.instance, cdmRestartClusterReqRestart.instance)
            && Objects.equals(this.group, cdmRestartClusterReqRestart.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restartDelayTime, restartMode, restartLevel, type, instance, group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmRestartClusterReqRestart {\n");
        sb.append("    restartDelayTime: ").append(toIndentedString(restartDelayTime)).append("\n");
        sb.append("    restartMode: ").append(toIndentedString(restartMode)).append("\n");
        sb.append("    restartLevel: ").append(toIndentedString(restartLevel)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
