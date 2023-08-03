package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实例视频设置请求
 */
public class InstanceVideoSettingReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_settings")

    private List<InstanceSetting> instanceSettings = null;

    public InstanceVideoSettingReq withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public InstanceVideoSettingReq addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public InstanceVideoSettingReq withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * 实例列表
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public InstanceVideoSettingReq withInstanceSettings(List<InstanceSetting> instanceSettings) {
        this.instanceSettings = instanceSettings;
        return this;
    }

    public InstanceVideoSettingReq addInstanceSettingsItem(InstanceSetting instanceSettingsItem) {
        if (this.instanceSettings == null) {
            this.instanceSettings = new ArrayList<>();
        }
        this.instanceSettings.add(instanceSettingsItem);
        return this;
    }

    public InstanceVideoSettingReq withInstanceSettings(Consumer<List<InstanceSetting>> instanceSettingsSetter) {
        if (this.instanceSettings == null) {
            this.instanceSettings = new ArrayList<>();
        }
        instanceSettingsSetter.accept(this.instanceSettings);
        return this;
    }

    /**
     * 视频设置内容
     * @return instanceSettings
     */
    public List<InstanceSetting> getInstanceSettings() {
        return instanceSettings;
    }

    public void setInstanceSettings(List<InstanceSetting> instanceSettings) {
        this.instanceSettings = instanceSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceVideoSettingReq that = (InstanceVideoSettingReq) obj;
        return Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.instanceSettings, that.instanceSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, instanceSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceVideoSettingReq {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    instanceSettings: ").append(toIndentedString(instanceSettings)).append("\n");
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
