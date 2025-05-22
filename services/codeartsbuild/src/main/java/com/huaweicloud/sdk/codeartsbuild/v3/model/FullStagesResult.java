package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class FullStagesResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_stages")

    private Map<String, BuildStageRecord> buildStages = null;

    public FullStagesResult withBuildStages(Map<String, BuildStageRecord> buildStages) {
        this.buildStages = buildStages;
        return this;
    }

    public FullStagesResult putBuildStagesItem(String key, BuildStageRecord buildStagesItem) {
        if (this.buildStages == null) {
            this.buildStages = new HashMap<>();
        }
        this.buildStages.put(key, buildStagesItem);
        return this;
    }

    public FullStagesResult withBuildStages(Consumer<Map<String, BuildStageRecord>> buildStagesSetter) {
        if (this.buildStages == null) {
            this.buildStages = new HashMap<>();
        }
        buildStagesSetter.accept(this.buildStages);
        return this;
    }

    /**
     * 构建步骤
     * @return buildStages
     */
    public Map<String, BuildStageRecord> getBuildStages() {
        return buildStages;
    }

    public void setBuildStages(Map<String, BuildStageRecord> buildStages) {
        this.buildStages = buildStages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullStagesResult that = (FullStagesResult) obj;
        return Objects.equals(this.buildStages, that.buildStages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildStages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullStagesResult {\n");
        sb.append("    buildStages: ").append(toIndentedString(buildStages)).append("\n");
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
