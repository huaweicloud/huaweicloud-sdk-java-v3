package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskCheckSettingsItem
 */
public class TaskCheckSettingsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cfg_key")

    private String cfgKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cfg_value")

    private String cfgValue;

    public TaskCheckSettingsItem withCfgKey(String cfgKey) {
        this.cfgKey = cfgKey;
        return this;
    }

    /**
     * **参数解释:** 规则集对应的编译配置条件键。 **约束限制:** 不涉及。 **取值范围:** - compileTool：编译工具。 - buildToolVersion：编译工具版本。 - compileScriptCmd：编译命令。 **默认取值：** 不涉及。
     * @return cfgKey
     */
    public String getCfgKey() {
        return cfgKey;
    }

    public void setCfgKey(String cfgKey) {
        this.cfgKey = cfgKey;
    }

    public TaskCheckSettingsItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释:** 当前检查参数key对应的开启状态，填写\"on\"即可。 **约束限制:** 不涉及。 **取值范围:** \"on\"。 **默认取值：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskCheckSettingsItem withCfgValue(String cfgValue) {
        this.cfgValue = cfgValue;
        return this;
    }

    /**
     * **参数解释:** 规则集对应的编译配置值。 **约束限制:** cfg_key为compileTool、buildToolVersion时，cfg_value的值必填。 **取值范围:** - ant1.10.1-jdk1.8: ant镜像。 - ant1.10.13-jdk1.8: ant镜像。 - ant1.10.3-jdk1.8: ant镜像。 - ant1.9.4-jdk1.8: ant镜像。 - cmake2.8.12-gcc4.8.5: C++镜像。 - cmake2.8.12-gcc5.5.0: C++镜像。 - cmake2.8.12-gcc6.4.0: C++镜像。 - cmake2.8.12-gcc7.3.0: C++镜像。 - cmake3.10.1-gcc4.8.5: C++镜像。 - cmake3.10.1-gcc5.5.0: C++镜像。 - cmake3.10.1-gcc6.4.0: C++镜像。 - cmake3.10.1-gcc7.3.0: C++镜像。 - cmake3.15.5-gcc7.5.0: C++镜像。 - cmake3.15.5-gcc8.3.0: C++镜像。 - cmake3.16.0-gcc9.2.0: C++镜像。 - dotnetcore2.2: C#镜像。 - dotnetcore3.0: C#镜像。 - dotnetcore3.1: C#镜像。 - dotnetcore5.0: C#镜像。 - dotnetcore6.0: C#镜像。 - dotnetcore7.0: C#镜像。 - dotnetcore8.0: C#镜像。 - dotnetcore9.0: C#镜像。 - go-1.10.3: go镜像。 - go-1.11.6: go镜像。 - go-1.12.1: go镜像。 - go-1.23: go镜像。 - gradle2.13-jdk1.8: gradle镜像。 - gradle2.14.1-jdk1.8: gradle镜像。 - gradle3.3-jdk1.8: gradle镜像。 - gradle4.1-jdk1.8: gradle镜像。 - gradle4.2-jdk1.8: gradle镜像。 - gradle4.3-jdk1.8: gradle镜像。 - gradle4.4-jdk1.8: gradle镜像。 - gradle4.5-jdk1.8: gradle镜像。 - gradle4.6-jdk1.8: gradle镜像。 - gradle4.7-jdk1.8: gradle镜像。 - gradle4.8-jdk1.8: gradle镜像。 - gradle4.8-jdk1.9: gradle镜像。 - gradle4.9-jdk1.8: gradle镜像。 - gradle4.9-jdk1.9: gradle镜像。 - gradlew: gradle镜像。 - maven3.3.1-jdk7: maven镜像。 - maven3.5.3-jdk1.10: maven镜像。 - maven3.5.3-jdk1.11: maven镜像。 - maven3.5.3-jdk1.7: maven镜像。 - maven3.5.3-jdk1.8: maven镜像。 - maven3.5.3-jdk1.9: maven镜像。 - maven3.5.3-jdk7: maven镜像。 - maven3.5.3-jdk8-open: maven镜像。 - maven3.6.1-jdk10: maven镜像。 - maven3.6.1-jdk9: maven镜像。 - maven3.6.3-jdk11: maven镜像。 - maven3.8.5-jdk1.17: maven镜像。 - maven3.8.5-jdk17: maven镜像。 - maven3.9.5-jdk21: maven镜像。 - mono6-msbuild16-dotnetcoresdk2.1: C#镜像。 - mono6-msbuild16-dotnetcoresdk2.2: C#镜像。 - mono6-msbuild16-dotnetcoresdk3.0: C#镜像。 - mono6-msbuild16-dotnetcoresdk3.1: C#镜像。 - mono6-msbuild16-dotnetcoresdk5.0: C#镜像。 - mono6-msbuild16-dotnetcoresdk6.0: C#镜像。 - msbuild15-dotnetframework3.5: C#镜像。 - msbuild15-dotnetframework4.7.2: C#镜像。 - msbuild16-dotnetframework4.8: C#镜像。 **默认取值：** 不涉及。
     * @return cfgValue
     */
    public String getCfgValue() {
        return cfgValue;
    }

    public void setCfgValue(String cfgValue) {
        this.cfgValue = cfgValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskCheckSettingsItem that = (TaskCheckSettingsItem) obj;
        return Objects.equals(this.cfgKey, that.cfgKey) && Objects.equals(this.status, that.status)
            && Objects.equals(this.cfgValue, that.cfgValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cfgKey, status, cfgValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskCheckSettingsItem {\n");
        sb.append("    cfgKey: ").append(toIndentedString(cfgKey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cfgValue: ").append(toIndentedString(cfgValue)).append("\n");
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
