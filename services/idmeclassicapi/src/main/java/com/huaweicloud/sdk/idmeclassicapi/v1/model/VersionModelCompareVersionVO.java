package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VersionModelCompareVersionVO
 */
public class VersionModelCompareVersionVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basicVersion")

    private String basicVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "correlationVersion")

    private String correlationVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public VersionModelCompareVersionVO withBasicVersion(String basicVersion) {
        this.basicVersion = basicVersion;
        return this;
    }

    /**
     * 基础版本号。
     * @return basicVersion
     */
    public String getBasicVersion() {
        return basicVersion;
    }

    public void setBasicVersion(String basicVersion) {
        this.basicVersion = basicVersion;
    }

    public VersionModelCompareVersionVO withCorrelationVersion(String correlationVersion) {
        this.correlationVersion = correlationVersion;
        return this;
    }

    /**
     * 对比版本号。
     * @return correlationVersion
     */
    public String getCorrelationVersion() {
        return correlationVersion;
    }

    public void setCorrelationVersion(String correlationVersion) {
        this.correlationVersion = correlationVersion;
    }

    public VersionModelCompareVersionVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主对象ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionModelCompareVersionVO that = (VersionModelCompareVersionVO) obj;
        return Objects.equals(this.basicVersion, that.basicVersion)
            && Objects.equals(this.correlationVersion, that.correlationVersion) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicVersion, correlationVersion, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionModelCompareVersionVO {\n");
        sb.append("    basicVersion: ").append(toIndentedString(basicVersion)).append("\n");
        sb.append("    correlationVersion: ").append(toIndentedString(correlationVersion)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
