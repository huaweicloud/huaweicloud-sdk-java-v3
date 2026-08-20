package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 日志配置。 **约束限制：** 不涉及。
 */
public class LtsConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<LtsFiles> files = null;

    public LtsConfiguration withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 日志服务状态。 **取值范围：** - ON：开启。 - OFF：关闭。 **默认取值：** ON。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LtsConfiguration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** LTS日志类型。 **约束限制：** 不涉及。 **取值范围：** - STDOUT：容器标准输出 - EVENT：Kubernetes事件 - FILE：容器日志文件 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LtsConfiguration withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * **参数解释：** 日志组ID，用户选择自己已有的日志组，不填时，会自动创建。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public LtsConfiguration withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * **参数解释：** 日志流id，用户选择自己已有的日志组。不填时，会自动创建。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public LtsConfiguration withFiles(List<LtsFiles> files) {
        this.files = files;
        return this;
    }

    public LtsConfiguration addFilesItem(LtsFiles filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public LtsConfiguration withFiles(Consumer<List<LtsFiles>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * **参数解释：** 容器日志文件配置。 **约束限制：** 数量上限为10个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return files
     */
    public List<LtsFiles> getFiles() {
        return files;
    }

    public void setFiles(List<LtsFiles> files) {
        this.files = files;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsConfiguration that = (LtsConfiguration) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.files, that.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type, logGroupId, logStreamId, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsConfiguration {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
