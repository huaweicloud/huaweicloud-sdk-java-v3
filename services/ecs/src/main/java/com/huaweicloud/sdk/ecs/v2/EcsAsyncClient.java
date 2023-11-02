package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchResetServersPasswordRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchResetServersPasswordResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchStartServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.BatchUpdateServersNameRequest;
import com.huaweicloud.sdk.ecs.v2.model.BatchUpdateServersNameResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerChargeModeRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerChargeModeResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitRequest;
import com.huaweicloud.sdk.ecs.v2.model.ChangeServerOsWithoutCloudInitResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreatePostPaidServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreatePostPaidServersResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreateServerGroupRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreateServerGroupResponse;
import com.huaweicloud.sdk.ecs.v2.model.CreateServersRequest;
import com.huaweicloud.sdk.ecs.v2.model.CreateServersResponse;
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
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorSellPoliciesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorSellPoliciesResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListFlavorsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListResizeFlavorsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListResizeFlavorsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerBlockDevicesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerBlockDevicesResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerGroupsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerGroupsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerInterfacesRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerInterfacesResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServerTagsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServerTagsResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServersByTagRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServersByTagResponse;
import com.huaweicloud.sdk.ecs.v2.model.ListServersDetailsRequest;
import com.huaweicloud.sdk.ecs.v2.model.ListServersDetailsResponse;
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
import com.huaweicloud.sdk.ecs.v2.model.NovaShowKeypairRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowKeypairResponse;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerRequest;
import com.huaweicloud.sdk.ecs.v2.model.NovaShowServerResponse;
import com.huaweicloud.sdk.ecs.v2.model.RegisterServerAutoRecoveryRequest;
import com.huaweicloud.sdk.ecs.v2.model.RegisterServerAutoRecoveryResponse;
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
import com.huaweicloud.sdk.ecs.v2.model.ShowJobRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowJobResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowResetPasswordFlagRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowResetPasswordFlagResponse;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerAutoRecoveryRequest;
import com.huaweicloud.sdk.ecs.v2.model.ShowServerAutoRecoveryResponse;
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
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerAutoTerminateTimeResponse;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerBlockDeviceRequest;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerBlockDeviceResponse;
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
     * 添加云服务器组成员
     *
     * 将云服务器加入云服务器组。添加成功后，如果该云服务器组是反亲和性策略的，则该云服务器与云服务器组中的其他成员尽量分散地创建在不同主机上。如果该云服务器时故障域类型的，则该云服务器会拥有故障域属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddServerGroupMemberRequest 请求对象
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
     * @param AddServerGroupMemberRequest 请求对象
     * @return AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse>
     */
    public AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse> addServerGroupMemberAsyncInvoker(
        AddServerGroupMemberRequest request) {
        return new AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse>(request,
            EcsMeta.addServerGroupMember, hcClient);
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
     * @param AssociateServerVirtualIpRequest 请求对象
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
     * @param AssociateServerVirtualIpRequest 请求对象
     * @return AsyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse>
     */
    public AsyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse> associateServerVirtualIpAsyncInvoker(
        AssociateServerVirtualIpRequest request) {
        return new AsyncInvoker<AssociateServerVirtualIpRequest, AssociateServerVirtualIpResponse>(request,
            EcsMeta.associateServerVirtualIp, hcClient);
    }

    /**
     * 弹性云服务器挂载磁盘
     *
     * 把磁盘挂载到弹性云服务器上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AttachServerVolumeRequest 请求对象
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
     * @param AttachServerVolumeRequest 请求对象
     * @return AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse>
     */
    public AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolumeAsyncInvoker(
        AttachServerVolumeRequest request) {
        return new AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse>(request,
            EcsMeta.attachServerVolume, hcClient);
    }

    /**
     * 批量添加云服务器网卡
     *
     * 给云服务器添加一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddServerNicsRequest 请求对象
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
     * @param BatchAddServerNicsRequest 请求对象
     * @return AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse>
     */
    public AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse> batchAddServerNicsAsyncInvoker(
        BatchAddServerNicsRequest request) {
        return new AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse>(request,
            EcsMeta.batchAddServerNics, hcClient);
    }

    /**
     * 批量挂载指定共享盘
     *
     * 将指定的共享磁盘一次性挂载到多个弹性云服务器，实现批量挂载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAttachSharableVolumesRequest 请求对象
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
     * @param BatchAttachSharableVolumesRequest 请求对象
     * @return AsyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse>
     */
    public AsyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse> batchAttachSharableVolumesAsyncInvoker(
        BatchAttachSharableVolumesRequest request) {
        return new AsyncInvoker<BatchAttachSharableVolumesRequest, BatchAttachSharableVolumesResponse>(request,
            EcsMeta.batchAttachSharableVolumes, hcClient);
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
     * @param BatchCreateServerTagsRequest 请求对象
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
     * @param BatchCreateServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse>
     */
    public AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> batchCreateServerTagsAsyncInvoker(
        BatchCreateServerTagsRequest request) {
        return new AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse>(request,
            EcsMeta.batchCreateServerTags, hcClient);
    }

    /**
     * 批量删除云服务器网卡
     *
     * 卸载并删除云服务器中的一张或多张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteServerNicsRequest 请求对象
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
     * @param BatchDeleteServerNicsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse>
     */
    public AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> batchDeleteServerNicsAsyncInvoker(
        BatchDeleteServerNicsRequest request) {
        return new AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse>(request,
            EcsMeta.batchDeleteServerNics, hcClient);
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
     * @param BatchDeleteServerTagsRequest 请求对象
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
     * @param BatchDeleteServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse>
     */
    public AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> batchDeleteServerTagsAsyncInvoker(
        BatchDeleteServerTagsRequest request) {
        return new AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse>(request,
            EcsMeta.batchDeleteServerTags, hcClient);
    }

    /**
     * 批量重启云服务器
     *
     * 根据给定的云服务器ID列表，批量重启云服务器，一次最多可以重启1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchRebootServersRequest 请求对象
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
     * @param BatchRebootServersRequest 请求对象
     * @return AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse>
     */
    public AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse> batchRebootServersAsyncInvoker(
        BatchRebootServersRequest request) {
        return new AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse>(request,
            EcsMeta.batchRebootServers, hcClient);
    }

    /**
     * 批量重置弹性云服务器密码
     *
     * 批量重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchResetServersPasswordRequest 请求对象
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
     * @param BatchResetServersPasswordRequest 请求对象
     * @return AsyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse>
     */
    public AsyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse> batchResetServersPasswordAsyncInvoker(
        BatchResetServersPasswordRequest request) {
        return new AsyncInvoker<BatchResetServersPasswordRequest, BatchResetServersPasswordResponse>(request,
            EcsMeta.batchResetServersPassword, hcClient);
    }

    /**
     * 批量启动云服务器
     *
     * 根据给定的云服务器ID列表，批量启动云服务器，一次最多可以启动1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStartServersRequest 请求对象
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
     * @param BatchStartServersRequest 请求对象
     * @return AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse>
     */
    public AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse> batchStartServersAsyncInvoker(
        BatchStartServersRequest request) {
        return new AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse>(request, EcsMeta.batchStartServers,
            hcClient);
    }

    /**
     * 批量关闭云服务器
     *
     * 根据给定的云服务器ID列表，批量关闭云服务器，一次最多可以关闭1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchStopServersRequest 请求对象
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
     * @param BatchStopServersRequest 请求对象
     * @return AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse>
     */
    public AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse> batchStopServersAsyncInvoker(
        BatchStopServersRequest request) {
        return new AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse>(request, EcsMeta.batchStopServers,
            hcClient);
    }

    /**
     * 批量修改弹性云服务器
     *
     * 批量修改弹性云服务器信息。
     * 当前仅支持批量修改云服务器名称，一次最多可以修改1000台。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateServersNameRequest 请求对象
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
     * @param BatchUpdateServersNameRequest 请求对象
     * @return AsyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse>
     */
    public AsyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse> batchUpdateServersNameAsyncInvoker(
        BatchUpdateServersNameRequest request) {
        return new AsyncInvoker<BatchUpdateServersNameRequest, BatchUpdateServersNameResponse>(request,
            EcsMeta.batchUpdateServersName, hcClient);
    }

    /**
     * 更换云服务器计费模式
     *
     * 更换云服务器的计费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeServerChargeModeRequest 请求对象
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
     * @param ChangeServerChargeModeRequest 请求对象
     * @return AsyncInvoker<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse>
     */
    public AsyncInvoker<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse> changeServerChargeModeAsyncInvoker(
        ChangeServerChargeModeRequest request) {
        return new AsyncInvoker<ChangeServerChargeModeRequest, ChangeServerChargeModeResponse>(request,
            EcsMeta.changeServerChargeMode, hcClient);
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
     * @param ChangeServerOsWithCloudInitRequest 请求对象
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
     * @param ChangeServerOsWithCloudInitRequest 请求对象
     * @return AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse>
     */
    public AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitAsyncInvoker(
        ChangeServerOsWithCloudInitRequest request) {
        return new AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse>(request,
            EcsMeta.changeServerOsWithCloudInit, hcClient);
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
     * @param ChangeServerOsWithoutCloudInitRequest 请求对象
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
     * @param ChangeServerOsWithoutCloudInitRequest 请求对象
     * @return AsyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse>
     */
    public AsyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse> changeServerOsWithoutCloudInitAsyncInvoker(
        ChangeServerOsWithoutCloudInitRequest request) {
        return new AsyncInvoker<ChangeServerOsWithoutCloudInitRequest, ChangeServerOsWithoutCloudInitResponse>(request,
            EcsMeta.changeServerOsWithoutCloudInit, hcClient);
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
     * @param CreatePostPaidServersRequest 请求对象
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
     * @param CreatePostPaidServersRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse>
     */
    public AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse> createPostPaidServersAsyncInvoker(
        CreatePostPaidServersRequest request) {
        return new AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse>(request,
            EcsMeta.createPostPaidServers, hcClient);
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
     * @param CreateServerGroupRequest 请求对象
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
     * @param CreateServerGroupRequest 请求对象
     * @return AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>
     */
    public AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupAsyncInvoker(
        CreateServerGroupRequest request) {
        return new AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>(request, EcsMeta.createServerGroup,
            hcClient);
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
     * @param CreateServersRequest 请求对象
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
     * @param CreateServersRequest 请求对象
     * @return AsyncInvoker<CreateServersRequest, CreateServersResponse>
     */
    public AsyncInvoker<CreateServersRequest, CreateServersResponse> createServersAsyncInvoker(
        CreateServersRequest request) {
        return new AsyncInvoker<CreateServersRequest, CreateServersResponse>(request, EcsMeta.createServers, hcClient);
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
     * @param DeleteServerGroupRequest 请求对象
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
     * @param DeleteServerGroupRequest 请求对象
     * @return AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse>
     */
    public AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse> deleteServerGroupAsyncInvoker(
        DeleteServerGroupRequest request) {
        return new AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse>(request, EcsMeta.deleteServerGroup,
            hcClient);
    }

    /**
     * 删除云服务器组成员
     *
     * 将弹性云服务器移出云服务器组。移出后，该云服务器与云服务器组中的成员不再遵从反亲和策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerGroupMemberRequest 请求对象
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
     * @param DeleteServerGroupMemberRequest 请求对象
     * @return AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse>
     */
    public AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> deleteServerGroupMemberAsyncInvoker(
        DeleteServerGroupMemberRequest request) {
        return new AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse>(request,
            EcsMeta.deleteServerGroupMember, hcClient);
    }

    /**
     * 删除云服务器指定元数据
     *
     * 删除云服务器指定元数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerMetadataRequest 请求对象
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
     * @param DeleteServerMetadataRequest 请求对象
     * @return AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse>
     */
    public AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse> deleteServerMetadataAsyncInvoker(
        DeleteServerMetadataRequest request) {
        return new AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse>(request,
            EcsMeta.deleteServerMetadata, hcClient);
    }

    /**
     * 云服务器清除密码(企业项目)
     *
     * 清除Windows云服务器初始安装时系统生成的密码记录。清除密码后，不影响云服务器密码登录功能，但不能再使用获取密码功能来查询该云服务器密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteServerPasswordRequest 请求对象
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
     * @param DeleteServerPasswordRequest 请求对象
     * @return AsyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse>
     */
    public AsyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse> deleteServerPasswordAsyncInvoker(
        DeleteServerPasswordRequest request) {
        return new AsyncInvoker<DeleteServerPasswordRequest, DeleteServerPasswordResponse>(request,
            EcsMeta.deleteServerPassword, hcClient);
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
     * @param DeleteServersRequest 请求对象
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
     * @param DeleteServersRequest 请求对象
     * @return AsyncInvoker<DeleteServersRequest, DeleteServersResponse>
     */
    public AsyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersAsyncInvoker(
        DeleteServersRequest request) {
        return new AsyncInvoker<DeleteServersRequest, DeleteServersResponse>(request, EcsMeta.deleteServers, hcClient);
    }

    /**
     * 弹性云服务器卸载磁盘
     *
     * 从弹性云服务器中卸载磁盘。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DetachServerVolumeRequest 请求对象
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
     * @param DetachServerVolumeRequest 请求对象
     * @return AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse>
     */
    public AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse> detachServerVolumeAsyncInvoker(
        DetachServerVolumeRequest request) {
        return new AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse>(request,
            EcsMeta.detachServerVolume, hcClient);
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
     * @param DisassociateServerVirtualIpRequest 请求对象
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
     * @param DisassociateServerVirtualIpRequest 请求对象
     * @return AsyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse>
     */
    public AsyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse> disassociateServerVirtualIpAsyncInvoker(
        DisassociateServerVirtualIpRequest request) {
        return new AsyncInvoker<DisassociateServerVirtualIpRequest, DisassociateServerVirtualIpResponse>(request,
            EcsMeta.disassociateServerVirtualIp, hcClient);
    }

    /**
     * 查询规格销售策略
     *
     * 查询规格销售策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorSellPoliciesRequest 请求对象
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
     * @param ListFlavorSellPoliciesRequest 请求对象
     * @return AsyncInvoker<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse>
     */
    public AsyncInvoker<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse> listFlavorSellPoliciesAsyncInvoker(
        ListFlavorSellPoliciesRequest request) {
        return new AsyncInvoker<ListFlavorSellPoliciesRequest, ListFlavorSellPoliciesResponse>(request,
            EcsMeta.listFlavorSellPolicies, hcClient);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     *
     * 查询云服务器规格详情信息和规格扩展信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
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
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, EcsMeta.listFlavors, hcClient);
    }

    /**
     * 查询云服务器规格变更支持列表
     *
     * 变更规格时，部分规格的云服务器之间不能互相变更。您可以通过本接口，通过指定弹性云服务器规格，查询该规格可以变更的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResizeFlavorsRequest 请求对象
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
     * @param ListResizeFlavorsRequest 请求对象
     * @return AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse>
     */
    public AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse> listResizeFlavorsAsyncInvoker(
        ListResizeFlavorsRequest request) {
        return new AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse>(request, EcsMeta.listResizeFlavors,
            hcClient);
    }

    /**
     * 查询弹性云服务器磁盘信息
     *
     * 查询弹性云服务器挂载的磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerBlockDevicesRequest 请求对象
     * @return CompletableFuture<ListServerBlockDevicesResponse>
     */
    public CompletableFuture<ListServerBlockDevicesResponse> listServerBlockDevicesAsync(
        ListServerBlockDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerBlockDevices);
    }

    /**
     * 查询弹性云服务器磁盘信息
     *
     * 查询弹性云服务器挂载的磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerBlockDevicesRequest 请求对象
     * @return AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse>
     */
    public AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> listServerBlockDevicesAsyncInvoker(
        ListServerBlockDevicesRequest request) {
        return new AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse>(request,
            EcsMeta.listServerBlockDevices, hcClient);
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
     * @param ListServerGroupsRequest 请求对象
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
     * @param ListServerGroupsRequest 请求对象
     * @return AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>
     */
    public AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse> listServerGroupsAsyncInvoker(
        ListServerGroupsRequest request) {
        return new AsyncInvoker<ListServerGroupsRequest, ListServerGroupsResponse>(request, EcsMeta.listServerGroups,
            hcClient);
    }

    /**
     * 查询云服务器网卡信息
     *
     * 查询云服务器网卡信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServerInterfacesRequest 请求对象
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
     * @param ListServerInterfacesRequest 请求对象
     * @return AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse>
     */
    public AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse> listServerInterfacesAsyncInvoker(
        ListServerInterfacesRequest request) {
        return new AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse>(request,
            EcsMeta.listServerInterfaces, hcClient);
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
     * @param ListServerTagsRequest 请求对象
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
     * @param ListServerTagsRequest 请求对象
     * @return AsyncInvoker<ListServerTagsRequest, ListServerTagsResponse>
     */
    public AsyncInvoker<ListServerTagsRequest, ListServerTagsResponse> listServerTagsAsyncInvoker(
        ListServerTagsRequest request) {
        return new AsyncInvoker<ListServerTagsRequest, ListServerTagsResponse>(request, EcsMeta.listServerTags,
            hcClient);
    }

    /**
     * 按标签查询云服务器列表
     *
     * 使用标签过滤弹性云服务器，并返回云服务器使用的所有标签和资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListServersByTagRequest 请求对象
     * @return CompletableFuture<ListServersByTagResponse>
     */
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
     * @param ListServersByTagRequest 请求对象
     * @return AsyncInvoker<ListServersByTagRequest, ListServersByTagResponse>
     */
    public AsyncInvoker<ListServersByTagRequest, ListServersByTagResponse> listServersByTagAsyncInvoker(
        ListServersByTagRequest request) {
        return new AsyncInvoker<ListServersByTagRequest, ListServersByTagResponse>(request, EcsMeta.listServersByTag,
            hcClient);
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
     * @param ListServersDetailsRequest 请求对象
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
     * @param ListServersDetailsRequest 请求对象
     * @return AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse>
     */
    public AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse> listServersDetailsAsyncInvoker(
        ListServersDetailsRequest request) {
        return new AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse>(request,
            EcsMeta.listServersDetails, hcClient);
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
     * @param MigrateServerRequest 请求对象
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
     * @param MigrateServerRequest 请求对象
     * @return AsyncInvoker<MigrateServerRequest, MigrateServerResponse>
     */
    public AsyncInvoker<MigrateServerRequest, MigrateServerResponse> migrateServerAsyncInvoker(
        MigrateServerRequest request) {
        return new AsyncInvoker<MigrateServerRequest, MigrateServerResponse>(request, EcsMeta.migrateServer, hcClient);
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
     * @param NovaAssociateSecurityGroupRequest 请求对象
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
     * @param NovaAssociateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse>
     */
    public AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupAsyncInvoker(
        NovaAssociateSecurityGroupRequest request) {
        return new AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse>(request,
            EcsMeta.novaAssociateSecurityGroup, hcClient);
    }

    /**
     * 添加云服务器网卡
     *
     * 给云服务器添加一张网卡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaAttachInterfaceRequest 请求对象
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
     * @param NovaAttachInterfaceRequest 请求对象
     * @return AsyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse>
     */
    public AsyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse> novaAttachInterfaceAsyncInvoker(
        NovaAttachInterfaceRequest request) {
        return new AsyncInvoker<NovaAttachInterfaceRequest, NovaAttachInterfaceResponse>(request,
            EcsMeta.novaAttachInterface, hcClient);
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
     * @param NovaCreateKeypairRequest 请求对象
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
     * @param NovaCreateKeypairRequest 请求对象
     * @return AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse>
     */
    public AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse> novaCreateKeypairAsyncInvoker(
        NovaCreateKeypairRequest request) {
        return new AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse>(request, EcsMeta.novaCreateKeypair,
            hcClient);
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
     * @param NovaCreateServersRequest 请求对象
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
     * @param NovaCreateServersRequest 请求对象
     * @return AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse>
     */
    public AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse> novaCreateServersAsyncInvoker(
        NovaCreateServersRequest request) {
        return new AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse>(request, EcsMeta.novaCreateServers,
            hcClient);
    }

    /**
     * 删除SSH密钥
     *
     * 根据SSH密钥的名称，删除指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaDeleteKeypairRequest 请求对象
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
     * @param NovaDeleteKeypairRequest 请求对象
     * @return AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse>
     */
    public AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> novaDeleteKeypairAsyncInvoker(
        NovaDeleteKeypairRequest request) {
        return new AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse>(request, EcsMeta.novaDeleteKeypair,
            hcClient);
    }

    /**
     * 删除云服务器
     *
     * 删除一台云服务器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaDeleteServerRequest 请求对象
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
     * @param NovaDeleteServerRequest 请求对象
     * @return AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse>
     */
    public AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse> novaDeleteServerAsyncInvoker(
        NovaDeleteServerRequest request) {
        return new AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse>(request, EcsMeta.novaDeleteServer,
            hcClient);
    }

    /**
     * 移除安全组
     *
     * 移除弹性云服务器中的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaDisassociateSecurityGroupRequest 请求对象
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
     * @param NovaDisassociateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse>
     */
    public AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupAsyncInvoker(
        NovaDisassociateSecurityGroupRequest request) {
        return new AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse>(request,
            EcsMeta.novaDisassociateSecurityGroup, hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 查询可用域列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<NovaListAvailabilityZonesResponse>
     */
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
     * @param NovaListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse>
     */
    public AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> novaListAvailabilityZonesAsyncInvoker(
        NovaListAvailabilityZonesRequest request) {
        return new AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse>(request,
            EcsMeta.novaListAvailabilityZones, hcClient);
    }

    /**
     * 查询SSH密钥列表
     *
     * 查询SSH密钥信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListKeypairsRequest 请求对象
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
     * @param NovaListKeypairsRequest 请求对象
     * @return AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse>
     */
    public AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse> novaListKeypairsAsyncInvoker(
        NovaListKeypairsRequest request) {
        return new AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse>(request, EcsMeta.novaListKeypairs,
            hcClient);
    }

    /**
     * 查询指定云服务器安全组列表
     *
     * 查询指定弹性云服务器的安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListServerSecurityGroupsRequest 请求对象
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
     * @param NovaListServerSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse>
     */
    public AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsAsyncInvoker(
        NovaListServerSecurityGroupsRequest request) {
        return new AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse>(request,
            EcsMeta.novaListServerSecurityGroups, hcClient);
    }

    /**
     * 查询云服务器详情列表
     *
     * 查询云服务器详情信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaListServersDetailsRequest 请求对象
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
     * @param NovaListServersDetailsRequest 请求对象
     * @return AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse>
     */
    public AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse> novaListServersDetailsAsyncInvoker(
        NovaListServersDetailsRequest request) {
        return new AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse>(request,
            EcsMeta.novaListServersDetails, hcClient);
    }

    /**
     * 查询SSH密钥详情
     *
     * 根据SSH密钥名称查询指定SSH密钥。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaShowKeypairRequest 请求对象
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
     * @param NovaShowKeypairRequest 请求对象
     * @return AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse>
     */
    public AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse> novaShowKeypairAsyncInvoker(
        NovaShowKeypairRequest request) {
        return new AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse>(request, EcsMeta.novaShowKeypair,
            hcClient);
    }

    /**
     * 查询云服务器详情
     *
     * 根据云服务器ID，查询云服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param NovaShowServerRequest 请求对象
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
     * @param NovaShowServerRequest 请求对象
     * @return AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse>
     */
    public AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse> novaShowServerAsyncInvoker(
        NovaShowServerRequest request) {
        return new AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse>(request, EcsMeta.novaShowServer,
            hcClient);
    }

    /**
     * 管理云服务器自动恢复动作
     *
     * 配置、删除云服务器自动恢复动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterServerAutoRecoveryRequest 请求对象
     * @return CompletableFuture<RegisterServerAutoRecoveryResponse>
     */
    public CompletableFuture<RegisterServerAutoRecoveryResponse> registerServerAutoRecoveryAsync(
        RegisterServerAutoRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.registerServerAutoRecovery);
    }

    /**
     * 管理云服务器自动恢复动作
     *
     * 配置、删除云服务器自动恢复动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RegisterServerAutoRecoveryRequest 请求对象
     * @return AsyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse>
     */
    public AsyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse> registerServerAutoRecoveryAsyncInvoker(
        RegisterServerAutoRecoveryRequest request) {
        return new AsyncInvoker<RegisterServerAutoRecoveryRequest, RegisterServerAutoRecoveryResponse>(request,
            EcsMeta.registerServerAutoRecovery, hcClient);
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
     * @param RegisterServerMonitorRequest 请求对象
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
     * @param RegisterServerMonitorRequest 请求对象
     * @return AsyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse>
     */
    public AsyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse> registerServerMonitorAsyncInvoker(
        RegisterServerMonitorRequest request) {
        return new AsyncInvoker<RegisterServerMonitorRequest, RegisterServerMonitorResponse>(request,
            EcsMeta.registerServerMonitor, hcClient);
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
     * @param ReinstallServerWithCloudInitRequest 请求对象
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
     * @param ReinstallServerWithCloudInitRequest 请求对象
     * @return AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse>
     */
    public AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitAsyncInvoker(
        ReinstallServerWithCloudInitRequest request) {
        return new AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse>(request,
            EcsMeta.reinstallServerWithCloudInit, hcClient);
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
     * @param ReinstallServerWithoutCloudInitRequest 请求对象
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
     * @param ReinstallServerWithoutCloudInitRequest 请求对象
     * @return AsyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse>
     */
    public AsyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse> reinstallServerWithoutCloudInitAsyncInvoker(
        ReinstallServerWithoutCloudInitRequest request) {
        return new AsyncInvoker<ReinstallServerWithoutCloudInitRequest, ReinstallServerWithoutCloudInitResponse>(
            request, EcsMeta.reinstallServerWithoutCloudInit, hcClient);
    }

    /**
     * 一键重置弹性云服务器密码(企业项目)
     *
     * 重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetServerPasswordRequest 请求对象
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
     * @param ResetServerPasswordRequest 请求对象
     * @return AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse>
     */
    public AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse> resetServerPasswordAsyncInvoker(
        ResetServerPasswordRequest request) {
        return new AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse>(request,
            EcsMeta.resetServerPassword, hcClient);
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
     * @param ResizePostPaidServerRequest 请求对象
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
     * @param ResizePostPaidServerRequest 请求对象
     * @return AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse>
     */
    public AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse> resizePostPaidServerAsyncInvoker(
        ResizePostPaidServerRequest request) {
        return new AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse>(request,
            EcsMeta.resizePostPaidServer, hcClient);
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
     * @param ResizeServerRequest 请求对象
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
     * @param ResizeServerRequest 请求对象
     * @return AsyncInvoker<ResizeServerRequest, ResizeServerResponse>
     */
    public AsyncInvoker<ResizeServerRequest, ResizeServerResponse> resizeServerAsyncInvoker(
        ResizeServerRequest request) {
        return new AsyncInvoker<ResizeServerRequest, ResizeServerResponse>(request, EcsMeta.resizeServer, hcClient);
    }

    /**
     * 查询是否支持一键重置密码
     *
     * 查询弹性云服务器是否支持一键重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResetPasswordFlagRequest 请求对象
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
     * @param ShowResetPasswordFlagRequest 请求对象
     * @return AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse>
     */
    public AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> showResetPasswordFlagAsyncInvoker(
        ShowResetPasswordFlagRequest request) {
        return new AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse>(request,
            EcsMeta.showResetPasswordFlag, hcClient);
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
     * @param ShowServerRequest 请求对象
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
     * @param ShowServerRequest 请求对象
     * @return AsyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public AsyncInvoker<ShowServerRequest, ShowServerResponse> showServerAsyncInvoker(ShowServerRequest request) {
        return new AsyncInvoker<ShowServerRequest, ShowServerResponse>(request, EcsMeta.showServer, hcClient);
    }

    /**
     * 查询云服务器是否配置了自动恢复动作
     *
     * 查询云服务器是否配置了自动恢复动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerAutoRecoveryRequest 请求对象
     * @return CompletableFuture<ShowServerAutoRecoveryResponse>
     */
    public CompletableFuture<ShowServerAutoRecoveryResponse> showServerAutoRecoveryAsync(
        ShowServerAutoRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerAutoRecovery);
    }

    /**
     * 查询云服务器是否配置了自动恢复动作
     *
     * 查询云服务器是否配置了自动恢复动作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerAutoRecoveryRequest 请求对象
     * @return AsyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse>
     */
    public AsyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse> showServerAutoRecoveryAsyncInvoker(
        ShowServerAutoRecoveryRequest request) {
        return new AsyncInvoker<ShowServerAutoRecoveryRequest, ShowServerAutoRecoveryResponse>(request,
            EcsMeta.showServerAutoRecovery, hcClient);
    }

    /**
     * 查询弹性云服务器单个磁盘信息
     *
     * 查询弹性云服务器挂载的单个磁盘信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerBlockDeviceRequest 请求对象
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
     * @param ShowServerBlockDeviceRequest 请求对象
     * @return AsyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse>
     */
    public AsyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse> showServerBlockDeviceAsyncInvoker(
        ShowServerBlockDeviceRequest request) {
        return new AsyncInvoker<ShowServerBlockDeviceRequest, ShowServerBlockDeviceResponse>(request,
            EcsMeta.showServerBlockDevice, hcClient);
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
     * @param ShowServerGroupRequest 请求对象
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
     * @param ShowServerGroupRequest 请求对象
     * @return AsyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse>
     */
    public AsyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse> showServerGroupAsyncInvoker(
        ShowServerGroupRequest request) {
        return new AsyncInvoker<ShowServerGroupRequest, ShowServerGroupResponse>(request, EcsMeta.showServerGroup,
            hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerLimitsRequest 请求对象
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
     * @param ShowServerLimitsRequest 请求对象
     * @return AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse>
     */
    public AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse> showServerLimitsAsyncInvoker(
        ShowServerLimitsRequest request) {
        return new AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse>(request, EcsMeta.showServerLimits,
            hcClient);
    }

    /**
     * 云服务器获取密码(企业项目)
     *
     * 当通过支持Cloudbase-init功能的镜像创建Windows云服务器时，获取云服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerPasswordRequest 请求对象
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
     * @param ShowServerPasswordRequest 请求对象
     * @return AsyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse>
     */
    public AsyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse> showServerPasswordAsyncInvoker(
        ShowServerPasswordRequest request) {
        return new AsyncInvoker<ShowServerPasswordRequest, ShowServerPasswordResponse>(request,
            EcsMeta.showServerPassword, hcClient);
    }

    /**
     * 获取VNC远程登录地址
     *
     * 获取弹性云服务器VNC远程登录地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowServerRemoteConsoleRequest 请求对象
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
     * @param ShowServerRemoteConsoleRequest 请求对象
     * @return AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>
     */
    public AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsyncInvoker(
        ShowServerRemoteConsoleRequest request) {
        return new AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>(request,
            EcsMeta.showServerRemoteConsole, hcClient);
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
     * @param ShowServerTagsRequest 请求对象
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
     * @param ShowServerTagsRequest 请求对象
     * @return AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse>
     */
    public AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse> showServerTagsAsyncInvoker(
        ShowServerTagsRequest request) {
        return new AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse>(request, EcsMeta.showServerTags,
            hcClient);
    }

    /**
     * 修改云服务器
     *
     * 修改云服务器信息，目前支持修改云服务器名称及描述和hostname。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerRequest 请求对象
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
     * @param UpdateServerRequest 请求对象
     * @return AsyncInvoker<UpdateServerRequest, UpdateServerResponse>
     */
    public AsyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerAsyncInvoker(
        UpdateServerRequest request) {
        return new AsyncInvoker<UpdateServerRequest, UpdateServerResponse>(request, EcsMeta.updateServer, hcClient);
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
     * @param UpdateServerAutoTerminateTimeRequest 请求对象
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
     * @param UpdateServerAutoTerminateTimeRequest 请求对象
     * @return AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse>
     */
    public AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTimeAsyncInvoker(
        UpdateServerAutoTerminateTimeRequest request) {
        return new AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse>(request,
            EcsMeta.updateServerAutoTerminateTime, hcClient);
    }

    /**
     * 修改云服务器挂载的单个磁盘信息
     *
     * 修改云服务器云主机挂载的单个磁盘信息。&#39;当前仅支持修改delete_on_termination字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateServerBlockDeviceRequest 请求对象
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
     * @param UpdateServerBlockDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse>
     */
    public AsyncInvoker<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse> updateServerBlockDeviceAsyncInvoker(
        UpdateServerBlockDeviceRequest request) {
        return new AsyncInvoker<UpdateServerBlockDeviceRequest, UpdateServerBlockDeviceResponse>(request,
            EcsMeta.updateServerBlockDevice, hcClient);
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
     * @param UpdateServerMetadataRequest 请求对象
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
     * @param UpdateServerMetadataRequest 请求对象
     * @return AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse>
     */
    public AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse> updateServerMetadataAsyncInvoker(
        UpdateServerMetadataRequest request) {
        return new AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse>(request,
            EcsMeta.updateServerMetadata, hcClient);
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
     * @param ShowJobRequest 请求对象
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
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, EcsMeta.showJob, hcClient);
    }

}
