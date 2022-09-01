package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowEngineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")

    @JacksonXmlProperty(localName = "X-Enterprise-Project-ID")

    private String xEnterpriseProjectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_id")

    @JacksonXmlProperty(localName = "engine_id")

    private String engineId;

    public ShowEngineRequest withXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
        return this;
    }

    /**
     * 如果不带则默认企业项目为\"default\"，ID为\"0\"。
     * @return xEnterpriseProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Enterprise-Project-ID")
    public String getXEnterpriseProjectID() {
        return xEnterpriseProjectID;
    }

    public void setXEnterpriseProjectID(String xEnterpriseProjectID) {
        this.xEnterpriseProjectID = xEnterpriseProjectID;
    }

    public ShowEngineRequest withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }

    /**
     * 微服务引擎专享版ID。
     * @return engineId
     */
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEngineRequest showEngineRequest = (ShowEngineRequest) o;
        return Objects.equals(this.xEnterpriseProjectID, showEngineRequest.xEnterpriseProjectID)
            && Objects.equals(this.engineId, showEngineRequest.engineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xEnterpriseProjectID, engineId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEngineRequest {\n");
        sb.append("    xEnterpriseProjectID: ").append(toIndentedString(xEnterpriseProjectID)).append("\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
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
