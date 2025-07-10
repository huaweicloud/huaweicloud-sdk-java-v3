package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 音频。
 */
public class PoliciesAudio {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_redirection_enable")

    private Boolean audioRedirectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_volume")

    private String playVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_volume_ratio")

    private String playVolumeRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_volume")

    private String recordVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_volume_ratio")

    private String recordVolumeRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_transmission_mode")

    private String audioTransmissionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_redirection_enable")

    private Boolean playRedirectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_classification")

    private String playClassification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_quality")

    private String playQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_denoising")

    private String playDenoising;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_agc")

    private String playAgc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_crc")

    private String playCrc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_device_mode")

    private String playDeviceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_delay_threshold")

    private String playDelayThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_amplitude_threshold")

    private String playAmplitudeThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_prefill_data")

    private String playPrefillData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_redirection_enable")

    private Boolean recordRedirectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_classification")

    private String recordClassification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_quality")

    private String recordQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_denoising")

    private String recordDenoising;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_agc")

    private String recordAgc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_crc")

    private String recordCrc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_device_mode")

    private String recordDeviceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_delay_threshold")

    private String recordDelayThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_amplitude_threshold")

    private String recordAmplitudeThreshold;

    public PoliciesAudio withAudioRedirectionEnable(Boolean audioRedirectionEnable) {
        this.audioRedirectionEnable = audioRedirectionEnable;
        return this;
    }

    /**
     * 是否开启音频重定向。取值为： false：表示关闭。 true：表示开启。
     * @return audioRedirectionEnable
     */
    public Boolean getAudioRedirectionEnable() {
        return audioRedirectionEnable;
    }

    public void setAudioRedirectionEnable(Boolean audioRedirectionEnable) {
        this.audioRedirectionEnable = audioRedirectionEnable;
    }

    public PoliciesAudio withPlayVolume(String playVolume) {
        this.playVolume = playVolume;
        return this;
    }

    /**
     * 播音设置音量。 不设置音量取值为：Do Not Set Volume。 音量设置，最小值为10，最大值为100，中间取值，间隔为5的递增序列。如：10、15、20、25等。
     * @return playVolume
     */
    public String getPlayVolume() {
        return playVolume;
    }

    public void setPlayVolume(String playVolume) {
        this.playVolume = playVolume;
    }

    public PoliciesAudio withPlayVolumeRatio(String playVolumeRatio) {
        this.playVolumeRatio = playVolumeRatio;
        return this;
    }

    /**
     * 播音设置音量线性系数。取值为： 不设置：Do Not Set Volume Ratio。 低：Low。 中：Middle。 高：High。
     * @return playVolumeRatio
     */
    public String getPlayVolumeRatio() {
        return playVolumeRatio;
    }

    public void setPlayVolumeRatio(String playVolumeRatio) {
        this.playVolumeRatio = playVolumeRatio;
    }

    public PoliciesAudio withRecordVolume(String recordVolume) {
        this.recordVolume = recordVolume;
        return this;
    }

    /**
     * 录音设置音量。 不设置取值为：Do Not Set Volume。 音量设置，最小值为10，最大值为100，中间取值，间隔为5的递增序列。如：10、15、20、25等。
     * @return recordVolume
     */
    public String getRecordVolume() {
        return recordVolume;
    }

    public void setRecordVolume(String recordVolume) {
        this.recordVolume = recordVolume;
    }

    public PoliciesAudio withRecordVolumeRatio(String recordVolumeRatio) {
        this.recordVolumeRatio = recordVolumeRatio;
        return this;
    }

    /**
     * 录音设置音量线性系数。取值为： 不设置：Do Not Set Volume Ratio。 低：Low。 中：Middle。 高：High。
     * @return recordVolumeRatio
     */
    public String getRecordVolumeRatio() {
        return recordVolumeRatio;
    }

    public void setRecordVolumeRatio(String recordVolumeRatio) {
        this.recordVolumeRatio = recordVolumeRatio;
    }

    public PoliciesAudio withAudioTransmissionMode(String audioTransmissionMode) {
        this.audioTransmissionMode = audioTransmissionMode;
        return this;
    }

    /**
     * 音频传输方式。取值为： 可靠传输：Reliable Transmission。 实时传输：Real Time Transmission。
     * @return audioTransmissionMode
     */
    public String getAudioTransmissionMode() {
        return audioTransmissionMode;
    }

    public void setAudioTransmissionMode(String audioTransmissionMode) {
        this.audioTransmissionMode = audioTransmissionMode;
    }

    public PoliciesAudio withPlayRedirectionEnable(Boolean playRedirectionEnable) {
        this.playRedirectionEnable = playRedirectionEnable;
        return this;
    }

    /**
     * 是否开启播音重定向。取值为： false：表示关闭。 true：表示开启。
     * @return playRedirectionEnable
     */
    public Boolean getPlayRedirectionEnable() {
        return playRedirectionEnable;
    }

    public void setPlayRedirectionEnable(Boolean playRedirectionEnable) {
        this.playRedirectionEnable = playRedirectionEnable;
    }

    public PoliciesAudio withPlayClassification(String playClassification) {
        this.playClassification = playClassification;
        return this;
    }

    /**
     * 播音场景。取值为： 无损播音：LossLess。 语音通话：Speech Call。 音乐播音：Music Play。 自动识别：Automatic Identification。
     * @return playClassification
     */
    public String getPlayClassification() {
        return playClassification;
    }

    public void setPlayClassification(String playClassification) {
        this.playClassification = playClassification;
    }

    public PoliciesAudio withPlayQuality(String playQuality) {
        this.playQuality = playQuality;
        return this;
    }

    /**
     * 播音质量。取值为： 低：Low。 中：Middle。 高：High
     * @return playQuality
     */
    public String getPlayQuality() {
        return playQuality;
    }

    public void setPlayQuality(String playQuality) {
        this.playQuality = playQuality;
    }

    public PoliciesAudio withPlayDenoising(String playDenoising) {
        this.playDenoising = playDenoising;
        return this;
    }

    /**
     * 播音降噪。取值为： 不开启降噪：Disable Denoising。 开启降噪，最小值为-100，最大值为-5，中间取值，间隔为5的递增序列。如：-100、-95、-90、-85等。
     * @return playDenoising
     */
    public String getPlayDenoising() {
        return playDenoising;
    }

    public void setPlayDenoising(String playDenoising) {
        this.playDenoising = playDenoising;
    }

    public PoliciesAudio withPlayAgc(String playAgc) {
        this.playAgc = playAgc;
        return this;
    }

    /**
     * 播音增益。取值为：不开启增益：Disable AGC。开启增益，最小值为4000，最大值为32000，中间取值，从10000开始间隔为1000的递增序列。如：4000、6000、8000、10000、11000、12000、13000等。
     * @return playAgc
     */
    public String getPlayAgc() {
        return playAgc;
    }

    public void setPlayAgc(String playAgc) {
        this.playAgc = playAgc;
    }

    public PoliciesAudio withPlayCrc(String playCrc) {
        this.playCrc = playCrc;
        return this;
    }

    /**
     * 播音设置冗余。取值为： 不开启冗余：Disable CRC。 开启冗余：Enable CRC。
     * @return playCrc
     */
    public String getPlayCrc() {
        return playCrc;
    }

    public void setPlayCrc(String playCrc) {
        this.playCrc = playCrc;
    }

    public PoliciesAudio withPlayDeviceMode(String playDeviceMode) {
        this.playDeviceMode = playDeviceMode;
        return this;
    }

    /**
     * 播音设置模式。取值为： 播音设备共享模式：Play Device In Shared Mode。 播音设备独占模式：Play Device In Exclusive Mode。
     * @return playDeviceMode
     */
    public String getPlayDeviceMode() {
        return playDeviceMode;
    }

    public void setPlayDeviceMode(String playDeviceMode) {
        this.playDeviceMode = playDeviceMode;
    }

    public PoliciesAudio withPlayDelayThreshold(String playDelayThreshold) {
        this.playDelayThreshold = playDelayThreshold;
        return this;
    }

    /**
     * 播音控制时延阈值。取值为：最小值为160，最大值为2500。中间取值，400以下为40的递增序列，1000以下为50的递增序列。从高到低为：2500、2000、1800、1500、1200、1000、950、900、850等。
     * @return playDelayThreshold
     */
    public String getPlayDelayThreshold() {
        return playDelayThreshold;
    }

    public void setPlayDelayThreshold(String playDelayThreshold) {
        this.playDelayThreshold = playDelayThreshold;
    }

    public PoliciesAudio withPlayAmplitudeThreshold(String playAmplitudeThreshold) {
        this.playAmplitudeThreshold = playAmplitudeThreshold;
        return this;
    }

    /**
     * 播音检测振幅阈值。取值为：2048、4096、5120、6144、7168、8192。
     * @return playAmplitudeThreshold
     */
    public String getPlayAmplitudeThreshold() {
        return playAmplitudeThreshold;
    }

    public void setPlayAmplitudeThreshold(String playAmplitudeThreshold) {
        this.playAmplitudeThreshold = playAmplitudeThreshold;
    }

    public PoliciesAudio withPlayPrefillData(String playPrefillData) {
        this.playPrefillData = playPrefillData;
        return this;
    }

    /**
     * 播音音乐预充数据。取值为：不预充：Do Not Prefill Data。预充取值：最小值为50，最大值为2000，250以前为50的递增序列，500以前为100的递增序列。从高到低取值如：2000、1500、1000、500、400、300、250。
     * @return playPrefillData
     */
    public String getPlayPrefillData() {
        return playPrefillData;
    }

    public void setPlayPrefillData(String playPrefillData) {
        this.playPrefillData = playPrefillData;
    }

    public PoliciesAudio withRecordRedirectionEnable(Boolean recordRedirectionEnable) {
        this.recordRedirectionEnable = recordRedirectionEnable;
        return this;
    }

    /**
     * 是否开启录音重定向。取值为： false：表示关闭。 true：表示开启。
     * @return recordRedirectionEnable
     */
    public Boolean getRecordRedirectionEnable() {
        return recordRedirectionEnable;
    }

    public void setRecordRedirectionEnable(Boolean recordRedirectionEnable) {
        this.recordRedirectionEnable = recordRedirectionEnable;
    }

    public PoliciesAudio withRecordClassification(String recordClassification) {
        this.recordClassification = recordClassification;
        return this;
    }

    /**
     * 录音场景。取值为： 无损录音：LossLess。 语音通话：Speech Call。 音乐录音：Music Record。 自动识别：Automatic Identification。
     * @return recordClassification
     */
    public String getRecordClassification() {
        return recordClassification;
    }

    public void setRecordClassification(String recordClassification) {
        this.recordClassification = recordClassification;
    }

    public PoliciesAudio withRecordQuality(String recordQuality) {
        this.recordQuality = recordQuality;
        return this;
    }

    /**
     * 录音质量。取值为： 低：Low。 中：Middle。 高：High。
     * @return recordQuality
     */
    public String getRecordQuality() {
        return recordQuality;
    }

    public void setRecordQuality(String recordQuality) {
        this.recordQuality = recordQuality;
    }

    public PoliciesAudio withRecordDenoising(String recordDenoising) {
        this.recordDenoising = recordDenoising;
        return this;
    }

    /**
     * 录音降噪。取值为： 不开启降噪：Disable Denoising。 开启降噪，最小值为-100，最大值为-5，中间取值，间隔为5的递增序列。如：-100、-95、-90、-85等。
     * @return recordDenoising
     */
    public String getRecordDenoising() {
        return recordDenoising;
    }

    public void setRecordDenoising(String recordDenoising) {
        this.recordDenoising = recordDenoising;
    }

    public PoliciesAudio withRecordAgc(String recordAgc) {
        this.recordAgc = recordAgc;
        return this;
    }

    /**
     * 录音增益。取值为：不开启增益：Disable AGC。开启增益，最小值为4000，最大值为32000，中间取值，从10000开始间隔为1000的递增序列。如：4000、6000、8000、10000、11000、12000、13000等。
     * @return recordAgc
     */
    public String getRecordAgc() {
        return recordAgc;
    }

    public void setRecordAgc(String recordAgc) {
        this.recordAgc = recordAgc;
    }

    public PoliciesAudio withRecordCrc(String recordCrc) {
        this.recordCrc = recordCrc;
        return this;
    }

    /**
     * 录音设置冗余。取值为： 不开启冗余：Disable CRC。 开启冗余：Enable CRC。
     * @return recordCrc
     */
    public String getRecordCrc() {
        return recordCrc;
    }

    public void setRecordCrc(String recordCrc) {
        this.recordCrc = recordCrc;
    }

    public PoliciesAudio withRecordDeviceMode(String recordDeviceMode) {
        this.recordDeviceMode = recordDeviceMode;
        return this;
    }

    /**
     * 录音设置模式。取值为： 播音设备共享模式：Record Device In Shared Mode。 播音设备独占模式：Record Device In Exclusive Mode。
     * @return recordDeviceMode
     */
    public String getRecordDeviceMode() {
        return recordDeviceMode;
    }

    public void setRecordDeviceMode(String recordDeviceMode) {
        this.recordDeviceMode = recordDeviceMode;
    }

    public PoliciesAudio withRecordDelayThreshold(String recordDelayThreshold) {
        this.recordDelayThreshold = recordDelayThreshold;
        return this;
    }

    /**
     * 录音控制时延阈值。取值为：最小值为160，最大值为2500。中间取值，400以下为40的递增序列，1000以下为50的递增序列。从高到低为：2500、2000、1800、1500、1200、1000、950、900、850等。
     * @return recordDelayThreshold
     */
    public String getRecordDelayThreshold() {
        return recordDelayThreshold;
    }

    public void setRecordDelayThreshold(String recordDelayThreshold) {
        this.recordDelayThreshold = recordDelayThreshold;
    }

    public PoliciesAudio withRecordAmplitudeThreshold(String recordAmplitudeThreshold) {
        this.recordAmplitudeThreshold = recordAmplitudeThreshold;
        return this;
    }

    /**
     * 录音检测振幅阈值。取值为：2048、4096、5120、6144、7168、8192。
     * @return recordAmplitudeThreshold
     */
    public String getRecordAmplitudeThreshold() {
        return recordAmplitudeThreshold;
    }

    public void setRecordAmplitudeThreshold(String recordAmplitudeThreshold) {
        this.recordAmplitudeThreshold = recordAmplitudeThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesAudio that = (PoliciesAudio) obj;
        return Objects.equals(this.audioRedirectionEnable, that.audioRedirectionEnable)
            && Objects.equals(this.playVolume, that.playVolume)
            && Objects.equals(this.playVolumeRatio, that.playVolumeRatio)
            && Objects.equals(this.recordVolume, that.recordVolume)
            && Objects.equals(this.recordVolumeRatio, that.recordVolumeRatio)
            && Objects.equals(this.audioTransmissionMode, that.audioTransmissionMode)
            && Objects.equals(this.playRedirectionEnable, that.playRedirectionEnable)
            && Objects.equals(this.playClassification, that.playClassification)
            && Objects.equals(this.playQuality, that.playQuality)
            && Objects.equals(this.playDenoising, that.playDenoising) && Objects.equals(this.playAgc, that.playAgc)
            && Objects.equals(this.playCrc, that.playCrc) && Objects.equals(this.playDeviceMode, that.playDeviceMode)
            && Objects.equals(this.playDelayThreshold, that.playDelayThreshold)
            && Objects.equals(this.playAmplitudeThreshold, that.playAmplitudeThreshold)
            && Objects.equals(this.playPrefillData, that.playPrefillData)
            && Objects.equals(this.recordRedirectionEnable, that.recordRedirectionEnable)
            && Objects.equals(this.recordClassification, that.recordClassification)
            && Objects.equals(this.recordQuality, that.recordQuality)
            && Objects.equals(this.recordDenoising, that.recordDenoising)
            && Objects.equals(this.recordAgc, that.recordAgc) && Objects.equals(this.recordCrc, that.recordCrc)
            && Objects.equals(this.recordDeviceMode, that.recordDeviceMode)
            && Objects.equals(this.recordDelayThreshold, that.recordDelayThreshold)
            && Objects.equals(this.recordAmplitudeThreshold, that.recordAmplitudeThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioRedirectionEnable,
            playVolume,
            playVolumeRatio,
            recordVolume,
            recordVolumeRatio,
            audioTransmissionMode,
            playRedirectionEnable,
            playClassification,
            playQuality,
            playDenoising,
            playAgc,
            playCrc,
            playDeviceMode,
            playDelayThreshold,
            playAmplitudeThreshold,
            playPrefillData,
            recordRedirectionEnable,
            recordClassification,
            recordQuality,
            recordDenoising,
            recordAgc,
            recordCrc,
            recordDeviceMode,
            recordDelayThreshold,
            recordAmplitudeThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesAudio {\n");
        sb.append("    audioRedirectionEnable: ").append(toIndentedString(audioRedirectionEnable)).append("\n");
        sb.append("    playVolume: ").append(toIndentedString(playVolume)).append("\n");
        sb.append("    playVolumeRatio: ").append(toIndentedString(playVolumeRatio)).append("\n");
        sb.append("    recordVolume: ").append(toIndentedString(recordVolume)).append("\n");
        sb.append("    recordVolumeRatio: ").append(toIndentedString(recordVolumeRatio)).append("\n");
        sb.append("    audioTransmissionMode: ").append(toIndentedString(audioTransmissionMode)).append("\n");
        sb.append("    playRedirectionEnable: ").append(toIndentedString(playRedirectionEnable)).append("\n");
        sb.append("    playClassification: ").append(toIndentedString(playClassification)).append("\n");
        sb.append("    playQuality: ").append(toIndentedString(playQuality)).append("\n");
        sb.append("    playDenoising: ").append(toIndentedString(playDenoising)).append("\n");
        sb.append("    playAgc: ").append(toIndentedString(playAgc)).append("\n");
        sb.append("    playCrc: ").append(toIndentedString(playCrc)).append("\n");
        sb.append("    playDeviceMode: ").append(toIndentedString(playDeviceMode)).append("\n");
        sb.append("    playDelayThreshold: ").append(toIndentedString(playDelayThreshold)).append("\n");
        sb.append("    playAmplitudeThreshold: ").append(toIndentedString(playAmplitudeThreshold)).append("\n");
        sb.append("    playPrefillData: ").append(toIndentedString(playPrefillData)).append("\n");
        sb.append("    recordRedirectionEnable: ").append(toIndentedString(recordRedirectionEnable)).append("\n");
        sb.append("    recordClassification: ").append(toIndentedString(recordClassification)).append("\n");
        sb.append("    recordQuality: ").append(toIndentedString(recordQuality)).append("\n");
        sb.append("    recordDenoising: ").append(toIndentedString(recordDenoising)).append("\n");
        sb.append("    recordAgc: ").append(toIndentedString(recordAgc)).append("\n");
        sb.append("    recordCrc: ").append(toIndentedString(recordCrc)).append("\n");
        sb.append("    recordDeviceMode: ").append(toIndentedString(recordDeviceMode)).append("\n");
        sb.append("    recordDelayThreshold: ").append(toIndentedString(recordDelayThreshold)).append("\n");
        sb.append("    recordAmplitudeThreshold: ").append(toIndentedString(recordAmplitudeThreshold)).append("\n");
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
