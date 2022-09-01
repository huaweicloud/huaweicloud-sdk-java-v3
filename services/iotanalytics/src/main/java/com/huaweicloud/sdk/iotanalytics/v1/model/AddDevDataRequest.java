package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class AddDevDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    @JacksonXmlProperty(localName = "datasource_id")

    private String datasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private Object body;

    public AddDevDataRequest withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /**
     * 数据源id
     * @return datasourceId
     */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public AddDevDataRequest withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDevDataRequest addDevDataRequest = (AddDevDataRequest) o;
        return Objects.equals(this.datasourceId, addDevDataRequest.datasourceId)
            && Objects.equals(this.body, addDevDataRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDevDataRequest {\n");
        sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
