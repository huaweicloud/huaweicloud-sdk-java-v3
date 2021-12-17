package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateDataStoreRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_id")

    private String dataStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDataStore body;

    public UpdateDataStoreRequest withDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
        return this;
    }

    /** 存储 ID
     * 
     * @return dataStoreId */
    public String getDataStoreId() {
        return dataStoreId;
    }

    public void setDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
    }

    public UpdateDataStoreRequest withBody(UpdateDataStore body) {
        this.body = body;
        return this;
    }

    public UpdateDataStoreRequest withBody(Consumer<UpdateDataStore> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDataStore();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateDataStore getBody() {
        return body;
    }

    public void setBody(UpdateDataStore body) {
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
        UpdateDataStoreRequest updateDataStoreRequest = (UpdateDataStoreRequest) o;
        return Objects.equals(this.dataStoreId, updateDataStoreRequest.dataStoreId)
            && Objects.equals(this.body, updateDataStoreRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStoreId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDataStoreRequest {\n");
        sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
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
