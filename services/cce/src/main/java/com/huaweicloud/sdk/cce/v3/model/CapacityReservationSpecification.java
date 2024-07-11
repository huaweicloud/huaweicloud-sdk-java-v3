package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扩展伸缩组容量预留配置
 */
public class CapacityReservationSpecification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preference")

    private String preference;

    public CapacityReservationSpecification withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 私有池id，preference为none时忽略该值
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CapacityReservationSpecification withPreference(String preference) {
        this.preference = preference;
        return this;
    }

    /**
     * 私有池容量选项，为 none 时表示不指定容量预留，为 targeted 时表示指定容量预留，此时 id 不能为空
     * @return preference
     */
    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapacityReservationSpecification that = (CapacityReservationSpecification) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.preference, that.preference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, preference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapacityReservationSpecification {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
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
