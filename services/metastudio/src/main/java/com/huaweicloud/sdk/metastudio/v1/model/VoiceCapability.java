package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 音色资产支持的能力集。 &gt; 音色能力集只允许查询，不允许设置
 */
public class VoiceCapability {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_phoneme_en")

    private Boolean isSupportPhonemeEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_phoneme")

    private Boolean isSupportPhoneme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_break_time")

    private Boolean isSupportBreakTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_break_strength")

    private Boolean isSupportBreakStrength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_speed")

    private Boolean isSupportSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_prosody")

    private Boolean isSupportProsody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_ssml_say_as")

    private Boolean isSupportSsmlSayAs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_ssml_sub")

    private Boolean isSupportSsmlSub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_word")

    private Boolean isSupportWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_voice_cache")

    private Boolean isSupportVoiceCache;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conversion_rate")

    private Float conversionRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conversion_rate_en")

    private Float conversionRateEn;

    public VoiceCapability withIsSupportPhonemeEn(Boolean isSupportPhonemeEn) {
        this.isSupportPhonemeEn = isSupportPhonemeEn;
        return this;
    }

    /**
     * **参数解释**： 该声音是否支持英文音标。 **约束限制**： 不涉及 **取值范围**： * true: 支持英文音标 * false: 不支持英文音标
     * @return isSupportPhonemeEn
     */
    public Boolean getIsSupportPhonemeEn() {
        return isSupportPhonemeEn;
    }

    public void setIsSupportPhonemeEn(Boolean isSupportPhonemeEn) {
        this.isSupportPhonemeEn = isSupportPhonemeEn;
    }

    public VoiceCapability withIsSupportPhoneme(Boolean isSupportPhoneme) {
        this.isSupportPhoneme = isSupportPhoneme;
        return this;
    }

    /**
     * **参数解释**： 该声音是否支持中文多音字。 **约束限制**： 不涉及 **取值范围**： * true: 支持中文多音字 * false: 不支持中文多音字
     * @return isSupportPhoneme
     */
    public Boolean getIsSupportPhoneme() {
        return isSupportPhoneme;
    }

    public void setIsSupportPhoneme(Boolean isSupportPhoneme) {
        this.isSupportPhoneme = isSupportPhoneme;
    }

    public VoiceCapability withIsSupportBreakTime(Boolean isSupportBreakTime) {
        this.isSupportBreakTime = isSupportBreakTime;
        return this;
    }

    /**
     * **参数解释**： 该声音是否支持停顿。 **约束限制**： 不涉及 **取值范围**： * true: 支持停顿 * false: 不支持停顿
     * @return isSupportBreakTime
     */
    public Boolean getIsSupportBreakTime() {
        return isSupportBreakTime;
    }

    public void setIsSupportBreakTime(Boolean isSupportBreakTime) {
        this.isSupportBreakTime = isSupportBreakTime;
    }

    public VoiceCapability withIsSupportBreakStrength(Boolean isSupportBreakStrength) {
        this.isSupportBreakStrength = isSupportBreakStrength;
        return this;
    }

    /**
     * **参数解释**： 该声音是否支持韵律。 **约束限制**： 不涉及 **取值范围**： * true: 支持韵律 * false: 不支持韵律
     * @return isSupportBreakStrength
     */
    public Boolean getIsSupportBreakStrength() {
        return isSupportBreakStrength;
    }

    public void setIsSupportBreakStrength(Boolean isSupportBreakStrength) {
        this.isSupportBreakStrength = isSupportBreakStrength;
    }

    public VoiceCapability withIsSupportSpeed(Boolean isSupportSpeed) {
        this.isSupportSpeed = isSupportSpeed;
        return this;
    }

    /**
     * **参数解释**： 该声音是否支持全局语速。 **约束限制**： 不涉及 **取值范围**： * true: 支持全局语速 * false: 不支持全局语速
     * @return isSupportSpeed
     */
    public Boolean getIsSupportSpeed() {
        return isSupportSpeed;
    }

    public void setIsSupportSpeed(Boolean isSupportSpeed) {
        this.isSupportSpeed = isSupportSpeed;
    }

    public VoiceCapability withIsSupportProsody(Boolean isSupportProsody) {
        this.isSupportProsody = isSupportProsody;
        return this;
    }

    /**
     * **参数解释**： 该声音是否支持局部语速。 **约束限制**： 不涉及 **取值范围**： * true: 支持局部语速 * false: 不支持局部语速
     * @return isSupportProsody
     */
    public Boolean getIsSupportProsody() {
        return isSupportProsody;
    }

    public void setIsSupportProsody(Boolean isSupportProsody) {
        this.isSupportProsody = isSupportProsody;
    }

    public VoiceCapability withIsSupportSsmlSayAs(Boolean isSupportSsmlSayAs) {
        this.isSupportSsmlSayAs = isSupportSsmlSayAs;
        return this;
    }

    /**
     * **参数解释**： 该声音是否支持SSML的say-as标签。 **约束限制**： 不涉及 **取值范围**： * true: 支持SSML的say-as标签 * false: 不支持SSML的say-as标签
     * @return isSupportSsmlSayAs
     */
    public Boolean getIsSupportSsmlSayAs() {
        return isSupportSsmlSayAs;
    }

    public void setIsSupportSsmlSayAs(Boolean isSupportSsmlSayAs) {
        this.isSupportSsmlSayAs = isSupportSsmlSayAs;
    }

    public VoiceCapability withIsSupportSsmlSub(Boolean isSupportSsmlSub) {
        this.isSupportSsmlSub = isSupportSsmlSub;
        return this;
    }

    /**
     * **参数解释**： 该声音是否支持SSML的sub标签。 **约束限制**： 不涉及 **取值范围**： * true: 支持SSML的sub标签 * false: 不支持SSML的sub标签
     * @return isSupportSsmlSub
     */
    public Boolean getIsSupportSsmlSub() {
        return isSupportSsmlSub;
    }

    public void setIsSupportSsmlSub(Boolean isSupportSsmlSub) {
        this.isSupportSsmlSub = isSupportSsmlSub;
    }

    public VoiceCapability withIsSupportWord(Boolean isSupportWord) {
        this.isSupportWord = isSupportWord;
        return this;
    }

    /**
     * **参数解释**： 该声音是否支持连读。 **约束限制**： 不涉及 **取值范围**： * true: 支持连读 * false: 不支持连读
     * @return isSupportWord
     */
    public Boolean getIsSupportWord() {
        return isSupportWord;
    }

    public void setIsSupportWord(Boolean isSupportWord) {
        this.isSupportWord = isSupportWord;
    }

    public VoiceCapability withIsSupportVoiceCache(Boolean isSupportVoiceCache) {
        this.isSupportVoiceCache = isSupportVoiceCache;
        return this;
    }

    /**
     * 是否支持缓存。
     * @return isSupportVoiceCache
     */
    public Boolean getIsSupportVoiceCache() {
        return isSupportVoiceCache;
    }

    public void setIsSupportVoiceCache(Boolean isSupportVoiceCache) {
        this.isSupportVoiceCache = isSupportVoiceCache;
    }

    public VoiceCapability withConversionRate(Float conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }

    /**
     * **参数解释**： 合成率。 **约束限制**： 不涉及 **取值范围**： * 0-50
     * minimum: 0
     * maximum: 5E+1
     * @return conversionRate
     */
    public Float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Float conversionRate) {
        this.conversionRate = conversionRate;
    }

    public VoiceCapability withConversionRateEn(Float conversionRateEn) {
        this.conversionRateEn = conversionRateEn;
        return this;
    }

    /**
     * **参数解释**： 英语的合成率。 **约束限制**： 不涉及 **取值范围**： * 0-50
     * minimum: 0
     * maximum: 5E+1
     * @return conversionRateEn
     */
    public Float getConversionRateEn() {
        return conversionRateEn;
    }

    public void setConversionRateEn(Float conversionRateEn) {
        this.conversionRateEn = conversionRateEn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoiceCapability that = (VoiceCapability) obj;
        return Objects.equals(this.isSupportPhonemeEn, that.isSupportPhonemeEn)
            && Objects.equals(this.isSupportPhoneme, that.isSupportPhoneme)
            && Objects.equals(this.isSupportBreakTime, that.isSupportBreakTime)
            && Objects.equals(this.isSupportBreakStrength, that.isSupportBreakStrength)
            && Objects.equals(this.isSupportSpeed, that.isSupportSpeed)
            && Objects.equals(this.isSupportProsody, that.isSupportProsody)
            && Objects.equals(this.isSupportSsmlSayAs, that.isSupportSsmlSayAs)
            && Objects.equals(this.isSupportSsmlSub, that.isSupportSsmlSub)
            && Objects.equals(this.isSupportWord, that.isSupportWord)
            && Objects.equals(this.isSupportVoiceCache, that.isSupportVoiceCache)
            && Objects.equals(this.conversionRate, that.conversionRate)
            && Objects.equals(this.conversionRateEn, that.conversionRateEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSupportPhonemeEn,
            isSupportPhoneme,
            isSupportBreakTime,
            isSupportBreakStrength,
            isSupportSpeed,
            isSupportProsody,
            isSupportSsmlSayAs,
            isSupportSsmlSub,
            isSupportWord,
            isSupportVoiceCache,
            conversionRate,
            conversionRateEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoiceCapability {\n");
        sb.append("    isSupportPhonemeEn: ").append(toIndentedString(isSupportPhonemeEn)).append("\n");
        sb.append("    isSupportPhoneme: ").append(toIndentedString(isSupportPhoneme)).append("\n");
        sb.append("    isSupportBreakTime: ").append(toIndentedString(isSupportBreakTime)).append("\n");
        sb.append("    isSupportBreakStrength: ").append(toIndentedString(isSupportBreakStrength)).append("\n");
        sb.append("    isSupportSpeed: ").append(toIndentedString(isSupportSpeed)).append("\n");
        sb.append("    isSupportProsody: ").append(toIndentedString(isSupportProsody)).append("\n");
        sb.append("    isSupportSsmlSayAs: ").append(toIndentedString(isSupportSsmlSayAs)).append("\n");
        sb.append("    isSupportSsmlSub: ").append(toIndentedString(isSupportSsmlSub)).append("\n");
        sb.append("    isSupportWord: ").append(toIndentedString(isSupportWord)).append("\n");
        sb.append("    isSupportVoiceCache: ").append(toIndentedString(isSupportVoiceCache)).append("\n");
        sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
        sb.append("    conversionRateEn: ").append(toIndentedString(conversionRateEn)).append("\n");
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
