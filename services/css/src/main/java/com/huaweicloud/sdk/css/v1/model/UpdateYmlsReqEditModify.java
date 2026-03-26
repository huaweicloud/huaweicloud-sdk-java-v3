package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateYmlsReqEditModify
 */
public class UpdateYmlsReqEditModify {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elasticsearch.yml")

    private Object elasticsearchYml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kibana.yml")

    private Object kibanaYml;

    public UpdateYmlsReqEditModify withElasticsearchYml(Object elasticsearchYml) {
        this.elasticsearchYml = elasticsearchYml;
        return this;
    }

    /**
     * **参数解释**： 参数配置列表，值为需要修改的json数据，OpenSearch集群也使用此参数，即修改opensearch.yml时，这里也是填写elasticsearch.yml。 **约束限制**： 不涉及
     * @return elasticsearchYml
     */
    public Object getElasticsearchYml() {
        return elasticsearchYml;
    }

    public void setElasticsearchYml(Object elasticsearchYml) {
        this.elasticsearchYml = elasticsearchYml;
    }

    public UpdateYmlsReqEditModify withKibanaYml(Object kibanaYml) {
        this.kibanaYml = kibanaYml;
        return this;
    }

    /**
     * **参数解释**： 参数配置列表，值为需要修改的json数据。OpenSearch集群也使用此参数，即修改opensearch_dashboards.yml时，这里也是填写kibana.yml。 **约束限制**： 不涉及
     * @return kibanaYml
     */
    public Object getKibanaYml() {
        return kibanaYml;
    }

    public void setKibanaYml(Object kibanaYml) {
        this.kibanaYml = kibanaYml;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateYmlsReqEditModify that = (UpdateYmlsReqEditModify) obj;
        return Objects.equals(this.elasticsearchYml, that.elasticsearchYml)
            && Objects.equals(this.kibanaYml, that.kibanaYml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elasticsearchYml, kibanaYml);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateYmlsReqEditModify {\n");
        sb.append("    elasticsearchYml: ").append(toIndentedString(elasticsearchYml)).append("\n");
        sb.append("    kibanaYml: ").append(toIndentedString(kibanaYml)).append("\n");
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
