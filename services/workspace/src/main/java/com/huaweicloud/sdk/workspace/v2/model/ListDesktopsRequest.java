package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListDesktopsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private List<String> userName = null;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_share_desktop")

    private Boolean isShareDesktop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private List<String> desktopId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    public ListDesktopsRequest withUserName(List<String> userName) {
        this.userName = userName;
        return this;
    }

    public ListDesktopsRequest addUserNameItem(String userNameItem) {
        if (this.userName == null) {
            this.userName = new ArrayList<>();
        }
        this.userName.add(userNameItem);
        return this;
    }

    public ListDesktopsRequest withUserName(Consumer<List<String>> userNameSetter) {
        if (this.userName == null) {
            this.userName = new ArrayList<>();
        }
        userNameSetter.accept(this.userName);
        return this;
    }

    /**
     * 桌面所属用户。
     * @return userName
     */
    public List<String> getUserName() {
        return userName;
    }

    public void setUserName(List<String> userName) {
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
     * 企业项目ID。
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

    public ListDesktopsRequest withIsShareDesktop(Boolean isShareDesktop) {
        this.isShareDesktop = isShareDesktop;
        return this;
    }

    /**
     * 是否为协同桌面。
     * @return isShareDesktop
     */
    public Boolean getIsShareDesktop() {
        return isShareDesktop;
    }

    public void setIsShareDesktop(Boolean isShareDesktop) {
        this.isShareDesktop = isShareDesktop;
    }

    public ListDesktopsRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 桌面的子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ListDesktopsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 桌面的运行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListDesktopsRequest withDesktopId(List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    public ListDesktopsRequest addDesktopIdItem(String desktopIdItem) {
        if (this.desktopId == null) {
            this.desktopId = new ArrayList<>();
        }
        this.desktopId.add(desktopIdItem);
        return this;
    }

    public ListDesktopsRequest withDesktopId(Consumer<List<String>> desktopIdSetter) {
        if (this.desktopId == null) {
            this.desktopId = new ArrayList<>();
        }
        desktopIdSetter.accept(this.desktopId);
        return this;
    }

    /**
     * 桌面id，当前最多支持100个桌面id进行查询。
     * @return desktopId
     */
    public List<String> getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(List<String> desktopId) {
        this.desktopId = desktopId;
    }

    public ListDesktopsRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 桌面的标签。样例： - key1=value1。 - key1=value1，key2=value2。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
            && Objects.equals(this.desktopType, that.desktopType)
            && Objects.equals(this.isShareDesktop, that.isShareDesktop) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.desktopId, that.desktopId)
            && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName,
            computerName,
            desktopIp,
            offset,
            limit,
            poolId,
            enterpriseProjectId,
            desktopType,
            isShareDesktop,
            subnetId,
            status,
            desktopId,
            tag);
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
        sb.append("    isShareDesktop: ").append(toIndentedString(isShareDesktop)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
