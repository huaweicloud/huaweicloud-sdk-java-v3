package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAiOpsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aiops_id")

    private String aiopsId;

    public DeleteAiOpsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 指定删除的集群ID。获取方法请参见[获取集群ID](css_03_0101.xml)。 **约束限制**： 不涉及 **取值范围**： 集群ID。 **默认取值**： 不涉及
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteAiOpsRequest withAiopsId(String aiopsId) {
        this.aiopsId = aiopsId;
        return this;
    }

    /**
     * 指定检测任务ID。
     * @return aiopsId
     */
    public String getAiopsId() {
        return aiopsId;
    }

    public void setAiopsId(String aiopsId) {
        this.aiopsId = aiopsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAiOpsRequest that = (DeleteAiOpsRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.aiopsId, that.aiopsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, aiopsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAiOpsRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    aiopsId: ").append(toIndentedString(aiopsId)).append("\n");
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
