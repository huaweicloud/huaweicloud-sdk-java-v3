package com.huaweicloud.sdk.sfsturbo.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.sfsturbo.v1.model.BatchAddSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.BatchAddSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeSecurityGroupRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeSecurityGroupResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeShareNameRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ChangeShareNameResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.CreateSharedTagResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteSharedTagRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.DeleteSharedTagResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ExpandShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ListSharesResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirQuotaResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowFsDirResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowShareRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowShareResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowSharedTagsRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.ShowSharedTagsResponse;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaRequest;
import com.huaweicloud.sdk.sfsturbo.v1.model.UpdateFsDirQuotaResponse;

public class SFSTurboClient {

    protected HcClient hcClient;

    public SFSTurboClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SFSTurboClient> newBuilder() {
        ClientBuilder<SFSTurboClient> clientBuilder = new ClientBuilder<>(SFSTurboClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加共享标签
     *
     * 指定共享批量添加标签。
     * 
     * 一个共享上最多有10个标签。
     * 一个共享上的多个标签的key不允许重复。
     * 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddSharedTagsRequest 请求对象
     * @return BatchAddSharedTagsResponse
     */
    public BatchAddSharedTagsResponse batchAddSharedTags(BatchAddSharedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.batchAddSharedTags);
    }

    /**
     * 批量添加共享标签
     *
     * 指定共享批量添加标签。
     * 
     * 一个共享上最多有10个标签。
     * 一个共享上的多个标签的key不允许重复。
     * 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchAddSharedTagsRequest 请求对象
     * @return SyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse>
     */
    public SyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> batchAddSharedTagsInvoker(
        BatchAddSharedTagsRequest request) {
        return new SyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse>(request,
            SFSTurboMeta.batchAddSharedTags, hcClient);
    }

    /**
     * 修改文件系统绑定的安全组
     *
     * 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeSecurityGroupRequest 请求对象
     * @return ChangeSecurityGroupResponse
     */
    public ChangeSecurityGroupResponse changeSecurityGroup(ChangeSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.changeSecurityGroup);
    }

    /**
     * 修改文件系统绑定的安全组
     *
     * 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeSecurityGroupRequest 请求对象
     * @return SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupInvoker(
        ChangeSecurityGroupRequest request) {
        return new SyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>(request,
            SFSTurboMeta.changeSecurityGroup, hcClient);
    }

    /**
     * 修改文件系统名称
     *
     * 修改文件系统名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeShareNameRequest 请求对象
     * @return ChangeShareNameResponse
     */
    public ChangeShareNameResponse changeShareName(ChangeShareNameRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.changeShareName);
    }

    /**
     * 修改文件系统名称
     *
     * 修改文件系统名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeShareNameRequest 请求对象
     * @return SyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse>
     */
    public SyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse> changeShareNameInvoker(
        ChangeShareNameRequest request) {
        return new SyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse>(request, SFSTurboMeta.changeShareName,
            hcClient);
    }

    /**
     * 创建目录
     *
     * 创建目录 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFsDirRequest 请求对象
     * @return CreateFsDirResponse
     */
    public CreateFsDirResponse createFsDir(CreateFsDirRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createFsDir);
    }

    /**
     * 创建目录
     *
     * 创建目录 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFsDirRequest 请求对象
     * @return SyncInvoker<CreateFsDirRequest, CreateFsDirResponse>
     */
    public SyncInvoker<CreateFsDirRequest, CreateFsDirResponse> createFsDirInvoker(CreateFsDirRequest request) {
        return new SyncInvoker<CreateFsDirRequest, CreateFsDirResponse>(request, SFSTurboMeta.createFsDir, hcClient);
    }

    /**
     * 创建目标文件夹quota
     *
     * 创建目标文件夹quota。只支持对空目录设置目录quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFsDirQuotaRequest 请求对象
     * @return CreateFsDirQuotaResponse
     */
    public CreateFsDirQuotaResponse createFsDirQuota(CreateFsDirQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createFsDirQuota);
    }

    /**
     * 创建目标文件夹quota
     *
     * 创建目标文件夹quota。只支持对空目录设置目录quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFsDirQuotaRequest 请求对象
     * @return SyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse>
     */
    public SyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse> createFsDirQuotaInvoker(
        CreateFsDirQuotaRequest request) {
        return new SyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse>(request,
            SFSTurboMeta.createFsDirQuota, hcClient);
    }

    /**
     * 创建文件系统
     *
     * 创建文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateShareRequest 请求对象
     * @return CreateShareResponse
     */
    public CreateShareResponse createShare(CreateShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createShare);
    }

    /**
     * 创建文件系统
     *
     * 创建文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateShareRequest 请求对象
     * @return SyncInvoker<CreateShareRequest, CreateShareResponse>
     */
    public SyncInvoker<CreateShareRequest, CreateShareResponse> createShareInvoker(CreateShareRequest request) {
        return new SyncInvoker<CreateShareRequest, CreateShareResponse>(request, SFSTurboMeta.createShare, hcClient);
    }

    /**
     * 创建共享标签
     *
     * 指定共享添加一个标签。
     * 一个共享上最多有10个标签。
     * 一个共享上的多个标签的key不允许重复。
     * 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSharedTagRequest 请求对象
     * @return CreateSharedTagResponse
     */
    public CreateSharedTagResponse createSharedTag(CreateSharedTagRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.createSharedTag);
    }

    /**
     * 创建共享标签
     *
     * 指定共享添加一个标签。
     * 一个共享上最多有10个标签。
     * 一个共享上的多个标签的key不允许重复。
     * 此接口为幂等接口：如果要添加的key在共享上已存在，则覆盖更新标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSharedTagRequest 请求对象
     * @return SyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse>
     */
    public SyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse> createSharedTagInvoker(
        CreateSharedTagRequest request) {
        return new SyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse>(request, SFSTurboMeta.createSharedTag,
            hcClient);
    }

    /**
     * 删除文件系统目录
     *
     * 删除文件系统目录 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFsDirRequest 请求对象
     * @return DeleteFsDirResponse
     */
    public DeleteFsDirResponse deleteFsDir(DeleteFsDirRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteFsDir);
    }

    /**
     * 删除文件系统目录
     *
     * 删除文件系统目录 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFsDirRequest 请求对象
     * @return SyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse>
     */
    public SyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse> deleteFsDirInvoker(DeleteFsDirRequest request) {
        return new SyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse>(request, SFSTurboMeta.deleteFsDir, hcClient);
    }

    /**
     * 删除目标文件夹quota
     *
     * 删除目标文件夹quota。只支持对空目录进行删除quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFsDirQuotaRequest 请求对象
     * @return DeleteFsDirQuotaResponse
     */
    public DeleteFsDirQuotaResponse deleteFsDirQuota(DeleteFsDirQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteFsDirQuota);
    }

    /**
     * 删除目标文件夹quota
     *
     * 删除目标文件夹quota。只支持对空目录进行删除quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFsDirQuotaRequest 请求对象
     * @return SyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse>
     */
    public SyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse> deleteFsDirQuotaInvoker(
        DeleteFsDirQuotaRequest request) {
        return new SyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse>(request,
            SFSTurboMeta.deleteFsDirQuota, hcClient);
    }

    /**
     * 删除文件系统
     *
     * 删除文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareRequest 请求对象
     * @return DeleteShareResponse
     */
    public DeleteShareResponse deleteShare(DeleteShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteShare);
    }

    /**
     * 删除文件系统
     *
     * 删除文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareRequest 请求对象
     * @return SyncInvoker<DeleteShareRequest, DeleteShareResponse>
     */
    public SyncInvoker<DeleteShareRequest, DeleteShareResponse> deleteShareInvoker(DeleteShareRequest request) {
        return new SyncInvoker<DeleteShareRequest, DeleteShareResponse>(request, SFSTurboMeta.deleteShare, hcClient);
    }

    /**
     * 删除共享标签
     *
     * 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSharedTagRequest 请求对象
     * @return DeleteSharedTagResponse
     */
    public DeleteSharedTagResponse deleteSharedTag(DeleteSharedTagRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.deleteSharedTag);
    }

    /**
     * 删除共享标签
     *
     * 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSharedTagRequest 请求对象
     * @return SyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse>
     */
    public SyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse> deleteSharedTagInvoker(
        DeleteSharedTagRequest request) {
        return new SyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse>(request, SFSTurboMeta.deleteSharedTag,
            hcClient);
    }

    /**
     * 扩容文件系统
     *
     * 扩容文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandShareRequest 请求对象
     * @return ExpandShareResponse
     */
    public ExpandShareResponse expandShare(ExpandShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.expandShare);
    }

    /**
     * 扩容文件系统
     *
     * 扩容文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandShareRequest 请求对象
     * @return SyncInvoker<ExpandShareRequest, ExpandShareResponse>
     */
    public SyncInvoker<ExpandShareRequest, ExpandShareResponse> expandShareInvoker(ExpandShareRequest request) {
        return new SyncInvoker<ExpandShareRequest, ExpandShareResponse>(request, SFSTurboMeta.expandShare, hcClient);
    }

    /**
     * 查询租户所有共享的标签
     *
     * 查询租户所有共享的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSharedTagsRequest 请求对象
     * @return ListSharedTagsResponse
     */
    public ListSharedTagsResponse listSharedTags(ListSharedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listSharedTags);
    }

    /**
     * 查询租户所有共享的标签
     *
     * 查询租户所有共享的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSharedTagsRequest 请求对象
     * @return SyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse>
     */
    public SyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse> listSharedTagsInvoker(
        ListSharedTagsRequest request) {
        return new SyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse>(request, SFSTurboMeta.listSharedTags,
            hcClient);
    }

    /**
     * 获取文件系统列表
     *
     * 获取文件系统列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSharesRequest 请求对象
     * @return ListSharesResponse
     */
    public ListSharesResponse listShares(ListSharesRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.listShares);
    }

    /**
     * 获取文件系统列表
     *
     * 获取文件系统列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSharesRequest 请求对象
     * @return SyncInvoker<ListSharesRequest, ListSharesResponse>
     */
    public SyncInvoker<ListSharesRequest, ListSharesResponse> listSharesInvoker(ListSharesRequest request) {
        return new SyncInvoker<ListSharesRequest, ListSharesResponse>(request, SFSTurboMeta.listShares, hcClient);
    }

    /**
     * 查询目录是否存在
     *
     * 查询目录是否存在 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFsDirRequest 请求对象
     * @return ShowFsDirResponse
     */
    public ShowFsDirResponse showFsDir(ShowFsDirRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showFsDir);
    }

    /**
     * 查询目录是否存在
     *
     * 查询目录是否存在 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFsDirRequest 请求对象
     * @return SyncInvoker<ShowFsDirRequest, ShowFsDirResponse>
     */
    public SyncInvoker<ShowFsDirRequest, ShowFsDirResponse> showFsDirInvoker(ShowFsDirRequest request) {
        return new SyncInvoker<ShowFsDirRequest, ShowFsDirResponse>(request, SFSTurboMeta.showFsDir, hcClient);
    }

    /**
     * 查询目标文件夹quota
     *
     * 查询目标文件夹quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFsDirQuotaRequest 请求对象
     * @return ShowFsDirQuotaResponse
     */
    public ShowFsDirQuotaResponse showFsDirQuota(ShowFsDirQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showFsDirQuota);
    }

    /**
     * 查询目标文件夹quota
     *
     * 查询目标文件夹quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFsDirQuotaRequest 请求对象
     * @return SyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse>
     */
    public SyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse> showFsDirQuotaInvoker(
        ShowFsDirQuotaRequest request) {
        return new SyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse>(request, SFSTurboMeta.showFsDirQuota,
            hcClient);
    }

    /**
     * 查询文件系统详细信息
     *
     * 查询SFS Turbo文件系统详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowShareRequest 请求对象
     * @return ShowShareResponse
     */
    public ShowShareResponse showShare(ShowShareRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showShare);
    }

    /**
     * 查询文件系统详细信息
     *
     * 查询SFS Turbo文件系统详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowShareRequest 请求对象
     * @return SyncInvoker<ShowShareRequest, ShowShareResponse>
     */
    public SyncInvoker<ShowShareRequest, ShowShareResponse> showShareInvoker(ShowShareRequest request) {
        return new SyncInvoker<ShowShareRequest, ShowShareResponse>(request, SFSTurboMeta.showShare, hcClient);
    }

    /**
     * 查询共享标签
     *
     * 查询指定共享的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSharedTagsRequest 请求对象
     * @return ShowSharedTagsResponse
     */
    public ShowSharedTagsResponse showSharedTags(ShowSharedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.showSharedTags);
    }

    /**
     * 查询共享标签
     *
     * 查询指定共享的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSharedTagsRequest 请求对象
     * @return SyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse>
     */
    public SyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse> showSharedTagsInvoker(
        ShowSharedTagsRequest request) {
        return new SyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse>(request, SFSTurboMeta.showSharedTags,
            hcClient);
    }

    /**
     * 更新目标文件夹quota
     *
     * 更新目标文件夹quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFsDirQuotaRequest 请求对象
     * @return UpdateFsDirQuotaResponse
     */
    public UpdateFsDirQuotaResponse updateFsDirQuota(UpdateFsDirQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, SFSTurboMeta.updateFsDirQuota);
    }

    /**
     * 更新目标文件夹quota
     *
     * 更新目标文件夹quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFsDirQuotaRequest 请求对象
     * @return SyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse>
     */
    public SyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse> updateFsDirQuotaInvoker(
        UpdateFsDirQuotaRequest request) {
        return new SyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse>(request,
            SFSTurboMeta.updateFsDirQuota, hcClient);
    }

}
