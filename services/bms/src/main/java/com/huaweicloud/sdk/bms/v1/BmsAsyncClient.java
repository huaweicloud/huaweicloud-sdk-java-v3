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
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerMetadataOptionsRequest;
import com.huaweicloud.sdk.bms.v1.model.ShowBaremetalServerMetadataOptionsResponse;
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
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataOptionsRequest;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataOptionsResponse;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataRequest;
import com.huaweicloud.sdk.bms.v1.model.UpdateBaremetalServerMetadataResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class BmsAsyncClient {

    protected HcClient hcClient;

    public BmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BmsAsyncClient> newBuilder() {
        ClientBuilder<BmsAsyncClient> clientBuilder = new ClientBuilder<>(BmsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 裸金属服务器绑定弹性网卡
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServerNicsRequest 请求对象
     * @return CompletableFuture<AddServerNicsResponse>
     */
    public CompletableFuture<AddServerNicsResponse> addServerNicsAsync(AddServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.addServerNics);
    }

    /**
     * 裸金属服务器绑定弹性网卡
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddServerNicsRequest 请求对象
     * @return AsyncInvoker<AddServerNicsRequest, AddServerNicsResponse>
     */
    public AsyncInvoker<AddServerNicsRequest, AddServerNicsResponse> addServerNicsAsyncInvoker(
        AddServerNicsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.addServerNics, hcClient);
    }

    /**
     * 裸金属服务器挂载云硬盘
     *
     * 裸金属服务器创建成功后，如果发现磁盘不够用或者当前磁盘不满足要求，可以将已有云硬盘挂载给裸金属服务器，作为数据盘使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachBaremetalServerVolumeRequest 请求对象
     * @return CompletableFuture<AttachBaremetalServerVolumeResponse>
     */
    public CompletableFuture<AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeAsync(
        AttachBaremetalServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.attachBaremetalServerVolume);
    }

    /**
     * 裸金属服务器挂载云硬盘
     *
     * 裸金属服务器创建成功后，如果发现磁盘不够用或者当前磁盘不满足要求，可以将已有云硬盘挂载给裸金属服务器，作为数据盘使用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachBaremetalServerVolumeRequest 请求对象
     * @return AsyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse>
     */
    public AsyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeAsyncInvoker(
        AttachBaremetalServerVolumeRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.attachBaremetalServerVolume, hcClient);
    }

    /**
     * 批量添加裸金属服务器标签
     *
     * - 为指定裸金属服务器批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateBaremetalServerTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateBaremetalServerTagsResponse>
     */
    public CompletableFuture<BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsAsync(
        BatchCreateBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchCreateBaremetalServerTags);
    }

    /**
     * 批量添加裸金属服务器标签
     *
     * - 为指定裸金属服务器批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateBaremetalServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse>
     */
    public AsyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsAsyncInvoker(
        BatchCreateBaremetalServerTagsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.batchCreateBaremetalServerTags, hcClient);
    }

    /**
     * 批量删除裸金属服务器标签
     *
     * - 为指定云服务器批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBaremetalServerTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteBaremetalServerTagsResponse>
     */
    public CompletableFuture<BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsAsync(
        BatchDeleteBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchDeleteBaremetalServerTags);
    }

    /**
     * 批量删除裸金属服务器标签
     *
     * - 为指定云服务器批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBaremetalServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse>
     */
    public AsyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsAsyncInvoker(
        BatchDeleteBaremetalServerTagsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.batchDeleteBaremetalServerTags, hcClient);
    }

    /**
     * 重启裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量重启裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootBaremetalServersRequest 请求对象
     * @return CompletableFuture<BatchRebootBaremetalServersResponse>
     */
    public CompletableFuture<BatchRebootBaremetalServersResponse> batchRebootBaremetalServersAsync(
        BatchRebootBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchRebootBaremetalServers);
    }

    /**
     * 重启裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量重启裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRebootBaremetalServersRequest 请求对象
     * @return AsyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse>
     */
    public AsyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> batchRebootBaremetalServersAsyncInvoker(
        BatchRebootBaremetalServersRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.batchRebootBaremetalServers, hcClient);
    }

    /**
     * 启动裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量启动裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartBaremetalServersRequest 请求对象
     * @return CompletableFuture<BatchStartBaremetalServersResponse>
     */
    public CompletableFuture<BatchStartBaremetalServersResponse> batchStartBaremetalServersAsync(
        BatchStartBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchStartBaremetalServers);
    }

    /**
     * 启动裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量启动裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStartBaremetalServersRequest 请求对象
     * @return AsyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse>
     */
    public AsyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> batchStartBaremetalServersAsyncInvoker(
        BatchStartBaremetalServersRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.batchStartBaremetalServers, hcClient);
    }

    /**
     * 关闭裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量关闭裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopBaremetalServersRequest 请求对象
     * @return CompletableFuture<BatchStopBaremetalServersResponse>
     */
    public CompletableFuture<BatchStopBaremetalServersResponse> batchStopBaremetalServersAsync(
        BatchStopBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchStopBaremetalServers);
    }

    /**
     * 关闭裸金属服务器
     *
     * 根据给定的裸金属服务器ID列表，批量关闭裸金属服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopBaremetalServersRequest 请求对象
     * @return AsyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse>
     */
    public AsyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> batchStopBaremetalServersAsyncInvoker(
        BatchStopBaremetalServersRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.batchStopBaremetalServers, hcClient);
    }

    /**
     * 修改裸金属服务器名称
     *
     * 修改裸金属服务器名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaremetalServerNameRequest 请求对象
     * @return CompletableFuture<ChangeBaremetalServerNameResponse>
     */
    public CompletableFuture<ChangeBaremetalServerNameResponse> changeBaremetalServerNameAsync(
        ChangeBaremetalServerNameRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.changeBaremetalServerName);
    }

    /**
     * 修改裸金属服务器名称
     *
     * 修改裸金属服务器名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaremetalServerNameRequest 请求对象
     * @return AsyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse>
     */
    public AsyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> changeBaremetalServerNameAsyncInvoker(
        ChangeBaremetalServerNameRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.changeBaremetalServerName, hcClient);
    }

    /**
     * 切换裸金属服务器的操作系统
     *
     * 切换裸金属服务器的操作系统。切换操作系统支持密码或者密钥注入，该接口支持企业项目细粒度权限的校验，具体细粒度请参见 bms:servers:changeOS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaremetalServerOsRequest 请求对象
     * @return CompletableFuture<ChangeBaremetalServerOsResponse>
     */
    public CompletableFuture<ChangeBaremetalServerOsResponse> changeBaremetalServerOsAsync(
        ChangeBaremetalServerOsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.changeBaremetalServerOs);
    }

    /**
     * 切换裸金属服务器的操作系统
     *
     * 切换裸金属服务器的操作系统。切换操作系统支持密码或者密钥注入，该接口支持企业项目细粒度权限的校验，具体细粒度请参见 bms:servers:changeOS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeBaremetalServerOsRequest 请求对象
     * @return AsyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse>
     */
    public AsyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> changeBaremetalServerOsAsyncInvoker(
        ChangeBaremetalServerOsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.changeBaremetalServerOs, hcClient);
    }

    /**
     * 创建裸金属服务器
     *
     * 创建一台或多台裸金属服务器,裸金属服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBareMetalServersRequest 请求对象
     * @return CompletableFuture<CreateBareMetalServersResponse>
     */
    public CompletableFuture<CreateBareMetalServersResponse> createBareMetalServersAsync(
        CreateBareMetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.createBareMetalServers);
    }

    /**
     * 创建裸金属服务器
     *
     * 创建一台或多台裸金属服务器,裸金属服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBareMetalServersRequest 请求对象
     * @return AsyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse>
     */
    public AsyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse> createBareMetalServersAsyncInvoker(
        CreateBareMetalServersRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.createBareMetalServers, hcClient);
    }

    /**
     * 删除裸金属服务器裸金属服务器物理机
     *
     * 删除裸金属服务器裸金属服务器物理机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBaremetalServerRequest 请求对象
     * @return CompletableFuture<DeleteBaremetalServerResponse>
     */
    public CompletableFuture<DeleteBaremetalServerResponse> deleteBaremetalServerAsync(
        DeleteBaremetalServerRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.deleteBaremetalServer);
    }

    /**
     * 删除裸金属服务器裸金属服务器物理机
     *
     * 删除裸金属服务器裸金属服务器物理机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBaremetalServerRequest 请求对象
     * @return AsyncInvoker<DeleteBaremetalServerRequest, DeleteBaremetalServerResponse>
     */
    public AsyncInvoker<DeleteBaremetalServerRequest, DeleteBaremetalServerResponse> deleteBaremetalServerAsyncInvoker(
        DeleteBaremetalServerRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.deleteBaremetalServer, hcClient);
    }

    /**
     * 裸金属服务器解绑弹性网卡
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerNicsRequest 请求对象
     * @return CompletableFuture<DeleteServerNicsResponse>
     */
    public CompletableFuture<DeleteServerNicsResponse> deleteServerNicsAsync(DeleteServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.deleteServerNics);
    }

    /**
     * 裸金属服务器解绑弹性网卡
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServerNicsRequest 请求对象
     * @return AsyncInvoker<DeleteServerNicsRequest, DeleteServerNicsResponse>
     */
    public AsyncInvoker<DeleteServerNicsRequest, DeleteServerNicsResponse> deleteServerNicsAsyncInvoker(
        DeleteServerNicsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.deleteServerNics, hcClient);
    }

    /**
     * Windows裸金属服务器清除密码
     *
     * 清除Windows裸金属服务器初始安装时系统生成的密码记录。清除密码后，不影响裸金属服务器密码登录功能，但不能再使用获取密码功能来查询该裸金属服务器密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWindowsBareMetalServerPasswordRequest 请求对象
     * @return CompletableFuture<DeleteWindowsBareMetalServerPasswordResponse>
     */
    public CompletableFuture<DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordAsync(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.deleteWindowsBareMetalServerPassword);
    }

    /**
     * Windows裸金属服务器清除密码
     *
     * 清除Windows裸金属服务器初始安装时系统生成的密码记录。清除密码后，不影响裸金属服务器密码登录功能，但不能再使用获取密码功能来查询该裸金属服务器密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWindowsBareMetalServerPasswordRequest 请求对象
     * @return AsyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse>
     */
    public AsyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordAsyncInvoker(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.deleteWindowsBareMetalServerPassword, hcClient);
    }

    /**
     * 裸金属服务器卸载云磁盘
     *
     * 将挂载至裸金属服务器中的磁盘卸载；对于挂载在系统盘盘位（也就是“/dev/sda”挂载点）上的磁盘，不允许执行卸载操作；对于挂载在数据盘盘位（非“/dev/sda”挂载点）上的磁盘，支持离线卸载和在线卸载（裸金属服务器处于“运行中”状态）磁盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachBaremetalServerVolumeRequest 请求对象
     * @return CompletableFuture<DetachBaremetalServerVolumeResponse>
     */
    public CompletableFuture<DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeAsync(
        DetachBaremetalServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.detachBaremetalServerVolume);
    }

    /**
     * 裸金属服务器卸载云磁盘
     *
     * 将挂载至裸金属服务器中的磁盘卸载；对于挂载在系统盘盘位（也就是“/dev/sda”挂载点）上的磁盘，不允许执行卸载操作；对于挂载在数据盘盘位（非“/dev/sda”挂载点）上的磁盘，支持离线卸载和在线卸载（裸金属服务器处于“运行中”状态）磁盘
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DetachBaremetalServerVolumeRequest 请求对象
     * @return AsyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse>
     */
    public AsyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeAsyncInvoker(
        DetachBaremetalServerVolumeRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.detachBaremetalServerVolume, hcClient);
    }

    /**
     * 查询裸金属服务器详情
     *
     * 获取裸金属服务器详细信息，该接口支持查询裸金属服务器的计费方式，以及是否被冻结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServerDetailsRequest 请求对象
     * @return CompletableFuture<ListBareMetalServerDetailsResponse>
     */
    public CompletableFuture<ListBareMetalServerDetailsResponse> listBareMetalServerDetailsAsync(
        ListBareMetalServerDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBareMetalServerDetails);
    }

    /**
     * 查询裸金属服务器详情
     *
     * 获取裸金属服务器详细信息，该接口支持查询裸金属服务器的计费方式，以及是否被冻结
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServerDetailsRequest 请求对象
     * @return AsyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse>
     */
    public AsyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> listBareMetalServerDetailsAsyncInvoker(
        ListBareMetalServerDetailsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.listBareMetalServerDetails, hcClient);
    }

    /**
     * 查询裸金属服务器详情列表
     *
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。该接口支持查询裸金属服务器计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServersRequest 请求对象
     * @return CompletableFuture<ListBareMetalServersResponse>
     */
    public CompletableFuture<ListBareMetalServersResponse> listBareMetalServersAsync(
        ListBareMetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBareMetalServers);
    }

    /**
     * 查询裸金属服务器详情列表
     *
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。该接口支持查询裸金属服务器计费方式，以及是否被冻结。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServersRequest 请求对象
     * @return AsyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse>
     */
    public AsyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse> listBareMetalServersAsyncInvoker(
        ListBareMetalServersRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.listBareMetalServers, hcClient);
    }

    /**
     * 查询裸金属服务器列表
     *
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServersDetailRequest 请求对象
     * @return CompletableFuture<ListBareMetalServersDetailResponse>
     */
    public CompletableFuture<ListBareMetalServersDetailResponse> listBareMetalServersDetailAsync(
        ListBareMetalServersDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBareMetalServersDetail);
    }

    /**
     * 查询裸金属服务器列表
     *
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBareMetalServersDetailRequest 请求对象
     * @return AsyncInvoker<ListBareMetalServersDetailRequest, ListBareMetalServersDetailResponse>
     */
    public AsyncInvoker<ListBareMetalServersDetailRequest, ListBareMetalServersDetailResponse> listBareMetalServersDetailAsyncInvoker(
        ListBareMetalServersDetailRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.listBareMetalServersDetail, hcClient);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     *
     * 查询裸金属服务器的规格详情和规格的扩展信息。您可以调用此接口查询“baremetal:extBootType”参数取值，以确认某个规格是否支持快速发放
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaremetalFlavorDetailExtendsRequest 请求对象
     * @return CompletableFuture<ListBaremetalFlavorDetailExtendsResponse>
     */
    public CompletableFuture<ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsAsync(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBaremetalFlavorDetailExtends);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     *
     * 查询裸金属服务器的规格详情和规格的扩展信息。您可以调用此接口查询“baremetal:extBootType”参数取值，以确认某个规格是否支持快速发放
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBaremetalFlavorDetailExtendsRequest 请求对象
     * @return AsyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse>
     */
    public AsyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsAsyncInvoker(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.listBaremetalFlavorDetailExtends, hcClient);
    }

    /**
     * 重装裸金属服务器操作系统
     *
     * 重装裸金属服务器的操作系统。快速发放裸金属服务器支持裸金属服务器数据盘不变的情况下，使用原镜像重装系统盘。重装操作系统支持密码或者密钥注入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallBaremetalServerOsRequest 请求对象
     * @return CompletableFuture<ReinstallBaremetalServerOsResponse>
     */
    public CompletableFuture<ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsAsync(
        ReinstallBaremetalServerOsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.reinstallBaremetalServerOs);
    }

    /**
     * 重装裸金属服务器操作系统
     *
     * 重装裸金属服务器的操作系统。快速发放裸金属服务器支持裸金属服务器数据盘不变的情况下，使用原镜像重装系统盘。重装操作系统支持密码或者密钥注入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReinstallBaremetalServerOsRequest 请求对象
     * @return AsyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse>
     */
    public AsyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsAsyncInvoker(
        ReinstallBaremetalServerOsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.reinstallBaremetalServerOs, hcClient);
    }

    /**
     * 一键重置裸金属服务器密码
     *
     * 在裸金属服务器支持一键重置密码功能的前提下，重置裸金属服务器管理帐号（root用户或Administrator用户）的密码。可以通过6.10.1-查询是否支持一键重置密码API查询是否支持一键重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdOneClickRequest 请求对象
     * @return CompletableFuture<ResetPwdOneClickResponse>
     */
    public CompletableFuture<ResetPwdOneClickResponse> resetPwdOneClickAsync(ResetPwdOneClickRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.resetPwdOneClick);
    }

    /**
     * 一键重置裸金属服务器密码
     *
     * 在裸金属服务器支持一键重置密码功能的前提下，重置裸金属服务器管理帐号（root用户或Administrator用户）的密码。可以通过6.10.1-查询是否支持一键重置密码API查询是否支持一键重置密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdOneClickRequest 请求对象
     * @return AsyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse>
     */
    public AsyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse> resetPwdOneClickAsyncInvoker(
        ResetPwdOneClickRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.resetPwdOneClick, hcClient);
    }

    /**
     * 查询裸金属服务器网卡信息
     *
     * 查询裸金属服务器的网卡信息，比如网卡的IP地址、MAC地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return CompletableFuture<ShowBaremetalServerInterfaceAttachmentsResponse>
     */
    public CompletableFuture<ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsAsync(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerInterfaceAttachments);
    }

    /**
     * 查询裸金属服务器网卡信息
     *
     * 查询裸金属服务器的网卡信息，比如网卡的IP地址、MAC地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return AsyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse>
     */
    public AsyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsAsyncInvoker(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showBaremetalServerInterfaceAttachments, hcClient);
    }

    /**
     * 查询裸金属服务器元数据配置
     *
     * 查询云服务器元数据配置，通过本接口，您可以查询指裸金属服务器的元数据配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerMetadataOptionsRequest 请求对象
     * @return CompletableFuture<ShowBaremetalServerMetadataOptionsResponse>
     */
    public CompletableFuture<ShowBaremetalServerMetadataOptionsResponse> showBaremetalServerMetadataOptionsAsync(
        ShowBaremetalServerMetadataOptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerMetadataOptions);
    }

    /**
     * 查询裸金属服务器元数据配置
     *
     * 查询云服务器元数据配置，通过本接口，您可以查询指裸金属服务器的元数据配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerMetadataOptionsRequest 请求对象
     * @return AsyncInvoker<ShowBaremetalServerMetadataOptionsRequest, ShowBaremetalServerMetadataOptionsResponse>
     */
    public AsyncInvoker<ShowBaremetalServerMetadataOptionsRequest, ShowBaremetalServerMetadataOptionsResponse> showBaremetalServerMetadataOptionsAsyncInvoker(
        ShowBaremetalServerMetadataOptionsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showBaremetalServerMetadataOptions, hcClient);
    }

    /**
     * 查询裸金属服务器标签
     *
     * - 查询指定云服务器的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerTagsRequest 请求对象
     * @return CompletableFuture<ShowBaremetalServerTagsResponse>
     */
    public CompletableFuture<ShowBaremetalServerTagsResponse> showBaremetalServerTagsAsync(
        ShowBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerTags);
    }

    /**
     * 查询裸金属服务器标签
     *
     * - 查询指定云服务器的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerTagsRequest 请求对象
     * @return AsyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse>
     */
    public AsyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> showBaremetalServerTagsAsyncInvoker(
        ShowBaremetalServerTagsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showBaremetalServerTags, hcClient);
    }

    /**
     * 查询裸金属服务器挂载的云硬盘信息
     *
     * 查询裸金属服务器挂载的磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerVolumeInfoRequest 请求对象
     * @return CompletableFuture<ShowBaremetalServerVolumeInfoResponse>
     */
    public CompletableFuture<ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoAsync(
        ShowBaremetalServerVolumeInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerVolumeInfo);
    }

    /**
     * 查询裸金属服务器挂载的云硬盘信息
     *
     * 查询裸金属服务器挂载的磁盘信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBaremetalServerVolumeInfoRequest 请求对象
     * @return AsyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse>
     */
    public AsyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoAsyncInvoker(
        ShowBaremetalServerVolumeInfoRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showBaremetalServerVolumeInfo, hcClient);
    }

    /**
     * 查询是否支持一键重置密码
     *
     * 查询是否支持一键重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResetPwdRequest 请求对象
     * @return CompletableFuture<ShowResetPwdResponse>
     */
    public CompletableFuture<ShowResetPwdResponse> showResetPwdAsync(ShowResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showResetPwd);
    }

    /**
     * 查询是否支持一键重置密码
     *
     * 查询是否支持一键重置密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResetPwdRequest 请求对象
     * @return AsyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse>
     */
    public AsyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse> showResetPwdAsyncInvoker(
        ShowResetPwdRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showResetPwd, hcClient);
    }

    /**
     * 获取裸金属服务器远程登录地址
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRemoteConsoleRequest 请求对象
     * @return CompletableFuture<ShowServerRemoteConsoleResponse>
     */
    public CompletableFuture<ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsync(
        ShowServerRemoteConsoleRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showServerRemoteConsole);
    }

    /**
     * 获取裸金属服务器远程登录地址
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRemoteConsoleRequest 请求对象
     * @return AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>
     */
    public AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsyncInvoker(
        ShowServerRemoteConsoleRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showServerRemoteConsole, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询该租户下，所有资源的配额信息，包括已使用配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTenantQuotaRequest 请求对象
     * @return CompletableFuture<ShowTenantQuotaResponse>
     */
    public CompletableFuture<ShowTenantQuotaResponse> showTenantQuotaAsync(ShowTenantQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showTenantQuota);
    }

    /**
     * 查询租户配额
     *
     * 查询该租户下，所有资源的配额信息，包括已使用配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTenantQuotaRequest 请求对象
     * @return AsyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse>
     */
    public AsyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse> showTenantQuotaAsyncInvoker(
        ShowTenantQuotaRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showTenantQuota, hcClient);
    }

    /**
     * Windows裸金属服务器获取密码
     *
     * 获取Windows裸金属服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWindowsBaremetalServerPwdRequest 请求对象
     * @return CompletableFuture<ShowWindowsBaremetalServerPwdResponse>
     */
    public CompletableFuture<ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdAsync(
        ShowWindowsBaremetalServerPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showWindowsBaremetalServerPwd);
    }

    /**
     * Windows裸金属服务器获取密码
     *
     * 获取Windows裸金属服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWindowsBaremetalServerPwdRequest 请求对象
     * @return AsyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse>
     */
    public AsyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdAsyncInvoker(
        ShowWindowsBaremetalServerPwdRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showWindowsBaremetalServerPwd, hcClient);
    }

    /**
     * 修改裸金属服务器弹性网卡的属性
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return CompletableFuture<UpdateBaremetalServerInterfaceAttachmentsResponse>
     */
    public CompletableFuture<UpdateBaremetalServerInterfaceAttachmentsResponse> updateBaremetalServerInterfaceAttachmentsAsync(
        UpdateBaremetalServerInterfaceAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.updateBaremetalServerInterfaceAttachments);
    }

    /**
     * 修改裸金属服务器弹性网卡的属性
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return AsyncInvoker<UpdateBaremetalServerInterfaceAttachmentsRequest, UpdateBaremetalServerInterfaceAttachmentsResponse>
     */
    public AsyncInvoker<UpdateBaremetalServerInterfaceAttachmentsRequest, UpdateBaremetalServerInterfaceAttachmentsResponse> updateBaremetalServerInterfaceAttachmentsAsyncInvoker(
        UpdateBaremetalServerInterfaceAttachmentsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.updateBaremetalServerInterfaceAttachments, hcClient);
    }

    /**
     * 更新裸金属服务器元数据
     *
     * 更新裸金属服务器元数据。如果元数据中没有待更新字段，则自动添加该字段。如果元数据中已存在待更新字段，则直接更新字段值；如果元数据中的字段不再请求参数中，则保持不变
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerMetadataRequest 请求对象
     * @return CompletableFuture<UpdateBaremetalServerMetadataResponse>
     */
    public CompletableFuture<UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataAsync(
        UpdateBaremetalServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.updateBaremetalServerMetadata);
    }

    /**
     * 更新裸金属服务器元数据
     *
     * 更新裸金属服务器元数据。如果元数据中没有待更新字段，则自动添加该字段。如果元数据中已存在待更新字段，则直接更新字段值；如果元数据中的字段不再请求参数中，则保持不变
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerMetadataRequest 请求对象
     * @return AsyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse>
     */
    public AsyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataAsyncInvoker(
        UpdateBaremetalServerMetadataRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.updateBaremetalServerMetadata, hcClient);
    }

    /**
     * 更新裸金属服务器元数据配置
     *
     * 更新裸金属服务器元数据配置，通过本接口，您可以选择启用或关闭IMDS服务，也可以选择IMDS服务的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerMetadataOptionsRequest 请求对象
     * @return CompletableFuture<UpdateBaremetalServerMetadataOptionsResponse>
     */
    public CompletableFuture<UpdateBaremetalServerMetadataOptionsResponse> updateBaremetalServerMetadataOptionsAsync(
        UpdateBaremetalServerMetadataOptionsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.updateBaremetalServerMetadataOptions);
    }

    /**
     * 更新裸金属服务器元数据配置
     *
     * 更新裸金属服务器元数据配置，通过本接口，您可以选择启用或关闭IMDS服务，也可以选择IMDS服务的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBaremetalServerMetadataOptionsRequest 请求对象
     * @return AsyncInvoker<UpdateBaremetalServerMetadataOptionsRequest, UpdateBaremetalServerMetadataOptionsResponse>
     */
    public AsyncInvoker<UpdateBaremetalServerMetadataOptionsRequest, UpdateBaremetalServerMetadataOptionsResponse> updateBaremetalServerMetadataOptionsAsyncInvoker(
        UpdateBaremetalServerMetadataOptionsRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.updateBaremetalServerMetadataOptions, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询裸金属服务指定接口版本的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecifiedVersionRequest 请求对象
     * @return CompletableFuture<ShowSpecifiedVersionResponse>
     */
    public CompletableFuture<ShowSpecifiedVersionResponse> showSpecifiedVersionAsync(
        ShowSpecifiedVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showSpecifiedVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询裸金属服务指定接口版本的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecifiedVersionRequest 请求对象
     * @return AsyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse>
     */
    public AsyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> showSpecifiedVersionAsyncInvoker(
        ShowSpecifiedVersionRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showSpecifiedVersion, hcClient);
    }

    /**
     * 查询Job状态
     *
     * 查询Job的执行状态。对于创建裸金属服务器物理机、挂卸卷等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfosRequest 请求对象
     * @return CompletableFuture<ShowJobInfosResponse>
     */
    public CompletableFuture<ShowJobInfosResponse> showJobInfosAsync(ShowJobInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showJobInfos);
    }

    /**
     * 查询Job状态
     *
     * 查询Job的执行状态。对于创建裸金属服务器物理机、挂卸卷等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfosRequest 请求对象
     * @return AsyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse>
     */
    public AsyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse> showJobInfosAsyncInvoker(
        ShowJobInfosRequest request) {
        return new AsyncInvoker<>(request, BmsMeta.showJobInfos, hcClient);
    }

}
