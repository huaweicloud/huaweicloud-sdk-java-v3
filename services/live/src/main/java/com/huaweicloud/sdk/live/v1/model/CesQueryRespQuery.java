package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ces查询响应内容
 */
public class CesQueryRespQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medialive_mpc")

    private CesDimsItem medialiveMpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline")

    private CesDimsItem pipeline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private CesDimsItem audio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medialive_cdn")

    private CesDimsItem medialiveCdn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medialive_package")

    private CesDimsItem medialivePackage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medialive_connect")

    private CesDimsItem medialiveConnect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medialive_tailor")

    private CesDimsItem medialiveTailor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private CesDimsItem region;

    public CesQueryRespQuery withMedialiveMpc(CesDimsItem medialiveMpc) {
        this.medialiveMpc = medialiveMpc;
        return this;
    }

    public CesQueryRespQuery withMedialiveMpc(Consumer<CesDimsItem> medialiveMpcSetter) {
        if (this.medialiveMpc == null) {
            this.medialiveMpc = new CesDimsItem();
            medialiveMpcSetter.accept(this.medialiveMpc);
        }

        return this;
    }

    /**
     * Get medialiveMpc
     * @return medialiveMpc
     */
    public CesDimsItem getMedialiveMpc() {
        return medialiveMpc;
    }

    public void setMedialiveMpc(CesDimsItem medialiveMpc) {
        this.medialiveMpc = medialiveMpc;
    }

    public CesQueryRespQuery withPipeline(CesDimsItem pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    public CesQueryRespQuery withPipeline(Consumer<CesDimsItem> pipelineSetter) {
        if (this.pipeline == null) {
            this.pipeline = new CesDimsItem();
            pipelineSetter.accept(this.pipeline);
        }

        return this;
    }

    /**
     * Get pipeline
     * @return pipeline
     */
    public CesDimsItem getPipeline() {
        return pipeline;
    }

    public void setPipeline(CesDimsItem pipeline) {
        this.pipeline = pipeline;
    }

    public CesQueryRespQuery withAudio(CesDimsItem audio) {
        this.audio = audio;
        return this;
    }

    public CesQueryRespQuery withAudio(Consumer<CesDimsItem> audioSetter) {
        if (this.audio == null) {
            this.audio = new CesDimsItem();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /**
     * Get audio
     * @return audio
     */
    public CesDimsItem getAudio() {
        return audio;
    }

    public void setAudio(CesDimsItem audio) {
        this.audio = audio;
    }

    public CesQueryRespQuery withMedialiveCdn(CesDimsItem medialiveCdn) {
        this.medialiveCdn = medialiveCdn;
        return this;
    }

    public CesQueryRespQuery withMedialiveCdn(Consumer<CesDimsItem> medialiveCdnSetter) {
        if (this.medialiveCdn == null) {
            this.medialiveCdn = new CesDimsItem();
            medialiveCdnSetter.accept(this.medialiveCdn);
        }

        return this;
    }

    /**
     * Get medialiveCdn
     * @return medialiveCdn
     */
    public CesDimsItem getMedialiveCdn() {
        return medialiveCdn;
    }

    public void setMedialiveCdn(CesDimsItem medialiveCdn) {
        this.medialiveCdn = medialiveCdn;
    }

    public CesQueryRespQuery withMedialivePackage(CesDimsItem medialivePackage) {
        this.medialivePackage = medialivePackage;
        return this;
    }

    public CesQueryRespQuery withMedialivePackage(Consumer<CesDimsItem> medialivePackageSetter) {
        if (this.medialivePackage == null) {
            this.medialivePackage = new CesDimsItem();
            medialivePackageSetter.accept(this.medialivePackage);
        }

        return this;
    }

    /**
     * Get medialivePackage
     * @return medialivePackage
     */
    public CesDimsItem getMedialivePackage() {
        return medialivePackage;
    }

    public void setMedialivePackage(CesDimsItem medialivePackage) {
        this.medialivePackage = medialivePackage;
    }

    public CesQueryRespQuery withMedialiveConnect(CesDimsItem medialiveConnect) {
        this.medialiveConnect = medialiveConnect;
        return this;
    }

    public CesQueryRespQuery withMedialiveConnect(Consumer<CesDimsItem> medialiveConnectSetter) {
        if (this.medialiveConnect == null) {
            this.medialiveConnect = new CesDimsItem();
            medialiveConnectSetter.accept(this.medialiveConnect);
        }

        return this;
    }

    /**
     * Get medialiveConnect
     * @return medialiveConnect
     */
    public CesDimsItem getMedialiveConnect() {
        return medialiveConnect;
    }

    public void setMedialiveConnect(CesDimsItem medialiveConnect) {
        this.medialiveConnect = medialiveConnect;
    }

    public CesQueryRespQuery withMedialiveTailor(CesDimsItem medialiveTailor) {
        this.medialiveTailor = medialiveTailor;
        return this;
    }

    public CesQueryRespQuery withMedialiveTailor(Consumer<CesDimsItem> medialiveTailorSetter) {
        if (this.medialiveTailor == null) {
            this.medialiveTailor = new CesDimsItem();
            medialiveTailorSetter.accept(this.medialiveTailor);
        }

        return this;
    }

    /**
     * Get medialiveTailor
     * @return medialiveTailor
     */
    public CesDimsItem getMedialiveTailor() {
        return medialiveTailor;
    }

    public void setMedialiveTailor(CesDimsItem medialiveTailor) {
        this.medialiveTailor = medialiveTailor;
    }

    public CesQueryRespQuery withRegion(CesDimsItem region) {
        this.region = region;
        return this;
    }

    public CesQueryRespQuery withRegion(Consumer<CesDimsItem> regionSetter) {
        if (this.region == null) {
            this.region = new CesDimsItem();
            regionSetter.accept(this.region);
        }

        return this;
    }

    /**
     * Get region
     * @return region
     */
    public CesDimsItem getRegion() {
        return region;
    }

    public void setRegion(CesDimsItem region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CesQueryRespQuery that = (CesQueryRespQuery) obj;
        return Objects.equals(this.medialiveMpc, that.medialiveMpc) && Objects.equals(this.pipeline, that.pipeline)
            && Objects.equals(this.audio, that.audio) && Objects.equals(this.medialiveCdn, that.medialiveCdn)
            && Objects.equals(this.medialivePackage, that.medialivePackage)
            && Objects.equals(this.medialiveConnect, that.medialiveConnect)
            && Objects.equals(this.medialiveTailor, that.medialiveTailor) && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medialiveMpc,
            pipeline,
            audio,
            medialiveCdn,
            medialivePackage,
            medialiveConnect,
            medialiveTailor,
            region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CesQueryRespQuery {\n");
        sb.append("    medialiveMpc: ").append(toIndentedString(medialiveMpc)).append("\n");
        sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    medialiveCdn: ").append(toIndentedString(medialiveCdn)).append("\n");
        sb.append("    medialivePackage: ").append(toIndentedString(medialivePackage)).append("\n");
        sb.append("    medialiveConnect: ").append(toIndentedString(medialiveConnect)).append("\n");
        sb.append("    medialiveTailor: ").append(toIndentedString(medialiveTailor)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
