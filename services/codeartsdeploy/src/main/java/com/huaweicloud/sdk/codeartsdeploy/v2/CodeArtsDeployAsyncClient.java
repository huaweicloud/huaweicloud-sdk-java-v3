package com.huaweicloud.sdk.codeartsdeploy.v2;

import com.huaweicloud.sdk.codeartsdeploy.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsDeployAsyncClient {

    protected HcClient hcClient;

    public CodeArtsDeployAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsDeployAsyncClient> newBuilder() {
        return new ClientBuilder<>(CodeArtsDeployAsyncClient::new);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return CompletableFuture<CreateDeployTaskByTemplateResponse>
     */
    public CompletableFuture<CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateAsync(
        CreateDeployTaskByTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createDeployTaskByTemplate);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>
     */
    public AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateAsyncInvoker(
        CreateDeployTaskByTemplateRequest request) {
        return new AsyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>(request,
            CodeArtsDeployMeta.createDeployTaskByTemplate, hcClient);
    }

    /**
     * 删除应用
     *
     * 根据部署任务id删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployTaskRequest 请求对象
     * @return CompletableFuture<DeleteDeployTaskResponse>
     */
    public CompletableFuture<DeleteDeployTaskResponse> deleteDeployTaskAsync(DeleteDeployTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteDeployTask);
    }

    /**
     * 删除应用
     *
     * 根据部署任务id删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployTaskRequest 请求对象
     * @return AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>
     */
    public AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTaskAsyncInvoker(
        DeleteDeployTaskRequest request) {
        return new AsyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>(request,
            CodeArtsDeployMeta.deleteDeployTask, hcClient);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTaskHistoryByDateRequest 请求对象
     * @return CompletableFuture<ListDeployTaskHistoryByDateResponse>
     */
    public CompletableFuture<ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateAsync(
        ListDeployTaskHistoryByDateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listDeployTaskHistoryByDate);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTaskHistoryByDateRequest 请求对象
     * @return AsyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>
     */
    public AsyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateAsyncInvoker(
        ListDeployTaskHistoryByDateRequest request) {
        return new AsyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>(request,
            CodeArtsDeployMeta.listDeployTaskHistoryByDate, hcClient);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTasksRequest 请求对象
     * @return CompletableFuture<ListDeployTasksResponse>
     */
    public CompletableFuture<ListDeployTasksResponse> listDeployTasksAsync(ListDeployTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listDeployTasks);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTasksRequest 请求对象
     * @return AsyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>
     */
    public AsyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse> listDeployTasksAsyncInvoker(
        ListDeployTasksRequest request) {
        return new AsyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>(request,
            CodeArtsDeployMeta.listDeployTasks, hcClient);
    }

    /**
     * 获取应用详情
     *
     * 根据部署任务id获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeployTaskDetailRequest 请求对象
     * @return CompletableFuture<ShowDeployTaskDetailResponse>
     */
    public CompletableFuture<ShowDeployTaskDetailResponse> showDeployTaskDetailAsync(
        ShowDeployTaskDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showDeployTaskDetail);
    }

    /**
     * 获取应用详情
     *
     * 根据部署任务id获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeployTaskDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>
     */
    public AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetailAsyncInvoker(
        ShowDeployTaskDetailRequest request) {
        return new AsyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>(request,
            CodeArtsDeployMeta.showDeployTaskDetail, hcClient);
    }

    /**
     * 部署应用
     *
     * 根据部署任务id部署应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDeployTaskRequest 请求对象
     * @return CompletableFuture<StartDeployTaskResponse>
     */
    public CompletableFuture<StartDeployTaskResponse> startDeployTaskAsync(StartDeployTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.startDeployTask);
    }

    /**
     * 部署应用
     *
     * 根据部署任务id部署应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDeployTaskRequest 请求对象
     * @return AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>
     */
    public AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTaskAsyncInvoker(
        StartDeployTaskRequest request) {
        return new AsyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>(request,
            CodeArtsDeployMeta.startDeployTask, hcClient);
    }

    /**
     * 新建主机
     *
     * 在指定主机组下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentHostRequest 请求对象
     * @return CompletableFuture<CreateDeploymentHostResponse>
     */
    public CompletableFuture<CreateDeploymentHostResponse> createDeploymentHostAsync(
        CreateDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createDeploymentHost);
    }

    /**
     * 新建主机
     *
     * 在指定主机组下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentHostRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>
     */
    public AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHostAsyncInvoker(
        CreateDeploymentHostRequest request) {
        return new AsyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>(request,
            CodeArtsDeployMeta.createDeploymentHost, hcClient);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentHostRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentHostResponse>
     */
    public CompletableFuture<DeleteDeploymentHostResponse> deleteDeploymentHostAsync(
        DeleteDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentHost);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentHostRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>
     */
    public AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHostAsyncInvoker(
        DeleteDeploymentHostRequest request) {
        return new AsyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>(request,
            CodeArtsDeployMeta.deleteDeploymentHost, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机组id查询指定主机组下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostsRequest 请求对象
     * @return CompletableFuture<ListHostsResponse>
     */
    public CompletableFuture<ListHostsResponse> listHostsAsync(ListHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listHosts);
    }

    /**
     * 查询主机列表
     *
     * 根据主机组id查询指定主机组下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostsRequest 请求对象
     * @return AsyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public AsyncInvoker<ListHostsRequest, ListHostsResponse> listHostsAsyncInvoker(ListHostsRequest request) {
        return new AsyncInvoker<ListHostsRequest, ListHostsResponse>(request, CodeArtsDeployMeta.listHosts, hcClient);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentHostDetailRequest 请求对象
     * @return CompletableFuture<ShowDeploymentHostDetailResponse>
     */
    public CompletableFuture<ShowDeploymentHostDetailResponse> showDeploymentHostDetailAsync(
        ShowDeploymentHostDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentHostDetail);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentHostDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>
     */
    public AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetailAsyncInvoker(
        ShowDeploymentHostDetailRequest request) {
        return new AsyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>(request,
            CodeArtsDeployMeta.showDeploymentHostDetail, hcClient);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentHostRequest 请求对象
     * @return CompletableFuture<UpdateDeploymentHostResponse>
     */
    public CompletableFuture<UpdateDeploymentHostResponse> updateDeploymentHostAsync(
        UpdateDeploymentHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentHost);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentHostRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>
     */
    public AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHostAsyncInvoker(
        UpdateDeploymentHostRequest request) {
        return new AsyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>(request,
            CodeArtsDeployMeta.updateDeploymentHost, hcClient);
    }

    /**
     * 新建主机组
     *
     * 在项目下新建主机组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentGroupRequest 请求对象
     * @return CompletableFuture<CreateDeploymentGroupResponse>
     */
    public CompletableFuture<CreateDeploymentGroupResponse> createDeploymentGroupAsync(
        CreateDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.createDeploymentGroup);
    }

    /**
     * 新建主机组
     *
     * 在项目下新建主机组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>
     */
    public AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroupAsyncInvoker(
        CreateDeploymentGroupRequest request) {
        return new AsyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>(request,
            CodeArtsDeployMeta.createDeploymentGroup, hcClient);
    }

    /**
     * 删除主机组
     *
     * 根据主机组id删除主机组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeploymentGroupResponse>
     */
    public CompletableFuture<DeleteDeploymentGroupResponse> deleteDeploymentGroupAsync(
        DeleteDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentGroup);
    }

    /**
     * 删除主机组
     *
     * 根据主机组id删除主机组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>
     */
    public AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroupAsyncInvoker(
        DeleteDeploymentGroupRequest request) {
        return new AsyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>(request,
            CodeArtsDeployMeta.deleteDeploymentGroup, hcClient);
    }

    /**
     * 查询主机组列表
     *
     * 按条件查询主机组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
     * @return CompletableFuture<ListHostGroupsResponse>
     */
    public CompletableFuture<ListHostGroupsResponse> listHostGroupsAsync(ListHostGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listHostGroups);
    }

    /**
     * 查询主机组列表
     *
     * 按条件查询主机组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
     * @return AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsAsyncInvoker(
        ListHostGroupsRequest request) {
        return new AsyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>(request,
            CodeArtsDeployMeta.listHostGroups, hcClient);
    }

    /**
     * 查询主机组
     *
     * 根据主机组id查询主机组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return CompletableFuture<ShowDeploymentGroupDetailResponse>
     */
    public CompletableFuture<ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailAsync(
        ShowDeploymentGroupDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentGroupDetail);
    }

    /**
     * 查询主机组
     *
     * 根据主机组id查询主机组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>
     */
    public AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailAsyncInvoker(
        ShowDeploymentGroupDetailRequest request) {
        return new AsyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>(request,
            CodeArtsDeployMeta.showDeploymentGroupDetail, hcClient);
    }

    /**
     * 修改主机组
     *
     * 根据主机组id修改主机组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return CompletableFuture<UpdateDeploymentGroupResponse>
     */
    public CompletableFuture<UpdateDeploymentGroupResponse> updateDeploymentGroupAsync(
        UpdateDeploymentGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentGroup);
    }

    /**
     * 修改主机组
     *
     * 根据主机组id修改主机组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>
     */
    public AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroupAsyncInvoker(
        UpdateDeploymentGroupRequest request) {
        return new AsyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>(request,
            CodeArtsDeployMeta.updateDeploymentGroup, hcClient);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskSuccessRateRequest 请求对象
     * @return CompletableFuture<ListTaskSuccessRateResponse>
     */
    public CompletableFuture<ListTaskSuccessRateResponse> listTaskSuccessRateAsync(ListTaskSuccessRateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.listTaskSuccessRate);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskSuccessRateRequest 请求对象
     * @return AsyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>
     */
    public AsyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> listTaskSuccessRateAsyncInvoker(
        ListTaskSuccessRateRequest request) {
        return new AsyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>(request,
            CodeArtsDeployMeta.listTaskSuccessRate, hcClient);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectSuccessRateRequest 请求对象
     * @return CompletableFuture<ShowProjectSuccessRateResponse>
     */
    public CompletableFuture<ShowProjectSuccessRateResponse> showProjectSuccessRateAsync(
        ShowProjectSuccessRateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsDeployMeta.showProjectSuccessRate);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectSuccessRateRequest 请求对象
     * @return AsyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>
     */
    public AsyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> showProjectSuccessRateAsyncInvoker(
        ShowProjectSuccessRateRequest request) {
        return new AsyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>(request,
            CodeArtsDeployMeta.showProjectSuccessRate, hcClient);
    }

}
