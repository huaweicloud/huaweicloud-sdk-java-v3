package com.huaweicloud.sdk.codeartsdeploy.v2;

import com.huaweicloud.sdk.codeartsdeploy.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeArtsDeployClient {

    protected HcClient hcClient;

    public CodeArtsDeployClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsDeployClient> newBuilder() {
        return new ClientBuilder<>(CodeArtsDeployClient::new);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return CreateDeployTaskByTemplateResponse
     */
    public CreateDeployTaskByTemplateResponse createDeployTaskByTemplate(CreateDeployTaskByTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createDeployTaskByTemplate);
    }

    /**
     * 通过模板新建应用
     *
     * 通过模板新建应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeployTaskByTemplateRequest 请求对象
     * @return SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>
     */
    public SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse> createDeployTaskByTemplateInvoker(
        CreateDeployTaskByTemplateRequest request) {
        return new SyncInvoker<CreateDeployTaskByTemplateRequest, CreateDeployTaskByTemplateResponse>(request,
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
     * @return DeleteDeployTaskResponse
     */
    public DeleteDeployTaskResponse deleteDeployTask(DeleteDeployTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteDeployTask);
    }

    /**
     * 删除应用
     *
     * 根据部署任务id删除应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeployTaskRequest 请求对象
     * @return SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>
     */
    public SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse> deleteDeployTaskInvoker(
        DeleteDeployTaskRequest request) {
        return new SyncInvoker<DeleteDeployTaskRequest, DeleteDeployTaskResponse>(request,
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
     * @return ListDeployTaskHistoryByDateResponse
     */
    public ListDeployTaskHistoryByDateResponse listDeployTaskHistoryByDate(ListDeployTaskHistoryByDateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listDeployTaskHistoryByDate);
    }

    /**
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     *
     * 根据开始时间和结束时间查询项目下指定应用的历史部署记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTaskHistoryByDateRequest 请求对象
     * @return SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>
     */
    public SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse> listDeployTaskHistoryByDateInvoker(
        ListDeployTaskHistoryByDateRequest request) {
        return new SyncInvoker<ListDeployTaskHistoryByDateRequest, ListDeployTaskHistoryByDateResponse>(request,
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
     * @return ListDeployTasksResponse
     */
    public ListDeployTasksResponse listDeployTasks(ListDeployTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listDeployTasks);
    }

    /**
     * 获取应用列表
     *
     * 查询项目下应用列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDeployTasksRequest 请求对象
     * @return SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>
     */
    public SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse> listDeployTasksInvoker(
        ListDeployTasksRequest request) {
        return new SyncInvoker<ListDeployTasksRequest, ListDeployTasksResponse>(request,
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
     * @return ShowDeployTaskDetailResponse
     */
    public ShowDeployTaskDetailResponse showDeployTaskDetail(ShowDeployTaskDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showDeployTaskDetail);
    }

    /**
     * 获取应用详情
     *
     * 根据部署任务id获取应用详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeployTaskDetailRequest 请求对象
     * @return SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>
     */
    public SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse> showDeployTaskDetailInvoker(
        ShowDeployTaskDetailRequest request) {
        return new SyncInvoker<ShowDeployTaskDetailRequest, ShowDeployTaskDetailResponse>(request,
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
     * @return StartDeployTaskResponse
     */
    public StartDeployTaskResponse startDeployTask(StartDeployTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.startDeployTask);
    }

    /**
     * 部署应用
     *
     * 根据部署任务id部署应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param StartDeployTaskRequest 请求对象
     * @return SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>
     */
    public SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse> startDeployTaskInvoker(
        StartDeployTaskRequest request) {
        return new SyncInvoker<StartDeployTaskRequest, StartDeployTaskResponse>(request,
            CodeArtsDeployMeta.startDeployTask, hcClient);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentHostRequest 请求对象
     * @return CreateDeploymentHostResponse
     */
    public CreateDeploymentHostResponse createDeploymentHost(CreateDeploymentHostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createDeploymentHost);
    }

    /**
     * 新建主机
     *
     * 在指定主机集群下新建主机。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentHostRequest 请求对象
     * @return SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>
     */
    public SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse> createDeploymentHostInvoker(
        CreateDeploymentHostRequest request) {
        return new SyncInvoker<CreateDeploymentHostRequest, CreateDeploymentHostResponse>(request,
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
     * @return DeleteDeploymentHostResponse
     */
    public DeleteDeploymentHostResponse deleteDeploymentHost(DeleteDeploymentHostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentHost);
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
            CodeArtsDeployMeta.deleteDeploymentHost, hcClient);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostsRequest 请求对象
     * @return ListHostsResponse
     */
    public ListHostsResponse listHosts(ListHostsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listHosts);
    }

    /**
     * 查询主机列表
     *
     * 根据主机集群id查询指定主机集群下的主机列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostsRequest 请求对象
     * @return SyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public SyncInvoker<ListHostsRequest, ListHostsResponse> listHostsInvoker(ListHostsRequest request) {
        return new SyncInvoker<ListHostsRequest, ListHostsResponse>(request, CodeArtsDeployMeta.listHosts, hcClient);
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
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentHostDetail);
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
     * @return UpdateDeploymentHostResponse
     */
    public UpdateDeploymentHostResponse updateDeploymentHost(UpdateDeploymentHostRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentHost);
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
            CodeArtsDeployMeta.updateDeploymentHost, hcClient);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentGroupRequest 请求对象
     * @return CreateDeploymentGroupResponse
     */
    public CreateDeploymentGroupResponse createDeploymentGroup(CreateDeploymentGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.createDeploymentGroup);
    }

    /**
     * 新建主机集群
     *
     * 在项目下新建主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDeploymentGroupRequest 请求对象
     * @return SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>
     */
    public SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse> createDeploymentGroupInvoker(
        CreateDeploymentGroupRequest request) {
        return new SyncInvoker<CreateDeploymentGroupRequest, CreateDeploymentGroupResponse>(request,
            CodeArtsDeployMeta.createDeploymentGroup, hcClient);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return DeleteDeploymentGroupResponse
     */
    public DeleteDeploymentGroupResponse deleteDeploymentGroup(DeleteDeploymentGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.deleteDeploymentGroup);
    }

    /**
     * 删除主机集群
     *
     * 根据主机集群id删除主机集群。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDeploymentGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>
     */
    public SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse> deleteDeploymentGroupInvoker(
        DeleteDeploymentGroupRequest request) {
        return new SyncInvoker<DeleteDeploymentGroupRequest, DeleteDeploymentGroupResponse>(request,
            CodeArtsDeployMeta.deleteDeploymentGroup, hcClient);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
     * @return ListHostGroupsResponse
     */
    public ListHostGroupsResponse listHostGroups(ListHostGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listHostGroups);
    }

    /**
     * 查询主机集群列表
     *
     * 按条件查询主机集群列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListHostGroupsRequest 请求对象
     * @return SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>
     */
    public SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse> listHostGroupsInvoker(
        ListHostGroupsRequest request) {
        return new SyncInvoker<ListHostGroupsRequest, ListHostGroupsResponse>(request,
            CodeArtsDeployMeta.listHostGroups, hcClient);
    }

    /**
     * 查询主机集群
     *
     * 根据主机集群id查询主机集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return ShowDeploymentGroupDetailResponse
     */
    public ShowDeploymentGroupDetailResponse showDeploymentGroupDetail(ShowDeploymentGroupDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showDeploymentGroupDetail);
    }

    /**
     * 查询主机集群
     *
     * 根据主机集群id查询主机集群详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDeploymentGroupDetailRequest 请求对象
     * @return SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>
     */
    public SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse> showDeploymentGroupDetailInvoker(
        ShowDeploymentGroupDetailRequest request) {
        return new SyncInvoker<ShowDeploymentGroupDetailRequest, ShowDeploymentGroupDetailResponse>(request,
            CodeArtsDeployMeta.showDeploymentGroupDetail, hcClient);
    }

    /**
     * 修改主机集群
     *
     * 根据主机集群id修改主机集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return UpdateDeploymentGroupResponse
     */
    public UpdateDeploymentGroupResponse updateDeploymentGroup(UpdateDeploymentGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.updateDeploymentGroup);
    }

    /**
     * 修改主机集群
     *
     * 根据主机集群id修改主机集群信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDeploymentGroupRequest 请求对象
     * @return SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>
     */
    public SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse> updateDeploymentGroupInvoker(
        UpdateDeploymentGroupRequest request) {
        return new SyncInvoker<UpdateDeploymentGroupRequest, UpdateDeploymentGroupResponse>(request,
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
     * @return ListTaskSuccessRateResponse
     */
    public ListTaskSuccessRateResponse listTaskSuccessRate(ListTaskSuccessRateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.listTaskSuccessRate);
    }

    /**
     * 获取指定应用的应用部署成功率
     *
     * 获取指定应用的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTaskSuccessRateRequest 请求对象
     * @return SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>
     */
    public SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse> listTaskSuccessRateInvoker(
        ListTaskSuccessRateRequest request) {
        return new SyncInvoker<ListTaskSuccessRateRequest, ListTaskSuccessRateResponse>(request,
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
     * @return ShowProjectSuccessRateResponse
     */
    public ShowProjectSuccessRateResponse showProjectSuccessRate(ShowProjectSuccessRateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeArtsDeployMeta.showProjectSuccessRate);
    }

    /**
     * 获取指定项目的应用部署成功率
     *
     * 获取指定项目的应用部署成功率
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowProjectSuccessRateRequest 请求对象
     * @return SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>
     */
    public SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse> showProjectSuccessRateInvoker(
        ShowProjectSuccessRateRequest request) {
        return new SyncInvoker<ShowProjectSuccessRateRequest, ShowProjectSuccessRateResponse>(request,
            CodeArtsDeployMeta.showProjectSuccessRate, hcClient);
    }

}
