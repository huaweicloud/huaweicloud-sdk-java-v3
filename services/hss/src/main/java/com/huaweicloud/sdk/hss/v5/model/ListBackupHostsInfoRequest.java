package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListBackupHostsInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_run")

    private Boolean isRun;

    public ListBackupHostsInfoRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListBackupHostsInfoRequest withLimit(Integer limit) {
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

    public ListBackupHostsInfoRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
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

    public ListBackupHostsInfoRequest withIsRun(Boolean isRun) {
        this.isRun = isRun;
        return this;
    }

    /**
     * **参数解释**: 是否仅显示Agent在线的远端备份服务器 **约束限制**: 不涉及 **取值范围**: - true ：仅显示Agent状态为在线的远端备份服务器。 - false：显示全部Agent状态的远端备份服务器。  **默认取值**: false 
     * @return isRun
     */
    public Boolean getIsRun() {
        return isRun;
    }

    public void setIsRun(Boolean isRun) {
        this.isRun = isRun;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBackupHostsInfoRequest that = (ListBackupHostsInfoRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.isRun, that.isRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, limit, offset, isRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupHostsInfoRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    isRun: ").append(toIndentedString(isRun)).append("\n");
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
