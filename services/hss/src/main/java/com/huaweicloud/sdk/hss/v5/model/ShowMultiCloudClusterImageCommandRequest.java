package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMultiCloudClusterImageCommandRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_repo")

    private String imageRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plug_type")

    private String plugType;

    public ShowMultiCloudClusterImageCommandRequest withImageRepo(String imageRepo) {
        this.imageRepo = imageRepo;
        return this;
    }

    /**
     * 镜像仓地址
     * @return imageRepo
     */
    public String getImageRepo() {
        return imageRepo;
    }

    public void setImageRepo(String imageRepo) {
        this.imageRepo = imageRepo;
    }

    public ShowMultiCloudClusterImageCommandRequest withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * 组织名称
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public ShowMultiCloudClusterImageCommandRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ShowMultiCloudClusterImageCommandRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ShowMultiCloudClusterImageCommandRequest withPlugType(String plugType) {
        this.plugType = plugType;
        return this;
    }

    /**
     * **参数解释**: 插件类型 **约束限制**: 不涉及 **取值范围**: - docker: docker插件镜像 - agent: hostguard镜像 **默认取值**: 不涉及 
     * @return plugType
     */
    public String getPlugType() {
        return plugType;
    }

    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMultiCloudClusterImageCommandRequest that = (ShowMultiCloudClusterImageCommandRequest) obj;
        return Objects.equals(this.imageRepo, that.imageRepo) && Objects.equals(this.organization, that.organization)
            && Objects.equals(this.username, that.username) && Objects.equals(this.password, that.password)
            && Objects.equals(this.plugType, that.plugType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageRepo, organization, username, password, plugType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMultiCloudClusterImageCommandRequest {\n");
        sb.append("    imageRepo: ").append(toIndentedString(imageRepo)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    plugType: ").append(toIndentedString(plugType)).append("\n");
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
