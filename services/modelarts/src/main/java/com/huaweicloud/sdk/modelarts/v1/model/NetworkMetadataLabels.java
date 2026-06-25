package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网络资源的标签信息。
 */
public class NetworkMetadataLabels {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/name")

    private String osModelartsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/workspace.id")

    private String osModelartsWorkspaceId;

    public NetworkMetadataLabels withOsModelartsName(String osModelartsName) {
        this.osModelartsName = osModelartsName;
        return this;
    }

    /**
     * **参数解释**：资源池的显示名称。 **取值范围**：只能以小写字母开头，数字、中划线组成，不能以中划线结尾，且长度为4-32。
     * @return osModelartsName
     */
    public String getOsModelartsName() {
        return osModelartsName;
    }

    public void setOsModelartsName(String osModelartsName) {
        this.osModelartsName = osModelartsName;
    }

    public NetworkMetadataLabels withOsModelartsWorkspaceId(String osModelartsWorkspaceId) {
        this.osModelartsWorkspaceId = osModelartsWorkspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。[获取方法请参见[查询工作空间列表](ListWorkspace.xml)。](tag:hc) **取值范围**：不涉及。
     * @return osModelartsWorkspaceId
     */
    public String getOsModelartsWorkspaceId() {
        return osModelartsWorkspaceId;
    }

    public void setOsModelartsWorkspaceId(String osModelartsWorkspaceId) {
        this.osModelartsWorkspaceId = osModelartsWorkspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkMetadataLabels that = (NetworkMetadataLabels) obj;
        return Objects.equals(this.osModelartsName, that.osModelartsName)
            && Objects.equals(this.osModelartsWorkspaceId, that.osModelartsWorkspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsName, osModelartsWorkspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkMetadataLabels {\n");
        sb.append("    osModelartsName: ").append(toIndentedString(osModelartsName)).append("\n");
        sb.append("    osModelartsWorkspaceId: ").append(toIndentedString(osModelartsWorkspaceId)).append("\n");
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
