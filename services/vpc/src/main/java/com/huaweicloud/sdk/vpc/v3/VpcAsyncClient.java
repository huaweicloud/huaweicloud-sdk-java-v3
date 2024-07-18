package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.vpc.v3.model.DeleteVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.DeleteVpcResponse;
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallRequest;
import com.huaweicloud.sdk.vpc.v3.model.DisassociateSubnetFirewallResponse;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupRequest;
import com.huaweicloud.sdk.vpc.v3.model.ListAddressGroupResponse;
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
import com.huaweicloud.sdk.vpc.v3.model.ShowPortTagsRequest;
import com.huaweicloud.sdk.vpc.v3.model.ShowPortTagsResponse;
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
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcRequest;
import com.huaweicloud.sdk.vpc.v3.model.UpdateVpcResponse;

import java.util.concurrent.CompletableFuture;

public class VpcAsyncClient {

    protected HcClient hcClient;

    public VpcAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcAsyncClient> newBuilder() {
        ClientBuilder<VpcAsyncClient> clientBuilder = new ClientBuilder<>(VpcAsyncClient::new);
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
     * @return CompletableFuture<AddSecurityGroupsResponse>
     */
    public CompletableFuture<AddSecurityGroupsResponse> addSecurityGroupsAsync(AddSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addSecurityGroups);
    }

    /**
     * 端口插入安全组
     *
     * 端口插入安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<AddSecurityGroupsRequest, AddSecurityGroupsResponse>
     */
    public AsyncInvoker<AddSecurityGroupsRequest, AddSecurityGroupsResponse> addSecurityGroupsAsyncInvoker(
        AddSecurityGroupsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.addSecurityGroups, hcClient);
    }

    /**
     * 流量镜像会话添加镜像源
     *
     * 流量镜像会话添加镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSourcesToTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<AddSourcesToTrafficMirrorSessionResponse>
     */
    public CompletableFuture<AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSessionAsync(
        AddSourcesToTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addSourcesToTrafficMirrorSession);
    }

    /**
     * 流量镜像会话添加镜像源
     *
     * 流量镜像会话添加镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSourcesToTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<AddSourcesToTrafficMirrorSessionRequest, AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSessionAsyncInvoker(
        AddSourcesToTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.addSourcesToTrafficMirrorSession, hcClient);
    }

    /**
     * 批量添加端口资源标签
     *
     * 为指定的端口批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePortTagsRequest 请求对象
     * @return CompletableFuture<BatchCreatePortTagsResponse>
     */
    public CompletableFuture<BatchCreatePortTagsResponse> batchCreatePortTagsAsync(BatchCreatePortTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreatePortTags);
    }

    /**
     * 批量添加端口资源标签
     *
     * 为指定的端口批量添加标签。
     * 此接口为幂等接口：创建时如果请求体中存在重复key则报错。创建时，不允许设置重复key数据，如果数据库已存在该key，就覆盖value的值。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePortTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreatePortTagsRequest, BatchCreatePortTagsResponse>
     */
    public AsyncInvoker<BatchCreatePortTagsRequest, BatchCreatePortTagsResponse> batchCreatePortTagsAsyncInvoker(
        BatchCreatePortTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchCreatePortTags, hcClient);
    }

    /**
     * 批量创建安全组规则
     *
     * 在特定安全组下批量创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<BatchCreateSecurityGroupRulesResponse>
     */
    public CompletableFuture<BatchCreateSecurityGroupRulesResponse> batchCreateSecurityGroupRulesAsync(
        BatchCreateSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSecurityGroupRules);
    }

    /**
     * 批量创建安全组规则
     *
     * 在特定安全组下批量创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse>
     */
    public AsyncInvoker<BatchCreateSecurityGroupRulesRequest, BatchCreateSecurityGroupRulesResponse> batchCreateSecurityGroupRulesAsyncInvoker(
        BatchCreateSecurityGroupRulesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchCreateSecurityGroupRules, hcClient);
    }

    /**
     * 批量创建辅助弹性网卡
     *
     * 批量创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<BatchCreateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceAsync(
        BatchCreateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterface);
    }

    /**
     * 批量创建辅助弹性网卡
     *
     * 批量创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceAsyncInvoker(
        BatchCreateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchCreateSubNetworkInterface, hcClient);
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
     * @return CompletableFuture<BatchDeletePortTagsResponse>
     */
    public CompletableFuture<BatchDeletePortTagsResponse> batchDeletePortTagsAsync(BatchDeletePortTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchDeletePortTags);
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
     * @return AsyncInvoker<BatchDeletePortTagsRequest, BatchDeletePortTagsResponse>
     */
    public AsyncInvoker<BatchDeletePortTagsRequest, BatchDeletePortTagsResponse> batchDeletePortTagsAsyncInvoker(
        BatchDeletePortTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchDeletePortTags, hcClient);
    }

    /**
     * 查询端口资源实例数量
     *
     * 使用标签过滤查询端口实例数量。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPortsByTagsRequest 请求对象
     * @return CompletableFuture<CountPortsByTagsResponse>
     */
    public CompletableFuture<CountPortsByTagsResponse> countPortsByTagsAsync(CountPortsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.countPortsByTags);
    }

    /**
     * 查询端口资源实例数量
     *
     * 使用标签过滤查询端口实例数量。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountPortsByTagsRequest 请求对象
     * @return AsyncInvoker<CountPortsByTagsRequest, CountPortsByTagsResponse>
     */
    public AsyncInvoker<CountPortsByTagsRequest, CountPortsByTagsResponse> countPortsByTagsAsyncInvoker(
        CountPortsByTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.countPortsByTags, hcClient);
    }

    /**
     * 添加端口资源标签
     *
     * 给指定端口资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortTagRequest 请求对象
     * @return CompletableFuture<CreatePortTagResponse>
     */
    public CompletableFuture<CreatePortTagResponse> createPortTagAsync(CreatePortTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createPortTag);
    }

    /**
     * 添加端口资源标签
     *
     * 给指定端口资源实例增加标签信息
     * 此接口为幂等接口：创建时，如果创建的标签已经存在（key相同），则覆盖。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePortTagRequest 请求对象
     * @return AsyncInvoker<CreatePortTagRequest, CreatePortTagResponse>
     */
    public AsyncInvoker<CreatePortTagRequest, CreatePortTagResponse> createPortTagAsyncInvoker(
        CreatePortTagRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createPortTag, hcClient);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupResponse>
     */
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroupAsync(CreateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    /**
     * 创建安全组
     *
     * 创建安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupAsyncInvoker(
        CreateSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createSecurityGroup, hcClient);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<CreateSecurityGroupRuleResponse>
     */
    public CompletableFuture<CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsync(
        CreateSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    /**
     * 创建安全组规则
     *
     * 创建安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>
     */
    public AsyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleAsyncInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createSecurityGroupRule, hcClient);
    }

    /**
     * 创建辅助弹性网卡
     *
     * 创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<CreateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceAsync(
        CreateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    /**
     * 创建辅助弹性网卡
     *
     * 创建辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceAsyncInvoker(
        CreateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createSubNetworkInterface, hcClient);
    }

    /**
     * 创建流量镜像筛选条件
     *
     * 创建流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRequest 请求对象
     * @return CompletableFuture<CreateTrafficMirrorFilterResponse>
     */
    public CompletableFuture<CreateTrafficMirrorFilterResponse> createTrafficMirrorFilterAsync(
        CreateTrafficMirrorFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createTrafficMirrorFilter);
    }

    /**
     * 创建流量镜像筛选条件
     *
     * 创建流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRequest 请求对象
     * @return AsyncInvoker<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse>
     */
    public AsyncInvoker<CreateTrafficMirrorFilterRequest, CreateTrafficMirrorFilterResponse> createTrafficMirrorFilterAsyncInvoker(
        CreateTrafficMirrorFilterRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createTrafficMirrorFilter, hcClient);
    }

    /**
     * 创建流量镜像筛选规则
     *
     * 创建流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRuleRequest 请求对象
     * @return CompletableFuture<CreateTrafficMirrorFilterRuleResponse>
     */
    public CompletableFuture<CreateTrafficMirrorFilterRuleResponse> createTrafficMirrorFilterRuleAsync(
        CreateTrafficMirrorFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createTrafficMirrorFilterRule);
    }

    /**
     * 创建流量镜像筛选规则
     *
     * 创建流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorFilterRuleRequest 请求对象
     * @return AsyncInvoker<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse>
     */
    public AsyncInvoker<CreateTrafficMirrorFilterRuleRequest, CreateTrafficMirrorFilterRuleResponse> createTrafficMirrorFilterRuleAsyncInvoker(
        CreateTrafficMirrorFilterRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 创建流量镜像会话
     *
     * 创建流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<CreateTrafficMirrorSessionResponse>
     */
    public CompletableFuture<CreateTrafficMirrorSessionResponse> createTrafficMirrorSessionAsync(
        CreateTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createTrafficMirrorSession);
    }

    /**
     * 创建流量镜像会话
     *
     * 创建流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<CreateTrafficMirrorSessionRequest, CreateTrafficMirrorSessionResponse> createTrafficMirrorSessionAsyncInvoker(
        CreateTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createTrafficMirrorSession, hcClient);
    }

    /**
     * 删除端口资源标签
     *
     * 删除指定端口的标签信息
     * 该接口为幂等接口：删除的key不存在报404，key不能为空或者空字符串。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePortTagRequest 请求对象
     * @return CompletableFuture<DeletePortTagResponse>
     */
    public CompletableFuture<DeletePortTagResponse> deletePortTagAsync(DeletePortTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deletePortTag);
    }

    /**
     * 删除端口资源标签
     *
     * 删除指定端口的标签信息
     * 该接口为幂等接口：删除的key不存在报404，key不能为空或者空字符串。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePortTagRequest 请求对象
     * @return AsyncInvoker<DeletePortTagRequest, DeletePortTagResponse>
     */
    public AsyncInvoker<DeletePortTagRequest, DeletePortTagResponse> deletePortTagAsyncInvoker(
        DeletePortTagRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deletePortTag, hcClient);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupResponse>
     */
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroupAsync(DeleteSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    /**
     * 删除安全组
     *
     * 删除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupAsyncInvoker(
        DeleteSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteSecurityGroup, hcClient);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<DeleteSecurityGroupRuleResponse>
     */
    public CompletableFuture<DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsync(
        DeleteSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    /**
     * 删除安全组规则
     *
     * 删除安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>
     */
    public AsyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleAsyncInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    /**
     * 删除辅助弹性网卡
     *
     * 删除辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<DeleteSubNetworkInterfaceResponse>
     */
    public CompletableFuture<DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceAsync(
        DeleteSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    /**
     * 删除辅助弹性网卡
     *
     * 删除辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceAsyncInvoker(
        DeleteSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteSubNetworkInterface, hcClient);
    }

    /**
     * 删除流量镜像筛选条件
     *
     * 删除流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRequest 请求对象
     * @return CompletableFuture<DeleteTrafficMirrorFilterResponse>
     */
    public CompletableFuture<DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilterAsync(
        DeleteTrafficMirrorFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteTrafficMirrorFilter);
    }

    /**
     * 删除流量镜像筛选条件
     *
     * 删除流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRequest 请求对象
     * @return AsyncInvoker<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse>
     */
    public AsyncInvoker<DeleteTrafficMirrorFilterRequest, DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilterAsyncInvoker(
        DeleteTrafficMirrorFilterRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteTrafficMirrorFilter, hcClient);
    }

    /**
     * 删除流量镜像筛选规则
     *
     * 删除流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRuleRequest 请求对象
     * @return CompletableFuture<DeleteTrafficMirrorFilterRuleResponse>
     */
    public CompletableFuture<DeleteTrafficMirrorFilterRuleResponse> deleteTrafficMirrorFilterRuleAsync(
        DeleteTrafficMirrorFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteTrafficMirrorFilterRule);
    }

    /**
     * 删除流量镜像筛选规则
     *
     * 删除流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorFilterRuleRequest 请求对象
     * @return AsyncInvoker<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse>
     */
    public AsyncInvoker<DeleteTrafficMirrorFilterRuleRequest, DeleteTrafficMirrorFilterRuleResponse> deleteTrafficMirrorFilterRuleAsyncInvoker(
        DeleteTrafficMirrorFilterRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 删除流量镜像会话
     *
     * 删除流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<DeleteTrafficMirrorSessionResponse>
     */
    public CompletableFuture<DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSessionAsync(
        DeleteTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteTrafficMirrorSession);
    }

    /**
     * 删除流量镜像会话
     *
     * 删除流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<DeleteTrafficMirrorSessionRequest, DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSessionAsyncInvoker(
        DeleteTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteTrafficMirrorSession, hcClient);
    }

    /**
     * 查询端口项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortTagsRequest 请求对象
     * @return CompletableFuture<ListPortTagsResponse>
     */
    public CompletableFuture<ListPortTagsResponse> listPortTagsAsync(ListPortTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPortTags);
    }

    /**
     * 查询端口项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortTagsRequest 请求对象
     * @return AsyncInvoker<ListPortTagsRequest, ListPortTagsResponse>
     */
    public AsyncInvoker<ListPortTagsRequest, ListPortTagsResponse> listPortTagsAsyncInvoker(
        ListPortTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listPortTags, hcClient);
    }

    /**
     * 查询端口资源实例列表
     *
     * 使用标签过滤查询端口。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsByTagsRequest 请求对象
     * @return CompletableFuture<ListPortsByTagsResponse>
     */
    public CompletableFuture<ListPortsByTagsResponse> listPortsByTagsAsync(ListPortsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listPortsByTags);
    }

    /**
     * 查询端口资源实例列表
     *
     * 使用标签过滤查询端口。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPortsByTagsRequest 请求对象
     * @return AsyncInvoker<ListPortsByTagsRequest, ListPortsByTagsResponse>
     */
    public AsyncInvoker<ListPortsByTagsRequest, ListPortsByTagsResponse> listPortsByTagsAsyncInvoker(
        ListPortsByTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listPortsByTags, hcClient);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupRulesRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupRulesResponse>
     */
    public CompletableFuture<ListSecurityGroupRulesResponse> listSecurityGroupRulesAsync(
        ListSecurityGroupRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    /**
     * 查询安全组规则列表
     *
     * 查询安全组规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupRulesRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>
     */
    public AsyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesAsyncInvoker(
        ListSecurityGroupRulesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listSecurityGroupRules, hcClient);
    }

    /**
     * 查询安全组列表
     *
     * 查询某租户下的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return CompletableFuture<ListSecurityGroupsResponse>
     */
    public CompletableFuture<ListSecurityGroupsResponse> listSecurityGroupsAsync(ListSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    /**
     * 查询安全组列表
     *
     * 查询某租户下的安全组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>
     */
    public AsyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsAsyncInvoker(
        ListSecurityGroupsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listSecurityGroups, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     *
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubNetworkInterfacesRequest 请求对象
     * @return CompletableFuture<ListSubNetworkInterfacesResponse>
     */
    public CompletableFuture<ListSubNetworkInterfacesResponse> listSubNetworkInterfacesAsync(
        ListSubNetworkInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    /**
     * 查询租户下辅助弹性网卡列表
     *
     * 查询辅助弹性网卡列表，单次查询最多返回2000条数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubNetworkInterfacesRequest 请求对象
     * @return AsyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse>
     */
    public AsyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfacesAsyncInvoker(
        ListSubNetworkInterfacesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listSubNetworkInterfaces, hcClient);
    }

    /**
     * 查询流量镜像筛选规则列表
     *
     * 查询流量镜像筛选规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFilterRulesRequest 请求对象
     * @return CompletableFuture<ListTrafficMirrorFilterRulesResponse>
     */
    public CompletableFuture<ListTrafficMirrorFilterRulesResponse> listTrafficMirrorFilterRulesAsync(
        ListTrafficMirrorFilterRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listTrafficMirrorFilterRules);
    }

    /**
     * 查询流量镜像筛选规则列表
     *
     * 查询流量镜像筛选规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFilterRulesRequest 请求对象
     * @return AsyncInvoker<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse>
     */
    public AsyncInvoker<ListTrafficMirrorFilterRulesRequest, ListTrafficMirrorFilterRulesResponse> listTrafficMirrorFilterRulesAsyncInvoker(
        ListTrafficMirrorFilterRulesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listTrafficMirrorFilterRules, hcClient);
    }

    /**
     * 查询流量镜像筛选条件列表
     *
     * 查询流量镜像筛选条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFiltersRequest 请求对象
     * @return CompletableFuture<ListTrafficMirrorFiltersResponse>
     */
    public CompletableFuture<ListTrafficMirrorFiltersResponse> listTrafficMirrorFiltersAsync(
        ListTrafficMirrorFiltersRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listTrafficMirrorFilters);
    }

    /**
     * 查询流量镜像筛选条件列表
     *
     * 查询流量镜像筛选条件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorFiltersRequest 请求对象
     * @return AsyncInvoker<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse>
     */
    public AsyncInvoker<ListTrafficMirrorFiltersRequest, ListTrafficMirrorFiltersResponse> listTrafficMirrorFiltersAsyncInvoker(
        ListTrafficMirrorFiltersRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listTrafficMirrorFilters, hcClient);
    }

    /**
     * 查询流量镜像会话列表
     *
     * 查询流量镜像会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorSessionsRequest 请求对象
     * @return CompletableFuture<ListTrafficMirrorSessionsResponse>
     */
    public CompletableFuture<ListTrafficMirrorSessionsResponse> listTrafficMirrorSessionsAsync(
        ListTrafficMirrorSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listTrafficMirrorSessions);
    }

    /**
     * 查询流量镜像会话列表
     *
     * 查询流量镜像会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrafficMirrorSessionsRequest 请求对象
     * @return AsyncInvoker<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse>
     */
    public AsyncInvoker<ListTrafficMirrorSessionsRequest, ListTrafficMirrorSessionsResponse> listTrafficMirrorSessionsAsyncInvoker(
        ListTrafficMirrorSessionsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listTrafficMirrorSessions, hcClient);
    }

    /**
     * 迁移辅助弹性网卡
     *
     * 批量迁移辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<MigrateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterfaceAsync(
        MigrateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.migrateSubNetworkInterface);
    }

    /**
     * 迁移辅助弹性网卡
     *
     * 批量迁移辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterfaceAsyncInvoker(
        MigrateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.migrateSubNetworkInterface, hcClient);
    }

    /**
     * 端口移除安全组
     *
     * 端口移除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSecurityGroupsRequest 请求对象
     * @return CompletableFuture<RemoveSecurityGroupsResponse>
     */
    public CompletableFuture<RemoveSecurityGroupsResponse> removeSecurityGroupsAsync(
        RemoveSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.removeSecurityGroups);
    }

    /**
     * 端口移除安全组
     *
     * 端口移除安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse>
     */
    public AsyncInvoker<RemoveSecurityGroupsRequest, RemoveSecurityGroupsResponse> removeSecurityGroupsAsyncInvoker(
        RemoveSecurityGroupsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.removeSecurityGroups, hcClient);
    }

    /**
     * 流量镜像会话移除镜像源
     *
     * 流量镜像会话移除镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSourcesFromTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<RemoveSourcesFromTrafficMirrorSessionResponse>
     */
    public CompletableFuture<RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSessionAsync(
        RemoveSourcesFromTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.removeSourcesFromTrafficMirrorSession);
    }

    /**
     * 流量镜像会话移除镜像源
     *
     * 流量镜像会话移除镜像源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveSourcesFromTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<RemoveSourcesFromTrafficMirrorSessionRequest, RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSessionAsyncInvoker(
        RemoveSourcesFromTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.removeSourcesFromTrafficMirrorSession, hcClient);
    }

    /**
     * 查询端口资源标签
     *
     * 查询指定端口的标签信息。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortTagsRequest 请求对象
     * @return CompletableFuture<ShowPortTagsResponse>
     */
    public CompletableFuture<ShowPortTagsResponse> showPortTagsAsync(ShowPortTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showPortTags);
    }

    /**
     * 查询端口资源标签
     *
     * 查询指定端口的标签信息。
     * 该接口在华南-深圳上线。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPortTagsRequest 请求对象
     * @return AsyncInvoker<ShowPortTagsRequest, ShowPortTagsResponse>
     */
    public AsyncInvoker<ShowPortTagsRequest, ShowPortTagsResponse> showPortTagsAsyncInvoker(
        ShowPortTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showPortTags, hcClient);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupResponse>
     */
    public CompletableFuture<ShowSecurityGroupResponse> showSecurityGroupAsync(ShowSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    /**
     * 查询安全组
     *
     * 查询单个安全组详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupAsyncInvoker(
        ShowSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showSecurityGroup, hcClient);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRuleRequest 请求对象
     * @return CompletableFuture<ShowSecurityGroupRuleResponse>
     */
    public CompletableFuture<ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsync(
        ShowSecurityGroupRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    /**
     * 查询安全组规则
     *
     * 查询单个安全组规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecurityGroupRuleRequest 请求对象
     * @return AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>
     */
    public AsyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleAsyncInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showSecurityGroupRule, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡
     *
     * 查询辅助弹性网卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<ShowSubNetworkInterfaceResponse>
     */
    public CompletableFuture<ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceAsync(
        ShowSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    /**
     * 查询租户下辅助弹性网卡
     *
     * 查询辅助弹性网卡详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceAsyncInvoker(
        ShowSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showSubNetworkInterface, hcClient);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     *
     * 查询辅助弹性网卡数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return CompletableFuture<ShowSubNetworkInterfacesQuantityResponse>
     */
    public CompletableFuture<ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityAsync(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    /**
     * 查询租户下辅助弹性网卡数目
     *
     * 查询辅助弹性网卡数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSubNetworkInterfacesQuantityRequest 请求对象
     * @return AsyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse>
     */
    public AsyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityAsyncInvoker(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showSubNetworkInterfacesQuantity, hcClient);
    }

    /**
     * 查询流量镜像筛选条件详情
     *
     * 查询流量镜像筛选条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRequest 请求对象
     * @return CompletableFuture<ShowTrafficMirrorFilterResponse>
     */
    public CompletableFuture<ShowTrafficMirrorFilterResponse> showTrafficMirrorFilterAsync(
        ShowTrafficMirrorFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showTrafficMirrorFilter);
    }

    /**
     * 查询流量镜像筛选条件详情
     *
     * 查询流量镜像筛选条件详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRequest 请求对象
     * @return AsyncInvoker<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse>
     */
    public AsyncInvoker<ShowTrafficMirrorFilterRequest, ShowTrafficMirrorFilterResponse> showTrafficMirrorFilterAsyncInvoker(
        ShowTrafficMirrorFilterRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showTrafficMirrorFilter, hcClient);
    }

    /**
     * 查询流量镜像筛选规则详情
     *
     * 查询流量镜像筛选规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRuleRequest 请求对象
     * @return CompletableFuture<ShowTrafficMirrorFilterRuleResponse>
     */
    public CompletableFuture<ShowTrafficMirrorFilterRuleResponse> showTrafficMirrorFilterRuleAsync(
        ShowTrafficMirrorFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showTrafficMirrorFilterRule);
    }

    /**
     * 查询流量镜像筛选规则详情
     *
     * 查询流量镜像筛选规则详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorFilterRuleRequest 请求对象
     * @return AsyncInvoker<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse>
     */
    public AsyncInvoker<ShowTrafficMirrorFilterRuleRequest, ShowTrafficMirrorFilterRuleResponse> showTrafficMirrorFilterRuleAsyncInvoker(
        ShowTrafficMirrorFilterRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 查询流量镜像会话详情
     *
     * 查询流量镜像会话详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<ShowTrafficMirrorSessionResponse>
     */
    public CompletableFuture<ShowTrafficMirrorSessionResponse> showTrafficMirrorSessionAsync(
        ShowTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showTrafficMirrorSession);
    }

    /**
     * 查询流量镜像会话详情
     *
     * 查询流量镜像会话详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<ShowTrafficMirrorSessionRequest, ShowTrafficMirrorSessionResponse> showTrafficMirrorSessionAsyncInvoker(
        ShowTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showTrafficMirrorSession, hcClient);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse>
     */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSecurityGroup);
    }

    /**
     * 更新安全组
     *
     * 更新安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupAsyncInvoker(
        UpdateSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 更新辅助弹性网卡
     *
     * 更新辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<UpdateSubNetworkInterfaceResponse>
     */
    public CompletableFuture<UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceAsync(
        UpdateSubNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

    /**
     * 更新辅助弹性网卡
     *
     * 更新辅助弹性网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse>
     */
    public AsyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceAsyncInvoker(
        UpdateSubNetworkInterfaceRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateSubNetworkInterface, hcClient);
    }

    /**
     * 更新流量镜像筛选条件
     *
     * 更新流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRequest 请求对象
     * @return CompletableFuture<UpdateTrafficMirrorFilterResponse>
     */
    public CompletableFuture<UpdateTrafficMirrorFilterResponse> updateTrafficMirrorFilterAsync(
        UpdateTrafficMirrorFilterRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateTrafficMirrorFilter);
    }

    /**
     * 更新流量镜像筛选条件
     *
     * 更新流量镜像筛选条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRequest 请求对象
     * @return AsyncInvoker<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse>
     */
    public AsyncInvoker<UpdateTrafficMirrorFilterRequest, UpdateTrafficMirrorFilterResponse> updateTrafficMirrorFilterAsyncInvoker(
        UpdateTrafficMirrorFilterRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateTrafficMirrorFilter, hcClient);
    }

    /**
     * 更新流量镜像筛选规则
     *
     * 更新流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRuleRequest 请求对象
     * @return CompletableFuture<UpdateTrafficMirrorFilterRuleResponse>
     */
    public CompletableFuture<UpdateTrafficMirrorFilterRuleResponse> updateTrafficMirrorFilterRuleAsync(
        UpdateTrafficMirrorFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateTrafficMirrorFilterRule);
    }

    /**
     * 更新流量镜像筛选规则
     *
     * 更新流量镜像筛选规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorFilterRuleRequest 请求对象
     * @return AsyncInvoker<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse>
     */
    public AsyncInvoker<UpdateTrafficMirrorFilterRuleRequest, UpdateTrafficMirrorFilterRuleResponse> updateTrafficMirrorFilterRuleAsyncInvoker(
        UpdateTrafficMirrorFilterRuleRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateTrafficMirrorFilterRule, hcClient);
    }

    /**
     * 更新流量镜像会话
     *
     * 更新流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorSessionRequest 请求对象
     * @return CompletableFuture<UpdateTrafficMirrorSessionResponse>
     */
    public CompletableFuture<UpdateTrafficMirrorSessionResponse> updateTrafficMirrorSessionAsync(
        UpdateTrafficMirrorSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateTrafficMirrorSession);
    }

    /**
     * 更新流量镜像会话
     *
     * 更新流量镜像会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrafficMirrorSessionRequest 请求对象
     * @return AsyncInvoker<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse>
     */
    public AsyncInvoker<UpdateTrafficMirrorSessionRequest, UpdateTrafficMirrorSessionResponse> updateTrafficMirrorSessionAsyncInvoker(
        UpdateTrafficMirrorSessionRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateTrafficMirrorSession, hcClient);
    }

    /**
     * 网络ACL插入规则
     *
     * 网络ACL插入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFirewallRulesRequest 请求对象
     * @return CompletableFuture<AddFirewallRulesResponse>
     */
    public CompletableFuture<AddFirewallRulesResponse> addFirewallRulesAsync(AddFirewallRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addFirewallRules);
    }

    /**
     * 网络ACL插入规则
     *
     * 网络ACL插入规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFirewallRulesRequest 请求对象
     * @return AsyncInvoker<AddFirewallRulesRequest, AddFirewallRulesResponse>
     */
    public AsyncInvoker<AddFirewallRulesRequest, AddFirewallRulesResponse> addFirewallRulesAsyncInvoker(
        AddFirewallRulesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.addFirewallRules, hcClient);
    }

    /**
     * 网络ACL绑定子网
     *
     * 网络ACL绑定子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSubnetFirewallRequest 请求对象
     * @return CompletableFuture<AssociateSubnetFirewallResponse>
     */
    public CompletableFuture<AssociateSubnetFirewallResponse> associateSubnetFirewallAsync(
        AssociateSubnetFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.associateSubnetFirewall);
    }

    /**
     * 网络ACL绑定子网
     *
     * 网络ACL绑定子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateSubnetFirewallRequest 请求对象
     * @return AsyncInvoker<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse>
     */
    public AsyncInvoker<AssociateSubnetFirewallRequest, AssociateSubnetFirewallResponse> associateSubnetFirewallAsyncInvoker(
        AssociateSubnetFirewallRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.associateSubnetFirewall, hcClient);
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
     * @return CompletableFuture<BatchCreateFirewallTagsResponse>
     */
    public CompletableFuture<BatchCreateFirewallTagsResponse> batchCreateFirewallTagsAsync(
        BatchCreateFirewallTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateFirewallTags);
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
     * @return AsyncInvoker<BatchCreateFirewallTagsRequest, BatchCreateFirewallTagsResponse>
     */
    public AsyncInvoker<BatchCreateFirewallTagsRequest, BatchCreateFirewallTagsResponse> batchCreateFirewallTagsAsyncInvoker(
        BatchCreateFirewallTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchCreateFirewallTags, hcClient);
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
     * @return CompletableFuture<BatchDeleteFirewallTagsResponse>
     */
    public CompletableFuture<BatchDeleteFirewallTagsResponse> batchDeleteFirewallTagsAsync(
        BatchDeleteFirewallTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchDeleteFirewallTags);
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
     * @return AsyncInvoker<BatchDeleteFirewallTagsRequest, BatchDeleteFirewallTagsResponse>
     */
    public AsyncInvoker<BatchDeleteFirewallTagsRequest, BatchDeleteFirewallTagsResponse> batchDeleteFirewallTagsAsyncInvoker(
        BatchDeleteFirewallTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchDeleteFirewallTags, hcClient);
    }

    /**
     * 查询ACL资源实例数量
     *
     * 使用标签过滤查询ACL实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountFirewallsByTagsRequest 请求对象
     * @return CompletableFuture<CountFirewallsByTagsResponse>
     */
    public CompletableFuture<CountFirewallsByTagsResponse> countFirewallsByTagsAsync(
        CountFirewallsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.countFirewallsByTags);
    }

    /**
     * 查询ACL资源实例数量
     *
     * 使用标签过滤查询ACL实例数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountFirewallsByTagsRequest 请求对象
     * @return AsyncInvoker<CountFirewallsByTagsRequest, CountFirewallsByTagsResponse>
     */
    public AsyncInvoker<CountFirewallsByTagsRequest, CountFirewallsByTagsResponse> countFirewallsByTagsAsyncInvoker(
        CountFirewallsByTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.countFirewallsByTags, hcClient);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return CompletableFuture<CreateFirewallResponse>
     */
    public CompletableFuture<CreateFirewallResponse> createFirewallAsync(CreateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createFirewall);
    }

    /**
     * 创建网络ACL
     *
     * 创建网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFirewallRequest 请求对象
     * @return AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse>
     */
    public AsyncInvoker<CreateFirewallRequest, CreateFirewallResponse> createFirewallAsyncInvoker(
        CreateFirewallRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createFirewall, hcClient);
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
     * @return CompletableFuture<CreateFirewallTagResponse>
     */
    public CompletableFuture<CreateFirewallTagResponse> createFirewallTagAsync(CreateFirewallTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createFirewallTag);
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
     * @return AsyncInvoker<CreateFirewallTagRequest, CreateFirewallTagResponse>
     */
    public AsyncInvoker<CreateFirewallTagRequest, CreateFirewallTagResponse> createFirewallTagAsyncInvoker(
        CreateFirewallTagRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createFirewallTag, hcClient);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return CompletableFuture<DeleteFirewallResponse>
     */
    public CompletableFuture<DeleteFirewallResponse> deleteFirewallAsync(DeleteFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteFirewall);
    }

    /**
     * 删除网络ACL
     *
     * 删除网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFirewallRequest 请求对象
     * @return AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse>
     */
    public AsyncInvoker<DeleteFirewallRequest, DeleteFirewallResponse> deleteFirewallAsyncInvoker(
        DeleteFirewallRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteFirewall, hcClient);
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
     * @return CompletableFuture<DeleteFirewallTagResponse>
     */
    public CompletableFuture<DeleteFirewallTagResponse> deleteFirewallTagAsync(DeleteFirewallTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteFirewallTag);
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
     * @return AsyncInvoker<DeleteFirewallTagRequest, DeleteFirewallTagResponse>
     */
    public AsyncInvoker<DeleteFirewallTagRequest, DeleteFirewallTagResponse> deleteFirewallTagAsyncInvoker(
        DeleteFirewallTagRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteFirewallTag, hcClient);
    }

    /**
     * 网络ACL解绑子网
     *
     * 网络ACL解绑子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSubnetFirewallRequest 请求对象
     * @return CompletableFuture<DisassociateSubnetFirewallResponse>
     */
    public CompletableFuture<DisassociateSubnetFirewallResponse> disassociateSubnetFirewallAsync(
        DisassociateSubnetFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.disassociateSubnetFirewall);
    }

    /**
     * 网络ACL解绑子网
     *
     * 网络ACL解绑子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateSubnetFirewallRequest 请求对象
     * @return AsyncInvoker<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse>
     */
    public AsyncInvoker<DisassociateSubnetFirewallRequest, DisassociateSubnetFirewallResponse> disassociateSubnetFirewallAsyncInvoker(
        DisassociateSubnetFirewallRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.disassociateSubnetFirewall, hcClient);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallRequest 请求对象
     * @return CompletableFuture<ListFirewallResponse>
     */
    public CompletableFuture<ListFirewallResponse> listFirewallAsync(ListFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listFirewall);
    }

    /**
     * 查询网络ACL列表
     *
     * 查询网络ACL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallRequest 请求对象
     * @return AsyncInvoker<ListFirewallRequest, ListFirewallResponse>
     */
    public AsyncInvoker<ListFirewallRequest, ListFirewallResponse> listFirewallAsyncInvoker(
        ListFirewallRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listFirewall, hcClient);
    }

    /**
     * 查询ACL项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallTagsRequest 请求对象
     * @return CompletableFuture<ListFirewallTagsResponse>
     */
    public CompletableFuture<ListFirewallTagsResponse> listFirewallTagsAsync(ListFirewallTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listFirewallTags);
    }

    /**
     * 查询ACL项目标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallTagsRequest 请求对象
     * @return AsyncInvoker<ListFirewallTagsRequest, ListFirewallTagsResponse>
     */
    public AsyncInvoker<ListFirewallTagsRequest, ListFirewallTagsResponse> listFirewallTagsAsyncInvoker(
        ListFirewallTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listFirewallTags, hcClient);
    }

    /**
     * 查询ACL资源实例列表
     *
     * 使用标签过滤查询ACL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallsByTagsRequest 请求对象
     * @return CompletableFuture<ListFirewallsByTagsResponse>
     */
    public CompletableFuture<ListFirewallsByTagsResponse> listFirewallsByTagsAsync(ListFirewallsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listFirewallsByTags);
    }

    /**
     * 查询ACL资源实例列表
     *
     * 使用标签过滤查询ACL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFirewallsByTagsRequest 请求对象
     * @return AsyncInvoker<ListFirewallsByTagsRequest, ListFirewallsByTagsResponse>
     */
    public AsyncInvoker<ListFirewallsByTagsRequest, ListFirewallsByTagsResponse> listFirewallsByTagsAsyncInvoker(
        ListFirewallsByTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listFirewallsByTags, hcClient);
    }

    /**
     * 网络ACL移除规则
     *
     * 网络ACL移除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFirewallRulesRequest 请求对象
     * @return CompletableFuture<RemoveFirewallRulesResponse>
     */
    public CompletableFuture<RemoveFirewallRulesResponse> removeFirewallRulesAsync(RemoveFirewallRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.removeFirewallRules);
    }

    /**
     * 网络ACL移除规则
     *
     * 网络ACL移除规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFirewallRulesRequest 请求对象
     * @return AsyncInvoker<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse>
     */
    public AsyncInvoker<RemoveFirewallRulesRequest, RemoveFirewallRulesResponse> removeFirewallRulesAsyncInvoker(
        RemoveFirewallRulesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.removeFirewallRules, hcClient);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallRequest 请求对象
     * @return CompletableFuture<ShowFirewallResponse>
     */
    public CompletableFuture<ShowFirewallResponse> showFirewallAsync(ShowFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showFirewall);
    }

    /**
     * 查询网络ACL详情
     *
     * 查询网络ACL详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallRequest 请求对象
     * @return AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse>
     */
    public AsyncInvoker<ShowFirewallRequest, ShowFirewallResponse> showFirewallAsyncInvoker(
        ShowFirewallRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showFirewall, hcClient);
    }

    /**
     * 查询ACL资源标签
     *
     * 查询指定ACL实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallTagsRequest 请求对象
     * @return CompletableFuture<ShowFirewallTagsResponse>
     */
    public CompletableFuture<ShowFirewallTagsResponse> showFirewallTagsAsync(ShowFirewallTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showFirewallTags);
    }

    /**
     * 查询ACL资源标签
     *
     * 查询指定ACL实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFirewallTagsRequest 请求对象
     * @return AsyncInvoker<ShowFirewallTagsRequest, ShowFirewallTagsResponse>
     */
    public AsyncInvoker<ShowFirewallTagsRequest, ShowFirewallTagsResponse> showFirewallTagsAsyncInvoker(
        ShowFirewallTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showFirewallTags, hcClient);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRequest 请求对象
     * @return CompletableFuture<UpdateFirewallResponse>
     */
    public CompletableFuture<UpdateFirewallResponse> updateFirewallAsync(UpdateFirewallRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateFirewall);
    }

    /**
     * 更新网络ACL
     *
     * 更新网络ACL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRequest 请求对象
     * @return AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse>
     */
    public AsyncInvoker<UpdateFirewallRequest, UpdateFirewallResponse> updateFirewallAsyncInvoker(
        UpdateFirewallRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateFirewall, hcClient);
    }

    /**
     * 网络ACL更新规则
     *
     * 网络ACL更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRulesRequest 请求对象
     * @return CompletableFuture<UpdateFirewallRulesResponse>
     */
    public CompletableFuture<UpdateFirewallRulesResponse> updateFirewallRulesAsync(UpdateFirewallRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateFirewallRules);
    }

    /**
     * 网络ACL更新规则
     *
     * 网络ACL更新规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFirewallRulesRequest 请求对象
     * @return AsyncInvoker<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse>
     */
    public AsyncInvoker<UpdateFirewallRulesRequest, UpdateFirewallRulesResponse> updateFirewallRulesAsyncInvoker(
        UpdateFirewallRulesRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateFirewallRules, hcClient);
    }

    /**
     * 添加Clouddcn子网标签
     *
     * 添加Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddClouddcnSubnetsTagsRequest 请求对象
     * @return CompletableFuture<AddClouddcnSubnetsTagsResponse>
     */
    public CompletableFuture<AddClouddcnSubnetsTagsResponse> addClouddcnSubnetsTagsAsync(
        AddClouddcnSubnetsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addClouddcnSubnetsTags);
    }

    /**
     * 添加Clouddcn子网标签
     *
     * 添加Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddClouddcnSubnetsTagsRequest 请求对象
     * @return AsyncInvoker<AddClouddcnSubnetsTagsRequest, AddClouddcnSubnetsTagsResponse>
     */
    public AsyncInvoker<AddClouddcnSubnetsTagsRequest, AddClouddcnSubnetsTagsResponse> addClouddcnSubnetsTagsAsyncInvoker(
        AddClouddcnSubnetsTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.addClouddcnSubnetsTags, hcClient);
    }

    /**
     * 批量添加Clouddcn子网标签
     *
     * 批量添加Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateClouddcnSubnetsTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateClouddcnSubnetsTagsResponse>
     */
    public CompletableFuture<BatchCreateClouddcnSubnetsTagsResponse> batchCreateClouddcnSubnetsTagsAsync(
        BatchCreateClouddcnSubnetsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchCreateClouddcnSubnetsTags);
    }

    /**
     * 批量添加Clouddcn子网标签
     *
     * 批量添加Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateClouddcnSubnetsTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateClouddcnSubnetsTagsRequest, BatchCreateClouddcnSubnetsTagsResponse>
     */
    public AsyncInvoker<BatchCreateClouddcnSubnetsTagsRequest, BatchCreateClouddcnSubnetsTagsResponse> batchCreateClouddcnSubnetsTagsAsyncInvoker(
        BatchCreateClouddcnSubnetsTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchCreateClouddcnSubnetsTags, hcClient);
    }

    /**
     * 批量删除Clouddcn子网标签
     *
     * 批量删除Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteClouddcnSubnetsTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteClouddcnSubnetsTagsResponse>
     */
    public CompletableFuture<BatchDeleteClouddcnSubnetsTagsResponse> batchDeleteClouddcnSubnetsTagsAsync(
        BatchDeleteClouddcnSubnetsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.batchDeleteClouddcnSubnetsTags);
    }

    /**
     * 批量删除Clouddcn子网标签
     *
     * 批量删除Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteClouddcnSubnetsTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteClouddcnSubnetsTagsRequest, BatchDeleteClouddcnSubnetsTagsResponse>
     */
    public AsyncInvoker<BatchDeleteClouddcnSubnetsTagsRequest, BatchDeleteClouddcnSubnetsTagsResponse> batchDeleteClouddcnSubnetsTagsAsyncInvoker(
        BatchDeleteClouddcnSubnetsTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.batchDeleteClouddcnSubnetsTags, hcClient);
    }

    /**
     * 创建clouddcn子网
     *
     * 创建clouddcn子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClouddcnSubnetRequest 请求对象
     * @return CompletableFuture<CreateClouddcnSubnetResponse>
     */
    public CompletableFuture<CreateClouddcnSubnetResponse> createClouddcnSubnetAsync(
        CreateClouddcnSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createClouddcnSubnet);
    }

    /**
     * 创建clouddcn子网
     *
     * 创建clouddcn子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClouddcnSubnetRequest 请求对象
     * @return AsyncInvoker<CreateClouddcnSubnetRequest, CreateClouddcnSubnetResponse>
     */
    public AsyncInvoker<CreateClouddcnSubnetRequest, CreateClouddcnSubnetResponse> createClouddcnSubnetAsyncInvoker(
        CreateClouddcnSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createClouddcnSubnet, hcClient);
    }

    /**
     * 删除clouddcn子网
     *
     * 删除clouddcn子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClouddcnSubnetRequest 请求对象
     * @return CompletableFuture<DeleteClouddcnSubnetResponse>
     */
    public CompletableFuture<DeleteClouddcnSubnetResponse> deleteClouddcnSubnetAsync(
        DeleteClouddcnSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteClouddcnSubnet);
    }

    /**
     * 删除clouddcn子网
     *
     * 删除clouddcn子网
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClouddcnSubnetRequest 请求对象
     * @return AsyncInvoker<DeleteClouddcnSubnetRequest, DeleteClouddcnSubnetResponse>
     */
    public AsyncInvoker<DeleteClouddcnSubnetRequest, DeleteClouddcnSubnetResponse> deleteClouddcnSubnetAsyncInvoker(
        DeleteClouddcnSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteClouddcnSubnet, hcClient);
    }

    /**
     * 删除Clouddcn子网标签
     *
     * 删除Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClouddcnSubnetsTagRequest 请求对象
     * @return CompletableFuture<DeleteClouddcnSubnetsTagResponse>
     */
    public CompletableFuture<DeleteClouddcnSubnetsTagResponse> deleteClouddcnSubnetsTagAsync(
        DeleteClouddcnSubnetsTagRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteClouddcnSubnetsTag);
    }

    /**
     * 删除Clouddcn子网标签
     *
     * 删除Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClouddcnSubnetsTagRequest 请求对象
     * @return AsyncInvoker<DeleteClouddcnSubnetsTagRequest, DeleteClouddcnSubnetsTagResponse>
     */
    public AsyncInvoker<DeleteClouddcnSubnetsTagRequest, DeleteClouddcnSubnetsTagResponse> deleteClouddcnSubnetsTagAsyncInvoker(
        DeleteClouddcnSubnetsTagRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteClouddcnSubnetsTag, hcClient);
    }

    /**
     * 查询clouddcn子网列表
     *
     * 查询clouddcn子网列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsRequest 请求对象
     * @return CompletableFuture<ListClouddcnSubnetsResponse>
     */
    public CompletableFuture<ListClouddcnSubnetsResponse> listClouddcnSubnetsAsync(ListClouddcnSubnetsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listClouddcnSubnets);
    }

    /**
     * 查询clouddcn子网列表
     *
     * 查询clouddcn子网列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsRequest 请求对象
     * @return AsyncInvoker<ListClouddcnSubnetsRequest, ListClouddcnSubnetsResponse>
     */
    public AsyncInvoker<ListClouddcnSubnetsRequest, ListClouddcnSubnetsResponse> listClouddcnSubnetsAsyncInvoker(
        ListClouddcnSubnetsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listClouddcnSubnets, hcClient);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsCountFilterTagsRequest 请求对象
     * @return CompletableFuture<ListClouddcnSubnetsCountFilterTagsResponse>
     */
    public CompletableFuture<ListClouddcnSubnetsCountFilterTagsResponse> listClouddcnSubnetsCountFilterTagsAsync(
        ListClouddcnSubnetsCountFilterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listClouddcnSubnetsCountFilterTags);
    }

    /**
     * 查询资源实例列表数目
     *
     * 查询资源实例列表数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsCountFilterTagsRequest 请求对象
     * @return AsyncInvoker<ListClouddcnSubnetsCountFilterTagsRequest, ListClouddcnSubnetsCountFilterTagsResponse>
     */
    public AsyncInvoker<ListClouddcnSubnetsCountFilterTagsRequest, ListClouddcnSubnetsCountFilterTagsResponse> listClouddcnSubnetsCountFilterTagsAsyncInvoker(
        ListClouddcnSubnetsCountFilterTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listClouddcnSubnetsCountFilterTags, hcClient);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsFilterTagsRequest 请求对象
     * @return CompletableFuture<ListClouddcnSubnetsFilterTagsResponse>
     */
    public CompletableFuture<ListClouddcnSubnetsFilterTagsResponse> listClouddcnSubnetsFilterTagsAsync(
        ListClouddcnSubnetsFilterTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listClouddcnSubnetsFilterTags);
    }

    /**
     * 查询资源实例列表
     *
     * 查询资源实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsFilterTagsRequest 请求对象
     * @return AsyncInvoker<ListClouddcnSubnetsFilterTagsRequest, ListClouddcnSubnetsFilterTagsResponse>
     */
    public AsyncInvoker<ListClouddcnSubnetsFilterTagsRequest, ListClouddcnSubnetsFilterTagsResponse> listClouddcnSubnetsFilterTagsAsyncInvoker(
        ListClouddcnSubnetsFilterTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listClouddcnSubnetsFilterTags, hcClient);
    }

    /**
     * 查询Clouddcn子网项目标签
     *
     * 查询Clouddcn子网的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsTagsRequest 请求对象
     * @return CompletableFuture<ListClouddcnSubnetsTagsResponse>
     */
    public CompletableFuture<ListClouddcnSubnetsTagsResponse> listClouddcnSubnetsTagsAsync(
        ListClouddcnSubnetsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listClouddcnSubnetsTags);
    }

    /**
     * 查询Clouddcn子网项目标签
     *
     * 查询Clouddcn子网的项目标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClouddcnSubnetsTagsRequest 请求对象
     * @return AsyncInvoker<ListClouddcnSubnetsTagsRequest, ListClouddcnSubnetsTagsResponse>
     */
    public AsyncInvoker<ListClouddcnSubnetsTagsRequest, ListClouddcnSubnetsTagsResponse> listClouddcnSubnetsTagsAsyncInvoker(
        ListClouddcnSubnetsTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listClouddcnSubnetsTags, hcClient);
    }

    /**
     * 查询clouddcn子网
     *
     * 查询clouddcn子网详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddcnSubnetRequest 请求对象
     * @return CompletableFuture<ShowClouddcnSubnetResponse>
     */
    public CompletableFuture<ShowClouddcnSubnetResponse> showClouddcnSubnetAsync(ShowClouddcnSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showClouddcnSubnet);
    }

    /**
     * 查询clouddcn子网
     *
     * 查询clouddcn子网详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddcnSubnetRequest 请求对象
     * @return AsyncInvoker<ShowClouddcnSubnetRequest, ShowClouddcnSubnetResponse>
     */
    public AsyncInvoker<ShowClouddcnSubnetRequest, ShowClouddcnSubnetResponse> showClouddcnSubnetAsyncInvoker(
        ShowClouddcnSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showClouddcnSubnet, hcClient);
    }

    /**
     * 查询Clouddcn子网标签
     *
     * 查询Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddcnSubnetsTagsRequest 请求对象
     * @return CompletableFuture<ShowClouddcnSubnetsTagsResponse>
     */
    public CompletableFuture<ShowClouddcnSubnetsTagsResponse> showClouddcnSubnetsTagsAsync(
        ShowClouddcnSubnetsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showClouddcnSubnetsTags);
    }

    /**
     * 查询Clouddcn子网标签
     *
     * 查询Clouddcn子网的标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddcnSubnetsTagsRequest 请求对象
     * @return AsyncInvoker<ShowClouddcnSubnetsTagsRequest, ShowClouddcnSubnetsTagsResponse>
     */
    public AsyncInvoker<ShowClouddcnSubnetsTagsRequest, ShowClouddcnSubnetsTagsResponse> showClouddcnSubnetsTagsAsyncInvoker(
        ShowClouddcnSubnetsTagsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showClouddcnSubnetsTags, hcClient);
    }

    /**
     * 更新clouddcn子网
     *
     * 更新clouddcn子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClouddcnSubnetRequest 请求对象
     * @return CompletableFuture<UpdateClouddcnSubnetResponse>
     */
    public CompletableFuture<UpdateClouddcnSubnetResponse> updateClouddcnSubnetAsync(
        UpdateClouddcnSubnetRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateClouddcnSubnet);
    }

    /**
     * 更新clouddcn子网
     *
     * 更新clouddcn子网。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClouddcnSubnetRequest 请求对象
     * @return AsyncInvoker<UpdateClouddcnSubnetRequest, UpdateClouddcnSubnetResponse>
     */
    public AsyncInvoker<UpdateClouddcnSubnetRequest, UpdateClouddcnSubnetResponse> updateClouddcnSubnetAsyncInvoker(
        UpdateClouddcnSubnetRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateClouddcnSubnet, hcClient);
    }

    /**
     * 创建地址组
     *
     * 创建地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAddressGroupRequest 请求对象
     * @return CompletableFuture<CreateAddressGroupResponse>
     */
    public CompletableFuture<CreateAddressGroupResponse> createAddressGroupAsync(CreateAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createAddressGroup);
    }

    /**
     * 创建地址组
     *
     * 创建地址组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAddressGroupRequest 请求对象
     * @return AsyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse>
     */
    public AsyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse> createAddressGroupAsyncInvoker(
        CreateAddressGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createAddressGroup, hcClient);
    }

    /**
     * 删除地址组
     *
     * 删除地址组，非强制删除，删除前请确保未被其他资源引用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressGroupRequest 请求对象
     * @return CompletableFuture<DeleteAddressGroupResponse>
     */
    public CompletableFuture<DeleteAddressGroupResponse> deleteAddressGroupAsync(DeleteAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteAddressGroup);
    }

    /**
     * 删除地址组
     *
     * 删除地址组，非强制删除，删除前请确保未被其他资源引用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAddressGroupRequest 请求对象
     * @return AsyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse>
     */
    public AsyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse> deleteAddressGroupAsyncInvoker(
        DeleteAddressGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteAddressGroup, hcClient);
    }

    /**
     * 强制删除地址组
     *
     * 强制删除地址组，删除的地址组与安全组规则关联时，会删除地址组与关联的安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpAddressGroupForceRequest 请求对象
     * @return CompletableFuture<DeleteIpAddressGroupForceResponse>
     */
    public CompletableFuture<DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForceAsync(
        DeleteIpAddressGroupForceRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteIpAddressGroupForce);
    }

    /**
     * 强制删除地址组
     *
     * 强制删除地址组，删除的地址组与安全组规则关联时，会删除地址组与关联的安全组规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpAddressGroupForceRequest 请求对象
     * @return AsyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse>
     */
    public AsyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForceAsyncInvoker(
        DeleteIpAddressGroupForceRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteIpAddressGroupForce, hcClient);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表，根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressGroupRequest 请求对象
     * @return CompletableFuture<ListAddressGroupResponse>
     */
    public CompletableFuture<ListAddressGroupResponse> listAddressGroupAsync(ListAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listAddressGroup);
    }

    /**
     * 查询地址组列表
     *
     * 查询地址组列表，根据过滤条件进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAddressGroupRequest 请求对象
     * @return AsyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse>
     */
    public AsyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse> listAddressGroupAsyncInvoker(
        ListAddressGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listAddressGroup, hcClient);
    }

    /**
     * 查询地址组
     *
     * 查询地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddressGroupRequest 请求对象
     * @return CompletableFuture<ShowAddressGroupResponse>
     */
    public CompletableFuture<ShowAddressGroupResponse> showAddressGroupAsync(ShowAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showAddressGroup);
    }

    /**
     * 查询地址组
     *
     * 查询地址组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAddressGroupRequest 请求对象
     * @return AsyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse>
     */
    public AsyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse> showAddressGroupAsyncInvoker(
        ShowAddressGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showAddressGroup, hcClient);
    }

    /**
     * 更新地址组
     *
     * 更新地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressGroupRequest 请求对象
     * @return CompletableFuture<UpdateAddressGroupResponse>
     */
    public CompletableFuture<UpdateAddressGroupResponse> updateAddressGroupAsync(UpdateAddressGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateAddressGroup);
    }

    /**
     * 更新地址组
     *
     * 更新地址组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAddressGroupRequest 请求对象
     * @return AsyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse>
     */
    public AsyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse> updateAddressGroupAsyncInvoker(
        UpdateAddressGroupRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateAddressGroup, hcClient);
    }

    /**
     * 添加VPC扩展网段
     *
     * 添加VPC的扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpcExtendCidrRequest 请求对象
     * @return CompletableFuture<AddVpcExtendCidrResponse>
     */
    public CompletableFuture<AddVpcExtendCidrResponse> addVpcExtendCidrAsync(AddVpcExtendCidrRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.addVpcExtendCidr);
    }

    /**
     * 添加VPC扩展网段
     *
     * 添加VPC的扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddVpcExtendCidrRequest 请求对象
     * @return AsyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse>
     */
    public AsyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> addVpcExtendCidrAsyncInvoker(
        AddVpcExtendCidrRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.addVpcExtendCidr, hcClient);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRequest 请求对象
     * @return CompletableFuture<CreateVpcResponse>
     */
    public CompletableFuture<CreateVpcResponse> createVpcAsync(CreateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.createVpc);
    }

    /**
     * 创建VPC
     *
     * 创建虚拟私有云
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVpcRequest 请求对象
     * @return AsyncInvoker<CreateVpcRequest, CreateVpcResponse>
     */
    public AsyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcAsyncInvoker(CreateVpcRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.createVpc, hcClient);
    }

    /**
     * 删除VPC
     *
     * 删除VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRequest 请求对象
     * @return CompletableFuture<DeleteVpcResponse>
     */
    public CompletableFuture<DeleteVpcResponse> deleteVpcAsync(DeleteVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    /**
     * 删除VPC
     *
     * 删除VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteVpcRequest 请求对象
     * @return AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse>
     */
    public AsyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcAsyncInvoker(DeleteVpcRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.deleteVpc, hcClient);
    }

    /**
     * 查询VPC列表
     *
     * 查询vpc列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsRequest 请求对象
     * @return CompletableFuture<ListVpcsResponse>
     */
    public CompletableFuture<ListVpcsResponse> listVpcsAsync(ListVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.listVpcs);
    }

    /**
     * 查询VPC列表
     *
     * 查询vpc列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVpcsRequest 请求对象
     * @return AsyncInvoker<ListVpcsRequest, ListVpcsResponse>
     */
    public AsyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsAsyncInvoker(ListVpcsRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.listVpcs, hcClient);
    }

    /**
     * 移除VPC扩展网段
     *
     * 移除VPC扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpcExtendCidrRequest 请求对象
     * @return CompletableFuture<RemoveVpcExtendCidrResponse>
     */
    public CompletableFuture<RemoveVpcExtendCidrResponse> removeVpcExtendCidrAsync(RemoveVpcExtendCidrRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.removeVpcExtendCidr);
    }

    /**
     * 移除VPC扩展网段
     *
     * 移除VPC扩展网段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveVpcExtendCidrRequest 请求对象
     * @return AsyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse>
     */
    public AsyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> removeVpcExtendCidrAsyncInvoker(
        RemoveVpcExtendCidrRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.removeVpcExtendCidr, hcClient);
    }

    /**
     * 查询VPC详情
     *
     * 查询vpc详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRequest 请求对象
     * @return CompletableFuture<ShowVpcResponse>
     */
    public CompletableFuture<ShowVpcResponse> showVpcAsync(ShowVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.showVpc);
    }

    /**
     * 查询VPC详情
     *
     * 查询vpc详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVpcRequest 请求对象
     * @return AsyncInvoker<ShowVpcRequest, ShowVpcResponse>
     */
    public AsyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcAsyncInvoker(ShowVpcRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.showVpc, hcClient);
    }

    /**
     * 更新VPC
     *
     * 更新vpc
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcRequest 请求对象
     * @return CompletableFuture<UpdateVpcResponse>
     */
    public CompletableFuture<UpdateVpcResponse> updateVpcAsync(UpdateVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, VpcMeta.updateVpc);
    }

    /**
     * 更新VPC
     *
     * 更新vpc
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVpcRequest 请求对象
     * @return AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse>
     */
    public AsyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcAsyncInvoker(UpdateVpcRequest request) {
        return new AsyncInvoker<>(request, VpcMeta.updateVpc, hcClient);
    }

}
