package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDesktopsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ip")

    private String desktopIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_type")

    private String desktopType;

    public ListDesktopsRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面所属用户。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListDesktopsRequest withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public ListDesktopsRequest withDesktopIp(String desktopIp) {
        this.desktopIp = desktopIp;
        return this;
    }

    /**
     * 桌面IP地址。
     * @return desktopIp
     */
    public String getDesktopIp() {
        return desktopIp;
    }

    public void setDesktopIp(String desktopIp) {
        this.desktopIp = desktopIp;
    }

    public ListDesktopsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDesktopsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，取值范围0-1000，默认值1000。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDesktopsRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 桌面池ID,多个桌面池ID用逗号隔开。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ListDesktopsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListDesktopsRequest withDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    /**
     * 桌面类型，为空时查所有桌面。查询多个类型时用,隔开。 - DEDICATED：普通桌面，包括专享桌面、专属桌面等。 - SHARED: 多用户共享桌面。
     * @return desktopType
     */
    public String getDesktopType() {
        return desktopType;
    }

    public void setDesktopType(String desktopType) {
        this.desktopType = desktopType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopsRequest that = (ListDesktopsRequest) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.desktopIp, that.desktopIp) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.desktopType, that.desktopType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, computerName, desktopIp, offset, limit, poolId, enterpriseProjectId, desktopType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopsRequest {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    desktopIp: ").append(toIndentedString(desktopIp)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
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
