package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ecs.v2.model.*;

public class EcsAsyncClient {
    protected HcClient hcClient;

    public EcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EcsAsyncClient> newBuilder() {
        return new ClientBuilder<>(EcsAsyncClient::new);
    }


    /**
     * 云服务器组添加成员
     * 将云服务器加入云服务器组。添加成功后，如果该云服务器组是反亲和性策略的，则该云服务器与云服务器组中的其他成员尽量分散地创建在不同主机上。如果该云服务器时故障域类型的，则该云服务器会拥有故障域属性。
     *
     * @param AddServerGroupMemberRequest 请求对象
     * @return CompletableFuture<AddServerGroupMemberResponse>
     */
    public CompletableFuture<AddServerGroupMemberResponse> addServerGroupMemberAsync(AddServerGroupMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.addServerGroupMember);
    }

    /**
     * 云服务器组添加成员
     * 将云服务器加入云服务器组。添加成功后，如果该云服务器组是反亲和性策略的，则该云服务器与云服务器组中的其他成员尽量分散地创建在不同主机上。如果该云服务器时故障域类型的，则该云服务器会拥有故障域属性。
     *
     * @param AddServerGroupMemberRequest 请求对象
     * @return AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse>
     */
    public AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse> addServerGroupMemberAsyncInvoker(AddServerGroupMemberRequest request) {
        return new AsyncInvoker<AddServerGroupMemberRequest, AddServerGroupMemberResponse>(request, EcsMeta.addServerGroupMember, hcClient);
    }

    /**
     * 弹性云服务器挂载磁盘
     * 把磁盘挂载到弹性云服务器上。
     *
     * @param AttachServerVolumeRequest 请求对象
     * @return CompletableFuture<AttachServerVolumeResponse>
     */
    public CompletableFuture<AttachServerVolumeResponse> attachServerVolumeAsync(AttachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.attachServerVolume);
    }

    /**
     * 弹性云服务器挂载磁盘
     * 把磁盘挂载到弹性云服务器上。
     *
     * @param AttachServerVolumeRequest 请求对象
     * @return AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse>
     */
    public AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse> attachServerVolumeAsyncInvoker(AttachServerVolumeRequest request) {
        return new AsyncInvoker<AttachServerVolumeRequest, AttachServerVolumeResponse>(request, EcsMeta.attachServerVolume, hcClient);
    }

    /**
     * 批量添加云服务器网卡
     * 给云服务器添加一张或多张网卡。
     *
     * @param BatchAddServerNicsRequest 请求对象
     * @return CompletableFuture<BatchAddServerNicsResponse>
     */
    public CompletableFuture<BatchAddServerNicsResponse> batchAddServerNicsAsync(BatchAddServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchAddServerNics);
    }

    /**
     * 批量添加云服务器网卡
     * 给云服务器添加一张或多张网卡。
     *
     * @param BatchAddServerNicsRequest 请求对象
     * @return AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse>
     */
    public AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse> batchAddServerNicsAsyncInvoker(BatchAddServerNicsRequest request) {
        return new AsyncInvoker<BatchAddServerNicsRequest, BatchAddServerNicsResponse>(request, EcsMeta.batchAddServerNics, hcClient);
    }

    /**
     * 批量添加云服务器标签
     * - 为指定云服务器批量添加标签。  - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     *
     * @param BatchCreateServerTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateServerTagsResponse>
     */
    public CompletableFuture<BatchCreateServerTagsResponse> batchCreateServerTagsAsync(BatchCreateServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchCreateServerTags);
    }

    /**
     * 批量添加云服务器标签
     * - 为指定云服务器批量添加标签。  - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     *
     * @param BatchCreateServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse>
     */
    public AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse> batchCreateServerTagsAsyncInvoker(BatchCreateServerTagsRequest request) {
        return new AsyncInvoker<BatchCreateServerTagsRequest, BatchCreateServerTagsResponse>(request, EcsMeta.batchCreateServerTags, hcClient);
    }

    /**
     * 批量删除云服务器网卡
     * 卸载并删除云服务器中的一张或多张网卡。
     *
     * @param BatchDeleteServerNicsRequest 请求对象
     * @return CompletableFuture<BatchDeleteServerNicsResponse>
     */
    public CompletableFuture<BatchDeleteServerNicsResponse> batchDeleteServerNicsAsync(BatchDeleteServerNicsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerNics);
    }

    /**
     * 批量删除云服务器网卡
     * 卸载并删除云服务器中的一张或多张网卡。
     *
     * @param BatchDeleteServerNicsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse>
     */
    public AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse> batchDeleteServerNicsAsyncInvoker(BatchDeleteServerNicsRequest request) {
        return new AsyncInvoker<BatchDeleteServerNicsRequest, BatchDeleteServerNicsResponse>(request, EcsMeta.batchDeleteServerNics, hcClient);
    }

    /**
     * 批量删除云服务器标签
     * - 为指定云服务器批量删除标签。  - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     *
     * @param BatchDeleteServerTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteServerTagsResponse>
     */
    public CompletableFuture<BatchDeleteServerTagsResponse> batchDeleteServerTagsAsync(BatchDeleteServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchDeleteServerTags);
    }

    /**
     * 批量删除云服务器标签
     * - 为指定云服务器批量删除标签。  - 标签管理服务TMS使用该接口批量管理云服务器的标签。
     *
     * @param BatchDeleteServerTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse>
     */
    public AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse> batchDeleteServerTagsAsyncInvoker(BatchDeleteServerTagsRequest request) {
        return new AsyncInvoker<BatchDeleteServerTagsRequest, BatchDeleteServerTagsResponse>(request, EcsMeta.batchDeleteServerTags, hcClient);
    }

    /**
     * 批量重启云服务器
     * 根据给定的云服务器ID列表，批量重启云服务器，一次最多可以重启1000台。
     *
     * @param BatchRebootServersRequest 请求对象
     * @return CompletableFuture<BatchRebootServersResponse>
     */
    public CompletableFuture<BatchRebootServersResponse> batchRebootServersAsync(BatchRebootServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchRebootServers);
    }

    /**
     * 批量重启云服务器
     * 根据给定的云服务器ID列表，批量重启云服务器，一次最多可以重启1000台。
     *
     * @param BatchRebootServersRequest 请求对象
     * @return AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse>
     */
    public AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse> batchRebootServersAsyncInvoker(BatchRebootServersRequest request) {
        return new AsyncInvoker<BatchRebootServersRequest, BatchRebootServersResponse>(request, EcsMeta.batchRebootServers, hcClient);
    }

    /**
     * 批量启动云服务器
     * 根据给定的云服务器ID列表，批量启动云服务器，一次最多可以启动1000台。
     *
     * @param BatchStartServersRequest 请求对象
     * @return CompletableFuture<BatchStartServersResponse>
     */
    public CompletableFuture<BatchStartServersResponse> batchStartServersAsync(BatchStartServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStartServers);
    }

    /**
     * 批量启动云服务器
     * 根据给定的云服务器ID列表，批量启动云服务器，一次最多可以启动1000台。
     *
     * @param BatchStartServersRequest 请求对象
     * @return AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse>
     */
    public AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse> batchStartServersAsyncInvoker(BatchStartServersRequest request) {
        return new AsyncInvoker<BatchStartServersRequest, BatchStartServersResponse>(request, EcsMeta.batchStartServers, hcClient);
    }

    /**
     * 批量关闭云服务器
     * 根据给定的云服务器ID列表，批量关闭云服务器，一次最多可以关闭1000台。
     *
     * @param BatchStopServersRequest 请求对象
     * @return CompletableFuture<BatchStopServersResponse>
     */
    public CompletableFuture<BatchStopServersResponse> batchStopServersAsync(BatchStopServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.batchStopServers);
    }

    /**
     * 批量关闭云服务器
     * 根据给定的云服务器ID列表，批量关闭云服务器，一次最多可以关闭1000台。
     *
     * @param BatchStopServersRequest 请求对象
     * @return AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse>
     */
    public AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse> batchStopServersAsyncInvoker(BatchStopServersRequest request) {
        return new AsyncInvoker<BatchStopServersRequest, BatchStopServersResponse>(request, EcsMeta.batchStopServers, hcClient);
    }

    /**
     * 切换弹性云服务器操作系统(安装Cloud init)
     * 切换弹性云服务器操作系统。支持弹性云服务器数据盘不变的情况下，使用新镜像重装系统盘。  调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至弹性云服务器，实现切换操作系统功能。
     *
     * @param ChangeServerOsWithCloudInitRequest 请求对象
     * @return CompletableFuture<ChangeServerOsWithCloudInitResponse>
     */
    public CompletableFuture<ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitAsync(ChangeServerOsWithCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.changeServerOsWithCloudInit);
    }

    /**
     * 切换弹性云服务器操作系统(安装Cloud init)
     * 切换弹性云服务器操作系统。支持弹性云服务器数据盘不变的情况下，使用新镜像重装系统盘。  调用该接口后，系统将卸载系统盘，然后使用新镜像重新创建系统盘，并挂载至弹性云服务器，实现切换操作系统功能。
     *
     * @param ChangeServerOsWithCloudInitRequest 请求对象
     * @return AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse>
     */
    public AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse> changeServerOsWithCloudInitAsyncInvoker(ChangeServerOsWithCloudInitRequest request) {
        return new AsyncInvoker<ChangeServerOsWithCloudInitRequest, ChangeServerOsWithCloudInitResponse>(request, EcsMeta.changeServerOsWithCloudInit, hcClient);
    }

    /**
     * 创建云服务器(按需)
     * 创建一台或多台按需付费方式的云服务器。  弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。  - 密钥对 密钥对指使用密钥对作为弹性云服务器的鉴权方式。 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。  - 密码 密码指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。  接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。  &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     *
     * @param CreatePostPaidServersRequest 请求对象
     * @return CompletableFuture<CreatePostPaidServersResponse>
     */
    public CompletableFuture<CreatePostPaidServersResponse> createPostPaidServersAsync(CreatePostPaidServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createPostPaidServers);
    }

    /**
     * 创建云服务器(按需)
     * 创建一台或多台按需付费方式的云服务器。  弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。  - 密钥对 密钥对指使用密钥对作为弹性云服务器的鉴权方式。 接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。  - 密码 密码指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。  接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。  &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     *
     * @param CreatePostPaidServersRequest 请求对象
     * @return AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse>
     */
    public AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse> createPostPaidServersAsyncInvoker(CreatePostPaidServersRequest request) {
        return new AsyncInvoker<CreatePostPaidServersRequest, CreatePostPaidServersResponse>(request, EcsMeta.createPostPaidServers, hcClient);
    }

    /**
     * 创建云服务器组
     * 创建弹性云服务器组。  与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     *
     * @param CreateServerGroupRequest 请求对象
     * @return CompletableFuture<CreateServerGroupResponse>
     */
    public CompletableFuture<CreateServerGroupResponse> createServerGroupAsync(CreateServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createServerGroup);
    }

    /**
     * 创建云服务器组
     * 创建弹性云服务器组。  与原生的创建云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     *
     * @param CreateServerGroupRequest 请求对象
     * @return AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>
     */
    public AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse> createServerGroupAsyncInvoker(CreateServerGroupRequest request) {
        return new AsyncInvoker<CreateServerGroupRequest, CreateServerGroupResponse>(request, EcsMeta.createServerGroup, hcClient);
    }

    /**
     * 创建云服务器
     * 创建一台或多台云服务器。  指该接口兼容《弹性云服务器接口参考》创建云服务器v1的功能，同时合入新功能，支持创建包年/包月的弹性云服务器。  弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。  - 密钥对  指使用密钥对作为弹性云服务器的鉴权方式。  接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。  - 密码  指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。  接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。  &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     *
     * @param CreateServersRequest 请求对象
     * @return CompletableFuture<CreateServersResponse>
     */
    public CompletableFuture<CreateServersResponse> createServersAsync(CreateServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.createServers);
    }

    /**
     * 创建云服务器
     * 创建一台或多台云服务器。  指该接口兼容《弹性云服务器接口参考》创建云服务器v1的功能，同时合入新功能，支持创建包年/包月的弹性云服务器。  弹性云服务器的登录鉴权方式包括两种：密钥对、密码。为安全起见，推荐使用密钥对方式。  - 密钥对  指使用密钥对作为弹性云服务器的鉴权方式。  接口调用方法：使用key_name字段，指定弹性云服务器登录时使用的密钥文件。  - 密码  指使用设置初始密码方式作为弹性云服务器的鉴权方式，此时，您可以通过用户名密码方式登录弹性云服务器，Linux操作系统时为root用户的初始密码，Windows操作系统时为Administrator用户的初始密码。  接口调用方法：使用adminPass字段，指定管理员帐号的初始登录密码。对于镜像已安装Cloud-init的Linux云服务器，如果需要使用密文密码，可以使用user_data字段进行密码注入。  &gt; 对于安装Cloud-init镜像的Linux云服务器云主机，若指定user_data字段，则adminPass字段无效。
     *
     * @param CreateServersRequest 请求对象
     * @return AsyncInvoker<CreateServersRequest, CreateServersResponse>
     */
    public AsyncInvoker<CreateServersRequest, CreateServersResponse> createServersAsyncInvoker(CreateServersRequest request) {
        return new AsyncInvoker<CreateServersRequest, CreateServersResponse>(request, EcsMeta.createServers, hcClient);
    }

    /**
     * 删除云服务器组
     * 删除云服务器组。  与原生的删除云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     *
     * @param DeleteServerGroupRequest 请求对象
     * @return CompletableFuture<DeleteServerGroupResponse>
     */
    public CompletableFuture<DeleteServerGroupResponse> deleteServerGroupAsync(DeleteServerGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerGroup);
    }

    /**
     * 删除云服务器组
     * 删除云服务器组。  与原生的删除云服务器组接口不同之处在于该接口支持企业项目细粒度权限的校验。
     *
     * @param DeleteServerGroupRequest 请求对象
     * @return AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse>
     */
    public AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse> deleteServerGroupAsyncInvoker(DeleteServerGroupRequest request) {
        return new AsyncInvoker<DeleteServerGroupRequest, DeleteServerGroupResponse>(request, EcsMeta.deleteServerGroup, hcClient);
    }

    /**
     * 云服务器组删除成员
     * 将弹性云服务器移出云服务器组。移出后，该云服务器与云服务器组中的成员不再遵从反亲和策略。
     *
     * @param DeleteServerGroupMemberRequest 请求对象
     * @return CompletableFuture<DeleteServerGroupMemberResponse>
     */
    public CompletableFuture<DeleteServerGroupMemberResponse> deleteServerGroupMemberAsync(DeleteServerGroupMemberRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerGroupMember);
    }

    /**
     * 云服务器组删除成员
     * 将弹性云服务器移出云服务器组。移出后，该云服务器与云服务器组中的成员不再遵从反亲和策略。
     *
     * @param DeleteServerGroupMemberRequest 请求对象
     * @return AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse>
     */
    public AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse> deleteServerGroupMemberAsyncInvoker(DeleteServerGroupMemberRequest request) {
        return new AsyncInvoker<DeleteServerGroupMemberRequest, DeleteServerGroupMemberResponse>(request, EcsMeta.deleteServerGroupMember, hcClient);
    }

    /**
     * 删除云服务器指定元数据
     * 删除云服务器指定元数据。
     *
     * @param DeleteServerMetadataRequest 请求对象
     * @return CompletableFuture<DeleteServerMetadataResponse>
     */
    public CompletableFuture<DeleteServerMetadataResponse> deleteServerMetadataAsync(DeleteServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServerMetadata);
    }

    /**
     * 删除云服务器指定元数据
     * 删除云服务器指定元数据。
     *
     * @param DeleteServerMetadataRequest 请求对象
     * @return AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse>
     */
    public AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse> deleteServerMetadataAsyncInvoker(DeleteServerMetadataRequest request) {
        return new AsyncInvoker<DeleteServerMetadataRequest, DeleteServerMetadataResponse>(request, EcsMeta.deleteServerMetadata, hcClient);
    }

    /**
     * 删除云服务器
     * 根据指定的云服务器ID列表，删除云服务器。  系统支持删除单台云服务器和批量删除多台云服务器操作，批量删除云服务器时，一次最多可以删除1000台。
     *
     * @param DeleteServersRequest 请求对象
     * @return CompletableFuture<DeleteServersResponse>
     */
    public CompletableFuture<DeleteServersResponse> deleteServersAsync(DeleteServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.deleteServers);
    }

    /**
     * 删除云服务器
     * 根据指定的云服务器ID列表，删除云服务器。  系统支持删除单台云服务器和批量删除多台云服务器操作，批量删除云服务器时，一次最多可以删除1000台。
     *
     * @param DeleteServersRequest 请求对象
     * @return AsyncInvoker<DeleteServersRequest, DeleteServersResponse>
     */
    public AsyncInvoker<DeleteServersRequest, DeleteServersResponse> deleteServersAsyncInvoker(DeleteServersRequest request) {
        return new AsyncInvoker<DeleteServersRequest, DeleteServersResponse>(request, EcsMeta.deleteServers, hcClient);
    }

    /**
     * 弹性云服务器卸载磁盘
     * 从弹性云服务器中卸载磁盘。
     *
     * @param DetachServerVolumeRequest 请求对象
     * @return CompletableFuture<DetachServerVolumeResponse>
     */
    public CompletableFuture<DetachServerVolumeResponse> detachServerVolumeAsync(DetachServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.detachServerVolume);
    }

    /**
     * 弹性云服务器卸载磁盘
     * 从弹性云服务器中卸载磁盘。
     *
     * @param DetachServerVolumeRequest 请求对象
     * @return AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse>
     */
    public AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse> detachServerVolumeAsyncInvoker(DetachServerVolumeRequest request) {
        return new AsyncInvoker<DetachServerVolumeRequest, DetachServerVolumeResponse>(request, EcsMeta.detachServerVolume, hcClient);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     * 查询云服务器规格详情信息和规格扩展信息列表。
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listFlavors);
    }

    /**
     * 查询规格详情和规格扩展信息列表
     * 查询云服务器规格详情信息和规格扩展信息列表。
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, EcsMeta.listFlavors, hcClient);
    }

    /**
     * 查询云服务器规格变更支持列表
     * 变更规格时，部分规格的云服务器之间不能互相变更。您可以通过本接口，通过指定弹性云服务器规格，查询该规格可以变更的规格列表。
     *
     * @param ListResizeFlavorsRequest 请求对象
     * @return CompletableFuture<ListResizeFlavorsResponse>
     */
    public CompletableFuture<ListResizeFlavorsResponse> listResizeFlavorsAsync(ListResizeFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listResizeFlavors);
    }

    /**
     * 查询云服务器规格变更支持列表
     * 变更规格时，部分规格的云服务器之间不能互相变更。您可以通过本接口，通过指定弹性云服务器规格，查询该规格可以变更的规格列表。
     *
     * @param ListResizeFlavorsRequest 请求对象
     * @return AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse>
     */
    public AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse> listResizeFlavorsAsyncInvoker(ListResizeFlavorsRequest request) {
        return new AsyncInvoker<ListResizeFlavorsRequest, ListResizeFlavorsResponse>(request, EcsMeta.listResizeFlavors, hcClient);
    }

    /**
     * 查询弹性云服务器磁盘信息
     * 查询弹性云服务器挂载的磁盘信息。
     *
     * @param ListServerBlockDevicesRequest 请求对象
     * @return CompletableFuture<ListServerBlockDevicesResponse>
     */
    public CompletableFuture<ListServerBlockDevicesResponse> listServerBlockDevicesAsync(ListServerBlockDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerBlockDevices);
    }

    /**
     * 查询弹性云服务器磁盘信息
     * 查询弹性云服务器挂载的磁盘信息。
     *
     * @param ListServerBlockDevicesRequest 请求对象
     * @return AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse>
     */
    public AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse> listServerBlockDevicesAsyncInvoker(ListServerBlockDevicesRequest request) {
        return new AsyncInvoker<ListServerBlockDevicesRequest, ListServerBlockDevicesResponse>(request, EcsMeta.listServerBlockDevices, hcClient);
    }

    /**
     * 查询云服务器网卡信息
     * 查询云服务器网卡信息。
     *
     * @param ListServerInterfacesRequest 请求对象
     * @return CompletableFuture<ListServerInterfacesResponse>
     */
    public CompletableFuture<ListServerInterfacesResponse> listServerInterfacesAsync(ListServerInterfacesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServerInterfaces);
    }

    /**
     * 查询云服务器网卡信息
     * 查询云服务器网卡信息。
     *
     * @param ListServerInterfacesRequest 请求对象
     * @return AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse>
     */
    public AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse> listServerInterfacesAsyncInvoker(ListServerInterfacesRequest request) {
        return new AsyncInvoker<ListServerInterfacesRequest, ListServerInterfacesResponse>(request, EcsMeta.listServerInterfaces, hcClient);
    }

    /**
     * 查询云服务器详情列表
     * 根据用户请求条件从数据库筛选、查询所有的弹性云服务器，并关联相关表获取到弹性云服务器的详细信息。  该接口支持查询弹性云服务器计费方式，以及是否被冻结。
     *
     * @param ListServersDetailsRequest 请求对象
     * @return CompletableFuture<ListServersDetailsResponse>
     */
    public CompletableFuture<ListServersDetailsResponse> listServersDetailsAsync(ListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.listServersDetails);
    }

    /**
     * 查询云服务器详情列表
     * 根据用户请求条件从数据库筛选、查询所有的弹性云服务器，并关联相关表获取到弹性云服务器的详细信息。  该接口支持查询弹性云服务器计费方式，以及是否被冻结。
     *
     * @param ListServersDetailsRequest 请求对象
     * @return AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse>
     */
    public AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse> listServersDetailsAsyncInvoker(ListServersDetailsRequest request) {
        return new AsyncInvoker<ListServersDetailsRequest, ListServersDetailsResponse>(request, EcsMeta.listServersDetails, hcClient);
    }

    /**
     * 添加安全组
     * 为弹性云服务器添加一个安全组。  添加多个安全组时，建议最多为弹性云服务器添加5个安全组。
     *
     * @param NovaAssociateSecurityGroupRequest 请求对象
     * @return CompletableFuture<NovaAssociateSecurityGroupResponse>
     */
    public CompletableFuture<NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupAsync(NovaAssociateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaAssociateSecurityGroup);
    }

    /**
     * 添加安全组
     * 为弹性云服务器添加一个安全组。  添加多个安全组时，建议最多为弹性云服务器添加5个安全组。
     *
     * @param NovaAssociateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse>
     */
    public AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse> novaAssociateSecurityGroupAsyncInvoker(NovaAssociateSecurityGroupRequest request) {
        return new AsyncInvoker<NovaAssociateSecurityGroupRequest, NovaAssociateSecurityGroupResponse>(request, EcsMeta.novaAssociateSecurityGroup, hcClient);
    }

    /**
     * 创建和导入SSH密钥
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。  创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录云服务器云主机。为保证云服务器云主机器安全，私钥数据只能读取一次，请妥善保管。
     *
     * @param NovaCreateKeypairRequest 请求对象
     * @return CompletableFuture<NovaCreateKeypairResponse>
     */
    public CompletableFuture<NovaCreateKeypairResponse> novaCreateKeypairAsync(NovaCreateKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaCreateKeypair);
    }

    /**
     * 创建和导入SSH密钥
     * 创建SSH密钥，或把公钥导入系统，生成密钥对。  创建SSH密钥成功后，请把响应数据中的私钥内容保存到本地文件，用户使用该私钥登录云服务器云主机。为保证云服务器云主机器安全，私钥数据只能读取一次，请妥善保管。
     *
     * @param NovaCreateKeypairRequest 请求对象
     * @return AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse>
     */
    public AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse> novaCreateKeypairAsyncInvoker(NovaCreateKeypairRequest request) {
        return new AsyncInvoker<NovaCreateKeypairRequest, NovaCreateKeypairResponse>(request, EcsMeta.novaCreateKeypair, hcClient);
    }

    /**
     * 创建云服务器
     * 创建一台弹性云服务器。  弹性云服务器创建完成后，如需开启自动恢复功能，可以调用配置云服务器自动恢复的接口，具体使用请参见管理云服务器自动恢复动作。  该接口在云服务器创建失败后不支持自动回滚。若需要自动回滚能力，可以调用POST /v1/{project_id}/cloudservers接口，具体使用请参见创建云服务器（按需）。
     *
     * @param NovaCreateServersRequest 请求对象
     * @return CompletableFuture<NovaCreateServersResponse>
     */
    public CompletableFuture<NovaCreateServersResponse> novaCreateServersAsync(NovaCreateServersRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaCreateServers);
    }

    /**
     * 创建云服务器
     * 创建一台弹性云服务器。  弹性云服务器创建完成后，如需开启自动恢复功能，可以调用配置云服务器自动恢复的接口，具体使用请参见管理云服务器自动恢复动作。  该接口在云服务器创建失败后不支持自动回滚。若需要自动回滚能力，可以调用POST /v1/{project_id}/cloudservers接口，具体使用请参见创建云服务器（按需）。
     *
     * @param NovaCreateServersRequest 请求对象
     * @return AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse>
     */
    public AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse> novaCreateServersAsyncInvoker(NovaCreateServersRequest request) {
        return new AsyncInvoker<NovaCreateServersRequest, NovaCreateServersResponse>(request, EcsMeta.novaCreateServers, hcClient);
    }

    /**
     * 删除SSH密钥
     * 根据SSH密钥的名称，删除指定SSH密钥。
     *
     * @param NovaDeleteKeypairRequest 请求对象
     * @return CompletableFuture<NovaDeleteKeypairResponse>
     */
    public CompletableFuture<NovaDeleteKeypairResponse> novaDeleteKeypairAsync(NovaDeleteKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDeleteKeypair);
    }

    /**
     * 删除SSH密钥
     * 根据SSH密钥的名称，删除指定SSH密钥。
     *
     * @param NovaDeleteKeypairRequest 请求对象
     * @return AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse>
     */
    public AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse> novaDeleteKeypairAsyncInvoker(NovaDeleteKeypairRequest request) {
        return new AsyncInvoker<NovaDeleteKeypairRequest, NovaDeleteKeypairResponse>(request, EcsMeta.novaDeleteKeypair, hcClient);
    }

    /**
     * 删除云服务器
     * 删除一台云服务器。
     *
     * @param NovaDeleteServerRequest 请求对象
     * @return CompletableFuture<NovaDeleteServerResponse>
     */
    public CompletableFuture<NovaDeleteServerResponse> novaDeleteServerAsync(NovaDeleteServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDeleteServer);
    }

    /**
     * 删除云服务器
     * 删除一台云服务器。
     *
     * @param NovaDeleteServerRequest 请求对象
     * @return AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse>
     */
    public AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse> novaDeleteServerAsyncInvoker(NovaDeleteServerRequest request) {
        return new AsyncInvoker<NovaDeleteServerRequest, NovaDeleteServerResponse>(request, EcsMeta.novaDeleteServer, hcClient);
    }

    /**
     * 移除安全组
     * 移除弹性云服务器中的安全组。
     *
     * @param NovaDisassociateSecurityGroupRequest 请求对象
     * @return CompletableFuture<NovaDisassociateSecurityGroupResponse>
     */
    public CompletableFuture<NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupAsync(NovaDisassociateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaDisassociateSecurityGroup);
    }

    /**
     * 移除安全组
     * 移除弹性云服务器中的安全组。
     *
     * @param NovaDisassociateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse>
     */
    public AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse> novaDisassociateSecurityGroupAsyncInvoker(NovaDisassociateSecurityGroupRequest request) {
        return new AsyncInvoker<NovaDisassociateSecurityGroupRequest, NovaDisassociateSecurityGroupResponse>(request, EcsMeta.novaDisassociateSecurityGroup, hcClient);
    }

    /**
     * 查询可用区列表
     * 查询可用域列表。
     *
     * @param NovaListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<NovaListAvailabilityZonesResponse>
     */
    public CompletableFuture<NovaListAvailabilityZonesResponse> novaListAvailabilityZonesAsync(NovaListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListAvailabilityZones);
    }

    /**
     * 查询可用区列表
     * 查询可用域列表。
     *
     * @param NovaListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse>
     */
    public AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse> novaListAvailabilityZonesAsyncInvoker(NovaListAvailabilityZonesRequest request) {
        return new AsyncInvoker<NovaListAvailabilityZonesRequest, NovaListAvailabilityZonesResponse>(request, EcsMeta.novaListAvailabilityZones, hcClient);
    }

    /**
     * 查询SSH密钥列表
     * 查询SSH密钥信息列表。
     *
     * @param NovaListKeypairsRequest 请求对象
     * @return CompletableFuture<NovaListKeypairsResponse>
     */
    public CompletableFuture<NovaListKeypairsResponse> novaListKeypairsAsync(NovaListKeypairsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListKeypairs);
    }

    /**
     * 查询SSH密钥列表
     * 查询SSH密钥信息列表。
     *
     * @param NovaListKeypairsRequest 请求对象
     * @return AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse>
     */
    public AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse> novaListKeypairsAsyncInvoker(NovaListKeypairsRequest request) {
        return new AsyncInvoker<NovaListKeypairsRequest, NovaListKeypairsResponse>(request, EcsMeta.novaListKeypairs, hcClient);
    }

    /**
     * 查询指定云服务器安全组列表
     * 查询指定弹性云服务器的安全组。
     *
     * @param NovaListServerSecurityGroupsRequest 请求对象
     * @return CompletableFuture<NovaListServerSecurityGroupsResponse>
     */
    public CompletableFuture<NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsAsync(NovaListServerSecurityGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServerSecurityGroups);
    }

    /**
     * 查询指定云服务器安全组列表
     * 查询指定弹性云服务器的安全组。
     *
     * @param NovaListServerSecurityGroupsRequest 请求对象
     * @return AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse>
     */
    public AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse> novaListServerSecurityGroupsAsyncInvoker(NovaListServerSecurityGroupsRequest request) {
        return new AsyncInvoker<NovaListServerSecurityGroupsRequest, NovaListServerSecurityGroupsResponse>(request, EcsMeta.novaListServerSecurityGroups, hcClient);
    }

    /**
     * 查询云服务器详情列表
     * 查询云服务器详情信息列表。
     *
     * @param NovaListServersDetailsRequest 请求对象
     * @return CompletableFuture<NovaListServersDetailsResponse>
     */
    public CompletableFuture<NovaListServersDetailsResponse> novaListServersDetailsAsync(NovaListServersDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaListServersDetails);
    }

    /**
     * 查询云服务器详情列表
     * 查询云服务器详情信息列表。
     *
     * @param NovaListServersDetailsRequest 请求对象
     * @return AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse>
     */
    public AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse> novaListServersDetailsAsyncInvoker(NovaListServersDetailsRequest request) {
        return new AsyncInvoker<NovaListServersDetailsRequest, NovaListServersDetailsResponse>(request, EcsMeta.novaListServersDetails, hcClient);
    }

    /**
     * 查询SSH密钥详情
     * 根据SSH密钥名称查询指定SSH密钥。
     *
     * @param NovaShowKeypairRequest 请求对象
     * @return CompletableFuture<NovaShowKeypairResponse>
     */
    public CompletableFuture<NovaShowKeypairResponse> novaShowKeypairAsync(NovaShowKeypairRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowKeypair);
    }

    /**
     * 查询SSH密钥详情
     * 根据SSH密钥名称查询指定SSH密钥。
     *
     * @param NovaShowKeypairRequest 请求对象
     * @return AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse>
     */
    public AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse> novaShowKeypairAsyncInvoker(NovaShowKeypairRequest request) {
        return new AsyncInvoker<NovaShowKeypairRequest, NovaShowKeypairResponse>(request, EcsMeta.novaShowKeypair, hcClient);
    }

    /**
     * 查询云服务器详情
     * 根据云服务器ID，查询云服务器的详细信息。
     *
     * @param NovaShowServerRequest 请求对象
     * @return CompletableFuture<NovaShowServerResponse>
     */
    public CompletableFuture<NovaShowServerResponse> novaShowServerAsync(NovaShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.novaShowServer);
    }

    /**
     * 查询云服务器详情
     * 根据云服务器ID，查询云服务器的详细信息。
     *
     * @param NovaShowServerRequest 请求对象
     * @return AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse>
     */
    public AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse> novaShowServerAsyncInvoker(NovaShowServerRequest request) {
        return new AsyncInvoker<NovaShowServerRequest, NovaShowServerResponse>(request, EcsMeta.novaShowServer, hcClient);
    }

    /**
     * 重装弹性云服务器操作系统(安装Cloud-init)
     * 重装弹性云服务器的操作系统。支持弹性云服务器数据盘不变的情况下，使用原镜像重装系统盘。  调用该接口后，系统将卸载系统盘，然后使用原镜像重新创建系统盘，并挂载至弹性云服务器，实现重装操作系统功能。
     *
     * @param ReinstallServerWithCloudInitRequest 请求对象
     * @return CompletableFuture<ReinstallServerWithCloudInitResponse>
     */
    public CompletableFuture<ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitAsync(ReinstallServerWithCloudInitRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.reinstallServerWithCloudInit);
    }

    /**
     * 重装弹性云服务器操作系统(安装Cloud-init)
     * 重装弹性云服务器的操作系统。支持弹性云服务器数据盘不变的情况下，使用原镜像重装系统盘。  调用该接口后，系统将卸载系统盘，然后使用原镜像重新创建系统盘，并挂载至弹性云服务器，实现重装操作系统功能。
     *
     * @param ReinstallServerWithCloudInitRequest 请求对象
     * @return AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse>
     */
    public AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse> reinstallServerWithCloudInitAsyncInvoker(ReinstallServerWithCloudInitRequest request) {
        return new AsyncInvoker<ReinstallServerWithCloudInitRequest, ReinstallServerWithCloudInitResponse>(request, EcsMeta.reinstallServerWithCloudInit, hcClient);
    }

    /**
     * 一键重置弹性云服务器密码(企业项目)
     * 重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     *
     * @param ResetServerPasswordRequest 请求对象
     * @return CompletableFuture<ResetServerPasswordResponse>
     */
    public CompletableFuture<ResetServerPasswordResponse> resetServerPasswordAsync(ResetServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resetServerPassword);
    }

    /**
     * 一键重置弹性云服务器密码(企业项目)
     * 重置弹性云服务器管理帐号（root用户或Administrator用户）的密码。
     *
     * @param ResetServerPasswordRequest 请求对象
     * @return AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse>
     */
    public AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse> resetServerPasswordAsyncInvoker(ResetServerPasswordRequest request) {
        return new AsyncInvoker<ResetServerPasswordRequest, ResetServerPasswordResponse>(request, EcsMeta.resetServerPassword, hcClient);
    }

    /**
     * 变更云服务器规格(按需)
     * 当您创建的弹性云服务器规格无法满足业务需要时，可以变更云服务器规格，升级vCPU、内存。具体接口的使用，请参见本节内容。  变更规格时，部分规格的云服务器之间不能互相变更。  您可以通过接口“/v1/{project_id}/cloudservers/resize_flavors?{instance_uuid,source_flavor_id,source_flavor_name}”查询支持列表。
     *
     * @param ResizePostPaidServerRequest 请求对象
     * @return CompletableFuture<ResizePostPaidServerResponse>
     */
    public CompletableFuture<ResizePostPaidServerResponse> resizePostPaidServerAsync(ResizePostPaidServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resizePostPaidServer);
    }

    /**
     * 变更云服务器规格(按需)
     * 当您创建的弹性云服务器规格无法满足业务需要时，可以变更云服务器规格，升级vCPU、内存。具体接口的使用，请参见本节内容。  变更规格时，部分规格的云服务器之间不能互相变更。  您可以通过接口“/v1/{project_id}/cloudservers/resize_flavors?{instance_uuid,source_flavor_id,source_flavor_name}”查询支持列表。
     *
     * @param ResizePostPaidServerRequest 请求对象
     * @return AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse>
     */
    public AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse> resizePostPaidServerAsyncInvoker(ResizePostPaidServerRequest request) {
        return new AsyncInvoker<ResizePostPaidServerRequest, ResizePostPaidServerResponse>(request, EcsMeta.resizePostPaidServer, hcClient);
    }

    /**
     * 变更云服务器规格
     * 变更云服务器规格。  v1.1版本：指该接口兼容v1接口的功能，同时合入新功能，支持变更包年/包月弹性云服务器的规格。  注意事项：  - 该接口可以使用合作伙伴自身的AK/SK或者token调用，也可以用合作伙伴子客户的AK/SK或者token来调用。 - 如果使用AK/SK认证方式，示例代码中region请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“区域”的内容，，serviceName（英文服务名称缩写）请指定为ECS。 - Endpoint请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“终端节点（Endpoint）”的内容。
     *
     * @param ResizeServerRequest 请求对象
     * @return CompletableFuture<ResizeServerResponse>
     */
    public CompletableFuture<ResizeServerResponse> resizeServerAsync(ResizeServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.resizeServer);
    }

    /**
     * 变更云服务器规格
     * 变更云服务器规格。  v1.1版本：指该接口兼容v1接口的功能，同时合入新功能，支持变更包年/包月弹性云服务器的规格。  注意事项：  - 该接口可以使用合作伙伴自身的AK/SK或者token调用，也可以用合作伙伴子客户的AK/SK或者token来调用。 - 如果使用AK/SK认证方式，示例代码中region请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“区域”的内容，，serviceName（英文服务名称缩写）请指定为ECS。 - Endpoint请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint)中“弹性云服务 ECS”下“终端节点（Endpoint）”的内容。
     *
     * @param ResizeServerRequest 请求对象
     * @return AsyncInvoker<ResizeServerRequest, ResizeServerResponse>
     */
    public AsyncInvoker<ResizeServerRequest, ResizeServerResponse> resizeServerAsyncInvoker(ResizeServerRequest request) {
        return new AsyncInvoker<ResizeServerRequest, ResizeServerResponse>(request, EcsMeta.resizeServer, hcClient);
    }

    /**
     * 查询是否支持一键重置密码
     * 查询弹性云服务器是否支持一键重置密码。
     *
     * @param ShowResetPasswordFlagRequest 请求对象
     * @return CompletableFuture<ShowResetPasswordFlagResponse>
     */
    public CompletableFuture<ShowResetPasswordFlagResponse> showResetPasswordFlagAsync(ShowResetPasswordFlagRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showResetPasswordFlag);
    }

    /**
     * 查询是否支持一键重置密码
     * 查询弹性云服务器是否支持一键重置密码。
     *
     * @param ShowResetPasswordFlagRequest 请求对象
     * @return AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse>
     */
    public AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse> showResetPasswordFlagAsyncInvoker(ShowResetPasswordFlagRequest request) {
        return new AsyncInvoker<ShowResetPasswordFlagRequest, ShowResetPasswordFlagResponse>(request, EcsMeta.showResetPasswordFlag, hcClient);
    }

    /**
     * 查询云服务器详情
     * 查询弹性云服务器的详细信息。  该接口支持查询弹性云服务器的计费方式，以及是否被冻结。
     *
     * @param ShowServerRequest 请求对象
     * @return CompletableFuture<ShowServerResponse>
     */
    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServer);
    }

    /**
     * 查询云服务器详情
     * 查询弹性云服务器的详细信息。  该接口支持查询弹性云服务器的计费方式，以及是否被冻结。
     *
     * @param ShowServerRequest 请求对象
     * @return AsyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public AsyncInvoker<ShowServerRequest, ShowServerResponse> showServerAsyncInvoker(ShowServerRequest request) {
        return new AsyncInvoker<ShowServerRequest, ShowServerResponse>(request, EcsMeta.showServer, hcClient);
    }

    /**
     * 查询租户配额
     * 查询租户配额信息。
     *
     * @param ShowServerLimitsRequest 请求对象
     * @return CompletableFuture<ShowServerLimitsResponse>
     */
    public CompletableFuture<ShowServerLimitsResponse> showServerLimitsAsync(ShowServerLimitsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerLimits);
    }

    /**
     * 查询租户配额
     * 查询租户配额信息。
     *
     * @param ShowServerLimitsRequest 请求对象
     * @return AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse>
     */
    public AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse> showServerLimitsAsyncInvoker(ShowServerLimitsRequest request) {
        return new AsyncInvoker<ShowServerLimitsRequest, ShowServerLimitsResponse>(request, EcsMeta.showServerLimits, hcClient);
    }

    /**
     * 获取VNC远程登录地址
     * 获取弹性云服务器VNC远程登录地址。
     *
     * @param ShowServerRemoteConsoleRequest 请求对象
     * @return CompletableFuture<ShowServerRemoteConsoleResponse>
     */
    public CompletableFuture<ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsync(ShowServerRemoteConsoleRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerRemoteConsole);
    }

    /**
     * 获取VNC远程登录地址
     * 获取弹性云服务器VNC远程登录地址。
     *
     * @param ShowServerRemoteConsoleRequest 请求对象
     * @return AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>
     */
    public AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse> showServerRemoteConsoleAsyncInvoker(ShowServerRemoteConsoleRequest request) {
        return new AsyncInvoker<ShowServerRemoteConsoleRequest, ShowServerRemoteConsoleResponse>(request, EcsMeta.showServerRemoteConsole, hcClient);
    }

    /**
     * 查询云服务器标签
     * - 查询指定云服务器的标签信息。  - 标签管理服务TMS使用该接口查询指定云服务器的全部标签数据。
     *
     * @param ShowServerTagsRequest 请求对象
     * @return CompletableFuture<ShowServerTagsResponse>
     */
    public CompletableFuture<ShowServerTagsResponse> showServerTagsAsync(ShowServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showServerTags);
    }

    /**
     * 查询云服务器标签
     * - 查询指定云服务器的标签信息。  - 标签管理服务TMS使用该接口查询指定云服务器的全部标签数据。
     *
     * @param ShowServerTagsRequest 请求对象
     * @return AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse>
     */
    public AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse> showServerTagsAsyncInvoker(ShowServerTagsRequest request) {
        return new AsyncInvoker<ShowServerTagsRequest, ShowServerTagsResponse>(request, EcsMeta.showServerTags, hcClient);
    }

    /**
     * 修改云服务器
     * 修改云服务器信息，目前支持修改云服务器名称及描述和hostname。
     *
     * @param UpdateServerRequest 请求对象
     * @return CompletableFuture<UpdateServerResponse>
     */
    public CompletableFuture<UpdateServerResponse> updateServerAsync(UpdateServerRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServer);
    }

    /**
     * 修改云服务器
     * 修改云服务器信息，目前支持修改云服务器名称及描述和hostname。
     *
     * @param UpdateServerRequest 请求对象
     * @return AsyncInvoker<UpdateServerRequest, UpdateServerResponse>
     */
    public AsyncInvoker<UpdateServerRequest, UpdateServerResponse> updateServerAsyncInvoker(UpdateServerRequest request) {
        return new AsyncInvoker<UpdateServerRequest, UpdateServerResponse>(request, EcsMeta.updateServer, hcClient);
    }

    /**
     * 修改云服务器销毁时间
     * 修改按需服务器，设置定时销毁时间。如果设置的销毁时间为空，表示取消销毁时间。  该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ecs:cloudServers:put。
     *
     * @param UpdateServerAutoTerminateTimeRequest 请求对象
     * @return CompletableFuture<UpdateServerAutoTerminateTimeResponse>
     */
    public CompletableFuture<UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTimeAsync(UpdateServerAutoTerminateTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServerAutoTerminateTime);
    }

    /**
     * 修改云服务器销毁时间
     * 修改按需服务器，设置定时销毁时间。如果设置的销毁时间为空，表示取消销毁时间。  该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ecs:cloudServers:put。
     *
     * @param UpdateServerAutoTerminateTimeRequest 请求对象
     * @return AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse>
     */
    public AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse> updateServerAutoTerminateTimeAsyncInvoker(UpdateServerAutoTerminateTimeRequest request) {
        return new AsyncInvoker<UpdateServerAutoTerminateTimeRequest, UpdateServerAutoTerminateTimeResponse>(request, EcsMeta.updateServerAutoTerminateTime, hcClient);
    }

    /**
     * 更新云服务器元数据
     * 更新云服务器元数据。  - 如果元数据中没有待更新字段，则自动添加该字段。  - 如果元数据中已存在待更新字段，则直接更新字段值。  - 如果元数据中的字段不再请求参数中，则保持不变
     *
     * @param UpdateServerMetadataRequest 请求对象
     * @return CompletableFuture<UpdateServerMetadataResponse>
     */
    public CompletableFuture<UpdateServerMetadataResponse> updateServerMetadataAsync(UpdateServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.updateServerMetadata);
    }

    /**
     * 更新云服务器元数据
     * 更新云服务器元数据。  - 如果元数据中没有待更新字段，则自动添加该字段。  - 如果元数据中已存在待更新字段，则直接更新字段值。  - 如果元数据中的字段不再请求参数中，则保持不变
     *
     * @param UpdateServerMetadataRequest 请求对象
     * @return AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse>
     */
    public AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse> updateServerMetadataAsyncInvoker(UpdateServerMetadataRequest request) {
        return new AsyncInvoker<UpdateServerMetadataRequest, UpdateServerMetadataResponse>(request, EcsMeta.updateServerMetadata, hcClient);
    }

    /**
     * 查询任务的执行状态
     * 查询Job的执行状态。  对于创建云服务器、删除云服务器、云服务器批量操作和网卡操作等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return CompletableFuture<ShowJobResponse>
     */
    public CompletableFuture<ShowJobResponse> showJobAsync(ShowJobRequest request) {
        return hcClient.asyncInvokeHttp(request, EcsMeta.showJob);
    }

    /**
     * 查询任务的执行状态
     * 查询Job的执行状态。  对于创建云服务器、删除云服务器、云服务器批量操作和网卡操作等异步API，命令下发后，会返回job_id，通过job_id可以查询任务的执行状态。
     *
     * @param ShowJobRequest 请求对象
     * @return AsyncInvoker<ShowJobRequest, ShowJobResponse>
     */
    public AsyncInvoker<ShowJobRequest, ShowJobResponse> showJobAsyncInvoker(ShowJobRequest request) {
        return new AsyncInvoker<ShowJobRequest, ShowJobResponse>(request, EcsMeta.showJob, hcClient);
    }

}