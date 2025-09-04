package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HtapErrorLogDetailResponseErrorLogList
 */
public class HtapErrorLogDetailResponseErrorLogList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    public HtapErrorLogDetailResponseErrorLogList withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**： HTAP标准版实例节点ID。  **取值范围**：  不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public HtapErrorLogDetailResponseErrorLogList withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**： 日志时间。  **取值范围**：  不涉及。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HtapErrorLogDetailResponseErrorLogList withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**： 日志级别。  **取值范围**：  不涉及。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public HtapErrorLogDetailResponseErrorLogList withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**： 日志内容。  **取值范围**：  不涉及。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public HtapErrorLogDetailResponseErrorLogList withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * **参数解释**： 日志单行序列号，第一次查询时不需要此参数，后续分页查询时需要使用，可从上次查询的返回信息中获取。  **取值范围**：  不涉及。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HtapErrorLogDetailResponseErrorLogList that = (HtapErrorLogDetailResponseErrorLogList) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.time, that.time)
            && Objects.equals(this.level, that.level) && Objects.equals(this.content, that.content)
            && Objects.equals(this.lineNum, that.lineNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, time, level, content, lineNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HtapErrorLogDetailResponseErrorLogList {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
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
