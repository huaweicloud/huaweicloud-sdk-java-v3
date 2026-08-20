package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：**  容器日志文件配置。 **约束限制：**  数量上限为10个。
 */
public class LtsFiles {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_path")

    private String logPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_pattern")

    private String filePattern;

    public LtsFiles withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * **参数解释：** 日志文件路径。 **约束限制：** 1.路径必须以 / 开头，且第一级目录不能使用通配符，只能包含大写字母，小写字母，数字或特殊符号-_/_*?，长度不能超过 512 个字符。 2.最多允许三级目录使用通配符进行匹配。 **取值范围：** 不涉及 **默认取值：** 不涉及。
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public LtsFiles withFilePattern(String filePattern) {
        this.filePattern = filePattern;
        return this;
    }

    /**
     * **参数解释：** 日志文件名称。 **约束限制：** 只能包含大写字母，小写字母，数字或特殊字符-_*?，不支持.gz .tar .zip后缀类型，长度不能超过 255 个字符。 **取值范围：** 不涉及 **默认取值：** 不涉及。
     * @return filePattern
     */
    public String getFilePattern() {
        return filePattern;
    }

    public void setFilePattern(String filePattern) {
        this.filePattern = filePattern;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsFiles that = (LtsFiles) obj;
        return Objects.equals(this.logPath, that.logPath) && Objects.equals(this.filePattern, that.filePattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logPath, filePattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsFiles {\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    filePattern: ").append(toIndentedString(filePattern)).append("\n");
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
