package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDisasterRecoverRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_cluster_id")

    private String primaryClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_cluster_id")

    private String standbyClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public ListDisasterRecoverRequest withPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
        return this;
    }

    /**
     * **参数解释**： 主集群ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return primaryClusterId
     */
    public String getPrimaryClusterId() {
        return primaryClusterId;
    }

    public void setPrimaryClusterId(String primaryClusterId) {
        this.primaryClusterId = primaryClusterId;
    }

    public ListDisasterRecoverRequest withStandbyClusterId(String standbyClusterId) {
        this.standbyClusterId = standbyClusterId;
        return this;
    }

    /**
     * **参数解释**： 备集群ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return standbyClusterId
     */
    public String getStandbyClusterId() {
        return standbyClusterId;
    }

    public void setStandbyClusterId(String standbyClusterId) {
        this.standbyClusterId = standbyClusterId;
    }

    public ListDisasterRecoverRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 容灾ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
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
        ListDisasterRecoverRequest that = (ListDisasterRecoverRequest) obj;
        return Objects.equals(this.primaryClusterId, that.primaryClusterId)
            && Objects.equals(this.standbyClusterId, that.standbyClusterId) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryClusterId, standbyClusterId, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDisasterRecoverRequest {\n");
        sb.append("    primaryClusterId: ").append(toIndentedString(primaryClusterId)).append("\n");
        sb.append("    standbyClusterId: ").append(toIndentedString(standbyClusterId)).append("\n");
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
