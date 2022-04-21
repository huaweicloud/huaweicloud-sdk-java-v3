package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除伸缩配置请求
 */
public class BatchDeleteScalingConfigOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_configuration_id")

    private List<String> scalingConfigurationId = null;

    public BatchDeleteScalingConfigOption withScalingConfigurationId(List<String> scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }

    public BatchDeleteScalingConfigOption addScalingConfigurationIdItem(String scalingConfigurationIdItem) {
        if (this.scalingConfigurationId == null) {
            this.scalingConfigurationId = new ArrayList<>();
        }
        this.scalingConfigurationId.add(scalingConfigurationIdItem);
        return this;
    }

    public BatchDeleteScalingConfigOption withScalingConfigurationId(
        Consumer<List<String>> scalingConfigurationIdSetter) {
        if (this.scalingConfigurationId == null) {
            this.scalingConfigurationId = new ArrayList<>();
        }
        scalingConfigurationIdSetter.accept(this.scalingConfigurationId);
        return this;
    }

    /**
     * 伸缩配置ID。
     * @return scalingConfigurationId
     */
    public List<String> getScalingConfigurationId() {
        return scalingConfigurationId;
    }

    public void setScalingConfigurationId(List<String> scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteScalingConfigOption batchDeleteScalingConfigOption = (BatchDeleteScalingConfigOption) o;
        return Objects.equals(this.scalingConfigurationId, batchDeleteScalingConfigOption.scalingConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteScalingConfigOption {\n");
        sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
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
