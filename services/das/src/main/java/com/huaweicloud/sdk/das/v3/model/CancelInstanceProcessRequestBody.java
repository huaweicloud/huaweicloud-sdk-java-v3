package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除会话请求体
 */
public class CancelInstanceProcessRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processes")

    private List<CancelInstanceProcessInfo> processes = null;

    public CancelInstanceProcessRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public CancelInstanceProcessRequestBody withProcesses(List<CancelInstanceProcessInfo> processes) {
        this.processes = processes;
        return this;
    }

    public CancelInstanceProcessRequestBody addProcessesItem(CancelInstanceProcessInfo processesItem) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        this.processes.add(processesItem);
        return this;
    }

    public CancelInstanceProcessRequestBody withProcesses(Consumer<List<CancelInstanceProcessInfo>> processesSetter) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        processesSetter.accept(this.processes);
        return this;
    }

    /**
     * 会话列表
     * @return processes
     */
    public List<CancelInstanceProcessInfo> getProcesses() {
        return processes;
    }

    public void setProcesses(List<CancelInstanceProcessInfo> processes) {
        this.processes = processes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CancelInstanceProcessRequestBody that = (CancelInstanceProcessRequestBody) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.processes, that.processes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, processes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelInstanceProcessRequestBody {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
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
