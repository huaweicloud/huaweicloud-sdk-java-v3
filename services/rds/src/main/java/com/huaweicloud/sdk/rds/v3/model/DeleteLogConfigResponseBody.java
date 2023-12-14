package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteLogConfigResponseBody
 */
public class DeleteLogConfigResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<DeleteLogConfigs> logConfigs = null;

    public DeleteLogConfigResponseBody withLogConfigs(List<DeleteLogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public DeleteLogConfigResponseBody addLogConfigsItem(DeleteLogConfigs logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public DeleteLogConfigResponseBody withLogConfigs(Consumer<List<DeleteLogConfigs>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * 实例日志配置信息。
     * @return logConfigs
     */
    public List<DeleteLogConfigs> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<DeleteLogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteLogConfigResponseBody that = (DeleteLogConfigResponseBody) obj;
        return Objects.equals(this.logConfigs, that.logConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLogConfigResponseBody {\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
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
