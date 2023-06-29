package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTasklogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_info")

    private ParamInfo paramInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_info")

    private List<LogInfo> logInfo = null;

    public ShowTasklogResponse withParamInfo(ParamInfo paramInfo) {
        this.paramInfo = paramInfo;
        return this;
    }

    public ShowTasklogResponse withParamInfo(Consumer<ParamInfo> paramInfoSetter) {
        if (this.paramInfo == null) {
            this.paramInfo = new ParamInfo();
            paramInfoSetter.accept(this.paramInfo);
        }

        return this;
    }

    /**
     * Get paramInfo
     * @return paramInfo
     */
    public ParamInfo getParamInfo() {
        return paramInfo;
    }

    public void setParamInfo(ParamInfo paramInfo) {
        this.paramInfo = paramInfo;
    }

    public ShowTasklogResponse withLogInfo(List<LogInfo> logInfo) {
        this.logInfo = logInfo;
        return this;
    }

    public ShowTasklogResponse addLogInfoItem(LogInfo logInfoItem) {
        if (this.logInfo == null) {
            this.logInfo = new ArrayList<>();
        }
        this.logInfo.add(logInfoItem);
        return this;
    }

    public ShowTasklogResponse withLogInfo(Consumer<List<LogInfo>> logInfoSetter) {
        if (this.logInfo == null) {
            this.logInfo = new ArrayList<>();
        }
        logInfoSetter.accept(this.logInfo);
        return this;
    }

    /**
     * 日志信息
     * @return logInfo
     */
    public List<LogInfo> getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(List<LogInfo> logInfo) {
        this.logInfo = logInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTasklogResponse that = (ShowTasklogResponse) obj;
        return Objects.equals(this.paramInfo, that.paramInfo) && Objects.equals(this.logInfo, that.logInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramInfo, logInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTasklogResponse {\n");
        sb.append("    paramInfo: ").append(toIndentedString(paramInfo)).append("\n");
        sb.append("    logInfo: ").append(toIndentedString(logInfo)).append("\n");
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
