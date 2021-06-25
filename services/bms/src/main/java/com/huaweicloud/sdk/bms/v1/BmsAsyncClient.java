package com.huaweicloud.sdk.bms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.bms.v1.model.*;

public class BmsAsyncClient {
    protected HcClient hcClient;

    public BmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(BmsAsyncClient::new);
    }


    /**
     * 裸金属服务器挂载云硬盘
     * 裸金属服务器创建成功后，如果发现磁盘不够用或者当前磁盘不满足要求，可以将已有云硬盘挂载给裸金属服务器，作为数据盘使用
     *
     * @param AttachBaremetalServerVolumeRequest 请求对象
     * @return CompletableFuture<AttachBaremetalServerVolumeResponse>
     */
    public CompletableFuture<AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeAsync(AttachBaremetalServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.attachBaremetalServerVolume);
    }

    /**
     * 裸金属服务器挂载云硬盘
     * 裸金属服务器创建成功后，如果发现磁盘不够用或者当前磁盘不满足要求，可以将已有云硬盘挂载给裸金属服务器，作为数据盘使用
     *
     * @param AttachBaremetalServerVolumeRequest 请求对象
     * @return AsyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse>
     */
    public AsyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeAsyncInvoker(AttachBaremetalServerVolumeRequest request) {
        return new AsyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse>(request, BmsMeta.attachBaremetalServerVolume, hcClient);
    }

    /**
     * 批量添加裸金属服务器标签
     * - 为指定裸金属服务器批量添加标签。
     *
     * @param BatchCreateBaremetalServerTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateBaremetalServerTagsResponse>
     */
    public CompletableFuture<BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsAsync(BatchCreateBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchCreateBaremetalServerTags);
    }

    /**
     * 批量添加裸金属服务器标签
     * - 为指定裸金属服务器批量添加标签。
     *
     * @param BatchCreateBaremetalServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse>
     */
    public AsyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsAsyncInvoker(BatchCreateBaremetalServerTagsRequest request) {
        return new AsyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse>(request, BmsMeta.batchCreateBaremetalServerTags, hcClient);
    }

    /**
     * 批量删除l裸金属服务器标签
     * - 为指定云服务器批量删除标签。
     *
     * @param BatchDeleteBaremetalServerTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteBaremetalServerTagsResponse>
     */
    public CompletableFuture<BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsAsync(BatchDeleteBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchDeleteBaremetalServerTags);
    }

    /**
     * 批量删除l裸金属服务器标签
     * - 为指定云服务器批量删除标签。
     *
     * @param BatchDeleteBaremetalServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse>
     */
    public AsyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsAsyncInvoker(BatchDeleteBaremetalServerTagsRequest request) {
        return new AsyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse>(request, BmsMeta.batchDeleteBaremetalServerTags, hcClient);
    }

    /**
     * 重启裸金属服务器
     * 根据给定的裸金属服务器ID列表，批量重启裸金属服务器
     *
     * @param BatchRebootBaremetalServersRequest 请求对象
     * @return CompletableFuture<BatchRebootBaremetalServersResponse>
     */
    public CompletableFuture<BatchRebootBaremetalServersResponse> batchRebootBaremetalServersAsync(BatchRebootBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchRebootBaremetalServers);
    }

    /**
     * 重启裸金属服务器
     * 根据给定的裸金属服务器ID列表，批量重启裸金属服务器
     *
     * @param BatchRebootBaremetalServersRequest 请求对象
     * @return AsyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse>
     */
    public AsyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> batchRebootBaremetalServersAsyncInvoker(BatchRebootBaremetalServersRequest request) {
        return new AsyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse>(request, BmsMeta.batchRebootBaremetalServers, hcClient);
    }

    /**
     * 启动裸金属服务器
     * 根据给定的裸金属服务器ID列表，批量启动裸金属服务器
     *
     * @param BatchStartBaremetalServersRequest 请求对象
     * @return CompletableFuture<BatchStartBaremetalServersResponse>
     */
    public CompletableFuture<BatchStartBaremetalServersResponse> batchStartBaremetalServersAsync(BatchStartBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchStartBaremetalServers);
    }

    /**
     * 启动裸金属服务器
     * 根据给定的裸金属服务器ID列表，批量启动裸金属服务器
     *
     * @param BatchStartBaremetalServersRequest 请求对象
     * @return AsyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse>
     */
    public AsyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> batchStartBaremetalServersAsyncInvoker(BatchStartBaremetalServersRequest request) {
        return new AsyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse>(request, BmsMeta.batchStartBaremetalServers, hcClient);
    }

    /**
     * 关闭裸金属服务器
     * 根据给定的裸金属服务器ID列表，批量关闭裸金属服务器
     *
     * @param BatchStopBaremetalServersRequest 请求对象
     * @return CompletableFuture<BatchStopBaremetalServersResponse>
     */
    public CompletableFuture<BatchStopBaremetalServersResponse> batchStopBaremetalServersAsync(BatchStopBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchStopBaremetalServers);
    }

    /**
     * 关闭裸金属服务器
     * 根据给定的裸金属服务器ID列表，批量关闭裸金属服务器
     *
     * @param BatchStopBaremetalServersRequest 请求对象
     * @return AsyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse>
     */
    public AsyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> batchStopBaremetalServersAsyncInvoker(BatchStopBaremetalServersRequest request) {
        return new AsyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse>(request, BmsMeta.batchStopBaremetalServers, hcClient);
    }

    /**
     * 修改裸金属服务器名称
     * 修改裸金属服务器名称
     *
     * @param ChangeBaremetalServerNameRequest 请求对象
     * @return CompletableFuture<ChangeBaremetalServerNameResponse>
     */
    public CompletableFuture<ChangeBaremetalServerNameResponse> changeBaremetalServerNameAsync(ChangeBaremetalServerNameRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.changeBaremetalServerName);
    }

    /**
     * 修改裸金属服务器名称
     * 修改裸金属服务器名称
     *
     * @param ChangeBaremetalServerNameRequest 请求对象
     * @return AsyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse>
     */
    public AsyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> changeBaremetalServerNameAsyncInvoker(ChangeBaremetalServerNameRequest request) {
        return new AsyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse>(request, BmsMeta.changeBaremetalServerName, hcClient);
    }

    /**
     * 
     * 切换裸金属服务器的操作系统。切换操作系统支持密码或者密钥注入，该接口支持企业项目细粒度权限的校验，具体细粒度请参见 bms:servers:changeOS
     *
     * @param ChangeBaremetalServerOsRequest 请求对象
     * @return CompletableFuture<ChangeBaremetalServerOsResponse>
     */
    public CompletableFuture<ChangeBaremetalServerOsResponse> changeBaremetalServerOsAsync(ChangeBaremetalServerOsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.changeBaremetalServerOs);
    }

    /**
     * 
     * 切换裸金属服务器的操作系统。切换操作系统支持密码或者密钥注入，该接口支持企业项目细粒度权限的校验，具体细粒度请参见 bms:servers:changeOS
     *
     * @param ChangeBaremetalServerOsRequest 请求对象
     * @return AsyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse>
     */
    public AsyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> changeBaremetalServerOsAsyncInvoker(ChangeBaremetalServerOsRequest request) {
        return new AsyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse>(request, BmsMeta.changeBaremetalServerOs, hcClient);
    }

    /**
     * 创建裸金属服务器
     * 创建一台或多台裸金属服务器,裸金属服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式
     *
     * @param CreateBareMetalServersRequest 请求对象
     * @return CompletableFuture<CreateBareMetalServersResponse>
     */
    public CompletableFuture<CreateBareMetalServersResponse> createBareMetalServersAsync(CreateBareMetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.createBareMetalServers);
    }

    /**
     * 创建裸金属服务器
     * 创建一台或多台裸金属服务器,裸金属服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式
     *
     * @param CreateBareMetalServersRequest 请求对象
     * @return AsyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse>
     */
    public AsyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse> createBareMetalServersAsyncInvoker(CreateBareMetalServersRequest request) {
        return new AsyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse>(request, BmsMeta.createBareMetalServers, hcClient);
    }

    /**
     * Windows裸金属服务器清除密码
     * 清除Windows裸金属服务器初始安装时系统生成的密码记录。清除密码后，不影响裸金属服务器密码登录功能，但不能再使用获取密码功能来查询该裸金属服务器密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     *
     * @param DeleteWindowsBareMetalServerPasswordRequest 请求对象
     * @return CompletableFuture<DeleteWindowsBareMetalServerPasswordResponse>
     */
    public CompletableFuture<DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordAsync(DeleteWindowsBareMetalServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.deleteWindowsBareMetalServerPassword);
    }

    /**
     * Windows裸金属服务器清除密码
     * 清除Windows裸金属服务器初始安装时系统生成的密码记录。清除密码后，不影响裸金属服务器密码登录功能，但不能再使用获取密码功能来查询该裸金属服务器密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     *
     * @param DeleteWindowsBareMetalServerPasswordRequest 请求对象
     * @return AsyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse>
     */
    public AsyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordAsyncInvoker(DeleteWindowsBareMetalServerPasswordRequest request) {
        return new AsyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse>(request, BmsMeta.deleteWindowsBareMetalServerPassword, hcClient);
    }

    /**
     * 裸金属服务器卸载云磁盘
     * 将挂载至裸金属服务器中的磁盘卸载；对于挂载在系统盘盘位（也就是“/dev/sda”挂载点）上的磁盘，不允许执行卸载操作；对于挂载在数据盘盘位（非“/dev/sda”挂载点）上的磁盘，支持离线卸载和在线卸载（裸金属服务器处于“运行中”状态）磁盘
     *
     * @param DetachBaremetalServerVolumeRequest 请求对象
     * @return CompletableFuture<DetachBaremetalServerVolumeResponse>
     */
    public CompletableFuture<DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeAsync(DetachBaremetalServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.detachBaremetalServerVolume);
    }

    /**
     * 裸金属服务器卸载云磁盘
     * 将挂载至裸金属服务器中的磁盘卸载；对于挂载在系统盘盘位（也就是“/dev/sda”挂载点）上的磁盘，不允许执行卸载操作；对于挂载在数据盘盘位（非“/dev/sda”挂载点）上的磁盘，支持离线卸载和在线卸载（裸金属服务器处于“运行中”状态）磁盘
     *
     * @param DetachBaremetalServerVolumeRequest 请求对象
     * @return AsyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse>
     */
    public AsyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeAsyncInvoker(DetachBaremetalServerVolumeRequest request) {
        return new AsyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse>(request, BmsMeta.detachBaremetalServerVolume, hcClient);
    }

    /**
     * 查询裸金属服务器详情
     * 获取裸金属服务器详细信息，该接口支持查询裸金属服务器的计费方式，以及是否被冻结
     *
     * @param ListBareMetalServerDetailsRequest 请求对象
     * @return CompletableFuture<ListBareMetalServerDetailsResponse>
     */
    public CompletableFuture<ListBareMetalServerDetailsResponse> listBareMetalServerDetailsAsync(ListBareMetalServerDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBareMetalServerDetails);
    }

    /**
     * 查询裸金属服务器详情
     * 获取裸金属服务器详细信息，该接口支持查询裸金属服务器的计费方式，以及是否被冻结
     *
     * @param ListBareMetalServerDetailsRequest 请求对象
     * @return AsyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse>
     */
    public AsyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> listBareMetalServerDetailsAsyncInvoker(ListBareMetalServerDetailsRequest request) {
        return new AsyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse>(request, BmsMeta.listBareMetalServerDetails, hcClient);
    }

    /**
     * 查询裸金属服务器详情列表
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。该接口支持查询裸金属服务器计费方式，以及是否被冻结。
     *
     * @param ListBareMetalServersRequest 请求对象
     * @return CompletableFuture<ListBareMetalServersResponse>
     */
    public CompletableFuture<ListBareMetalServersResponse> listBareMetalServersAsync(ListBareMetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBareMetalServers);
    }

    /**
     * 查询裸金属服务器详情列表
     * 用户根据设置的请求条件筛选裸金属服务器，并获取裸金属服务器的详细信息。该接口支持查询裸金属服务器计费方式，以及是否被冻结。
     *
     * @param ListBareMetalServersRequest 请求对象
     * @return AsyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse>
     */
    public AsyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse> listBareMetalServersAsyncInvoker(ListBareMetalServersRequest request) {
        return new AsyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse>(request, BmsMeta.listBareMetalServers, hcClient);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     * 查询裸金属服务器的规格详情和规格的扩展信息。您可以调用此接口查询“baremetal:extBootType”参数取值，以确认某个规格是否支持快速发放
     *
     * @param ListBaremetalFlavorDetailExtendsRequest 请求对象
     * @return CompletableFuture<ListBaremetalFlavorDetailExtendsResponse>
     */
    public CompletableFuture<ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsAsync(ListBaremetalFlavorDetailExtendsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBaremetalFlavorDetailExtends);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     * 查询裸金属服务器的规格详情和规格的扩展信息。您可以调用此接口查询“baremetal:extBootType”参数取值，以确认某个规格是否支持快速发放
     *
     * @param ListBaremetalFlavorDetailExtendsRequest 请求对象
     * @return AsyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse>
     */
    public AsyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsAsyncInvoker(ListBaremetalFlavorDetailExtendsRequest request) {
        return new AsyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse>(request, BmsMeta.listBaremetalFlavorDetailExtends, hcClient);
    }

    /**
     * 重装裸金属服务器操作系统
     * 重装裸金属服务器的操作系统。快速发放裸金属服务器支持裸金属服务器数据盘不变的情况下，使用原镜像重装系统盘。重装操作系统支持密码或者密钥注入
     *
     * @param ReinstallBaremetalServerOsRequest 请求对象
     * @return CompletableFuture<ReinstallBaremetalServerOsResponse>
     */
    public CompletableFuture<ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsAsync(ReinstallBaremetalServerOsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.reinstallBaremetalServerOs);
    }

    /**
     * 重装裸金属服务器操作系统
     * 重装裸金属服务器的操作系统。快速发放裸金属服务器支持裸金属服务器数据盘不变的情况下，使用原镜像重装系统盘。重装操作系统支持密码或者密钥注入
     *
     * @param ReinstallBaremetalServerOsRequest 请求对象
     * @return AsyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse>
     */
    public AsyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsAsyncInvoker(ReinstallBaremetalServerOsRequest request) {
        return new AsyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse>(request, BmsMeta.reinstallBaremetalServerOs, hcClient);
    }

    /**
     * 一键重置裸金属服务器密码
     * 在裸金属服务器支持一键重置密码功能的前提下，重置裸金属服务器管理帐号（root用户或Administrator用户）的密码。可以通过6.10.1-查询是否支持一键重置密码API查询是否支持一键重置密码。
     *
     * @param ResetPwdOneClickRequest 请求对象
     * @return CompletableFuture<ResetPwdOneClickResponse>
     */
    public CompletableFuture<ResetPwdOneClickResponse> resetPwdOneClickAsync(ResetPwdOneClickRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.resetPwdOneClick);
    }

    /**
     * 一键重置裸金属服务器密码
     * 在裸金属服务器支持一键重置密码功能的前提下，重置裸金属服务器管理帐号（root用户或Administrator用户）的密码。可以通过6.10.1-查询是否支持一键重置密码API查询是否支持一键重置密码。
     *
     * @param ResetPwdOneClickRequest 请求对象
     * @return AsyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse>
     */
    public AsyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse> resetPwdOneClickAsyncInvoker(ResetPwdOneClickRequest request) {
        return new AsyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse>(request, BmsMeta.resetPwdOneClick, hcClient);
    }

    /**
     * 查询裸金属服务器网卡信息
     * 查询裸金属服务器的网卡信息，比如网卡的IP地址、MAC地址
     *
     * @param ShowBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return CompletableFuture<ShowBaremetalServerInterfaceAttachmentsResponse>
     */
    public CompletableFuture<ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsAsync(ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerInterfaceAttachments);
    }

    /**
     * 查询裸金属服务器网卡信息
     * 查询裸金属服务器的网卡信息，比如网卡的IP地址、MAC地址
     *
     * @param ShowBaremetalServerInterfaceAttachmentsRequest 请求对象
     * @return AsyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse>
     */
    public AsyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsAsyncInvoker(ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return new AsyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse>(request, BmsMeta.showBaremetalServerInterfaceAttachments, hcClient);
    }

    /**
     * 查询裸金属服务器标签
     * - 查询指定云服务器的标签信息。
     *
     * @param ShowBaremetalServerTagsRequest 请求对象
     * @return CompletableFuture<ShowBaremetalServerTagsResponse>
     */
    public CompletableFuture<ShowBaremetalServerTagsResponse> showBaremetalServerTagsAsync(ShowBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerTags);
    }

    /**
     * 查询裸金属服务器标签
     * - 查询指定云服务器的标签信息。
     *
     * @param ShowBaremetalServerTagsRequest 请求对象
     * @return AsyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse>
     */
    public AsyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> showBaremetalServerTagsAsyncInvoker(ShowBaremetalServerTagsRequest request) {
        return new AsyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse>(request, BmsMeta.showBaremetalServerTags, hcClient);
    }

    /**
     * 查询裸金属服务器挂载的云硬盘信息
     * 查询裸金属服务器挂载的磁盘信息
     *
     * @param ShowBaremetalServerVolumeInfoRequest 请求对象
     * @return CompletableFuture<ShowBaremetalServerVolumeInfoResponse>
     */
    public CompletableFuture<ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoAsync(ShowBaremetalServerVolumeInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerVolumeInfo);
    }

    /**
     * 查询裸金属服务器挂载的云硬盘信息
     * 查询裸金属服务器挂载的磁盘信息
     *
     * @param ShowBaremetalServerVolumeInfoRequest 请求对象
     * @return AsyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse>
     */
    public AsyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoAsyncInvoker(ShowBaremetalServerVolumeInfoRequest request) {
        return new AsyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse>(request, BmsMeta.showBaremetalServerVolumeInfo, hcClient);
    }

    /**
     * 查询是否支持一键重置密码
     * 查询是否支持一键重置密码
     *
     * @param ShowResetPwdRequest 请求对象
     * @return CompletableFuture<ShowResetPwdResponse>
     */
    public CompletableFuture<ShowResetPwdResponse> showResetPwdAsync(ShowResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showResetPwd);
    }

    /**
     * 查询是否支持一键重置密码
     * 查询是否支持一键重置密码
     *
     * @param ShowResetPwdRequest 请求对象
     * @return AsyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse>
     */
    public AsyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse> showResetPwdAsyncInvoker(ShowResetPwdRequest request) {
        return new AsyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse>(request, BmsMeta.showResetPwd, hcClient);
    }

    /**
     * 查询租户配额
     * 查询该租户下，所有资源的配额信息，包括已使用配额
     *
     * @param ShowTenantQuotaRequest 请求对象
     * @return CompletableFuture<ShowTenantQuotaResponse>
     */
    public CompletableFuture<ShowTenantQuotaResponse> showTenantQuotaAsync(ShowTenantQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showTenantQuota);
    }

    /**
     * 查询租户配额
     * 查询该租户下，所有资源的配额信息，包括已使用配额
     *
     * @param ShowTenantQuotaRequest 请求对象
     * @return AsyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse>
     */
    public AsyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse> showTenantQuotaAsyncInvoker(ShowTenantQuotaRequest request) {
        return new AsyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse>(request, BmsMeta.showTenantQuota, hcClient);
    }

    /**
     * Windows裸金属服务器获取密码
     * 获取Windows裸金属服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     *
     * @param ShowWindowsBaremetalServerPwdRequest 请求对象
     * @return CompletableFuture<ShowWindowsBaremetalServerPwdResponse>
     */
    public CompletableFuture<ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdAsync(ShowWindowsBaremetalServerPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showWindowsBaremetalServerPwd);
    }

    /**
     * Windows裸金属服务器获取密码
     * 获取Windows裸金属服务器初始安装时系统生成的管理员帐户（Administrator帐户或Cloudbase-init设置的帐户）随机密码。如果裸金属服务器是通过私有镜像创建的，请确保已安装Cloudbase-init。公共镜像默认已安装该软件
     *
     * @param ShowWindowsBaremetalServerPwdRequest 请求对象
     * @return AsyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse>
     */
    public AsyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdAsyncInvoker(ShowWindowsBaremetalServerPwdRequest request) {
        return new AsyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse>(request, BmsMeta.showWindowsBaremetalServerPwd, hcClient);
    }

    /**
     * 更新裸金属服务器元数据
     * 更新裸金属服务器元数据。如果元数据中没有待更新字段，则自动添加该字段。如果元数据中已存在待更新字段，则直接更新字段值；如果元数据中的字段不再请求参数中，则保持不变
     *
     * @param UpdateBaremetalServerMetadataRequest 请求对象
     * @return CompletableFuture<UpdateBaremetalServerMetadataResponse>
     */
    public CompletableFuture<UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataAsync(UpdateBaremetalServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.updateBaremetalServerMetadata);
    }

    /**
     * 更新裸金属服务器元数据
     * 更新裸金属服务器元数据。如果元数据中没有待更新字段，则自动添加该字段。如果元数据中已存在待更新字段，则直接更新字段值；如果元数据中的字段不再请求参数中，则保持不变
     *
     * @param UpdateBaremetalServerMetadataRequest 请求对象
     * @return AsyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse>
     */
    public AsyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataAsyncInvoker(UpdateBaremetalServerMetadataRequest request) {
        return new AsyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse>(request, BmsMeta.updateBaremetalServerMetadata, hcClient);
    }

    /**
     * 查询指定API版本信息
     * 查询裸金属服务指定接口版本的信息
     *
     * @param ShowSpecifiedVersionRequest 请求对象
     * @return CompletableFuture<ShowSpecifiedVersionResponse>
     */
    public CompletableFuture<ShowSpecifiedVersionResponse> showSpecifiedVersionAsync(ShowSpecifiedVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showSpecifiedVersion);
    }

    /**
     * 查询指定API版本信息
     * 查询裸金属服务指定接口版本的信息
     *
     * @param ShowSpecifiedVersionRequest 请求对象
     * @return AsyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse>
     */
    public AsyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> showSpecifiedVersionAsyncInvoker(ShowSpecifiedVersionRequest request) {
        return new AsyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse>(request, BmsMeta.showSpecifiedVersion, hcClient);
    }

    /**
     * 查询Job状态
     * 查询Job的执行状态。对于创建裸金属服务器物理机、挂卸卷等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态
     *
     * @param ShowJobInfosRequest 请求对象
     * @return CompletableFuture<ShowJobInfosResponse>
     */
    public CompletableFuture<ShowJobInfosResponse> showJobInfosAsync(ShowJobInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showJobInfos);
    }

    /**
     * 查询Job状态
     * 查询Job的执行状态。对于创建裸金属服务器物理机、挂卸卷等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态
     *
     * @param ShowJobInfosRequest 请求对象
     * @return AsyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse>
     */
    public AsyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse> showJobInfosAsyncInvoker(ShowJobInfosRequest request) {
        return new AsyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse>(request, BmsMeta.showJobInfos, hcClient);
    }

}