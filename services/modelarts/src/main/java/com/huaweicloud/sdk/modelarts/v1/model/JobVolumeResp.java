package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业挂载卷信息。
 */
public class JobVolumeResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nfs")

    private NfsResp nfs;

    public JobVolumeResp withNfs(NfsResp nfs) {
        this.nfs = nfs;
        return this;
    }

    public JobVolumeResp withNfs(Consumer<NfsResp> nfsSetter) {
        if (this.nfs == null) {
            this.nfs = new NfsResp();
            nfsSetter.accept(this.nfs);
        }

        return this;
    }

    /**
     * Get nfs
     * @return nfs
     */
    public NfsResp getNfs() {
        return nfs;
    }

    public void setNfs(NfsResp nfs) {
        this.nfs = nfs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobVolumeResp that = (JobVolumeResp) obj;
        return Objects.equals(this.nfs, that.nfs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nfs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobVolumeResp {\n");
        sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
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
