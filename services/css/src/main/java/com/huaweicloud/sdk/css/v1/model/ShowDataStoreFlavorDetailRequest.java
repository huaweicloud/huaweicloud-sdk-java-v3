package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDataStoreFlavorDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_id")

    private String datastoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_version_id")

    private String datastoreVersionId;

    public ShowDataStoreFlavorDetailRequest withDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
        return this;
    }

    /**
     * **参数解释**： 引擎类型id。 **约束限制**： 不涉及 **取值范围**： Elasticsearch：cf7e2c8f-096c-4fcf-b174-1ebe060679fb。 Opensearch：07ec9f86-ec2f-49e7-8913-373003aedf32。 Logstash: 575276bb-87e5-4e18-8e1e-e748d8ad3a06。 **默认取值**： 不涉及
     * @return datastoreId
     */
    public String getDatastoreId() {
        return datastoreId;
    }

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    public ShowDataStoreFlavorDetailRequest withDatastoreVersionId(String datastoreVersionId) {
        this.datastoreVersionId = datastoreVersionId;
        return this;
    }

    /**
     * **参数解释**： 引擎类型id。 **约束限制**： 不涉及 **取值范围**： Elasticsearch 7.10.2：01f53413-0a58-4b0c-848a-f625846bae23。 Opensearch 2.19.0：11a9df5c-711f-496c-866d-a4521c179671。 Logstash 7.10.0: f5609cf0-3514-49ef-87db-a3df2858a46f。 **默认取值**： 不涉及
     * @return datastoreVersionId
     */
    public String getDatastoreVersionId() {
        return datastoreVersionId;
    }

    public void setDatastoreVersionId(String datastoreVersionId) {
        this.datastoreVersionId = datastoreVersionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataStoreFlavorDetailRequest that = (ShowDataStoreFlavorDetailRequest) obj;
        return Objects.equals(this.datastoreId, that.datastoreId)
            && Objects.equals(this.datastoreVersionId, that.datastoreVersionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreId, datastoreVersionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataStoreFlavorDetailRequest {\n");
        sb.append("    datastoreId: ").append(toIndentedString(datastoreId)).append("\n");
        sb.append("    datastoreVersionId: ").append(toIndentedString(datastoreVersionId)).append("\n");
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
