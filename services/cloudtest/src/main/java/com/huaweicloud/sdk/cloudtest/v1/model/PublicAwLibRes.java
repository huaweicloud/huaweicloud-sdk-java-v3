package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PublicAwLibRes
 */
public class PublicAwLibRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_stamp")

    private Long createTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_string")

    private String createTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_link")

    private String documentLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_area")

    private List<String> netArea = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_temp_url")

    private String obsTempUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_line")

    private String productLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_branch")

    private String repoBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_lib_path")

    private String repoLibPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_password")

    private String repoPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_private_key")

    private String repoPrivateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_url")

    private String repoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_username")

    private String repoUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_stamp")

    private Long updateTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_string")

    private String updateTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    public PublicAwLibRes withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PublicAwLibRes withCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * 创建时间戳
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public PublicAwLibRes withCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
        return this;
    }

    /**
     * 创建时间字符串
     * @return createTimeString
     */
    public String getCreateTimeString() {
        return createTimeString;
    }

    public void setCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
    }

    public PublicAwLibRes withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public PublicAwLibRes withDocumentLink(String documentLink) {
        this.documentLink = documentLink;
        return this;
    }

    /**
     * 关联公共aw时的编辑链接
     * @return documentLink
     */
    public String getDocumentLink() {
        return documentLink;
    }

    public void setDocumentLink(String documentLink) {
        this.documentLink = documentLink;
    }

    public PublicAwLibRes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicAwLibRes withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublicAwLibRes withNetArea(List<String> netArea) {
        this.netArea = netArea;
        return this;
    }

    public PublicAwLibRes addNetAreaItem(String netAreaItem) {
        if (this.netArea == null) {
            this.netArea = new ArrayList<>();
        }
        this.netArea.add(netAreaItem);
        return this;
    }

    public PublicAwLibRes withNetArea(Consumer<List<String>> netAreaSetter) {
        if (this.netArea == null) {
            this.netArea = new ArrayList<>();
        }
        netAreaSetter.accept(this.netArea);
        return this;
    }

    /**
     * 蓝区:Blue,绿区:Green,黄区:Yellow
     * @return netArea
     */
    public List<String> getNetArea() {
        return netArea;
    }

    public void setNetArea(List<String> netArea) {
        this.netArea = netArea;
    }

    public PublicAwLibRes withObsTempUrl(String obsTempUrl) {
        this.obsTempUrl = obsTempUrl;
        return this;
    }

    /**
     * obs临时url
     * @return obsTempUrl
     */
    public String getObsTempUrl() {
        return obsTempUrl;
    }

    public void setObsTempUrl(String obsTempUrl) {
        this.obsTempUrl = obsTempUrl;
    }

    public PublicAwLibRes withProductLine(String productLine) {
        this.productLine = productLine;
        return this;
    }

    /**
     * 产品线
     * @return productLine
     */
    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public PublicAwLibRes withRepoBranch(String repoBranch) {
        this.repoBranch = repoBranch;
        return this;
    }

    /**
     * 仓库分支
     * @return repoBranch
     */
    public String getRepoBranch() {
        return repoBranch;
    }

    public void setRepoBranch(String repoBranch) {
        this.repoBranch = repoBranch;
    }

    public PublicAwLibRes withRepoLibPath(String repoLibPath) {
        this.repoLibPath = repoLibPath;
        return this;
    }

    /**
     * 存公共aw依赖jar包的目录
     * @return repoLibPath
     */
    public String getRepoLibPath() {
        return repoLibPath;
    }

    public void setRepoLibPath(String repoLibPath) {
        this.repoLibPath = repoLibPath;
    }

    public PublicAwLibRes withRepoPassword(String repoPassword) {
        this.repoPassword = repoPassword;
        return this;
    }

    /**
     * 仓库密码
     * @return repoPassword
     */
    public String getRepoPassword() {
        return repoPassword;
    }

    public void setRepoPassword(String repoPassword) {
        this.repoPassword = repoPassword;
    }

    public PublicAwLibRes withRepoPrivateKey(String repoPrivateKey) {
        this.repoPrivateKey = repoPrivateKey;
        return this;
    }

    /**
     * 仓库秘钥
     * @return repoPrivateKey
     */
    public String getRepoPrivateKey() {
        return repoPrivateKey;
    }

    public void setRepoPrivateKey(String repoPrivateKey) {
        this.repoPrivateKey = repoPrivateKey;
    }

    public PublicAwLibRes withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * 仓库地址
     * @return repoUrl
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public PublicAwLibRes withRepoUsername(String repoUsername) {
        this.repoUsername = repoUsername;
        return this;
    }

    /**
     * 仓库用户名
     * @return repoUsername
     */
    public String getRepoUsername() {
        return repoUsername;
    }

    public void setRepoUsername(String repoUsername) {
        this.repoUsername = repoUsername;
    }

    public PublicAwLibRes withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public PublicAwLibRes withUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    }

    /**
     * 更新时间戳
     * @return updateTimeStamp
     */
    public Long getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public PublicAwLibRes withUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
        return this;
    }

    /**
     * 更新时间字符串
     * @return updateTimeString
     */
    public String getUpdateTimeString() {
        return updateTimeString;
    }

    public void setUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
    }

    public PublicAwLibRes withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新人
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicAwLibRes that = (PublicAwLibRes) obj;
        return Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.createTimeString, that.createTimeString)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.documentLink, that.documentLink)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.netArea, that.netArea) && Objects.equals(this.obsTempUrl, that.obsTempUrl)
            && Objects.equals(this.productLine, that.productLine) && Objects.equals(this.repoBranch, that.repoBranch)
            && Objects.equals(this.repoLibPath, that.repoLibPath)
            && Objects.equals(this.repoPassword, that.repoPassword)
            && Objects.equals(this.repoPrivateKey, that.repoPrivateKey) && Objects.equals(this.repoUrl, that.repoUrl)
            && Objects.equals(this.repoUsername, that.repoUsername) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeStamp, that.updateTimeStamp)
            && Objects.equals(this.updateTimeString, that.updateTimeString)
            && Objects.equals(this.updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            createTimeStamp,
            createTimeString,
            createUser,
            documentLink,
            id,
            name,
            netArea,
            obsTempUrl,
            productLine,
            repoBranch,
            repoLibPath,
            repoPassword,
            repoPrivateKey,
            repoUrl,
            repoUsername,
            updateTime,
            updateTimeStamp,
            updateTimeString,
            updateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicAwLibRes {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    createTimeString: ").append(toIndentedString(createTimeString)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    documentLink: ").append(toIndentedString(documentLink)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    netArea: ").append(toIndentedString(netArea)).append("\n");
        sb.append("    obsTempUrl: ").append(toIndentedString(obsTempUrl)).append("\n");
        sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
        sb.append("    repoBranch: ").append(toIndentedString(repoBranch)).append("\n");
        sb.append("    repoLibPath: ").append(toIndentedString(repoLibPath)).append("\n");
        sb.append("    repoPassword: ").append(toIndentedString(repoPassword)).append("\n");
        sb.append("    repoPrivateKey: ").append(toIndentedString(repoPrivateKey)).append("\n");
        sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
        sb.append("    repoUsername: ").append(toIndentedString(repoUsername)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeStamp: ").append(toIndentedString(updateTimeStamp)).append("\n");
        sb.append("    updateTimeString: ").append(toIndentedString(updateTimeString)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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
