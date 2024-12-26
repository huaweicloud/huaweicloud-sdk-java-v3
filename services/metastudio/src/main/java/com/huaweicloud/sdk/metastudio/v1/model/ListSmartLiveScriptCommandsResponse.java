package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListSmartLiveScriptCommandsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scripts_commands")

    private List<ScriptCommand> scriptsCommands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListSmartLiveScriptCommandsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数字人直播任务总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSmartLiveScriptCommandsResponse withScriptsCommands(List<ScriptCommand> scriptsCommands) {
        this.scriptsCommands = scriptsCommands;
        return this;
    }

    public ListSmartLiveScriptCommandsResponse addScriptsCommandsItem(ScriptCommand scriptsCommandsItem) {
        if (this.scriptsCommands == null) {
            this.scriptsCommands = new ArrayList<>();
        }
        this.scriptsCommands.add(scriptsCommandsItem);
        return this;
    }

    public ListSmartLiveScriptCommandsResponse withScriptsCommands(
        Consumer<List<ScriptCommand>> scriptsCommandsSetter) {
        if (this.scriptsCommands == null) {
            this.scriptsCommands = new ArrayList<>();
        }
        scriptsCommandsSetter.accept(this.scriptsCommands);
        return this;
    }

    /**
     * 数字人话术命令列表。
     * @return scriptsCommands
     */
    public List<ScriptCommand> getScriptsCommands() {
        return scriptsCommands;
    }

    public void setScriptsCommands(List<ScriptCommand> scriptsCommands) {
        this.scriptsCommands = scriptsCommands;
    }

    public ListSmartLiveScriptCommandsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSmartLiveScriptCommandsResponse that = (ListSmartLiveScriptCommandsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.scriptsCommands, that.scriptsCommands)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, scriptsCommands, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSmartLiveScriptCommandsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    scriptsCommands: ").append(toIndentedString(scriptsCommands)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
