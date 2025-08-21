package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Overview
 */
public class Overview {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policies")

    private AccessPolicy accessPolicies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private ChangedVO assets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_event")

    private AttackEvent attackEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_peak")

    private TrendVO trafficPeak;

    public Overview withAccessPolicies(AccessPolicy accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    public Overview withAccessPolicies(Consumer<AccessPolicy> accessPoliciesSetter) {
        if (this.accessPolicies == null) {
            this.accessPolicies = new AccessPolicy();
            accessPoliciesSetter.accept(this.accessPolicies);
        }

        return this;
    }

    /**
     * Get accessPolicies
     * @return accessPolicies
     */
    public AccessPolicy getAccessPolicies() {
        return accessPolicies;
    }

    public void setAccessPolicies(AccessPolicy accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    public Overview withAssets(ChangedVO assets) {
        this.assets = assets;
        return this;
    }

    public Overview withAssets(Consumer<ChangedVO> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ChangedVO();
            assetsSetter.accept(this.assets);
        }

        return this;
    }

    /**
     * Get assets
     * @return assets
     */
    public ChangedVO getAssets() {
        return assets;
    }

    public void setAssets(ChangedVO assets) {
        this.assets = assets;
    }

    public Overview withAttackEvent(AttackEvent attackEvent) {
        this.attackEvent = attackEvent;
        return this;
    }

    public Overview withAttackEvent(Consumer<AttackEvent> attackEventSetter) {
        if (this.attackEvent == null) {
            this.attackEvent = new AttackEvent();
            attackEventSetter.accept(this.attackEvent);
        }

        return this;
    }

    /**
     * Get attackEvent
     * @return attackEvent
     */
    public AttackEvent getAttackEvent() {
        return attackEvent;
    }

    public void setAttackEvent(AttackEvent attackEvent) {
        this.attackEvent = attackEvent;
    }

    public Overview withTrafficPeak(TrendVO trafficPeak) {
        this.trafficPeak = trafficPeak;
        return this;
    }

    public Overview withTrafficPeak(Consumer<TrendVO> trafficPeakSetter) {
        if (this.trafficPeak == null) {
            this.trafficPeak = new TrendVO();
            trafficPeakSetter.accept(this.trafficPeak);
        }

        return this;
    }

    /**
     * Get trafficPeak
     * @return trafficPeak
     */
    public TrendVO getTrafficPeak() {
        return trafficPeak;
    }

    public void setTrafficPeak(TrendVO trafficPeak) {
        this.trafficPeak = trafficPeak;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Overview that = (Overview) obj;
        return Objects.equals(this.accessPolicies, that.accessPolicies) && Objects.equals(this.assets, that.assets)
            && Objects.equals(this.attackEvent, that.attackEvent) && Objects.equals(this.trafficPeak, that.trafficPeak);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPolicies, assets, attackEvent, trafficPeak);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Overview {\n");
        sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    attackEvent: ").append(toIndentedString(attackEvent)).append("\n");
        sb.append("    trafficPeak: ").append(toIndentedString(trafficPeak)).append("\n");
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
