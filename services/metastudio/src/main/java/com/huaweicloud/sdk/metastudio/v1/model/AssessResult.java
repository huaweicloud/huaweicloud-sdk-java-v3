package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 音频质量评估结果
 */
public class AssessResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private AssessProperty speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sound")

    private AssessProperty sound;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snr")

    private AssessProperty snr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverb")

    private AssessProperty reverb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnsmos_ovrl")

    private AssessProperty dnsmosOvrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnsmos_bak")

    private AssessProperty dnsmosBak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    public AssessResult withSpeed(AssessProperty speed) {
        this.speed = speed;
        return this;
    }

    public AssessResult withSpeed(Consumer<AssessProperty> speedSetter) {
        if (this.speed == null) {
            this.speed = new AssessProperty();
            speedSetter.accept(this.speed);
        }

        return this;
    }

    /**
     * Get speed
     * @return speed
     */
    public AssessProperty getSpeed() {
        return speed;
    }

    public void setSpeed(AssessProperty speed) {
        this.speed = speed;
    }

    public AssessResult withSound(AssessProperty sound) {
        this.sound = sound;
        return this;
    }

    public AssessResult withSound(Consumer<AssessProperty> soundSetter) {
        if (this.sound == null) {
            this.sound = new AssessProperty();
            soundSetter.accept(this.sound);
        }

        return this;
    }

    /**
     * Get sound
     * @return sound
     */
    public AssessProperty getSound() {
        return sound;
    }

    public void setSound(AssessProperty sound) {
        this.sound = sound;
    }

    public AssessResult withSnr(AssessProperty snr) {
        this.snr = snr;
        return this;
    }

    public AssessResult withSnr(Consumer<AssessProperty> snrSetter) {
        if (this.snr == null) {
            this.snr = new AssessProperty();
            snrSetter.accept(this.snr);
        }

        return this;
    }

    /**
     * Get snr
     * @return snr
     */
    public AssessProperty getSnr() {
        return snr;
    }

    public void setSnr(AssessProperty snr) {
        this.snr = snr;
    }

    public AssessResult withReverb(AssessProperty reverb) {
        this.reverb = reverb;
        return this;
    }

    public AssessResult withReverb(Consumer<AssessProperty> reverbSetter) {
        if (this.reverb == null) {
            this.reverb = new AssessProperty();
            reverbSetter.accept(this.reverb);
        }

        return this;
    }

    /**
     * Get reverb
     * @return reverb
     */
    public AssessProperty getReverb() {
        return reverb;
    }

    public void setReverb(AssessProperty reverb) {
        this.reverb = reverb;
    }

    public AssessResult withDnsmosOvrl(AssessProperty dnsmosOvrl) {
        this.dnsmosOvrl = dnsmosOvrl;
        return this;
    }

    public AssessResult withDnsmosOvrl(Consumer<AssessProperty> dnsmosOvrlSetter) {
        if (this.dnsmosOvrl == null) {
            this.dnsmosOvrl = new AssessProperty();
            dnsmosOvrlSetter.accept(this.dnsmosOvrl);
        }

        return this;
    }

    /**
     * Get dnsmosOvrl
     * @return dnsmosOvrl
     */
    public AssessProperty getDnsmosOvrl() {
        return dnsmosOvrl;
    }

    public void setDnsmosOvrl(AssessProperty dnsmosOvrl) {
        this.dnsmosOvrl = dnsmosOvrl;
    }

    public AssessResult withDnsmosBak(AssessProperty dnsmosBak) {
        this.dnsmosBak = dnsmosBak;
        return this;
    }

    public AssessResult withDnsmosBak(Consumer<AssessProperty> dnsmosBakSetter) {
        if (this.dnsmosBak == null) {
            this.dnsmosBak = new AssessProperty();
            dnsmosBakSetter.accept(this.dnsmosBak);
        }

        return this;
    }

    /**
     * Get dnsmosBak
     * @return dnsmosBak
     */
    public AssessProperty getDnsmosBak() {
        return dnsmosBak;
    }

    public void setDnsmosBak(AssessProperty dnsmosBak) {
        this.dnsmosBak = dnsmosBak;
    }

    public AssessResult withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 综合建议
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssessResult that = (AssessResult) obj;
        return Objects.equals(this.speed, that.speed) && Objects.equals(this.sound, that.sound)
            && Objects.equals(this.snr, that.snr) && Objects.equals(this.reverb, that.reverb)
            && Objects.equals(this.dnsmosOvrl, that.dnsmosOvrl) && Objects.equals(this.dnsmosBak, that.dnsmosBak)
            && Objects.equals(this.suggestion, that.suggestion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, sound, snr, reverb, dnsmosOvrl, dnsmosBak, suggestion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssessResult {\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
        sb.append("    snr: ").append(toIndentedString(snr)).append("\n");
        sb.append("    reverb: ").append(toIndentedString(reverb)).append("\n");
        sb.append("    dnsmosOvrl: ").append(toIndentedString(dnsmosOvrl)).append("\n");
        sb.append("    dnsmosBak: ").append(toIndentedString(dnsmosBak)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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
