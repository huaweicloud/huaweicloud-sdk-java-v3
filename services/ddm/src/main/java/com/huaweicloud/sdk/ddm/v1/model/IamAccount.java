package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IamAccount
 */
public class IamAccount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user")

    private String iamUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user_id")

    private String iamUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_account")

    private String userAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_token")

    private String iamToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_domain")

    private String iamDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_domain_id")

    private String iamDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_x_domain_id")

    private String iamXDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_x_domain_type")

    private String iamXDomainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_project_id")

    private String iamProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_project_name")

    private String iamProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assumed_by_domain_id")

    private String assumedByDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assumed_by_user_id")

    private String assumedByUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assumed_by_user_name")

    private String assumedByUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<String> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive_project_id")

    private String exclusiveProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_enable")

    private Boolean epsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_project_name")

    private String sharedProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context_attributes")

    private String contextAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_profile")

    private String userProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sts_token")

    private String stsToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key_id")

    private String accessKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_access_key")

    private String secretAccessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_account")

    private String sourceAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_urn")

    private String sourceUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_proof")

    private String requestProof;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_project_id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fulfillment_agency")

    private String fulfillmentAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    public IamAccount withIamUser(String iamUser) {
        this.iamUser = iamUser;
        return this;
    }

    /**
     * iam账号。
     * @return iamUser
     */
    public String getIamUser() {
        return iamUser;
    }

    public void setIamUser(String iamUser) {
        this.iamUser = iamUser;
    }

    public IamAccount withIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
        return this;
    }

    /**
     * iam账号id。
     * @return iamUserId
     */
    public String getIamUserId() {
        return iamUserId;
    }

    public void setIamUserId(String iamUserId) {
        this.iamUserId = iamUserId;
    }

    public IamAccount withUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    /**
     * iam账号权限。
     * @return userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public IamAccount withIamToken(String iamToken) {
        this.iamToken = iamToken;
        return this;
    }

    /**
     * iam账号token。
     * @return iamToken
     */
    public String getIamToken() {
        return iamToken;
    }

    public void setIamToken(String iamToken) {
        this.iamToken = iamToken;
    }

    public IamAccount withIamDomain(String iamDomain) {
        this.iamDomain = iamDomain;
        return this;
    }

    /**
     * iamdomain账号。
     * @return iamDomain
     */
    public String getIamDomain() {
        return iamDomain;
    }

    public void setIamDomain(String iamDomain) {
        this.iamDomain = iamDomain;
    }

    public IamAccount withIamDomainId(String iamDomainId) {
        this.iamDomainId = iamDomainId;
        return this;
    }

    /**
     * iamdomain账号id。
     * @return iamDomainId
     */
    public String getIamDomainId() {
        return iamDomainId;
    }

    public void setIamDomainId(String iamDomainId) {
        this.iamDomainId = iamDomainId;
    }

    public IamAccount withIamXDomainId(String iamXDomainId) {
        this.iamXDomainId = iamXDomainId;
        return this;
    }

    /**
     * iamxdomain账号id。
     * @return iamXDomainId
     */
    public String getIamXDomainId() {
        return iamXDomainId;
    }

    public void setIamXDomainId(String iamXDomainId) {
        this.iamXDomainId = iamXDomainId;
    }

    public IamAccount withIamXDomainType(String iamXDomainType) {
        this.iamXDomainType = iamXDomainType;
        return this;
    }

    /**
     * iamxdomain账号类型。
     * @return iamXDomainType
     */
    public String getIamXDomainType() {
        return iamXDomainType;
    }

    public void setIamXDomainType(String iamXDomainType) {
        this.iamXDomainType = iamXDomainType;
    }

    public IamAccount withIamProjectId(String iamProjectId) {
        this.iamProjectId = iamProjectId;
        return this;
    }

    /**
     * iam项目id。
     * @return iamProjectId
     */
    public String getIamProjectId() {
        return iamProjectId;
    }

    public void setIamProjectId(String iamProjectId) {
        this.iamProjectId = iamProjectId;
    }

    public IamAccount withIamProjectName(String iamProjectName) {
        this.iamProjectName = iamProjectName;
        return this;
    }

    /**
     * iam项目名称。
     * @return iamProjectName
     */
    public String getIamProjectName() {
        return iamProjectName;
    }

    public void setIamProjectName(String iamProjectName) {
        this.iamProjectName = iamProjectName;
    }

    public IamAccount withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public IamAccount withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public IamAccount withAssumedByDomainId(String assumedByDomainId) {
        this.assumedByDomainId = assumedByDomainId;
        return this;
    }

    /**
     * assumed_by_domain_id。
     * @return assumedByDomainId
     */
    public String getAssumedByDomainId() {
        return assumedByDomainId;
    }

    public void setAssumedByDomainId(String assumedByDomainId) {
        this.assumedByDomainId = assumedByDomainId;
    }

    public IamAccount withAssumedByUserId(String assumedByUserId) {
        this.assumedByUserId = assumedByUserId;
        return this;
    }

    /**
     * assumed_by_user_id。
     * @return assumedByUserId
     */
    public String getAssumedByUserId() {
        return assumedByUserId;
    }

    public void setAssumedByUserId(String assumedByUserId) {
        this.assumedByUserId = assumedByUserId;
    }

    public IamAccount withAssumedByUserName(String assumedByUserName) {
        this.assumedByUserName = assumedByUserName;
        return this;
    }

    /**
     * assumed_by_user_name。
     * @return assumedByUserName
     */
    public String getAssumedByUserName() {
        return assumedByUserName;
    }

    public void setAssumedByUserName(String assumedByUserName) {
        this.assumedByUserName = assumedByUserName;
    }

    public IamAccount withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public IamAccount addRolesItem(String rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public IamAccount withRoles(Consumer<List<String>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 角色信息。
     * @return roles
     */
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public IamAccount withExclusiveProjectId(String exclusiveProjectId) {
        this.exclusiveProjectId = exclusiveProjectId;
        return this;
    }

    /**
     * exclusive_project_id。
     * @return exclusiveProjectId
     */
    public String getExclusiveProjectId() {
        return exclusiveProjectId;
    }

    public void setExclusiveProjectId(String exclusiveProjectId) {
        this.exclusiveProjectId = exclusiveProjectId;
    }

    public IamAccount withEpsEnable(Boolean epsEnable) {
        this.epsEnable = epsEnable;
        return this;
    }

    /**
     * 是否支持eps。
     * @return epsEnable
     */
    public Boolean getEpsEnable() {
        return epsEnable;
    }

    public void setEpsEnable(Boolean epsEnable) {
        this.epsEnable = epsEnable;
    }

    public IamAccount withSharedProjectName(String sharedProjectName) {
        this.sharedProjectName = sharedProjectName;
        return this;
    }

    /**
     * shared_project_name。
     * @return sharedProjectName
     */
    public String getSharedProjectName() {
        return sharedProjectName;
    }

    public void setSharedProjectName(String sharedProjectName) {
        this.sharedProjectName = sharedProjectName;
    }

    public IamAccount withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * authorization。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public IamAccount withContextAttributes(String contextAttributes) {
        this.contextAttributes = contextAttributes;
        return this;
    }

    /**
     * 文本属性。
     * @return contextAttributes
     */
    public String getContextAttributes() {
        return contextAttributes;
    }

    public void setContextAttributes(String contextAttributes) {
        this.contextAttributes = contextAttributes;
    }

    public IamAccount withUserProfile(String userProfile) {
        this.userProfile = userProfile;
        return this;
    }

    /**
     * 用户文件。
     * @return userProfile
     */
    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public IamAccount withStsToken(String stsToken) {
        this.stsToken = stsToken;
        return this;
    }

    /**
     * sts_token。
     * @return stsToken
     */
    public String getStsToken() {
        return stsToken;
    }

    public void setStsToken(String stsToken) {
        this.stsToken = stsToken;
    }

    public IamAccount withAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * access_key_id。
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public IamAccount withSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * secret_access_key。
     * @return secretAccessKey
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    public IamAccount withSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * source_account。
     * @return sourceAccount
     */
    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public IamAccount withSourceUrn(String sourceUrn) {
        this.sourceUrn = sourceUrn;
        return this;
    }

    /**
     * source_urn。
     * @return sourceUrn
     */
    public String getSourceUrn() {
        return sourceUrn;
    }

    public void setSourceUrn(String sourceUrn) {
        this.sourceUrn = sourceUrn;
    }

    public IamAccount withRequestProof(String requestProof) {
        this.requestProof = requestProof;
        return this;
    }

    /**
     * request_proof。
     * @return requestProof
     */
    public String getRequestProof() {
        return requestProof;
    }

    public void setRequestProof(String requestProof) {
        this.requestProof = requestProof;
    }

    public IamAccount withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * x_project_id。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_project_id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public IamAccount withFulfillmentAgency(String fulfillmentAgency) {
        this.fulfillmentAgency = fulfillmentAgency;
        return this;
    }

    /**
     * fulfillment_agency。
     * @return fulfillmentAgency
     */
    public String getFulfillmentAgency() {
        return fulfillmentAgency;
    }

    public void setFulfillmentAgency(String fulfillmentAgency) {
        this.fulfillmentAgency = fulfillmentAgency;
    }

    public IamAccount withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * operation_id。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IamAccount that = (IamAccount) obj;
        return Objects.equals(this.iamUser, that.iamUser) && Objects.equals(this.iamUserId, that.iamUserId)
            && Objects.equals(this.userAccount, that.userAccount) && Objects.equals(this.iamToken, that.iamToken)
            && Objects.equals(this.iamDomain, that.iamDomain) && Objects.equals(this.iamDomainId, that.iamDomainId)
            && Objects.equals(this.iamXDomainId, that.iamXDomainId)
            && Objects.equals(this.iamXDomainType, that.iamXDomainType)
            && Objects.equals(this.iamProjectId, that.iamProjectId)
            && Objects.equals(this.iamProjectName, that.iamProjectName) && Objects.equals(this.language, that.language)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.assumedByDomainId, that.assumedByDomainId)
            && Objects.equals(this.assumedByUserId, that.assumedByUserId)
            && Objects.equals(this.assumedByUserName, that.assumedByUserName) && Objects.equals(this.roles, that.roles)
            && Objects.equals(this.exclusiveProjectId, that.exclusiveProjectId)
            && Objects.equals(this.epsEnable, that.epsEnable)
            && Objects.equals(this.sharedProjectName, that.sharedProjectName)
            && Objects.equals(this.authorization, that.authorization)
            && Objects.equals(this.contextAttributes, that.contextAttributes)
            && Objects.equals(this.userProfile, that.userProfile) && Objects.equals(this.stsToken, that.stsToken)
            && Objects.equals(this.accessKeyId, that.accessKeyId)
            && Objects.equals(this.secretAccessKey, that.secretAccessKey)
            && Objects.equals(this.sourceAccount, that.sourceAccount) && Objects.equals(this.sourceUrn, that.sourceUrn)
            && Objects.equals(this.requestProof, that.requestProof) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.fulfillmentAgency, that.fulfillmentAgency)
            && Objects.equals(this.operationId, that.operationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamUser,
            iamUserId,
            userAccount,
            iamToken,
            iamDomain,
            iamDomainId,
            iamXDomainId,
            iamXDomainType,
            iamProjectId,
            iamProjectName,
            language,
            instanceId,
            assumedByDomainId,
            assumedByUserId,
            assumedByUserName,
            roles,
            exclusiveProjectId,
            epsEnable,
            sharedProjectName,
            authorization,
            contextAttributes,
            userProfile,
            stsToken,
            accessKeyId,
            secretAccessKey,
            sourceAccount,
            sourceUrn,
            requestProof,
            xProjectId,
            fulfillmentAgency,
            operationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IamAccount {\n");
        sb.append("    iamUser: ").append(toIndentedString(iamUser)).append("\n");
        sb.append("    iamUserId: ").append(toIndentedString(iamUserId)).append("\n");
        sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
        sb.append("    iamToken: ").append(toIndentedString(iamToken)).append("\n");
        sb.append("    iamDomain: ").append(toIndentedString(iamDomain)).append("\n");
        sb.append("    iamDomainId: ").append(toIndentedString(iamDomainId)).append("\n");
        sb.append("    iamXDomainId: ").append(toIndentedString(iamXDomainId)).append("\n");
        sb.append("    iamXDomainType: ").append(toIndentedString(iamXDomainType)).append("\n");
        sb.append("    iamProjectId: ").append(toIndentedString(iamProjectId)).append("\n");
        sb.append("    iamProjectName: ").append(toIndentedString(iamProjectName)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    assumedByDomainId: ").append(toIndentedString(assumedByDomainId)).append("\n");
        sb.append("    assumedByUserId: ").append(toIndentedString(assumedByUserId)).append("\n");
        sb.append("    assumedByUserName: ").append(toIndentedString(assumedByUserName)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    exclusiveProjectId: ").append(toIndentedString(exclusiveProjectId)).append("\n");
        sb.append("    epsEnable: ").append(toIndentedString(epsEnable)).append("\n");
        sb.append("    sharedProjectName: ").append(toIndentedString(sharedProjectName)).append("\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    contextAttributes: ").append(toIndentedString(contextAttributes)).append("\n");
        sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
        sb.append("    stsToken: ").append(toIndentedString(stsToken)).append("\n");
        sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
        sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
        sb.append("    sourceAccount: ").append(toIndentedString(sourceAccount)).append("\n");
        sb.append("    sourceUrn: ").append(toIndentedString(sourceUrn)).append("\n");
        sb.append("    requestProof: ").append(toIndentedString(requestProof)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    fulfillmentAgency: ").append(toIndentedString(fulfillmentAgency)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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
