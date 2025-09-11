package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadAuditReportRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local")

    private String local;

    public DownloadAuditReportRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。可通过查询实例列表接口ID字段获取 **约束限制**： 不涉及 **取值范围**： 以查询实例列表接口值为准，字符长度32-64。 **默认取值**： 不涉及 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DownloadAuditReportRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 报表ID。可通过查询报表接口ID值获取。 **约束限制**： 不涉及 **取值范围**： 以查询报表接口值为准，字符长度16-64。 **默认取值**： 不涉及 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DownloadAuditReportRequest withLocal(String local) {
        this.local = local;
        return this;
    }

    /**
     * **参数解释**： 语言区域。 **约束限制**： 仅支持取值范围约定的值 **取值范围**： - en-us : 英语 - zh-cn : 中文 **默认取值**： en-us 
     * @return local
     */
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAuditReportRequest that = (DownloadAuditReportRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.local, that.local);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, id, local);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadAuditReportRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    local: ").append(toIndentedString(local)).append("\n");
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
