package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 合并请求变更commit，包含base_sha、start_sha、head_sha
 */
public class DiffRefDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_sha")

    private String baseSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_sha")

    private String headSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_sha")

    private String startSha;

    public DiffRefDto withBaseSha(String baseSha) {
        this.baseSha = baseSha;
        return this;
    }

    /**
     * 目标分支以及源分支的共同祖先commitId
     * @return baseSha
     */
    public String getBaseSha() {
        return baseSha;
    }

    public void setBaseSha(String baseSha) {
        this.baseSha = baseSha;
    }

    public DiffRefDto withHeadSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * 源分支的最新commitId
     * @return headSha
     */
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public DiffRefDto withStartSha(String startSha) {
        this.startSha = startSha;
        return this;
    }

    /**
     * 目标分支的最新commitId
     * @return startSha
     */
    public String getStartSha() {
        return startSha;
    }

    public void setStartSha(String startSha) {
        this.startSha = startSha;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiffRefDto that = (DiffRefDto) obj;
        return Objects.equals(this.baseSha, that.baseSha) && Objects.equals(this.headSha, that.headSha)
            && Objects.equals(this.startSha, that.startSha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseSha, headSha, startSha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiffRefDto {\n");
        sb.append("    baseSha: ").append(toIndentedString(baseSha)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    startSha: ").append(toIndentedString(startSha)).append("\n");
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
