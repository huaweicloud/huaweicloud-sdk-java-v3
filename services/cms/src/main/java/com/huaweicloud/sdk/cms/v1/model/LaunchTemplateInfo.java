package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例的启动模板，创建虚拟机时，使用到安全组、网络、镜像、flavor等信息
 */
public class LaunchTemplateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_template_id")

    private String launchTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public LaunchTemplateInfo withLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    /**
     * 实例的启动模板id，唯一标识一个启动模板
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return launchTemplateId;
    }

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    public LaunchTemplateInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 模板版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LaunchTemplateInfo launchTemplateInfo = (LaunchTemplateInfo) o;
        return Objects.equals(this.launchTemplateId, launchTemplateInfo.launchTemplateId)
            && Objects.equals(this.version, launchTemplateInfo.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(launchTemplateId, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaunchTemplateInfo {\n");
        sb.append("    launchTemplateId: ").append(toIndentedString(launchTemplateId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
