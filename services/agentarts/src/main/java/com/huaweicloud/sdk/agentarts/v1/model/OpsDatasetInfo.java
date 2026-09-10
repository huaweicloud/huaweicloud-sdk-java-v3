package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据集参数。
 */
public class OpsDatasetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    public OpsDatasetInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 数据集ID，标识已创建的训练数据集。  **取值范围：** 真实存在的数据集ID字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsDatasetInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 数据集版本号。  **取值范围：** 版本号字符串。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OpsDatasetInfo withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * **参数解释：** 版本显示名称。  **取值范围：** 版本显示名称字符串。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsDatasetInfo that = (OpsDatasetInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionName, that.versionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, versionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsDatasetInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
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
