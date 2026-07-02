package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取DDL日志下载链接请求体
 */
public class DownloadDdlLogsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_ids")

    private List<String> logIds = null;

    public DownloadDdlLogsRequestBody withLogIds(List<String> logIds) {
        this.logIds = logIds;
        return this;
    }

    public DownloadDdlLogsRequestBody addLogIdsItem(String logIdsItem) {
        if (this.logIds == null) {
            this.logIds = new ArrayList<>();
        }
        this.logIds.add(logIdsItem);
        return this;
    }

    public DownloadDdlLogsRequestBody withLogIds(Consumer<List<String>> logIdsSetter) {
        if (this.logIds == null) {
            this.logIds = new ArrayList<>();
        }
        logIdsSetter.accept(this.logIds);
        return this;
    }

    /**
     * **参数解释**：  DDL日志文件ID列表。  **约束限制**：  列表数量小于等于10。  **取值范围**：  不涉及。  **默认取值**：  不涉及。 
     * @return logIds
     */
    public List<String> getLogIds() {
        return logIds;
    }

    public void setLogIds(List<String> logIds) {
        this.logIds = logIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadDdlLogsRequestBody that = (DownloadDdlLogsRequestBody) obj;
        return Objects.equals(this.logIds, that.logIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadDdlLogsRequestBody {\n");
        sb.append("    logIds: ").append(toIndentedString(logIds)).append("\n");
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
