package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiffRefsParamDto
 */
public class DiffRefsParamDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_sha")

    private String baseSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_sha")

    private String startSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_sha")

    private String headSha;

    public DiffRefsParamDto withBaseSha(String baseSha) {
        this.baseSha = baseSha;
        return this;
    }

    /**
     * 合并请求中原分支与目标分支的共同基准点
     * @return baseSha
     */
    public String getBaseSha() {
        return baseSha;
    }

    public void setBaseSha(String baseSha) {
        this.baseSha = baseSha;
    }

    public DiffRefsParamDto withStartSha(String startSha) {
        this.startSha = startSha;
        return this;
    }

    /**
     * 合并请求中，从共同基准点开始到原分支方向的第一个提交点
     * @return startSha
     */
    public String getStartSha() {
        return startSha;
    }

    public void setStartSha(String startSha) {
        this.startSha = startSha;
    }

    public DiffRefsParamDto withHeadSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * 合并请求中原分支指向的提交点
     * @return headSha
     */
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiffRefsParamDto that = (DiffRefsParamDto) obj;
        return Objects.equals(this.baseSha, that.baseSha) && Objects.equals(this.startSha, that.startSha)
            && Objects.equals(this.headSha, that.headSha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseSha, startSha, headSha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiffRefsParamDto {\n");
        sb.append("    baseSha: ").append(toIndentedString(baseSha)).append("\n");
        sb.append("    startSha: ").append(toIndentedString(startSha)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
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
