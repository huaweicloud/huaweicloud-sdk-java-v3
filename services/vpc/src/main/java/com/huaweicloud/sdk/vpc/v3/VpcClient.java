package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.vpc.v3.model.AddClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddSourcesToTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddSourcesToTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.AddVpcExtendCidrRequest;
import com.huaweicloud.sdk.vpc.v3.model.AddVpcExtendCidrResponse;
import com.huaweicloud.sdk.vpc.v3.model.AssociateSubnetFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.AssociateSubnetFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateFirewallTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateFirewallTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreatePortTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreatePortTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteFirewallTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeleteFirewallTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeletePortTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.BatchDeletePortTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.CountFirewallsByTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.CountFirewallsByTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.CountPortsByTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.CountPortsByTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateClouddcnSubnetRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateClouddcnSubnetResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateFirewallTagResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreatePortTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreatePortTagResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateVirsubnetCidrReservationRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateVirsubnetCidrReservationResponse;
import com.huaweicloud.sdk.vpc.v3.model.CreateVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.CreateVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteClouddcnSubnetRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteClouddcnSubnetResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteClouddcnSubnetsTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteClouddcnSubnetsTagResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteFirewallTagResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteIpAddressGroupForceResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeletePortTagRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeletePortTagResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteVirsubnetCidrReservationRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteVirsubnetCidrReservationResponse;
import com.huaweicloud.sdk.vpc.v3.model.DeleteVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupsDependencyRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupsDependencyResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsCountFilterTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsCountFilterTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsFilterTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsFilterTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallsByTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListFirewallsByTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListPortTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListPortTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListPortsByTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListPortsByTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListPortsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListPortsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListSubNetworkInterfacesRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListSubNetworkInterfacesResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFilterRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFilterRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFiltersRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorFiltersResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorSessionsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListTrafficMirrorSessionsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListVirsubnetCidrReservationsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListVirsubnetCidrReservationsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListVirsubnetsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListVirsubnetsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListVpcsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListVpcsResponse;
import com.huaweicloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.MigrateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSecurityGroupsRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSecurityGroupsResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSourcesFromTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveSourcesFromTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.RemoveVpcExtendCidrRequest;
import com.huaweicloud.sdk.vpc.v3.model.RemoveVpcExtendCidrResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowClouddcnSubnetRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowClouddcnSubnetResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowClouddcnSubnetsTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowClouddcnSubnetsTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowFirewallTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowPortRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowPortResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowPortTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowPortTagsResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowQuotaRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowQuotaResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSecurityGroupRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfacesQuantityRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowSubNetworkInterfacesQuantityResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowVirsubnetCidrReservationRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowVirsubnetCidrReservationResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowVirsubnetRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowVirsubnetResponse;
import com.huaweicloud.sdk.vpc.v3.model.ShowVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateAddressGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateClouddcnSubnetRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateClouddcnSubnetResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRulesRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateFirewallRulesResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSecurityGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSecurityGroupResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateSubNetworkInterfaceResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRuleRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorFilterRuleResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorSessionRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateTrafficMirrorSessionResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVirsubnetCidrReservationRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVirsubnetCidrReservationResponse;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcResponse;

public class VpcClient {

    protected HcClient hcClient;

    public VpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcClient> newBuilder() {
        ClientBuilder<VpcClient> clientBuilder = new ClientBuilder<>(VpcClient::new);
        return clientBuilder;
    }

    /**
     * 端口插入安全组
     *
     * 端口插入安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSecurityGroupsRequest 请求对象
     * @return AddSecurityGroupsResponse
     */
    public AddSecurityGroupsResponse addSecurityGroups(AddSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addSecurityGroups);
    }

    /**
     * 端口插入安全组
     *
     * 端口插入安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSecurityGroupsRequest 请求对象
     * @return SyncInvoker<AddSecurityGroupsRequest, AddSecurityGroupsResponse>
     */
    public SyncInvoker<AddSecurityGroupsRequest, AddSecurityGroupsResponse> addSecurityGroupsInvoker(
        AddSecurityGroupsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.addSecurityGroups, hcClient);
    }

    /**
     * 流量镜像会话添加镜像源
     *
     * 流量镜像会话添加镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSourcesToTrafficMirrorSessionRequest 请求对象
     * @return AddSourcesToTrafficMirrorSessionResponse
     */
    public AddSourcesToTrafficMirrorSessionResponse addSourcesToTrafficMirrorSession(
        AddSourcesToTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addSourcesToTrafficMirrorSession);
    }

    /**
     * 流量镜像会话添加镜像源
     *
     * 流量镜像会话添加镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSourcesToTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse>
     */
    public SyncInvoker<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSessionInvoker(
        AddSourcesToTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.addSourcesToTrafficMirrorSession, hcClient);
    }

    /**
     * 批量添加端口资源标签
     *
     * 为指定的端口批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePortTagsRequest 请求对象
     * @return BatchCreatePortTagsResponse
     */
    public BatchCreatePortTagsResponse batchCreatePortTags(BatchCreatePortTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreatePortTags);
    }

    /**
     * 批量添加端口资源标签
     *
     * 为指定的端口批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePortTagsRequest 请求对象
     * @return SyncInvoker<BatchCreatePortTagsRequest, BatchCreatePortTagsResponse>
     */
    public SyncInvoker<BatchCreatePortTagsRequest, BatchCreatePortTagsResponse> batchCreatePortTagsInvoker(
        BatchCreatePortTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchCreatePortTags, hcClient);
    }

    /**
     * 批量创建安全组规则
     *
     * 在特定安全组下批量创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityGroupRulesRequest 请求对象
     * @return BatchCreateSecurityGroupRulesResponse
     */
    public BatchCreateSecurityGroupRulesResponse batchCreateSecurityGroupRules(
        BatchCreateSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSecurityGroupRules);
    }

    /**
     * 批量创建安全组规则
     *
     * 在特定安全组下批量创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse>
     */
    public SyncInvoker<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse> batchCreateSecurityGroupRulesInvoker(
        BatchCreateSecurityGroupRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchCreateSecurityGroupRules, hcClient);
    }

    /**
     * 批量创建辅助弹性网卡
     *
     * 批量创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return BatchCreateSubNetworkInterfaceResponse
     */
    public BatchCreateSubNetworkInterfaceResponse batchCreateSubNetworkInterface(
        BatchCreateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterface);
    }

    /**
     * 批量创建辅助弹性网卡
     *
     * 批量创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse>
     */
    public SyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceInvoker(
        BatchCreateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchCreateSubNetworkInterface, hcClient);
    }

    /**
     * 批量删除端口资源标签
     *
     * 为指定的端口资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePortTagsRequest 请求对象
     * @return BatchDeletePortTagsResponse
     */
    public BatchDeletePortTagsResponse batchDeletePortTags(BatchDeletePortTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchDeletePortTags);
    }

    /**
     * 批量删除端口资源标签
     *
     * 为指定的端口资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePortTagsRequest 请求对象
     * @return SyncInvoker<BatchDeletePortTagsRequest, BatchDeletePortTagsResponse>
     */
    public SyncInvoker<BatchDeletePortTagsRequest, BatchDeletePortTagsResponse> batchDeletePortTagsInvoker(
        BatchDeletePortTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchDeletePortTags, hcClient);
    }

    /**
     * 查询端口资源实例数量
     *
     * 使用标签过滤查询端口实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPortsByTagsRequest 请求对象
     * @return CountPortsByTagsResponse
     */
    public CountPortsByTagsResponse countPortsByTags(CountPortsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.countPortsByTags);
    }

    /**
     * 查询端口资源实例数量
     *
     * 使用标签过滤查询端口实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPortsByTagsRequest 请求对象
     * @return SyncInvoker<CountPortsByTagsRequest, CountPortsByTagsResponse>
     */
    public SyncInvoker<CountPortsByTagsRequest, CountPortsByTagsResponse> countPortsByTagsInvoker(
        CountPortsByTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.countPortsByTags, hcClient);
    }

    /**
     * 添加端口资源标签
     *
     * 给指定端口资源实例增加标签信息。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortTagRequest 请求对象
     * @return CreatePortTagResponse
     */
    public CreatePortTagResponse createPortTag(CreatePortTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPortTag);
    }

    /**
     * 添加端口资源标签
     *
     * 给指定端口资源实例增加标签信息。
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortTagRequest 请求对象
     * @return SyncInvoker<CreatePortTagRequest, CreatePortTagResponse>
     */
    public SyncInvoker<CreatePortTagRequest, CreatePortTagResponse> createPortTagInvoker(CreatePortTagRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createPortTag, hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRequest 请求对象
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupInvoker(
        CreateSecurityGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRuleRequest 请求对象
     * @return CreateSecurityGroupRuleResponse
     */
    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建辅助弹性网卡
     *
     * 创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubNetworkInterfaceRequest 请求对象
     * @return CreateSubNetworkInterfaceResponse
     */
    public CreateSubNetworkInterfaceResponse createSubNetworkInterface(CreateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    /**
     * 创建辅助弹性网卡
     *
     * 创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse>
     */
    public SyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceInvoker(
        CreateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createSubNetworkInterface, hcClient);
    }

    /**
     * 创建流量镜像筛选条件
     *
     * 创建流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRequest 请求对象
     * @return CreateTrafficMirrorFilterResponse
     */
    public CreateTrafficMirrorFilterResponse createTrafficMirrorFilter(CreateTrafficMirrorFilterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createTrafficMirrorFilter);
    }

    /**
     * 创建流量镜像筛选条件
     *
     * 创建流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRequest 请求对象
     * @return SyncInvoker<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse>
     */
    public SyncInvoker<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse> createTrafficMirrorFilterInvoker(
        CreateTrafficMirrorFilterRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createTrafficMirrorFilter, hcClient);
    }

    /**
     * 创建流量镜像筛选规则
     *
     * 创建流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRuleRequest 请求对象
     * @return CreateTrafficMirrorFilterRuleResponse
     */
    public CreateTrafficMirrorFilterRuleResponse createTrafficMirrorFilterRule(
        CreateTrafficMirrorFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createTrafficMirrorFilterRule);
    }

    /**
     * 创建流量镜像筛选规则
     *
     * 创建流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRuleRequest 请求对象
     * @return SyncInvoker<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse>
     */
    public SyncInvoker<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse> createTrafficMirrorFilterRuleInvoker(
        CreateTrafficMirrorFilterRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 创建流量镜像会话
     *
     * 创建流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorSessionRequest 请求对象
     * @return CreateTrafficMirrorSessionResponse
     */
    public CreateTrafficMirrorSessionResponse createTrafficMirrorSession(CreateTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createTrafficMirrorSession);
    }

    /**
     * 创建流量镜像会话
     *
     * 创建流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse>
     */
    public SyncInvoker<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse> createTrafficMirrorSessionInvoker(
        CreateTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createTrafficMirrorSession, hcClient);
    }

    /**
     * 创建子网预留网段
     *
     * 子网预留网段是子网网段范围的IP网段，此IP网段内的IP不会被子网内的实例占用。用户可以通过创建子网预留网段来预留某个IP网段，用于后续的特殊场景使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirsubnetCidrReservationRequest 请求对象
     * @return CreateVirsubnetCidrReservationResponse
     */
    public CreateVirsubnetCidrReservationResponse createVirsubnetCidrReservation(
        CreateVirsubnetCidrReservationRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVirsubnetCidrReservation);
    }

    /**
     * 创建子网预留网段
     *
     * 子网预留网段是子网网段范围的IP网段，此IP网段内的IP不会被子网内的实例占用。用户可以通过创建子网预留网段来预留某个IP网段，用于后续的特殊场景使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVirsubnetCidrReservationRequest 请求对象
     * @return SyncInvoker<CreateVirsubnetCidrReservationRequest, CreateVirsubnetCidrReservationResponse>
     */
    public SyncInvoker<CreateVirsubnetCidrReservationRequest, CreateVirsubnetCidrReservationResponse> createVirsubnetCidrReservationInvoker(
        CreateVirsubnetCidrReservationRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createVirsubnetCidrReservation, hcClient);
    }

    /**
     * 删除端口资源标签
     *
     * 删除指定端口的标签信息。
     * 该接口为幂等接口：删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePortTagRequest 请求对象
     * @return DeletePortTagResponse
     */
    public DeletePortTagResponse deletePortTag(DeletePortTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePortTag);
    }

    /**
     * 删除端口资源标签
     *
     * 删除指定端口的标签信息。
     * 该接口为幂等接口：删除的key不存在报404，key不能为空或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePortTagRequest 请求对象
     * @return SyncInvoker<DeletePortTagRequest, DeletePortTagResponse>
     */
    public SyncInvoker<DeletePortTagRequest, DeletePortTagResponse> deletePortTagInvoker(DeletePortTagRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deletePortTag, hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRequest 请求对象
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupInvoker(
        DeleteSecurityGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRuleRequest 请求对象
     * @return DeleteSecurityGroupRuleResponse
     */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除辅助弹性网卡
     *
     * 删除辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubNetworkInterfaceRequest 请求对象
     * @return DeleteSubNetworkInterfaceResponse
     */
    public DeleteSubNetworkInterfaceResponse deleteSubNetworkInterface(DeleteSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    /**
     * 删除辅助弹性网卡
     *
     * 删除辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse>
     */
    public SyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceInvoker(
        DeleteSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteSubNetworkInterface, hcClient);
    }

    /**
     * 删除流量镜像筛选条件
     *
     * 删除流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRequest 请求对象
     * @return DeleteTrafficMirrorFilterResponse
     */
    public DeleteTrafficMirrorFilterResponse deleteTrafficMirrorFilter(DeleteTrafficMirrorFilterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteTrafficMirrorFilter);
    }

    /**
     * 删除流量镜像筛选条件
     *
     * 删除流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRequest 请求对象
     * @return SyncInvoker<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse>
     */
    public SyncInvoker<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilterInvoker(
        DeleteTrafficMirrorFilterRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteTrafficMirrorFilter, hcClient);
    }

    /**
     * 删除流量镜像筛选规则
     *
     * 删除流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRuleRequest 请求对象
     * @return DeleteTrafficMirrorFilterRuleResponse
     */
    public DeleteTrafficMirrorFilterRuleResponse deleteTrafficMirrorFilterRule(
        DeleteTrafficMirrorFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteTrafficMirrorFilterRule);
    }

    /**
     * 删除流量镜像筛选规则
     *
     * 删除流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRuleRequest 请求对象
     * @return SyncInvoker<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse>
     */
    public SyncInvoker<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse> deleteTrafficMirrorFilterRuleInvoker(
        DeleteTrafficMirrorFilterRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 删除流量镜像会话
     *
     * 删除流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorSessionRequest 请求对象
     * @return DeleteTrafficMirrorSessionResponse
     */
    public DeleteTrafficMirrorSessionResponse deleteTrafficMirrorSession(DeleteTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteTrafficMirrorSession);
    }

    /**
     * 删除流量镜像会话
     *
     * 删除流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse>
     */
    public SyncInvoker<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSessionInvoker(
        DeleteTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteTrafficMirrorSession, hcClient);
    }

    /**
     * 删除子网预留网段
     *
     * 当您已创建的子网预留网段不再使用时，您可以通过调用该接口删除子网预留网段资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirsubnetCidrReservationRequest 请求对象
     * @return DeleteVirsubnetCidrReservationResponse
     */
    public DeleteVirsubnetCidrReservationResponse deleteVirsubnetCidrReservation(
        DeleteVirsubnetCidrReservationRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVirsubnetCidrReservation);
    }

    /**
     * 删除子网预留网段
     *
     * 当您已创建的子网预留网段不再使用时，您可以通过调用该接口删除子网预留网段资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVirsubnetCidrReservationRequest 请求对象
     * @return SyncInvoker<DeleteVirsubnetCidrReservationRequest, DeleteVirsubnetCidrReservationResponse>
     */
    public SyncInvoker<DeleteVirsubnetCidrReservationRequest, DeleteVirsubnetCidrReservationResponse> deleteVirsubnetCidrReservationInvoker(
        DeleteVirsubnetCidrReservationRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteVirsubnetCidrReservation, hcClient);
    }

    /**
     * 查询端口项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortTagsRequest 请求对象
     * @return ListPortTagsResponse
     */
    public ListPortTagsResponse listPortTags(ListPortTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPortTags);
    }

    /**
     * 查询端口项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortTagsRequest 请求对象
     * @return SyncInvoker<ListPortTagsRequest, ListPortTagsResponse>
     */
    public SyncInvoker<ListPortTagsRequest, ListPortTagsResponse> listPortTagsInvoker(ListPortTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listPortTags, hcClient);
    }

    /**
     * 查询端口列表
     *
     * 当您的端口创建成功后，您可以通过调用该接口查询所有端口信息，包括端口ID、IP地址、所属云服务实例等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return ListPortsResponse
     */
    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPorts);
    }

    /**
     * 查询端口列表
     *
     * 当您的端口创建成功后，您可以通过调用该接口查询所有端口信息，包括端口ID、IP地址、所属云服务实例等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsRequest 请求对象
     * @return SyncInvoker<ListPortsRequest, ListPortsResponse>
     */
    public SyncInvoker<ListPortsRequest, ListPortsResponse> listPortsInvoker(ListPortsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listPorts, hcClient);
    }

    /**
     * 查询端口资源实例列表
     *
     * 使用标签过滤查询端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsByTagsRequest 请求对象
     * @return ListPortsByTagsResponse
     */
    public ListPortsByTagsResponse listPortsByTags(ListPortsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPortsByTags);
    }

    /**
     * 查询端口资源实例列表
     *
     * 使用标签过滤查询端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsByTagsRequest 请求对象
     * @return SyncInvoker<ListPortsByTagsRequest, ListPortsByTagsResponse>
     */
    public SyncInvoker<ListPortsByTagsRequest, ListPortsByTagsResponse> listPortsByTagsInvoker(
        ListPortsByTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listPortsByTags, hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupRulesRequest 请求对象
     * @return ListSecurityGroupRulesResponse
     */
    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupRulesRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesInvoker(
        ListSecurityGroupRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询某租户下的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询某租户下的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(
        ListSecurityGroupsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     *
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubNetworkInterfacesRequest 请求对象
     * @return ListSubNetworkInterfacesResponse
     */
    public ListSubNetworkInterfacesResponse listSubNetworkInterfaces(ListSubNetworkInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     *
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubNetworkInterfacesRequest 请求对象
     * @return SyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse>
     */
    public SyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfacesInvoker(
        ListSubNetworkInterfacesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listSubNetworkInterfaces, hcClient);
    }

    /**
     * 查询流量镜像筛选规则列表
     *
     * 查询流量镜像筛选规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFilterRulesRequest 请求对象
     * @return ListTrafficMirrorFilterRulesResponse
     */
    public ListTrafficMirrorFilterRulesResponse listTrafficMirrorFilterRules(
        ListTrafficMirrorFilterRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listTrafficMirrorFilterRules);
    }

    /**
     * 查询流量镜像筛选规则列表
     *
     * 查询流量镜像筛选规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFilterRulesRequest 请求对象
     * @return SyncInvoker<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse>
     */
    public SyncInvoker<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse> listTrafficMirrorFilterRulesInvoker(
        ListTrafficMirrorFilterRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listTrafficMirrorFilterRules, hcClient);
    }

    /**
     * 查询流量镜像筛选条件列表
     *
     * 查询流量镜像筛选条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFiltersRequest 请求对象
     * @return ListTrafficMirrorFiltersResponse
     */
    public ListTrafficMirrorFiltersResponse listTrafficMirrorFilters(ListTrafficMirrorFiltersRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listTrafficMirrorFilters);
    }

    /**
     * 查询流量镜像筛选条件列表
     *
     * 查询流量镜像筛选条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFiltersRequest 请求对象
     * @return SyncInvoker<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse>
     */
    public SyncInvoker<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse> listTrafficMirrorFiltersInvoker(
        ListTrafficMirrorFiltersRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listTrafficMirrorFilters, hcClient);
    }

    /**
     * 查询流量镜像会话列表
     *
     * 查询流量镜像会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorSessionsRequest 请求对象
     * @return ListTrafficMirrorSessionsResponse
     */
    public ListTrafficMirrorSessionsResponse listTrafficMirrorSessions(ListTrafficMirrorSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listTrafficMirrorSessions);
    }

    /**
     * 查询流量镜像会话列表
     *
     * 查询流量镜像会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorSessionsRequest 请求对象
     * @return SyncInvoker<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse>
     */
    public SyncInvoker<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse> listTrafficMirrorSessionsInvoker(
        ListTrafficMirrorSessionsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listTrafficMirrorSessions, hcClient);
    }

    /**
     * 查询子网预留网段列表
     *
     * 当您的子网预留网段创建成功后，您可以通过调用该接口查询所有子网预留网段信息，包括子网预留网段名称、IP网段等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirsubnetCidrReservationsRequest 请求对象
     * @return ListVirsubnetCidrReservationsResponse
     */
    public ListVirsubnetCidrReservationsResponse listVirsubnetCidrReservations(
        ListVirsubnetCidrReservationsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVirsubnetCidrReservations);
    }

    /**
     * 查询子网预留网段列表
     *
     * 当您的子网预留网段创建成功后，您可以通过调用该接口查询所有子网预留网段信息，包括子网预留网段名称、IP网段等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirsubnetCidrReservationsRequest 请求对象
     * @return SyncInvoker<ListVirsubnetCidrReservationsRequest, ListVirsubnetCidrReservationsResponse>
     */
    public SyncInvoker<ListVirsubnetCidrReservationsRequest, ListVirsubnetCidrReservationsResponse> listVirsubnetCidrReservationsInvoker(
        ListVirsubnetCidrReservationsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listVirsubnetCidrReservations, hcClient);
    }

    /**
     * 查询虚拟子网列表
     *
     * 当您的子网创建成功后，您可以通过调用该接口查询所有子网信息，包括子网的名称、ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirsubnetsRequest 请求对象
     * @return ListVirsubnetsResponse
     */
    public ListVirsubnetsResponse listVirsubnets(ListVirsubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVirsubnets);
    }

    /**
     * 查询虚拟子网列表
     *
     * 当您的子网创建成功后，您可以通过调用该接口查询所有子网信息，包括子网的名称、ID等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVirsubnetsRequest 请求对象
     * @return SyncInvoker<ListVirsubnetsRequest, ListVirsubnetsResponse>
     */
    public SyncInvoker<ListVirsubnetsRequest, ListVirsubnetsResponse> listVirsubnetsInvoker(
        ListVirsubnetsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listVirsubnets, hcClient);
    }

    /**
     * 迁移辅助弹性网卡
     *
     * 批量迁移辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateSubNetworkInterfaceRequest 请求对象
     * @return MigrateSubNetworkInterfaceResponse
     */
    public MigrateSubNetworkInterfaceResponse migrateSubNetworkInterface(MigrateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.migrateSubNetworkInterface);
    }

    /**
     * 迁移辅助弹性网卡
     *
     * 批量迁移辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse>
     */
    public SyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterfaceInvoker(
        MigrateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.migrateSubNetworkInterface, hcClient);
    }

    /**
     * 端口移除安全组
     *
     * 端口移除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSecurityGroupsRequest 请求对象
     * @return RemoveSecurityGroupsResponse
     */
    public RemoveSecurityGroupsResponse removeSecurityGroups(RemoveSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.removeSecurityGroups);
    }

    /**
     * 端口移除安全组
     *
     * 端口移除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSecurityGroupsRequest 请求对象
     * @return SyncInvoker<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse>
     */
    public SyncInvoker<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse> removeSecurityGroupsInvoker(
        RemoveSecurityGroupsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.removeSecurityGroups, hcClient);
    }

    /**
     * 流量镜像会话移除镜像源
     *
     * 流量镜像会话移除镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSourcesFromTrafficMirrorSessionRequest 请求对象
     * @return RemoveSourcesFromTrafficMirrorSessionResponse
     */
    public RemoveSourcesFromTrafficMirrorSessionResponse removeSourcesFromTrafficMirrorSession(
        RemoveSourcesFromTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.removeSourcesFromTrafficMirrorSession);
    }

    /**
     * 流量镜像会话移除镜像源
     *
     * 流量镜像会话移除镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSourcesFromTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse>
     */
    public SyncInvoker<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSessionInvoker(
        RemoveSourcesFromTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.removeSourcesFromTrafficMirrorSession, hcClient);
    }

    /**
     * 查询端口详情
     *
     * 当您的端口创建成功后，您可以通过调用该接口查询单个端口的详细信息，包括端口ID、IP地址、所属云服务实例等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortRequest 请求对象
     * @return ShowPortResponse
     */
    public ShowPortResponse showPort(ShowPortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPort);
    }

    /**
     * 查询端口详情
     *
     * 当您的端口创建成功后，您可以通过调用该接口查询单个端口的详细信息，包括端口ID、IP地址、所属云服务实例等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortRequest 请求对象
     * @return SyncInvoker<ShowPortRequest, ShowPortResponse>
     */
    public SyncInvoker<ShowPortRequest, ShowPortResponse> showPortInvoker(ShowPortRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showPort, hcClient);
    }

    /**
     * 查询端口资源标签
     *
     * 查询指定端口的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortTagsRequest 请求对象
     * @return ShowPortTagsResponse
     */
    public ShowPortTagsResponse showPortTags(ShowPortTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPortTags);
    }

    /**
     * 查询端口资源标签
     *
     * 查询指定端口的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortTagsRequest 请求对象
     * @return SyncInvoker<ShowPortTagsRequest, ShowPortTagsResponse>
     */
    public SyncInvoker<ShowPortTagsRequest, ShowPortTagsResponse> showPortTagsInvoker(ShowPortTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showPortTags, hcClient);
    }

    /**
     * 查询配额
     *
     * 您可以通过此接口查询VPC服务相关资源的配额，包括安全组配额、安全组规则配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showQuota);
    }

    /**
     * 查询配额
     *
     * 您可以通过此接口查询VPC服务相关资源的配额，包括安全组配额、安全组规则配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showQuota, hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRequest 请求对象
     * @return ShowSecurityGroupResponse
     */
    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupInvoker(
        ShowSecurityGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showSecurityGroup, hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRuleRequest 请求对象
     * @return ShowSecurityGroupRuleResponse
     */
    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRuleRequest 请求对象
     * @return SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡
     *
     * 查询辅助弹性网卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfaceRequest 请求对象
     * @return ShowSubNetworkInterfaceResponse
     */
    public ShowSubNetworkInterfaceResponse showSubNetworkInterface(ShowSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    /**
     * 查询租户下辅助弹性网卡
     *
     * 查询辅助弹性网卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse>
     */
    public SyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceInvoker(
        ShowSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showSubNetworkInterface, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     *
     * 查询辅助弹性网卡数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return ShowSubNetworkInterfacesQuantityResponse
     */
    public ShowSubNetworkInterfacesQuantityResponse showSubNetworkInterfacesQuantity(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     *
     * 查询辅助弹性网卡数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return SyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse>
     */
    public SyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityInvoker(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showSubNetworkInterfacesQuantity, hcClient);
    }

    /**
     * 查询流量镜像筛选条件详情
     *
     * 查询流量镜像筛选条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRequest 请求对象
     * @return ShowTrafficMirrorFilterResponse
     */
    public ShowTrafficMirrorFilterResponse showTrafficMirrorFilter(ShowTrafficMirrorFilterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showTrafficMirrorFilter);
    }

    /**
     * 查询流量镜像筛选条件详情
     *
     * 查询流量镜像筛选条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRequest 请求对象
     * @return SyncInvoker<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse>
     */
    public SyncInvoker<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse> showTrafficMirrorFilterInvoker(
        ShowTrafficMirrorFilterRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showTrafficMirrorFilter, hcClient);
    }

    /**
     * 查询流量镜像筛选规则详情
     *
     * 查询流量镜像筛选规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRuleRequest 请求对象
     * @return ShowTrafficMirrorFilterRuleResponse
     */
    public ShowTrafficMirrorFilterRuleResponse showTrafficMirrorFilterRule(ShowTrafficMirrorFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showTrafficMirrorFilterRule);
    }

    /**
     * 查询流量镜像筛选规则详情
     *
     * 查询流量镜像筛选规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRuleRequest 请求对象
     * @return SyncInvoker<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse>
     */
    public SyncInvoker<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse> showTrafficMirrorFilterRuleInvoker(
        ShowTrafficMirrorFilterRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 查询流量镜像会话详情
     *
     * 查询流量镜像会话详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorSessionRequest 请求对象
     * @return ShowTrafficMirrorSessionResponse
     */
    public ShowTrafficMirrorSessionResponse showTrafficMirrorSession(ShowTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showTrafficMirrorSession);
    }

    /**
     * 查询流量镜像会话详情
     *
     * 查询流量镜像会话详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse>
     */
    public SyncInvoker<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse> showTrafficMirrorSessionInvoker(
        ShowTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showTrafficMirrorSession, hcClient);
    }

    /**
     * 查询虚拟子网详情
     *
     * 当您的子网创建成功后，您可以通过调用该接口查询单个子网的详细信息，包括子网的名称、ID、状态等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirsubnetRequest 请求对象
     * @return ShowVirsubnetResponse
     */
    public ShowVirsubnetResponse showVirsubnet(ShowVirsubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVirsubnet);
    }

    /**
     * 查询虚拟子网详情
     *
     * 当您的子网创建成功后，您可以通过调用该接口查询单个子网的详细信息，包括子网的名称、ID、状态等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirsubnetRequest 请求对象
     * @return SyncInvoker<ShowVirsubnetRequest, ShowVirsubnetResponse>
     */
    public SyncInvoker<ShowVirsubnetRequest, ShowVirsubnetResponse> showVirsubnetInvoker(ShowVirsubnetRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showVirsubnet, hcClient);
    }

    /**
     * 查询子网预留网段
     *
     * 当您的子网预留网段创建成功后，您可以通过调用该接口查询单个子网预留网段的详细信息，包括子网预留网段的名称、IP网段等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirsubnetCidrReservationRequest 请求对象
     * @return ShowVirsubnetCidrReservationResponse
     */
    public ShowVirsubnetCidrReservationResponse showVirsubnetCidrReservation(
        ShowVirsubnetCidrReservationRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVirsubnetCidrReservation);
    }

    /**
     * 查询子网预留网段
     *
     * 当您的子网预留网段创建成功后，您可以通过调用该接口查询单个子网预留网段的详细信息，包括子网预留网段的名称、IP网段等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVirsubnetCidrReservationRequest 请求对象
     * @return SyncInvoker<ShowVirsubnetCidrReservationRequest, ShowVirsubnetCidrReservationResponse>
     */
    public SyncInvoker<ShowVirsubnetCidrReservationRequest, ShowVirsubnetCidrReservationResponse> showVirsubnetCidrReservationInvoker(
        ShowVirsubnetCidrReservationRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showVirsubnetCidrReservation, hcClient);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return UpdateSecurityGroupResponse
     */
    public UpdateSecurityGroupResponse updateSecurityGroup(UpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSecurityGroup);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupInvoker(
        UpdateSecurityGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 更新辅助弹性网卡
     *
     * 更新辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubNetworkInterfaceRequest 请求对象
     * @return UpdateSubNetworkInterfaceResponse
     */
    public UpdateSubNetworkInterfaceResponse updateSubNetworkInterface(UpdateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

    /**
     * 更新辅助弹性网卡
     *
     * 更新辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubNetworkInterfaceRequest 请求对象
     * @return SyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse>
     */
    public SyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceInvoker(
        UpdateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateSubNetworkInterface, hcClient);
    }

    /**
     * 更新流量镜像筛选条件
     *
     * 更新流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRequest 请求对象
     * @return UpdateTrafficMirrorFilterResponse
     */
    public UpdateTrafficMirrorFilterResponse updateTrafficMirrorFilter(UpdateTrafficMirrorFilterRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateTrafficMirrorFilter);
    }

    /**
     * 更新流量镜像筛选条件
     *
     * 更新流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRequest 请求对象
     * @return SyncInvoker<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse>
     */
    public SyncInvoker<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse> updateTrafficMirrorFilterInvoker(
        UpdateTrafficMirrorFilterRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateTrafficMirrorFilter, hcClient);
    }

    /**
     * 更新流量镜像筛选规则
     *
     * 更新流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRuleRequest 请求对象
     * @return UpdateTrafficMirrorFilterRuleResponse
     */
    public UpdateTrafficMirrorFilterRuleResponse updateTrafficMirrorFilterRule(
        UpdateTrafficMirrorFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateTrafficMirrorFilterRule);
    }

    /**
     * 更新流量镜像筛选规则
     *
     * 更新流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRuleRequest 请求对象
     * @return SyncInvoker<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse>
     */
    public SyncInvoker<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse> updateTrafficMirrorFilterRuleInvoker(
        UpdateTrafficMirrorFilterRuleRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 更新流量镜像会话
     *
     * 更新流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorSessionRequest 请求对象
     * @return UpdateTrafficMirrorSessionResponse
     */
    public UpdateTrafficMirrorSessionResponse updateTrafficMirrorSession(UpdateTrafficMirrorSessionRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateTrafficMirrorSession);
    }

    /**
     * 更新流量镜像会话
     *
     * 更新流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorSessionRequest 请求对象
     * @return SyncInvoker<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse>
     */
    public SyncInvoker<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse> updateTrafficMirrorSessionInvoker(
        UpdateTrafficMirrorSessionRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateTrafficMirrorSession, hcClient);
    }

    /**
     * 更新子网预留网段
     *
     * 当您的子网预留网段创建成功后，您可以通过调用该接口更新子网预留网段的基本信息，包括子网预留网段的名称、描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirsubnetCidrReservationRequest 请求对象
     * @return UpdateVirsubnetCidrReservationResponse
     */
    public UpdateVirsubnetCidrReservationResponse updateVirsubnetCidrReservation(
        UpdateVirsubnetCidrReservationRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVirsubnetCidrReservation);
    }

    /**
     * 更新子网预留网段
     *
     * 当您的子网预留网段创建成功后，您可以通过调用该接口更新子网预留网段的基本信息，包括子网预留网段的名称、描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVirsubnetCidrReservationRequest 请求对象
     * @return SyncInvoker<UpdateVirsubnetCidrReservationRequest, UpdateVirsubnetCidrReservationResponse>
     */
    public SyncInvoker<UpdateVirsubnetCidrReservationRequest, UpdateVirsubnetCidrReservationResponse> updateVirsubnetCidrReservationInvoker(
        UpdateVirsubnetCidrReservationRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateVirsubnetCidrReservation, hcClient);
    }

    /**
     * 网络ACL插入规则
     *
     * 网络ACL插入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFirewallRulesRequest 请求对象
     * @return AddFirewallRulesResponse
     */
    public AddFirewallRulesResponse addFirewallRules(AddFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addFirewallRules);
    }

    /**
     * 网络ACL插入规则
     *
     * 网络ACL插入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFirewallRulesRequest 请求对象
     * @return SyncInvoker<AddFirewallRulesRequest, AddFirewallRulesResponse>
     */
    public SyncInvoker<AddFirewallRulesRequest, AddFirewallRulesResponse> addFirewallRulesInvoker(
        AddFirewallRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.addFirewallRules, hcClient);
    }

    /**
     * 网络ACL绑定子网
     *
     * 网络ACL绑定子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSubnetFirewallRequest 请求对象
     * @return AssociateSubnetFirewallResponse
     */
    public AssociateSubnetFirewallResponse associateSubnetFirewall(AssociateSubnetFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.associateSubnetFirewall);
    }

    /**
     * 网络ACL绑定子网
     *
     * 网络ACL绑定子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSubnetFirewallRequest 请求对象
     * @return SyncInvoker<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse>
     */
    public SyncInvoker<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse> associateSubnetFirewallInvoker(
        AssociateSubnetFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.associateSubnetFirewall, hcClient);
    }

    /**
     * 批量添加ACL资源标签
     *
     * 为指定的网络ACL资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateFirewallTagsRequest 请求对象
     * @return BatchCreateFirewallTagsResponse
     */
    public BatchCreateFirewallTagsResponse batchCreateFirewallTags(BatchCreateFirewallTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateFirewallTags);
    }

    /**
     * 批量添加ACL资源标签
     *
     * 为指定的网络ACL资源实例批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateFirewallTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateFirewallTagsRequest, BatchCreateFirewallTagsResponse>
     */
    public SyncInvoker<BatchCreateFirewallTagsRequest, BatchCreateFirewallTagsResponse> batchCreateFirewallTagsInvoker(
        BatchCreateFirewallTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchCreateFirewallTags, hcClient);
    }

    /**
     * 批量删除ACL资源标签
     *
     * 为指定的网络ACL资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFirewallTagsRequest 请求对象
     * @return BatchDeleteFirewallTagsResponse
     */
    public BatchDeleteFirewallTagsResponse batchDeleteFirewallTags(BatchDeleteFirewallTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchDeleteFirewallTags);
    }

    /**
     * 批量删除ACL资源标签
     *
     * 为指定的网络ACL资源实例批量删除标签。
     * 此接口为幂等接口：删除时，如果删除的标签不存在，默认处理成功；删除时不对标签字符集范围做校验。删除时tags结构体不能缺失，key不能为空，或者空字符串。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFirewallTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteFirewallTagsRequest, BatchDeleteFirewallTagsResponse>
     */
    public SyncInvoker<BatchDeleteFirewallTagsRequest, BatchDeleteFirewallTagsResponse> batchDeleteFirewallTagsInvoker(
        BatchDeleteFirewallTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchDeleteFirewallTags, hcClient);
    }

    /**
     * 查询ACL资源实例数量
     *
     * 使用标签过滤查询ACL实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountFirewallsByTagsRequest 请求对象
     * @return CountFirewallsByTagsResponse
     */
    public CountFirewallsByTagsResponse countFirewallsByTags(CountFirewallsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.countFirewallsByTags);
    }

    /**
     * 查询ACL资源实例数量
     *
     * 使用标签过滤查询ACL实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountFirewallsByTagsRequest 请求对象
     * @return SyncInvoker<CountFirewallsByTagsRequest, CountFirewallsByTagsResponse>
     */
    public SyncInvoker<CountFirewallsByTagsRequest, CountFirewallsByTagsResponse> countFirewallsByTagsInvoker(
        CountFirewallsByTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.countFirewallsByTags, hcClient);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return CreateFirewallResponse
     */
    public CreateFirewallResponse createFirewall(CreateFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createFirewall);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return SyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public SyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallInvoker(
        CreateFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createFirewall, hcClient);
    }

    /**
     * 添加ACL资源标签
     *
     * 给指定IP地址组资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallTagRequest 请求对象
     * @return CreateFirewallTagResponse
     */
    public CreateFirewallTagResponse createFirewallTag(CreateFirewallTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createFirewallTag);
    }

    /**
     * 添加ACL资源标签
     *
     * 给指定IP地址组资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallTagRequest 请求对象
     * @return SyncInvoker<CreateFirewallTagRequest, CreateFirewallTagResponse>
     */
    public SyncInvoker<CreateFirewallTagRequest, CreateFirewallTagResponse> createFirewallTagInvoker(
        CreateFirewallTagRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createFirewallTag, hcClient);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return DeleteFirewallResponse
     */
    public DeleteFirewallResponse deleteFirewall(DeleteFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteFirewall);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public SyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallInvoker(
        DeleteFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteFirewall, hcClient);
    }

    /**
     * 删除ACL资源标签
     *
     * 删除指定IP地址组资源实例的标签信息
     * 该接口为幂等接口：删除的key不存在报404，key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallTagRequest 请求对象
     * @return DeleteFirewallTagResponse
     */
    public DeleteFirewallTagResponse deleteFirewallTag(DeleteFirewallTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteFirewallTag);
    }

    /**
     * 删除ACL资源标签
     *
     * 删除指定IP地址组资源实例的标签信息
     * 该接口为幂等接口：删除的key不存在报404，key不能为空或者空字符串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallTagRequest 请求对象
     * @return SyncInvoker<DeleteFirewallTagRequest, DeleteFirewallTagResponse>
     */
    public SyncInvoker<DeleteFirewallTagRequest, DeleteFirewallTagResponse> deleteFirewallTagInvoker(
        DeleteFirewallTagRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteFirewallTag, hcClient);
    }

    /**
     * 网络ACL解绑子网
     *
     * 网络ACL解绑子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSubnetFirewallRequest 请求对象
     * @return DisassociateSubnetFirewallResponse
     */
    public DisassociateSubnetFirewallResponse disassociateSubnetFirewall(DisassociateSubnetFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.disassociateSubnetFirewall);
    }

    /**
     * 网络ACL解绑子网
     *
     * 网络ACL解绑子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSubnetFirewallRequest 请求对象
     * @return SyncInvoker<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse>
     */
    public SyncInvoker<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse> disassociateSubnetFirewallInvoker(
        DisassociateSubnetFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.disassociateSubnetFirewall, hcClient);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallRequest 请求对象
     * @return ListFirewallResponse
     */
    public ListFirewallResponse listFirewall(ListFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listFirewall);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallRequest 请求对象
     * @return SyncInvoker<ListFirewallRequest, ListFirewallResponse>
     */
    public SyncInvoker<ListFirewallRequest, ListFirewallResponse> listFirewallInvoker(ListFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listFirewall, hcClient);
    }

    /**
     * 查询ACL项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallTagsRequest 请求对象
     * @return ListFirewallTagsResponse
     */
    public ListFirewallTagsResponse listFirewallTags(ListFirewallTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listFirewallTags);
    }

    /**
     * 查询ACL项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallTagsRequest 请求对象
     * @return SyncInvoker<ListFirewallTagsRequest, ListFirewallTagsResponse>
     */
    public SyncInvoker<ListFirewallTagsRequest, ListFirewallTagsResponse> listFirewallTagsInvoker(
        ListFirewallTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listFirewallTags, hcClient);
    }

    /**
     * 查询ACL资源实例列表
     *
     * 使用标签过滤查询ACL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallsByTagsRequest 请求对象
     * @return ListFirewallsByTagsResponse
     */
    public ListFirewallsByTagsResponse listFirewallsByTags(ListFirewallsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listFirewallsByTags);
    }

    /**
     * 查询ACL资源实例列表
     *
     * 使用标签过滤查询ACL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallsByTagsRequest 请求对象
     * @return SyncInvoker<ListFirewallsByTagsRequest, ListFirewallsByTagsResponse>
     */
    public SyncInvoker<ListFirewallsByTagsRequest, ListFirewallsByTagsResponse> listFirewallsByTagsInvoker(
        ListFirewallsByTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listFirewallsByTags, hcClient);
    }

    /**
     * 网络ACL移除规则
     *
     * 网络ACL移除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFirewallRulesRequest 请求对象
     * @return RemoveFirewallRulesResponse
     */
    public RemoveFirewallRulesResponse removeFirewallRules(RemoveFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.removeFirewallRules);
    }

    /**
     * 网络ACL移除规则
     *
     * 网络ACL移除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFirewallRulesRequest 请求对象
     * @return SyncInvoker<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse>
     */
    public SyncInvoker<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse> removeFirewallRulesInvoker(
        RemoveFirewallRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.removeFirewallRules, hcClient);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallRequest 请求对象
     * @return ShowFirewallResponse
     */
    public ShowFirewallResponse showFirewall(ShowFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showFirewall);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallRequest 请求对象
     * @return SyncInvoker<ShowFirewallRequest, ShowFirewallResponse>
     */
    public SyncInvoker<ShowFirewallRequest, ShowFirewallResponse> showFirewallInvoker(ShowFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showFirewall, hcClient);
    }

    /**
     * 查询ACL资源标签
     *
     * 查询指定ACL实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallTagsRequest 请求对象
     * @return ShowFirewallTagsResponse
     */
    public ShowFirewallTagsResponse showFirewallTags(ShowFirewallTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showFirewallTags);
    }

    /**
     * 查询ACL资源标签
     *
     * 查询指定ACL实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallTagsRequest 请求对象
     * @return SyncInvoker<ShowFirewallTagsRequest, ShowFirewallTagsResponse>
     */
    public SyncInvoker<ShowFirewallTagsRequest, ShowFirewallTagsResponse> showFirewallTagsInvoker(
        ShowFirewallTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showFirewallTags, hcClient);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRequest 请求对象
     * @return UpdateFirewallResponse
     */
    public UpdateFirewallResponse updateFirewall(UpdateFirewallRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateFirewall);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRequest 请求对象
     * @return SyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>
     */
    public SyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewallInvoker(
        UpdateFirewallRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateFirewall, hcClient);
    }

    /**
     * 网络ACL更新规则
     *
     * 网络ACL更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRulesRequest 请求对象
     * @return UpdateFirewallRulesResponse
     */
    public UpdateFirewallRulesResponse updateFirewallRules(UpdateFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateFirewallRules);
    }

    /**
     * 网络ACL更新规则
     *
     * 网络ACL更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRulesRequest 请求对象
     * @return SyncInvoker<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse>
     */
    public SyncInvoker<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse> updateFirewallRulesInvoker(
        UpdateFirewallRulesRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateFirewallRules, hcClient);
    }

    /**
     * 添加Clouddcn子网标签
     *
     * 添加Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddClouddcnSubnetsTagsRequest 请求对象
     * @return AddClouddcnSubnetsTagsResponse
     */
    public AddClouddcnSubnetsTagsResponse addClouddcnSubnetsTags(AddClouddcnSubnetsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addClouddcnSubnetsTags);
    }

    /**
     * 添加Clouddcn子网标签
     *
     * 添加Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddClouddcnSubnetsTagsRequest 请求对象
     * @return SyncInvoker<AddClouddcnSubnetsTagsRequest, AddClouddcnSubnetsTagsResponse>
     */
    public SyncInvoker<AddClouddcnSubnetsTagsRequest, AddClouddcnSubnetsTagsResponse> addClouddcnSubnetsTagsInvoker(
        AddClouddcnSubnetsTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.addClouddcnSubnetsTags, hcClient);
    }

    /**
     * 批量添加Clouddcn子网标签
     *
     * 批量添加Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateClouddcnSubnetsTagsRequest 请求对象
     * @return BatchCreateClouddcnSubnetsTagsResponse
     */
    public BatchCreateClouddcnSubnetsTagsResponse batchCreateClouddcnSubnetsTags(
        BatchCreateClouddcnSubnetsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateClouddcnSubnetsTags);
    }

    /**
     * 批量添加Clouddcn子网标签
     *
     * 批量添加Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateClouddcnSubnetsTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateClouddcnSubnetsTagsRequest, BatchCreateClouddcnSubnetsTagsResponse>
     */
    public SyncInvoker<BatchCreateClouddcnSubnetsTagsRequest, BatchCreateClouddcnSubnetsTagsResponse> batchCreateClouddcnSubnetsTagsInvoker(
        BatchCreateClouddcnSubnetsTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchCreateClouddcnSubnetsTags, hcClient);
    }

    /**
     * 批量删除Clouddcn子网标签
     *
     * 批量删除Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteClouddcnSubnetsTagsRequest 请求对象
     * @return BatchDeleteClouddcnSubnetsTagsResponse
     */
    public BatchDeleteClouddcnSubnetsTagsResponse batchDeleteClouddcnSubnetsTags(
        BatchDeleteClouddcnSubnetsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchDeleteClouddcnSubnetsTags);
    }

    /**
     * 批量删除Clouddcn子网标签
     *
     * 批量删除Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteClouddcnSubnetsTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteClouddcnSubnetsTagsRequest, BatchDeleteClouddcnSubnetsTagsResponse>
     */
    public SyncInvoker<BatchDeleteClouddcnSubnetsTagsRequest, BatchDeleteClouddcnSubnetsTagsResponse> batchDeleteClouddcnSubnetsTagsInvoker(
        BatchDeleteClouddcnSubnetsTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.batchDeleteClouddcnSubnetsTags, hcClient);
    }

    /**
     * 创建clouddcn子网
     *
     * 创建clouddcn子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClouddcnSubnetRequest 请求对象
     * @return CreateClouddcnSubnetResponse
     */
    public CreateClouddcnSubnetResponse createClouddcnSubnet(CreateClouddcnSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createClouddcnSubnet);
    }

    /**
     * 创建clouddcn子网
     *
     * 创建clouddcn子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClouddcnSubnetRequest 请求对象
     * @return SyncInvoker<CreateClouddcnSubnetRequest, CreateClouddcnSubnetResponse>
     */
    public SyncInvoker<CreateClouddcnSubnetRequest, CreateClouddcnSubnetResponse> createClouddcnSubnetInvoker(
        CreateClouddcnSubnetRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createClouddcnSubnet, hcClient);
    }

    /**
     * 删除clouddcn子网
     *
     * 删除clouddcn子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClouddcnSubnetRequest 请求对象
     * @return DeleteClouddcnSubnetResponse
     */
    public DeleteClouddcnSubnetResponse deleteClouddcnSubnet(DeleteClouddcnSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteClouddcnSubnet);
    }

    /**
     * 删除clouddcn子网
     *
     * 删除clouddcn子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClouddcnSubnetRequest 请求对象
     * @return SyncInvoker<DeleteClouddcnSubnetRequest, DeleteClouddcnSubnetResponse>
     */
    public SyncInvoker<DeleteClouddcnSubnetRequest, DeleteClouddcnSubnetResponse> deleteClouddcnSubnetInvoker(
        DeleteClouddcnSubnetRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteClouddcnSubnet, hcClient);
    }

    /**
     * 删除Clouddcn子网标签
     *
     * 删除Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClouddcnSubnetsTagRequest 请求对象
     * @return DeleteClouddcnSubnetsTagResponse
     */
    public DeleteClouddcnSubnetsTagResponse deleteClouddcnSubnetsTag(DeleteClouddcnSubnetsTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteClouddcnSubnetsTag);
    }

    /**
     * 删除Clouddcn子网标签
     *
     * 删除Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClouddcnSubnetsTagRequest 请求对象
     * @return SyncInvoker<DeleteClouddcnSubnetsTagRequest, DeleteClouddcnSubnetsTagResponse>
     */
    public SyncInvoker<DeleteClouddcnSubnetsTagRequest, DeleteClouddcnSubnetsTagResponse> deleteClouddcnSubnetsTagInvoker(
        DeleteClouddcnSubnetsTagRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteClouddcnSubnetsTag, hcClient);
    }

    /**
     * 查询clouddcn子网列表
     *
     * 查询clouddcn子网列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsRequest 请求对象
     * @return ListClouddcnSubnetsResponse
     */
    public ListClouddcnSubnetsResponse listClouddcnSubnets(ListClouddcnSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listClouddcnSubnets);
    }

    /**
     * 查询clouddcn子网列表
     *
     * 查询clouddcn子网列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsRequest 请求对象
     * @return SyncInvoker<ListClouddcnSubnetsRequest, ListClouddcnSubnetsResponse>
     */
    public SyncInvoker<ListClouddcnSubnetsRequest, ListClouddcnSubnetsResponse> listClouddcnSubnetsInvoker(
        ListClouddcnSubnetsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listClouddcnSubnets, hcClient);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsCountFilterTagsRequest 请求对象
     * @return ListClouddcnSubnetsCountFilterTagsResponse
     */
    public ListClouddcnSubnetsCountFilterTagsResponse listClouddcnSubnetsCountFilterTags(
        ListClouddcnSubnetsCountFilterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listClouddcnSubnetsCountFilterTags);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsCountFilterTagsRequest 请求对象
     * @return SyncInvoker<ListClouddcnSubnetsCountFilterTagsRequest, ListClouddcnSubnetsCountFilterTagsResponse>
     */
    public SyncInvoker<ListClouddcnSubnetsCountFilterTagsRequest, ListClouddcnSubnetsCountFilterTagsResponse> listClouddcnSubnetsCountFilterTagsInvoker(
        ListClouddcnSubnetsCountFilterTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listClouddcnSubnetsCountFilterTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsFilterTagsRequest 请求对象
     * @return ListClouddcnSubnetsFilterTagsResponse
     */
    public ListClouddcnSubnetsFilterTagsResponse listClouddcnSubnetsFilterTags(
        ListClouddcnSubnetsFilterTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listClouddcnSubnetsFilterTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsFilterTagsRequest 请求对象
     * @return SyncInvoker<ListClouddcnSubnetsFilterTagsRequest, ListClouddcnSubnetsFilterTagsResponse>
     */
    public SyncInvoker<ListClouddcnSubnetsFilterTagsRequest, ListClouddcnSubnetsFilterTagsResponse> listClouddcnSubnetsFilterTagsInvoker(
        ListClouddcnSubnetsFilterTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listClouddcnSubnetsFilterTags, hcClient);
    }

    /**
     * 查询Clouddcn子网项目标签
     *
     * 查询Clouddcn子网的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsTagsRequest 请求对象
     * @return ListClouddcnSubnetsTagsResponse
     */
    public ListClouddcnSubnetsTagsResponse listClouddcnSubnetsTags(ListClouddcnSubnetsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listClouddcnSubnetsTags);
    }

    /**
     * 查询Clouddcn子网项目标签
     *
     * 查询Clouddcn子网的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsTagsRequest 请求对象
     * @return SyncInvoker<ListClouddcnSubnetsTagsRequest, ListClouddcnSubnetsTagsResponse>
     */
    public SyncInvoker<ListClouddcnSubnetsTagsRequest, ListClouddcnSubnetsTagsResponse> listClouddcnSubnetsTagsInvoker(
        ListClouddcnSubnetsTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listClouddcnSubnetsTags, hcClient);
    }

    /**
     * 查询clouddcn子网
     *
     * 查询clouddcn子网详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddcnSubnetRequest 请求对象
     * @return ShowClouddcnSubnetResponse
     */
    public ShowClouddcnSubnetResponse showClouddcnSubnet(ShowClouddcnSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showClouddcnSubnet);
    }

    /**
     * 查询clouddcn子网
     *
     * 查询clouddcn子网详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddcnSubnetRequest 请求对象
     * @return SyncInvoker<ShowClouddcnSubnetRequest, ShowClouddcnSubnetResponse>
     */
    public SyncInvoker<ShowClouddcnSubnetRequest, ShowClouddcnSubnetResponse> showClouddcnSubnetInvoker(
        ShowClouddcnSubnetRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showClouddcnSubnet, hcClient);
    }

    /**
     * 查询Clouddcn子网标签
     *
     * 查询Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddcnSubnetsTagsRequest 请求对象
     * @return ShowClouddcnSubnetsTagsResponse
     */
    public ShowClouddcnSubnetsTagsResponse showClouddcnSubnetsTags(ShowClouddcnSubnetsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showClouddcnSubnetsTags);
    }

    /**
     * 查询Clouddcn子网标签
     *
     * 查询Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddcnSubnetsTagsRequest 请求对象
     * @return SyncInvoker<ShowClouddcnSubnetsTagsRequest, ShowClouddcnSubnetsTagsResponse>
     */
    public SyncInvoker<ShowClouddcnSubnetsTagsRequest, ShowClouddcnSubnetsTagsResponse> showClouddcnSubnetsTagsInvoker(
        ShowClouddcnSubnetsTagsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showClouddcnSubnetsTags, hcClient);
    }

    /**
     * 更新clouddcn子网
     *
     * 更新clouddcn子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClouddcnSubnetRequest 请求对象
     * @return UpdateClouddcnSubnetResponse
     */
    public UpdateClouddcnSubnetResponse updateClouddcnSubnet(UpdateClouddcnSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateClouddcnSubnet);
    }

    /**
     * 更新clouddcn子网
     *
     * 更新clouddcn子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClouddcnSubnetRequest 请求对象
     * @return SyncInvoker<UpdateClouddcnSubnetRequest, UpdateClouddcnSubnetResponse>
     */
    public SyncInvoker<UpdateClouddcnSubnetRequest, UpdateClouddcnSubnetResponse> updateClouddcnSubnetInvoker(
        UpdateClouddcnSubnetRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateClouddcnSubnet, hcClient);
    }

    /**
     * 创建地址组
     *
     * 创建地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAddressGroupRequest 请求对象
     * @return CreateAddressGroupResponse
     */
    public CreateAddressGroupResponse createAddressGroup(CreateAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createAddressGroup);
    }

    /**
     * 创建地址组
     *
     * 创建地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAddressGroupRequest 请求对象
     * @return SyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse>
     */
    public SyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse> createAddressGroupInvoker(
        CreateAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createAddressGroup, hcClient);
    }

    /**
     * 删除地址组
     *
     * 删除地址组，非强制删除，删除前请确保未被其他资源引用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressGroupRequest 请求对象
     * @return DeleteAddressGroupResponse
     */
    public DeleteAddressGroupResponse deleteAddressGroup(DeleteAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteAddressGroup);
    }

    /**
     * 删除地址组
     *
     * 删除地址组，非强制删除，删除前请确保未被其他资源引用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressGroupRequest 请求对象
     * @return SyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse>
     */
    public SyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse> deleteAddressGroupInvoker(
        DeleteAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteAddressGroup, hcClient);
    }

    /**
     * 强制删除地址组
     *
     * 强制删除地址组，删除的地址组与安全组规则关联时，会删除地址组与关联的安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpAddressGroupForceRequest 请求对象
     * @return DeleteIpAddressGroupForceResponse
     */
    public DeleteIpAddressGroupForceResponse deleteIpAddressGroupForce(DeleteIpAddressGroupForceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteIpAddressGroupForce);
    }

    /**
     * 强制删除地址组
     *
     * 强制删除地址组，删除的地址组与安全组规则关联时，会删除地址组与关联的安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpAddressGroupForceRequest 请求对象
     * @return SyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse>
     */
    public SyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForceInvoker(
        DeleteIpAddressGroupForceRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteIpAddressGroupForce, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表，根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressGroupRequest 请求对象
     * @return ListAddressGroupResponse
     */
    public ListAddressGroupResponse listAddressGroup(ListAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listAddressGroup);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表，根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressGroupRequest 请求对象
     * @return SyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse>
     */
    public SyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse> listAddressGroupInvoker(
        ListAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listAddressGroup, hcClient);
    }

    /**
     * 查询IP地址组的关联资源
     *
     * 当您的IP地址组被网络ACL和安全组资源关联时，您可以通过调用该接口查询IP地址组关联的网络ACL或安全组的资源ID和名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressGroupsDependencyRequest 请求对象
     * @return ListAddressGroupsDependencyResponse
     */
    public ListAddressGroupsDependencyResponse listAddressGroupsDependency(ListAddressGroupsDependencyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listAddressGroupsDependency);
    }

    /**
     * 查询IP地址组的关联资源
     *
     * 当您的IP地址组被网络ACL和安全组资源关联时，您可以通过调用该接口查询IP地址组关联的网络ACL或安全组的资源ID和名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressGroupsDependencyRequest 请求对象
     * @return SyncInvoker<ListAddressGroupsDependencyRequest, ListAddressGroupsDependencyResponse>
     */
    public SyncInvoker<ListAddressGroupsDependencyRequest, ListAddressGroupsDependencyResponse> listAddressGroupsDependencyInvoker(
        ListAddressGroupsDependencyRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listAddressGroupsDependency, hcClient);
    }

    /**
     * 查询地址组
     *
     * 查询地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddressGroupRequest 请求对象
     * @return ShowAddressGroupResponse
     */
    public ShowAddressGroupResponse showAddressGroup(ShowAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showAddressGroup);
    }

    /**
     * 查询地址组
     *
     * 查询地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddressGroupRequest 请求对象
     * @return SyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse>
     */
    public SyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse> showAddressGroupInvoker(
        ShowAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showAddressGroup, hcClient);
    }

    /**
     * 更新地址组
     *
     * 更新地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressGroupRequest 请求对象
     * @return UpdateAddressGroupResponse
     */
    public UpdateAddressGroupResponse updateAddressGroup(UpdateAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateAddressGroup);
    }

    /**
     * 更新地址组
     *
     * 更新地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressGroupRequest 请求对象
     * @return SyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse>
     */
    public SyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse> updateAddressGroupInvoker(
        UpdateAddressGroupRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateAddressGroup, hcClient);
    }

    /**
     * 添加VPC扩展网段
     *
     * 添加VPC的扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpcExtendCidrRequest 请求对象
     * @return AddVpcExtendCidrResponse
     */
    public AddVpcExtendCidrResponse addVpcExtendCidr(AddVpcExtendCidrRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addVpcExtendCidr);
    }

    /**
     * 添加VPC扩展网段
     *
     * 添加VPC的扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpcExtendCidrRequest 请求对象
     * @return SyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse>
     */
    public SyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> addVpcExtendCidrInvoker(
        AddVpcExtendCidrRequest request) {
        return new SyncInvoker<>(request, VpcMeta.addVpcExtendCidr, hcClient);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRequest 请求对象
     * @return CreateVpcResponse
     */
    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpc);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRequest 请求对象
     * @return SyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public SyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcInvoker(CreateVpcRequest request) {
        return new SyncInvoker<>(request, VpcMeta.createVpc, hcClient);
    }

    /**
     * 删除VPC
     *
     * 删除VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRequest 请求对象
     * @return DeleteVpcResponse
     */
    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /**
     * 删除VPC
     *
     * 删除VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRequest 请求对象
     * @return SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public SyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcInvoker(DeleteVpcRequest request) {
        return new SyncInvoker<>(request, VpcMeta.deleteVpc, hcClient);
    }

    /**
     * 查询VPC列表
     *
     * 查询vpc列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsRequest 请求对象
     * @return ListVpcsResponse
     */
    public ListVpcsResponse listVpcs(ListVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /**
     * 查询VPC列表
     *
     * 查询vpc列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsRequest 请求对象
     * @return SyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public SyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsInvoker(ListVpcsRequest request) {
        return new SyncInvoker<>(request, VpcMeta.listVpcs, hcClient);
    }

    /**
     * 移除VPC扩展网段
     *
     * 移除VPC扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpcExtendCidrRequest 请求对象
     * @return RemoveVpcExtendCidrResponse
     */
    public RemoveVpcExtendCidrResponse removeVpcExtendCidr(RemoveVpcExtendCidrRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.removeVpcExtendCidr);
    }

    /**
     * 移除VPC扩展网段
     *
     * 移除VPC扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpcExtendCidrRequest 请求对象
     * @return SyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse>
     */
    public SyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> removeVpcExtendCidrInvoker(
        RemoveVpcExtendCidrRequest request) {
        return new SyncInvoker<>(request, VpcMeta.removeVpcExtendCidr, hcClient);
    }

    /**
     * 查询VPC详情
     *
     * 查询vpc详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRequest 请求对象
     * @return ShowVpcResponse
     */
    public ShowVpcResponse showVpc(ShowVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpc);
    }

    /**
     * 查询VPC详情
     *
     * 查询vpc详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRequest 请求对象
     * @return SyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public SyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcInvoker(ShowVpcRequest request) {
        return new SyncInvoker<>(request, VpcMeta.showVpc, hcClient);
    }

    /**
     * 更新VPC
     *
     * 更新vpc
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcRequest 请求对象
     * @return UpdateVpcResponse
     */
    public UpdateVpcResponse updateVpc(UpdateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpc);
    }

    /**
     * 更新VPC
     *
     * 更新vpc
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcRequest 请求对象
     * @return SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public SyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcInvoker(UpdateVpcRequest request) {
        return new SyncInvoker<>(request, VpcMeta.updateVpc, hcClient);
    }

}
