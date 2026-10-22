package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算力滥用防护配置
 */
public class AbuseConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private AbuseScope scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private AbuseThreshold threshold;

    public AbuseConfig withScope(AbuseScope scope) {
        this.scope = scope;
        return this;
    }

    public AbuseConfig withScope(Consumer<AbuseScope> scopeSetter) {
        if (this.scope == null) {
            this.scope = new AbuseScope();
            scopeSetter.accept(this.scope);
        }

        return this;
    }

    /**
     * Get scope
     * @return scope
     */
    public AbuseScope getScope() {
        return scope;
    }

    public void setScope(AbuseScope scope) {
        this.scope = scope;
    }

    public AbuseConfig withThreshold(AbuseThreshold threshold) {
        this.threshold = threshold;
        return this;
    }

    public AbuseConfig withThreshold(Consumer<AbuseThreshold> thresholdSetter) {
        if (this.threshold == null) {
            this.threshold = new AbuseThreshold();
            thresholdSetter.accept(this.threshold);
        }

        return this;
    }

    /**
     * Get threshold
     * @return threshold
     */
    public AbuseThreshold getThreshold() {
        return threshold;
    }

    public void setThreshold(AbuseThreshold threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbuseConfig that = (AbuseConfig) obj;
        return Objects.equals(this.scope, that.scope) && Objects.equals(this.threshold, that.threshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, threshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbuseConfig {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
