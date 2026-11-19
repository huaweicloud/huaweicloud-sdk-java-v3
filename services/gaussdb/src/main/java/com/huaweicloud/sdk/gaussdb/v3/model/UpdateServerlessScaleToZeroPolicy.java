package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置Serverless自动启停策略请求体。
 */
public class UpdateServerlessScaleToZeroPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_to_zero")

    private Boolean scaleToZero;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_duration_seconds")

    private Integer idleDurationSeconds;

    public UpdateServerlessScaleToZeroPolicy withScaleToZero(Boolean scaleToZero) {
        this.scaleToZero = scaleToZero;
        return this;
    }

    /**
     * **参数解释**：  是否开启Scale to Zero自动启停。  **约束限制**：  仅Serverless实例支持。  **取值范围**：  - true：开启。实例空闲达idle_duration_seconds阈值时算力自动缩容到零（停止VM计费），有新连接时自动唤醒恢复。 - false：关闭。实例正常计费。  **默认取值**：  false。
     * @return scaleToZero
     */
    public Boolean getScaleToZero() {
        return scaleToZero;
    }

    public void setScaleToZero(Boolean scaleToZero) {
        this.scaleToZero = scaleToZero;
    }

    public UpdateServerlessScaleToZeroPolicy withIdleDurationSeconds(Integer idleDurationSeconds) {
        this.idleDurationSeconds = idleDurationSeconds;
        return this;
    }

    /**
     * **参数解释**：  触发缩容到零的空闲检测时长（秒）。实例所有节点无活跃用户连接达到该时长后，自动缩容到零。  **约束限制**：  - 当scale_to_zero为true时，该参数必填。 - 当scale_to_zero为false时，该参数可不传。  **取值范围**：  300～3600。  **默认取值**：  不涉及。
     * @return idleDurationSeconds
     */
    public Integer getIdleDurationSeconds() {
        return idleDurationSeconds;
    }

    public void setIdleDurationSeconds(Integer idleDurationSeconds) {
        this.idleDurationSeconds = idleDurationSeconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateServerlessScaleToZeroPolicy that = (UpdateServerlessScaleToZeroPolicy) obj;
        return Objects.equals(this.scaleToZero, that.scaleToZero)
            && Objects.equals(this.idleDurationSeconds, that.idleDurationSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scaleToZero, idleDurationSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerlessScaleToZeroPolicy {\n");
        sb.append("    scaleToZero: ").append(toIndentedString(scaleToZero)).append("\n");
        sb.append("    idleDurationSeconds: ").append(toIndentedString(idleDurationSeconds)).append("\n");
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
