package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowProjectDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Repo-Auth")

    @JacksonXmlProperty(localName = "X-Repo-Auth")

    private String xRepoAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clone_url")

    @JacksonXmlProperty(localName = "clone_url")

    private String cloneUrl;

    public ShowProjectDetailRequest withXRepoAuth(String xRepoAuth) {
        this.xRepoAuth = xRepoAuth;
        return this;
    }

    /**
     * 授权名称。
     * @return xRepoAuth
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Repo-Auth")
    public String getXRepoAuth() {
        return xRepoAuth;
    }

    public void setXRepoAuth(String xRepoAuth) {
        this.xRepoAuth = xRepoAuth;
    }

    public ShowProjectDetailRequest withCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    /**
     * 仓库克隆URL。
     * @return cloneUrl
     */
    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectDetailRequest showProjectDetailRequest = (ShowProjectDetailRequest) o;
        return Objects.equals(this.xRepoAuth, showProjectDetailRequest.xRepoAuth)
            && Objects.equals(this.cloneUrl, showProjectDetailRequest.cloneUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRepoAuth, cloneUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectDetailRequest {\n");
        sb.append("    xRepoAuth: ").append(toIndentedString(xRepoAuth)).append("\n");
        sb.append("    cloneUrl: ").append(toIndentedString(cloneUrl)).append("\n");
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
