package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserProfile
 */
public class UserProfile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_retrieve")

    private Boolean enableRetrieve;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_extract")

    private Boolean enableExtract;

    public UserProfile withEnableRetrieve(Boolean enableRetrieve) {
        this.enableRetrieve = enableRetrieve;
        return this;
    }

    /**
     * 运行时, 是否读取用户画像
     * @return enableRetrieve
     */
    public Boolean getEnableRetrieve() {
        return enableRetrieve;
    }

    public void setEnableRetrieve(Boolean enableRetrieve) {
        this.enableRetrieve = enableRetrieve;
    }

    public UserProfile withEnableExtract(Boolean enableExtract) {
        this.enableExtract = enableExtract;
        return this;
    }

    /**
     * 运行时, 是否构建用户画像
     * @return enableExtract
     */
    public Boolean getEnableExtract() {
        return enableExtract;
    }

    public void setEnableExtract(Boolean enableExtract) {
        this.enableExtract = enableExtract;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserProfile that = (UserProfile) obj;
        return Objects.equals(this.enableRetrieve, that.enableRetrieve)
            && Objects.equals(this.enableExtract, that.enableExtract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableRetrieve, enableExtract);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserProfile {\n");
        sb.append("    enableRetrieve: ").append(toIndentedString(enableRetrieve)).append("\n");
        sb.append("    enableExtract: ").append(toIndentedString(enableExtract)).append("\n");
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
