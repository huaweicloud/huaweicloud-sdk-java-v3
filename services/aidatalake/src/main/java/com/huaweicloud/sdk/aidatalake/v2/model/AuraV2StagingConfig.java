package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：临时存储配置。 
 */
public class AuraV2StagingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private AuraV2ObsConfig obs;

    public AuraV2StagingConfig withObs(AuraV2ObsConfig obs) {
        this.obs = obs;
        return this;
    }

    public AuraV2StagingConfig withObs(Consumer<AuraV2ObsConfig> obsSetter) {
        if (this.obs == null) {
            this.obs = new AuraV2ObsConfig();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public AuraV2ObsConfig getObs() {
        return obs;
    }

    public void setObs(AuraV2ObsConfig obs) {
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
        AuraV2StagingConfig that = (AuraV2StagingConfig) obj;
        return Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuraV2StagingConfig {\n");
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
