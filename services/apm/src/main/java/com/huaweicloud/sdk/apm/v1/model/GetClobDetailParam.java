package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取clob数据的请求参数。
 */
public class GetClobDetailParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clob_id")

    private String clobId;

    public GetClobDetailParam withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id。
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public GetClobDetailParam withClobId(String clobId) {
        this.clobId = clobId;
        return this;
    }

    /**
     * clobId。
     * @return clobId
     */
    public String getClobId() {
        return clobId;
    }

    public void setClobId(String clobId) {
        this.clobId = clobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetClobDetailParam that = (GetClobDetailParam) obj;
        return Objects.equals(this.envId, that.envId) && Objects.equals(this.clobId, that.clobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envId, clobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetClobDetailParam {\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    clobId: ").append(toIndentedString(clobId)).append("\n");
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
