package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateReportProfileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_profile_id")

    private String reportProfileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateReportProfileDto body;

    public UpdateReportProfileRequest withFwInstanceId(String fwInstanceId) {
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

    public UpdateReportProfileRequest withReportProfileId(String reportProfileId) {
        this.reportProfileId = reportProfileId;
        return this;
    }

    /**
     * **参数解释**： 安全报告模板ID **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return reportProfileId
     */
    public String getReportProfileId() {
        return reportProfileId;
    }

    public void setReportProfileId(String reportProfileId) {
        this.reportProfileId = reportProfileId;
    }

    public UpdateReportProfileRequest withBody(UpdateReportProfileDto body) {
        this.body = body;
        return this;
    }

    public UpdateReportProfileRequest withBody(Consumer<UpdateReportProfileDto> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateReportProfileDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateReportProfileDto getBody() {
        return body;
    }

    public void setBody(UpdateReportProfileDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateReportProfileRequest that = (UpdateReportProfileRequest) obj;
        return Objects.equals(this.fwInstanceId, that.fwInstanceId)
            && Objects.equals(this.reportProfileId, that.reportProfileId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceId, reportProfileId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReportProfileRequest {\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    reportProfileId: ").append(toIndentedString(reportProfileId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
