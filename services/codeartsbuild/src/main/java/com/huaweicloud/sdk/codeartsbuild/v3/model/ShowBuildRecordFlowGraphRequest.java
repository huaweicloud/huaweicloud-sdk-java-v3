package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBuildRecordFlowGraphRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_flow_record_id")

    private String buildFlowRecordId;

    public ShowBuildRecordFlowGraphRequest withBuildFlowRecordId(String buildFlowRecordId) {
        this.buildFlowRecordId = buildFlowRecordId;
        return this;
    }

    /**
     * 父任务构建记录ID
     * @return buildFlowRecordId
     */
    public String getBuildFlowRecordId() {
        return buildFlowRecordId;
    }

    public void setBuildFlowRecordId(String buildFlowRecordId) {
        this.buildFlowRecordId = buildFlowRecordId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBuildRecordFlowGraphRequest that = (ShowBuildRecordFlowGraphRequest) obj;
        return Objects.equals(this.buildFlowRecordId, that.buildFlowRecordId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildFlowRecordId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBuildRecordFlowGraphRequest {\n");
        sb.append("    buildFlowRecordId: ").append(toIndentedString(buildFlowRecordId)).append("\n");
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
