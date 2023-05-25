package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 部署策略
 */
public class ConfigurationStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade")

    private String upgrade;

    public ConfigurationStrategy withUpgrade(String upgrade) {
        this.upgrade = upgrade;
        return this;
    }

    /**
     * 部署策略
     * @return upgrade
     */
    public String getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(String upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationStrategy configurationStrategy = (ConfigurationStrategy) o;
        return Objects.equals(this.upgrade, configurationStrategy.upgrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upgrade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationStrategy {\n");
        sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
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
