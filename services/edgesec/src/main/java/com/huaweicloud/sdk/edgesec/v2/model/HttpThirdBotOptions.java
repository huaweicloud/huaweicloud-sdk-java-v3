package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 三方BOT操作
 */
public class HttpThirdBotOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "river_config")

    private HttpRiverConfig riverConfig;

    public HttpThirdBotOptions withRiverConfig(HttpRiverConfig riverConfig) {
        this.riverConfig = riverConfig;
        return this;
    }

    public HttpThirdBotOptions withRiverConfig(Consumer<HttpRiverConfig> riverConfigSetter) {
        if (this.riverConfig == null) {
            this.riverConfig = new HttpRiverConfig();
            riverConfigSetter.accept(this.riverConfig);
        }

        return this;
    }

    /**
     * Get riverConfig
     * @return riverConfig
     */
    public HttpRiverConfig getRiverConfig() {
        return riverConfig;
    }

    public void setRiverConfig(HttpRiverConfig riverConfig) {
        this.riverConfig = riverConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpThirdBotOptions that = (HttpThirdBotOptions) obj;
        return Objects.equals(this.riverConfig, that.riverConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riverConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpThirdBotOptions {\n");
        sb.append("    riverConfig: ").append(toIndentedString(riverConfig)).append("\n");
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
