package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改数据源配置请求结构体
 */
public class UpdateDcDsReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private Object config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_report")

    private Boolean qualityReport;

    public UpdateDcDsReqDTO withConfig(Object config) {
        this.config = config;
        return this;
    }

    /**
     * 数据源的连接及采集信息
     * @return config
     */
    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    public UpdateDcDsReqDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 采集数据源名称，允许中、数字、英文大小写、下划线、中划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDcDsReqDTO withQualityReport(Boolean qualityReport) {
        this.qualityReport = qualityReport;
        return this;
    }

    /**
     * 质量上报开关，不携带或值不为true，默认为false
     * @return qualityReport
     */
    public Boolean getQualityReport() {
        return qualityReport;
    }

    public void setQualityReport(Boolean qualityReport) {
        this.qualityReport = qualityReport;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDcDsReqDTO that = (UpdateDcDsReqDTO) obj;
        return Objects.equals(this.config, that.config) && Objects.equals(this.name, that.name)
            && Objects.equals(this.qualityReport, that.qualityReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, name, qualityReport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDcDsReqDTO {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    qualityReport: ").append(toIndentedString(qualityReport)).append("\n");
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
