package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AvailableConfig
 */
public class AvailableConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_aw_available")

    private Boolean customAwAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_aw_available")

    private Boolean publicAwAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_aw_available")

    private Boolean refreshAwAvailable;

    public AvailableConfig withCustomAwAvailable(Boolean customAwAvailable) {
        this.customAwAvailable = customAwAvailable;
        return this;
    }

    /**
     * 自定义关键字是否开通
     * @return customAwAvailable
     */
    public Boolean getCustomAwAvailable() {
        return customAwAvailable;
    }

    public void setCustomAwAvailable(Boolean customAwAvailable) {
        this.customAwAvailable = customAwAvailable;
    }

    public AvailableConfig withPublicAwAvailable(Boolean publicAwAvailable) {
        this.publicAwAvailable = publicAwAvailable;
        return this;
    }

    /**
     * 系统关键字是否开通
     * @return publicAwAvailable
     */
    public Boolean getPublicAwAvailable() {
        return publicAwAvailable;
    }

    public void setPublicAwAvailable(Boolean publicAwAvailable) {
        this.publicAwAvailable = publicAwAvailable;
    }

    public AvailableConfig withRefreshAwAvailable(Boolean refreshAwAvailable) {
        this.refreshAwAvailable = refreshAwAvailable;
        return this;
    }

    /**
     * 一键刷新功能是否开通
     * @return refreshAwAvailable
     */
    public Boolean getRefreshAwAvailable() {
        return refreshAwAvailable;
    }

    public void setRefreshAwAvailable(Boolean refreshAwAvailable) {
        this.refreshAwAvailable = refreshAwAvailable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailableConfig that = (AvailableConfig) obj;
        return Objects.equals(this.customAwAvailable, that.customAwAvailable)
            && Objects.equals(this.publicAwAvailable, that.publicAwAvailable)
            && Objects.equals(this.refreshAwAvailable, that.refreshAwAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customAwAvailable, publicAwAvailable, refreshAwAvailable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableConfig {\n");
        sb.append("    customAwAvailable: ").append(toIndentedString(customAwAvailable)).append("\n");
        sb.append("    publicAwAvailable: ").append(toIndentedString(publicAwAvailable)).append("\n");
        sb.append("    refreshAwAvailable: ").append(toIndentedString(refreshAwAvailable)).append("\n");
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
