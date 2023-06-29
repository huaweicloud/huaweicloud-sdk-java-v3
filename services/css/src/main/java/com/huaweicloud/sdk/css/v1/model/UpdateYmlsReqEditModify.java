package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置文件操作。 - modify: 修改参数配置。 - delete: 删除参数配置。 - reset: 重置参数配置。
 */
public class UpdateYmlsReqEditModify {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elasticsearch.yml")

    private Object elasticsearchYml;

    public UpdateYmlsReqEditModify withElasticsearchYml(Object elasticsearchYml) {
        this.elasticsearchYml = elasticsearchYml;
        return this;
    }

    /**
     * 参数配置列表。值为需要修改的json数据。
     * @return elasticsearchYml
     */
    public Object getElasticsearchYml() {
        return elasticsearchYml;
    }

    public void setElasticsearchYml(Object elasticsearchYml) {
        this.elasticsearchYml = elasticsearchYml;
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
        return Objects.equals(this.elasticsearchYml, that.elasticsearchYml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elasticsearchYml);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateYmlsReqEditModify {\n");
        sb.append("    elasticsearchYml: ").append(toIndentedString(elasticsearchYml)).append("\n");
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
