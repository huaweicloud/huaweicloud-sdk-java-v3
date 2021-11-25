package com.huaweicloud.sdk.sfsturbo.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sfsturbo.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class SFSTurboAsyncClient {

    protected HcClient hcClient;

    public SFSTurboAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SFSTurboAsyncClient> newBuilder() {
        return new ClientBuilder<>(SFSTurboAsyncClient::new);
    }

    /** 批量添加共享标签 指定共享批量添加标签。 一个共享上最多有10个标签。 一个共享上的多个标签的key不允许重复。 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     *
     * @param BatchAddSharedTagsRequest 请求对象
     * @return CompletableFuture<BatchAddSharedTagsResponse> */
    public CompletableFuture<BatchAddSharedTagsResponse> batchAddSharedTagsAsync(BatchAddSharedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.batchAddSharedTags);
    }

    /** 批量添加共享标签 指定共享批量添加标签。 一个共享上最多有10个标签。 一个共享上的多个标签的key不允许重复。 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     *
     * @param BatchAddSharedTagsRequest 请求对象
     * @return AsyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> */
    public AsyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> batchAddSharedTagsAsyncInvoker(
        BatchAddSharedTagsRequest request) {
        return new AsyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse>(request,
            SFSTurboMeta.batchAddSharedTags, hcClient);
    }

    /** 修改文件系统绑定的安全组 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     *
     * @param ChangeSecurityGroupRequest 请求对象
     * @return CompletableFuture<ChangeSecurityGroupResponse> */
    public CompletableFuture<ChangeSecurityGroupResponse> changeSecurityGroupAsync(ChangeSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.changeSecurityGroup);
    }

    /** 修改文件系统绑定的安全组 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     *
     * @param ChangeSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> */
    public AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupAsyncInvoker(
        ChangeSecurityGroupRequest request) {
        return new AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>(request,
            SFSTurboMeta.changeSecurityGroup, hcClient);
    }

    /** 创建文件系统 创建文件系统。
     *
     * @param CreateShareRequest 请求对象
     * @return CompletableFuture<CreateShareResponse> */
    public CompletableFuture<CreateShareResponse> createShareAsync(CreateShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createShare);
    }

    /** 创建文件系统 创建文件系统。
     *
     * @param CreateShareRequest 请求对象
     * @return AsyncInvoker<CreateShareRequest, CreateShareResponse> */
    public AsyncInvoker<CreateShareRequest, CreateShareResponse> createShareAsyncInvoker(CreateShareRequest request) {
        return new AsyncInvoker<CreateShareRequest, CreateShareResponse>(request, SFSTurboMeta.createShare, hcClient);
    }

    /** 创建共享标签 指定共享添加一个标签。 一个共享上最多有10个标签。 一个共享上的多个标签的key不允许重复。 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     *
     * @param CreateSharedTagRequest 请求对象
     * @return CompletableFuture<CreateSharedTagResponse> */
    public CompletableFuture<CreateSharedTagResponse> createSharedTagAsync(CreateSharedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createSharedTag);
    }

    /** 创建共享标签 指定共享添加一个标签。 一个共享上最多有10个标签。 一个共享上的多个标签的key不允许重复。 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     *
     * @param CreateSharedTagRequest 请求对象
     * @return AsyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse> */
    public AsyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse> createSharedTagAsyncInvoker(
        CreateSharedTagRequest request) {
        return new AsyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse>(request, SFSTurboMeta.createSharedTag,
            hcClient);
    }

    /** 删除文件系统 删除文件系统。
     *
     * @param DeleteShareRequest 请求对象
     * @return CompletableFuture<DeleteShareResponse> */
    public CompletableFuture<DeleteShareResponse> deleteShareAsync(DeleteShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteShare);
    }

    /** 删除文件系统 删除文件系统。
     *
     * @param DeleteShareRequest 请求对象
     * @return AsyncInvoker<DeleteShareRequest, DeleteShareResponse> */
    public AsyncInvoker<DeleteShareRequest, DeleteShareResponse> deleteShareAsyncInvoker(DeleteShareRequest request) {
        return new AsyncInvoker<DeleteShareRequest, DeleteShareResponse>(request, SFSTurboMeta.deleteShare, hcClient);
    }

    /** 删除共享标签 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     *
     * @param DeleteSharedTagRequest 请求对象
     * @return CompletableFuture<DeleteSharedTagResponse> */
    public CompletableFuture<DeleteSharedTagResponse> deleteSharedTagAsync(DeleteSharedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteSharedTag);
    }

    /** 删除共享标签 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     *
     * @param DeleteSharedTagRequest 请求对象
     * @return AsyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse> */
    public AsyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse> deleteSharedTagAsyncInvoker(
        DeleteSharedTagRequest request) {
        return new AsyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse>(request, SFSTurboMeta.deleteSharedTag,
            hcClient);
    }

    /** 扩容文件系统 扩容文件系统。
     *
     * @param ExpandShareRequest 请求对象
     * @return CompletableFuture<ExpandShareResponse> */
    public CompletableFuture<ExpandShareResponse> expandShareAsync(ExpandShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.expandShare);
    }

    /** 扩容文件系统 扩容文件系统。
     *
     * @param ExpandShareRequest 请求对象
     * @return AsyncInvoker<ExpandShareRequest, ExpandShareResponse> */
    public AsyncInvoker<ExpandShareRequest, ExpandShareResponse> expandShareAsyncInvoker(ExpandShareRequest request) {
        return new AsyncInvoker<ExpandShareRequest, ExpandShareResponse>(request, SFSTurboMeta.expandShare, hcClient);
    }

    /** 查询租户所有共享的标签 查询租户所有共享的标签集合。
     *
     * @param ListSharedTagsRequest 请求对象
     * @return CompletableFuture<ListSharedTagsResponse> */
    public CompletableFuture<ListSharedTagsResponse> listSharedTagsAsync(ListSharedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listSharedTags);
    }

    /** 查询租户所有共享的标签 查询租户所有共享的标签集合。
     *
     * @param ListSharedTagsRequest 请求对象
     * @return AsyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse> */
    public AsyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse> listSharedTagsAsyncInvoker(
        ListSharedTagsRequest request) {
        return new AsyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse>(request, SFSTurboMeta.listSharedTags,
            hcClient);
    }

    /** 获取文件系统列表 获取文件系统列表
     *
     * @param ListSharesRequest 请求对象
     * @return CompletableFuture<ListSharesResponse> */
    public CompletableFuture<ListSharesResponse> listSharesAsync(ListSharesRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listShares);
    }

    /** 获取文件系统列表 获取文件系统列表
     *
     * @param ListSharesRequest 请求对象
     * @return AsyncInvoker<ListSharesRequest, ListSharesResponse> */
    public AsyncInvoker<ListSharesRequest, ListSharesResponse> listSharesAsyncInvoker(ListSharesRequest request) {
        return new AsyncInvoker<ListSharesRequest, ListSharesResponse>(request, SFSTurboMeta.listShares, hcClient);
    }

    /** 查询文件系统详细信息 查询SFS Turbo文件系统详细信息。
     *
     * @param ShowShareRequest 请求对象
     * @return CompletableFuture<ShowShareResponse> */
    public CompletableFuture<ShowShareResponse> showShareAsync(ShowShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showShare);
    }

    /** 查询文件系统详细信息 查询SFS Turbo文件系统详细信息。
     *
     * @param ShowShareRequest 请求对象
     * @return AsyncInvoker<ShowShareRequest, ShowShareResponse> */
    public AsyncInvoker<ShowShareRequest, ShowShareResponse> showShareAsyncInvoker(ShowShareRequest request) {
        return new AsyncInvoker<ShowShareRequest, ShowShareResponse>(request, SFSTurboMeta.showShare, hcClient);
    }

    /** 查询共享标签 查询指定共享的所有标签信息。
     *
     * @param ShowSharedTagsRequest 请求对象
     * @return CompletableFuture<ShowSharedTagsResponse> */
    public CompletableFuture<ShowSharedTagsResponse> showSharedTagsAsync(ShowSharedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showSharedTags);
    }

    /** 查询共享标签 查询指定共享的所有标签信息。
     *
     * @param ShowSharedTagsRequest 请求对象
     * @return AsyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse> */
    public AsyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse> showSharedTagsAsyncInvoker(
        ShowSharedTagsRequest request) {
        return new AsyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse>(request, SFSTurboMeta.showSharedTags,
            hcClient);
    }

}
