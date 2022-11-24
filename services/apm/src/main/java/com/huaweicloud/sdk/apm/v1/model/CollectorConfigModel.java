package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 采集器配置。
 */
public class CollectorConfigModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_view_config")

    private LineViewConfigModel lineViewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_view_config")

    private DetailViewConfigModel detailViewConfig;

    public CollectorConfigModel withLineViewConfig(LineViewConfigModel lineViewConfig) {
        this.lineViewConfig = lineViewConfig;
        return this;
    }

    public CollectorConfigModel withLineViewConfig(Consumer<LineViewConfigModel> lineViewConfigSetter) {
        if (this.lineViewConfig == null) {
            this.lineViewConfig = new LineViewConfigModel();
            lineViewConfigSetter.accept(this.lineViewConfig);
        }

        return this;
    }

    /**
     * Get lineViewConfig
     * @return lineViewConfig
     */
    public LineViewConfigModel getLineViewConfig() {
        return lineViewConfig;
    }

    public void setLineViewConfig(LineViewConfigModel lineViewConfig) {
        this.lineViewConfig = lineViewConfig;
    }

    public CollectorConfigModel withDetailViewConfig(DetailViewConfigModel detailViewConfig) {
        this.detailViewConfig = detailViewConfig;
        return this;
    }

    public CollectorConfigModel withDetailViewConfig(Consumer<DetailViewConfigModel> detailViewConfigSetter) {
        if (this.detailViewConfig == null) {
            this.detailViewConfig = new DetailViewConfigModel();
            detailViewConfigSetter.accept(this.detailViewConfig);
        }

        return this;
    }

    /**
     * Get detailViewConfig
     * @return detailViewConfig
     */
    public DetailViewConfigModel getDetailViewConfig() {
        return detailViewConfig;
    }

    public void setDetailViewConfig(DetailViewConfigModel detailViewConfig) {
        this.detailViewConfig = detailViewConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectorConfigModel collectorConfigModel = (CollectorConfigModel) o;
        return Objects.equals(this.lineViewConfig, collectorConfigModel.lineViewConfig)
            && Objects.equals(this.detailViewConfig, collectorConfigModel.detailViewConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineViewConfig, detailViewConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectorConfigModel {\n");
        sb.append("    lineViewConfig: ").append(toIndentedString(lineViewConfig)).append("\n");
        sb.append("    detailViewConfig: ").append(toIndentedString(detailViewConfig)).append("\n");
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
