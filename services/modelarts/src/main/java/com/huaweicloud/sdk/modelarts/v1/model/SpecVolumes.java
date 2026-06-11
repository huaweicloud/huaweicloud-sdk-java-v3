package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业挂载卷信息。
 */
public class SpecVolumes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nfs")

    private Nfs nfs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pfs")

    private Pfs pfs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private Obs obs;

    public SpecVolumes withNfs(Nfs nfs) {
        this.nfs = nfs;
        return this;
    }

    public SpecVolumes withNfs(Consumer<Nfs> nfsSetter) {
        if (this.nfs == null) {
            this.nfs = new Nfs();
            nfsSetter.accept(this.nfs);
        }

        return this;
    }

    /**
     * Get nfs
     * @return nfs
     */
    public Nfs getNfs() {
        return nfs;
    }

    public void setNfs(Nfs nfs) {
        this.nfs = nfs;
    }

    public SpecVolumes withPfs(Pfs pfs) {
        this.pfs = pfs;
        return this;
    }

    public SpecVolumes withPfs(Consumer<Pfs> pfsSetter) {
        if (this.pfs == null) {
            this.pfs = new Pfs();
            pfsSetter.accept(this.pfs);
        }

        return this;
    }

    /**
     * Get pfs
     * @return pfs
     */
    public Pfs getPfs() {
        return pfs;
    }

    public void setPfs(Pfs pfs) {
        this.pfs = pfs;
    }

    public SpecVolumes withObs(Obs obs) {
        this.obs = obs;
        return this;
    }

    public SpecVolumes withObs(Consumer<Obs> obsSetter) {
        if (this.obs == null) {
            this.obs = new Obs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public Obs getObs() {
        return obs;
    }

    public void setObs(Obs obs) {
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
        SpecVolumes that = (SpecVolumes) obj;
        return Objects.equals(this.nfs, that.nfs) && Objects.equals(this.pfs, that.pfs)
            && Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nfs, pfs, obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecVolumes {\n");
        sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
        sb.append("    pfs: ").append(toIndentedString(pfs)).append("\n");
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
