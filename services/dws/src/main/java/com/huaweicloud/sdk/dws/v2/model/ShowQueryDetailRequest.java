package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowQueryDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ctime")

    private Long ctime;

    public ShowQueryDetailRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。获取方法请参见[获取集群ID](dws_02_00068.xml)。 **约束限制**： 必须是有效的dws集群ID。 **取值范围**： 36位UUID。 **默认取值**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowQueryDetailRequest withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * **参数解释**： 查询ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public ShowQueryDetailRequest withCtime(Long ctime) {
        this.ctime = ctime;
        return this;
    }

    /**
     * **参数解释**： 采集时间，时间戳。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return ctime
     */
    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowQueryDetailRequest that = (ShowQueryDetailRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.queryId, that.queryId)
            && Objects.equals(this.ctime, that.ctime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, queryId, ctime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQueryDetailRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
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
