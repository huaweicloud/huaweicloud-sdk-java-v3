package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Prometheus监控配置。 
 */
public class PrometheusConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aom_prometheus_id")

    private String aomPrometheusId;

    public PrometheusConfig withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**：是否接入AOM。 **约束限制**：不涉及。 **取值范围**：   - true：接入AOM。   - false：不接入AOM。 **默认取值**：false。 
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public PrometheusConfig withAomPrometheusId(String aomPrometheusId) {
        this.aomPrometheusId = aomPrometheusId;
        return this;
    }

    /**
     * **参数解释**：AOM Prometheus实例ID，可通过AOM管理控制台或查询AOM Prometheus实例列表接口获取。 **约束限制**：不涉及。 **取值范围**：长度为0~256个字符，支持英文字符、数字、中划线和下划线的组合。 **默认取值**：不涉及。 
     * @return aomPrometheusId
     */
    public String getAomPrometheusId() {
        return aomPrometheusId;
    }

    public void setAomPrometheusId(String aomPrometheusId) {
        this.aomPrometheusId = aomPrometheusId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrometheusConfig that = (PrometheusConfig) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.aomPrometheusId, that.aomPrometheusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, aomPrometheusId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrometheusConfig {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    aomPrometheusId: ").append(toIndentedString(aomPrometheusId)).append("\n");
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
