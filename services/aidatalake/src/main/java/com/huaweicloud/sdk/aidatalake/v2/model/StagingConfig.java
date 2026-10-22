package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：临时存储配置。 **约束限制**：不涉及。 
 */
public class StagingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private ObsConfig obs;

    public StagingConfig withObs(ObsConfig obs) {
        this.obs = obs;
        return this;
    }

    public StagingConfig withObs(Consumer<ObsConfig> obsSetter) {
        if (this.obs == null) {
            this.obs = new ObsConfig();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public ObsConfig getObs() {
        return obs;
    }

    public void setObs(ObsConfig obs) {
        this.obs = obs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StagingConfig that = (StagingConfig) obj;
        return Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StagingConfig {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
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
