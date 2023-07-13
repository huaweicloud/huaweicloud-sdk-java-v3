package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 调度策略
 */
public class ConfigurationScheduler {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private SchedulerAffinity affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anti-affinity")

    private SchedulerAffinity antiAffinity;

    public ConfigurationScheduler withAffinity(SchedulerAffinity affinity) {
        this.affinity = affinity;
        return this;
    }

    public ConfigurationScheduler withAffinity(Consumer<SchedulerAffinity> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new SchedulerAffinity();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /**
     * Get affinity
     * @return affinity
     */
    public SchedulerAffinity getAffinity() {
        return affinity;
    }

    public void setAffinity(SchedulerAffinity affinity) {
        this.affinity = affinity;
    }

    public ConfigurationScheduler withAntiAffinity(SchedulerAffinity antiAffinity) {
        this.antiAffinity = antiAffinity;
        return this;
    }

    public ConfigurationScheduler withAntiAffinity(Consumer<SchedulerAffinity> antiAffinitySetter) {
        if (this.antiAffinity == null) {
            this.antiAffinity = new SchedulerAffinity();
            antiAffinitySetter.accept(this.antiAffinity);
        }

        return this;
    }

    /**
     * Get antiAffinity
     * @return antiAffinity
     */
    public SchedulerAffinity getAntiAffinity() {
        return antiAffinity;
    }

    public void setAntiAffinity(SchedulerAffinity antiAffinity) {
        this.antiAffinity = antiAffinity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationScheduler that = (ConfigurationScheduler) obj;
        return Objects.equals(this.affinity, that.affinity) && Objects.equals(this.antiAffinity, that.antiAffinity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affinity, antiAffinity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationScheduler {\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    antiAffinity: ").append(toIndentedString(antiAffinity)).append("\n");
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
