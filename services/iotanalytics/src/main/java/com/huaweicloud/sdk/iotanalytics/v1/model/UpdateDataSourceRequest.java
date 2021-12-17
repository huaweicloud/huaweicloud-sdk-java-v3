package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateDataSourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    private String datasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDatasourceReqDTO body;

    public UpdateDataSourceRequest withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /** 数据源id
     * 
     * @return datasourceId */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public UpdateDataSourceRequest withBody(UpdateDatasourceReqDTO body) {
        this.body = body;
        return this;
    }

    public UpdateDataSourceRequest withBody(Consumer<UpdateDatasourceReqDTO> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDatasourceReqDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateDatasourceReqDTO getBody() {
        return body;
    }

    public void setBody(UpdateDatasourceReqDTO body) {
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
        UpdateDataSourceRequest updateDataSourceRequest = (UpdateDataSourceRequest) o;
        return Objects.equals(this.datasourceId, updateDataSourceRequest.datasourceId)
            && Objects.equals(this.body, updateDataSourceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDataSourceRequest {\n");
        sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
