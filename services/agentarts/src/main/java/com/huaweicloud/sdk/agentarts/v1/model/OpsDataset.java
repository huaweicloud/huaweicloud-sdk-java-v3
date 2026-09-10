package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据集参数。
 */
public class OpsDataset {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public OpsDataset withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 数据集ID，标识已创建的训练数据集。可通过获取评测集列表接口查询，注意需要使用latest_version不为空的数据集，不为空即表示该数据集已经执行过发布。  **约束限制：** 不涉及  **取值范围：** 数据集ID，可通过[查询数据集列表](https://support.huaweicloud.com/api-agentarts/ListOpsDatasets.html)接口获取。  **默认取值：** 无
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpsDataset withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 数据集版本。  **约束限制：** 不涉及  **取值范围：** 数据集版本号字符串。  **默认取值：** 无
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsDataset that = (OpsDataset) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsDataset {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
