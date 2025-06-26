package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 集群描述信息对象。 **取值范围**： 不涉及。
 */
public class ClusterDescriptionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description_info")

    private String descriptionInfo;

    public ClusterDescriptionInfo withDescriptionInfo(String descriptionInfo) {
        this.descriptionInfo = descriptionInfo;
        return this;
    }

    /**
     * **参数解释**: 集群描述信息。 **取值范围**: 不涉及。
     * @return descriptionInfo
     */
    public String getDescriptionInfo() {
        return descriptionInfo;
    }

    public void setDescriptionInfo(String descriptionInfo) {
        this.descriptionInfo = descriptionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterDescriptionInfo that = (ClusterDescriptionInfo) obj;
        return Objects.equals(this.descriptionInfo, that.descriptionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descriptionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDescriptionInfo {\n");
        sb.append("    descriptionInfo: ").append(toIndentedString(descriptionInfo)).append("\n");
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
