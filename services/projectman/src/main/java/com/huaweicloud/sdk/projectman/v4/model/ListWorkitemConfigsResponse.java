package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListWorkitemConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "closed_workitem_readonly_mode")

    private Boolean closedWorkitemReadonlyMode;

    public ListWorkitemConfigsResponse withClosedWorkitemReadonlyMode(Boolean closedWorkitemReadonlyMode) {
        this.closedWorkitemReadonlyMode = closedWorkitemReadonlyMode;
        return this;
    }

    /**
     * **参数解释：** 已关闭工作项只读模式。 **取值范围：** true：无法进行编辑或修改。 false：可以进行编辑或修改。
     * @return closedWorkitemReadonlyMode
     */
    public Boolean getClosedWorkitemReadonlyMode() {
        return closedWorkitemReadonlyMode;
    }

    public void setClosedWorkitemReadonlyMode(Boolean closedWorkitemReadonlyMode) {
        this.closedWorkitemReadonlyMode = closedWorkitemReadonlyMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkitemConfigsResponse that = (ListWorkitemConfigsResponse) obj;
        return Objects.equals(this.closedWorkitemReadonlyMode, that.closedWorkitemReadonlyMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(closedWorkitemReadonlyMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkitemConfigsResponse {\n");
        sb.append("    closedWorkitemReadonlyMode: ").append(toIndentedString(closedWorkitemReadonlyMode)).append("\n");
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
