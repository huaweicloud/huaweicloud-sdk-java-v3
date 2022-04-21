package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBlockchainStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bcs")

    private Detail bcs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private Detail eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sfs")

    private Detail sfs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private Detail obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka")

    private Detail kafka;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce")

    private ComCCE cce;

    public ShowBlockchainStatusResponse withBcs(Detail bcs) {
        this.bcs = bcs;
        return this;
    }

    public ShowBlockchainStatusResponse withBcs(Consumer<Detail> bcsSetter) {
        if (this.bcs == null) {
            this.bcs = new Detail();
            bcsSetter.accept(this.bcs);
        }

        return this;
    }

    /**
     * Get bcs
     * @return bcs
     */
    public Detail getBcs() {
        return bcs;
    }

    public void setBcs(Detail bcs) {
        this.bcs = bcs;
    }

    public ShowBlockchainStatusResponse withEip(Detail eip) {
        this.eip = eip;
        return this;
    }

    public ShowBlockchainStatusResponse withEip(Consumer<Detail> eipSetter) {
        if (this.eip == null) {
            this.eip = new Detail();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public Detail getEip() {
        return eip;
    }

    public void setEip(Detail eip) {
        this.eip = eip;
    }

    public ShowBlockchainStatusResponse withSfs(Detail sfs) {
        this.sfs = sfs;
        return this;
    }

    public ShowBlockchainStatusResponse withSfs(Consumer<Detail> sfsSetter) {
        if (this.sfs == null) {
            this.sfs = new Detail();
            sfsSetter.accept(this.sfs);
        }

        return this;
    }

    /**
     * Get sfs
     * @return sfs
     */
    public Detail getSfs() {
        return sfs;
    }

    public void setSfs(Detail sfs) {
        this.sfs = sfs;
    }

    public ShowBlockchainStatusResponse withObs(Detail obs) {
        this.obs = obs;
        return this;
    }

    public ShowBlockchainStatusResponse withObs(Consumer<Detail> obsSetter) {
        if (this.obs == null) {
            this.obs = new Detail();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public Detail getObs() {
        return obs;
    }

    public void setObs(Detail obs) {
        this.obs = obs;
    }

    public ShowBlockchainStatusResponse withKafka(Detail kafka) {
        this.kafka = kafka;
        return this;
    }

    public ShowBlockchainStatusResponse withKafka(Consumer<Detail> kafkaSetter) {
        if (this.kafka == null) {
            this.kafka = new Detail();
            kafkaSetter.accept(this.kafka);
        }

        return this;
    }

    /**
     * Get kafka
     * @return kafka
     */
    public Detail getKafka() {
        return kafka;
    }

    public void setKafka(Detail kafka) {
        this.kafka = kafka;
    }

    public ShowBlockchainStatusResponse withCce(ComCCE cce) {
        this.cce = cce;
        return this;
    }

    public ShowBlockchainStatusResponse withCce(Consumer<ComCCE> cceSetter) {
        if (this.cce == null) {
            this.cce = new ComCCE();
            cceSetter.accept(this.cce);
        }

        return this;
    }

    /**
     * Get cce
     * @return cce
     */
    public ComCCE getCce() {
        return cce;
    }

    public void setCce(ComCCE cce) {
        this.cce = cce;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBlockchainStatusResponse showBlockchainStatusResponse = (ShowBlockchainStatusResponse) o;
        return Objects.equals(this.bcs, showBlockchainStatusResponse.bcs)
            && Objects.equals(this.eip, showBlockchainStatusResponse.eip)
            && Objects.equals(this.sfs, showBlockchainStatusResponse.sfs)
            && Objects.equals(this.obs, showBlockchainStatusResponse.obs)
            && Objects.equals(this.kafka, showBlockchainStatusResponse.kafka)
            && Objects.equals(this.cce, showBlockchainStatusResponse.cce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bcs, eip, sfs, obs, kafka, cce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBlockchainStatusResponse {\n");
        sb.append("    bcs: ").append(toIndentedString(bcs)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    sfs: ").append(toIndentedString(sfs)).append("\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
        sb.append("    cce: ").append(toIndentedString(cce)).append("\n");
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
