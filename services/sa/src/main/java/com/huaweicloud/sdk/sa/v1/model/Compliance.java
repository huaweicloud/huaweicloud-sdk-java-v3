package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Compliance
 */
public class Compliance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkitem_id")

    @JacksonXmlProperty(localName = "checkitem_id")

    private String checkitemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_id")

    @JacksonXmlProperty(localName = "checkpoint_id")

    private String checkpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_id")

    @JacksonXmlProperty(localName = "spec_id")

    private String specId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    @JacksonXmlProperty(localName = "properties")

    private String properties;

    public Compliance withCheckitemId(String checkitemId) {
        this.checkitemId = checkitemId;
        return this;
    }

    /**
     * 检查项（检查规则）编号
     * @return checkitemId
     */
    public String getCheckitemId() {
        return checkitemId;
    }

    public void setCheckitemId(String checkitemId) {
        this.checkitemId = checkitemId;
    }

    public Compliance withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    /**
     * 检查点（检查结果）编号，检查项对同一个资源的检查结果
     * @return checkpointId
     */
    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    public Compliance withSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    /**
     * 检查规范编号，默认选第一个
     * @return specId
     */
    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public Compliance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 合规检查结果，取值定义：PASSED、WARNING、FAILED、NOT_AVAILABLE。 说明： PASSED - 接受评估的所有资源都已通过安全检查。 WARNING - 某些信息缺失或配置不支持此检查。 FAILED - 至少有一个接受评估的资源未能通过安全检查。 NOT_AVAILABLE - 由于服务中断或 API 错误，无法执行检查。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Compliance withProperties(String properties) {
        this.properties = properties;
        return this;
    }

    /**
     * 属性信息
     * @return properties
     */
    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Compliance compliance = (Compliance) o;
        return Objects.equals(this.checkitemId, compliance.checkitemId)
            && Objects.equals(this.checkpointId, compliance.checkpointId)
            && Objects.equals(this.specId, compliance.specId) && Objects.equals(this.status, compliance.status)
            && Objects.equals(this.properties, compliance.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkitemId, checkpointId, specId, status, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Compliance {\n");
        sb.append("    checkitemId: ").append(toIndentedString(checkitemId)).append("\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
        sb.append("    specId: ").append(toIndentedString(specId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
