package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListAlertRspProcess
 */
public class ListAlertRspProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_name")

    private String processName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_path")

    private String processPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_pid")

    private Integer processPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_uid")

    private Integer processUid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_cmdline")

    private String processCmdline;

    public ListAlertRspProcess withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * The name, display only
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public ListAlertRspProcess withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * The name, display only
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public ListAlertRspProcess withProcessPid(Integer processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * Id value
     * @return processPid
     */
    public Integer getProcessPid() {
        return processPid;
    }

    public void setProcessPid(Integer processPid) {
        this.processPid = processPid;
    }

    public ListAlertRspProcess withProcessUid(Integer processUid) {
        this.processUid = processUid;
        return this;
    }

    /**
     * Id value
     * @return processUid
     */
    public Integer getProcessUid() {
        return processUid;
    }

    public void setProcessUid(Integer processUid) {
        this.processUid = processUid;
    }

    public ListAlertRspProcess withProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
        return this;
    }

    /**
     * The name, display only
     * @return processCmdline
     */
    public String getProcessCmdline() {
        return processCmdline;
    }

    public void setProcessCmdline(String processCmdline) {
        this.processCmdline = processCmdline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlertRspProcess that = (ListAlertRspProcess) obj;
        return Objects.equals(this.processName, that.processName) && Objects.equals(this.processPath, that.processPath)
            && Objects.equals(this.processPid, that.processPid) && Objects.equals(this.processUid, that.processUid)
            && Objects.equals(this.processCmdline, that.processCmdline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processName, processPath, processPid, processUid, processCmdline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertRspProcess {\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    processUid: ").append(toIndentedString(processUid)).append("\n");
        sb.append("    processCmdline: ").append(toIndentedString(processCmdline)).append("\n");
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
