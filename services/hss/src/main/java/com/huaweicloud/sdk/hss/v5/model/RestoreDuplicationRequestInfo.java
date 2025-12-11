package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreDuplicationRequestInfo
 */
public class RestoreDuplicationRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power_on")

    private Boolean powerOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mappings")

    private List<BackupRestoreServerMappingInfo> mappings = null;

    public RestoreDuplicationRequestInfo withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * **参数解释**: 恢复的目标虚拟机ID **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public RestoreDuplicationRequestInfo withPowerOn(Boolean powerOn) {
        this.powerOn = powerOn;
        return this;
    }

    /**
     * **参数解释**： 恢复后是否开机, 默认开机。 **约束限制**: 不涉及 **取值范围**: - true：开机 - false: 不开机 **默认取值**: true 
     * @return powerOn
     */
    public Boolean getPowerOn() {
        return powerOn;
    }

    public void setPowerOn(Boolean powerOn) {
        this.powerOn = powerOn;
    }

    public RestoreDuplicationRequestInfo withMappings(List<BackupRestoreServerMappingInfo> mappings) {
        this.mappings = mappings;
        return this;
    }

    public RestoreDuplicationRequestInfo addMappingsItem(BackupRestoreServerMappingInfo mappingsItem) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        this.mappings.add(mappingsItem);
        return this;
    }

    public RestoreDuplicationRequestInfo withMappings(Consumer<List<BackupRestoreServerMappingInfo>> mappingsSetter) {
        if (this.mappings == null) {
            this.mappings = new ArrayList<>();
        }
        mappingsSetter.accept(this.mappings);
        return this;
    }

    /**
     * **参数解释**： 恢复的映射关系（整机恢复时必填，卷恢复时可选但是不会用到填写的值） **取值范围**: 不涉及 
     * @return mappings
     */
    public List<BackupRestoreServerMappingInfo> getMappings() {
        return mappings;
    }

    public void setMappings(List<BackupRestoreServerMappingInfo> mappings) {
        this.mappings = mappings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreDuplicationRequestInfo that = (RestoreDuplicationRequestInfo) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.powerOn, that.powerOn)
            && Objects.equals(this.mappings, that.mappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, powerOn, mappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreDuplicationRequestInfo {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    powerOn: ").append(toIndentedString(powerOn)).append("\n");
        sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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
