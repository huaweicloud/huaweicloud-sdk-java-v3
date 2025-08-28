package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAppWhitelistPolicyProcessRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private String processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_type")

    private String processType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_name")

    private String processName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_hash")

    private String processHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_path")

    private String processPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_signer")

    private String fileSigner;

    public ListAppWhitelistPolicyProcessRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListAppWhitelistPolicyProcessRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAppWhitelistPolicyProcessRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAppWhitelistPolicyProcessRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**： 策略ID **约束限制**： 必填 **取值范围**： 字符长度1-64位 **默认取值**： 不涉及 
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ListAppWhitelistPolicyProcessRequest withProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * **参数解释**： 信任状态 **约束限制**: 不涉及 **取值范围**: - trust：可信 - suspicious：可疑 - malicious：未知 - unknown：未知  **默认取值**: 不涉及 
     * @return processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public ListAppWhitelistPolicyProcessRequest withProcessType(String processType) {
        this.processType = processType;
        return this;
    }

    /**
     * **参数解释**： 进程类型 **约束限制**: 不涉及 **取值范围**: - system：系统程序 - interpretive：解释类程序 - normal：普通可执行程序  **默认取值**: 不涉及 
     * @return processType
     */
    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public ListAppWhitelistPolicyProcessRequest withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * **参数解释**： 进程名称 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位 **默认取值**： 不涉及 
     * @return processName
     */
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public ListAppWhitelistPolicyProcessRequest withProcessHash(String processHash) {
        this.processHash = processHash;
        return this;
    }

    /**
     * **参数解释**： 进程hash **约束限制**： 不涉及 **取值范围**： 字符长度1-128位 **默认取值**： 不涉及 
     * @return processHash
     */
    public String getProcessHash() {
        return processHash;
    }

    public void setProcessHash(String processHash) {
        this.processHash = processHash;
    }

    public ListAppWhitelistPolicyProcessRequest withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * **参数解释**： 进程路径 **约束限制**： 不涉及 **取值范围**： 字符长度1-256位 **默认取值**： 不涉及 
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public ListAppWhitelistPolicyProcessRequest withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释**： 确认状态 **约束限制**: 不涉及 **取值范围**: - confirmed：已确认 - unconfirmed：未确认  **默认取值**: 不涉及 
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ListAppWhitelistPolicyProcessRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，包含如下2种。   - Linux：Linux。   - Windows：Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListAppWhitelistPolicyProcessRequest withFileSigner(String fileSigner) {
        this.fileSigner = fileSigner;
        return this;
    }

    /**
     * **参数解释**： 文件签名 **约束限制**： 不涉及 **取值范围**： 字符长度1-128位 **默认取值**： 不涉及 
     * @return fileSigner
     */
    public String getFileSigner() {
        return fileSigner;
    }

    public void setFileSigner(String fileSigner) {
        this.fileSigner = fileSigner;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAppWhitelistPolicyProcessRequest that = (ListAppWhitelistPolicyProcessRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.processStatus, that.processStatus)
            && Objects.equals(this.processType, that.processType) && Objects.equals(this.processName, that.processName)
            && Objects.equals(this.processHash, that.processHash) && Objects.equals(this.processPath, that.processPath)
            && Objects.equals(this.handleStatus, that.handleStatus) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.fileSigner, that.fileSigner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            offset,
            limit,
            policyId,
            processStatus,
            processType,
            processName,
            processHash,
            processPath,
            handleStatus,
            osType,
            fileSigner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppWhitelistPolicyProcessRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
        sb.append("    processName: ").append(toIndentedString(processName)).append("\n");
        sb.append("    processHash: ").append(toIndentedString(processHash)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    fileSigner: ").append(toIndentedString(fileSigner)).append("\n");
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
