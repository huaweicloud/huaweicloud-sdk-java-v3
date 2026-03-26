package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：RayService日志配置。 **约束限制**：不涉及。 
 */
public class RayServiceLogConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts")

    private RayServiceLogLtsConfig lts;

    public RayServiceLogConfig withLts(RayServiceLogLtsConfig lts) {
        this.lts = lts;
        return this;
    }

    public RayServiceLogConfig withLts(Consumer<RayServiceLogLtsConfig> ltsSetter) {
        if (this.lts == null) {
            this.lts = new RayServiceLogLtsConfig();
            ltsSetter.accept(this.lts);
        }

        return this;
    }

    /**
     * Get lts
     * @return lts
     */
    public RayServiceLogLtsConfig getLts() {
        return lts;
    }

    public void setLts(RayServiceLogLtsConfig lts) {
        this.lts = lts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayServiceLogConfig that = (RayServiceLogConfig) obj;
        return Objects.equals(this.lts, that.lts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayServiceLogConfig {\n");
        sb.append("    lts: ").append(toIndentedString(lts)).append("\n");
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
