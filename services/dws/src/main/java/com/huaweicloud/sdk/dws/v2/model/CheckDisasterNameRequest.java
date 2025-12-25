package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CheckDisasterNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_name")

    private String drName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_region")

    private String standbyRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_project_id")

    private String standbyProjectId;

    public CheckDisasterNameRequest withDrName(String drName) {
        this.drName = drName;
        return this;
    }

    /**
     * **参数解释**： 容灾名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return drName
     */
    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public CheckDisasterNameRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 容灾类型。 **约束限制**： 不涉及。 **取值范围**： - az，跨az容灾。 - region，跨region容灾。 **默认取值**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CheckDisasterNameRequest withStandbyRegion(String standbyRegion) {
        this.standbyRegion = standbyRegion;
        return this;
    }

    /**
     * **参数解释**： 备集群所在局点。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return standbyRegion
     */
    public String getStandbyRegion() {
        return standbyRegion;
    }

    public void setStandbyRegion(String standbyRegion) {
        this.standbyRegion = standbyRegion;
    }

    public CheckDisasterNameRequest withStandbyProjectId(String standbyProjectId) {
        this.standbyProjectId = standbyProjectId;
        return this;
    }

    /**
     * **参数解释**： 备集群所在项目ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return standbyProjectId
     */
    public String getStandbyProjectId() {
        return standbyProjectId;
    }

    public void setStandbyProjectId(String standbyProjectId) {
        this.standbyProjectId = standbyProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckDisasterNameRequest that = (CheckDisasterNameRequest) obj;
        return Objects.equals(this.drName, that.drName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.standbyRegion, that.standbyRegion)
            && Objects.equals(this.standbyProjectId, that.standbyProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drName, type, standbyRegion, standbyProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDisasterNameRequest {\n");
        sb.append("    drName: ").append(toIndentedString(drName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    standbyRegion: ").append(toIndentedString(standbyRegion)).append("\n");
        sb.append("    standbyProjectId: ").append(toIndentedString(standbyProjectId)).append("\n");
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
