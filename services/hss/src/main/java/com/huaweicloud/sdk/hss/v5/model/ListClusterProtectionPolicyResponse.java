package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListClusterProtectionPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_auth_token")

    private String xAuthToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "general_policy_num")

    private Integer generalPolicyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_image_policy_num")

    private Integer maliciousImagePolicyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policy_num")

    private Integer securityPolicyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<ClusterPolicyResponseInfo> dataList = null;

    public ListClusterProtectionPolicyResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 总数 **取值范围**: 最小值0，最大值10000 
     * minimum: 0
     * maximum: 10000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListClusterProtectionPolicyResponse withXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
        return this;
    }

    /**
     * **参数解释**: 用户Token **取值范围**: 字符长度1-32768位 
     * @return xAuthToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_auth_token")
    public String getXAuthToken() {
        return xAuthToken;
    }

    public void setXAuthToken(String xAuthToken) {
        this.xAuthToken = xAuthToken;
    }

    public ListClusterProtectionPolicyResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 项目ID **取值范围**: 字符长度1-32768位 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListClusterProtectionPolicyResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 主机所属的企业项目ID **取值范围**: 字符长度1-256位 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListClusterProtectionPolicyResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**: Region ID **取值范围**: 字符长度1-32768位 
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListClusterProtectionPolicyResponse withGeneralPolicyNum(Integer generalPolicyNum) {
        this.generalPolicyNum = generalPolicyNum;
        return this;
    }

    /**
     * **参数解释**: 通用策略数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return generalPolicyNum
     */
    public Integer getGeneralPolicyNum() {
        return generalPolicyNum;
    }

    public void setGeneralPolicyNum(Integer generalPolicyNum) {
        this.generalPolicyNum = generalPolicyNum;
    }

    public ListClusterProtectionPolicyResponse withMaliciousImagePolicyNum(Integer maliciousImagePolicyNum) {
        this.maliciousImagePolicyNum = maliciousImagePolicyNum;
        return this;
    }

    /**
     * **参数解释**: 恶意镜像策略数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return maliciousImagePolicyNum
     */
    public Integer getMaliciousImagePolicyNum() {
        return maliciousImagePolicyNum;
    }

    public void setMaliciousImagePolicyNum(Integer maliciousImagePolicyNum) {
        this.maliciousImagePolicyNum = maliciousImagePolicyNum;
    }

    public ListClusterProtectionPolicyResponse withSecurityPolicyNum(Integer securityPolicyNum) {
        this.securityPolicyNum = securityPolicyNum;
        return this;
    }

    /**
     * **参数解释**: 安全镜像策略数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return securityPolicyNum
     */
    public Integer getSecurityPolicyNum() {
        return securityPolicyNum;
    }

    public void setSecurityPolicyNum(Integer securityPolicyNum) {
        this.securityPolicyNum = securityPolicyNum;
    }

    public ListClusterProtectionPolicyResponse withDataList(List<ClusterPolicyResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListClusterProtectionPolicyResponse addDataListItem(ClusterPolicyResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListClusterProtectionPolicyResponse withDataList(Consumer<List<ClusterPolicyResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 集群防护策略列表 **取值范围**: 取值0-10000个ClusterPolicyResponseInfo对象 
     * @return dataList
     */
    public List<ClusterPolicyResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<ClusterPolicyResponseInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterProtectionPolicyResponse that = (ListClusterProtectionPolicyResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.xAuthToken, that.xAuthToken)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.region, that.region) && Objects.equals(this.generalPolicyNum, that.generalPolicyNum)
            && Objects.equals(this.maliciousImagePolicyNum, that.maliciousImagePolicyNum)
            && Objects.equals(this.securityPolicyNum, that.securityPolicyNum)
            && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum,
            xAuthToken,
            projectId,
            enterpriseProjectId,
            region,
            generalPolicyNum,
            maliciousImagePolicyNum,
            securityPolicyNum,
            dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterProtectionPolicyResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    xAuthToken: ").append(toIndentedString(xAuthToken)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    generalPolicyNum: ").append(toIndentedString(generalPolicyNum)).append("\n");
        sb.append("    maliciousImagePolicyNum: ").append(toIndentedString(maliciousImagePolicyNum)).append("\n");
        sb.append("    securityPolicyNum: ").append(toIndentedString(securityPolicyNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
