package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiffRefsDto
 */
public class DiffRefsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_sha")

    private String baseSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_sha")

    private String headSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_sha")

    private String startSha;

    public DiffRefsDto withBaseSha(String baseSha) {
        this.baseSha = baseSha;
        return this;
    }

    /**
     * **参数解释：** 目标分支的基准提交哈希。 **取值范围：** 不涉及。
     * @return baseSha
     */
    public String getBaseSha() {
        return baseSha;
    }

    public void setBaseSha(String baseSha) {
        this.baseSha = baseSha;
    }

    public DiffRefsDto withHeadSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * **参数解释：** 源分支的最新提交哈希。 **取值范围：** 不涉及。
     * @return headSha
     */
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public DiffRefsDto withStartSha(String startSha) {
        this.startSha = startSha;
        return this;
    }

    /**
     * **参数解释：** 合并请求开始时的提交哈希，通常与base_sha相同。 **取值范围：** 不涉及。
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
        DiffRefsDto that = (DiffRefsDto) obj;
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
        sb.append("class DiffRefsDto {\n");
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
