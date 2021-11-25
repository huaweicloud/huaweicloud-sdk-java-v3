package com.huaweicloud.sdk.sfsturbo.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.sfsturbo.v1.model.*;

public class SFSTurboClient {

    protected HcClient hcClient;

    public SFSTurboClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SFSTurboClient> newBuilder() {
        return new ClientBuilder<>(SFSTurboClient::new);
    }

    /** 批量添加共享标签 指定共享批量添加标签。 一个共享上最多有10个标签。 一个共享上的多个标签的key不允许重复。 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     *
     * @param BatchAddSharedTagsRequest 请求对象
     * @return BatchAddSharedTagsResponse */
    public BatchAddSharedTagsResponse batchAddSharedTags(BatchAddSharedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.batchAddSharedTags);
    }

    /** 批量添加共享标签 指定共享批量添加标签。 一个共享上最多有10个标签。 一个共享上的多个标签的key不允许重复。 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     *
     * @param BatchAddSharedTagsRequest 请求对象
     * @return SyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> */
    public SyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> batchAddSharedTagsInvoker(
        BatchAddSharedTagsRequest request) {
        return new SyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse>(request,
            SFSTurboMeta.batchAddSharedTags, hcClient);
    }

    /** 修改文件系统绑定的安全组 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     *
     * @param ChangeSecurityGroupRequest 请求对象
     * @return ChangeSecurityGroupResponse */
    public ChangeSecurityGroupResponse changeSecurityGroup(ChangeSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.changeSecurityGroup);
    }

    /** 修改文件系统绑定的安全组 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     *
     * @param ChangeSecurityGroupRequest 请求对象
     * @return SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> */
    public SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupInvoker(
        ChangeSecurityGroupRequest request) {
        return new SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>(request,
            SFSTurboMeta.changeSecurityGroup, hcClient);
    }

    /** 创建文件系统 创建文件系统。
     *
     * @param CreateShareRequest 请求对象
     * @return CreateShareResponse */
    public CreateShareResponse createShare(CreateShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createShare);
    }

    /** 创建文件系统 创建文件系统。
     *
     * @param CreateShareRequest 请求对象
     * @return SyncInvoker<CreateShareRequest, CreateShareResponse> */
    public SyncInvoker<CreateShareRequest, CreateShareResponse> createShareInvoker(CreateShareRequest request) {
        return new SyncInvoker<CreateShareRequest, CreateShareResponse>(request, SFSTurboMeta.createShare, hcClient);
    }

    /** 创建共享标签 指定共享添加一个标签。 一个共享上最多有10个标签。 一个共享上的多个标签的key不允许重复。 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     *
     * @param CreateSharedTagRequest 请求对象
     * @return CreateSharedTagResponse */
    public CreateSharedTagResponse createSharedTag(CreateSharedTagRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createSharedTag);
    }

    /** 创建共享标签 指定共享添加一个标签。 一个共享上最多有10个标签。 一个共享上的多个标签的key不允许重复。 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     *
     * @param CreateSharedTagRequest 请求对象
     * @return SyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse> */
    public SyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse> createSharedTagInvoker(
        CreateSharedTagRequest request) {
        return new SyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse>(request, SFSTurboMeta.createSharedTag,
            hcClient);
    }

    /** 删除文件系统 删除文件系统。
     *
     * @param DeleteShareRequest 请求对象
     * @return DeleteShareResponse */
    public DeleteShareResponse deleteShare(DeleteShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteShare);
    }

    /** 删除文件系统 删除文件系统。
     *
     * @param DeleteShareRequest 请求对象
     * @return SyncInvoker<DeleteShareRequest, DeleteShareResponse> */
    public SyncInvoker<DeleteShareRequest, DeleteShareResponse> deleteShareInvoker(DeleteShareRequest request) {
        return new SyncInvoker<DeleteShareRequest, DeleteShareResponse>(request, SFSTurboMeta.deleteShare, hcClient);
    }

    /** 删除共享标签 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     *
     * @param DeleteSharedTagRequest 请求对象
     * @return DeleteSharedTagResponse */
    public DeleteSharedTagResponse deleteSharedTag(DeleteSharedTagRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteSharedTag);
    }

    /** 删除共享标签 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     *
     * @param DeleteSharedTagRequest 请求对象
     * @return SyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse> */
    public SyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse> deleteSharedTagInvoker(
        DeleteSharedTagRequest request) {
        return new SyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse>(request, SFSTurboMeta.deleteSharedTag,
            hcClient);
    }

    /** 扩容文件系统 扩容文件系统。
     *
     * @param ExpandShareRequest 请求对象
     * @return ExpandShareResponse */
    public ExpandShareResponse expandShare(ExpandShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.expandShare);
    }

    /** 扩容文件系统 扩容文件系统。
     *
     * @param ExpandShareRequest 请求对象
     * @return SyncInvoker<ExpandShareRequest, ExpandShareResponse> */
    public SyncInvoker<ExpandShareRequest, ExpandShareResponse> expandShareInvoker(ExpandShareRequest request) {
        return new SyncInvoker<ExpandShareRequest, ExpandShareResponse>(request, SFSTurboMeta.expandShare, hcClient);
    }

    /** 查询租户所有共享的标签 查询租户所有共享的标签集合。
     *
     * @param ListSharedTagsRequest 请求对象
     * @return ListSharedTagsResponse */
    public ListSharedTagsResponse listSharedTags(ListSharedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listSharedTags);
    }

    /** 查询租户所有共享的标签 查询租户所有共享的标签集合。
     *
     * @param ListSharedTagsRequest 请求对象
     * @return SyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse> */
    public SyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse> listSharedTagsInvoker(
        ListSharedTagsRequest request) {
        return new SyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse>(request, SFSTurboMeta.listSharedTags,
            hcClient);
    }

    /** 获取文件系统列表 获取文件系统列表
     *
     * @param ListSharesRequest 请求对象
     * @return ListSharesResponse */
    public ListSharesResponse listShares(ListSharesRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listShares);
    }

    /** 获取文件系统列表 获取文件系统列表
     *
     * @param ListSharesRequest 请求对象
     * @return SyncInvoker<ListSharesRequest, ListSharesResponse> */
    public SyncInvoker<ListSharesRequest, ListSharesResponse> listSharesInvoker(ListSharesRequest request) {
        return new SyncInvoker<ListSharesRequest, ListSharesResponse>(request, SFSTurboMeta.listShares, hcClient);
    }

    /** 查询文件系统详细信息 查询SFS Turbo文件系统详细信息。
     *
     * @param ShowShareRequest 请求对象
     * @return ShowShareResponse */
    public ShowShareResponse showShare(ShowShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showShare);
    }

    /** 查询文件系统详细信息 查询SFS Turbo文件系统详细信息。
     *
     * @param ShowShareRequest 请求对象
     * @return SyncInvoker<ShowShareRequest, ShowShareResponse> */
    public SyncInvoker<ShowShareRequest, ShowShareResponse> showShareInvoker(ShowShareRequest request) {
        return new SyncInvoker<ShowShareRequest, ShowShareResponse>(request, SFSTurboMeta.showShare, hcClient);
    }

    /** 查询共享标签 查询指定共享的所有标签信息。
     *
     * @param ShowSharedTagsRequest 请求对象
     * @return ShowSharedTagsResponse */
    public ShowSharedTagsResponse showSharedTags(ShowSharedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showSharedTags);
    }

    /** 查询共享标签 查询指定共享的所有标签信息。
     *
     * @param ShowSharedTagsRequest 请求对象
     * @return SyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse> */
    public SyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse> showSharedTagsInvoker(
        ShowSharedTagsRequest request) {
        return new SyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse>(request, SFSTurboMeta.showSharedTags,
            hcClient);
    }

}
