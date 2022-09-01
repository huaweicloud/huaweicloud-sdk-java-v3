package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单个音素的发音评测结果
 */
public class Phoneme {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arpa")

    @JacksonXmlProperty(localName = "arpa")

    private String arpa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipa")

    @JacksonXmlProperty(localName = "ipa")

    private String ipa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private Float startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private Float endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fluency")

    @JacksonXmlProperty(localName = "fluency")

    private PhonemeFluency fluency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pronunciation")

    @JacksonXmlProperty(localName = "pronunciation")

    private PhonemePronunciation pronunciation;

    public Phoneme withArpa(String arpa) {
        this.arpa = arpa;
        return this;
    }

    /**
     * 音标（ARPAbet音标系统）
     * @return arpa
     */
    public String getArpa() {
        return arpa;
    }

    public void setArpa(String arpa) {
        this.arpa = arpa;
    }

    public Phoneme withIpa(String ipa) {
        this.ipa = ipa;
        return this;
    }

    /**
     * 音标（国际音标系统）
     * @return ipa
     */
    public String getIpa() {
        return ipa;
    }

    public void setIpa(String ipa) {
        this.ipa = ipa;
    }

    public Phoneme withStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 
     * @return startTime
     */
    public Float getStartTime() {
        return startTime;
    }

    public void setStartTime(Float startTime) {
        this.startTime = startTime;
    }

    public Phoneme withEndTime(Float endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 
     * @return endTime
     */
    public Float getEndTime() {
        return endTime;
    }

    public void setEndTime(Float endTime) {
        this.endTime = endTime;
    }

    public Phoneme withFluency(PhonemeFluency fluency) {
        this.fluency = fluency;
        return this;
    }

    public Phoneme withFluency(Consumer<PhonemeFluency> fluencySetter) {
        if (this.fluency == null) {
            this.fluency = new PhonemeFluency();
            fluencySetter.accept(this.fluency);
        }

        return this;
    }

    /**
     * Get fluency
     * @return fluency
     */
    public PhonemeFluency getFluency() {
        return fluency;
    }

    public void setFluency(PhonemeFluency fluency) {
        this.fluency = fluency;
    }

    public Phoneme withPronunciation(PhonemePronunciation pronunciation) {
        this.pronunciation = pronunciation;
        return this;
    }

    public Phoneme withPronunciation(Consumer<PhonemePronunciation> pronunciationSetter) {
        if (this.pronunciation == null) {
            this.pronunciation = new PhonemePronunciation();
            pronunciationSetter.accept(this.pronunciation);
        }

        return this;
    }

    /**
     * Get pronunciation
     * @return pronunciation
     */
    public PhonemePronunciation getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(PhonemePronunciation pronunciation) {
        this.pronunciation = pronunciation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phoneme phoneme = (Phoneme) o;
        return Objects.equals(this.arpa, phoneme.arpa) && Objects.equals(this.ipa, phoneme.ipa)
            && Objects.equals(this.startTime, phoneme.startTime) && Objects.equals(this.endTime, phoneme.endTime)
            && Objects.equals(this.fluency, phoneme.fluency)
            && Objects.equals(this.pronunciation, phoneme.pronunciation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arpa, ipa, startTime, endTime, fluency, pronunciation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Phoneme {\n");
        sb.append("    arpa: ").append(toIndentedString(arpa)).append("\n");
        sb.append("    ipa: ").append(toIndentedString(ipa)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    fluency: ").append(toIndentedString(fluency)).append("\n");
        sb.append("    pronunciation: ").append(toIndentedString(pronunciation)).append("\n");
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
