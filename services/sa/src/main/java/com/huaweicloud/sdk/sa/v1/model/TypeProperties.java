package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TypeProperties
 */
public class TypeProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "killchain")

    private String killchain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttps")

    private String ttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effects")

    private String effects;

    public TypeProperties withKillchain(String killchain) {
        this.killchain = killchain;
        return this;
    }

    /**
     * Kill chain事件分类，仅当business为attack有效
     * @return killchain
     */
    public String getKillchain() {
        return killchain;
    }

    public void setKillchain(String killchain) {
        this.killchain = killchain;
    }

    public TypeProperties withTtps(String ttps) {
        this.ttps = ttps;
        return this;
    }

    /**
     * Mitre Array 事件分类，仅当business为attack有效
     * @return ttps
     */
    public String getTtps() {
        return ttps;
    }

    public void setTtps(String ttps) {
        this.ttps = ttps;
    }

    public TypeProperties withEffects(String effects) {
        this.effects = effects;
        return this;
    }

    /**
     * 影响，适用全部类型
     * @return effects
     */
    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TypeProperties that = (TypeProperties) obj;
        return Objects.equals(this.killchain, that.killchain) && Objects.equals(this.ttps, that.ttps)
            && Objects.equals(this.effects, that.effects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(killchain, ttps, effects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeProperties {\n");
        sb.append("    killchain: ").append(toIndentedString(killchain)).append("\n");
        sb.append("    ttps: ").append(toIndentedString(ttps)).append("\n");
        sb.append("    effects: ").append(toIndentedString(effects)).append("\n");
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
