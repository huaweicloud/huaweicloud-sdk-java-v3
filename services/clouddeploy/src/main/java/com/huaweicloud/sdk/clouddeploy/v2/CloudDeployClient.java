package com.huaweicloud.sdk.clouddeploy.v2;

import com.huaweicloud.sdk.clouddeploy.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudDeployClient {

    protected HcClient hcClient;

    public CloudDeployClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudDeployClient> newBuilder() {
        return new ClientBuilder<>(CloudDeployClient::new);
    }

    /**
     * 通过模板新建部署任务
     *
     * 通过模板新建部署任务cloudpipeline流水线调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return CreateDeployTaskByTemplateResponse
     */
    public CreateDeployTaskByTemplateResponse createDeployTaskByTemplate(CreateDeployTaskByTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.createDeployTaskByTemplate);
    }

    /**
     * 通过模板新建部署任务
     *
     * 通过模板新建部署任务cloudpipeline流水线调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>
     */
    public SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateInvoker(
        CreateDeployTaskByTemplateRequest request) {
        return new SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>(request,
            CloudDeployMeta.createDeployTaskByTemplate, hcClient);
    }

    /**
     * 删除部署任务
     *
     * 根据部署任务id删除部署任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployTaskRequest 请求对象
     * @return DeleteDeployTaskResponse
     */
    public DeleteDeployTaskResponse deleteDeployTask(DeleteDeployTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.deleteDeployTask);
    }

    /**
     * 删除部署任务
     *
     * 根据部署任务id删除部署任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployTaskRequest 请求对象
     * @return SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>
     */
    public SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTaskInvoker(
        DeleteDeployTaskRequest request) {
        return new SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>(request,
            CloudDeployMeta.deleteDeployTask, hcClient);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定任务的历史执行记录列表
     *
     * 根据开始时间和结束时间查询项目下指定任务的历史执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTaskHistoryByDateRequest 请求对象
     * @return ListDeployTaskHistoryByDateResponse
     */
    public ListDeployTaskHistoryByDateResponse listDeployTaskHistoryByDate(ListDeployTaskHistoryByDateRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.listDeployTaskHistoryByDate);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定任务的历史执行记录列表
     *
     * 根据开始时间和结束时间查询项目下指定任务的历史执行记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTaskHistoryByDateRequest 请求对象
     * @return SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>
     */
    public SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateInvoker(
        ListDeployTaskHistoryByDateRequest request) {
        return new SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>(request,
            CloudDeployMeta.listDeployTaskHistoryByDate, hcClient);
    }

    /**
     * 获取部署任务列表
     *
     * 查询项目下部署任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTasksRequest 请求对象
     * @return ListDeployTasksResponse
     */
    public ListDeployTasksResponse listDeployTasks(ListDeployTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.listDeployTasks);
    }

    /**
     * 获取部署任务列表
     *
     * 查询项目下部署任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTasksRequest 请求对象
     * @return SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>
     */
    public SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse> listDeployTasksInvoker(
        ListDeployTasksRequest request) {
        return new SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>(request,
            CloudDeployMeta.listDeployTasks, hcClient);
    }

    /**
     * 获取部署任务详情
     *
     * 根据部署任务id获取部署任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeployTaskDetailRequest 请求对象
     * @return ShowDeployTaskDetailResponse
     */
    public ShowDeployTaskDetailResponse showDeployTaskDetail(ShowDeployTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.showDeployTaskDetail);
    }

    /**
     * 获取部署任务详情
     *
     * 根据部署任务id获取部署任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeployTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>
     */
    public SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetailInvoker(
        ShowDeployTaskDetailRequest request) {
        return new SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>(request,
            CloudDeployMeta.showDeployTaskDetail, hcClient);
    }

    /**
     * 启动部署任务
     *
     * 根据部署任务id启动部署任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDeployTaskRequest 请求对象
     * @return StartDeployTaskResponse
     */
    public StartDeployTaskResponse startDeployTask(StartDeployTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.startDeployTask);
    }

    /**
     * 启动部署任务
     *
     * 根据部署任务id启动部署任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDeployTaskRequest 请求对象
     * @return SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>
     */
    public SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTaskInvoker(
        StartDeployTaskRequest request) {
        return new SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>(request,
            CloudDeployMeta.startDeployTask, hcClient);
    }

    /**
     * 新建主机
     *
     * 在指定主机组下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentHostRequest 请求对象
     * @return CreateDeploymentHostResponse
     */
    public CreateDeploymentHostResponse createDeploymentHost(CreateDeploymentHostRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.createDeploymentHost);
    }

    /**
     * 新建主机
     *
     * 在指定主机组下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentHostRequest 请求对象
     * @return SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>
     */
    public SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHostInvoker(
        CreateDeploymentHostRequest request) {
        return new SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>(request,
            CloudDeployMeta.createDeploymentHost, hcClient);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentHostRequest 请求对象
     * @return DeleteDeploymentHostResponse
     */
    public DeleteDeploymentHostResponse deleteDeploymentHost(DeleteDeploymentHostRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.deleteDeploymentHost);
    }

    /**
     * 删除主机
     *
     * 根据主机id删除主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentHostRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>
     */
    public SyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse> deleteDeploymentHostInvoker(
        DeleteDeploymentHostRequest request) {
        return new SyncInvoker<DeleteDeploymentHostRequest, DeleteDeploymentHostResponse>(request,
            CloudDeployMeta.deleteDeploymentHost, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机组id查询指定主机组下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostsRequest 请求对象
     * @return ListHostsResponse
     */
    public ListHostsResponse listHosts(ListHostsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.listHosts);
    }

    /**
     * 查询主机列表
     *
     * 根据主机组id查询指定主机组下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostsRequest 请求对象
     * @return SyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public SyncInvoker<ListHostsRequest, ListHostsResponse> listHostsInvoker(ListHostsRequest request) {
        return new SyncInvoker<ListHostsRequest, ListHostsResponse>(request, CloudDeployMeta.listHosts, hcClient);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentHostDetailRequest 请求对象
     * @return ShowDeploymentHostDetailResponse
     */
    public ShowDeploymentHostDetailResponse showDeploymentHostDetail(ShowDeploymentHostDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.showDeploymentHostDetail);
    }

    /**
     * 查询主机详情
     *
     * 根据主机id查询主机详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentHostDetailRequest 请求对象
     * @return SyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>
     */
    public SyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse> showDeploymentHostDetailInvoker(
        ShowDeploymentHostDetailRequest request) {
        return new SyncInvoker<ShowDeploymentHostDetailRequest, ShowDeploymentHostDetailResponse>(request,
            CloudDeployMeta.showDeploymentHostDetail, hcClient);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentHostRequest 请求对象
     * @return UpdateDeploymentHostResponse
     */
    public UpdateDeploymentHostResponse updateDeploymentHost(UpdateDeploymentHostRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.updateDeploymentHost);
    }

    /**
     * 修改主机
     *
     * 根据主机id修改主机信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentHostRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>
     */
    public SyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse> updateDeploymentHostInvoker(
        UpdateDeploymentHostRequest request) {
        return new SyncInvoker<UpdateDeploymentHostRequest, UpdateDeploymentHostResponse>(request,
            CloudDeployMeta.updateDeploymentHost, hcClient);
    }

    /**
     * 新建主机组
     *
     * 在项目下新建主机组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentGroupRequest 请求对象
     * @return CreateDeploymentGroupResponse
     */
    public CreateDeploymentGroupResponse createDeploymentGroup(CreateDeploymentGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.createDeploymentGroup);
    }

    /**
     * 新建主机组
     *
     * 在项目下新建主机组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentGroupRequest 请求对象
     * @return SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>
     */
    public SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroupInvoker(
        CreateDeploymentGroupRequest request) {
        return new SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>(request,
            CloudDeployMeta.createDeploymentGroup, hcClient);
    }

    /**
     * 删除主机组
     *
     * 根据主机组id删除主机组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return DeleteDeploymentGroupResponse
     */
    public DeleteDeploymentGroupResponse deleteDeploymentGroup(DeleteDeploymentGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.deleteDeploymentGroup);
    }

    /**
     * 删除主机组
     *
     * 根据主机组id删除主机组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>
     */
    public SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroupInvoker(
        DeleteDeploymentGroupRequest request) {
        return new SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>(request,
            CloudDeployMeta.deleteDeploymentGroup, hcClient);
    }

    /**
     * 查询主机组列表
     *
     * 按条件查询主机组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
     * @return ListHostGroupsResponse
     */
    public ListHostGroupsResponse listHostGroups(ListHostGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.listHostGroups);
    }

    /**
     * 查询主机组列表
     *
     * 按条件查询主机组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
     * @return SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsInvoker(
        ListHostGroupsRequest request) {
        return new SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>(request, CloudDeployMeta.listHostGroups,
            hcClient);
    }

    /**
     * 查询主机组
     *
     * 根据主机组id查询主机组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return ShowDeploymentGroupDetailResponse
     */
    public ShowDeploymentGroupDetailResponse showDeploymentGroupDetail(ShowDeploymentGroupDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.showDeploymentGroupDetail);
    }

    /**
     * 查询主机组
     *
     * 根据主机组id查询主机组详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>
     */
    public SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailInvoker(
        ShowDeploymentGroupDetailRequest request) {
        return new SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>(request,
            CloudDeployMeta.showDeploymentGroupDetail, hcClient);
    }

    /**
     * 修改主机组
     *
     * 根据主机组id修改主机组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return UpdateDeploymentGroupResponse
     */
    public UpdateDeploymentGroupResponse updateDeploymentGroup(UpdateDeploymentGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.updateDeploymentGroup);
    }

    /**
     * 修改主机组
     *
     * 根据主机组id修改主机组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>
     */
    public SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroupInvoker(
        UpdateDeploymentGroupRequest request) {
        return new SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>(request,
            CloudDeployMeta.updateDeploymentGroup, hcClient);
    }

    /**
     * 获取指定任务的部署任务执行成功率
     *
     * 获取指定任务的部署任务执行成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskSuccessRateRequest 请求对象
     * @return ListTaskSuccessRateResponse
     */
    public ListTaskSuccessRateResponse listTaskSuccessRate(ListTaskSuccessRateRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.listTaskSuccessRate);
    }

    /**
     * 获取指定任务的部署任务执行成功率
     *
     * 获取指定任务的部署任务执行成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskSuccessRateRequest 请求对象
     * @return SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>
     */
    public SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> listTaskSuccessRateInvoker(
        ListTaskSuccessRateRequest request) {
        return new SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>(request,
            CloudDeployMeta.listTaskSuccessRate, hcClient);
    }

    /**
     * 获取指定项目的部署任务执行成功率
     *
     * 获取指定项目的部署任务执行成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectSuccessRateRequest 请求对象
     * @return ShowProjectSuccessRateResponse
     */
    public ShowProjectSuccessRateResponse showProjectSuccessRate(ShowProjectSuccessRateRequest request) {
        return hcClient.syncInvokeHttp(request, CloudDeployMeta.showProjectSuccessRate);
    }

    /**
     * 获取指定项目的部署任务执行成功率
     *
     * 获取指定项目的部署任务执行成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectSuccessRateRequest 请求对象
     * @return SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>
     */
    public SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> showProjectSuccessRateInvoker(
        ShowProjectSuccessRateRequest request) {
        return new SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>(request,
            CloudDeployMeta.showProjectSuccessRate, hcClient);
    }

}
