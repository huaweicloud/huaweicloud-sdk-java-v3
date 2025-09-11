package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ecs.v2.model.AcceptScheduledEventRequest;
import com.huaweicloud.sdk.ecs.v2.model.AcceptScheduledEventResponse;
import com.huaweicloud.sdk.ecs.v2.model.AddServerGroupMemberRequest;
import com.huaweicloud.sdk.ecs.v2.model.AddServerGroupMemberResponse;
import com.huaweicloud.sdk.ecs.v2.model.AssociateServerVirtualIpRequest;
import com.huaweicloud.sdk.ecs.v2.model.AssociateServerVirtualIpResponse;
import com.huaweicloud.sdk.ecs.v2.model.AttachServerVolumeRequest;
import com.huaweicloud.sdk.ecs.v2.model.AttachServerVolumeResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchAddServerNicsRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchAddServerNicsResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchAttachSharableVolumesRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchAttachSharableVolumesResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchCreateServerTagsRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchCreateServerTagsResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerNicsRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerNicsResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerTagsRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchDeleteServerTagsResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchDetachVolumesRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchDetachVolumesResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchResetServersPasswordRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchResetServersPasswordResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchResizeServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchResizeServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchUpdateServersNameRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchUpdateServersNameResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerChargeModeRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerChargeModeResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerNetworkInterfaceRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerNetworkInterfaceResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeVpcRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeVpcResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreateLaunchTemplateRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreateLaunchTemplateResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreatePostPaidServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreatePostPaidServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreateServerGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreateServerGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreateServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreateServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteLaunchTemplatesRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteLaunchTemplatesResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteRecycleBinServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteRecycleBinServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerGroupMemberRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerGroupMemberResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerMetadataRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerMetadataResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerPasswordRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServerPasswordResponse;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.DeleteServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.DetachServerVolumeRequest;
import com.huaweicloud.sdk.ecs.v2.model.DetachServerVolumeResponse;
import com.huaweicloud.sdk.ecs.v2.model.DisassociateServerVirtualIpRequest;
import com.huaweicloud.sdk.ecs.v2.model.DisassociateServerVirtualIpResponse;
import com.huaweicloud.sdk.ecs.v2.model.ExecuteServerDumpRequest;
import com.huaweicloud.sdk.ecs.v2.model.ExecuteServerDumpResponse;
import com.huaweicloud.sdk.ecs.v2.model.ExecuteServerRedeployRequest;
import com.huaweicloud.sdk.ecs.v2.model.ExecuteServerRedeployResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListCloudServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListCloudServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorSellPoliciesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorSellPoliciesResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListLaunchTemplateVersionsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListLaunchTemplateVersionsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListRecycleBinServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListRecycleBinServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListResizeFlavorsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListResizeFlavorsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListScheduledEventsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListScheduledEventsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerAzInfoRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerAzInfoResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerBlockDevicesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerBlockDevicesResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerGroupsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerGroupsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerInterfacesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerInterfacesResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerTagsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerTagsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerVolumeAttachmentsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerVolumeAttachmentsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServersByTagRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServersByTagResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServersDetailsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServersDetailsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListTemplatesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListTemplatesResponse;
import com.huaweicloud.sdk.ecs.v2.model.MigrateServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.MigrateServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaAssociateSecurityGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaAttachInterfaceRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaAttachInterfaceResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateKeypairRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateKeypairResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaDeleteKeypairRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaDeleteKeypairResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaDeleteServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaDeleteServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaDisassociateSecurityGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaDisassociateSecurityGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListAvailabilityZonesRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListAvailabilityZonesResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListKeypairsRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListKeypairsResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServerSecurityGroupsRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServerSecurityGroupsResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServersDetailsRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServersDetailsResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaListVersionsRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaListVersionsResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowFlavorExtraSpecsRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowFlavorExtraSpecsResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowKeypairRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowKeypairResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerInterfaceRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerInterfaceResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowVersionRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowVersionResponse;
import com.huaweicloud.sdk.ecs.v2.model.RegisterServerMonitorRequest;
import com.huaweicloud.sdk.ecs.v2.model.RegisterServerMonitorResponse;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithoutCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ReinstallServerWithoutCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.ResetServerPasswordRequest;
import com.huaweicloud.sdk.ecs.v2.model.ResetServerPasswordResponse;
import com.huaweicloud.sdk.ecs.v2.model.ResizePostPaidServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.ResizePostPaidServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.ResizeServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.ResizeServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.RevertRecycleBinServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.RevertRecycleBinServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowAppendableVolumeQuotaRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowAppendableVolumeQuotaResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowFlavorCapacityRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowFlavorCapacityResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowMetadataOptionsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowMetadataOptionsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowRecycleBinRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowRecycleBinResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowResetPasswordFlagRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowResetPasswordFlagResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerAttachableNicNumRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerAttachableNicNumResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerBlockDeviceRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerBlockDeviceResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerLimitsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerLimitsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerPasswordRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerPasswordResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerRemoteConsoleRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerRemoteConsoleResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerTagsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerTagsResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateMetadataOptionsRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateMetadataOptionsResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateRecycleBinPolicyRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateRecycleBinPolicyResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateRecycleBinRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateRecycleBinResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateScheduledEventRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateScheduledEventResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerBlockDeviceRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerBlockDeviceResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerInterfaceRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerInterfaceResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerMetadataRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerMetadataResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerResponse;

import java.util.concurrent.CompletableFuture;

public class EcsAsyncClient {

    protected HcClient hcClient;

    public EcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcsAsyncClient> newBuilder() {
        ClientBuilder<EcsAsyncClient> clientBuilder = new ClientBuilder<>(EcsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 接受并授权执行计划事件操作
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScheduledEventRequest 请求对象
     * @return CompletableFuture<AcceptScheduledEventResponse>
     */
    public CompletableFuture<AcceptScheduledEventResponse> acceptScheduledEventAsync(
        AcceptScheduledEventRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.acceptScheduledEvent);
    }

    /**
     * 接受并授权执行计划事件操作
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AcceptScheduledEventRequest 请求对象
     * @return AsyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse>
     */
    public AsyncInvoker<AcceptScheduledEventRequest, AcceptScheduledEventResponse> acceptScheduledEventAsyncInvoker(
        AcceptScheduledEventRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.acceptScheduledEvent, hcClient);
    }

    /**
     * 添加云服务器组成员
     *
     * 将云服务器加入云服务器组。添加成功后，如果该云服务器组是反亲和性策略的，则该云服务器与云服务器组中的其他成员尽量分散地创建在不同主机上。如果该云服务器时故障域类型的，则该云服务器会拥有故障域属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServerGroupMemberRequest 请求对象
     * @return CompletableFuture<AddServerGroupMemberResponse>
     */
    public CompletableFuture<AddServerGroupMemberResponse> addServerGroupMemberAsync(
        AddServerGroupMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.addServerGroupMember);
    }

    /**
     * 添加云服务器组成员
     *
     * 将云服务器加入云服务器组。添加成功后，如果该云服务器组是反亲和性策略的，则该云服务器与云服务器组中的其他成员尽量分散地创建在不同主机上。如果该云服务器时故障域类型的，则该云服务器会拥有故障域属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServerGroupMemberRequest 请求对象
     * @return AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse>
     */
    public AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse> addServerGroupMemberAsyncInvoker(
        AddServerGroupMemberRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.addServerGroupMember, hcClient);
    }

    /**
     * 云服务器网卡配置虚拟IP地址
     *
     * 虚拟IP地址用于为网卡提供第二个IP地址，同时支持与多个弹性云服务器的网卡绑定，从而实现多个弹性云服务器之间的高可用性。
     * 
     * 该接口用于给云服务器网卡配置虚拟IP地址：
     * 
     * - 当指定的IP地址是一个不存在的虚拟IP地址时，系统会创建该虚拟IP，并绑定至对应网卡。
     * 
     * - 当指定的IP地址是一个已经创建好的私有IP时，系统会将指定的网卡和虚拟IP绑定。如果该IP的device_owner为空，则仅支持VPC内二三层通信；如果该IP的device_owner为neutron:VIP_PORT，则支持VPC内二三层通信、VPC之间对等连接访问，以及弹性公网IP、VPN、云专线等Internet接入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateServerVirtualIpRequest 请求对象
     * @return CompletableFuture<AssociateServerVirtualIpResponse>
     */
    public CompletableFuture<AssociateServerVirtualIpResponse> associateServerVirtualIpAsync(
        AssociateServerVirtualIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.associateServerVirtualIp);
    }

    /**
     * 云服务器网卡配置虚拟IP地址
     *
     * 虚拟IP地址用于为网卡提供第二个IP地址，同时支持与多个弹性云服务器的网卡绑定，从而实现多个弹性云服务器之间的高可用性。
     * 
     * 该接口用于给云服务器网卡配置虚拟IP地址：
     * 
     * - 当指定的IP地址是一个不存在的虚拟IP地址时，系统会创建该虚拟IP，并绑定至对应网卡。
     * 
     * - 当指定的IP地址是一个已经创建好的私有IP时，系统会将指定的网卡和虚拟IP绑定。如果该IP的device_owner为空，则仅支持VPC内二三层通信；如果该IP的device_owner为neutron:VIP_PORT，则支持VPC内二三层通信、VPC之间对等连接访问，以及弹性公网IP、VPN、云专线等Internet接入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateServerVirtualIpRequest 请求对象
     * @return AsyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse>
     */
    public AsyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> associateServerVirtualIpAsyncInvoker(
        AssociateServerVirtualIpRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.associateServerVirtualIp, hcClient);
    }

    /**
     * 弹性云服务器挂载磁盘
     *
     * 把磁盘挂载到弹性云服务器上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachServerVolumeRequest 请求对象
     * @return CompletableFuture<AttachServerVolumeResponse>
     */
    public CompletableFuture<AttachServerVolumeResponse> attachServerVolumeAsync(AttachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.attachServerVolume);
    }

    /**
     * 弹性云服务器挂载磁盘
     *
     * 把磁盘挂载到弹性云服务器上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachServerVolumeRequest 请求对象
     * @return AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse>
     */
    public AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolumeAsyncInvoker(
        AttachServerVolumeRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.attachServerVolume, hcClient);
    }

    /**
     * 批量添加云服务器网卡
     *
     * 给云服务器添加一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddServerNicsRequest 请求对象
     * @return CompletableFuture<BatchAddServerNicsResponse>
     */
    public CompletableFuture<BatchAddServerNicsResponse> batchAddServerNicsAsync(BatchAddServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchAddServerNics);
    }

    /**
     * 批量添加云服务器网卡
     *
     * 给云服务器添加一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddServerNicsRequest 请求对象
     * @return AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse>
     */
    public AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse> batchAddServerNicsAsyncInvoker(
        BatchAddServerNicsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchAddServerNics, hcClient);
    }

    /**
     * 批量挂载指定共享盘
     *
     * 将指定的共享磁盘一次性挂载到多个弹性云服务器，实现批量挂载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachSharableVolumesRequest 请求对象
     * @return CompletableFuture<BatchAttachSharableVolumesResponse>
     */
    public CompletableFuture<BatchAttachSharableVolumesResponse> batchAttachSharableVolumesAsync(
        BatchAttachSharableVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchAttachSharableVolumes);
    }

    /**
     * 批量挂载指定共享盘
     *
     * 将指定的共享磁盘一次性挂载到多个弹性云服务器，实现批量挂载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAttachSharableVolumesRequest 请求对象
     * @return AsyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse>
     */
    public AsyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> batchAttachSharableVolumesAsyncInvoker(
        BatchAttachSharableVolumesRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchAttachSharableVolumes, hcClient);
    }

    /**
     * 批量添加云服务器标签
     *
     * - 为指定云服务器批量添加标签。
     * 
     * - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateServerTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateServerTagsResponse>
     */
    public CompletableFuture<BatchCreateServerTagsResponse> batchCreateServerTagsAsync(
        BatchCreateServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchCreateServerTags);
    }

    /**
     * 批量添加云服务器标签
     *
     * - 为指定云服务器批量添加标签。
     * 
     * - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse>
     */
    public AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> batchCreateServerTagsAsyncInvoker(
        BatchCreateServerTagsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchCreateServerTags, hcClient);
    }

    /**
     * 批量删除云服务器网卡
     *
     * 卸载并删除云服务器中的一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerNicsRequest 请求对象
     * @return CompletableFuture<BatchDeleteServerNicsResponse>
     */
    public CompletableFuture<BatchDeleteServerNicsResponse> batchDeleteServerNicsAsync(
        BatchDeleteServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerNics);
    }

    /**
     * 批量删除云服务器网卡
     *
     * 卸载并删除云服务器中的一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerNicsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse>
     */
    public AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> batchDeleteServerNicsAsyncInvoker(
        BatchDeleteServerNicsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchDeleteServerNics, hcClient);
    }

    /**
     * 批量删除云服务器标签
     *
     * - 为指定云服务器批量删除标签。
     * 
     * - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteServerTagsResponse>
     */
    public CompletableFuture<BatchDeleteServerTagsResponse> batchDeleteServerTagsAsync(
        BatchDeleteServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerTags);
    }

    /**
     * 批量删除云服务器标签
     *
     * - 为指定云服务器批量删除标签。
     * 
     * - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse>
     */
    public AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> batchDeleteServerTagsAsyncInvoker(
        BatchDeleteServerTagsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchDeleteServerTags, hcClient);
    }

    /**
     * 批量卸载卷
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachVolumesRequest 请求对象
     * @return CompletableFuture<BatchDetachVolumesResponse>
     */
    public CompletableFuture<BatchDetachVolumesResponse> batchDetachVolumesAsync(BatchDetachVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDetachVolumes);
    }

    /**
     * 批量卸载卷
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDetachVolumesRequest 请求对象
     * @return AsyncInvoker<BatchDetachVolumesRequest, BatchDetachVolumesResponse>
     */
    public AsyncInvoker<BatchDetachVolumesRequest, BatchDetachVolumesResponse> batchDetachVolumesAsyncInvoker(
        BatchDetachVolumesRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchDetachVolumes, hcClient);
    }

    /**
     * 批量重启云服务器
     *
     * 根据给定的云服务器ID列表，批量重启云服务器，一次最多可以重启1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootServersRequest 请求对象
     * @return CompletableFuture<BatchRebootServersResponse>
     */
    public CompletableFuture<BatchRebootServersResponse> batchRebootServersAsync(BatchRebootServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchRebootServers);
    }

    /**
     * 批量重启云服务器
     *
     * 根据给定的云服务器ID列表，批量重启云服务器，一次最多可以重启1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootServersRequest 请求对象
     * @return AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse>
     */
    public AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse> batchRebootServersAsyncInvoker(
        BatchRebootServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchRebootServers, hcClient);
    }

    /**
     * 批量重置弹性云服务器密码
     *
     * 批量重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetServersPasswordRequest 请求对象
     * @return CompletableFuture<BatchResetServersPasswordResponse>
     */
    public CompletableFuture<BatchResetServersPasswordResponse> batchResetServersPasswordAsync(
        BatchResetServersPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchResetServersPassword);
    }

    /**
     * 批量重置弹性云服务器密码
     *
     * 批量重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetServersPasswordRequest 请求对象
     * @return AsyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse>
     */
    public AsyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> batchResetServersPasswordAsyncInvoker(
        BatchResetServersPasswordRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchResetServersPassword, hcClient);
    }

    /**
     * 批量变更云服务器规格
     *
     * 批量变更云服务器规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResizeServersRequest 请求对象
     * @return CompletableFuture<BatchResizeServersResponse>
     */
    public CompletableFuture<BatchResizeServersResponse> batchResizeServersAsync(BatchResizeServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchResizeServers);
    }

    /**
     * 批量变更云服务器规格
     *
     * 批量变更云服务器规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResizeServersRequest 请求对象
     * @return AsyncInvoker<BatchResizeServersRequest, BatchResizeServersResponse>
     */
    public AsyncInvoker<BatchResizeServersRequest, BatchResizeServersResponse> batchResizeServersAsyncInvoker(
        BatchResizeServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchResizeServers, hcClient);
    }

    /**
     * 批量启动云服务器
     *
     * 根据给定的云服务器ID列表，批量启动云服务器，一次最多可以启动1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartServersRequest 请求对象
     * @return CompletableFuture<BatchStartServersResponse>
     */
    public CompletableFuture<BatchStartServersResponse> batchStartServersAsync(BatchStartServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStartServers);
    }

    /**
     * 批量启动云服务器
     *
     * 根据给定的云服务器ID列表，批量启动云服务器，一次最多可以启动1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartServersRequest 请求对象
     * @return AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse>
     */
    public AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse> batchStartServersAsyncInvoker(
        BatchStartServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchStartServers, hcClient);
    }

    /**
     * 批量关闭云服务器
     *
     * 根据给定的云服务器ID列表，批量关闭云服务器，一次最多可以关闭1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopServersRequest 请求对象
     * @return CompletableFuture<BatchStopServersResponse>
     */
    public CompletableFuture<BatchStopServersResponse> batchStopServersAsync(BatchStopServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStopServers);
    }

    /**
     * 批量关闭云服务器
     *
     * 根据给定的云服务器ID列表，批量关闭云服务器，一次最多可以关闭1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopServersRequest 请求对象
     * @return AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse>
     */
    public AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse> batchStopServersAsyncInvoker(
        BatchStopServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchStopServers, hcClient);
    }

    /**
     * 批量修改弹性云服务器
     *
     * 批量修改弹性云服务器信息。
     * 当前仅支持批量修改云服务器名称，一次最多可以修改1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateServersNameRequest 请求对象
     * @return CompletableFuture<BatchUpdateServersNameResponse>
     */
    public CompletableFuture<BatchUpdateServersNameResponse> batchUpdateServersNameAsync(
        BatchUpdateServersNameRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchUpdateServersName);
    }

    /**
     * 批量修改弹性云服务器
     *
     * 批量修改弹性云服务器信息。
     * 当前仅支持批量修改云服务器名称，一次最多可以修改1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateServersNameRequest 请求对象
     * @return AsyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse>
     */
    public AsyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> batchUpdateServersNameAsyncInvoker(
        BatchUpdateServersNameRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.batchUpdateServersName, hcClient);
    }

    /**
     * 更换云服务器计费模式
     *
     * 更换云服务器的计费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerChargeModeRequest 请求对象
     * @return CompletableFuture<ChangeServerChargeModeResponse>
     */
    public CompletableFuture<ChangeServerChargeModeResponse> changeServerChargeModeAsync(
        ChangeServerChargeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.changeServerChargeMode);
    }

    /**
     * 更换云服务器计费模式
     *
     * 更换云服务器的计费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerChargeModeRequest 请求对象
     * @return AsyncInvoker<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse>
     */
    public AsyncInvoker<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse> changeServerChargeModeAsyncInvoker(
        ChangeServerChargeModeRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.changeServerChargeMode, hcClient);
    }

    /**
     * 更新云服务器指定网卡属性
     *
     * 更新云服务器指定网卡属性，当前仅支持更新网卡IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerNetworkInterfaceRequest 请求对象
     * @return CompletableFuture<ChangeServerNetworkInterfaceResponse>
     */
    public CompletableFuture<ChangeServerNetworkInterfaceResponse> changeServerNetworkInterfaceAsync(
        ChangeServerNetworkInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.changeServerNetworkInterface);
    }

    /**
     * 更新云服务器指定网卡属性
     *
     * 更新云服务器指定网卡属性，当前仅支持更新网卡IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerNetworkInterfaceRequest 请求对象
     * @return AsyncInvoker<ChangeServerNetworkInterfaceRequest, ChangeServerNetworkInterfaceResponse>
     */
    public AsyncInvoker<ChangeServerNetworkInterfaceRequest, ChangeServerNetworkInterfaceResponse> changeServerNetworkInterfaceAsyncInvoker(
        ChangeServerNetworkInterfaceRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.changeServerNetworkInterface, hcClient);
    }

    /**
     * 切换弹性云服务器操作系统(安装Cloud init)
     *
     * 切换弹性云服务器操作系统。支持弹性云服务器数据盘不变的情况下，使用新镜像重装系统盘。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至弹性云服务器，实现切换操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerOsWithCloudInitRequest 请求对象
     * @return CompletableFuture<ChangeServerOsWithCloudInitResponse>
     */
    public CompletableFuture<ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitAsync(
        ChangeServerOsWithCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.changeServerOsWithCloudInit);
    }

    /**
     * 切换弹性云服务器操作系统(安装Cloud init)
     *
     * 切换弹性云服务器操作系统。支持弹性云服务器数据盘不变的情况下，使用新镜像重装系统盘。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至弹性云服务器，实现切换操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerOsWithCloudInitRequest 请求对象
     * @return AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse>
     */
    public AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitAsyncInvoker(
        ChangeServerOsWithCloudInitRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.changeServerOsWithCloudInit, hcClient);
    }

    /**
     * 切换弹性云服务器操作系统(未安装Cloud init)
     *
     * 切换弹性云服务器操作系统。
     * 
     * 该接口支持未安装Cloud-init或Cloudbase-init的镜像使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerOsWithoutCloudInitRequest 请求对象
     * @return CompletableFuture<ChangeServerOsWithoutCloudInitResponse>
     */
    public CompletableFuture<ChangeServerOsWithoutCloudInitResponse> changeServerOsWithoutCloudInitAsync(
        ChangeServerOsWithoutCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.changeServerOsWithoutCloudInit);
    }

    /**
     * 切换弹性云服务器操作系统(未安装Cloud init)
     *
     * 切换弹性云服务器操作系统。
     * 
     * 该接口支持未安装Cloud-init或Cloudbase-init的镜像使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeServerOsWithoutCloudInitRequest 请求对象
     * @return AsyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse>
     */
    public AsyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> changeServerOsWithoutCloudInitAsyncInvoker(
        ChangeServerOsWithoutCloudInitRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.changeServerOsWithoutCloudInit, hcClient);
    }

    /**
     * 云服务器切换虚拟私有云
     *
     * 云服务器切换虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVpcRequest 请求对象
     * @return CompletableFuture<ChangeVpcResponse>
     */
    public CompletableFuture<ChangeVpcResponse> changeVpcAsync(ChangeVpcRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.changeVpc);
    }

    /**
     * 云服务器切换虚拟私有云
     *
     * 云服务器切换虚拟私有云。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeVpcRequest 请求对象
     * @return AsyncInvoker<ChangeVpcRequest, ChangeVpcResponse>
     */
    public AsyncInvoker<ChangeVpcRequest, ChangeVpcResponse> changeVpcAsyncInvoker(ChangeVpcRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.changeVpc, hcClient);
    }

    /**
     * 创建模板
     *
     * 创建启动模板。将创建一个全新的模板，并自动生成版本号为1的作为默认版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLaunchTemplateRequest 请求对象
     * @return CompletableFuture<CreateLaunchTemplateResponse>
     */
    public CompletableFuture<CreateLaunchTemplateResponse> createLaunchTemplateAsync(
        CreateLaunchTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createLaunchTemplate);
    }

    /**
     * 创建模板
     *
     * 创建启动模板。将创建一个全新的模板，并自动生成版本号为1的作为默认版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLaunchTemplateRequest 请求对象
     * @return AsyncInvoker<CreateLaunchTemplateRequest, CreateLaunchTemplateResponse>
     */
    public AsyncInvoker<CreateLaunchTemplateRequest, CreateLaunchTemplateResponse> createLaunchTemplateAsyncInvoker(
        CreateLaunchTemplateRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.createLaunchTemplate, hcClient);
    }

    /**
     * 创建云服务器(按需)
     *
     * 创建一台或多台[按需付费](https://support.huaweicloud.com/productdesc-ecs/ecs_01_0065.html)方式的云服务器。
     * 
     * 弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。
     * 
     * - 密钥对
     * 密钥对指使用密钥对作为弹性云服务器的鉴权方式。
     * 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。
     * 
     * - 密码
     * 密码指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。
     * 
     * 接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。
     * 
     * &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidServersRequest 请求对象
     * @return CompletableFuture<CreatePostPaidServersResponse>
     */
    public CompletableFuture<CreatePostPaidServersResponse> createPostPaidServersAsync(
        CreatePostPaidServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createPostPaidServers);
    }

    /**
     * 创建云服务器(按需)
     *
     * 创建一台或多台[按需付费](https://support.huaweicloud.com/productdesc-ecs/ecs_01_0065.html)方式的云服务器。
     * 
     * 弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。
     * 
     * - 密钥对
     * 密钥对指使用密钥对作为弹性云服务器的鉴权方式。
     * 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。
     * 
     * - 密码
     * 密码指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。
     * 
     * 接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。
     * 
     * &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostPaidServersRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse>
     */
    public AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse> createPostPaidServersAsyncInvoker(
        CreatePostPaidServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.createPostPaidServers, hcClient);
    }

    /**
     * 创建云服务器组
     *
     * 创建弹性云服务器组。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServerGroupRequest 请求对象
     * @return CompletableFuture<CreateServerGroupResponse>
     */
    public CompletableFuture<CreateServerGroupResponse> createServerGroupAsync(CreateServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createServerGroup);
    }

    /**
     * 创建云服务器组
     *
     * 创建弹性云服务器组。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServerGroupRequest 请求对象
     * @return AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>
     */
    public AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupAsyncInvoker(
        CreateServerGroupRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.createServerGroup, hcClient);
    }

    /**
     * 创建云服务器
     *
     * 创建一台或多台云服务器。
     * 
     * 指该接口兼容《弹性云服务器接口参考》创建云服务器v1的功能，同时合入新功能，支持创建[包年/包月](https://support.huaweicloud.com/productdesc-ecs/ecs_01_0065.html)的弹性云服务器。
     * 
     * 弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。
     * 
     * - 密钥对
     * 
     * 指使用密钥对作为弹性云服务器的鉴权方式。
     * 
     * 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。
     * 
     * - 密码
     * 
     * 指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。
     * 
     * 接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。
     * 
     * &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     * 
     * 购买操作示例：
     * - [使用API购买ECS过程中常见问题及处理方法](https://support.huaweicloud.com/api-ecs/ecs_04_0007.html)
     * - [获取Token并检验Token的有效期 ](https://support.huaweicloud.com/api-ecs/ecs_04_0008.html)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServersRequest 请求对象
     * @return CompletableFuture<CreateServersResponse>
     */
    public CompletableFuture<CreateServersResponse> createServersAsync(CreateServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createServers);
    }

    /**
     * 创建云服务器
     *
     * 创建一台或多台云服务器。
     * 
     * 指该接口兼容《弹性云服务器接口参考》创建云服务器v1的功能，同时合入新功能，支持创建[包年/包月](https://support.huaweicloud.com/productdesc-ecs/ecs_01_0065.html)的弹性云服务器。
     * 
     * 弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。
     * 
     * - 密钥对
     * 
     * 指使用密钥对作为弹性云服务器的鉴权方式。
     * 
     * 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。
     * 
     * - 密码
     * 
     * 指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。
     * 
     * 接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。
     * 
     * &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     * 
     * 购买操作示例：
     * - [使用API购买ECS过程中常见问题及处理方法](https://support.huaweicloud.com/api-ecs/ecs_04_0007.html)
     * - [获取Token并检验Token的有效期 ](https://support.huaweicloud.com/api-ecs/ecs_04_0008.html)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServersRequest 请求对象
     * @return AsyncInvoker<CreateServersRequest, CreateServersResponse>
     */
    public AsyncInvoker<CreateServersRequest, CreateServersResponse> createServersAsyncInvoker(
        CreateServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.createServers, hcClient);
    }

    /**
     * 删除模板
     *
     * 删除启动模板。删除一个启动模板。并同时删除模板下所有的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLaunchTemplatesRequest 请求对象
     * @return CompletableFuture<DeleteLaunchTemplatesResponse>
     */
    public CompletableFuture<DeleteLaunchTemplatesResponse> deleteLaunchTemplatesAsync(
        DeleteLaunchTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteLaunchTemplates);
    }

    /**
     * 删除模板
     *
     * 删除启动模板。删除一个启动模板。并同时删除模板下所有的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLaunchTemplatesRequest 请求对象
     * @return AsyncInvoker<DeleteLaunchTemplatesRequest, DeleteLaunchTemplatesResponse>
     */
    public AsyncInvoker<DeleteLaunchTemplatesRequest, DeleteLaunchTemplatesResponse> deleteLaunchTemplatesAsyncInvoker(
        DeleteLaunchTemplatesRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.deleteLaunchTemplates, hcClient);
    }

    /**
     * 删除回收站中虚拟机
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecycleBinServerRequest 请求对象
     * @return CompletableFuture<DeleteRecycleBinServerResponse>
     */
    public CompletableFuture<DeleteRecycleBinServerResponse> deleteRecycleBinServerAsync(
        DeleteRecycleBinServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteRecycleBinServer);
    }

    /**
     * 删除回收站中虚拟机
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecycleBinServerRequest 请求对象
     * @return AsyncInvoker<DeleteRecycleBinServerRequest, DeleteRecycleBinServerResponse>
     */
    public AsyncInvoker<DeleteRecycleBinServerRequest, DeleteRecycleBinServerResponse> deleteRecycleBinServerAsyncInvoker(
        DeleteRecycleBinServerRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.deleteRecycleBinServer, hcClient);
    }

    /**
     * 删除云服务器组
     *
     * 删除云服务器组。
     * 
     * 与原生的删除云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupRequest 请求对象
     * @return CompletableFuture<DeleteServerGroupResponse>
     */
    public CompletableFuture<DeleteServerGroupResponse> deleteServerGroupAsync(DeleteServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerGroup);
    }

    /**
     * 删除云服务器组
     *
     * 删除云服务器组。
     * 
     * 与原生的删除云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupRequest 请求对象
     * @return AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse>
     */
    public AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse> deleteServerGroupAsyncInvoker(
        DeleteServerGroupRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.deleteServerGroup, hcClient);
    }

    /**
     * 删除云服务器组成员
     *
     * 将弹性云服务器移出云服务器组。移出后，该云服务器与云服务器组中的成员不再遵从反亲和策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupMemberRequest 请求对象
     * @return CompletableFuture<DeleteServerGroupMemberResponse>
     */
    public CompletableFuture<DeleteServerGroupMemberResponse> deleteServerGroupMemberAsync(
        DeleteServerGroupMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerGroupMember);
    }

    /**
     * 删除云服务器组成员
     *
     * 将弹性云服务器移出云服务器组。移出后，该云服务器与云服务器组中的成员不再遵从反亲和策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerGroupMemberRequest 请求对象
     * @return AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse>
     */
    public AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> deleteServerGroupMemberAsyncInvoker(
        DeleteServerGroupMemberRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.deleteServerGroupMember, hcClient);
    }

    /**
     * 删除云服务器指定元数据
     *
     * 删除云服务器指定元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerMetadataRequest 请求对象
     * @return CompletableFuture<DeleteServerMetadataResponse>
     */
    public CompletableFuture<DeleteServerMetadataResponse> deleteServerMetadataAsync(
        DeleteServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerMetadata);
    }

    /**
     * 删除云服务器指定元数据
     *
     * 删除云服务器指定元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerMetadataRequest 请求对象
     * @return AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse>
     */
    public AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse> deleteServerMetadataAsyncInvoker(
        DeleteServerMetadataRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.deleteServerMetadata, hcClient);
    }

    /**
     * 云服务器清除密码(企业项目)
     *
     * 清除Windows云服务器初始安装时系统生成的密码记录。清除密码后，不影响云服务器密码登录功能，但不能再使用获取密码功能来查询该云服务器密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerPasswordRequest 请求对象
     * @return CompletableFuture<DeleteServerPasswordResponse>
     */
    public CompletableFuture<DeleteServerPasswordResponse> deleteServerPasswordAsync(
        DeleteServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerPassword);
    }

    /**
     * 云服务器清除密码(企业项目)
     *
     * 清除Windows云服务器初始安装时系统生成的密码记录。清除密码后，不影响云服务器密码登录功能，但不能再使用获取密码功能来查询该云服务器密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerPasswordRequest 请求对象
     * @return AsyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse>
     */
    public AsyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse> deleteServerPasswordAsyncInvoker(
        DeleteServerPasswordRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.deleteServerPassword, hcClient);
    }

    /**
     * 删除云服务器
     *
     * 根据指定的云服务器ID列表，删除云服务器。
     * 
     * 系统支持删除单台云服务器和批量删除多台云服务器操作，批量删除云服务器时，一次最多可以删除1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServersRequest 请求对象
     * @return CompletableFuture<DeleteServersResponse>
     */
    public CompletableFuture<DeleteServersResponse> deleteServersAsync(DeleteServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServers);
    }

    /**
     * 删除云服务器
     *
     * 根据指定的云服务器ID列表，删除云服务器。
     * 
     * 系统支持删除单台云服务器和批量删除多台云服务器操作，批量删除云服务器时，一次最多可以删除1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServersRequest 请求对象
     * @return AsyncInvoker<DeleteServersRequest, DeleteServersResponse>
     */
    public AsyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersAsyncInvoker(
        DeleteServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.deleteServers, hcClient);
    }

    /**
     * 弹性云服务器卸载磁盘
     *
     * 从弹性云服务器中卸载磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachServerVolumeRequest 请求对象
     * @return CompletableFuture<DetachServerVolumeResponse>
     */
    public CompletableFuture<DetachServerVolumeResponse> detachServerVolumeAsync(DetachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.detachServerVolume);
    }

    /**
     * 弹性云服务器卸载磁盘
     *
     * 从弹性云服务器中卸载磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachServerVolumeRequest 请求对象
     * @return AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse>
     */
    public AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse> detachServerVolumeAsyncInvoker(
        DetachServerVolumeRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.detachServerVolume, hcClient);
    }

    /**
     * 云服务器网卡解绑虚拟IP地址
     *
     * 虚拟IP地址用于为网卡提供第二个IP地址，同时支持与多个弹性云服务器的网卡绑定，从而实现多个弹性云服务器之间的高可用性。
     * 
     * 该接口用于解绑定弹性云服务器网卡的虚拟IP地址。解绑后，网卡不会被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateServerVirtualIpRequest 请求对象
     * @return CompletableFuture<DisassociateServerVirtualIpResponse>
     */
    public CompletableFuture<DisassociateServerVirtualIpResponse> disassociateServerVirtualIpAsync(
        DisassociateServerVirtualIpRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.disassociateServerVirtualIp);
    }

    /**
     * 云服务器网卡解绑虚拟IP地址
     *
     * 虚拟IP地址用于为网卡提供第二个IP地址，同时支持与多个弹性云服务器的网卡绑定，从而实现多个弹性云服务器之间的高可用性。
     * 
     * 该接口用于解绑定弹性云服务器网卡的虚拟IP地址。解绑后，网卡不会被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateServerVirtualIpRequest 请求对象
     * @return AsyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse>
     */
    public AsyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> disassociateServerVirtualIpAsyncInvoker(
        DisassociateServerVirtualIpRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.disassociateServerVirtualIp, hcClient);
    }

    /**
     * 触发云服务器内核dump
     *
     * 触发云服务器内核dump
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteServerDumpRequest 请求对象
     * @return CompletableFuture<ExecuteServerDumpResponse>
     */
    public CompletableFuture<ExecuteServerDumpResponse> executeServerDumpAsync(ExecuteServerDumpRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.executeServerDump);
    }

    /**
     * 触发云服务器内核dump
     *
     * 触发云服务器内核dump
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteServerDumpRequest 请求对象
     * @return AsyncInvoker<ExecuteServerDumpRequest, ExecuteServerDumpResponse>
     */
    public AsyncInvoker<ExecuteServerDumpRequest, ExecuteServerDumpResponse> executeServerDumpAsyncInvoker(
        ExecuteServerDumpRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.executeServerDump, hcClient);
    }

    /**
     * 重部署云服务器
     *
     * 重部署云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteServerRedeployRequest 请求对象
     * @return CompletableFuture<ExecuteServerRedeployResponse>
     */
    public CompletableFuture<ExecuteServerRedeployResponse> executeServerRedeployAsync(
        ExecuteServerRedeployRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.executeServerRedeploy);
    }

    /**
     * 重部署云服务器
     *
     * 重部署云服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteServerRedeployRequest 请求对象
     * @return AsyncInvoker<ExecuteServerRedeployRequest, ExecuteServerRedeployResponse>
     */
    public AsyncInvoker<ExecuteServerRedeployRequest, ExecuteServerRedeployResponse> executeServerRedeployAsyncInvoker(
        ExecuteServerRedeployRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.executeServerRedeploy, hcClient);
    }

    /**
     * 查询云服务器列表接口
     *
     * 查询云服务器列表接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudServersRequest 请求对象
     * @return CompletableFuture<ListCloudServersResponse>
     */
    public CompletableFuture<ListCloudServersResponse> listCloudServersAsync(ListCloudServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listCloudServers);
    }

    /**
     * 查询云服务器列表接口
     *
     * 查询云服务器列表接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudServersRequest 请求对象
     * @return AsyncInvoker<ListCloudServersRequest, ListCloudServersResponse>
     */
    public AsyncInvoker<ListCloudServersRequest, ListCloudServersResponse> listCloudServersAsyncInvoker(
        ListCloudServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listCloudServers, hcClient);
    }

    /**
     * 查询规格销售策略
     *
     * 查询规格销售策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorSellPoliciesRequest 请求对象
     * @return CompletableFuture<ListFlavorSellPoliciesResponse>
     */
    public CompletableFuture<ListFlavorSellPoliciesResponse> listFlavorSellPoliciesAsync(
        ListFlavorSellPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listFlavorSellPolicies);
    }

    /**
     * 查询规格销售策略
     *
     * 查询规格销售策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorSellPoliciesRequest 请求对象
     * @return AsyncInvoker<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse>
     */
    public AsyncInvoker<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse> listFlavorSellPoliciesAsyncInvoker(
        ListFlavorSellPoliciesRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listFlavorSellPolicies, hcClient);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     *
     * 查询云服务器规格详情信息和规格扩展信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listFlavors);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     *
     * 查询云服务器规格详情信息和规格扩展信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listFlavors, hcClient);
    }

    /**
     * 查询模板版本列表
     *
     * 根据用户请求条件从数据库筛选、查询启动模板的版本相关信息，支持按照image_id和flavor_id进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLaunchTemplateVersionsRequest 请求对象
     * @return CompletableFuture<ListLaunchTemplateVersionsResponse>
     */
    public CompletableFuture<ListLaunchTemplateVersionsResponse> listLaunchTemplateVersionsAsync(
        ListLaunchTemplateVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listLaunchTemplateVersions);
    }

    /**
     * 查询模板版本列表
     *
     * 根据用户请求条件从数据库筛选、查询启动模板的版本相关信息，支持按照image_id和flavor_id进行过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLaunchTemplateVersionsRequest 请求对象
     * @return AsyncInvoker<ListLaunchTemplateVersionsRequest, ListLaunchTemplateVersionsResponse>
     */
    public AsyncInvoker<ListLaunchTemplateVersionsRequest, ListLaunchTemplateVersionsResponse> listLaunchTemplateVersionsAsyncInvoker(
        ListLaunchTemplateVersionsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listLaunchTemplateVersions, hcClient);
    }

    /**
     * 查询回收站中虚拟机列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleBinServersRequest 请求对象
     * @return CompletableFuture<ListRecycleBinServersResponse>
     */
    public CompletableFuture<ListRecycleBinServersResponse> listRecycleBinServersAsync(
        ListRecycleBinServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listRecycleBinServers);
    }

    /**
     * 查询回收站中虚拟机列表
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleBinServersRequest 请求对象
     * @return AsyncInvoker<ListRecycleBinServersRequest, ListRecycleBinServersResponse>
     */
    public AsyncInvoker<ListRecycleBinServersRequest, ListRecycleBinServersResponse> listRecycleBinServersAsyncInvoker(
        ListRecycleBinServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listRecycleBinServers, hcClient);
    }

    /**
     * 查询云服务器规格变更支持列表
     *
     * 变更规格时，部分规格的云服务器之间不能互相变更。您可以通过本接口，通过指定弹性云服务器规格，查询该规格可以变更的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResizeFlavorsRequest 请求对象
     * @return CompletableFuture<ListResizeFlavorsResponse>
     */
    public CompletableFuture<ListResizeFlavorsResponse> listResizeFlavorsAsync(ListResizeFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listResizeFlavors);
    }

    /**
     * 查询云服务器规格变更支持列表
     *
     * 变更规格时，部分规格的云服务器之间不能互相变更。您可以通过本接口，通过指定弹性云服务器规格，查询该规格可以变更的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResizeFlavorsRequest 请求对象
     * @return AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse>
     */
    public AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse> listResizeFlavorsAsyncInvoker(
        ListResizeFlavorsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listResizeFlavors, hcClient);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表
     * 支持查看过去7天内计划事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return CompletableFuture<ListScheduledEventsResponse>
     */
    public CompletableFuture<ListScheduledEventsResponse> listScheduledEventsAsync(ListScheduledEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listScheduledEvents);
    }

    /**
     * 查询计划事件列表
     *
     * 查询计划事件列表
     * 支持查看过去7天内计划事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduledEventsRequest 请求对象
     * @return AsyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse>
     */
    public AsyncInvoker<ListScheduledEventsRequest, ListScheduledEventsResponse> listScheduledEventsAsyncInvoker(
        ListScheduledEventsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listScheduledEvents, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 查询可用区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerAzInfoRequest 请求对象
     * @return CompletableFuture<ListServerAzInfoResponse>
     */
    public CompletableFuture<ListServerAzInfoResponse> listServerAzInfoAsync(ListServerAzInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerAzInfo);
    }

    /**
     * 查询可用区列表
     *
     * 查询可用区列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerAzInfoRequest 请求对象
     * @return AsyncInvoker<ListServerAzInfoRequest, ListServerAzInfoResponse>
     */
    public AsyncInvoker<ListServerAzInfoRequest, ListServerAzInfoResponse> listServerAzInfoAsyncInvoker(
        ListServerAzInfoRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listServerAzInfo, hcClient);
    }

    /**
     * 查询弹性云服务器挂载磁盘列表详情信息
     *
     * 查询弹性云服务器挂载的磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerBlockDevicesRequest 请求对象
     * @return CompletableFuture<ListServerBlockDevicesResponse>
     */
    public CompletableFuture<ListServerBlockDevicesResponse> listServerBlockDevicesAsync(
        ListServerBlockDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerBlockDevices);
    }

    /**
     * 查询弹性云服务器挂载磁盘列表详情信息
     *
     * 查询弹性云服务器挂载的磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerBlockDevicesRequest 请求对象
     * @return AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse>
     */
    public AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> listServerBlockDevicesAsyncInvoker(
        ListServerBlockDevicesRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listServerBlockDevices, hcClient);
    }

    /**
     * 查询云服务器组列表
     *
     * 查询弹性云服务器组。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupsRequest 请求对象
     * @return CompletableFuture<ListServerGroupsResponse>
     */
    public CompletableFuture<ListServerGroupsResponse> listServerGroupsAsync(ListServerGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerGroups);
    }

    /**
     * 查询云服务器组列表
     *
     * 查询弹性云服务器组。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerGroupsRequest 请求对象
     * @return AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>
     */
    public AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroupsAsyncInvoker(
        ListServerGroupsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listServerGroups, hcClient);
    }

    /**
     * 查询云服务器网卡信息
     *
     * 查询云服务器网卡信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerInterfacesRequest 请求对象
     * @return CompletableFuture<ListServerInterfacesResponse>
     */
    public CompletableFuture<ListServerInterfacesResponse> listServerInterfacesAsync(
        ListServerInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerInterfaces);
    }

    /**
     * 查询云服务器网卡信息
     *
     * 查询云服务器网卡信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerInterfacesRequest 请求对象
     * @return AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse>
     */
    public AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse> listServerInterfacesAsyncInvoker(
        ListServerInterfacesRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listServerInterfaces, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 项目（Project）用于将OpenStack的资源（计算资源、存储资源和网络资源）进行分组和隔离。项目可以是一个部门或者一个项目组。一个帐户中可以创建多个项目。
     * 
     * 该接口用于查询用户在指定项目所使用的全部标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerTagsRequest 请求对象
     * @return CompletableFuture<ListServerTagsResponse>
     */
    public CompletableFuture<ListServerTagsResponse> listServerTagsAsync(ListServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerTags);
    }

    /**
     * 查询项目标签
     *
     * 项目（Project）用于将OpenStack的资源（计算资源、存储资源和网络资源）进行分组和隔离。项目可以是一个部门或者一个项目组。一个帐户中可以创建多个项目。
     * 
     * 该接口用于查询用户在指定项目所使用的全部标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerTagsRequest 请求对象
     * @return AsyncInvoker<ListServerTagsRequest, ListServerTagsResponse>
     */
    public AsyncInvoker<ListServerTagsRequest, ListServerTagsResponse> listServerTagsAsyncInvoker(
        ListServerTagsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listServerTags, hcClient);
    }

    /**
     * 查询弹性云服务器挂载磁盘列表信息
     *
     * 查询弹性云服务器挂载的磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerVolumeAttachmentsRequest 请求对象
     * @return CompletableFuture<ListServerVolumeAttachmentsResponse>
     */
    public CompletableFuture<ListServerVolumeAttachmentsResponse> listServerVolumeAttachmentsAsync(
        ListServerVolumeAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerVolumeAttachments);
    }

    /**
     * 查询弹性云服务器挂载磁盘列表信息
     *
     * 查询弹性云服务器挂载的磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerVolumeAttachmentsRequest 请求对象
     * @return AsyncInvoker<ListServerVolumeAttachmentsRequest, ListServerVolumeAttachmentsResponse>
     */
    public AsyncInvoker<ListServerVolumeAttachmentsRequest, ListServerVolumeAttachmentsResponse> listServerVolumeAttachmentsAsyncInvoker(
        ListServerVolumeAttachmentsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listServerVolumeAttachments, hcClient);
    }

    /**
     * 按标签查询云服务器列表
     *
     * 使用标签过滤弹性云服务器，并返回云服务器使用的所有标签和资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersByTagRequest 请求对象
     * @return CompletableFuture<ListServersByTagResponse>
     */
    @Deprecated
    public CompletableFuture<ListServersByTagResponse> listServersByTagAsync(ListServersByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServersByTag);
    }

    /**
     * 按标签查询云服务器列表
     *
     * 使用标签过滤弹性云服务器，并返回云服务器使用的所有标签和资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersByTagRequest 请求对象
     * @return AsyncInvoker<ListServersByTagRequest, ListServersByTagResponse>
     */
    @Deprecated
    public AsyncInvoker<ListServersByTagRequest, ListServersByTagResponse> listServersByTagAsyncInvoker(
        ListServersByTagRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listServersByTag, hcClient);
    }

    /**
     * 查询云服务器详情列表
     *
     * 根据用户请求条件从数据库筛选、查询所有的弹性云服务器，并关联相关表获取到弹性云服务器的详细信息。
     * 
     * 该接口支持查询弹性云服务器计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersDetailsRequest 请求对象
     * @return CompletableFuture<ListServersDetailsResponse>
     */
    public CompletableFuture<ListServersDetailsResponse> listServersDetailsAsync(ListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServersDetails);
    }

    /**
     * 查询云服务器详情列表
     *
     * 根据用户请求条件从数据库筛选、查询所有的弹性云服务器，并关联相关表获取到弹性云服务器的详细信息。
     * 
     * 该接口支持查询弹性云服务器计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersDetailsRequest 请求对象
     * @return AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse>
     */
    public AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse> listServersDetailsAsyncInvoker(
        ListServersDetailsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listServersDetails, hcClient);
    }

    /**
     * 查询模板列表
     *
     * 根据用户请求条件从数据库筛选、查询启动模板相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listTemplates);
    }

    /**
     * 查询模板列表
     *
     * 根据用户请求条件从数据库筛选、查询启动模板相关信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.listTemplates, hcClient);
    }

    /**
     * 冷迁移云服务器
     *
     * - 将部署在专属主机上的弹性云服务器迁移至其他专属主机。
     * - 将部署在专属主机上的弹性云服务器迁移至公共资源池，即不再部署在专属主机上。
     * - 将公共资源池的弹性云服务器迁移至专属主机上，成为专属主机上部署的弹性云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateServerRequest 请求对象
     * @return CompletableFuture<MigrateServerResponse>
     */
    public CompletableFuture<MigrateServerResponse> migrateServerAsync(MigrateServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.migrateServer);
    }

    /**
     * 冷迁移云服务器
     *
     * - 将部署在专属主机上的弹性云服务器迁移至其他专属主机。
     * - 将部署在专属主机上的弹性云服务器迁移至公共资源池，即不再部署在专属主机上。
     * - 将公共资源池的弹性云服务器迁移至专属主机上，成为专属主机上部署的弹性云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateServerRequest 请求对象
     * @return AsyncInvoker<MigrateServerRequest, MigrateServerResponse>
     */
    public AsyncInvoker<MigrateServerRequest, MigrateServerResponse> migrateServerAsyncInvoker(
        MigrateServerRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.migrateServer, hcClient);
    }

    /**
     * 添加安全组
     *
     * 为弹性云服务器添加一个安全组。
     * 
     * 添加多个安全组时，建议最多为弹性云服务器添加5个安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaAssociateSecurityGroupRequest 请求对象
     * @return CompletableFuture<NovaAssociateSecurityGroupResponse>
     */
    public CompletableFuture<NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupAsync(
        NovaAssociateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaAssociateSecurityGroup);
    }

    /**
     * 添加安全组
     *
     * 为弹性云服务器添加一个安全组。
     * 
     * 添加多个安全组时，建议最多为弹性云服务器添加5个安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaAssociateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse>
     */
    public AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupAsyncInvoker(
        NovaAssociateSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaAssociateSecurityGroup, hcClient);
    }

    /**
     * 添加云服务器网卡
     *
     * 给云服务器添加一张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaAttachInterfaceRequest 请求对象
     * @return CompletableFuture<NovaAttachInterfaceResponse>
     */
    public CompletableFuture<NovaAttachInterfaceResponse> novaAttachInterfaceAsync(NovaAttachInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaAttachInterface);
    }

    /**
     * 添加云服务器网卡
     *
     * 给云服务器添加一张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaAttachInterfaceRequest 请求对象
     * @return AsyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse>
     */
    public AsyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse> novaAttachInterfaceAsyncInvoker(
        NovaAttachInterfaceRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaAttachInterface, hcClient);
    }

    /**
     * 创建和导入SSH密钥
     *
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。
     * 
     * 创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录云服务器云主机。为保证云服务器云主机器安全，私钥数据只能读取一次，请妥善保管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaCreateKeypairRequest 请求对象
     * @return CompletableFuture<NovaCreateKeypairResponse>
     */
    public CompletableFuture<NovaCreateKeypairResponse> novaCreateKeypairAsync(NovaCreateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaCreateKeypair);
    }

    /**
     * 创建和导入SSH密钥
     *
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。
     * 
     * 创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录云服务器云主机。为保证云服务器云主机器安全，私钥数据只能读取一次，请妥善保管。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaCreateKeypairRequest 请求对象
     * @return AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse>
     */
    public AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse> novaCreateKeypairAsyncInvoker(
        NovaCreateKeypairRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaCreateKeypair, hcClient);
    }

    /**
     * 创建云服务器
     *
     * 创建一台弹性云服务器。
     * 
     * 弹性云服务器创建完成后，如需开启自动恢复功能，可以调用配置云服务器自动恢复的接口，具体使用请参见管理云服务器自动恢复动作。
     * 
     * 该接口在云服务器创建失败后不支持自动回滚。若需要自动回滚能力，可以调用POST /v1/{project_id}/cloudservers接口，具体使用请参见创建云服务器（按需）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaCreateServersRequest 请求对象
     * @return CompletableFuture<NovaCreateServersResponse>
     */
    public CompletableFuture<NovaCreateServersResponse> novaCreateServersAsync(NovaCreateServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaCreateServers);
    }

    /**
     * 创建云服务器
     *
     * 创建一台弹性云服务器。
     * 
     * 弹性云服务器创建完成后，如需开启自动恢复功能，可以调用配置云服务器自动恢复的接口，具体使用请参见管理云服务器自动恢复动作。
     * 
     * 该接口在云服务器创建失败后不支持自动回滚。若需要自动回滚能力，可以调用POST /v1/{project_id}/cloudservers接口，具体使用请参见创建云服务器（按需）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaCreateServersRequest 请求对象
     * @return AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse>
     */
    public AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse> novaCreateServersAsyncInvoker(
        NovaCreateServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaCreateServers, hcClient);
    }

    /**
     * 删除SSH密钥
     *
     * 根据SSH密钥的名称，删除指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaDeleteKeypairRequest 请求对象
     * @return CompletableFuture<NovaDeleteKeypairResponse>
     */
    public CompletableFuture<NovaDeleteKeypairResponse> novaDeleteKeypairAsync(NovaDeleteKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDeleteKeypair);
    }

    /**
     * 删除SSH密钥
     *
     * 根据SSH密钥的名称，删除指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaDeleteKeypairRequest 请求对象
     * @return AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse>
     */
    public AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> novaDeleteKeypairAsyncInvoker(
        NovaDeleteKeypairRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaDeleteKeypair, hcClient);
    }

    /**
     * 删除云服务器
     *
     * 删除一台云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaDeleteServerRequest 请求对象
     * @return CompletableFuture<NovaDeleteServerResponse>
     */
    public CompletableFuture<NovaDeleteServerResponse> novaDeleteServerAsync(NovaDeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDeleteServer);
    }

    /**
     * 删除云服务器
     *
     * 删除一台云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaDeleteServerRequest 请求对象
     * @return AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse>
     */
    public AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse> novaDeleteServerAsyncInvoker(
        NovaDeleteServerRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaDeleteServer, hcClient);
    }

    /**
     * 移除安全组
     *
     * 移除弹性云服务器中的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaDisassociateSecurityGroupRequest 请求对象
     * @return CompletableFuture<NovaDisassociateSecurityGroupResponse>
     */
    public CompletableFuture<NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupAsync(
        NovaDisassociateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDisassociateSecurityGroup);
    }

    /**
     * 移除安全组
     *
     * 移除弹性云服务器中的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaDisassociateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse>
     */
    public AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupAsyncInvoker(
        NovaDisassociateSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaDisassociateSecurityGroup, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 查询可用域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<NovaListAvailabilityZonesResponse>
     */
    @Deprecated
    public CompletableFuture<NovaListAvailabilityZonesResponse> novaListAvailabilityZonesAsync(
        NovaListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListAvailabilityZones);
    }

    /**
     * 查询可用区列表
     *
     * 查询可用域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse>
     */
    @Deprecated
    public AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> novaListAvailabilityZonesAsyncInvoker(
        NovaListAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaListAvailabilityZones, hcClient);
    }

    /**
     * 查询SSH密钥列表
     *
     * 查询SSH密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListKeypairsRequest 请求对象
     * @return CompletableFuture<NovaListKeypairsResponse>
     */
    public CompletableFuture<NovaListKeypairsResponse> novaListKeypairsAsync(NovaListKeypairsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListKeypairs);
    }

    /**
     * 查询SSH密钥列表
     *
     * 查询SSH密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListKeypairsRequest 请求对象
     * @return AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse>
     */
    public AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse> novaListKeypairsAsyncInvoker(
        NovaListKeypairsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaListKeypairs, hcClient);
    }

    /**
     * 查询指定云服务器安全组列表
     *
     * 查询指定弹性云服务器的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListServerSecurityGroupsRequest 请求对象
     * @return CompletableFuture<NovaListServerSecurityGroupsResponse>
     */
    public CompletableFuture<NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsAsync(
        NovaListServerSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServerSecurityGroups);
    }

    /**
     * 查询指定云服务器安全组列表
     *
     * 查询指定弹性云服务器的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListServerSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse>
     */
    public AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsAsyncInvoker(
        NovaListServerSecurityGroupsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaListServerSecurityGroups, hcClient);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListServersRequest 请求对象
     * @return CompletableFuture<NovaListServersResponse>
     */
    public CompletableFuture<NovaListServersResponse> novaListServersAsync(NovaListServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServers);
    }

    /**
     * 查询云服务器列表
     *
     * 查询云服务器信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListServersRequest 请求对象
     * @return AsyncInvoker<NovaListServersRequest, NovaListServersResponse>
     */
    public AsyncInvoker<NovaListServersRequest, NovaListServersResponse> novaListServersAsyncInvoker(
        NovaListServersRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaListServers, hcClient);
    }

    /**
     * 查询云服务器详情列表
     *
     * 查询云服务器详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListServersDetailsRequest 请求对象
     * @return CompletableFuture<NovaListServersDetailsResponse>
     */
    public CompletableFuture<NovaListServersDetailsResponse> novaListServersDetailsAsync(
        NovaListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServersDetails);
    }

    /**
     * 查询云服务器详情列表
     *
     * 查询云服务器详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListServersDetailsRequest 请求对象
     * @return AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse>
     */
    public AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse> novaListServersDetailsAsyncInvoker(
        NovaListServersDetailsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaListServersDetails, hcClient);
    }

    /**
     * 查询云服务器规格extra_specs的详情
     *
     * 查询指定的规格的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowFlavorExtraSpecsRequest 请求对象
     * @return CompletableFuture<NovaShowFlavorExtraSpecsResponse>
     */
    public CompletableFuture<NovaShowFlavorExtraSpecsResponse> novaShowFlavorExtraSpecsAsync(
        NovaShowFlavorExtraSpecsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowFlavorExtraSpecs);
    }

    /**
     * 查询云服务器规格extra_specs的详情
     *
     * 查询指定的规格的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowFlavorExtraSpecsRequest 请求对象
     * @return AsyncInvoker<NovaShowFlavorExtraSpecsRequest, NovaShowFlavorExtraSpecsResponse>
     */
    public AsyncInvoker<NovaShowFlavorExtraSpecsRequest, NovaShowFlavorExtraSpecsResponse> novaShowFlavorExtraSpecsAsyncInvoker(
        NovaShowFlavorExtraSpecsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaShowFlavorExtraSpecs, hcClient);
    }

    /**
     * 查询SSH密钥详情
     *
     * 根据SSH密钥名称查询指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowKeypairRequest 请求对象
     * @return CompletableFuture<NovaShowKeypairResponse>
     */
    public CompletableFuture<NovaShowKeypairResponse> novaShowKeypairAsync(NovaShowKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowKeypair);
    }

    /**
     * 查询SSH密钥详情
     *
     * 根据SSH密钥名称查询指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowKeypairRequest 请求对象
     * @return AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse>
     */
    public AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse> novaShowKeypairAsyncInvoker(
        NovaShowKeypairRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaShowKeypair, hcClient);
    }

    /**
     * 查询云服务器详情
     *
     * 根据云服务器ID，查询云服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowServerRequest 请求对象
     * @return CompletableFuture<NovaShowServerResponse>
     */
    public CompletableFuture<NovaShowServerResponse> novaShowServerAsync(NovaShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowServer);
    }

    /**
     * 查询云服务器详情
     *
     * 根据云服务器ID，查询云服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowServerRequest 请求对象
     * @return AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse>
     */
    public AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse> novaShowServerAsyncInvoker(
        NovaShowServerRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaShowServer, hcClient);
    }

    /**
     * 查询指定云服务器网卡信息
     *
     * 根据网卡ID，查询云服务器网卡信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowServerInterfaceRequest 请求对象
     * @return CompletableFuture<NovaShowServerInterfaceResponse>
     */
    public CompletableFuture<NovaShowServerInterfaceResponse> novaShowServerInterfaceAsync(
        NovaShowServerInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowServerInterface);
    }

    /**
     * 查询指定云服务器网卡信息
     *
     * 根据网卡ID，查询云服务器网卡信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowServerInterfaceRequest 请求对象
     * @return AsyncInvoker<NovaShowServerInterfaceRequest, NovaShowServerInterfaceResponse>
     */
    public AsyncInvoker<NovaShowServerInterfaceRequest, NovaShowServerInterfaceResponse> novaShowServerInterfaceAsyncInvoker(
        NovaShowServerInterfaceRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaShowServerInterface, hcClient);
    }

    /**
     * 注册云服务器监控
     *
     * 将云服务器添加到监控表中。
     * 
     * 注册到监控表中的云服务会被ceilometer周期性采集监控数据，包括平台的版本、cpu信息、内存、网卡、磁盘、硬件平台等信息，这些数据上报给云监控。例如SAP云服务器内部的插件会周期性从云监控中查询监控数据，以报表形式呈现给SAP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterServerMonitorRequest 请求对象
     * @return CompletableFuture<RegisterServerMonitorResponse>
     */
    public CompletableFuture<RegisterServerMonitorResponse> registerServerMonitorAsync(
        RegisterServerMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.registerServerMonitor);
    }

    /**
     * 注册云服务器监控
     *
     * 将云服务器添加到监控表中。
     * 
     * 注册到监控表中的云服务会被ceilometer周期性采集监控数据，包括平台的版本、cpu信息、内存、网卡、磁盘、硬件平台等信息，这些数据上报给云监控。例如SAP云服务器内部的插件会周期性从云监控中查询监控数据，以报表形式呈现给SAP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterServerMonitorRequest 请求对象
     * @return AsyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse>
     */
    public AsyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse> registerServerMonitorAsyncInvoker(
        RegisterServerMonitorRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.registerServerMonitor, hcClient);
    }

    /**
     * 重装弹性云服务器操作系统(安装Cloud-init)
     *
     * 重装弹性云服务器的操作系统。支持弹性云服务器数据盘不变的情况下，使用原镜像重装系统盘。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用原镜像重新创建系统盘，并挂载至弹性云服务器，实现重装操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallServerWithCloudInitRequest 请求对象
     * @return CompletableFuture<ReinstallServerWithCloudInitResponse>
     */
    public CompletableFuture<ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitAsync(
        ReinstallServerWithCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.reinstallServerWithCloudInit);
    }

    /**
     * 重装弹性云服务器操作系统(安装Cloud-init)
     *
     * 重装弹性云服务器的操作系统。支持弹性云服务器数据盘不变的情况下，使用原镜像重装系统盘。
     * 
     * 调用该接口后，系统将卸载系统盘，然后使用原镜像重新创建系统盘，并挂载至弹性云服务器，实现重装操作系统功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallServerWithCloudInitRequest 请求对象
     * @return AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse>
     */
    public AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitAsyncInvoker(
        ReinstallServerWithCloudInitRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.reinstallServerWithCloudInit, hcClient);
    }

    /**
     * 重装弹性云服务器操作系统(未安装Cloud init)
     *
     * 重装弹性云服务器的操作系统。
     * 
     * 该接口支持未安装Cloud-init或Cloudbase-init的镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallServerWithoutCloudInitRequest 请求对象
     * @return CompletableFuture<ReinstallServerWithoutCloudInitResponse>
     */
    public CompletableFuture<ReinstallServerWithoutCloudInitResponse> reinstallServerWithoutCloudInitAsync(
        ReinstallServerWithoutCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.reinstallServerWithoutCloudInit);
    }

    /**
     * 重装弹性云服务器操作系统(未安装Cloud init)
     *
     * 重装弹性云服务器的操作系统。
     * 
     * 该接口支持未安装Cloud-init或Cloudbase-init的镜像。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallServerWithoutCloudInitRequest 请求对象
     * @return AsyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse>
     */
    public AsyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> reinstallServerWithoutCloudInitAsyncInvoker(
        ReinstallServerWithoutCloudInitRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.reinstallServerWithoutCloudInit, hcClient);
    }

    /**
     * 一键重置弹性云服务器密码(企业项目)
     *
     * 重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetServerPasswordRequest 请求对象
     * @return CompletableFuture<ResetServerPasswordResponse>
     */
    public CompletableFuture<ResetServerPasswordResponse> resetServerPasswordAsync(ResetServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resetServerPassword);
    }

    /**
     * 一键重置弹性云服务器密码(企业项目)
     *
     * 重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetServerPasswordRequest 请求对象
     * @return AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse>
     */
    public AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse> resetServerPasswordAsyncInvoker(
        ResetServerPasswordRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.resetServerPassword, hcClient);
    }

    /**
     * 变更云服务器规格(按需)
     *
     * 当您创建的弹性云服务器规格无法满足业务需要时，可以变更云服务器规格，升级vCPU、内存。具体接口的使用，请参见本节内容。
     * 
     * 变更规格时，部分规格的云服务器之间不能互相变更。
     * 
     * 您可以通过接口“/v1/{project_id}/cloudservers/resize_flavors?{instance_uuid,source_flavor_id,source_flavor_name}”查询支持列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizePostPaidServerRequest 请求对象
     * @return CompletableFuture<ResizePostPaidServerResponse>
     */
    public CompletableFuture<ResizePostPaidServerResponse> resizePostPaidServerAsync(
        ResizePostPaidServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resizePostPaidServer);
    }

    /**
     * 变更云服务器规格(按需)
     *
     * 当您创建的弹性云服务器规格无法满足业务需要时，可以变更云服务器规格，升级vCPU、内存。具体接口的使用，请参见本节内容。
     * 
     * 变更规格时，部分规格的云服务器之间不能互相变更。
     * 
     * 您可以通过接口“/v1/{project_id}/cloudservers/resize_flavors?{instance_uuid,source_flavor_id,source_flavor_name}”查询支持列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizePostPaidServerRequest 请求对象
     * @return AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse>
     */
    public AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse> resizePostPaidServerAsyncInvoker(
        ResizePostPaidServerRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.resizePostPaidServer, hcClient);
    }

    /**
     * 变更云服务器规格
     *
     * 变更云服务器规格。
     * 
     * v1.1版本：指该接口兼容v1接口的功能，同时合入新功能，支持变更包年/包月弹性云服务器的规格。
     * 
     * 注意事项：
     * 
     * - 该接口可以使用合作伙伴自身的AK/SK或者token调用，也可以用合作伙伴子客户的AK/SK或者token来调用。
     * - 如果使用AK/SK认证方式，示例代码中region请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“区域”的内容，，serviceName（英文服务名称缩写）请指定为ECS。
     * - Endpoint请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“终端节点（Endpoint）”的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeServerRequest 请求对象
     * @return CompletableFuture<ResizeServerResponse>
     */
    public CompletableFuture<ResizeServerResponse> resizeServerAsync(ResizeServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resizeServer);
    }

    /**
     * 变更云服务器规格
     *
     * 变更云服务器规格。
     * 
     * v1.1版本：指该接口兼容v1接口的功能，同时合入新功能，支持变更包年/包月弹性云服务器的规格。
     * 
     * 注意事项：
     * 
     * - 该接口可以使用合作伙伴自身的AK/SK或者token调用，也可以用合作伙伴子客户的AK/SK或者token来调用。
     * - 如果使用AK/SK认证方式，示例代码中region请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“区域”的内容，，serviceName（英文服务名称缩写）请指定为ECS。
     * - Endpoint请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“终端节点（Endpoint）”的内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeServerRequest 请求对象
     * @return AsyncInvoker<ResizeServerRequest, ResizeServerResponse>
     */
    public AsyncInvoker<ResizeServerRequest, ResizeServerResponse> resizeServerAsyncInvoker(
        ResizeServerRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.resizeServer, hcClient);
    }

    /**
     * 恢复回收站中虚拟机
     *
     * 回收站中的虚拟机从回收站中恢复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevertRecycleBinServerRequest 请求对象
     * @return CompletableFuture<RevertRecycleBinServerResponse>
     */
    public CompletableFuture<RevertRecycleBinServerResponse> revertRecycleBinServerAsync(
        RevertRecycleBinServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.revertRecycleBinServer);
    }

    /**
     * 恢复回收站中虚拟机
     *
     * 回收站中的虚拟机从回收站中恢复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevertRecycleBinServerRequest 请求对象
     * @return AsyncInvoker<RevertRecycleBinServerRequest, RevertRecycleBinServerResponse>
     */
    public AsyncInvoker<RevertRecycleBinServerRequest, RevertRecycleBinServerResponse> revertRecycleBinServerAsyncInvoker(
        RevertRecycleBinServerRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.revertRecycleBinServer, hcClient);
    }

    /**
     * 查询包周期虚拟机可以追加卷数量
     *
     * 查询包周期虚拟机可以追加卷数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppendableVolumeQuotaRequest 请求对象
     * @return CompletableFuture<ShowAppendableVolumeQuotaResponse>
     */
    public CompletableFuture<ShowAppendableVolumeQuotaResponse> showAppendableVolumeQuotaAsync(
        ShowAppendableVolumeQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showAppendableVolumeQuota);
    }

    /**
     * 查询包周期虚拟机可以追加卷数量
     *
     * 查询包周期虚拟机可以追加卷数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppendableVolumeQuotaRequest 请求对象
     * @return AsyncInvoker<ShowAppendableVolumeQuotaRequest, ShowAppendableVolumeQuotaResponse>
     */
    public AsyncInvoker<ShowAppendableVolumeQuotaRequest, ShowAppendableVolumeQuotaResponse> showAppendableVolumeQuotaAsyncInvoker(
        ShowAppendableVolumeQuotaRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showAppendableVolumeQuota, hcClient);
    }

    /**
     * 查询flavor的容量
     *
     * 查询flavor的容量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorCapacityRequest 请求对象
     * @return CompletableFuture<ShowFlavorCapacityResponse>
     */
    public CompletableFuture<ShowFlavorCapacityResponse> showFlavorCapacityAsync(ShowFlavorCapacityRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showFlavorCapacity);
    }

    /**
     * 查询flavor的容量
     *
     * 查询flavor的容量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlavorCapacityRequest 请求对象
     * @return AsyncInvoker<ShowFlavorCapacityRequest, ShowFlavorCapacityResponse>
     */
    public AsyncInvoker<ShowFlavorCapacityRequest, ShowFlavorCapacityResponse> showFlavorCapacityAsyncInvoker(
        ShowFlavorCapacityRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showFlavorCapacity, hcClient);
    }

    /**
     * 查询云服务器元数据配置
     *
     * 查询云服务器元数据配置，通过本接口，您可以查询指定云服务器的元数据配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadataOptionsRequest 请求对象
     * @return CompletableFuture<ShowMetadataOptionsResponse>
     */
    public CompletableFuture<ShowMetadataOptionsResponse> showMetadataOptionsAsync(ShowMetadataOptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showMetadataOptions);
    }

    /**
     * 查询云服务器元数据配置
     *
     * 查询云服务器元数据配置，通过本接口，您可以查询指定云服务器的元数据配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetadataOptionsRequest 请求对象
     * @return AsyncInvoker<ShowMetadataOptionsRequest, ShowMetadataOptionsResponse>
     */
    public AsyncInvoker<ShowMetadataOptionsRequest, ShowMetadataOptionsResponse> showMetadataOptionsAsyncInvoker(
        ShowMetadataOptionsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showMetadataOptions, hcClient);
    }

    /**
     * 查询回收站配置
     *
     * 查询回收站配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecycleBinRequest 请求对象
     * @return CompletableFuture<ShowRecycleBinResponse>
     */
    public CompletableFuture<ShowRecycleBinResponse> showRecycleBinAsync(ShowRecycleBinRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showRecycleBin);
    }

    /**
     * 查询回收站配置
     *
     * 查询回收站配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecycleBinRequest 请求对象
     * @return AsyncInvoker<ShowRecycleBinRequest, ShowRecycleBinResponse>
     */
    public AsyncInvoker<ShowRecycleBinRequest, ShowRecycleBinResponse> showRecycleBinAsyncInvoker(
        ShowRecycleBinRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showRecycleBin, hcClient);
    }

    /**
     * 查询是否支持一键重置密码
     *
     * 查询弹性云服务器是否支持一键重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResetPasswordFlagRequest 请求对象
     * @return CompletableFuture<ShowResetPasswordFlagResponse>
     */
    public CompletableFuture<ShowResetPasswordFlagResponse> showResetPasswordFlagAsync(
        ShowResetPasswordFlagRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showResetPasswordFlag);
    }

    /**
     * 查询是否支持一键重置密码
     *
     * 查询弹性云服务器是否支持一键重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResetPasswordFlagRequest 请求对象
     * @return AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse>
     */
    public AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> showResetPasswordFlagAsyncInvoker(
        ShowResetPasswordFlagRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showResetPasswordFlag, hcClient);
    }

    /**
     * 查询云服务器详情
     *
     * 查询弹性云服务器的详细信息。
     * 
     * 该接口支持查询弹性云服务器的计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return CompletableFuture<ShowServerResponse>
     */
    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServer);
    }

    /**
     * 查询云服务器详情
     *
     * 查询弹性云服务器的详细信息。
     * 
     * 该接口支持查询弹性云服务器的计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return AsyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public AsyncInvoker<ShowServerRequest, ShowServerResponse> showServerAsyncInvoker(ShowServerRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showServer, hcClient);
    }

    /**
     * 查询虚拟机可挂载网卡
     *
     * 查询虚拟机可挂载网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerAttachableNicNumRequest 请求对象
     * @return CompletableFuture<ShowServerAttachableNicNumResponse>
     */
    public CompletableFuture<ShowServerAttachableNicNumResponse> showServerAttachableNicNumAsync(
        ShowServerAttachableNicNumRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerAttachableNicNum);
    }

    /**
     * 查询虚拟机可挂载网卡
     *
     * 查询虚拟机可挂载网卡
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerAttachableNicNumRequest 请求对象
     * @return AsyncInvoker<ShowServerAttachableNicNumRequest, ShowServerAttachableNicNumResponse>
     */
    public AsyncInvoker<ShowServerAttachableNicNumRequest, ShowServerAttachableNicNumResponse> showServerAttachableNicNumAsyncInvoker(
        ShowServerAttachableNicNumRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showServerAttachableNicNum, hcClient);
    }

    /**
     * 查询弹性云服务器单个磁盘信息
     *
     * 查询弹性云服务器挂载的单个磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerBlockDeviceRequest 请求对象
     * @return CompletableFuture<ShowServerBlockDeviceResponse>
     */
    public CompletableFuture<ShowServerBlockDeviceResponse> showServerBlockDeviceAsync(
        ShowServerBlockDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerBlockDevice);
    }

    /**
     * 查询弹性云服务器单个磁盘信息
     *
     * 查询弹性云服务器挂载的单个磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerBlockDeviceRequest 请求对象
     * @return AsyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse>
     */
    public AsyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> showServerBlockDeviceAsyncInvoker(
        ShowServerBlockDeviceRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showServerBlockDevice, hcClient);
    }

    /**
     * 查询云服务器组详情
     *
     * 查询弹性云服务器组详情。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRequest 请求对象
     * @return CompletableFuture<ShowServerGroupResponse>
     */
    public CompletableFuture<ShowServerGroupResponse> showServerGroupAsync(ShowServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerGroup);
    }

    /**
     * 查询云服务器组详情
     *
     * 查询弹性云服务器组详情。
     * 
     * 与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerGroupRequest 请求对象
     * @return AsyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse>
     */
    public AsyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroupAsyncInvoker(
        ShowServerGroupRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showServerGroup, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerLimitsRequest 请求对象
     * @return CompletableFuture<ShowServerLimitsResponse>
     */
    public CompletableFuture<ShowServerLimitsResponse> showServerLimitsAsync(ShowServerLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerLimits);
    }

    /**
     * 查询租户配额
     *
     * 查询租户配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerLimitsRequest 请求对象
     * @return AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse>
     */
    public AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse> showServerLimitsAsyncInvoker(
        ShowServerLimitsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showServerLimits, hcClient);
    }

    /**
     * 云服务器获取密码(企业项目)
     *
     * 当通过支持Cloudbase-init功能的镜像创建Windows云服务器时，获取云服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerPasswordRequest 请求对象
     * @return CompletableFuture<ShowServerPasswordResponse>
     */
    public CompletableFuture<ShowServerPasswordResponse> showServerPasswordAsync(ShowServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerPassword);
    }

    /**
     * 云服务器获取密码(企业项目)
     *
     * 当通过支持Cloudbase-init功能的镜像创建Windows云服务器时，获取云服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerPasswordRequest 请求对象
     * @return AsyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse>
     */
    public AsyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse> showServerPasswordAsyncInvoker(
        ShowServerPasswordRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showServerPassword, hcClient);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取弹性云服务器VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRemoteConsoleRequest 请求对象
     * @return CompletableFuture<ShowServerRemoteConsoleResponse>
     */
    public CompletableFuture<ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsync(
        ShowServerRemoteConsoleRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerRemoteConsole);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取弹性云服务器VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRemoteConsoleRequest 请求对象
     * @return AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>
     */
    public AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsyncInvoker(
        ShowServerRemoteConsoleRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showServerRemoteConsole, hcClient);
    }

    /**
     * 查询云服务器标签
     *
     * - 查询指定云服务器的标签信息。
     * 
     * - 标签管理服务TMS使用该接口查询指定云服务器的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerTagsRequest 请求对象
     * @return CompletableFuture<ShowServerTagsResponse>
     */
    public CompletableFuture<ShowServerTagsResponse> showServerTagsAsync(ShowServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerTags);
    }

    /**
     * 查询云服务器标签
     *
     * - 查询指定云服务器的标签信息。
     * 
     * - 标签管理服务TMS使用该接口查询指定云服务器的全部标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerTagsRequest 请求对象
     * @return AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse>
     */
    public AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse> showServerTagsAsyncInvoker(
        ShowServerTagsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showServerTags, hcClient);
    }

    /**
     * 更新云服务器元数据配置
     *
     * 更新云服务器元数据配置，通过本接口，您可以选择启用或关闭IMDS服务，也可以选择IMDS服务的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetadataOptionsRequest 请求对象
     * @return CompletableFuture<UpdateMetadataOptionsResponse>
     */
    public CompletableFuture<UpdateMetadataOptionsResponse> updateMetadataOptionsAsync(
        UpdateMetadataOptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateMetadataOptions);
    }

    /**
     * 更新云服务器元数据配置
     *
     * 更新云服务器元数据配置，通过本接口，您可以选择启用或关闭IMDS服务，也可以选择IMDS服务的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMetadataOptionsRequest 请求对象
     * @return AsyncInvoker<UpdateMetadataOptionsRequest, UpdateMetadataOptionsResponse>
     */
    public AsyncInvoker<UpdateMetadataOptionsRequest, UpdateMetadataOptionsResponse> updateMetadataOptionsAsyncInvoker(
        UpdateMetadataOptionsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.updateMetadataOptions, hcClient);
    }

    /**
     * 更新回收站配置
     *
     * 更新回收站属性信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecycleBinRequest 请求对象
     * @return CompletableFuture<UpdateRecycleBinResponse>
     */
    public CompletableFuture<UpdateRecycleBinResponse> updateRecycleBinAsync(UpdateRecycleBinRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateRecycleBin);
    }

    /**
     * 更新回收站配置
     *
     * 更新回收站属性信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecycleBinRequest 请求对象
     * @return AsyncInvoker<UpdateRecycleBinRequest, UpdateRecycleBinResponse>
     */
    public AsyncInvoker<UpdateRecycleBinRequest, UpdateRecycleBinResponse> updateRecycleBinAsyncInvoker(
        UpdateRecycleBinRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.updateRecycleBin, hcClient);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecycleBinPolicyRequest 请求对象
     * @return CompletableFuture<UpdateRecycleBinPolicyResponse>
     */
    public CompletableFuture<UpdateRecycleBinPolicyResponse> updateRecycleBinPolicyAsync(
        UpdateRecycleBinPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateRecycleBinPolicy);
    }

    /**
     * 更新回收站策略
     *
     * 更新回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecycleBinPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateRecycleBinPolicyRequest, UpdateRecycleBinPolicyResponse>
     */
    public AsyncInvoker<UpdateRecycleBinPolicyRequest, UpdateRecycleBinPolicyResponse> updateRecycleBinPolicyAsyncInvoker(
        UpdateRecycleBinPolicyRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.updateRecycleBinPolicy, hcClient);
    }

    /**
     * 更新计划事件
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledEventRequest 请求对象
     * @return CompletableFuture<UpdateScheduledEventResponse>
     */
    public CompletableFuture<UpdateScheduledEventResponse> updateScheduledEventAsync(
        UpdateScheduledEventRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateScheduledEvent);
    }

    /**
     * 更新计划事件
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateScheduledEventRequest 请求对象
     * @return AsyncInvoker<UpdateScheduledEventRequest, UpdateScheduledEventResponse>
     */
    public AsyncInvoker<UpdateScheduledEventRequest, UpdateScheduledEventResponse> updateScheduledEventAsyncInvoker(
        UpdateScheduledEventRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.updateScheduledEvent, hcClient);
    }

    /**
     * 修改云服务器
     *
     * 修改云服务器信息，目前支持修改云服务器名称及描述和hostname。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerRequest 请求对象
     * @return CompletableFuture<UpdateServerResponse>
     */
    public CompletableFuture<UpdateServerResponse> updateServerAsync(UpdateServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServer);
    }

    /**
     * 修改云服务器
     *
     * 修改云服务器信息，目前支持修改云服务器名称及描述和hostname。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerRequest 请求对象
     * @return AsyncInvoker<UpdateServerRequest, UpdateServerResponse>
     */
    public AsyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerAsyncInvoker(
        UpdateServerRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.updateServer, hcClient);
    }

    /**
     * 修改云服务器定时删除时间
     *
     * 修改按需服务器，设置定时删除时间。如果设置的定时删除时间为空字符串，表示取消定时删除。
     * 
     * 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ecs:cloudServers:put。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerAutoTerminateTimeRequest 请求对象
     * @return CompletableFuture<UpdateServerAutoTerminateTimeResponse>
     */
    public CompletableFuture<UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTimeAsync(
        UpdateServerAutoTerminateTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServerAutoTerminateTime);
    }

    /**
     * 修改云服务器定时删除时间
     *
     * 修改按需服务器，设置定时删除时间。如果设置的定时删除时间为空字符串，表示取消定时删除。
     * 
     * 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ecs:cloudServers:put。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerAutoTerminateTimeRequest 请求对象
     * @return AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse>
     */
    public AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTimeAsyncInvoker(
        UpdateServerAutoTerminateTimeRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.updateServerAutoTerminateTime, hcClient);
    }

    /**
     * 修改云服务器挂载的单个磁盘信息
     *
     * 修改云服务器云主机挂载的单个磁盘信息。&#39;当前仅支持修改delete_on_termination字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerBlockDeviceRequest 请求对象
     * @return CompletableFuture<UpdateServerBlockDeviceResponse>
     */
    public CompletableFuture<UpdateServerBlockDeviceResponse> updateServerBlockDeviceAsync(
        UpdateServerBlockDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServerBlockDevice);
    }

    /**
     * 修改云服务器挂载的单个磁盘信息
     *
     * 修改云服务器云主机挂载的单个磁盘信息。&#39;当前仅支持修改delete_on_termination字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerBlockDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse>
     */
    public AsyncInvoker<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse> updateServerBlockDeviceAsyncInvoker(
        UpdateServerBlockDeviceRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.updateServerBlockDevice, hcClient);
    }

    /**
     * 更新云服务器网卡挂载信息
     *
     * 更新云服务器网卡挂载信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerInterfaceRequest 请求对象
     * @return CompletableFuture<UpdateServerInterfaceResponse>
     */
    public CompletableFuture<UpdateServerInterfaceResponse> updateServerInterfaceAsync(
        UpdateServerInterfaceRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServerInterface);
    }

    /**
     * 更新云服务器网卡挂载信息
     *
     * 更新云服务器网卡挂载信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerInterfaceRequest 请求对象
     * @return AsyncInvoker<UpdateServerInterfaceRequest, UpdateServerInterfaceResponse>
     */
    public AsyncInvoker<UpdateServerInterfaceRequest, UpdateServerInterfaceResponse> updateServerInterfaceAsyncInvoker(
        UpdateServerInterfaceRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.updateServerInterface, hcClient);
    }

    /**
     * 更新云服务器元数据
     *
     * 更新云服务器元数据。
     * 
     * - 如果元数据中没有待更新字段，则自动添加该字段。
     * 
     * - 如果元数据中已存在待更新字段，则直接更新字段值。
     * 
     * - 如果元数据中的字段不再请求参数中，则保持不变
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerMetadataRequest 请求对象
     * @return CompletableFuture<UpdateServerMetadataResponse>
     */
    public CompletableFuture<UpdateServerMetadataResponse> updateServerMetadataAsync(
        UpdateServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServerMetadata);
    }

    /**
     * 更新云服务器元数据
     *
     * 更新云服务器元数据。
     * 
     * - 如果元数据中没有待更新字段，则自动添加该字段。
     * 
     * - 如果元数据中已存在待更新字段，则直接更新字段值。
     * 
     * - 如果元数据中的字段不再请求参数中，则保持不变
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerMetadataRequest 请求对象
     * @return AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse>
     */
    public AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse> updateServerMetadataAsyncInvoker(
        UpdateServerMetadataRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.updateServerMetadata, hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 返回Nova当前所有可用的版本。
     * 
     * 为了支持功能不断扩展，Nova API支持版本号区分。Nova中有两种形式的版本号：
     * 
     * - \&quot;主版本号\&quot;: 具有独立的url。
     * - \&quot;微版本号\&quot;: 通过Http请求头X-OpenStack-Nova-API-Version来使用，从2.27版本后更改为OpenStack-API-Version。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListVersionsRequest 请求对象
     * @return CompletableFuture<NovaListVersionsResponse>
     */
    public CompletableFuture<NovaListVersionsResponse> novaListVersionsAsync(NovaListVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListVersions);
    }

    /**
     * 查询API版本信息列表
     *
     * 返回Nova当前所有可用的版本。
     * 
     * 为了支持功能不断扩展，Nova API支持版本号区分。Nova中有两种形式的版本号：
     * 
     * - \&quot;主版本号\&quot;: 具有独立的url。
     * - \&quot;微版本号\&quot;: 通过Http请求头X-OpenStack-Nova-API-Version来使用，从2.27版本后更改为OpenStack-API-Version。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaListVersionsRequest 请求对象
     * @return AsyncInvoker<NovaListVersionsRequest, NovaListVersionsResponse>
     */
    public AsyncInvoker<NovaListVersionsRequest, NovaListVersionsResponse> novaListVersionsAsyncInvoker(
        NovaListVersionsRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaListVersions, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 返回指定版本的信息。
     * 为了支持功能不断扩展，Nova API支持版本号区分。Nova中有两种形式的版本号：
     * 
     * - \&quot;主版本号\&quot;: 具有独立的url。
     * - \&quot;微版本号\&quot;: 通过Http请求头X-OpenStack-Nova-API-Version来使用，从2.27版本后更改为OpenStack-API-Version。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowVersionRequest 请求对象
     * @return CompletableFuture<NovaShowVersionResponse>
     */
    public CompletableFuture<NovaShowVersionResponse> novaShowVersionAsync(NovaShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 返回指定版本的信息。
     * 为了支持功能不断扩展，Nova API支持版本号区分。Nova中有两种形式的版本号：
     * 
     * - \&quot;主版本号\&quot;: 具有独立的url。
     * - \&quot;微版本号\&quot;: 通过Http请求头X-OpenStack-Nova-API-Version来使用，从2.27版本后更改为OpenStack-API-Version。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request NovaShowVersionRequest 请求对象
     * @return AsyncInvoker<NovaShowVersionRequest, NovaShowVersionResponse>
     */
    public AsyncInvoker<NovaShowVersionRequest, NovaShowVersionResponse> novaShowVersionAsyncInvoker(
        NovaShowVersionRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.novaShowVersion, hcClient);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云服务器、删除云服务器、云服务器批量操作和网卡操作等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showJob);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询Job的执行状态。
     * 
     * 对于创建云服务器、删除云服务器、云服务器批量操作和网卡操作等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<>(request, EcsMeta.showJob, hcClient);
    }

}
