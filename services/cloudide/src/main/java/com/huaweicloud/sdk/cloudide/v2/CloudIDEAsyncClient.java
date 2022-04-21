package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.cloudide.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudIDEAsyncClient {

    protected HcClient hcClient;

    public CloudIDEAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudIDEAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudIDEAsyncClient::new);
    }

    /**
     * 设置ide实例对插件的授权
     *
     * 设置ide实例对插件的授权。同意、不同意、未知（下次重新询问）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateExtensionAuthorizationRequest 请求对象
     * @return CompletableFuture<CreateExtensionAuthorizationResponse>
     */
    public CompletableFuture<CreateExtensionAuthorizationResponse> createExtensionAuthorizationAsync(
        CreateExtensionAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createExtensionAuthorization);
    }

    /**
     * 设置ide实例对插件的授权
     *
     * 设置ide实例对插件的授权。同意、不同意、未知（下次重新询问）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateExtensionAuthorizationRequest 请求对象
     * @return AsyncInvoker<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse>
     */
    public AsyncInvoker<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> createExtensionAuthorizationAsyncInvoker(
        CreateExtensionAuthorizationRequest request) {
        return new AsyncInvoker<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse>(request,
            CloudIDEMeta.createExtensionAuthorization, hcClient);
    }

    /**
     * 查询技术栈模板工程
     *
     * 查询技术栈模板工程
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTemplatesRequest 请求对象
     * @return CompletableFuture<ListProjectTemplatesResponse>
     */
    public CompletableFuture<ListProjectTemplatesResponse> listProjectTemplatesAsync(
        ListProjectTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listProjectTemplates);
    }

    /**
     * 查询技术栈模板工程
     *
     * 查询技术栈模板工程
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTemplatesRequest 请求对象
     * @return AsyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse>
     */
    public AsyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse> listProjectTemplatesAsyncInvoker(
        ListProjectTemplatesRequest request) {
        return new AsyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse>(request,
            CloudIDEMeta.listProjectTemplates, hcClient);
    }

    /**
     * 按region获取标签所有技术栈
     *
     * 按region获取标签所有技术栈
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return CompletableFuture<ListStacksResponse>
     */
    public CompletableFuture<ListStacksResponse> listStacksAsync(ListStacksRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listStacks);
    }

    /**
     * 按region获取标签所有技术栈
     *
     * 按region获取标签所有技术栈
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStacksRequest 请求对象
     * @return AsyncInvoker<ListStacksRequest, ListStacksResponse>
     */
    public AsyncInvoker<ListStacksRequest, ListStacksResponse> listStacksAsyncInvoker(ListStacksRequest request) {
        return new AsyncInvoker<ListStacksRequest, ListStacksResponse>(request, CloudIDEMeta.listStacks, hcClient);
    }

    /**
     * 查询当前帐号访问权限
     *
     * 查询当前帐号访问权限
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAccountStatusRequest 请求对象
     * @return CompletableFuture<ShowAccountStatusResponse>
     */
    public CompletableFuture<ShowAccountStatusResponse> showAccountStatusAsync(ShowAccountStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showAccountStatus);
    }

    /**
     * 查询当前帐号访问权限
     *
     * 查询当前帐号访问权限
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAccountStatusRequest 请求对象
     * @return AsyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse>
     */
    public AsyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse> showAccountStatusAsyncInvoker(
        ShowAccountStatusRequest request) {
        return new AsyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse>(request,
            CloudIDEMeta.showAccountStatus, hcClient);
    }

    /**
     * 查询ide实例对插件的授权情况
     *
     * 查询ide实例对插件的授权情况，同意授权的插件能在ide实例内携带登陆用户的token调用第三方服务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionAuthorizationRequest 请求对象
     * @return CompletableFuture<ShowExtensionAuthorizationResponse>
     */
    public CompletableFuture<ShowExtensionAuthorizationResponse> showExtensionAuthorizationAsync(
        ShowExtensionAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showExtensionAuthorization);
    }

    /**
     * 查询ide实例对插件的授权情况
     *
     * 查询ide实例对插件的授权情况，同意授权的插件能在ide实例内携带登陆用户的token调用第三方服务
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowExtensionAuthorizationRequest 请求对象
     * @return AsyncInvoker<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse>
     */
    public AsyncInvoker<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> showExtensionAuthorizationAsyncInvoker(
        ShowExtensionAuthorizationRequest request) {
        return new AsyncInvoker<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse>(request,
            CloudIDEMeta.showExtensionAuthorization, hcClient);
    }

    /**
     * 获取技术栈计费信息
     *
     * 获取技术栈计费信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPriceRequest 请求对象
     * @return CompletableFuture<ShowPriceResponse>
     */
    public CompletableFuture<ShowPriceResponse> showPriceAsync(ShowPriceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showPrice);
    }

    /**
     * 获取技术栈计费信息
     *
     * 获取技术栈计费信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPriceRequest 请求对象
     * @return AsyncInvoker<ShowPriceRequest, ShowPriceResponse>
     */
    public AsyncInvoker<ShowPriceRequest, ShowPriceResponse> showPriceAsyncInvoker(ShowPriceRequest request) {
        return new AsyncInvoker<ShowPriceRequest, ShowPriceResponse>(request, CloudIDEMeta.showPrice, hcClient);
    }

    /**
     * 查询用户是否有权限访问某个IDE实例
     *
     * 查询用户是否有权限访问某个IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckInstanceAccessRequest 请求对象
     * @return CompletableFuture<CheckInstanceAccessResponse>
     */
    public CompletableFuture<CheckInstanceAccessResponse> checkInstanceAccessAsync(CheckInstanceAccessRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.checkInstanceAccess);
    }

    /**
     * 查询用户是否有权限访问某个IDE实例
     *
     * 查询用户是否有权限访问某个IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckInstanceAccessRequest 请求对象
     * @return AsyncInvoker<CheckInstanceAccessRequest, CheckInstanceAccessResponse>
     */
    public AsyncInvoker<CheckInstanceAccessRequest, CheckInstanceAccessResponse> checkInstanceAccessAsyncInvoker(
        CheckInstanceAccessRequest request) {
        return new AsyncInvoker<CheckInstanceAccessRequest, CheckInstanceAccessResponse>(request,
            CloudIDEMeta.checkInstanceAccess, hcClient);
    }

    /**
     * 查询IDE实例名是否重复
     *
     * 查询IDE实例名是否重复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckNameRequest 请求对象
     * @return CompletableFuture<CheckNameResponse>
     */
    public CompletableFuture<CheckNameResponse> checkNameAsync(CheckNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.checkName);
    }

    /**
     * 查询IDE实例名是否重复
     *
     * 查询IDE实例名是否重复
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CheckNameRequest 请求对象
     * @return AsyncInvoker<CheckNameRequest, CheckNameResponse>
     */
    public AsyncInvoker<CheckNameRequest, CheckNameResponse> checkNameAsyncInvoker(CheckNameRequest request) {
        return new AsyncInvoker<CheckNameRequest, CheckNameResponse>(request, CloudIDEMeta.checkName, hcClient);
    }

    /**
     * 创建IDE实例
     *
     * 创建IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createInstance);
    }

    /**
     * 创建IDE实例
     *
     * 创建IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, CloudIDEMeta.createInstance,
            hcClient);
    }

    /**
     * 外部第三方集成商创建IDE实例
     *
     * 创建IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceBy3rdRequest 请求对象
     * @return CompletableFuture<CreateInstanceBy3rdResponse>
     */
    public CompletableFuture<CreateInstanceBy3rdResponse> createInstanceBy3rdAsync(CreateInstanceBy3rdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.createInstanceBy3rd);
    }

    /**
     * 外部第三方集成商创建IDE实例
     *
     * 创建IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceBy3rdRequest 请求对象
     * @return AsyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse>
     */
    public AsyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> createInstanceBy3rdAsyncInvoker(
        CreateInstanceBy3rdRequest request) {
        return new AsyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse>(request,
            CloudIDEMeta.createInstanceBy3rd, hcClient);
    }

    /**
     * 删除IDE实例
     *
     * 删除IDE实例（同时删除磁盘数据）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.deleteInstance);
    }

    /**
     * 删除IDE实例
     *
     * 删除IDE实例（同时删除磁盘数据）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, CloudIDEMeta.deleteInstance,
            hcClient);
    }

    /**
     * 查询IDE实例列表
     *
     * 查询IDE实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listInstances);
    }

    /**
     * 查询IDE实例列表
     *
     * 查询IDE实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, CloudIDEMeta.listInstances,
            hcClient);
    }

    /**
     * 查询某个租户下的IDE实例列表
     *
     * 查询某个租户下的IDE实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOrgInstancesRequest 请求对象
     * @return CompletableFuture<ListOrgInstancesResponse>
     */
    public CompletableFuture<ListOrgInstancesResponse> listOrgInstancesAsync(ListOrgInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.listOrgInstances);
    }

    /**
     * 查询某个租户下的IDE实例列表
     *
     * 查询某个租户下的IDE实例列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOrgInstancesRequest 请求对象
     * @return AsyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse>
     */
    public AsyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse> listOrgInstancesAsyncInvoker(
        ListOrgInstancesRequest request) {
        return new AsyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse>(request,
            CloudIDEMeta.listOrgInstances, hcClient);
    }

    /**
     * 查询某个IDE实例
     *
     * 查询某个IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.showInstance);
    }

    /**
     * 查询某个IDE实例
     *
     * 查询某个IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, CloudIDEMeta.showInstance,
            hcClient);
    }

    /**
     * 启动IDE实例
     *
     * 启动IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceRequest 请求对象
     * @return CompletableFuture<StartInstanceResponse>
     */
    public CompletableFuture<StartInstanceResponse> startInstanceAsync(StartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.startInstance);
    }

    /**
     * 启动IDE实例
     *
     * 启动IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceRequest 请求对象
     * @return AsyncInvoker<StartInstanceRequest, StartInstanceResponse>
     */
    public AsyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceAsyncInvoker(
        StartInstanceRequest request) {
        return new AsyncInvoker<StartInstanceRequest, StartInstanceResponse>(request, CloudIDEMeta.startInstance,
            hcClient);
    }

    /**
     * 停止IDE实例
     *
     * 停止IDE实例（不删除磁盘数据）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return CompletableFuture<StopInstanceResponse>
     */
    public CompletableFuture<StopInstanceResponse> stopInstanceAsync(StopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.stopInstance);
    }

    /**
     * 停止IDE实例
     *
     * 停止IDE实例（不删除磁盘数据）
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return AsyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public AsyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceAsyncInvoker(
        StopInstanceRequest request) {
        return new AsyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, CloudIDEMeta.stopInstance,
            hcClient);
    }

    /**
     * 修改IDE实例
     *
     * 修改IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.updateInstance);
    }

    /**
     * 修改IDE实例
     *
     * 修改IDE实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, CloudIDEMeta.updateInstance,
            hcClient);
    }

    /**
     * 刷新IDE实例活跃状态
     *
     * 刷新IDE实例活跃状态，超过该实例设置的过期时间后实例自动关闭。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceActivityRequest 请求对象
     * @return CompletableFuture<UpdateInstanceActivityResponse>
     */
    public CompletableFuture<UpdateInstanceActivityResponse> updateInstanceActivityAsync(
        UpdateInstanceActivityRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudIDEMeta.updateInstanceActivity);
    }

    /**
     * 刷新IDE实例活跃状态
     *
     * 刷新IDE实例活跃状态，超过该实例设置的过期时间后实例自动关闭。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceActivityRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse>
     */
    public AsyncInvoker<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> updateInstanceActivityAsyncInvoker(
        UpdateInstanceActivityRequest request) {
        return new AsyncInvoker<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse>(request,
            CloudIDEMeta.updateInstanceActivity, hcClient);
    }

}
