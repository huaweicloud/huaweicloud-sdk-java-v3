package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowReportProfileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_profile_id")

    private String reportProfileId;

    public ShowReportProfileRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * **参数解释**： 防火墙ID，用户创建防火墙实例后产生的唯一ID，配置后可区分不同防火墙，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public ShowReportProfileRequest withReportProfileId(String reportProfileId) {
        this.reportProfileId = reportProfileId;
        return this;
    }

    /**
     * **参数解释**： 安全报告模板ID，可以通过调用[查询安全报告模板列表接口]获得，通过返回值中的data.records.profile_id获得 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return reportProfileId
     */
    public String getReportProfileId() {
        return reportProfileId;
    }

    public void setReportProfileId(String reportProfileId) {
        this.reportProfileId = reportProfileId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportProfileRequest that = (ShowReportProfileRequest) obj;
        return Objects.equals(this.fwInstanceId, that.fwInstanceId)
            && Objects.equals(this.reportProfileId, that.reportProfileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId, reportProfileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportProfileRequest {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    reportProfileId: ").append(toIndentedString(reportProfileId)).append("\n");
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
