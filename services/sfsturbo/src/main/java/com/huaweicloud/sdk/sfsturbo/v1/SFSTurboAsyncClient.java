package com.huaweicloud.sdk.sfsturbo.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class SFSTurboAsyncClient {

    protected HcClient hcClient;

    public SFSTurboAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<SFSTurboAsyncClient> newBuilder() {
        ClientBuilder<SFSTurboAsyncClient> clientBuilder = new ClientBuilder<>(SFSTurboAsyncClient::new);
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
     * @return CompletableFuture<BatchAddSharedTagsResponse>
     */
    public CompletableFuture<BatchAddSharedTagsResponse> batchAddSharedTagsAsync(BatchAddSharedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.batchAddSharedTags);
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
     * @return AsyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse>
     */
    public AsyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse> batchAddSharedTagsAsyncInvoker(
        BatchAddSharedTagsRequest request) {
        return new AsyncInvoker<BatchAddSharedTagsRequest, BatchAddSharedTagsResponse>(request,
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
     * @return CompletableFuture<ChangeSecurityGroupResponse>
     */
    public CompletableFuture<ChangeSecurityGroupResponse> changeSecurityGroupAsync(ChangeSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.changeSecurityGroup);
    }

    /**
     * 修改文件系统绑定的安全组
     *
     * 修改SFS Turbo文件系统绑定的安全组。修改安全组为异步任务，可以通过“查询单个文件系统”返回的子状态字段“sub_status”来判断是否修改安全组状态，子状态为“232”即为修改安全组成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeSecurityGroupRequest 请求对象
     * @return AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>
     */
    public AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse> changeSecurityGroupAsyncInvoker(
        ChangeSecurityGroupRequest request) {
        return new AsyncInvoker<ChangeSecurityGroupRequest, ChangeSecurityGroupResponse>(request,
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
     * @return CompletableFuture<ChangeShareNameResponse>
     */
    public CompletableFuture<ChangeShareNameResponse> changeShareNameAsync(ChangeShareNameRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.changeShareName);
    }

    /**
     * 修改文件系统名称
     *
     * 修改文件系统名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeShareNameRequest 请求对象
     * @return AsyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse>
     */
    public AsyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse> changeShareNameAsyncInvoker(
        ChangeShareNameRequest request) {
        return new AsyncInvoker<ChangeShareNameRequest, ChangeShareNameResponse>(request, SFSTurboMeta.changeShareName,
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
     * @return CompletableFuture<CreateFsDirResponse>
     */
    public CompletableFuture<CreateFsDirResponse> createFsDirAsync(CreateFsDirRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createFsDir);
    }

    /**
     * 创建目录
     *
     * 创建目录 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFsDirRequest 请求对象
     * @return AsyncInvoker<CreateFsDirRequest, CreateFsDirResponse>
     */
    public AsyncInvoker<CreateFsDirRequest, CreateFsDirResponse> createFsDirAsyncInvoker(CreateFsDirRequest request) {
        return new AsyncInvoker<CreateFsDirRequest, CreateFsDirResponse>(request, SFSTurboMeta.createFsDir, hcClient);
    }

    /**
     * 创建目标文件夹quota
     *
     * 创建目标文件夹quota。只支持对空目录设置目录quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFsDirQuotaRequest 请求对象
     * @return CompletableFuture<CreateFsDirQuotaResponse>
     */
    public CompletableFuture<CreateFsDirQuotaResponse> createFsDirQuotaAsync(CreateFsDirQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createFsDirQuota);
    }

    /**
     * 创建目标文件夹quota
     *
     * 创建目标文件夹quota。只支持对空目录设置目录quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFsDirQuotaRequest 请求对象
     * @return AsyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse>
     */
    public AsyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse> createFsDirQuotaAsyncInvoker(
        CreateFsDirQuotaRequest request) {
        return new AsyncInvoker<CreateFsDirQuotaRequest, CreateFsDirQuotaResponse>(request,
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
     * @return CompletableFuture<CreateShareResponse>
     */
    public CompletableFuture<CreateShareResponse> createShareAsync(CreateShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createShare);
    }

    /**
     * 创建文件系统
     *
     * 创建文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateShareRequest 请求对象
     * @return AsyncInvoker<CreateShareRequest, CreateShareResponse>
     */
    public AsyncInvoker<CreateShareRequest, CreateShareResponse> createShareAsyncInvoker(CreateShareRequest request) {
        return new AsyncInvoker<CreateShareRequest, CreateShareResponse>(request, SFSTurboMeta.createShare, hcClient);
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
     * @return CompletableFuture<CreateSharedTagResponse>
     */
    public CompletableFuture<CreateSharedTagResponse> createSharedTagAsync(CreateSharedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.createSharedTag);
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
     * @return AsyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse>
     */
    public AsyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse> createSharedTagAsyncInvoker(
        CreateSharedTagRequest request) {
        return new AsyncInvoker<CreateSharedTagRequest, CreateSharedTagResponse>(request, SFSTurboMeta.createSharedTag,
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
     * @return CompletableFuture<DeleteFsDirResponse>
     */
    public CompletableFuture<DeleteFsDirResponse> deleteFsDirAsync(DeleteFsDirRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteFsDir);
    }

    /**
     * 删除文件系统目录
     *
     * 删除文件系统目录 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFsDirRequest 请求对象
     * @return AsyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse>
     */
    public AsyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse> deleteFsDirAsyncInvoker(DeleteFsDirRequest request) {
        return new AsyncInvoker<DeleteFsDirRequest, DeleteFsDirResponse>(request, SFSTurboMeta.deleteFsDir, hcClient);
    }

    /**
     * 删除目标文件夹quota
     *
     * 删除目标文件夹quota。只支持对空目录进行删除quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFsDirQuotaRequest 请求对象
     * @return CompletableFuture<DeleteFsDirQuotaResponse>
     */
    public CompletableFuture<DeleteFsDirQuotaResponse> deleteFsDirQuotaAsync(DeleteFsDirQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteFsDirQuota);
    }

    /**
     * 删除目标文件夹quota
     *
     * 删除目标文件夹quota。只支持对空目录进行删除quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFsDirQuotaRequest 请求对象
     * @return AsyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse>
     */
    public AsyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse> deleteFsDirQuotaAsyncInvoker(
        DeleteFsDirQuotaRequest request) {
        return new AsyncInvoker<DeleteFsDirQuotaRequest, DeleteFsDirQuotaResponse>(request,
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
     * @return CompletableFuture<DeleteShareResponse>
     */
    public CompletableFuture<DeleteShareResponse> deleteShareAsync(DeleteShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteShare);
    }

    /**
     * 删除文件系统
     *
     * 删除文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteShareRequest 请求对象
     * @return AsyncInvoker<DeleteShareRequest, DeleteShareResponse>
     */
    public AsyncInvoker<DeleteShareRequest, DeleteShareResponse> deleteShareAsyncInvoker(DeleteShareRequest request) {
        return new AsyncInvoker<DeleteShareRequest, DeleteShareResponse>(request, SFSTurboMeta.deleteShare, hcClient);
    }

    /**
     * 删除共享标签
     *
     * 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSharedTagRequest 请求对象
     * @return CompletableFuture<DeleteSharedTagResponse>
     */
    public CompletableFuture<DeleteSharedTagResponse> deleteSharedTagAsync(DeleteSharedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.deleteSharedTag);
    }

    /**
     * 删除共享标签
     *
     * 指定共享删除一个标签。当共享中不存在指定要删除的key时，接口调用将会返回404错误。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSharedTagRequest 请求对象
     * @return AsyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse>
     */
    public AsyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse> deleteSharedTagAsyncInvoker(
        DeleteSharedTagRequest request) {
        return new AsyncInvoker<DeleteSharedTagRequest, DeleteSharedTagResponse>(request, SFSTurboMeta.deleteSharedTag,
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
     * @return CompletableFuture<ExpandShareResponse>
     */
    public CompletableFuture<ExpandShareResponse> expandShareAsync(ExpandShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.expandShare);
    }

    /**
     * 扩容文件系统
     *
     * 扩容文件系统。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandShareRequest 请求对象
     * @return AsyncInvoker<ExpandShareRequest, ExpandShareResponse>
     */
    public AsyncInvoker<ExpandShareRequest, ExpandShareResponse> expandShareAsyncInvoker(ExpandShareRequest request) {
        return new AsyncInvoker<ExpandShareRequest, ExpandShareResponse>(request, SFSTurboMeta.expandShare, hcClient);
    }

    /**
     * 查询租户所有共享的标签
     *
     * 查询租户所有共享的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSharedTagsRequest 请求对象
     * @return CompletableFuture<ListSharedTagsResponse>
     */
    public CompletableFuture<ListSharedTagsResponse> listSharedTagsAsync(ListSharedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listSharedTags);
    }

    /**
     * 查询租户所有共享的标签
     *
     * 查询租户所有共享的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSharedTagsRequest 请求对象
     * @return AsyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse>
     */
    public AsyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse> listSharedTagsAsyncInvoker(
        ListSharedTagsRequest request) {
        return new AsyncInvoker<ListSharedTagsRequest, ListSharedTagsResponse>(request, SFSTurboMeta.listSharedTags,
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
     * @return CompletableFuture<ListSharesResponse>
     */
    public CompletableFuture<ListSharesResponse> listSharesAsync(ListSharesRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.listShares);
    }

    /**
     * 获取文件系统列表
     *
     * 获取文件系统列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSharesRequest 请求对象
     * @return AsyncInvoker<ListSharesRequest, ListSharesResponse>
     */
    public AsyncInvoker<ListSharesRequest, ListSharesResponse> listSharesAsyncInvoker(ListSharesRequest request) {
        return new AsyncInvoker<ListSharesRequest, ListSharesResponse>(request, SFSTurboMeta.listShares, hcClient);
    }

    /**
     * 查询目录是否存在
     *
     * 查询目录是否存在 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFsDirRequest 请求对象
     * @return CompletableFuture<ShowFsDirResponse>
     */
    public CompletableFuture<ShowFsDirResponse> showFsDirAsync(ShowFsDirRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showFsDir);
    }

    /**
     * 查询目录是否存在
     *
     * 查询目录是否存在 (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFsDirRequest 请求对象
     * @return AsyncInvoker<ShowFsDirRequest, ShowFsDirResponse>
     */
    public AsyncInvoker<ShowFsDirRequest, ShowFsDirResponse> showFsDirAsyncInvoker(ShowFsDirRequest request) {
        return new AsyncInvoker<ShowFsDirRequest, ShowFsDirResponse>(request, SFSTurboMeta.showFsDir, hcClient);
    }

    /**
     * 查询目标文件夹quota
     *
     * 查询目标文件夹quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFsDirQuotaRequest 请求对象
     * @return CompletableFuture<ShowFsDirQuotaResponse>
     */
    public CompletableFuture<ShowFsDirQuotaResponse> showFsDirQuotaAsync(ShowFsDirQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showFsDirQuota);
    }

    /**
     * 查询目标文件夹quota
     *
     * 查询目标文件夹quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFsDirQuotaRequest 请求对象
     * @return AsyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse>
     */
    public AsyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse> showFsDirQuotaAsyncInvoker(
        ShowFsDirQuotaRequest request) {
        return new AsyncInvoker<ShowFsDirQuotaRequest, ShowFsDirQuotaResponse>(request, SFSTurboMeta.showFsDirQuota,
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
     * @return CompletableFuture<ShowShareResponse>
     */
    public CompletableFuture<ShowShareResponse> showShareAsync(ShowShareRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showShare);
    }

    /**
     * 查询文件系统详细信息
     *
     * 查询SFS Turbo文件系统详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowShareRequest 请求对象
     * @return AsyncInvoker<ShowShareRequest, ShowShareResponse>
     */
    public AsyncInvoker<ShowShareRequest, ShowShareResponse> showShareAsyncInvoker(ShowShareRequest request) {
        return new AsyncInvoker<ShowShareRequest, ShowShareResponse>(request, SFSTurboMeta.showShare, hcClient);
    }

    /**
     * 查询共享标签
     *
     * 查询指定共享的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSharedTagsRequest 请求对象
     * @return CompletableFuture<ShowSharedTagsResponse>
     */
    public CompletableFuture<ShowSharedTagsResponse> showSharedTagsAsync(ShowSharedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.showSharedTags);
    }

    /**
     * 查询共享标签
     *
     * 查询指定共享的所有标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSharedTagsRequest 请求对象
     * @return AsyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse>
     */
    public AsyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse> showSharedTagsAsyncInvoker(
        ShowSharedTagsRequest request) {
        return new AsyncInvoker<ShowSharedTagsRequest, ShowSharedTagsResponse>(request, SFSTurboMeta.showSharedTags,
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
     * @return CompletableFuture<UpdateFsDirQuotaResponse>
     */
    public CompletableFuture<UpdateFsDirQuotaResponse> updateFsDirQuotaAsync(UpdateFsDirQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, SFSTurboMeta.updateFsDirQuota);
    }

    /**
     * 更新目标文件夹quota
     *
     * 更新目标文件夹quota (目前已上线的局点：上海一、上海二、北京二、北京四、乌兰察布一、广州、贵阳一、中国-香港、亚太-新加坡、亚太-曼谷)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFsDirQuotaRequest 请求对象
     * @return AsyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse>
     */
    public AsyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse> updateFsDirQuotaAsyncInvoker(
        UpdateFsDirQuotaRequest request) {
        return new AsyncInvoker<UpdateFsDirQuotaRequest, UpdateFsDirQuotaResponse>(request,
            SFSTurboMeta.updateFsDirQuota, hcClient);
    }

}
