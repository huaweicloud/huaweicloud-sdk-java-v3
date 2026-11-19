package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class InstallAgentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_permission")

    private String rootPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_password")

    private String rootPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_user")

    private String loginUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_password")

    private String loginPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_port")

    private Integer loginPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private String hostIdList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private List<MultipartFile> file = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_type")

    private String loginType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_group_id")

    private String hostGroupId;

    public InstallAgentRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public InstallAgentRequest withRootPermission(String rootPermission) {
        this.rootPermission = rootPermission;
        return this;
    }

    /**
     * **参数解释**: 是否允许root直连 **约束限制**: 不涉及 **取值范围**: - true：允许 - false：不允许  **默认取值**: 不涉及
     * @return rootPermission
     */
    public String getRootPermission() {
        return rootPermission;
    }

    public void setRootPermission(String rootPermission) {
        this.rootPermission = rootPermission;
    }

    public InstallAgentRequest withRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
        return this;
    }

    /**
     * **参数解释**: root密码 **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及
     * @return rootPassword
     */
    public String getRootPassword() {
        return rootPassword;
    }

    public void setRootPassword(String rootPassword) {
        this.rootPassword = rootPassword;
    }

    public InstallAgentRequest withLoginUser(String loginUser) {
        this.loginUser = loginUser;
        return this;
    }

    /**
     * **参数解释**: 登录用户 **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及
     * @return loginUser
     */
    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public InstallAgentRequest withLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }

    /**
     * **参数解释**: 登录密码 **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及
     * @return loginPassword
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public InstallAgentRequest withLoginPort(Integer loginPort) {
        this.loginPort = loginPort;
        return this;
    }

    /**
     * **参数解释**: 登录端口 **约束限制**: 不涉及 **取值范围**: 字符长度0-256 **默认取值**: 不涉及
     * minimum: 0
     * maximum: 65535
     * @return loginPort
     */
    public Integer getLoginPort() {
        return loginPort;
    }

    public void setLoginPort(Integer loginPort) {
        this.loginPort = loginPort;
    }

    public InstallAgentRequest withHostIdList(String hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    /**
     * **参数解释**: 服务器id列表,有多个hostId的时使用逗号拼接 **约束限制**: 不涉及 **取值范围**: 字符长度0-3200 **默认取值**: 不涉及
     * @return hostIdList
     */
    public String getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(String hostIdList) {
        this.hostIdList = hostIdList;
    }

    public InstallAgentRequest withFile(List<MultipartFile> file) {
        this.file = file;
        return this;
    }

    public InstallAgentRequest addFileItem(MultipartFile fileItem) {
        if (this.file == null) {
            this.file = new ArrayList<>();
        }
        this.file.add(fileItem);
        return this;
    }

    public InstallAgentRequest withFile(Consumer<List<MultipartFile>> fileSetter) {
        if (this.file == null) {
            this.file = new ArrayList<>();
        }
        fileSetter.accept(this.file);
        return this;
    }

    /**
     * 密码或者密钥模板文件
     * @return file
     */
    public List<MultipartFile> getFile() {
        return file;
    }

    public void setFile(List<MultipartFile> file) {
        this.file = file;
    }

    public InstallAgentRequest withLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }

    /**
     * **参数解释**: 登录类型 **约束限制**: 不涉及 **取值范围**: - single_password - single_sshKey - dew - ssh_key - password  **默认取值**: 不涉及
     * @return loginType
     */
    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public InstallAgentRequest withHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }

    /**
     * **参数解释**: 服务器组id **约束限制**: 不涉及 **取值范围**: 字符长度0-128 **默认取值**: 不涉及
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return hostGroupId;
    }

    public void setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstallAgentRequest that = (InstallAgentRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.rootPermission, that.rootPermission)
            && Objects.equals(this.rootPassword, that.rootPassword) && Objects.equals(this.loginUser, that.loginUser)
            && Objects.equals(this.loginPassword, that.loginPassword) && Objects.equals(this.loginPort, that.loginPort)
            && Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.file, that.file)
            && Objects.equals(this.loginType, that.loginType) && Objects.equals(this.hostGroupId, that.hostGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            rootPermission,
            rootPassword,
            loginUser,
            loginPassword,
            loginPort,
            hostIdList,
            file,
            loginType,
            hostGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstallAgentRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    rootPermission: ").append(toIndentedString(rootPermission)).append("\n");
        sb.append("    rootPassword: ").append(toIndentedString(rootPassword)).append("\n");
        sb.append("    loginUser: ").append(toIndentedString(loginUser)).append("\n");
        sb.append("    loginPassword: ").append(toIndentedString(loginPassword)).append("\n");
        sb.append("    loginPort: ").append(toIndentedString(loginPort)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    loginType: ").append(toIndentedString(loginType)).append("\n");
        sb.append("    hostGroupId: ").append(toIndentedString(hostGroupId)).append("\n");
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
