package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练作业的引擎。使用算法管理的算法id或订阅算法subscription_id+item_version_id创建作业时，无需填写。
 */
public class JobEngineResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    private String engineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_url")

    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_sys_packages")

    private Boolean installSysPackages;

    public JobEngineResp withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }

    /**
     * **参数解释**：训练作业选择的引擎规格ID。 **取值范围**：不涉及。
     * @return engineId
     */
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public JobEngineResp withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * **参数解释**：训练作业选择的引擎规格名称。 **取值范围**：不涉及。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public JobEngineResp withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * **参数解释**：训练作业选择的引擎规格版本。 **取值范围**：不涉及。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public JobEngineResp withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * **参数解释**：训练作业选择的自定义镜像地址，地址从swr服务获取。 **取值范围**：不涉及。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public JobEngineResp withInstallSysPackages(Boolean installSysPackages) {
        this.installSysPackages = installSysPackages;
        return this;
    }

    /**
     * **参数解释**：是否需要安装训练平台指定的 moxing 版本。 **取值范围**： - true：需要 - false：不需要
     * @return installSysPackages
     */
    public Boolean getInstallSysPackages() {
        return installSysPackages;
    }

    public void setInstallSysPackages(Boolean installSysPackages) {
        this.installSysPackages = installSysPackages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobEngineResp that = (JobEngineResp) obj;
        return Objects.equals(this.engineId, that.engineId) && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.imageUrl, that.imageUrl)
            && Objects.equals(this.installSysPackages, that.installSysPackages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineId, engineName, engineVersion, imageUrl, installSysPackages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEngineResp {\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    installSysPackages: ").append(toIndentedString(installSysPackages)).append("\n");
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
