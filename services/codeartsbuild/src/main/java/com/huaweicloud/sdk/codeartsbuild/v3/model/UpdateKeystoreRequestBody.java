package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * job_ids列表
 */
public class UpdateKeystoreRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_name")

    private String keystoreName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share")

    private Integer share;

    public UpdateKeystoreRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 文件ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateKeystoreRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 文件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateKeystoreRequestBody withKeystoreName(String keystoreName) {
        this.keystoreName = keystoreName;
        return this;
    }

    /**
     * 文件名
     * @return keystoreName
     */
    public String getKeystoreName() {
        return keystoreName;
    }

    public void setKeystoreName(String keystoreName) {
        this.keystoreName = keystoreName;
    }

    public UpdateKeystoreRequestBody withShare(Integer share) {
        this.share = share;
        return this;
    }

    /**
     * 是否租户内共享，1-共享，0-不共享
     * @return share
     */
    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKeystoreRequestBody that = (UpdateKeystoreRequestBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.keystoreName, that.keystoreName) && Objects.equals(this.share, that.share);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, keystoreName, share);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeystoreRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    keystoreName: ").append(toIndentedString(keystoreName)).append("\n");
        sb.append("    share: ").append(toIndentedString(share)).append("\n");
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
