package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 特性列表。
 */
public class ListConfigFeatures {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "featureId")

    private String featureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ListConfigFeatures withFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }

    /**
     * **参数解释**： 特性ID。     **取值范围**： 不涉及。
     * @return featureId
     */
    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }

    public ListConfigFeatures withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。  **取值范围**： - 0：特性关闭。 - 1：特性开启。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListConfigFeatures withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 特性描述。  **取值范围**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConfigFeatures that = (ListConfigFeatures) obj;
        return Objects.equals(this.featureId, that.featureId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureId, status, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigFeatures {\n");
        sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
