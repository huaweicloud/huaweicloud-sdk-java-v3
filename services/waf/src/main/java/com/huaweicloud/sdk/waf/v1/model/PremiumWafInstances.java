package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 租户引擎实例信息
 */
public class PremiumWafInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessed")

    private Boolean accessed;

    public PremiumWafInstances withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 引擎实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PremiumWafInstances withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 引擎实例名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PremiumWafInstances withAccessed(Boolean accessed) {
        this.accessed = accessed;
        return this;
    }

    /**
     * 引擎实例是否已接入，false：未接入；true：已接入
     * @return accessed
     */
    public Boolean getAccessed() {
        return accessed;
    }

    public void setAccessed(Boolean accessed) {
        this.accessed = accessed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PremiumWafInstances premiumWafInstances = (PremiumWafInstances) o;
        return Objects.equals(this.id, premiumWafInstances.id) && Objects.equals(this.name, premiumWafInstances.name)
            && Objects.equals(this.accessed, premiumWafInstances.accessed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, accessed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PremiumWafInstances {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accessed: ").append(toIndentedString(accessed)).append("\n");
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
