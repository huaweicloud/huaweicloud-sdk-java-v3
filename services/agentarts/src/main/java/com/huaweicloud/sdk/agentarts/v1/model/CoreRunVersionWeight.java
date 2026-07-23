package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 单个版本的权重配置。 
 */
public class CoreRunVersionWeight {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Float weight;

    public CoreRunVersionWeight withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * **参数解释**: 版本名称。 
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public CoreRunVersionWeight withWeight(Float weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释**: 流量权重比例 (0.0 - 1.0)。 
     * minimum: 0
     * maximum: 1
     * @return weight
     */
    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunVersionWeight that = (CoreRunVersionWeight) obj;
        return Objects.equals(this.versionName, that.versionName) && Objects.equals(this.weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionName, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunVersionWeight {\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
