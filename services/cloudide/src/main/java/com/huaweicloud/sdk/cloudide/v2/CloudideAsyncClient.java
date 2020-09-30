package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.cloudide.v2.model.*;

public class CloudideAsyncClient {
    protected HcClient hcClient;

    public CloudideAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudideAsyncClient> newBuilder() {
        return new ClientBuilder<>(CloudideAsyncClient::new);
    }


    /**
     * 查询技术栈模板工程
     * 查询技术栈模板工程
     *
     * @param ListProjectTemplatesRequest 请求对象
     * @return CompletableFuture<ListProjectTemplatesResponse>
     */
    public CompletableFuture<ListProjectTemplatesResponse> listProjectTemplatesAsync(ListProjectTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.listProjectTemplates);
    }

    /**
     * 获取标签所有技术栈
     * 获取标签所有技术栈
     *
     * @param ListStacksByTagRequest 请求对象
     * @return CompletableFuture<ListStacksByTagResponse>
     */
    public CompletableFuture<ListStacksByTagResponse> listStacksByTagAsync(ListStacksByTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.listStacksByTag);
    }

    /**
     * 获取技术栈计费信息
     * 获取技术栈计费信息
     *
     * @param ShowPriceRequest 请求对象
     * @return CompletableFuture<ShowPriceResponse>
     */
    public CompletableFuture<ShowPriceResponse> showPriceAsync(ShowPriceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.showPrice);
    }

    /**
     * 查询IDE实例名是否重复
     * 查询IDE实例名是否重复
     *
     * @param CheckNameRequest 请求对象
     * @return CompletableFuture<CheckNameResponse>
     */
    public CompletableFuture<CheckNameResponse> checkNameAsync(CheckNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.checkName);
    }

    /**
     * 创建IDE实例
     * 创建IDE实例
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.createInstance);
    }

    /**
     * 外部第三方集成商创建IDE实例
     * 创建IDE实例
     *
     * @param CreateInstanceBy3rdRequest 请求对象
     * @return CompletableFuture<CreateInstanceBy3rdResponse>
     */
    public CompletableFuture<CreateInstanceBy3rdResponse> createInstanceBy3rdAsync(CreateInstanceBy3rdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.createInstanceBy3rd);
    }

    /**
     * 删除IDE实例
     * 删除IDE实例（同时删除磁盘数据）
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.deleteInstance);
    }

    /**
     * 查询IDE实例列表
     * 查询IDE实例列表
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.listInstances);
    }

    /**
     * 查询某个组织下的IDE实例列表
     * 查询某个组织下的IDE实例列表
     *
     * @param ListOrgInstancesRequest 请求对象
     * @return CompletableFuture<ListOrgInstancesResponse>
     */
    public CompletableFuture<ListOrgInstancesResponse> listOrgInstancesAsync(ListOrgInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.listOrgInstances);
    }

    /**
     * 查询某个IDE实例
     * 查询某个IDE实例
     *
     * @param ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.showInstance);
    }

    /**
     * 启动IDE实例
     * 启动IDE实例
     *
     * @param StartInstanceRequest 请求对象
     * @return CompletableFuture<StartInstanceResponse>
     */
    public CompletableFuture<StartInstanceResponse> startInstanceAsync(StartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.startInstance);
    }

    /**
     * 停止IDE实例
     * 停止IDE实例（不删除磁盘数据）
     *
     * @param StopInstanceRequest 请求对象
     * @return CompletableFuture<StopInstanceResponse>
     */
    public CompletableFuture<StopInstanceResponse> stopInstanceAsync(StopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.stopInstance);
    }

    /**
     * 修改IDE实例
     * 修改IDE实例
     *
     * @param UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudideMeta.updateInstance);
    }

}