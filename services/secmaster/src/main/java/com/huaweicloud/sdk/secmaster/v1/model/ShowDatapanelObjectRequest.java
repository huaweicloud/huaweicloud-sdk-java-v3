package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDatapanelObjectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass")

    private String dataclass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataobject_id")

    private String dataobjectId;

    public ShowDatapanelObjectRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间id。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowDatapanelObjectRequest withDataclass(String dataclass) {
        this.dataclass = dataclass;
        return this;
    }

    /**
     * 数据类ID, 您可通过调用[查询数据类列表](ListDataclass.xml)接口获取数据类ID
     * @return dataclass
     */
    public String getDataclass() {
        return dataclass;
    }

    public void setDataclass(String dataclass) {
        this.dataclass = dataclass;
    }

    public ShowDatapanelObjectRequest withDataobjectId(String dataobjectId) {
        this.dataobjectId = dataobjectId;
        return this;
    }

    /**
     * 数据对象ID
     * @return dataobjectId
     */
    public String getDataobjectId() {
        return dataobjectId;
    }

    public void setDataobjectId(String dataobjectId) {
        this.dataobjectId = dataobjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatapanelObjectRequest that = (ShowDatapanelObjectRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.dataclass, that.dataclass)
            && Objects.equals(this.dataobjectId, that.dataobjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, dataclass, dataobjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatapanelObjectRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    dataclass: ").append(toIndentedString(dataclass)).append("\n");
        sb.append("    dataobjectId: ").append(toIndentedString(dataobjectId)).append("\n");
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
