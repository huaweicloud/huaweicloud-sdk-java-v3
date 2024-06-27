package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除LTS配置
 */
public class DeleteChLtsConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<DeleteChLtsConfigRequestBodyLogConfigs> logConfigs = null;

    public DeleteChLtsConfigRequestBody withLogConfigs(List<DeleteChLtsConfigRequestBodyLogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public DeleteChLtsConfigRequestBody addLogConfigsItem(DeleteChLtsConfigRequestBodyLogConfigs logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public DeleteChLtsConfigRequestBody withLogConfigs(
        Consumer<List<DeleteChLtsConfigRequestBodyLogConfigs>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * LTS配置。
     * @return logConfigs
     */
    public List<DeleteChLtsConfigRequestBodyLogConfigs> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<DeleteChLtsConfigRequestBodyLogConfigs> logConfigs) {
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
        DeleteChLtsConfigRequestBody that = (DeleteChLtsConfigRequestBody) obj;
        return Objects.equals(this.logConfigs, that.logConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteChLtsConfigRequestBody {\n");
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
