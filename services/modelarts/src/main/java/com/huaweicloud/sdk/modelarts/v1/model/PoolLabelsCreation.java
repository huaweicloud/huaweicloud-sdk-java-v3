package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源池标签信息。
 */
public class PoolLabelsCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/name")

    private String osModelartsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/workspace.id")

    private String osModelartsWorkspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/node.prefix")

    private String osModelartsNodePrefix;

    public PoolLabelsCreation withOsModelartsName(String osModelartsName) {
        this.osModelartsName = osModelartsName;
        return this;
    }

    /**
     * **参数解释**：用户指定的资源池名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsName
     */
    public String getOsModelartsName() {
        return osModelartsName;
    }

    public void setOsModelartsName(String osModelartsName) {
        this.osModelartsName = osModelartsName;
    }

    public PoolLabelsCreation withOsModelartsWorkspaceId(String osModelartsWorkspaceId) {
        this.osModelartsWorkspaceId = osModelartsWorkspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。[获取方法请参见[查询工作空间列表](ListWorkspace.xml)。](tag:hc) **约束限制**：不涉及。 **取值范围**：未创建工作空间时默认值为“0”，存在创建并使用的工作空间，以实际取值为准。 **默认取值**：不涉及。
     * @return osModelartsWorkspaceId
     */
    public String getOsModelartsWorkspaceId() {
        return osModelartsWorkspaceId;
    }

    public void setOsModelartsWorkspaceId(String osModelartsWorkspaceId) {
        this.osModelartsWorkspaceId = osModelartsWorkspaceId;
    }

    public PoolLabelsCreation withOsModelartsNodePrefix(String osModelartsNodePrefix) {
        this.osModelartsNodePrefix = osModelartsNodePrefix;
        return this;
    }

    /**
     * **参数解释**：自定义节点名称前缀。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsNodePrefix
     */
    public String getOsModelartsNodePrefix() {
        return osModelartsNodePrefix;
    }

    public void setOsModelartsNodePrefix(String osModelartsNodePrefix) {
        this.osModelartsNodePrefix = osModelartsNodePrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolLabelsCreation that = (PoolLabelsCreation) obj;
        return Objects.equals(this.osModelartsName, that.osModelartsName)
            && Objects.equals(this.osModelartsWorkspaceId, that.osModelartsWorkspaceId)
            && Objects.equals(this.osModelartsNodePrefix, that.osModelartsNodePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsName, osModelartsWorkspaceId, osModelartsNodePrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolLabelsCreation {\n");
        sb.append("    osModelartsName: ").append(toIndentedString(osModelartsName)).append("\n");
        sb.append("    osModelartsWorkspaceId: ").append(toIndentedString(osModelartsWorkspaceId)).append("\n");
        sb.append("    osModelartsNodePrefix: ").append(toIndentedString(osModelartsNodePrefix)).append("\n");
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
