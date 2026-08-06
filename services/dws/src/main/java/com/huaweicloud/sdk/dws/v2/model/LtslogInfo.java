package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： LTS日志信息。 **取值范围**： 不涉及。
 */
public class LtslogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private String logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_desc")

    private String logDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_url")

    private String accessUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_interval")

    private Integer reportInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_report_size")

    private Integer maxReportSize;

    public LtslogInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 配置状态。 **取值范围**： - OPEN：开启。 - CLOSE：关闭。 - ARCHIVED：历史日志流，不再上报但仍保留LTS访问入口。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LtslogInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 日志ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LtslogInfo withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * **参数解释**： 日志类型。 **取值范围**： - messages：系统日志。 - expand：扩容日志。 - roach-controller：roach服务端日志。 - audit：审计日志。 - gtm：gtm日志。 - roach-agent：roach客户端日志。 - cms：cms日志。 - CN：dws-CN节点日志。 - upgrade: 升级日志。 - DN: dws-DN节点日志。
     * @return logType
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public LtslogInfo withLogDesc(String logDesc) {
        this.logDesc = logDesc;
        return this;
    }

    /**
     * **参数解释**： 日志描述。 **取值范围**： 不涉及。
     * @return logDesc
     */
    public String getLogDesc() {
        return logDesc;
    }

    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
    }

    public LtslogInfo withAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
        return this;
    }

    /**
     * **参数解释**： LTS日志访问URL。 **取值范围**： 不涉及。
     * @return accessUrl
     */
    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public LtslogInfo withReportInterval(Integer reportInterval) {
        this.reportInterval = reportInterval;
        return this;
    }

    /**
     * **参数解释**： 日志上报频率，单位秒。 **约束限制**： 仅 status=OPEN 的日志流返回此字段，ARCHIVED 状态不返回。 **取值范围**： 5~60。
     * @return reportInterval
     */
    public Integer getReportInterval() {
        return reportInterval;
    }

    public void setReportInterval(Integer reportInterval) {
        this.reportInterval = reportInterval;
    }

    public LtslogInfo withMaxReportSize(Integer maxReportSize) {
        this.maxReportSize = maxReportSize;
        return this;
    }

    /**
     * **参数解释**： 单次上报大小，单位字节。 **约束限制**： 仅 status=OPEN 的日志流返回此字段，ARCHIVED 状态不返回。 **取值范围**： 51200~1048576。
     * @return maxReportSize
     */
    public Integer getMaxReportSize() {
        return maxReportSize;
    }

    public void setMaxReportSize(Integer maxReportSize) {
        this.maxReportSize = maxReportSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtslogInfo that = (LtslogInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.id, that.id)
            && Objects.equals(this.logType, that.logType) && Objects.equals(this.logDesc, that.logDesc)
            && Objects.equals(this.accessUrl, that.accessUrl)
            && Objects.equals(this.reportInterval, that.reportInterval)
            && Objects.equals(this.maxReportSize, that.maxReportSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, id, logType, logDesc, accessUrl, reportInterval, maxReportSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtslogInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    logDesc: ").append(toIndentedString(logDesc)).append("\n");
        sb.append("    accessUrl: ").append(toIndentedString(accessUrl)).append("\n");
        sb.append("    reportInterval: ").append(toIndentedString(reportInterval)).append("\n");
        sb.append("    maxReportSize: ").append(toIndentedString(maxReportSize)).append("\n");
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
