package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ExportUserConnectionNewRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal_type")

    private String terminalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_e2e_rtt")

    private Integer minE2eRtt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_e2e_rtt")

    private Integer maxE2eRtt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ExportUserConnectionNewRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询的起始时间。指定该参数后，返回的结果为此时间之后的所有登录记录。时间格式如：“2016-08-20T21:11:11Z”。终止时间不为空时，起始时间为非必填项。开始时间要在最近30天内。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ExportUserConnectionNewRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询的终止时间。指定该参数后，返回的结果为此时间之前的所有登录记录。时间格式如：“2016-08-20T21:11:11Z”。起始时间不为空时，起始时间为非必填项。结束时间要在最近30天内。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ExportUserConnectionNewRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 登录桌面的用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ExportUserConnectionNewRequest withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 计算机名（操作系统信息中可见）。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public ExportUserConnectionNewRequest withTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }

    /**
     * 登录桌面的终端系统类型，该字段支持模糊查询，例如：Windows 10。
     * @return terminalType
     */
    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public ExportUserConnectionNewRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 导出语言，默认英文。 - zh_CN：中文 - en_US：英文
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ExportUserConnectionNewRequest withMinE2eRtt(Integer minE2eRtt) {
        this.minE2eRtt = minE2eRtt;
        return this;
    }

    /**
     * 查询端到端时延的最小值。
     * minimum: 0
     * maximum: 10000
     * @return minE2eRtt
     */
    public Integer getMinE2eRtt() {
        return minE2eRtt;
    }

    public void setMinE2eRtt(Integer minE2eRtt) {
        this.minE2eRtt = minE2eRtt;
    }

    public ExportUserConnectionNewRequest withMaxE2eRtt(Integer maxE2eRtt) {
        this.maxE2eRtt = maxE2eRtt;
        return this;
    }

    /**
     * 查询端到端时延的最大值。
     * minimum: 0
     * maximum: 10000
     * @return maxE2eRtt
     */
    public Integer getMaxE2eRtt() {
        return maxE2eRtt;
    }

    public void setMaxE2eRtt(Integer maxE2eRtt) {
        this.maxE2eRtt = maxE2eRtt;
    }

    public ExportUserConnectionNewRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportUserConnectionNewRequest that = (ExportUserConnectionNewRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.terminalType, that.terminalType) && Objects.equals(this.language, that.language)
            && Objects.equals(this.minE2eRtt, that.minE2eRtt) && Objects.equals(this.maxE2eRtt, that.maxE2eRtt)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            userName,
            computerName,
            terminalType,
            language,
            minE2eRtt,
            maxE2eRtt,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportUserConnectionNewRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    minE2eRtt: ").append(toIndentedString(minE2eRtt)).append("\n");
        sb.append("    maxE2eRtt: ").append(toIndentedString(maxE2eRtt)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
