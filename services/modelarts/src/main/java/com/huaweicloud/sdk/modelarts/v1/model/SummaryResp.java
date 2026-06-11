package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可视化日志summary。
 */
public class SummaryResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private String logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_dir")

    private LogDirResp logDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sources")

    private List<DataSourceResp> dataSources = null;

    public SummaryResp withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * **参数解释**：训练作业可视化日志类型，配置后训练作业可作为可视化作业数据源。 **取值范围**： - tensorboard：输出TensorBoard可视化工具类型的日志 - mindstudio-insight：输出mindstudio-insight可视化工具类型的日志
     * @return logType
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public SummaryResp withLogDir(LogDirResp logDir) {
        this.logDir = logDir;
        return this;
    }

    public SummaryResp withLogDir(Consumer<LogDirResp> logDirSetter) {
        if (this.logDir == null) {
            this.logDir = new LogDirResp();
            logDirSetter.accept(this.logDir);
        }

        return this;
    }

    /**
     * Get logDir
     * @return logDir
     */
    public LogDirResp getLogDir() {
        return logDir;
    }

    public void setLogDir(LogDirResp logDir) {
        this.logDir = logDir;
    }

    public SummaryResp withDataSources(List<DataSourceResp> dataSources) {
        this.dataSources = dataSources;
        return this;
    }

    public SummaryResp addDataSourcesItem(DataSourceResp dataSourcesItem) {
        if (this.dataSources == null) {
            this.dataSources = new ArrayList<>();
        }
        this.dataSources.add(dataSourcesItem);
        return this;
    }

    public SummaryResp withDataSources(Consumer<List<DataSourceResp>> dataSourcesSetter) {
        if (this.dataSources == null) {
            this.dataSources = new ArrayList<>();
        }
        dataSourcesSetter.accept(this.dataSources);
        return this;
    }

    /**
     * **参数解释**：可视化作业或训练作业调试模式的可视化日志输入。
     * @return dataSources
     */
    public List<DataSourceResp> getDataSources() {
        return dataSources;
    }

    public void setDataSources(List<DataSourceResp> dataSources) {
        this.dataSources = dataSources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SummaryResp that = (SummaryResp) obj;
        return Objects.equals(this.logType, that.logType) && Objects.equals(this.logDir, that.logDir)
            && Objects.equals(this.dataSources, that.dataSources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logType, logDir, dataSources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SummaryResp {\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    logDir: ").append(toIndentedString(logDir)).append("\n");
        sb.append("    dataSources: ").append(toIndentedString(dataSources)).append("\n");
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
