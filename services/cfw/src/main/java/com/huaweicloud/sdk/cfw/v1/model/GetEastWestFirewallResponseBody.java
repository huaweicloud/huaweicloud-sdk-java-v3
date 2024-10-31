package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询东西向防火墙接口响应Body体
 */
public class GetEastWestFirewallResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_associated_subnets")

    private List<SubnetInfo> firewallAssociatedSubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er")

    private ErInstance er;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_vpc")

    private VpcDetail inspectionVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_infos")

    private List<EwProtectResourceInfo> protectInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public GetEastWestFirewallResponseBody withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，注意type为0的为互联网边界防护对象id，type为1的为VPC边界防护对象id。此处仅取type为1的防护对象id，可通过data.records.protect_objects.type（.表示各对象之间层级的区分）获得。
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public GetEastWestFirewallResponseBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID, 可以从调API处获取，也可以从控制台获取。[项目ID获取方式](cfw_02_0015.xml)
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public GetEastWestFirewallResponseBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 防护状态：0 已开启防护， 1 未开启防护
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public GetEastWestFirewallResponseBody withFirewallAssociatedSubnets(List<SubnetInfo> firewallAssociatedSubnets) {
        this.firewallAssociatedSubnets = firewallAssociatedSubnets;
        return this;
    }

    public GetEastWestFirewallResponseBody addFirewallAssociatedSubnetsItem(SubnetInfo firewallAssociatedSubnetsItem) {
        if (this.firewallAssociatedSubnets == null) {
            this.firewallAssociatedSubnets = new ArrayList<>();
        }
        this.firewallAssociatedSubnets.add(firewallAssociatedSubnetsItem);
        return this;
    }

    public GetEastWestFirewallResponseBody withFirewallAssociatedSubnets(
        Consumer<List<SubnetInfo>> firewallAssociatedSubnetsSetter) {
        if (this.firewallAssociatedSubnets == null) {
            this.firewallAssociatedSubnets = new ArrayList<>();
        }
        firewallAssociatedSubnetsSetter.accept(this.firewallAssociatedSubnets);
        return this;
    }

    /**
     * 云防火墙关联子网信息
     * @return firewallAssociatedSubnets
     */
    public List<SubnetInfo> getFirewallAssociatedSubnets() {
        return firewallAssociatedSubnets;
    }

    public void setFirewallAssociatedSubnets(List<SubnetInfo> firewallAssociatedSubnets) {
        this.firewallAssociatedSubnets = firewallAssociatedSubnets;
    }

    public GetEastWestFirewallResponseBody withEr(ErInstance er) {
        this.er = er;
        return this;
    }

    public GetEastWestFirewallResponseBody withEr(Consumer<ErInstance> erSetter) {
        if (this.er == null) {
            this.er = new ErInstance();
            erSetter.accept(this.er);
        }

        return this;
    }

    /**
     * Get er
     * @return er
     */
    public ErInstance getEr() {
        return er;
    }

    public void setEr(ErInstance er) {
        this.er = er;
    }

    public GetEastWestFirewallResponseBody withInspectionVpc(VpcDetail inspectionVpc) {
        this.inspectionVpc = inspectionVpc;
        return this;
    }

    public GetEastWestFirewallResponseBody withInspectionVpc(Consumer<VpcDetail> inspectionVpcSetter) {
        if (this.inspectionVpc == null) {
            this.inspectionVpc = new VpcDetail();
            inspectionVpcSetter.accept(this.inspectionVpc);
        }

        return this;
    }

    /**
     * Get inspectionVpc
     * @return inspectionVpc
     */
    public VpcDetail getInspectionVpc() {
        return inspectionVpc;
    }

    public void setInspectionVpc(VpcDetail inspectionVpc) {
        this.inspectionVpc = inspectionVpc;
    }

    public GetEastWestFirewallResponseBody withProtectInfos(List<EwProtectResourceInfo> protectInfos) {
        this.protectInfos = protectInfos;
        return this;
    }

    public GetEastWestFirewallResponseBody addProtectInfosItem(EwProtectResourceInfo protectInfosItem) {
        if (this.protectInfos == null) {
            this.protectInfos = new ArrayList<>();
        }
        this.protectInfos.add(protectInfosItem);
        return this;
    }

    public GetEastWestFirewallResponseBody withProtectInfos(Consumer<List<EwProtectResourceInfo>> protectInfosSetter) {
        if (this.protectInfos == null) {
            this.protectInfos = new ArrayList<>();
        }
        protectInfosSetter.accept(this.protectInfos);
        return this;
    }

    /**
     * 东西向防护资源信息
     * @return protectInfos
     */
    public List<EwProtectResourceInfo> getProtectInfos() {
        return protectInfos;
    }

    public void setProtectInfos(List<EwProtectResourceInfo> protectInfos) {
        this.protectInfos = protectInfos;
    }

    public GetEastWestFirewallResponseBody withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 防护VPC总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public GetEastWestFirewallResponseBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public GetEastWestFirewallResponseBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数，范围为1-1024
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public GetEastWestFirewallResponseBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 防护模式，值为er
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetEastWestFirewallResponseBody that = (GetEastWestFirewallResponseBody) obj;
        return Objects.equals(this.objectId, that.objectId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.firewallAssociatedSubnets, that.firewallAssociatedSubnets)
            && Objects.equals(this.er, that.er) && Objects.equals(this.inspectionVpc, that.inspectionVpc)
            && Objects.equals(this.protectInfos, that.protectInfos) && Objects.equals(this.total, that.total)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId,
            projectId,
            status,
            firewallAssociatedSubnets,
            er,
            inspectionVpc,
            protectInfos,
            total,
            offset,
            limit,
            mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetEastWestFirewallResponseBody {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    firewallAssociatedSubnets: ").append(toIndentedString(firewallAssociatedSubnets)).append("\n");
        sb.append("    er: ").append(toIndentedString(er)).append("\n");
        sb.append("    inspectionVpc: ").append(toIndentedString(inspectionVpc)).append("\n");
        sb.append("    protectInfos: ").append(toIndentedString(protectInfos)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
