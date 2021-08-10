package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.cloudide.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudIDEClient {

    protected HcClient hcClient;

    public CloudIDEClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudIDEClient> newBuilder() {
        return new ClientBuilder<>(CloudIDEClient::new);
    }

    /** 查询技术栈模板工程 查询技术栈模板工程
     *
     * @param ListProjectTemplatesRequest 请求对象
     * @return ListProjectTemplatesResponse */
    public ListProjectTemplatesResponse listProjectTemplates(ListProjectTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listProjectTemplates);
    }

    /** 查询技术栈模板工程 查询技术栈模板工程
     *
     * @param ListProjectTemplatesRequest 请求对象
     * @return SyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse> */
    public SyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse> listProjectTemplatesInvoker(
        ListProjectTemplatesRequest request) {
        return new SyncInvoker<ListProjectTemplatesRequest, ListProjectTemplatesResponse>(request,
            CloudIDEMeta.listProjectTemplates, hcClient);
    }

    /** 获取标签所有技术栈 获取标签所有技术栈
     *
     * @param ListStacksByTagRequest 请求对象
     * @return ListStacksByTagResponse */
    public ListStacksByTagResponse listStacksByTag(ListStacksByTagRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listStacksByTag);
    }

    /** 获取标签所有技术栈 获取标签所有技术栈
     *
     * @param ListStacksByTagRequest 请求对象
     * @return SyncInvoker<ListStacksByTagRequest, ListStacksByTagResponse> */
    public SyncInvoker<ListStacksByTagRequest, ListStacksByTagResponse> listStacksByTagInvoker(
        ListStacksByTagRequest request) {
        return new SyncInvoker<ListStacksByTagRequest, ListStacksByTagResponse>(request, CloudIDEMeta.listStacksByTag,
            hcClient);
    }

    /** 查询当前帐号访问权限 查询当前帐号访问权限
     *
     * @param ShowAccountStatusRequest 请求对象
     * @return ShowAccountStatusResponse */
    public ShowAccountStatusResponse showAccountStatus(ShowAccountStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showAccountStatus);
    }

    /** 查询当前帐号访问权限 查询当前帐号访问权限
     *
     * @param ShowAccountStatusRequest 请求对象
     * @return SyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse> */
    public SyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse> showAccountStatusInvoker(
        ShowAccountStatusRequest request) {
        return new SyncInvoker<ShowAccountStatusRequest, ShowAccountStatusResponse>(request,
            CloudIDEMeta.showAccountStatus, hcClient);
    }

    /** 获取技术栈计费信息 获取技术栈计费信息
     *
     * @param ShowPriceRequest 请求对象
     * @return ShowPriceResponse */
    public ShowPriceResponse showPrice(ShowPriceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showPrice);
    }

    /** 获取技术栈计费信息 获取技术栈计费信息
     *
     * @param ShowPriceRequest 请求对象
     * @return SyncInvoker<ShowPriceRequest, ShowPriceResponse> */
    public SyncInvoker<ShowPriceRequest, ShowPriceResponse> showPriceInvoker(ShowPriceRequest request) {
        return new SyncInvoker<ShowPriceRequest, ShowPriceResponse>(request, CloudIDEMeta.showPrice, hcClient);
    }

    /** 查询IDE实例名是否重复 查询IDE实例名是否重复
     *
     * @param CheckNameRequest 请求对象
     * @return CheckNameResponse */
    public CheckNameResponse checkName(CheckNameRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.checkName);
    }

    /** 查询IDE实例名是否重复 查询IDE实例名是否重复
     *
     * @param CheckNameRequest 请求对象
     * @return SyncInvoker<CheckNameRequest, CheckNameResponse> */
    public SyncInvoker<CheckNameRequest, CheckNameResponse> checkNameInvoker(CheckNameRequest request) {
        return new SyncInvoker<CheckNameRequest, CheckNameResponse>(request, CloudIDEMeta.checkName, hcClient);
    }

    /** 创建IDE实例 创建IDE实例
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createInstance);
    }

    /** 创建IDE实例 创建IDE实例
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, CloudIDEMeta.createInstance,
            hcClient);
    }

    /** 外部第三方集成商创建IDE实例 创建IDE实例
     *
     * @param CreateInstanceBy3rdRequest 请求对象
     * @return CreateInstanceBy3rdResponse */
    public CreateInstanceBy3rdResponse createInstanceBy3rd(CreateInstanceBy3rdRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.createInstanceBy3rd);
    }

    /** 外部第三方集成商创建IDE实例 创建IDE实例
     *
     * @param CreateInstanceBy3rdRequest 请求对象
     * @return SyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> */
    public SyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> createInstanceBy3rdInvoker(
        CreateInstanceBy3rdRequest request) {
        return new SyncInvoker<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse>(request,
            CloudIDEMeta.createInstanceBy3rd, hcClient);
    }

    /** 删除IDE实例 删除IDE实例（同时删除磁盘数据）
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.deleteInstance);
    }

    /** 删除IDE实例 删除IDE实例（同时删除磁盘数据）
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, CloudIDEMeta.deleteInstance,
            hcClient);
    }

    /** 查询IDE实例列表 查询IDE实例列表
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listInstances);
    }

    /** 查询IDE实例列表 查询IDE实例列表
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse> */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, CloudIDEMeta.listInstances,
            hcClient);
    }

    /** 查询某个组织下的IDE实例列表 查询某个组织下的IDE实例列表
     *
     * @param ListOrgInstancesRequest 请求对象
     * @return ListOrgInstancesResponse */
    public ListOrgInstancesResponse listOrgInstances(ListOrgInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.listOrgInstances);
    }

    /** 查询某个组织下的IDE实例列表 查询某个组织下的IDE实例列表
     *
     * @param ListOrgInstancesRequest 请求对象
     * @return SyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse> */
    public SyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse> listOrgInstancesInvoker(
        ListOrgInstancesRequest request) {
        return new SyncInvoker<ListOrgInstancesRequest, ListOrgInstancesResponse>(request,
            CloudIDEMeta.listOrgInstances, hcClient);
    }

    /** 查询某个IDE实例 查询某个IDE实例
     *
     * @param ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.showInstance);
    }

    /** 查询某个IDE实例 查询某个IDE实例
     *
     * @param ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>(request, CloudIDEMeta.showInstance, hcClient);
    }

    /** 启动IDE实例 启动IDE实例
     *
     * @param StartInstanceRequest 请求对象
     * @return StartInstanceResponse */
    public StartInstanceResponse startInstance(StartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.startInstance);
    }

    /** 启动IDE实例 启动IDE实例
     *
     * @param StartInstanceRequest 请求对象
     * @return SyncInvoker<StartInstanceRequest, StartInstanceResponse> */
    public SyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceInvoker(StartInstanceRequest request) {
        return new SyncInvoker<StartInstanceRequest, StartInstanceResponse>(request, CloudIDEMeta.startInstance,
            hcClient);
    }

    /** 停止IDE实例 停止IDE实例（不删除磁盘数据）
     *
     * @param StopInstanceRequest 请求对象
     * @return StopInstanceResponse */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.stopInstance);
    }

    /** 停止IDE实例 停止IDE实例（不删除磁盘数据）
     *
     * @param StopInstanceRequest 请求对象
     * @return SyncInvoker<StopInstanceRequest, StopInstanceResponse> */
    public SyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceInvoker(StopInstanceRequest request) {
        return new SyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, CloudIDEMeta.stopInstance, hcClient);
    }

    /** 修改IDE实例 修改IDE实例
     *
     * @param UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudIDEMeta.updateInstance);
    }

    /** 修改IDE实例 修改IDE实例
     *
     * @param UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>(request, CloudIDEMeta.updateInstance,
            hcClient);
    }

}
