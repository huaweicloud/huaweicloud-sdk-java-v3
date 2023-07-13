package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改配置v2接口请求参数
 */
public class HbaseModifySettingV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reboot")

    private String isReboot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hbase_modify_settings")

    private List<HbaseModifySettingV2> hbaseModifySettings = null;

    public HbaseModifySettingV2Req withIsReboot(String isReboot) {
        this.isReboot = isReboot;
        return this;
    }

    /**
     * 是否重启
     * @return isReboot
     */
    public String getIsReboot() {
        return isReboot;
    }

    public void setIsReboot(String isReboot) {
        this.isReboot = isReboot;
    }

    public HbaseModifySettingV2Req withHbaseModifySettings(List<HbaseModifySettingV2> hbaseModifySettings) {
        this.hbaseModifySettings = hbaseModifySettings;
        return this;
    }

    public HbaseModifySettingV2Req addHbaseModifySettingsItem(HbaseModifySettingV2 hbaseModifySettingsItem) {
        if (this.hbaseModifySettings == null) {
            this.hbaseModifySettings = new ArrayList<>();
        }
        this.hbaseModifySettings.add(hbaseModifySettingsItem);
        return this;
    }

    public HbaseModifySettingV2Req withHbaseModifySettings(
        Consumer<List<HbaseModifySettingV2>> hbaseModifySettingsSetter) {
        if (this.hbaseModifySettings == null) {
            this.hbaseModifySettings = new ArrayList<>();
        }
        hbaseModifySettingsSetter.accept(this.hbaseModifySettings);
        return this;
    }

    /**
     * 参见HBaseModifySettingV2结构说明
     * @return hbaseModifySettings
     */
    public List<HbaseModifySettingV2> getHbaseModifySettings() {
        return hbaseModifySettings;
    }

    public void setHbaseModifySettings(List<HbaseModifySettingV2> hbaseModifySettings) {
        this.hbaseModifySettings = hbaseModifySettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HbaseModifySettingV2Req that = (HbaseModifySettingV2Req) obj;
        return Objects.equals(this.isReboot, that.isReboot)
            && Objects.equals(this.hbaseModifySettings, that.hbaseModifySettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isReboot, hbaseModifySettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HbaseModifySettingV2Req {\n");
        sb.append("    isReboot: ").append(toIndentedString(isReboot)).append("\n");
        sb.append("    hbaseModifySettings: ").append(toIndentedString(hbaseModifySettings)).append("\n");
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
