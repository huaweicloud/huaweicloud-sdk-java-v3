package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IndicatorInfo
 */
public class IndicatorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indicator_name")

    private String indicatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_collect_rate")

    private String defaultCollectRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_datastore_version")

    private String supportDatastoreVersion;

    public IndicatorInfo withIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
        return this;
    }

    /**
     * **参数解释**： 监控指标名称。 **取值范围**： 不涉及。
     * @return indicatorName
     */
    public String getIndicatorName() {
        return indicatorName;
    }

    public void setIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName;
    }

    public IndicatorInfo withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**： 采集模块名称。 **取值范围**： 不涉及。
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public IndicatorInfo withDefaultCollectRate(String defaultCollectRate) {
        this.defaultCollectRate = defaultCollectRate;
        return this;
    }

    /**
     * **参数解释**： 默认采集频率。 **取值范围**： 不涉及。
     * @return defaultCollectRate
     */
    public String getDefaultCollectRate() {
        return defaultCollectRate;
    }

    public void setDefaultCollectRate(String defaultCollectRate) {
        this.defaultCollectRate = defaultCollectRate;
    }

    public IndicatorInfo withSupportDatastoreVersion(String supportDatastoreVersion) {
        this.supportDatastoreVersion = supportDatastoreVersion;
        return this;
    }

    /**
     * **参数解释**： 支持的集群版本。 **取值范围**： 不涉及。
     * @return supportDatastoreVersion
     */
    public String getSupportDatastoreVersion() {
        return supportDatastoreVersion;
    }

    public void setSupportDatastoreVersion(String supportDatastoreVersion) {
        this.supportDatastoreVersion = supportDatastoreVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndicatorInfo that = (IndicatorInfo) obj;
        return Objects.equals(this.indicatorName, that.indicatorName)
            && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.defaultCollectRate, that.defaultCollectRate)
            && Objects.equals(this.supportDatastoreVersion, that.supportDatastoreVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indicatorName, pluginName, defaultCollectRate, supportDatastoreVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndicatorInfo {\n");
        sb.append("    indicatorName: ").append(toIndentedString(indicatorName)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    defaultCollectRate: ").append(toIndentedString(defaultCollectRate)).append("\n");
        sb.append("    supportDatastoreVersion: ").append(toIndentedString(supportDatastoreVersion)).append("\n");
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
