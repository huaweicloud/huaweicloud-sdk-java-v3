package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateDatasourceInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    private String datasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DatasourceInfo body;

    public UpdateDatasourceInfoRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateDatasourceInfoRequest withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /** 数据源ID
     * 
     * @return datasourceId */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public UpdateDatasourceInfoRequest withBody(DatasourceInfo body) {
        this.body = body;
        return this;
    }

    public UpdateDatasourceInfoRequest withBody(Consumer<DatasourceInfo> bodySetter) {
        if (this.body == null) {
            this.body = new DatasourceInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public DatasourceInfo getBody() {
        return body;
    }

    public void setBody(DatasourceInfo body) {
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
        UpdateDatasourceInfoRequest updateDatasourceInfoRequest = (UpdateDatasourceInfoRequest) o;
        return Objects.equals(this.instanceId, updateDatasourceInfoRequest.instanceId)
            && Objects.equals(this.datasourceId, updateDatasourceInfoRequest.datasourceId)
            && Objects.equals(this.body, updateDatasourceInfoRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, datasourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatasourceInfoRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
