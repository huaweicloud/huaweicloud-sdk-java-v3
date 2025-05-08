package com.huaweicloud.sdk.bms.v1;

import com.huaweicloud.sdk.bms.v1.model.AddServerNicsRequest;
import com.huaweicloud.sdk.bms.v1.model.AddServerNicsResponse;
import com.huaweicloud.sdk.bms.v1.model.AttachBaremetalServerVolumeRequest;
import com.huaweicloud.sdk.bms.v1.model.AttachBaremetalServerVolumeResponse;
import com.huaweicloud.sdk.bms.v1.model.BatchCreateBaremetalServerTagsRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchCreateBaremetalServerTagsResponse;
import com.huaweicloud.sdk.bms.v1.model.BatchDeleteBaremetalServerTagsRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchDeleteBaremetalServerTagsResponse;
import com.huaweicloud.sdk.bms.v1.model.BatchRebootBaremetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchRebootBaremetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.BatchStartBaremetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchStartBaremetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.BatchStopBaremetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.BatchStopBaremetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalServerNameRequest;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalServerNameResponse;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalServerOsRequest;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalServerOsResponse;
import com.huaweicloud.sdk.bms.v1.model.CreateBareMetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.CreateBareMetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.DeleteBaremetalServerRequest;
import com.huaweicloud.sdk.bms.v1.model.DeleteBaremetalServerResponse;
import com.huaweicloud.sdk.bms.v1.model.DeleteServerNicsRequest;
import com.huaweicloud.sdk.bms.v1.model.DeleteServerNicsResponse;
import com.huaweicloud.sdk.bms.v1.model.DeleteWindowsBareMetalServerPasswordRequest;
import com.huaweicloud.sdk.bms.v1.model.DeleteWindowsBareMetalServerPasswordResponse;
import com.huaweicloud.sdk.bms.v1.model.DetachBaremetalServerVolumeRequest;
import com.huaweicloud.sdk.bms.v1.model.DetachBaremetalServerVolumeResponse;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServerDetailsRequest;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServerDetailsResponse;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServersDetailRequest;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServersDetailResponse;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServersRequest;
import com.huaweicloud.sdk.bms.v1.model.ListBareMetalServersResponse;
import com.huaweicloud.sdk.bms.v1.model.ListBaremetalFlavorDetailExtendsRequest;
import com.huaweicloud.sdk.bms.v1.model.ListBaremetalFlavorDetailExtendsResponse;
import com.huaweicloud.sdk.bms.v1.model.ReinstallBaremetalServerOsRequest;
import com.huaweicloud.sdk.bms.v1.model.ReinstallBaremetalServerOsResponse;
import com.huaweicloud.sdk.bms.v1.model.ResetPwdOneClickRequest;
import com.huaweicloud.sdk.bms.v1.model.ResetPwdOneClickResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerInterfaceAttachmentsRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerInterfaceAttachmentsResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerTagsRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerTagsResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerVolumeInfoRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerVolumeInfoResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowJobInfosRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowJobInfosResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowResetPwdRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowResetPwdResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowServerRemoteConsoleRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowServerRemoteConsoleResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowSpecifiedVersionRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowSpecifiedVersionResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowTenantQuotaRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowTenantQuotaResponse;
import com.huaweicloud.sdk.bms.v1.model.ShowWindowsBaremetalServerPwdRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowWindowsBaremetalServerPwdResponse;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerInterfaceAttachmentsRequest;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerInterfaceAttachmentsResponse;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataRequest;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class BmsClient {

    protected HcClient hcClient;

    public BmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BmsClient> newBuilder() {
        ClientBuilder<BmsClient> clientBuilder = new ClientBuilder<>(BmsClient::new);
        return clientBuilder;
    }

    /**
     * 裸金属服务器绑定弹性网卡
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServerNicsRequest 请求对象
     * @return AddServerNicsResponse
     */
    public AddServerNicsResponse addServerNics(AddServerNicsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.addServerNics);
    }

    /**
     * 裸金属服务器绑定弹性网卡
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServerNicsRequest 请求对象
     * @return SyncInvoker<AddServerNicsRequest, AddServerNicsResponse>
     */
    public SyncInvoker<AddServerNicsRequest, AddServerNicsResponse> addServerNicsInvoker(AddServerNicsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.addServerNics, hcClient);
    }

    /**
     * 裸金属服务器挂载云硬盘
     *
     * 裸金属服务器创建成功后，如果发现磁盘不够用或者当前磁盘不满足要求，可以将已有云硬盘挂载给裸金属服务器，作为数据盘使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachBaremetalServerVolumeRequest 请求对象
     * @return AttachBaremetalServerVolumeResponse
     */
    public AttachBaremetalServerVolumeResponse attachBaremetalServerVolume(AttachBaremetalServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.attachBaremetalServerVolume);
    }

    /**
     * 裸金属服务器挂载云硬盘
     *
     * 裸金属服务器创建成功后，如果发现磁盘不够用或者当前磁盘不满足要求，可以将已有云硬盘挂载给裸金属服务器，作为数据盘使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachBaremetalServerVolumeRequest 请求对象
     * @return SyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse>
     */
    public SyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeInvoker(
        AttachBaremetalServerVolumeRequest request) {
        return new SyncInvoker<>(request, BmsMeta.attachBaremetalServerVolume, hcClient);
    }

    /**
     * 批量添加裸金属服务器标签
     *
     * - 为指定裸金属服务器批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateBaremetalServerTagsRequest 请求对象
     * @return BatchCreateBaremetalServerTagsResponse
     */
    public BatchCreateBaremetalServerTagsResponse batchCreateBaremetalServerTags(
        BatchCreateBaremetalServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchCreateBaremetalServerTags);
    }

    /**
     * 批量添加裸金属服务器标签
     *
     * - 为指定裸金属服务器批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateBaremetalServerTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse>
     */
    public SyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsInvoker(
        BatchCreateBaremetalServerTagsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.batchCreateBaremetalServerTags, hcClient);
    }

    /**
     * 批量删除裸金属服务器标签
     *
     * - 为指定云服务器批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBaremetalServerTagsRequest 请求对象
     * @return BatchDeleteBaremetalServerTagsResponse
     */
    public BatchDeleteBaremetalServerTagsResponse batchDeleteBaremetalServerTags(
        BatchDeleteBaremetalServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchDeleteBaremetalServerTags);
    }

    /**
     * 批量删除裸金属服务器标签
     *
     * - 为指定云服务器批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBaremetalServerTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse>
     */
    public SyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsInvoker(
        BatchDeleteBaremetalServerTagsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.batchDeleteBaremetalServerTags, hcClient);
    }

    /**
     * 重启裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量重启裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootBaremetalServersRequest 请求对象
     * @return BatchRebootBaremetalServersResponse
     */
    public BatchRebootBaremetalServersResponse batchRebootBaremetalServers(BatchRebootBaremetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchRebootBaremetalServers);
    }

    /**
     * 重启裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量重启裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootBaremetalServersRequest 请求对象
     * @return SyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse>
     */
    public SyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> batchRebootBaremetalServersInvoker(
        BatchRebootBaremetalServersRequest request) {
        return new SyncInvoker<>(request, BmsMeta.batchRebootBaremetalServers, hcClient);
    }

    /**
     * 启动裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量启动裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartBaremetalServersRequest 请求对象
     * @return BatchStartBaremetalServersResponse
     */
    public BatchStartBaremetalServersResponse batchStartBaremetalServers(BatchStartBaremetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchStartBaremetalServers);
    }

    /**
     * 启动裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量启动裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartBaremetalServersRequest 请求对象
     * @return SyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse>
     */
    public SyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> batchStartBaremetalServersInvoker(
        BatchStartBaremetalServersRequest request) {
        return new SyncInvoker<>(request, BmsMeta.batchStartBaremetalServers, hcClient);
    }

    /**
     * 关闭裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量关闭裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopBaremetalServersRequest 请求对象
     * @return BatchStopBaremetalServersResponse
     */
    public BatchStopBaremetalServersResponse batchStopBaremetalServers(BatchStopBaremetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.batchStopBaremetalServers);
    }

    /**
     * 关闭裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量关闭裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopBaremetalServersRequest 请求对象
     * @return SyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse>
     */
    public SyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> batchStopBaremetalServersInvoker(
        BatchStopBaremetalServersRequest request) {
        return new SyncInvoker<>(request, BmsMeta.batchStopBaremetalServers, hcClient);
    }

    /**
     * 修改裸金属服务器名称
     *
     * 修改裸金属服务器名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaremetalServerNameRequest 请求对象
     * @return ChangeBaremetalServerNameResponse
     */
    public ChangeBaremetalServerNameResponse changeBaremetalServerName(ChangeBaremetalServerNameRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.changeBaremetalServerName);
    }

    /**
     * 修改裸金属服务器名称
     *
     * 修改裸金属服务器名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaremetalServerNameRequest 请求对象
     * @return SyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse>
     */
    public SyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> changeBaremetalServerNameInvoker(
        ChangeBaremetalServerNameRequest request) {
        return new SyncInvoker<>(request, BmsMeta.changeBaremetalServerName, hcClient);
    }

    /**
     * 切换裸金属服务器的操作系统
     *
     * 切换裸金属服务器的操作系统。切换操作系统支持密码或者密钥注入，该接口支持企业项目细粒度权限的校验，具体细粒度请参见 bms:servers:changeOS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaremetalServerOsRequest 请求对象
     * @return ChangeBaremetalServerOsResponse
     */
    public ChangeBaremetalServerOsResponse changeBaremetalServerOs(ChangeBaremetalServerOsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.changeBaremetalServerOs);
    }

    /**
     * 切换裸金属服务器的操作系统
     *
     * 切换裸金属服务器的操作系统。切换操作系统支持密码或者密钥注入，该接口支持企业项目细粒度权限的校验，具体细粒度请参见 bms:servers:changeOS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaremetalServerOsRequest 请求对象
     * @return SyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse>
     */
    public SyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> changeBaremetalServerOsInvoker(
        ChangeBaremetalServerOsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.changeBaremetalServerOs, hcClient);
    }

    /**
     * 创建裸金属服务器
     *
     * 创建一台或多台裸金属服务器,裸金属服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBareMetalServersRequest 请求对象
     * @return CreateBareMetalServersResponse
     */
    public CreateBareMetalServersResponse createBareMetalServers(CreateBareMetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.createBareMetalServers);
    }

    /**
     * 创建裸金属服务器
     *
     * 创建一台或多台裸金属服务器,裸金属服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBareMetalServersRequest 请求对象
     * @return SyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse>
     */
    public SyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse> createBareMetalServersInvoker(
        CreateBareMetalServersRequest request) {
        return new SyncInvoker<>(request, BmsMeta.createBareMetalServers, hcClient);
    }

    /**
     * 删除裸金属服务器裸金属服务器物理机
     *
     * 删除裸金属服务器裸金属服务器物理机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBaremetalServerRequest 请求对象
     * @return DeleteBaremetalServerResponse
     */
    public DeleteBaremetalServerResponse deleteBaremetalServer(DeleteBaremetalServerRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.deleteBaremetalServer);
    }

    /**
     * 删除裸金属服务器裸金属服务器物理机
     *
     * 删除裸金属服务器裸金属服务器物理机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBaremetalServerRequest 请求对象
     * @return SyncInvoker<DeleteBaremetalServerRequest, DeleteBaremetalServerResponse>
     */
    public SyncInvoker<DeleteBaremetalServerRequest, DeleteBaremetalServerResponse> deleteBaremetalServerInvoker(
        DeleteBaremetalServerRequest request) {
        return new SyncInvoker<>(request, BmsMeta.deleteBaremetalServer, hcClient);
    }

    /**
     * 裸金属服务器解绑弹性网卡
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerNicsRequest 请求对象
     * @return DeleteServerNicsResponse
     */
    public DeleteServerNicsResponse deleteServerNics(DeleteServerNicsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.deleteServerNics);
    }

    /**
     * 裸金属服务器解绑弹性网卡
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerNicsRequest 请求对象
     * @return SyncInvoker<DeleteServerNicsRequest, DeleteServerNicsResponse>
     */
    public SyncInvoker<DeleteServerNicsRequest, DeleteServerNicsResponse> deleteServerNicsInvoker(
        DeleteServerNicsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.deleteServerNics, hcClient);
    }

    /**
     * Windows裸金属服务器清除密码
     *
     * 清除Windows裸金属服务器初始安装时系统生成的密码记录。清除密码后，不影响裸金属服务器密码登录功能，但不能再使用获取密码功能来查询该裸金属服务器密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWindowsBareMetalServerPasswordRequest 请求对象
     * @return DeleteWindowsBareMetalServerPasswordResponse
     */
    public DeleteWindowsBareMetalServerPasswordResponse deleteWindowsBareMetalServerPassword(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.deleteWindowsBareMetalServerPassword);
    }

    /**
     * Windows裸金属服务器清除密码
     *
     * 清除Windows裸金属服务器初始安装时系统生成的密码记录。清除密码后，不影响裸金属服务器密码登录功能，但不能再使用获取密码功能来查询该裸金属服务器密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWindowsBareMetalServerPasswordRequest 请求对象
     * @return SyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse>
     */
    public SyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordInvoker(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return new SyncInvoker<>(request, BmsMeta.deleteWindowsBareMetalServerPassword, hcClient);
    }

    /**
     * 裸金属服务器卸载云磁盘
     *
     * 将挂载至裸金属服务器中的磁盘卸载；对于挂载在系统盘盘位（也就是“/dev/sda”挂载点）上的磁盘，不允许执行卸载操作；对于挂载在数据盘盘位（非“/dev/sda”挂载点）上的磁盘，支持离线卸载和在线卸载（裸金属服务器处于“运行中”状态）磁盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachBaremetalServerVolumeRequest 请求对象
     * @return DetachBaremetalServerVolumeResponse
     */
    public DetachBaremetalServerVolumeResponse detachBaremetalServerVolume(DetachBaremetalServerVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.detachBaremetalServerVolume);
    }

    /**
     * 裸金属服务器卸载云磁盘
     *
     * 将挂载至裸金属服务器中的磁盘卸载；对于挂载在系统盘盘位（也就是“/dev/sda”挂载点）上的磁盘，不允许执行卸载操作；对于挂载在数据盘盘位（非“/dev/sda”挂载点）上的磁盘，支持离线卸载和在线卸载（裸金属服务器处于“运行中”状态）磁盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachBaremetalServerVolumeRequest 请求对象
     * @return SyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse>
     */
    public SyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeInvoker(
        DetachBaremetalServerVolumeRequest request) {
        return new SyncInvoker<>(request, BmsMeta.detachBaremetalServerVolume, hcClient);
    }

    /**
     * 查询裸金属服务器详情
     *
     * 获取裸金属服务器详细信息，该接口支持查询裸金属服务器的计费方式，以及是否被冻结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServerDetailsRequest 请求对象
     * @return ListBareMetalServerDetailsResponse
     */
    public ListBareMetalServerDetailsResponse listBareMetalServerDetails(ListBareMetalServerDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBareMetalServerDetails);
    }

    /**
     * 查询裸金属服务器详情
     *
     * 获取裸金属服务器详细信息，该接口支持查询裸金属服务器的计费方式，以及是否被冻结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServerDetailsRequest 请求对象
     * @return SyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse>
     */
    public SyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> listBareMetalServerDetailsInvoker(
        ListBareMetalServerDetailsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.listBareMetalServerDetails, hcClient);
    }

    /**
     * 查询裸金属服务器详情列表
     *
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。该接口支持查询裸金属服务器计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServersRequest 请求对象
     * @return ListBareMetalServersResponse
     */
    public ListBareMetalServersResponse listBareMetalServers(ListBareMetalServersRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBareMetalServers);
    }

    /**
     * 查询裸金属服务器详情列表
     *
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。该接口支持查询裸金属服务器计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServersRequest 请求对象
     * @return SyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse>
     */
    public SyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse> listBareMetalServersInvoker(
        ListBareMetalServersRequest request) {
        return new SyncInvoker<>(request, BmsMeta.listBareMetalServers, hcClient);
    }

    /**
     * 查询裸金属服务器列表
     *
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServersDetailRequest 请求对象
     * @return ListBareMetalServersDetailResponse
     */
    public ListBareMetalServersDetailResponse listBareMetalServersDetail(ListBareMetalServersDetailRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBareMetalServersDetail);
    }

    /**
     * 查询裸金属服务器列表
     *
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServersDetailRequest 请求对象
     * @return SyncInvoker<ListBareMetalServersDetailRequest, ListBareMetalServersDetailResponse>
     */
    public SyncInvoker<ListBareMetalServersDetailRequest, ListBareMetalServersDetailResponse> listBareMetalServersDetailInvoker(
        ListBareMetalServersDetailRequest request) {
        return new SyncInvoker<>(request, BmsMeta.listBareMetalServersDetail, hcClient);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     *
     * 查询裸金属服务器的规格详情和规格的扩展信息。您可以调用此接口查询“baremetal:extBootType”参数取值，以确认某个规格是否支持快速发放
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaremetalFlavorDetailExtendsRequest 请求对象
     * @return ListBaremetalFlavorDetailExtendsResponse
     */
    public ListBaremetalFlavorDetailExtendsResponse listBaremetalFlavorDetailExtends(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.listBaremetalFlavorDetailExtends);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     *
     * 查询裸金属服务器的规格详情和规格的扩展信息。您可以调用此接口查询“baremetal:extBootType”参数取值，以确认某个规格是否支持快速发放
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaremetalFlavorDetailExtendsRequest 请求对象
     * @return SyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse>
     */
    public SyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsInvoker(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.listBaremetalFlavorDetailExtends, hcClient);
    }

    /**
     * 重装裸金属服务器操作系统
     *
     * 重装裸金属服务器的操作系统。快速发放裸金属服务器支持裸金属服务器数据盘不变的情况下，使用原镜像重装系统盘。重装操作系统支持密码或者密钥注入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallBaremetalServerOsRequest 请求对象
     * @return ReinstallBaremetalServerOsResponse
     */
    public ReinstallBaremetalServerOsResponse reinstallBaremetalServerOs(ReinstallBaremetalServerOsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.reinstallBaremetalServerOs);
    }

    /**
     * 重装裸金属服务器操作系统
     *
     * 重装裸金属服务器的操作系统。快速发放裸金属服务器支持裸金属服务器数据盘不变的情况下，使用原镜像重装系统盘。重装操作系统支持密码或者密钥注入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallBaremetalServerOsRequest 请求对象
     * @return SyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse>
     */
    public SyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsInvoker(
        ReinstallBaremetalServerOsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.reinstallBaremetalServerOs, hcClient);
    }

    /**
     * 一键重置裸金属服务器密码
     *
     * 在裸金属服务器支持一键重置密码功能的前提下，重置裸金属服务器管理帐号（root用户或Administrator用户）的密码。可以通过6.10.1-查询是否支持一键重置密码API查询是否支持一键重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdOneClickRequest 请求对象
     * @return ResetPwdOneClickResponse
     */
    public ResetPwdOneClickResponse resetPwdOneClick(ResetPwdOneClickRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.resetPwdOneClick);
    }

    /**
     * 一键重置裸金属服务器密码
     *
     * 在裸金属服务器支持一键重置密码功能的前提下，重置裸金属服务器管理帐号（root用户或Administrator用户）的密码。可以通过6.10.1-查询是否支持一键重置密码API查询是否支持一键重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdOneClickRequest 请求对象
     * @return SyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse>
     */
    public SyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse> resetPwdOneClickInvoker(
        ResetPwdOneClickRequest request) {
        return new SyncInvoker<>(request, BmsMeta.resetPwdOneClick, hcClient);
    }

    /**
     * 查询裸金属服务器网卡信息
     *
     * 查询裸金属服务器的网卡信息，比如网卡的IP地址、MAC地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return ShowBaremetalServerInterfaceAttachmentsResponse
     */
    public ShowBaremetalServerInterfaceAttachmentsResponse showBaremetalServerInterfaceAttachments(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showBaremetalServerInterfaceAttachments);
    }

    /**
     * 查询裸金属服务器网卡信息
     *
     * 查询裸金属服务器的网卡信息，比如网卡的IP地址、MAC地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return SyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse>
     */
    public SyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsInvoker(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.showBaremetalServerInterfaceAttachments, hcClient);
    }

    /**
     * 查询裸金属服务器标签
     *
     * - 查询指定云服务器的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerTagsRequest 请求对象
     * @return ShowBaremetalServerTagsResponse
     */
    public ShowBaremetalServerTagsResponse showBaremetalServerTags(ShowBaremetalServerTagsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showBaremetalServerTags);
    }

    /**
     * 查询裸金属服务器标签
     *
     * - 查询指定云服务器的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerTagsRequest 请求对象
     * @return SyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse>
     */
    public SyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> showBaremetalServerTagsInvoker(
        ShowBaremetalServerTagsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.showBaremetalServerTags, hcClient);
    }

    /**
     * 查询裸金属服务器挂载的云硬盘信息
     *
     * 查询裸金属服务器挂载的磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerVolumeInfoRequest 请求对象
     * @return ShowBaremetalServerVolumeInfoResponse
     */
    public ShowBaremetalServerVolumeInfoResponse showBaremetalServerVolumeInfo(
        ShowBaremetalServerVolumeInfoRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showBaremetalServerVolumeInfo);
    }

    /**
     * 查询裸金属服务器挂载的云硬盘信息
     *
     * 查询裸金属服务器挂载的磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerVolumeInfoRequest 请求对象
     * @return SyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse>
     */
    public SyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoInvoker(
        ShowBaremetalServerVolumeInfoRequest request) {
        return new SyncInvoker<>(request, BmsMeta.showBaremetalServerVolumeInfo, hcClient);
    }

    /**
     * 查询是否支持一键重置密码
     *
     * 查询是否支持一键重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResetPwdRequest 请求对象
     * @return ShowResetPwdResponse
     */
    public ShowResetPwdResponse showResetPwd(ShowResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showResetPwd);
    }

    /**
     * 查询是否支持一键重置密码
     *
     * 查询是否支持一键重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResetPwdRequest 请求对象
     * @return SyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse>
     */
    public SyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse> showResetPwdInvoker(ShowResetPwdRequest request) {
        return new SyncInvoker<>(request, BmsMeta.showResetPwd, hcClient);
    }

    /**
     * 获取裸金属服务器远程登录地址
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRemoteConsoleRequest 请求对象
     * @return ShowServerRemoteConsoleResponse
     */
    public ShowServerRemoteConsoleResponse showServerRemoteConsole(ShowServerRemoteConsoleRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showServerRemoteConsole);
    }

    /**
     * 获取裸金属服务器远程登录地址
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRemoteConsoleRequest 请求对象
     * @return SyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>
     */
    public SyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsoleInvoker(
        ShowServerRemoteConsoleRequest request) {
        return new SyncInvoker<>(request, BmsMeta.showServerRemoteConsole, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询该租户下，所有资源的配额信息，包括已使用配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTenantQuotaRequest 请求对象
     * @return ShowTenantQuotaResponse
     */
    public ShowTenantQuotaResponse showTenantQuota(ShowTenantQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showTenantQuota);
    }

    /**
     * 查询租户配额
     *
     * 查询该租户下，所有资源的配额信息，包括已使用配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTenantQuotaRequest 请求对象
     * @return SyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse>
     */
    public SyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse> showTenantQuotaInvoker(
        ShowTenantQuotaRequest request) {
        return new SyncInvoker<>(request, BmsMeta.showTenantQuota, hcClient);
    }

    /**
     * Windows裸金属服务器获取密码
     *
     * 获取Windows裸金属服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWindowsBaremetalServerPwdRequest 请求对象
     * @return ShowWindowsBaremetalServerPwdResponse
     */
    public ShowWindowsBaremetalServerPwdResponse showWindowsBaremetalServerPwd(
        ShowWindowsBaremetalServerPwdRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showWindowsBaremetalServerPwd);
    }

    /**
     * Windows裸金属服务器获取密码
     *
     * 获取Windows裸金属服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWindowsBaremetalServerPwdRequest 请求对象
     * @return SyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse>
     */
    public SyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdInvoker(
        ShowWindowsBaremetalServerPwdRequest request) {
        return new SyncInvoker<>(request, BmsMeta.showWindowsBaremetalServerPwd, hcClient);
    }

    /**
     * 修改裸金属服务器弹性网卡的属性
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return UpdateBaremetalServerInterfaceAttachmentsResponse
     */
    public UpdateBaremetalServerInterfaceAttachmentsResponse updateBaremetalServerInterfaceAttachments(
        UpdateBaremetalServerInterfaceAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.updateBaremetalServerInterfaceAttachments);
    }

    /**
     * 修改裸金属服务器弹性网卡的属性
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return SyncInvoker<UpdateBaremetalServerInterfaceAttachmentsRequest, UpdateBaremetalServerInterfaceAttachmentsResponse>
     */
    public SyncInvoker<UpdateBaremetalServerInterfaceAttachmentsRequest, UpdateBaremetalServerInterfaceAttachmentsResponse> updateBaremetalServerInterfaceAttachmentsInvoker(
        UpdateBaremetalServerInterfaceAttachmentsRequest request) {
        return new SyncInvoker<>(request, BmsMeta.updateBaremetalServerInterfaceAttachments, hcClient);
    }

    /**
     * 更新裸金属服务器元数据
     *
     * 更新裸金属服务器元数据。如果元数据中没有待更新字段，则自动添加该字段。如果元数据中已存在待更新字段，则直接更新字段值；如果元数据中的字段不再请求参数中，则保持不变
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerMetadataRequest 请求对象
     * @return UpdateBaremetalServerMetadataResponse
     */
    public UpdateBaremetalServerMetadataResponse updateBaremetalServerMetadata(
        UpdateBaremetalServerMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.updateBaremetalServerMetadata);
    }

    /**
     * 更新裸金属服务器元数据
     *
     * 更新裸金属服务器元数据。如果元数据中没有待更新字段，则自动添加该字段。如果元数据中已存在待更新字段，则直接更新字段值；如果元数据中的字段不再请求参数中，则保持不变
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerMetadataRequest 请求对象
     * @return SyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse>
     */
    public SyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataInvoker(
        UpdateBaremetalServerMetadataRequest request) {
        return new SyncInvoker<>(request, BmsMeta.updateBaremetalServerMetadata, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询裸金属服务指定接口版本的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecifiedVersionRequest 请求对象
     * @return ShowSpecifiedVersionResponse
     */
    public ShowSpecifiedVersionResponse showSpecifiedVersion(ShowSpecifiedVersionRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showSpecifiedVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询裸金属服务指定接口版本的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecifiedVersionRequest 请求对象
     * @return SyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse>
     */
    public SyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> showSpecifiedVersionInvoker(
        ShowSpecifiedVersionRequest request) {
        return new SyncInvoker<>(request, BmsMeta.showSpecifiedVersion, hcClient);
    }

    /**
     * 查询Job状态
     *
     * 查询Job的执行状态。对于创建裸金属服务器物理机、挂卸卷等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfosRequest 请求对象
     * @return ShowJobInfosResponse
     */
    public ShowJobInfosResponse showJobInfos(ShowJobInfosRequest request) {
        return hcClient.syncInvokeHttp(request, BmsMeta.showJobInfos);
    }

    /**
     * 查询Job状态
     *
     * 查询Job的执行状态。对于创建裸金属服务器物理机、挂卸卷等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfosRequest 请求对象
     * @return SyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse>
     */
    public SyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse> showJobInfosInvoker(ShowJobInfosRequest request) {
        return new SyncInvoker<>(request, BmsMeta.showJobInfos, hcClient);
    }

}
